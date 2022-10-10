package com.mb.gitlabservice.client.config;

import feign.RetryableException;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class GitlabFeignRetryer implements Retryer {

    private final int maxAttempts;
    private final long backoff;
    private int attempt = 1;

    public GitlabFeignRetryer() {
        this(2, 1000);
    }

    public GitlabFeignRetryer(int maxAttempts, long backoff) {
        this.maxAttempts = maxAttempts;
        this.backoff = backoff;
    }

    public void continueOrPropagate(RetryableException e) {
        log.info("Retrying: {} attempt {}", e.request().url(), attempt);

        if (attempt++ >= maxAttempts) {
            log.info("Gitlab retry attempt is exceeded");
            return;
        }

        try {
            TimeUnit.MILLISECONDS.sleep(backoff);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Retryer clone() {
        return new GitlabFeignRetryer(2, 1000);
    }

}
package com.mb.gitlabservice.client.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// https://docs.gitlab.com/ee/api/merge_requests.html#update-mr
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiMergeRequestUpdateRequest {

    @NotNull
    @Schema(description = "New state (close/reopen).")
    private String state_event;
}
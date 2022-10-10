package com.mb.gitlabservice.client.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

// https://docs.gitlab.com/ee/api/merge_requests.html#update-mr
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiMergeRequestUpdateRequest {

    @NotNull
    @ApiModelProperty("New state (close/reopen).")
    private String state_event;
}
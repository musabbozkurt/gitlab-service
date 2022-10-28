package com.mb.gitlabservice.client.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

// https://docs.gitlab.com/ee/api/merge_requests.html#create-mr
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiMergeRequestCreateRequest {

    @NotNull
    @ApiModelProperty("Source branch name.")
    private String source_branch;

    @NotNull
    @ApiModelProperty("Target branch name.")
    private String target_branch;

    @NotNull
    private String title;

    @ApiModelProperty("Assignee id.")
    private String assignee_id;
}
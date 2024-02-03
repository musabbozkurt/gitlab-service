package com.mb.gitlabservice.client.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// https://docs.gitlab.com/ee/api/merge_requests.html#create-mr
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiMergeRequestCreateRequest {

    @NotNull
    @Schema(description = "Source branch name.")
    private String source_branch;

    @NotNull
    @Schema(description = "Target branch name.")
    private String target_branch;

    @NotNull
    private String title;

    @Schema(description = "Assignee id.")
    private String assignee_id;
}
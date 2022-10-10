package com.mb.gitlabservice.client.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiCompareBranchFilter {

    @NotNull
    @ApiModelProperty("Source branch name.")
    private String from;

    @NotNull
    @ApiModelProperty("Target branch name.")
    private String to;

    private boolean straight;

}
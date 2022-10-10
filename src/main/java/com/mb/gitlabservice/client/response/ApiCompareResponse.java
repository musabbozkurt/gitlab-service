package com.mb.gitlabservice.client.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ApiCompareResponse {

    @ApiModelProperty(value = "List of differences")
    private List<Object> diffs;
}

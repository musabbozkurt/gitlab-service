package com.mb.gitlabservice.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ApiProjectResponse {

    @ApiModelProperty(value = "Gitlab project id. Example: 1234")
    private long id;

    @ApiModelProperty(value = "Gitlab project name.")
    private String name;

    @ApiModelProperty(value = "Path with namespace.")
    @JsonProperty("path_with_namespace")
    private String pathWithNamespace;
}

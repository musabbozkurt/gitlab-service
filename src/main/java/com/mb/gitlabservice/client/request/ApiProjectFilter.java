package com.mb.gitlabservice.client.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiProjectFilter {

    @ApiModelProperty("Limit by visibility public, internal, or private.")
    private String visibility;

    @ApiModelProperty("Limit by projects explicitly owned by the current user.")
    private Boolean owned;

}
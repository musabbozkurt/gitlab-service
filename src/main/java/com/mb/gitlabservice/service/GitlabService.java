package com.mb.gitlabservice.service;

import com.mb.gitlabservice.client.request.*;
import com.mb.gitlabservice.client.response.ApiMergeRequestResponse;
import com.mb.gitlabservice.client.response.ApiProjectResponse;

import java.util.List;
import java.util.Set;

public interface GitlabService {

    Set<ApiProjectResponse> getProjects(ApiProjectFilter gitlabFilter);

    List<ApiProjectResponse> compareBranches(ApiCompareBranchFilter gitlabFilter);

    List<ApiMergeRequestResponse> getMergeRequests(ApiMergeRequestFilter gitlabFilter);

    List<ApiMergeRequestResponse> createMergeRequests(ApiMergeRequestCreateRequest apiMergeRequestCreateRequest);

    List<ApiMergeRequestResponse> updateMergeRequests(ApiMergeRequestUpdateRequest apiMergeRequestUpdateRequest);
}

package com.example.subproject.impl;

import com.example.api.ApiClient;

/**
 * Implementation Module - Declares its own groupId (com.example.subproject)
 * This is the pattern that triggers GUIDE-2030 bug:
 * AGP should recognize this as an internal module despite different groupId
 */
public class ServiceImpl {
    private ApiClient apiClient = new ApiClient();

    public String getServiceInfo() {
        return "ServiceImpl using API version: " + apiClient.getVersion();
    }
}

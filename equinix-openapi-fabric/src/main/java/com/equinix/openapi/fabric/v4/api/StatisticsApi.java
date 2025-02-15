/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.9
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiCallback;
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.ApiResponse;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.Pair;
import com.equinix.openapi.fabric.ProgressRequestBody;
import com.equinix.openapi.fabric.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.equinix.openapi.fabric.v4.model.Duration;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.MetricInterval;
import java.time.OffsetDateTime;
import com.equinix.openapi.fabric.v4.model.QueryDirection;
import com.equinix.openapi.fabric.v4.model.Sort;
import com.equinix.openapi.fabric.v4.model.Statistics;
import com.equinix.openapi.fabric.v4.model.TopUtilizedStatistics;
import java.util.UUID;
import com.equinix.openapi.fabric.v4.model.ViewPoint;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StatisticsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatisticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getConnectionStatsByPortUuid
     * @param connectionId Connection UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @param viewPoint viewPoint (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectionStatsByPortUuidCall(String connectionId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, ViewPoint viewPoint, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fabric/v4/connections/{connectionId}/stats"
            .replace("{" + "connectionId" + "}", localVarApiClient.escapeString(connectionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDateTime", startDateTime));
        }

        if (endDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDateTime", endDateTime));
        }

        if (viewPoint != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("viewPoint", viewPoint));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConnectionStatsByPortUuidValidateBeforeCall(String connectionId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, ViewPoint viewPoint, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new ApiException("Missing the required parameter 'connectionId' when calling getConnectionStatsByPortUuid(Async)");
        }

        // verify the required parameter 'startDateTime' is set
        if (startDateTime == null) {
            throw new ApiException("Missing the required parameter 'startDateTime' when calling getConnectionStatsByPortUuid(Async)");
        }

        // verify the required parameter 'endDateTime' is set
        if (endDateTime == null) {
            throw new ApiException("Missing the required parameter 'endDateTime' when calling getConnectionStatsByPortUuid(Async)");
        }

        // verify the required parameter 'viewPoint' is set
        if (viewPoint == null) {
            throw new ApiException("Missing the required parameter 'viewPoint' when calling getConnectionStatsByPortUuid(Async)");
        }

        return getConnectionStatsByPortUuidCall(connectionId, startDateTime, endDateTime, viewPoint, _callback);

    }

    /**
     * Get Stats by uuid
     * This API provides service-level metrics so that you can view access and gather key information required to manage service subscription sizing and capacity
     * @param connectionId Connection UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @param viewPoint viewPoint (required)
     * @return Statistics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public Statistics getConnectionStatsByPortUuid(String connectionId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, ViewPoint viewPoint) throws ApiException {
        ApiResponse<Statistics> localVarResp = getConnectionStatsByPortUuidWithHttpInfo(connectionId, startDateTime, endDateTime, viewPoint);
        return localVarResp.getData();
    }

    /**
     * Get Stats by uuid
     * This API provides service-level metrics so that you can view access and gather key information required to manage service subscription sizing and capacity
     * @param connectionId Connection UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @param viewPoint viewPoint (required)
     * @return ApiResponse&lt;Statistics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Statistics> getConnectionStatsByPortUuidWithHttpInfo(String connectionId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, ViewPoint viewPoint) throws ApiException {
        okhttp3.Call localVarCall = getConnectionStatsByPortUuidValidateBeforeCall(connectionId, startDateTime, endDateTime, viewPoint, null);
        Type localVarReturnType = new TypeToken<Statistics>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Stats by uuid (asynchronously)
     * This API provides service-level metrics so that you can view access and gather key information required to manage service subscription sizing and capacity
     * @param connectionId Connection UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @param viewPoint viewPoint (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectionStatsByPortUuidAsync(String connectionId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, ViewPoint viewPoint, final ApiCallback<Statistics> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConnectionStatsByPortUuidValidateBeforeCall(connectionId, startDateTime, endDateTime, viewPoint, _callback);
        Type localVarReturnType = new TypeToken<Statistics>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortStats
     * @param metros Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located. (required)
     * @param sort Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \&quot;?\&quot; prefix indicates descending (DESC) order. (optional, default to -bandwidthUtilization)
     * @param top Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5. (optional, default to 5)
     * @param duration duration (optional, default to P7D)
     * @param direction Direction of traffic from the requester&#39;s viewpoint. The default is outbound. (optional, default to outbound)
     * @param metricInterval metricInterval (optional, default to P7D)
     * @param projectId projectId (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortStatsCall(List<String> metros, Sort sort, Integer top, Duration duration, QueryDirection direction, MetricInterval metricInterval, String projectId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fabric/v4/ports/stats";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (top != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("top", top));
        }

        if (duration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("duration", duration));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (metricInterval != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metricInterval", metricInterval));
        }

        if (metros != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "metros", metros));
        }

        if (projectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("projectId", projectId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortStatsValidateBeforeCall(List<String> metros, Sort sort, Integer top, Duration duration, QueryDirection direction, MetricInterval metricInterval, String projectId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'metros' is set
        if (metros == null) {
            throw new ApiException("Missing the required parameter 'metros' when calling getPortStats(Async)");
        }

        return getPortStatsCall(metros, sort, top, duration, direction, metricInterval, projectId, _callback);

    }

    /**
     * Top Port Statistics
     * This API provides top utilized service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     * @param metros Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located. (required)
     * @param sort Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \&quot;?\&quot; prefix indicates descending (DESC) order. (optional, default to -bandwidthUtilization)
     * @param top Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5. (optional, default to 5)
     * @param duration duration (optional, default to P7D)
     * @param direction Direction of traffic from the requester&#39;s viewpoint. The default is outbound. (optional, default to outbound)
     * @param metricInterval metricInterval (optional, default to P7D)
     * @param projectId projectId (optional)
     * @return TopUtilizedStatistics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public TopUtilizedStatistics getPortStats(List<String> metros, Sort sort, Integer top, Duration duration, QueryDirection direction, MetricInterval metricInterval, String projectId) throws ApiException {
        ApiResponse<TopUtilizedStatistics> localVarResp = getPortStatsWithHttpInfo(metros, sort, top, duration, direction, metricInterval, projectId);
        return localVarResp.getData();
    }

    /**
     * Top Port Statistics
     * This API provides top utilized service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     * @param metros Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located. (required)
     * @param sort Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \&quot;?\&quot; prefix indicates descending (DESC) order. (optional, default to -bandwidthUtilization)
     * @param top Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5. (optional, default to 5)
     * @param duration duration (optional, default to P7D)
     * @param direction Direction of traffic from the requester&#39;s viewpoint. The default is outbound. (optional, default to outbound)
     * @param metricInterval metricInterval (optional, default to P7D)
     * @param projectId projectId (optional)
     * @return ApiResponse&lt;TopUtilizedStatistics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TopUtilizedStatistics> getPortStatsWithHttpInfo(List<String> metros, Sort sort, Integer top, Duration duration, QueryDirection direction, MetricInterval metricInterval, String projectId) throws ApiException {
        okhttp3.Call localVarCall = getPortStatsValidateBeforeCall(metros, sort, top, duration, direction, metricInterval, projectId, null);
        Type localVarReturnType = new TypeToken<TopUtilizedStatistics>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Top Port Statistics (asynchronously)
     * This API provides top utilized service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     * @param metros Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located. (required)
     * @param sort Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \&quot;?\&quot; prefix indicates descending (DESC) order. (optional, default to -bandwidthUtilization)
     * @param top Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5. (optional, default to 5)
     * @param duration duration (optional, default to P7D)
     * @param direction Direction of traffic from the requester&#39;s viewpoint. The default is outbound. (optional, default to outbound)
     * @param metricInterval metricInterval (optional, default to P7D)
     * @param projectId projectId (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortStatsAsync(List<String> metros, Sort sort, Integer top, Duration duration, QueryDirection direction, MetricInterval metricInterval, String projectId, final ApiCallback<TopUtilizedStatistics> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPortStatsValidateBeforeCall(metros, sort, top, duration, direction, metricInterval, projectId, _callback);
        Type localVarReturnType = new TypeToken<TopUtilizedStatistics>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortStatsByPortUuid
     * @param portId Port UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortStatsByPortUuidCall(UUID portId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fabric/v4/ports/{portId}/stats"
            .replace("{" + "portId" + "}", localVarApiClient.escapeString(portId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDateTime", startDateTime));
        }

        if (endDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDateTime", endDateTime));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortStatsByPortUuidValidateBeforeCall(UUID portId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException("Missing the required parameter 'portId' when calling getPortStatsByPortUuid(Async)");
        }

        // verify the required parameter 'startDateTime' is set
        if (startDateTime == null) {
            throw new ApiException("Missing the required parameter 'startDateTime' when calling getPortStatsByPortUuid(Async)");
        }

        // verify the required parameter 'endDateTime' is set
        if (endDateTime == null) {
            throw new ApiException("Missing the required parameter 'endDateTime' when calling getPortStatsByPortUuid(Async)");
        }

        return getPortStatsByPortUuidCall(portId, startDateTime, endDateTime, _callback);

    }

    /**
     * Get Stats by uuid
     * This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     * @param portId Port UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @return Statistics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public Statistics getPortStatsByPortUuid(UUID portId, OffsetDateTime startDateTime, OffsetDateTime endDateTime) throws ApiException {
        ApiResponse<Statistics> localVarResp = getPortStatsByPortUuidWithHttpInfo(portId, startDateTime, endDateTime);
        return localVarResp.getData();
    }

    /**
     * Get Stats by uuid
     * This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     * @param portId Port UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @return ApiResponse&lt;Statistics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Statistics> getPortStatsByPortUuidWithHttpInfo(UUID portId, OffsetDateTime startDateTime, OffsetDateTime endDateTime) throws ApiException {
        okhttp3.Call localVarCall = getPortStatsByPortUuidValidateBeforeCall(portId, startDateTime, endDateTime, null);
        Type localVarReturnType = new TypeToken<Statistics>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Stats by uuid (asynchronously)
     * This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     * @param portId Port UUID (required)
     * @param startDateTime startDateTime (required)
     * @param endDateTime endDateTime (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortStatsByPortUuidAsync(UUID portId, OffsetDateTime startDateTime, OffsetDateTime endDateTime, final ApiCallback<Statistics> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPortStatsByPortUuidValidateBeforeCall(portId, startDateTime, endDateTime, _callback);
        Type localVarReturnType = new TypeToken<Statistics>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

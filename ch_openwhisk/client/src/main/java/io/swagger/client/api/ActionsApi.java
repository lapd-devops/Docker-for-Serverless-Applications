/*
 * OpenWhisk REST API
 * API for OpenWhisk
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Action;
import io.swagger.client.model.ActionPut;
import io.swagger.client.model.Activation;
import io.swagger.client.model.EntityBrief;
import io.swagger.client.model.ErrorMessage;
import io.swagger.client.model.ItemId;
import io.swagger.client.model.KeyValue;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionsApi {
    private ApiClient apiClient;

    public ActionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteAction
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteActionCall(String namespace, String actionName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/actions/{actionName}"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "actionName" + "\\}", apiClient.escapeString(actionName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteActionValidateBeforeCall(String namespace, String actionName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteAction(Async)");
        }
        
        // verify the required parameter 'actionName' is set
        if (actionName == null) {
            throw new ApiException("Missing the required parameter 'actionName' when calling deleteAction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteActionCall(namespace, actionName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an action
     * Delete an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAction(String namespace, String actionName) throws ApiException {
        deleteActionWithHttpInfo(namespace, actionName);
    }

    /**
     * Delete an action
     * Delete an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteActionWithHttpInfo(String namespace, String actionName) throws ApiException {
        com.squareup.okhttp.Call call = deleteActionValidateBeforeCall(namespace, actionName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an action (asynchronously)
     * Delete an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteActionAsync(String namespace, String actionName, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteActionValidateBeforeCall(namespace, actionName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getActionByName
     * @param namespace The entity namespace (required)
     * @param actionName Name of action to fetch (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getActionByNameCall(String namespace, String actionName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/actions/{actionName}"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "actionName" + "\\}", apiClient.escapeString(actionName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getActionByNameValidateBeforeCall(String namespace, String actionName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getActionByName(Async)");
        }
        
        // verify the required parameter 'actionName' is set
        if (actionName == null) {
            throw new ApiException("Missing the required parameter 'actionName' when calling getActionByName(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getActionByNameCall(namespace, actionName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get action information
     * Get action information.
     * @param namespace The entity namespace (required)
     * @param actionName Name of action to fetch (required)
     * @return Action
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Action getActionByName(String namespace, String actionName) throws ApiException {
        ApiResponse<Action> resp = getActionByNameWithHttpInfo(namespace, actionName);
        return resp.getData();
    }

    /**
     * Get action information
     * Get action information.
     * @param namespace The entity namespace (required)
     * @param actionName Name of action to fetch (required)
     * @return ApiResponse&lt;Action&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Action> getActionByNameWithHttpInfo(String namespace, String actionName) throws ApiException {
        com.squareup.okhttp.Call call = getActionByNameValidateBeforeCall(namespace, actionName, null, null);
        Type localVarReturnType = new TypeToken<Action>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get action information (asynchronously)
     * Get action information.
     * @param namespace The entity namespace (required)
     * @param actionName Name of action to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getActionByNameAsync(String namespace, String actionName, final ApiCallback<Action> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getActionByNameValidateBeforeCall(namespace, actionName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Action>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllActions
     * @param namespace The entity namespace (required)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllActionsCall(String namespace, Integer limit, Integer skip, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/actions"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllActionsValidateBeforeCall(String namespace, Integer limit, Integer skip, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getAllActions(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAllActionsCall(namespace, limit, skip, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all actions
     * Get all actions
     * @param namespace The entity namespace (required)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @return List&lt;EntityBrief&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EntityBrief> getAllActions(String namespace, Integer limit, Integer skip) throws ApiException {
        ApiResponse<List<EntityBrief>> resp = getAllActionsWithHttpInfo(namespace, limit, skip);
        return resp.getData();
    }

    /**
     * Get all actions
     * Get all actions
     * @param namespace The entity namespace (required)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @return ApiResponse&lt;List&lt;EntityBrief&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EntityBrief>> getAllActionsWithHttpInfo(String namespace, Integer limit, Integer skip) throws ApiException {
        com.squareup.okhttp.Call call = getAllActionsValidateBeforeCall(namespace, limit, skip, null, null);
        Type localVarReturnType = new TypeToken<List<EntityBrief>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all actions (asynchronously)
     * Get all actions
     * @param namespace The entity namespace (required)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllActionsAsync(String namespace, Integer limit, Integer skip, final ApiCallback<List<EntityBrief>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllActionsValidateBeforeCall(namespace, limit, skip, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EntityBrief>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for invokeAction
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param payload The parameters for the action being invoked (required)
     * @param blocking Blocking or non-blocking invocation. Default is non-blocking. (optional)
     * @param result Return only the result of a blocking activation. Default is false. (optional)
     * @param timeout Wait no more than specified duration in milliseconds for a blocking response. Default value and max allowed timeout are 60000. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call invokeActionCall(String namespace, String actionName, KeyValue payload, String blocking, String result, Integer timeout, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payload;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/actions/{actionName}"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "actionName" + "\\}", apiClient.escapeString(actionName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (blocking != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "blocking", blocking));
        if (result != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "result", result));
        if (timeout != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeout", timeout));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call invokeActionValidateBeforeCall(String namespace, String actionName, KeyValue payload, String blocking, String result, Integer timeout, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling invokeAction(Async)");
        }
        
        // verify the required parameter 'actionName' is set
        if (actionName == null) {
            throw new ApiException("Missing the required parameter 'actionName' when calling invokeAction(Async)");
        }
        
        // verify the required parameter 'payload' is set
        if (payload == null) {
            throw new ApiException("Missing the required parameter 'payload' when calling invokeAction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = invokeActionCall(namespace, actionName, payload, blocking, result, timeout, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Invoke an action
     * Invoke an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param payload The parameters for the action being invoked (required)
     * @param blocking Blocking or non-blocking invocation. Default is non-blocking. (optional)
     * @param result Return only the result of a blocking activation. Default is false. (optional)
     * @param timeout Wait no more than specified duration in milliseconds for a blocking response. Default value and max allowed timeout are 60000. (optional)
     * @return Activation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Activation invokeAction(String namespace, String actionName, KeyValue payload, String blocking, String result, Integer timeout) throws ApiException {
        ApiResponse<Activation> resp = invokeActionWithHttpInfo(namespace, actionName, payload, blocking, result, timeout);
        return resp.getData();
    }

    /**
     * Invoke an action
     * Invoke an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param payload The parameters for the action being invoked (required)
     * @param blocking Blocking or non-blocking invocation. Default is non-blocking. (optional)
     * @param result Return only the result of a blocking activation. Default is false. (optional)
     * @param timeout Wait no more than specified duration in milliseconds for a blocking response. Default value and max allowed timeout are 60000. (optional)
     * @return ApiResponse&lt;Activation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Activation> invokeActionWithHttpInfo(String namespace, String actionName, KeyValue payload, String blocking, String result, Integer timeout) throws ApiException {
        com.squareup.okhttp.Call call = invokeActionValidateBeforeCall(namespace, actionName, payload, blocking, result, timeout, null, null);
        Type localVarReturnType = new TypeToken<Activation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Invoke an action (asynchronously)
     * Invoke an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param payload The parameters for the action being invoked (required)
     * @param blocking Blocking or non-blocking invocation. Default is non-blocking. (optional)
     * @param result Return only the result of a blocking activation. Default is false. (optional)
     * @param timeout Wait no more than specified duration in milliseconds for a blocking response. Default value and max allowed timeout are 60000. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invokeActionAsync(String namespace, String actionName, KeyValue payload, String blocking, String result, Integer timeout, final ApiCallback<Activation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = invokeActionValidateBeforeCall(namespace, actionName, payload, blocking, result, timeout, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Activation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAction
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param action The action being updated (required)
     * @param overwrite Overwrite item if it exists. Default is false. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateActionCall(String namespace, String actionName, ActionPut action, String overwrite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = action;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/actions/{actionName}"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "actionName" + "\\}", apiClient.escapeString(actionName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (overwrite != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "overwrite", overwrite));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateActionValidateBeforeCall(String namespace, String actionName, ActionPut action, String overwrite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling updateAction(Async)");
        }
        
        // verify the required parameter 'actionName' is set
        if (actionName == null) {
            throw new ApiException("Missing the required parameter 'actionName' when calling updateAction(Async)");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new ApiException("Missing the required parameter 'action' when calling updateAction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateActionCall(namespace, actionName, action, overwrite, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create or update an action
     * Create or update an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param action The action being updated (required)
     * @param overwrite Overwrite item if it exists. Default is false. (optional)
     * @return ItemId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemId updateAction(String namespace, String actionName, ActionPut action, String overwrite) throws ApiException {
        ApiResponse<ItemId> resp = updateActionWithHttpInfo(namespace, actionName, action, overwrite);
        return resp.getData();
    }

    /**
     * Create or update an action
     * Create or update an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param action The action being updated (required)
     * @param overwrite Overwrite item if it exists. Default is false. (optional)
     * @return ApiResponse&lt;ItemId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ItemId> updateActionWithHttpInfo(String namespace, String actionName, ActionPut action, String overwrite) throws ApiException {
        com.squareup.okhttp.Call call = updateActionValidateBeforeCall(namespace, actionName, action, overwrite, null, null);
        Type localVarReturnType = new TypeToken<ItemId>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create or update an action (asynchronously)
     * Create or update an action
     * @param namespace The entity namespace (required)
     * @param actionName Name of action (required)
     * @param action The action being updated (required)
     * @param overwrite Overwrite item if it exists. Default is false. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateActionAsync(String namespace, String actionName, ActionPut action, String overwrite, final ApiCallback<ItemId> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateActionValidateBeforeCall(namespace, actionName, action, overwrite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ItemId>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

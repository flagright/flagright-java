/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.resources.consumerusers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flagright.api.core.ClientOptions;
import com.flagright.api.core.FlagrightApiApiException;
import com.flagright.api.core.FlagrightApiException;
import com.flagright.api.core.MediaTypes;
import com.flagright.api.core.ObjectMappers;
import com.flagright.api.core.RequestOptions;
import com.flagright.api.errors.BadRequestError;
import com.flagright.api.errors.TooManyRequestsError;
import com.flagright.api.errors.UnauthorizedError;
import com.flagright.api.resources.consumerusers.requests.ConsumerUsersCreateRequest;
import com.flagright.api.resources.consumerusers.types.ConsumerUsersCreateResponse;
import com.flagright.api.types.ApiErrorResponse;
import com.flagright.api.types.UserWithRulesResult;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ConsumerUsersClient {
    protected final ClientOptions clientOptions;

    public ConsumerUsersClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * <h2>POST Consumer User</h2>
     * <code>/consumer/user</code> endpoint allows you to operate on the Consumer user entity.
     * <p>In order to pass the payload of a User to Flagright and verify the User, you will need to call this endpoint with the User payload. Not all fields are mandatory, you will only need to pass in the fields that you have and are relevant for your compliance setup.</p>
     * <h3>Payload</h3>
     * <p>Each consumer user needs two mandatory fields:</p>
     * <ul>
     * <li><code>userId</code> - Unique identifier for the user</li>
     * <li><code>createdTimestamp</code> - UNIX timestamp in <em>milliseconds</em> for when the User is created in your system</li>
     * </ul>
     */
    public ConsumerUsersCreateResponse create(ConsumerUsersCreateRequest request) {
        return create(request, null);
    }

    /**
     * <h2>POST Consumer User</h2>
     * <code>/consumer/user</code> endpoint allows you to operate on the Consumer user entity.
     * <p>In order to pass the payload of a User to Flagright and verify the User, you will need to call this endpoint with the User payload. Not all fields are mandatory, you will only need to pass in the fields that you have and are relevant for your compliance setup.</p>
     * <h3>Payload</h3>
     * <p>Each consumer user needs two mandatory fields:</p>
     * <ul>
     * <li><code>userId</code> - Unique identifier for the user</li>
     * <li><code>createdTimestamp</code> - UNIX timestamp in <em>milliseconds</em> for when the User is created in your system</li>
     * </ul>
     */
    public ConsumerUsersCreateResponse create(ConsumerUsersCreateRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("consumer/users");
        if (request.getLockCraRiskLevel().isPresent()) {
            httpUrl.addQueryParameter(
                    "lockCraRiskLevel", request.getLockCraRiskLevel().get().toString());
        }
        if (request.getLockKycRiskLevel().isPresent()) {
            httpUrl.addQueryParameter(
                    "lockKycRiskLevel", request.getLockKycRiskLevel().get().toString());
        }
        if (request.getValidateUserId().isPresent()) {
            httpUrl.addQueryParameter(
                    "validateUserId", request.getValidateUserId().get().toString());
        }
        if (request.getKrsOnly().isPresent()) {
            httpUrl.addQueryParameter("_krsOnly", request.getKrsOnly().get().toString());
        }
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ConsumerUsersCreateResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new BadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class));
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class));
                    case 429:
                        throw new TooManyRequestsError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new FlagrightApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlagrightApiException("Network error executing HTTP request", e);
        }
    }

    /**
     * <h3>GET Consumer User</h3>
     * <code>/consumer/user</code> endpoint allows you to operate on the Consumer User entity.
     * <p>Calling <code>GET /consumer/user/{userId}</code> will return the entire user payload and rule execution results for the user with the corresponding <code>userId</code></p>
     */
    public UserWithRulesResult get(String userId) {
        return get(userId, null);
    }

    /**
     * <h3>GET Consumer User</h3>
     * <code>/consumer/user</code> endpoint allows you to operate on the Consumer User entity.
     * <p>Calling <code>GET /consumer/user/{userId}</code> will return the entire user payload and rule execution results for the user with the corresponding <code>userId</code></p>
     */
    public UserWithRulesResult get(String userId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("consumer/users")
                .addPathSegment(userId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), UserWithRulesResult.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new BadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class));
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class));
                    case 429:
                        throw new TooManyRequestsError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new FlagrightApiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlagrightApiException("Network error executing HTTP request", e);
        }
    }
}

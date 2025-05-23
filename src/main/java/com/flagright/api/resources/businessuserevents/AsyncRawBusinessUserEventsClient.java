/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.resources.businessuserevents;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flagright.api.core.ClientOptions;
import com.flagright.api.core.FlagrightApiException;
import com.flagright.api.core.FlagrightException;
import com.flagright.api.core.FlagrightHttpResponse;
import com.flagright.api.core.MediaTypes;
import com.flagright.api.core.ObjectMappers;
import com.flagright.api.core.QueryStringMapper;
import com.flagright.api.core.RequestOptions;
import com.flagright.api.errors.BadRequestError;
import com.flagright.api.errors.ConflictError;
import com.flagright.api.errors.TooManyRequestsError;
import com.flagright.api.errors.UnauthorizedError;
import com.flagright.api.resources.businessuserevents.requests.BusinessUserEventsCreateRequest;
import com.flagright.api.types.ApiErrorResponse;
import com.flagright.api.types.BusinessUserEventWithRulesResult;
import com.flagright.api.types.BusinessWithRulesResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncRawBusinessUserEventsClient {
    protected final ClientOptions clientOptions;

    public AsyncRawBusinessUserEventsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * <h2>POST Business User Events</h2>
     * <code>/events/business/user</code> endpoint allows you to operate on the Business User Events entity.
     * <p>User events are created after the initial <code>POST /business/users</code> call (which creates a user) and are used to:</p>
     * <ul>
     * <li>Update the STATE and KYC Status of the user, using the <code>userStateDetails</code> or <code>kycStatusDetails</code> field</li>
     * <li>Update the user details, using the <code>updatedBusinessUserAttributes</code> field.</li>
     * </ul>
     * <blockquote>
     * <p>If you have neither of the above two use cases, you do not need to use user events.</p>
     * </blockquote>
     * <h3>Payload</h3>
     * <p>Each user event needs three mandatory fields:</p>
     * <ul>
     * <li><code>timestamp</code>- the timestamp of when the event was created or occured in your system</li>
     * <li><code>userId</code> - The ID of the transaction for which this event is generated.</li>
     * </ul>
     * <p>In order to make individual events retrievable, you also need to pass in a unique <code>eventId</code> to the request body.</p>
     */
    public CompletableFuture<FlagrightHttpResponse<BusinessWithRulesResult>> create(
            BusinessUserEventsCreateRequest request) {
        return create(request, null);
    }

    /**
     * <h2>POST Business User Events</h2>
     * <code>/events/business/user</code> endpoint allows you to operate on the Business User Events entity.
     * <p>User events are created after the initial <code>POST /business/users</code> call (which creates a user) and are used to:</p>
     * <ul>
     * <li>Update the STATE and KYC Status of the user, using the <code>userStateDetails</code> or <code>kycStatusDetails</code> field</li>
     * <li>Update the user details, using the <code>updatedBusinessUserAttributes</code> field.</li>
     * </ul>
     * <blockquote>
     * <p>If you have neither of the above two use cases, you do not need to use user events.</p>
     * </blockquote>
     * <h3>Payload</h3>
     * <p>Each user event needs three mandatory fields:</p>
     * <ul>
     * <li><code>timestamp</code>- the timestamp of when the event was created or occured in your system</li>
     * <li><code>userId</code> - The ID of the transaction for which this event is generated.</li>
     * </ul>
     * <p>In order to make individual events retrievable, you also need to pass in a unique <code>eventId</code> to the request body.</p>
     */
    public CompletableFuture<FlagrightHttpResponse<BusinessWithRulesResult>> create(
            BusinessUserEventsCreateRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events/business/user");
        if (request.getAllowUserTypeConversion().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl,
                    "allowUserTypeConversion",
                    request.getAllowUserTypeConversion().get().toString(),
                    false);
        }
        if (request.getLockKycRiskLevel().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl,
                    "lockKycRiskLevel",
                    request.getLockKycRiskLevel().get().toString(),
                    false);
        }
        if (request.getLockCraRiskLevel().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl,
                    "lockCraRiskLevel",
                    request.getLockCraRiskLevel().get().toString(),
                    false);
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
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<FlagrightHttpResponse<BusinessWithRulesResult>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new FlagrightHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), BusinessWithRulesResult.class),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 400:
                                future.completeExceptionally(new BadRequestError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class),
                                        response));
                                return;
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class),
                                        response));
                                return;
                            case 409:
                                future.completeExceptionally(new ConflictError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class),
                                        response));
                                return;
                            case 429:
                                future.completeExceptionally(new TooManyRequestsError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new FlagrightApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new FlagrightException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new FlagrightException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    /**
     * <h3>GET a Business User Event</h3>
     * You can retrieve any business user event you created using the <a href="/api-reference/api-reference/business-user-events/create">POST Business User Events</a> call.
     */
    public CompletableFuture<FlagrightHttpResponse<BusinessUserEventWithRulesResult>> get(String eventId) {
        return get(eventId, null);
    }

    /**
     * <h3>GET a Business User Event</h3>
     * You can retrieve any business user event you created using the <a href="/api-reference/api-reference/business-user-events/create">POST Business User Events</a> call.
     */
    public CompletableFuture<FlagrightHttpResponse<BusinessUserEventWithRulesResult>> get(
            String eventId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events/business/user")
                .addPathSegment(eventId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<FlagrightHttpResponse<BusinessUserEventWithRulesResult>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new FlagrightHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), BusinessUserEventWithRulesResult.class),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 400:
                                future.completeExceptionally(new BadRequestError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class),
                                        response));
                                return;
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class),
                                        response));
                                return;
                            case 429:
                                future.completeExceptionally(new TooManyRequestsError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, ApiErrorResponse.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new FlagrightApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new FlagrightException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new FlagrightException("Network error executing HTTP request", e));
            }
        });
        return future;
    }
}

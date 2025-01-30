/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.resources.transactionevents;

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
import com.flagright.api.types.ApiErrorResponse;
import com.flagright.api.types.TransactionEvent;
import com.flagright.api.types.TransactionEventMonitoringResult;
import com.flagright.api.types.TransactionEventWithRulesResult;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class TransactionEventsClient {
    protected final ClientOptions clientOptions;

    public TransactionEventsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * <h2>POST Transaction Events</h2>
     * <code>/events/transaction</code> endpoint allows you to operate on the <a href="/guides/overview/entities#transaction-event">Transaction Events entity.</a>
     * <p>Transaction events are created after the initial <code>POST /transactions</code> call (which creates a transaction) and are used to:</p>
     * <ul>
     * <li>Update the STATE of the transaction, using the <code>transactionState</code> field and manage the <a href="/guides/overview/entities#transaction-lifecycle-through-transaction-events">Transaction Lifecycle</a></li>
     * <li>Update the transaction details, using the <code>updatedTransactionAttributes</code> field.</li>
     * </ul>
     * <blockquote>
     * <p>If you have neither of the above two use cases, you do not need to use transaction events.</p>
     * </blockquote>
     * <h3>Payload</h3>
     * <p>Each transaction event needs three mandatory fields:</p>
     * <ul>
     * <li><code>transactionState</code> - STATE of the transaction -&gt; value is set to <code>CREATED</code> after <code>POST /transactions</code> call</li>
     * <li><code>timestamp</code>- the timestamp of when the event was created or occured in your system</li>
     * <li><code>transactionId</code> - The ID of the transaction for which this event is generated.</li>
     * </ul>
     * <p>In order to make individual events retrievable, you also need to pass in a unique <code>eventId</code> to the request body.</p>
     */
    public TransactionEventMonitoringResult create(TransactionEvent request) {
        return create(request, null);
    }

    /**
     * <h2>POST Transaction Events</h2>
     * <code>/events/transaction</code> endpoint allows you to operate on the <a href="/guides/overview/entities#transaction-event">Transaction Events entity.</a>
     * <p>Transaction events are created after the initial <code>POST /transactions</code> call (which creates a transaction) and are used to:</p>
     * <ul>
     * <li>Update the STATE of the transaction, using the <code>transactionState</code> field and manage the <a href="/guides/overview/entities#transaction-lifecycle-through-transaction-events">Transaction Lifecycle</a></li>
     * <li>Update the transaction details, using the <code>updatedTransactionAttributes</code> field.</li>
     * </ul>
     * <blockquote>
     * <p>If you have neither of the above two use cases, you do not need to use transaction events.</p>
     * </blockquote>
     * <h3>Payload</h3>
     * <p>Each transaction event needs three mandatory fields:</p>
     * <ul>
     * <li><code>transactionState</code> - STATE of the transaction -&gt; value is set to <code>CREATED</code> after <code>POST /transactions</code> call</li>
     * <li><code>timestamp</code>- the timestamp of when the event was created or occured in your system</li>
     * <li><code>transactionId</code> - The ID of the transaction for which this event is generated.</li>
     * </ul>
     * <p>In order to make individual events retrievable, you also need to pass in a unique <code>eventId</code> to the request body.</p>
     */
    public TransactionEventMonitoringResult create(TransactionEvent request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events/transaction")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new FlagrightApiException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), TransactionEventMonitoringResult.class);
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
     * <h3>GET Transaction Events</h3>
     * <code>/events/transaction</code> endpoint allows you to operate on the <a href="/guides/overview/entities#transaction-event">Transaction Events entity.</a>.
     * <p>You can retrieve any transaction event you created using the <a href="/api-reference/api-reference/transaction-events/create">POST Transaction Events</a> call.</p>
     */
    public TransactionEventWithRulesResult get(String eventId) {
        return get(eventId, null);
    }

    /**
     * <h3>GET Transaction Events</h3>
     * <code>/events/transaction</code> endpoint allows you to operate on the <a href="/guides/overview/entities#transaction-event">Transaction Events entity.</a>.
     * <p>You can retrieve any transaction event you created using the <a href="/api-reference/api-reference/transaction-events/create">POST Transaction Events</a> call.</p>
     */
    public TransactionEventWithRulesResult get(String eventId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events/transaction")
                .addPathSegment(eventId)
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), TransactionEventWithRulesResult.class);
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

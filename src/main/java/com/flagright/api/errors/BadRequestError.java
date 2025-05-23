/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.errors;

import com.flagright.api.core.FlagrightApiException;
import com.flagright.api.types.ApiErrorResponse;
import okhttp3.Response;

public final class BadRequestError extends FlagrightApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final ApiErrorResponse body;

    public BadRequestError(ApiErrorResponse body) {
        super("BadRequestError", 400, body);
        this.body = body;
    }

    public BadRequestError(ApiErrorResponse body, Response rawResponse) {
        super("BadRequestError", 400, body, rawResponse);
        this.body = body;
    }

    /**
     * @return the body
     */
    @java.lang.Override
    public ApiErrorResponse body() {
        return this.body;
    }
}

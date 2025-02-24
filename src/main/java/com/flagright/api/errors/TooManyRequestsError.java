/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.errors;

import com.flagright.api.core.FlagrightApiException;
import com.flagright.api.types.ApiErrorResponse;

public final class TooManyRequestsError extends FlagrightApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final ApiErrorResponse body;

    public TooManyRequestsError(ApiErrorResponse body) {
        super("TooManyRequestsError", 429, body);
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

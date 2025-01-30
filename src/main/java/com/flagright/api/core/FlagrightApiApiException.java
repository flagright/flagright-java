/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.core;

/**
 * This exception type will be thrown for any non-2XX API responses.
 */
public class FlagrightApiApiException extends FlagrightApiException {
    /**
     * The error code of the response that triggered the exception.
     */
    private final int statusCode;

    /**
     * The body of the response that triggered the exception.
     */
    private final Object body;

    public FlagrightApiApiException(String message, int statusCode, Object body) {
        super(message);
        this.statusCode = statusCode;
        this.body = body;
    }

    /**
     * @return the statusCode
     */
    public int statusCode() {
        return this.statusCode;
    }

    /**
     * @return the body
     */
    public Object body() {
        return this.body;
    }

    @java.lang.Override
    public String toString() {
        return "FlagrightApiApiException{" + "message: " + getMessage() + ", statusCode: " + statusCode + ", body: "
                + body + "}";
    }
}

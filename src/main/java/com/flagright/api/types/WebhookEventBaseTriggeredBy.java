/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WebhookEventBaseTriggeredBy {
    MANUAL("MANUAL"),

    SYSTEM("SYSTEM");

    private final String value;

    WebhookEventBaseTriggeredBy(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}

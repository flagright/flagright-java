/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PepRank {
    LEVEL_1("LEVEL_1"),

    LEVEL_2("LEVEL_2"),

    LEVEL_3("LEVEL_3");

    private final String value;

    PepRank(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}

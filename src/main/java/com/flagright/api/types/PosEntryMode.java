/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PosEntryMode {
    ZERO("0"),

    ONE("1"),

    TWO("2"),

    THREE("3"),

    FOUR("4"),

    FIVE("5"),

    SIX("6"),

    SEVEN("7"),

    EIGHT("8"),

    NINE("9"),

    TEN("10"),

    SEVENTY_NINE("79"),

    EIGHTY("80"),

    EIGHTY_ONE("81"),

    EIGHTY_TWO("82"),

    EIGHTY_FIVE("85"),

    NINETY("90"),

    NINETY_ONE("91"),

    NINETY_FIVE("95"),

    NINETY_SEVEN("97");

    private final String value;

    PosEntryMode(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}

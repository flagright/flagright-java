/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethod {
    ACH("ACH"),

    CARD("CARD"),

    IBAN("IBAN"),

    UPI("UPI"),

    GENERIC_BANK_ACCOUNT("GENERIC_BANK_ACCOUNT"),

    MPESA("MPESA"),

    SWIFT("SWIFT"),

    WALLET("WALLET"),

    CHECK("CHECK"),

    CASH("CASH");

    private final String value;

    PaymentMethod(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}

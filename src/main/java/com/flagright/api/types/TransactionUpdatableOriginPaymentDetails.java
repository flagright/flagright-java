/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class TransactionUpdatableOriginPaymentDetails {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private TransactionUpdatableOriginPaymentDetails(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static TransactionUpdatableOriginPaymentDetails card(CardDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new CardValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails genericBankAccount(GenericBankAccountDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new GenericBankAccountValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails iban(IbanDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new IbanValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails ach(AchDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new AchValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails swift(SwiftDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new SwiftValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails mpesa(MpesaDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new MpesaValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails upi(UpiDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new UpiValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails wallet(WalletDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new WalletValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails check(CheckDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new CheckValue(value));
    }

    public static TransactionUpdatableOriginPaymentDetails cash(CashDetails value) {
        return new TransactionUpdatableOriginPaymentDetails(new CashValue(value));
    }

    public boolean isCard() {
        return value instanceof CardValue;
    }

    public boolean isGenericBankAccount() {
        return value instanceof GenericBankAccountValue;
    }

    public boolean isIban() {
        return value instanceof IbanValue;
    }

    public boolean isAch() {
        return value instanceof AchValue;
    }

    public boolean isSwift() {
        return value instanceof SwiftValue;
    }

    public boolean isMpesa() {
        return value instanceof MpesaValue;
    }

    public boolean isUpi() {
        return value instanceof UpiValue;
    }

    public boolean isWallet() {
        return value instanceof WalletValue;
    }

    public boolean isCheck() {
        return value instanceof CheckValue;
    }

    public boolean isCash() {
        return value instanceof CashValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<CardDetails> getCard() {
        if (isCard()) {
            return Optional.of(((CardValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GenericBankAccountDetails> getGenericBankAccount() {
        if (isGenericBankAccount()) {
            return Optional.of(((GenericBankAccountValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<IbanDetails> getIban() {
        if (isIban()) {
            return Optional.of(((IbanValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<AchDetails> getAch() {
        if (isAch()) {
            return Optional.of(((AchValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<SwiftDetails> getSwift() {
        if (isSwift()) {
            return Optional.of(((SwiftValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<MpesaDetails> getMpesa() {
        if (isMpesa()) {
            return Optional.of(((MpesaValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<UpiDetails> getUpi() {
        if (isUpi()) {
            return Optional.of(((UpiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<WalletDetails> getWallet() {
        if (isWallet()) {
            return Optional.of(((WalletValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CheckDetails> getCheck() {
        if (isCheck()) {
            return Optional.of(((CheckValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CashDetails> getCash() {
        if (isCash()) {
            return Optional.of(((CashValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitCard(CardDetails card);

        T visitGenericBankAccount(GenericBankAccountDetails genericBankAccount);

        T visitIban(IbanDetails iban);

        T visitAch(AchDetails ach);

        T visitSwift(SwiftDetails swift);

        T visitMpesa(MpesaDetails mpesa);

        T visitUpi(UpiDetails upi);

        T visitWallet(WalletDetails wallet);

        T visitCheck(CheckDetails check);

        T visitCash(CashDetails cash);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "method", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(CardValue.class),
        @JsonSubTypes.Type(GenericBankAccountValue.class),
        @JsonSubTypes.Type(IbanValue.class),
        @JsonSubTypes.Type(AchValue.class),
        @JsonSubTypes.Type(SwiftValue.class),
        @JsonSubTypes.Type(MpesaValue.class),
        @JsonSubTypes.Type(UpiValue.class),
        @JsonSubTypes.Type(WalletValue.class),
        @JsonSubTypes.Type(CheckValue.class),
        @JsonSubTypes.Type(CashValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("CARD")
    private static final class CardValue implements Value {
        @JsonUnwrapped
        private CardDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CardValue() {}

        private CardValue(CardDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCard(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CardValue && equalTo((CardValue) other);
        }

        private boolean equalTo(CardValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("GENERIC_BANK_ACCOUNT")
    private static final class GenericBankAccountValue implements Value {
        @JsonUnwrapped
        private GenericBankAccountDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GenericBankAccountValue() {}

        private GenericBankAccountValue(GenericBankAccountDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGenericBankAccount(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GenericBankAccountValue && equalTo((GenericBankAccountValue) other);
        }

        private boolean equalTo(GenericBankAccountValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("IBAN")
    private static final class IbanValue implements Value {
        @JsonUnwrapped
        private IbanDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private IbanValue() {}

        private IbanValue(IbanDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitIban(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof IbanValue && equalTo((IbanValue) other);
        }

        private boolean equalTo(IbanValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("ACH")
    private static final class AchValue implements Value {
        @JsonUnwrapped
        private AchDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AchValue() {}

        private AchValue(AchDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAch(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AchValue && equalTo((AchValue) other);
        }

        private boolean equalTo(AchValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("SWIFT")
    private static final class SwiftValue implements Value {
        @JsonUnwrapped
        private SwiftDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SwiftValue() {}

        private SwiftValue(SwiftDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSwift(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SwiftValue && equalTo((SwiftValue) other);
        }

        private boolean equalTo(SwiftValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("MPESA")
    private static final class MpesaValue implements Value {
        @JsonUnwrapped
        private MpesaDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private MpesaValue() {}

        private MpesaValue(MpesaDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitMpesa(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof MpesaValue && equalTo((MpesaValue) other);
        }

        private boolean equalTo(MpesaValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("UPI")
    private static final class UpiValue implements Value {
        @JsonUnwrapped
        private UpiDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private UpiValue() {}

        private UpiValue(UpiDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitUpi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof UpiValue && equalTo((UpiValue) other);
        }

        private boolean equalTo(UpiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("WALLET")
    private static final class WalletValue implements Value {
        @JsonUnwrapped
        private WalletDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private WalletValue() {}

        private WalletValue(WalletDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitWallet(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof WalletValue && equalTo((WalletValue) other);
        }

        private boolean equalTo(WalletValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("CHECK")
    private static final class CheckValue implements Value {
        @JsonUnwrapped
        private CheckDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CheckValue() {}

        private CheckValue(CheckDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCheck(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CheckValue && equalTo((CheckValue) other);
        }

        private boolean equalTo(CheckValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("CASH")
    private static final class CashValue implements Value {
        @JsonUnwrapped
        private CashDetails value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CashValue() {}

        private CashValue(CashDetails value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCash(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CashValue && equalTo((CashValue) other);
        }

        private boolean equalTo(CashValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "value: " + value + "}";
        }
    }

    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TransactionUpdatableOriginPaymentDetails{" + "type: " + type + ", value: " + value + "}";
        }
    }
}

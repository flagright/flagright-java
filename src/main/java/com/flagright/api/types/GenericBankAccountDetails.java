/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flagright.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GenericBankAccountDetails.Builder.class)
public final class GenericBankAccountDetails {
    private final Optional<String> accountNumber;

    private final Optional<String> accountType;

    private final Optional<Amount> accountBalance;

    private final Optional<String> bankName;

    private final Optional<String> bankCode;

    private final Optional<CountryCode> country;

    private final Optional<String> name;

    private final Optional<Address> bankAddress;

    private final Optional<String> emailId;

    private final Optional<String> specialInstructions;

    private final Optional<String> paymentChannel;

    private final Optional<List<Tag>> tags;

    private final Optional<String> transitNumber;

    private final Map<String, Object> additionalProperties;

    private GenericBankAccountDetails(
            Optional<String> accountNumber,
            Optional<String> accountType,
            Optional<Amount> accountBalance,
            Optional<String> bankName,
            Optional<String> bankCode,
            Optional<CountryCode> country,
            Optional<String> name,
            Optional<Address> bankAddress,
            Optional<String> emailId,
            Optional<String> specialInstructions,
            Optional<String> paymentChannel,
            Optional<List<Tag>> tags,
            Optional<String> transitNumber,
            Map<String, Object> additionalProperties) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.country = country;
        this.name = name;
        this.bankAddress = bankAddress;
        this.emailId = emailId;
        this.specialInstructions = specialInstructions;
        this.paymentChannel = paymentChannel;
        this.tags = tags;
        this.transitNumber = transitNumber;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Bank account number
     */
    @JsonProperty("accountNumber")
    public Optional<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return Bank account type. E.g. Checking, Savings etc.
     */
    @JsonProperty("accountType")
    public Optional<String> getAccountType() {
        return accountType;
    }

    @JsonProperty("accountBalance")
    public Optional<Amount> getAccountBalance() {
        return accountBalance;
    }

    /**
     * @return Name of the bank
     */
    @JsonProperty("bankName")
    public Optional<String> getBankName() {
        return bankName;
    }

    /**
     * @return Unique identifier of the bank. In some countries, this can be the same as the bank's SWIFT code
     */
    @JsonProperty("bankCode")
    public Optional<String> getBankCode() {
        return bankCode;
    }

    @JsonProperty("country")
    public Optional<CountryCode> getCountry() {
        return country;
    }

    /**
     * @return Name of the account holder
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("bankAddress")
    public Optional<Address> getBankAddress() {
        return bankAddress;
    }

    @JsonProperty("emailId")
    public Optional<String> getEmailId() {
        return emailId;
    }

    /**
     * @return Special instructions to be specified if any
     */
    @JsonProperty("specialInstructions")
    public Optional<String> getSpecialInstructions() {
        return specialInstructions;
    }

    @JsonProperty("paymentChannel")
    public Optional<String> getPaymentChannel() {
        return paymentChannel;
    }

    /**
     * @return Additional information that can be added via tags
     */
    @JsonProperty("tags")
    public Optional<List<Tag>> getTags() {
        return tags;
    }

    /**
     * @return Transit number of the bank account
     */
    @JsonProperty("transitNumber")
    public Optional<String> getTransitNumber() {
        return transitNumber;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GenericBankAccountDetails && equalTo((GenericBankAccountDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GenericBankAccountDetails other) {
        return accountNumber.equals(other.accountNumber)
                && accountType.equals(other.accountType)
                && accountBalance.equals(other.accountBalance)
                && bankName.equals(other.bankName)
                && bankCode.equals(other.bankCode)
                && country.equals(other.country)
                && name.equals(other.name)
                && bankAddress.equals(other.bankAddress)
                && emailId.equals(other.emailId)
                && specialInstructions.equals(other.specialInstructions)
                && paymentChannel.equals(other.paymentChannel)
                && tags.equals(other.tags)
                && transitNumber.equals(other.transitNumber);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.accountNumber,
                this.accountType,
                this.accountBalance,
                this.bankName,
                this.bankCode,
                this.country,
                this.name,
                this.bankAddress,
                this.emailId,
                this.specialInstructions,
                this.paymentChannel,
                this.tags,
                this.transitNumber);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> accountNumber = Optional.empty();

        private Optional<String> accountType = Optional.empty();

        private Optional<Amount> accountBalance = Optional.empty();

        private Optional<String> bankName = Optional.empty();

        private Optional<String> bankCode = Optional.empty();

        private Optional<CountryCode> country = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Address> bankAddress = Optional.empty();

        private Optional<String> emailId = Optional.empty();

        private Optional<String> specialInstructions = Optional.empty();

        private Optional<String> paymentChannel = Optional.empty();

        private Optional<List<Tag>> tags = Optional.empty();

        private Optional<String> transitNumber = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GenericBankAccountDetails other) {
            accountNumber(other.getAccountNumber());
            accountType(other.getAccountType());
            accountBalance(other.getAccountBalance());
            bankName(other.getBankName());
            bankCode(other.getBankCode());
            country(other.getCountry());
            name(other.getName());
            bankAddress(other.getBankAddress());
            emailId(other.getEmailId());
            specialInstructions(other.getSpecialInstructions());
            paymentChannel(other.getPaymentChannel());
            tags(other.getTags());
            transitNumber(other.getTransitNumber());
            return this;
        }

        @JsonSetter(value = "accountNumber", nulls = Nulls.SKIP)
        public Builder accountNumber(Optional<String> accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = Optional.ofNullable(accountNumber);
            return this;
        }

        @JsonSetter(value = "accountType", nulls = Nulls.SKIP)
        public Builder accountType(Optional<String> accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = Optional.ofNullable(accountType);
            return this;
        }

        @JsonSetter(value = "accountBalance", nulls = Nulls.SKIP)
        public Builder accountBalance(Optional<Amount> accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        public Builder accountBalance(Amount accountBalance) {
            this.accountBalance = Optional.ofNullable(accountBalance);
            return this;
        }

        @JsonSetter(value = "bankName", nulls = Nulls.SKIP)
        public Builder bankName(Optional<String> bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = Optional.ofNullable(bankName);
            return this;
        }

        @JsonSetter(value = "bankCode", nulls = Nulls.SKIP)
        public Builder bankCode(Optional<String> bankCode) {
            this.bankCode = bankCode;
            return this;
        }

        public Builder bankCode(String bankCode) {
            this.bankCode = Optional.ofNullable(bankCode);
            return this;
        }

        @JsonSetter(value = "country", nulls = Nulls.SKIP)
        public Builder country(Optional<CountryCode> country) {
            this.country = country;
            return this;
        }

        public Builder country(CountryCode country) {
            this.country = Optional.ofNullable(country);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "bankAddress", nulls = Nulls.SKIP)
        public Builder bankAddress(Optional<Address> bankAddress) {
            this.bankAddress = bankAddress;
            return this;
        }

        public Builder bankAddress(Address bankAddress) {
            this.bankAddress = Optional.ofNullable(bankAddress);
            return this;
        }

        @JsonSetter(value = "emailId", nulls = Nulls.SKIP)
        public Builder emailId(Optional<String> emailId) {
            this.emailId = emailId;
            return this;
        }

        public Builder emailId(String emailId) {
            this.emailId = Optional.ofNullable(emailId);
            return this;
        }

        @JsonSetter(value = "specialInstructions", nulls = Nulls.SKIP)
        public Builder specialInstructions(Optional<String> specialInstructions) {
            this.specialInstructions = specialInstructions;
            return this;
        }

        public Builder specialInstructions(String specialInstructions) {
            this.specialInstructions = Optional.ofNullable(specialInstructions);
            return this;
        }

        @JsonSetter(value = "paymentChannel", nulls = Nulls.SKIP)
        public Builder paymentChannel(Optional<String> paymentChannel) {
            this.paymentChannel = paymentChannel;
            return this;
        }

        public Builder paymentChannel(String paymentChannel) {
            this.paymentChannel = Optional.ofNullable(paymentChannel);
            return this;
        }

        @JsonSetter(value = "tags", nulls = Nulls.SKIP)
        public Builder tags(Optional<List<Tag>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(List<Tag> tags) {
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        @JsonSetter(value = "transitNumber", nulls = Nulls.SKIP)
        public Builder transitNumber(Optional<String> transitNumber) {
            this.transitNumber = transitNumber;
            return this;
        }

        public Builder transitNumber(String transitNumber) {
            this.transitNumber = Optional.ofNullable(transitNumber);
            return this;
        }

        public GenericBankAccountDetails build() {
            return new GenericBankAccountDetails(
                    accountNumber,
                    accountType,
                    accountBalance,
                    bankName,
                    bankCode,
                    country,
                    name,
                    bankAddress,
                    emailId,
                    specialInstructions,
                    paymentChannel,
                    tags,
                    transitNumber,
                    additionalProperties);
        }
    }
}

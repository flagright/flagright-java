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
@JsonDeserialize(builder = IbanDetails.Builder.class)
public final class IbanDetails {
    private final Optional<String> bic;

    private final Optional<String> bankName;

    private final Optional<Address> bankAddress;

    private final Optional<CountryCode> country;

    private final Optional<String> iban;

    private final Optional<Amount> accountBalance;

    private final Optional<String> name;

    private final Optional<String> emailId;

    private final Optional<String> bankBranchCode;

    private final Optional<String> paymentChannel;

    private final Optional<List<Tag>> tags;

    private final Map<String, Object> additionalProperties;

    private IbanDetails(
            Optional<String> bic,
            Optional<String> bankName,
            Optional<Address> bankAddress,
            Optional<CountryCode> country,
            Optional<String> iban,
            Optional<Amount> accountBalance,
            Optional<String> name,
            Optional<String> emailId,
            Optional<String> bankBranchCode,
            Optional<String> paymentChannel,
            Optional<List<Tag>> tags,
            Map<String, Object> additionalProperties) {
        this.bic = bic;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.country = country;
        this.iban = iban;
        this.accountBalance = accountBalance;
        this.name = name;
        this.emailId = emailId;
        this.bankBranchCode = bankBranchCode;
        this.paymentChannel = paymentChannel;
        this.tags = tags;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Identifier for the bank. Can be routing number, BIK number, SWIFT code, BIC number etc.
     */
    @JsonProperty("BIC")
    public Optional<String> getBic() {
        return bic;
    }

    /**
     * @return Name of the bank
     */
    @JsonProperty("bankName")
    public Optional<String> getBankName() {
        return bankName;
    }

    @JsonProperty("bankAddress")
    public Optional<Address> getBankAddress() {
        return bankAddress;
    }

    @JsonProperty("country")
    public Optional<CountryCode> getCountry() {
        return country;
    }

    /**
     * @return Account number of the user. Can be account number, IBAN number etc.
     */
    @JsonProperty("IBAN")
    public Optional<String> getIban() {
        return iban;
    }

    @JsonProperty("accountBalance")
    public Optional<Amount> getAccountBalance() {
        return accountBalance;
    }

    /**
     * @return Name of the bank account holder
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("emailId")
    public Optional<String> getEmailId() {
        return emailId;
    }

    /**
     * @return Branch code of the bank. In some countries, this can be the same as the bank's SWIFT code
     */
    @JsonProperty("bankBranchCode")
    public Optional<String> getBankBranchCode() {
        return bankBranchCode;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof IbanDetails && equalTo((IbanDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(IbanDetails other) {
        return bic.equals(other.bic)
                && bankName.equals(other.bankName)
                && bankAddress.equals(other.bankAddress)
                && country.equals(other.country)
                && iban.equals(other.iban)
                && accountBalance.equals(other.accountBalance)
                && name.equals(other.name)
                && emailId.equals(other.emailId)
                && bankBranchCode.equals(other.bankBranchCode)
                && paymentChannel.equals(other.paymentChannel)
                && tags.equals(other.tags);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.bic,
                this.bankName,
                this.bankAddress,
                this.country,
                this.iban,
                this.accountBalance,
                this.name,
                this.emailId,
                this.bankBranchCode,
                this.paymentChannel,
                this.tags);
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
        private Optional<String> bic = Optional.empty();

        private Optional<String> bankName = Optional.empty();

        private Optional<Address> bankAddress = Optional.empty();

        private Optional<CountryCode> country = Optional.empty();

        private Optional<String> iban = Optional.empty();

        private Optional<Amount> accountBalance = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> emailId = Optional.empty();

        private Optional<String> bankBranchCode = Optional.empty();

        private Optional<String> paymentChannel = Optional.empty();

        private Optional<List<Tag>> tags = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(IbanDetails other) {
            bic(other.getBic());
            bankName(other.getBankName());
            bankAddress(other.getBankAddress());
            country(other.getCountry());
            iban(other.getIban());
            accountBalance(other.getAccountBalance());
            name(other.getName());
            emailId(other.getEmailId());
            bankBranchCode(other.getBankBranchCode());
            paymentChannel(other.getPaymentChannel());
            tags(other.getTags());
            return this;
        }

        @JsonSetter(value = "BIC", nulls = Nulls.SKIP)
        public Builder bic(Optional<String> bic) {
            this.bic = bic;
            return this;
        }

        public Builder bic(String bic) {
            this.bic = Optional.ofNullable(bic);
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

        @JsonSetter(value = "bankAddress", nulls = Nulls.SKIP)
        public Builder bankAddress(Optional<Address> bankAddress) {
            this.bankAddress = bankAddress;
            return this;
        }

        public Builder bankAddress(Address bankAddress) {
            this.bankAddress = Optional.ofNullable(bankAddress);
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

        @JsonSetter(value = "IBAN", nulls = Nulls.SKIP)
        public Builder iban(Optional<String> iban) {
            this.iban = iban;
            return this;
        }

        public Builder iban(String iban) {
            this.iban = Optional.ofNullable(iban);
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

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
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

        @JsonSetter(value = "bankBranchCode", nulls = Nulls.SKIP)
        public Builder bankBranchCode(Optional<String> bankBranchCode) {
            this.bankBranchCode = bankBranchCode;
            return this;
        }

        public Builder bankBranchCode(String bankBranchCode) {
            this.bankBranchCode = Optional.ofNullable(bankBranchCode);
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

        public IbanDetails build() {
            return new IbanDetails(
                    bic,
                    bankName,
                    bankAddress,
                    country,
                    iban,
                    accountBalance,
                    name,
                    emailId,
                    bankBranchCode,
                    paymentChannel,
                    tags,
                    additionalProperties);
        }
    }
}

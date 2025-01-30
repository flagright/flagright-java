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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UpiDetails.Builder.class)
public final class UpiDetails {
    private final String upiId;

    private final Optional<String> bankProvider;

    private final Optional<String> interfaceProvider;

    private final Optional<String> name;

    private final Optional<String> emailId;

    private final Optional<List<Tag>> tags;

    private final Map<String, Object> additionalProperties;

    private UpiDetails(
            String upiId,
            Optional<String> bankProvider,
            Optional<String> interfaceProvider,
            Optional<String> name,
            Optional<String> emailId,
            Optional<List<Tag>> tags,
            Map<String, Object> additionalProperties) {
        this.upiId = upiId;
        this.bankProvider = bankProvider;
        this.interfaceProvider = interfaceProvider;
        this.name = name;
        this.emailId = emailId;
        this.tags = tags;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return UPI Id number
     */
    @JsonProperty("upiID")
    public String getUpiId() {
        return upiId;
    }

    /**
     * @return Bank provider name
     */
    @JsonProperty("bankProvider")
    public Optional<String> getBankProvider() {
        return bankProvider;
    }

    /**
     * @return Interface provider name
     */
    @JsonProperty("interfaceProvider")
    public Optional<String> getInterfaceProvider() {
        return interfaceProvider;
    }

    /**
     * @return Name of the account holder
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
     * @return Additional information that can be added via tags
     */
    @JsonProperty("tags")
    public Optional<List<Tag>> getTags() {
        return tags;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpiDetails && equalTo((UpiDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpiDetails other) {
        return upiId.equals(other.upiId)
                && bankProvider.equals(other.bankProvider)
                && interfaceProvider.equals(other.interfaceProvider)
                && name.equals(other.name)
                && emailId.equals(other.emailId)
                && tags.equals(other.tags);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.upiId, this.bankProvider, this.interfaceProvider, this.name, this.emailId, this.tags);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UpiIdStage builder() {
        return new Builder();
    }

    public interface UpiIdStage {
        _FinalStage upiId(@NotNull String upiId);

        Builder from(UpiDetails other);
    }

    public interface _FinalStage {
        UpiDetails build();

        _FinalStage bankProvider(Optional<String> bankProvider);

        _FinalStage bankProvider(String bankProvider);

        _FinalStage interfaceProvider(Optional<String> interfaceProvider);

        _FinalStage interfaceProvider(String interfaceProvider);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage emailId(Optional<String> emailId);

        _FinalStage emailId(String emailId);

        _FinalStage tags(Optional<List<Tag>> tags);

        _FinalStage tags(List<Tag> tags);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UpiIdStage, _FinalStage {
        private String upiId;

        private Optional<List<Tag>> tags = Optional.empty();

        private Optional<String> emailId = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> interfaceProvider = Optional.empty();

        private Optional<String> bankProvider = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UpiDetails other) {
            upiId(other.getUpiId());
            bankProvider(other.getBankProvider());
            interfaceProvider(other.getInterfaceProvider());
            name(other.getName());
            emailId(other.getEmailId());
            tags(other.getTags());
            return this;
        }

        /**
         * <p>UPI Id number</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("upiID")
        public _FinalStage upiId(@NotNull String upiId) {
            this.upiId = Objects.requireNonNull(upiId, "upiId must not be null");
            return this;
        }

        /**
         * <p>Additional information that can be added via tags</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage tags(List<Tag> tags) {
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "tags", nulls = Nulls.SKIP)
        public _FinalStage tags(Optional<List<Tag>> tags) {
            this.tags = tags;
            return this;
        }

        @java.lang.Override
        public _FinalStage emailId(String emailId) {
            this.emailId = Optional.ofNullable(emailId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "emailId", nulls = Nulls.SKIP)
        public _FinalStage emailId(Optional<String> emailId) {
            this.emailId = emailId;
            return this;
        }

        /**
         * <p>Name of the account holder</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Interface provider name</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage interfaceProvider(String interfaceProvider) {
            this.interfaceProvider = Optional.ofNullable(interfaceProvider);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "interfaceProvider", nulls = Nulls.SKIP)
        public _FinalStage interfaceProvider(Optional<String> interfaceProvider) {
            this.interfaceProvider = interfaceProvider;
            return this;
        }

        /**
         * <p>Bank provider name</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage bankProvider(String bankProvider) {
            this.bankProvider = Optional.ofNullable(bankProvider);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "bankProvider", nulls = Nulls.SKIP)
        public _FinalStage bankProvider(Optional<String> bankProvider) {
            this.bankProvider = bankProvider;
            return this;
        }

        @java.lang.Override
        public UpiDetails build() {
            return new UpiDetails(upiId, bankProvider, interfaceProvider, name, emailId, tags, additionalProperties);
        }
    }
}

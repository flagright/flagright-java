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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CardMerchantDetails.Builder.class)
public final class CardMerchantDetails {
    private final Optional<String> id;

    private final Optional<String> name;

    private final Optional<String> category;

    private final Optional<String> mcc;

    private final Optional<String> city;

    private final Optional<CountryCode> country;

    private final Optional<String> state;

    private final Optional<String> postCode;

    private final Map<String, Object> additionalProperties;

    private CardMerchantDetails(
            Optional<String> id,
            Optional<String> name,
            Optional<String> category,
            Optional<String> mcc,
            Optional<String> city,
            Optional<CountryCode> country,
            Optional<String> state,
            Optional<String> postCode,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.mcc = mcc;
        this.city = city;
        this.country = country;
        this.state = state;
        this.postCode = postCode;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("category")
    public Optional<String> getCategory() {
        return category;
    }

    @JsonProperty("MCC")
    public Optional<String> getMcc() {
        return mcc;
    }

    @JsonProperty("city")
    public Optional<String> getCity() {
        return city;
    }

    @JsonProperty("country")
    public Optional<CountryCode> getCountry() {
        return country;
    }

    @JsonProperty("state")
    public Optional<String> getState() {
        return state;
    }

    @JsonProperty("postCode")
    public Optional<String> getPostCode() {
        return postCode;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CardMerchantDetails && equalTo((CardMerchantDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CardMerchantDetails other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && category.equals(other.category)
                && mcc.equals(other.mcc)
                && city.equals(other.city)
                && country.equals(other.country)
                && state.equals(other.state)
                && postCode.equals(other.postCode);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.name, this.category, this.mcc, this.city, this.country, this.state, this.postCode);
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
        private Optional<String> id = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> category = Optional.empty();

        private Optional<String> mcc = Optional.empty();

        private Optional<String> city = Optional.empty();

        private Optional<CountryCode> country = Optional.empty();

        private Optional<String> state = Optional.empty();

        private Optional<String> postCode = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CardMerchantDetails other) {
            id(other.getId());
            name(other.getName());
            category(other.getCategory());
            mcc(other.getMcc());
            city(other.getCity());
            country(other.getCountry());
            state(other.getState());
            postCode(other.getPostCode());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.ofNullable(id);
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

        @JsonSetter(value = "category", nulls = Nulls.SKIP)
        public Builder category(Optional<String> category) {
            this.category = category;
            return this;
        }

        public Builder category(String category) {
            this.category = Optional.ofNullable(category);
            return this;
        }

        @JsonSetter(value = "MCC", nulls = Nulls.SKIP)
        public Builder mcc(Optional<String> mcc) {
            this.mcc = mcc;
            return this;
        }

        public Builder mcc(String mcc) {
            this.mcc = Optional.ofNullable(mcc);
            return this;
        }

        @JsonSetter(value = "city", nulls = Nulls.SKIP)
        public Builder city(Optional<String> city) {
            this.city = city;
            return this;
        }

        public Builder city(String city) {
            this.city = Optional.ofNullable(city);
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

        @JsonSetter(value = "state", nulls = Nulls.SKIP)
        public Builder state(Optional<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(String state) {
            this.state = Optional.ofNullable(state);
            return this;
        }

        @JsonSetter(value = "postCode", nulls = Nulls.SKIP)
        public Builder postCode(Optional<String> postCode) {
            this.postCode = postCode;
            return this;
        }

        public Builder postCode(String postCode) {
            this.postCode = Optional.ofNullable(postCode);
            return this;
        }

        public CardMerchantDetails build() {
            return new CardMerchantDetails(
                    id, name, category, mcc, city, country, state, postCode, additionalProperties);
        }
    }
}

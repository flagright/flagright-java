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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UserStateDetails.Builder.class)
public final class UserStateDetails {
    private final Optional<String> reason;

    private final UserState state;

    private final Map<String, Object> additionalProperties;

    private UserStateDetails(Optional<String> reason, UserState state, Map<String, Object> additionalProperties) {
        this.reason = reason;
        this.state = state;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("reason")
    public Optional<String> getReason() {
        return reason;
    }

    @JsonProperty("state")
    public UserState getState() {
        return state;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserStateDetails && equalTo((UserStateDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserStateDetails other) {
        return reason.equals(other.reason) && state.equals(other.state);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.reason, this.state);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StateStage builder() {
        return new Builder();
    }

    public interface StateStage {
        _FinalStage state(@NotNull UserState state);

        Builder from(UserStateDetails other);
    }

    public interface _FinalStage {
        UserStateDetails build();

        _FinalStage reason(Optional<String> reason);

        _FinalStage reason(String reason);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StateStage, _FinalStage {
        private UserState state;

        private Optional<String> reason = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserStateDetails other) {
            reason(other.getReason());
            state(other.getState());
            return this;
        }

        @java.lang.Override
        @JsonSetter("state")
        public _FinalStage state(@NotNull UserState state) {
            this.state = Objects.requireNonNull(state, "state must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage reason(String reason) {
            this.reason = Optional.ofNullable(reason);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "reason", nulls = Nulls.SKIP)
        public _FinalStage reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        @java.lang.Override
        public UserStateDetails build() {
            return new UserStateDetails(reason, state, additionalProperties);
        }
    }
}

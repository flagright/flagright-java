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
@JsonDeserialize(builder = ListItem.Builder.class)
public final class ListItem {
    private final String key;

    private final Optional<Map<String, Object>> metadata;

    private final Optional<Double> ttl;

    private final Map<String, Object> additionalProperties;

    private ListItem(
            String key,
            Optional<Map<String, Object>> metadata,
            Optional<Double> ttl,
            Map<String, Object> additionalProperties) {
        this.key = key;
        this.metadata = metadata;
        this.ttl = ttl;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("metadata")
    public Optional<Map<String, Object>> getMetadata() {
        return metadata;
    }

    @JsonProperty("ttl")
    public Optional<Double> getTtl() {
        return ttl;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListItem && equalTo((ListItem) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListItem other) {
        return key.equals(other.key) && metadata.equals(other.metadata) && ttl.equals(other.ttl);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.key, this.metadata, this.ttl);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        _FinalStage key(@NotNull String key);

        Builder from(ListItem other);
    }

    public interface _FinalStage {
        ListItem build();

        _FinalStage metadata(Optional<Map<String, Object>> metadata);

        _FinalStage metadata(Map<String, Object> metadata);

        _FinalStage ttl(Optional<Double> ttl);

        _FinalStage ttl(Double ttl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, _FinalStage {
        private String key;

        private Optional<Double> ttl = Optional.empty();

        private Optional<Map<String, Object>> metadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ListItem other) {
            key(other.getKey());
            metadata(other.getMetadata());
            ttl(other.getTtl());
            return this;
        }

        @java.lang.Override
        @JsonSetter("key")
        public _FinalStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage ttl(Double ttl) {
            this.ttl = Optional.ofNullable(ttl);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ttl", nulls = Nulls.SKIP)
        public _FinalStage ttl(Optional<Double> ttl) {
            this.ttl = ttl;
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public ListItem build() {
            return new ListItem(key, metadata, ttl, additionalProperties);
        }
    }
}

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flagright.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = WebhookEvent.Builder.class)
public final class WebhookEvent {
    private final String id;

    private final WebhookEventTriggeredBy triggeredBy;

    private final double createdTimestamp;

    private final WebhookEventType type;

    private final WebhookEventData data;

    private final Map<String, Object> additionalProperties;

    private WebhookEvent(
            String id,
            WebhookEventTriggeredBy triggeredBy,
            double createdTimestamp,
            WebhookEventType type,
            WebhookEventData data,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.triggeredBy = triggeredBy;
        this.createdTimestamp = createdTimestamp;
        this.type = type;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Unique identifier for the event
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Event triggered by a user or system
     */
    @JsonProperty("triggeredBy")
    public WebhookEventTriggeredBy getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * @return Time at which the event was created. Measured in ms since the Unix epoch.
     */
    @JsonProperty("createdTimestamp")
    public double getCreatedTimestamp() {
        return createdTimestamp;
    }

    @JsonProperty("type")
    public WebhookEventType getType() {
        return type;
    }

    @JsonProperty("data")
    public WebhookEventData getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhookEvent && equalTo((WebhookEvent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WebhookEvent other) {
        return id.equals(other.id)
                && triggeredBy.equals(other.triggeredBy)
                && createdTimestamp == other.createdTimestamp
                && type.equals(other.type)
                && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.triggeredBy, this.createdTimestamp, this.type, this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        TriggeredByStage id(@NotNull String id);

        Builder from(WebhookEvent other);
    }

    public interface TriggeredByStage {
        CreatedTimestampStage triggeredBy(@NotNull WebhookEventTriggeredBy triggeredBy);
    }

    public interface CreatedTimestampStage {
        TypeStage createdTimestamp(double createdTimestamp);
    }

    public interface TypeStage {
        DataStage type(@NotNull WebhookEventType type);
    }

    public interface DataStage {
        _FinalStage data(@NotNull WebhookEventData data);
    }

    public interface _FinalStage {
        WebhookEvent build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, TriggeredByStage, CreatedTimestampStage, TypeStage, DataStage, _FinalStage {
        private String id;

        private WebhookEventTriggeredBy triggeredBy;

        private double createdTimestamp;

        private WebhookEventType type;

        private WebhookEventData data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(WebhookEvent other) {
            id(other.getId());
            triggeredBy(other.getTriggeredBy());
            createdTimestamp(other.getCreatedTimestamp());
            type(other.getType());
            data(other.getData());
            return this;
        }

        /**
         * <p>Unique identifier for the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public TriggeredByStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>Event triggered by a user or system</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("triggeredBy")
        public CreatedTimestampStage triggeredBy(@NotNull WebhookEventTriggeredBy triggeredBy) {
            this.triggeredBy = Objects.requireNonNull(triggeredBy, "triggeredBy must not be null");
            return this;
        }

        /**
         * <p>Time at which the event was created. Measured in ms since the Unix epoch.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdTimestamp")
        public TypeStage createdTimestamp(double createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public DataStage type(@NotNull WebhookEventType type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("data")
        public _FinalStage data(@NotNull WebhookEventData data) {
            this.data = Objects.requireNonNull(data, "data must not be null");
            return this;
        }

        @java.lang.Override
        public WebhookEvent build() {
            return new WebhookEvent(id, triggeredBy, createdTimestamp, type, data, additionalProperties);
        }
    }
}

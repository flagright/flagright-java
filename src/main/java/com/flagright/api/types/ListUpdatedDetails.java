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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ListUpdatedDetails.Builder.class)
public final class ListUpdatedDetails {
    private final String listId;

    private final ListUpdatedDetailsAction action;

    private final List<ListItem> items;

    private final Map<String, Object> additionalProperties;

    private ListUpdatedDetails(
            String listId,
            ListUpdatedDetailsAction action,
            List<ListItem> items,
            Map<String, Object> additionalProperties) {
        this.listId = listId;
        this.action = action;
        this.items = items;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("listId")
    public String getListId() {
        return listId;
    }

    @JsonProperty("action")
    public ListUpdatedDetailsAction getAction() {
        return action;
    }

    @JsonProperty("items")
    public List<ListItem> getItems() {
        return items;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListUpdatedDetails && equalTo((ListUpdatedDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListUpdatedDetails other) {
        return listId.equals(other.listId) && action.equals(other.action) && items.equals(other.items);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.listId, this.action, this.items);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ListIdStage builder() {
        return new Builder();
    }

    public interface ListIdStage {
        ActionStage listId(@NotNull String listId);

        Builder from(ListUpdatedDetails other);
    }

    public interface ActionStage {
        _FinalStage action(@NotNull ListUpdatedDetailsAction action);
    }

    public interface _FinalStage {
        ListUpdatedDetails build();

        _FinalStage items(List<ListItem> items);

        _FinalStage addItems(ListItem items);

        _FinalStage addAllItems(List<ListItem> items);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ListIdStage, ActionStage, _FinalStage {
        private String listId;

        private ListUpdatedDetailsAction action;

        private List<ListItem> items = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ListUpdatedDetails other) {
            listId(other.getListId());
            action(other.getAction());
            items(other.getItems());
            return this;
        }

        @java.lang.Override
        @JsonSetter("listId")
        public ActionStage listId(@NotNull String listId) {
            this.listId = Objects.requireNonNull(listId, "listId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("action")
        public _FinalStage action(@NotNull ListUpdatedDetailsAction action) {
            this.action = Objects.requireNonNull(action, "action must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllItems(List<ListItem> items) {
            this.items.addAll(items);
            return this;
        }

        @java.lang.Override
        public _FinalStage addItems(ListItem items) {
            this.items.add(items);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "items", nulls = Nulls.SKIP)
        public _FinalStage items(List<ListItem> items) {
            this.items.clear();
            this.items.addAll(items);
            return this;
        }

        @java.lang.Override
        public ListUpdatedDetails build() {
            return new ListUpdatedDetails(listId, action, items, additionalProperties);
        }
    }
}

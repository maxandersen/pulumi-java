// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.outputs;

import com.pulumi.awsnative.frauddetector.outputs.EventTypeEntityType;
import com.pulumi.awsnative.frauddetector.outputs.EventTypeEventVariable;
import com.pulumi.awsnative.frauddetector.outputs.EventTypeLabel;
import com.pulumi.awsnative.frauddetector.outputs.EventTypeTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventTypeResult {
    /**
     * @return The ARN of the event type.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The time when the event type was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * @return The description of the event type.
     * 
     */
    private final @Nullable String description;
    private final @Nullable List<EventTypeEntityType> entityTypes;
    private final @Nullable List<EventTypeEventVariable> eventVariables;
    private final @Nullable List<EventTypeLabel> labels;
    /**
     * @return The time when the event type was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * @return Tags associated with this event type.
     * 
     */
    private final @Nullable List<EventTypeTag> tags;

    @CustomType.Constructor
    private GetEventTypeResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("entityTypes") @Nullable List<EventTypeEntityType> entityTypes,
        @CustomType.Parameter("eventVariables") @Nullable List<EventTypeEventVariable> eventVariables,
        @CustomType.Parameter("labels") @Nullable List<EventTypeLabel> labels,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("tags") @Nullable List<EventTypeTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.entityTypes = entityTypes;
        this.eventVariables = eventVariables;
        this.labels = labels;
        this.lastUpdatedTime = lastUpdatedTime;
        this.tags = tags;
    }

    /**
     * @return The ARN of the event type.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The time when the event type was created.
     * 
     */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * @return The description of the event type.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public List<EventTypeEntityType> entityTypes() {
        return this.entityTypes == null ? List.of() : this.entityTypes;
    }
    public List<EventTypeEventVariable> eventVariables() {
        return this.eventVariables == null ? List.of() : this.eventVariables;
    }
    public List<EventTypeLabel> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * @return The time when the event type was last updated.
     * 
     */
    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * @return Tags associated with this event type.
     * 
     */
    public List<EventTypeTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable List<EventTypeEntityType> entityTypes;
        private @Nullable List<EventTypeEventVariable> eventVariables;
        private @Nullable List<EventTypeLabel> labels;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<EventTypeTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.entityTypes = defaults.entityTypes;
    	      this.eventVariables = defaults.eventVariables;
    	      this.labels = defaults.labels;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder entityTypes(@Nullable List<EventTypeEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }
        public Builder entityTypes(EventTypeEntityType... entityTypes) {
            return entityTypes(List.of(entityTypes));
        }
        public Builder eventVariables(@Nullable List<EventTypeEventVariable> eventVariables) {
            this.eventVariables = eventVariables;
            return this;
        }
        public Builder eventVariables(EventTypeEventVariable... eventVariables) {
            return eventVariables(List.of(eventVariables));
        }
        public Builder labels(@Nullable List<EventTypeLabel> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(EventTypeLabel... labels) {
            return labels(List.of(labels));
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder tags(@Nullable List<EventTypeTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(EventTypeTag... tags) {
            return tags(List.of(tags));
        }        public GetEventTypeResult build() {
            return new GetEventTypeResult(arn, createdTime, description, entityTypes, eventVariables, labels, lastUpdatedTime, tags);
        }
    }
}

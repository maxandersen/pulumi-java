// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerEventResponse {
    /**
     * @return The count of the event.
     * 
     */
    private final @Nullable Integer count;
    /**
     * @return Date/time of the first event.
     * 
     */
    private final @Nullable String firstTimestamp;
    /**
     * @return Date/time of the last event.
     * 
     */
    private final @Nullable String lastTimestamp;
    /**
     * @return The event message
     * 
     */
    private final @Nullable String message;
    /**
     * @return The name of the container event.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The event type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ContainerEventResponse(
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("firstTimestamp") @Nullable String firstTimestamp,
        @CustomType.Parameter("lastTimestamp") @Nullable String lastTimestamp,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.count = count;
        this.firstTimestamp = firstTimestamp;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The count of the event.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Date/time of the first event.
     * 
     */
    public Optional<String> firstTimestamp() {
        return Optional.ofNullable(this.firstTimestamp);
    }
    /**
     * @return Date/time of the last event.
     * 
     */
    public Optional<String> lastTimestamp() {
        return Optional.ofNullable(this.lastTimestamp);
    }
    /**
     * @return The event message
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return The name of the container event.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The event type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String firstTimestamp;
        private @Nullable String lastTimestamp;
        private @Nullable String message;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerEventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder firstTimestamp(@Nullable String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public Builder lastTimestamp(@Nullable String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ContainerEventResponse build() {
            return new ContainerEventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveEventInputTrackSelectionResponse {
    /**
     * Comparing operation. This property is reserved for future use, any value set on this property will be ignored.
     * 
     */
    private final @Nullable String operation;
    /**
     * Property name to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
     */
    private final @Nullable String property;
    /**
     * Property value to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private LiveEventInputTrackSelectionResponse(
        @CustomType.Parameter("operation") @Nullable String operation,
        @CustomType.Parameter("property") @Nullable String property,
        @CustomType.Parameter("value") @Nullable String value) {
        this.operation = operation;
        this.property = property;
        this.value = value;
    }

    /**
     * Comparing operation. This property is reserved for future use, any value set on this property will be ignored.
     * 
    */
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }
    /**
     * Property name to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
    */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }
    /**
     * Property value to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventInputTrackSelectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operation;
        private @Nullable String property;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventInputTrackSelectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        public Builder property(@Nullable String property) {
            this.property = property;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public LiveEventInputTrackSelectionResponse build() {
            return new LiveEventInputTrackSelectionResponse(operation, property, value);
        }
    }
}

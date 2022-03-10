// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StatusCause {
    /**
     * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   "name" - the field "name" on the current resource
     *   "items[0].name" - the field "name" on the first array entry in "items"
     * 
     */
    private final @Nullable String field;
    /**
     * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    private final @Nullable String message;
    /**
     * A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    private final @Nullable String reason;

    @OutputCustomType.Constructor
    private StatusCause(
        @OutputCustomType.Parameter("field") @Nullable String field,
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("reason") @Nullable String reason) {
        this.field = field;
        this.message = message;
        this.reason = reason;
    }

    /**
     * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   "name" - the field "name" on the current resource
     *   "items[0].name" - the field "name" on the first array entry in "items"
     * 
    */
    public Optional<String> getField() {
        return Optional.ofNullable(this.field);
    }
    /**
     * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
    */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCause defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String field;
        private @Nullable String message;
        private @Nullable String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCause defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder setField(@Nullable String field) {
            this.field = field;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public StatusCause build() {
            return new StatusCause(field, message, reason);
        }
    }
}

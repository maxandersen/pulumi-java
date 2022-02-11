// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StatusCauseArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusCauseArgs Empty = new StatusCauseArgs();

    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public StatusCauseArgs(
        @Nullable Input<String> field,
        @Nullable Input<String> message,
        @Nullable Input<String> reason) {
        this.field = field;
        this.message = message;
        this.reason = reason;
    }

    private StatusCauseArgs() {
        this.field = Input.empty();
        this.message = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCauseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> field;
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCauseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public StatusCauseArgs build() {
            return new StatusCauseArgs(field, message, reason);
        }
    }
}

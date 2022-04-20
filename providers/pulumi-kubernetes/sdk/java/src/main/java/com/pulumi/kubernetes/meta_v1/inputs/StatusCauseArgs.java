// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 * 
 */
public final class StatusCauseArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatusCauseArgs Empty = new StatusCauseArgs();

    /**
     * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   &#34;name&#34; - the field &#34;name&#34; on the current resource
     *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
     * 
     */
    @Import(name="field")
      private final @Nullable Output<String> field;

    public Output<String> field() {
        return this.field == null ? Codegen.empty() : this.field;
    }

    /**
     * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    /**
     * A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> reason() {
        return this.reason == null ? Codegen.empty() : this.reason;
    }

    public StatusCauseArgs(
        @Nullable Output<String> field,
        @Nullable Output<String> message,
        @Nullable Output<String> reason) {
        this.field = field;
        this.message = message;
        this.reason = reason;
    }

    private StatusCauseArgs() {
        this.field = Codegen.empty();
        this.message = Codegen.empty();
        this.reason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCauseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> field;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCauseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder field(@Nullable Output<String> field) {
            this.field = field;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = Codegen.ofNullable(field);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Codegen.ofNullable(reason);
            return this;
        }        public StatusCauseArgs build() {
            return new StatusCauseArgs(field, message, reason);
        }
    }
}

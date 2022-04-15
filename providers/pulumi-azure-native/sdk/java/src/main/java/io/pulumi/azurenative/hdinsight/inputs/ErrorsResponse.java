// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The error message associated with the cluster creation.
 * 
 */
public final class ErrorsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorsResponse Empty = new ErrorsResponse();

    /**
     * The error code.
     * 
     */
    @Import(name="code")
      private final @Nullable String code;

    public Optional<String> code() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * The error message.
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> message() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    public ErrorsResponse(
        @Nullable String code,
        @Nullable String message) {
        this.code = code;
        this.message = message;
    }

    private ErrorsResponse() {
        this.code = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }        public ErrorsResponse build() {
            return new ErrorsResponse(code, message);
        }
    }
}

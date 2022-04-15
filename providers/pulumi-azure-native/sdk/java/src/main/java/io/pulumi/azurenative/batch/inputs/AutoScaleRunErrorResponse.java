// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScaleRunErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoScaleRunErrorResponse Empty = new AutoScaleRunErrorResponse();

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    @Import(name="details")
      private final @Nullable List<AutoScaleRunErrorResponse> details;

    public List<AutoScaleRunErrorResponse> details() {
        return this.details == null ? List.of() : this.details;
    }

    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    public AutoScaleRunErrorResponse(
        String code,
        @Nullable List<AutoScaleRunErrorResponse> details,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = details;
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private AutoScaleRunErrorResponse() {
        this.code = null;
        this.details = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleRunErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<AutoScaleRunErrorResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleRunErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder details(@Nullable List<AutoScaleRunErrorResponse> details) {
            this.details = details;
            return this;
        }
        public Builder details(AutoScaleRunErrorResponse... details) {
            return details(List.of(details));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public AutoScaleRunErrorResponse build() {
            return new AutoScaleRunErrorResponse(code, details, message);
        }
    }
}

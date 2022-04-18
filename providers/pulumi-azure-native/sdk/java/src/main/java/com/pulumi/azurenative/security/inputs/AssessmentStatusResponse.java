// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The result of the assessment
 * 
 */
public final class AssessmentStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssessmentStatusResponse Empty = new AssessmentStatusResponse();

    /**
     * Programmatic code for the cause of the assessment status
     * 
     */
    @Import(name="cause")
      private final @Nullable String cause;

    public Optional<String> cause() {
        return this.cause == null ? Optional.empty() : Optional.ofNullable(this.cause);
    }

    /**
     * Programmatic code for the status of the assessment
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    /**
     * Human readable description of the assessment status
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    public AssessmentStatusResponse(
        @Nullable String cause,
        String code,
        @Nullable String description) {
        this.cause = cause;
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.description = description;
    }

    private AssessmentStatusResponse() {
        this.cause = null;
        this.code = null;
        this.description = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cause;
        private String code;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.code = defaults.code;
    	      this.description = defaults.description;
        }

        public Builder cause(@Nullable String cause) {
            this.cause = cause;
            return this;
        }
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }        public AssessmentStatusResponse build() {
            return new AssessmentStatusResponse(cause, code, description);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Condition applicable to the resource, or to the job overall, that warrant customer attention.
 * 
 */
public final class DiagnosticConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiagnosticConditionResponse Empty = new DiagnosticConditionResponse();

    /**
     * The opaque diagnostic code.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    /**
     * The human-readable message describing the condition in detail. Localized in the Accept-Language of the client request.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    /**
     * The UTC timestamp of when the condition started. Customers should be able to find a corresponding event in the ops log around this time.
     * 
     */
    @Import(name="since", required=true)
      private final String since;

    public String since() {
        return this.since;
    }

    public DiagnosticConditionResponse(
        String code,
        String message,
        String since) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.since = Objects.requireNonNull(since, "expected parameter 'since' to be non-null");
    }

    private DiagnosticConditionResponse() {
        this.code = null;
        this.message = null;
        this.since = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;
        private String since;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.since = defaults.since;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder since(String since) {
            this.since = Objects.requireNonNull(since);
            return this;
        }        public DiagnosticConditionResponse build() {
            return new DiagnosticConditionResponse(code, message, since);
        }
    }
}

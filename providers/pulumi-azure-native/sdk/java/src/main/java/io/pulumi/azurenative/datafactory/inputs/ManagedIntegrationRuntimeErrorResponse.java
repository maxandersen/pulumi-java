// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Error definition for managed integration runtime.
 * 
 */
public final class ManagedIntegrationRuntimeErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeErrorResponse Empty = new ManagedIntegrationRuntimeErrorResponse();

    /**
     * Error code.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    /**
     * Error message.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    /**
     * Managed integration runtime error parameters.
     * 
     */
    @Import(name="parameters", required=true)
      private final List<String> parameters;

    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * The time when the error occurred.
     * 
     */
    @Import(name="time", required=true)
      private final String time;

    public String time() {
        return this.time;
    }

    public ManagedIntegrationRuntimeErrorResponse(
        String code,
        String message,
        List<String> parameters,
        String time) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private ManagedIntegrationRuntimeErrorResponse() {
        this.code = null;
        this.message = null;
        this.parameters = List.of();
        this.time = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;
        private List<String> parameters;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.parameters = defaults.parameters;
    	      this.time = defaults.time;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder parameters(List<String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public ManagedIntegrationRuntimeErrorResponse build() {
            return new ManagedIntegrationRuntimeErrorResponse(code, message, parameters, time);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Error definition for managed integration runtime.
 * 
 */
public final class ManagedIntegrationRuntimeErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeErrorResponse Empty = new ManagedIntegrationRuntimeErrorResponse();

    /**
     * Error code.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * Error message.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    /**
     * Managed integration runtime error parameters.
     * 
     */
    @Import(name="parameters", required=true)
    private List<String> parameters;

    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * The time when the error occurred.
     * 
     */
    @Import(name="time", required=true)
    private String time;

    public String time() {
        return this.time;
    }

    private ManagedIntegrationRuntimeErrorResponse() {}

    private ManagedIntegrationRuntimeErrorResponse(ManagedIntegrationRuntimeErrorResponse $) {
        this.code = $.code;
        this.message = $.message;
        this.parameters = $.parameters;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedIntegrationRuntimeErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedIntegrationRuntimeErrorResponse $;

        public Builder() {
            $ = new ManagedIntegrationRuntimeErrorResponse();
        }

        public Builder(ManagedIntegrationRuntimeErrorResponse defaults) {
            $ = new ManagedIntegrationRuntimeErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public Builder parameters(List<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder time(String time) {
            $.time = time;
            return this;
        }

        public ManagedIntegrationRuntimeErrorResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.time = Objects.requireNonNull($.time, "expected parameter 'time' to be non-null");
            return $;
        }
    }

}

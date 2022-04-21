// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.workflowexecutions_v1beta.inputs.StackTraceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Error describes why the execution was abnormally terminated.
 * 
 */
public final class ErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ErrorResponse Empty = new ErrorResponse();

    /**
     * Human-readable stack trace string.
     * 
     */
    @Import(name="context", required=true)
    private String context;

    public String context() {
        return this.context;
    }

    /**
     * Error message and data returned represented as a JSON string.
     * 
     */
    @Import(name="payload", required=true)
    private String payload;

    public String payload() {
        return this.payload;
    }

    /**
     * Stack trace with detailed information of where error was generated.
     * 
     */
    @Import(name="stackTrace", required=true)
    private StackTraceResponse stackTrace;

    public StackTraceResponse stackTrace() {
        return this.stackTrace;
    }

    private ErrorResponse() {}

    private ErrorResponse(ErrorResponse $) {
        this.context = $.context;
        this.payload = $.payload;
        this.stackTrace = $.stackTrace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorResponse $;

        public Builder() {
            $ = new ErrorResponse();
        }

        public Builder(ErrorResponse defaults) {
            $ = new ErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder context(String context) {
            $.context = context;
            return this;
        }

        public Builder payload(String payload) {
            $.payload = payload;
            return this;
        }

        public Builder stackTrace(StackTraceResponse stackTrace) {
            $.stackTrace = stackTrace;
            return this;
        }

        public ErrorResponse build() {
            $.context = Objects.requireNonNull($.context, "expected parameter 'context' to be non-null");
            $.payload = Objects.requireNonNull($.payload, "expected parameter 'payload' to be non-null");
            $.stackTrace = Objects.requireNonNull($.stackTrace, "expected parameter 'stackTrace' to be non-null");
            return $;
        }
    }

}

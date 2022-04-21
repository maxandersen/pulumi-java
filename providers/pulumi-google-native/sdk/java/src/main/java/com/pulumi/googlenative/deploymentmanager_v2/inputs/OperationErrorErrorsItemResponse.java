// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OperationErrorErrorsItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final OperationErrorErrorsItemResponse Empty = new OperationErrorErrorsItemResponse();

    /**
     * The error type identifier for this error.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * Indicates the field in the request that caused the error. This property is optional.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    /**
     * An optional, human-readable error message.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    private OperationErrorErrorsItemResponse() {}

    private OperationErrorErrorsItemResponse(OperationErrorErrorsItemResponse $) {
        this.code = $.code;
        this.location = $.location;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationErrorErrorsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationErrorErrorsItemResponse $;

        public Builder() {
            $ = new OperationErrorErrorsItemResponse();
        }

        public Builder(OperationErrorErrorsItemResponse defaults) {
            $ = new OperationErrorErrorsItemResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public OperationErrorErrorsItemResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}

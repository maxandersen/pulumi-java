// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Represent a user-facing Error.
 * 
 */
public final class ErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ErrorResponse Empty = new ErrorResponse();

    /**
     * Additional information about the error.
     * 
     */
    @Import(name="details", required=true)
    private Map<String,String> details;

    public Map<String,String> details() {
        return this.details;
    }

    /**
     * The time when the error occurred.
     * 
     */
    @Import(name="errorTime", required=true)
    private String errorTime;

    public String errorTime() {
        return this.errorTime;
    }

    /**
     * A unique identifier for this specific error, allowing it to be traced throughout the system in logs and API responses.
     * 
     */
    @Import(name="errorUuid", required=true)
    private String errorUuid;

    public String errorUuid() {
        return this.errorUuid;
    }

    /**
     * A message containing more information about the error that occurred.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    /**
     * A title that explains the reason for the error.
     * 
     */
    @Import(name="reason", required=true)
    private String reason;

    public String reason() {
        return this.reason;
    }

    private ErrorResponse() {}

    private ErrorResponse(ErrorResponse $) {
        this.details = $.details;
        this.errorTime = $.errorTime;
        this.errorUuid = $.errorUuid;
        this.message = $.message;
        this.reason = $.reason;
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

        public Builder details(Map<String,String> details) {
            $.details = details;
            return this;
        }

        public Builder errorTime(String errorTime) {
            $.errorTime = errorTime;
            return this;
        }

        public Builder errorUuid(String errorUuid) {
            $.errorUuid = errorUuid;
            return this;
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public Builder reason(String reason) {
            $.reason = reason;
            return this;
        }

        public ErrorResponse build() {
            $.details = Objects.requireNonNull($.details, "expected parameter 'details' to be non-null");
            $.errorTime = Objects.requireNonNull($.errorTime, "expected parameter 'errorTime' to be non-null");
            $.errorUuid = Objects.requireNonNull($.errorUuid, "expected parameter 'errorUuid' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.reason = Objects.requireNonNull($.reason, "expected parameter 'reason' to be non-null");
            return $;
        }
    }

}

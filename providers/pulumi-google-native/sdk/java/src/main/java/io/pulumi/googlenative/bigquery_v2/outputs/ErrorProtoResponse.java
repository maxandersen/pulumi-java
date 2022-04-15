// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ErrorProtoResponse {
    /**
     * Debugging information. This property is internal to Google and should not be used.
     * 
     */
    private final String debugInfo;
    /**
     * Specifies where the error occurred, if present.
     * 
     */
    private final String location;
    /**
     * A human-readable description of the error.
     * 
     */
    private final String message;
    /**
     * A short error code that summarizes the error.
     * 
     */
    private final String reason;

    @CustomType.Constructor
    private ErrorProtoResponse(
        @CustomType.Parameter("debugInfo") String debugInfo,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("reason") String reason) {
        this.debugInfo = debugInfo;
        this.location = location;
        this.message = message;
        this.reason = reason;
    }

    /**
     * Debugging information. This property is internal to Google and should not be used.
     * 
    */
    public String debugInfo() {
        return this.debugInfo;
    }
    /**
     * Specifies where the error occurred, if present.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * A human-readable description of the error.
     * 
    */
    public String message() {
        return this.message;
    }
    /**
     * A short error code that summarizes the error.
     * 
    */
    public String reason() {
        return this.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorProtoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String debugInfo;
        private String location;
        private String message;
        private String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorProtoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.debugInfo = defaults.debugInfo;
    	      this.location = defaults.location;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder debugInfo(String debugInfo) {
            this.debugInfo = Objects.requireNonNull(debugInfo);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }        public ErrorProtoResponse build() {
            return new ErrorProtoResponse(debugInfo, location, message, reason);
        }
    }
}

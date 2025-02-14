// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConditionResponse {
    /**
     * @return The issue requiring attention.
     * 
     */
    private final String message;
    /**
     * @return The time when the condition was raised.
     * 
     */
    private final String timestamp;

    @CustomType.Constructor
    private ConditionResponse(
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("timestamp") String timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    /**
     * @return The issue requiring attention.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The time when the condition was raised.
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.timestamp = defaults.timestamp;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }        public ConditionResponse build() {
            return new ConditionResponse(message, timestamp);
        }
    }
}

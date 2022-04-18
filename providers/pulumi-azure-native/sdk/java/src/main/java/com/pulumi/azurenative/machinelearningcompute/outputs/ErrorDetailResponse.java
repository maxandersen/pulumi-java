// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ErrorDetailResponse {
    /**
     * Error code.
     * 
     */
    private final String code;
    /**
     * Error message.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private ErrorDetailResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Error code.
     * 
    */
    public String code() {
        return this.code;
    }
    /**
     * Error message.
     * 
    */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public ErrorDetailResponse build() {
            return new ErrorDetailResponse(code, message);
        }
    }
}

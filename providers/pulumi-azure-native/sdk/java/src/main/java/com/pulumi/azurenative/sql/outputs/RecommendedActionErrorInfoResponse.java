// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RecommendedActionErrorInfoResponse {
    /**
     * @return Gets the reason why the recommended action was put to error state. e.g., DatabaseHasQdsOff, IndexAlreadyExists
     * 
     */
    private final String errorCode;
    /**
     * @return Gets whether the error could be ignored and recommended action could be retried. Possible values are: Yes/No
     * 
     */
    private final String isRetryable;

    @CustomType.Constructor
    private RecommendedActionErrorInfoResponse(
        @CustomType.Parameter("errorCode") String errorCode,
        @CustomType.Parameter("isRetryable") String isRetryable) {
        this.errorCode = errorCode;
        this.isRetryable = isRetryable;
    }

    /**
     * @return Gets the reason why the recommended action was put to error state. e.g., DatabaseHasQdsOff, IndexAlreadyExists
     * 
     */
    public String errorCode() {
        return this.errorCode;
    }
    /**
     * @return Gets whether the error could be ignored and recommended action could be retried. Possible values are: Yes/No
     * 
     */
    public String isRetryable() {
        return this.isRetryable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedActionErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String isRetryable;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedActionErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.isRetryable = defaults.isRetryable;
        }

        public Builder errorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        public Builder isRetryable(String isRetryable) {
            this.isRetryable = Objects.requireNonNull(isRetryable);
            return this;
        }        public RecommendedActionErrorInfoResponse build() {
            return new RecommendedActionErrorInfoResponse(errorCode, isRetryable);
        }
    }
}

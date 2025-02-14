// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RetryPolicyResponse {
    /**
     * @return The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * 
     */
    private final String maximumBackoff;
    /**
     * @return The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * 
     */
    private final String minimumBackoff;

    @CustomType.Constructor
    private RetryPolicyResponse(
        @CustomType.Parameter("maximumBackoff") String maximumBackoff,
        @CustomType.Parameter("minimumBackoff") String minimumBackoff) {
        this.maximumBackoff = maximumBackoff;
        this.minimumBackoff = minimumBackoff;
    }

    /**
     * @return The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * 
     */
    public String maximumBackoff() {
        return this.maximumBackoff;
    }
    /**
     * @return The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * 
     */
    public String minimumBackoff() {
        return this.minimumBackoff;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maximumBackoff;
        private String minimumBackoff;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumBackoff = defaults.maximumBackoff;
    	      this.minimumBackoff = defaults.minimumBackoff;
        }

        public Builder maximumBackoff(String maximumBackoff) {
            this.maximumBackoff = Objects.requireNonNull(maximumBackoff);
            return this;
        }
        public Builder minimumBackoff(String minimumBackoff) {
            this.minimumBackoff = Objects.requireNonNull(minimumBackoff);
            return this;
        }        public RetryPolicyResponse build() {
            return new RetryPolicyResponse(maximumBackoff, minimumBackoff);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WaitStepAttributesResponse {
    /**
     * @return The duration in ISO 8601 format of how long the wait should be.
     * 
     */
    private final String duration;

    @CustomType.Constructor
    private WaitStepAttributesResponse(@CustomType.Parameter("duration") String duration) {
        this.duration = duration;
    }

    /**
     * @return The duration in ISO 8601 format of how long the wait should be.
     * 
     */
    public String duration() {
        return this.duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitStepAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;

        public Builder() {
    	      // Empty
        }

        public Builder(WaitStepAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }        public WaitStepAttributesResponse build() {
            return new WaitStepAttributesResponse(duration);
        }
    }
}

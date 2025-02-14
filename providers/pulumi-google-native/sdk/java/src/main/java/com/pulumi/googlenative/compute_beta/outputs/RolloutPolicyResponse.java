// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RolloutPolicyResponse {
    /**
     * @return An optional RFC3339 timestamp on or after which the update is considered rolled out to any zone that is not explicitly stated.
     * 
     */
    private final String defaultRolloutTime;
    /**
     * @return Location based rollout policies to apply to the resource. Currently only zone names are supported and must be represented as valid URLs, like: zones/us-central1-a. The value expects an RFC3339 timestamp on or after which the update is considered rolled out to the specified location.
     * 
     */
    private final Map<String,String> locationRolloutPolicies;

    @CustomType.Constructor
    private RolloutPolicyResponse(
        @CustomType.Parameter("defaultRolloutTime") String defaultRolloutTime,
        @CustomType.Parameter("locationRolloutPolicies") Map<String,String> locationRolloutPolicies) {
        this.defaultRolloutTime = defaultRolloutTime;
        this.locationRolloutPolicies = locationRolloutPolicies;
    }

    /**
     * @return An optional RFC3339 timestamp on or after which the update is considered rolled out to any zone that is not explicitly stated.
     * 
     */
    public String defaultRolloutTime() {
        return this.defaultRolloutTime;
    }
    /**
     * @return Location based rollout policies to apply to the resource. Currently only zone names are supported and must be represented as valid URLs, like: zones/us-central1-a. The value expects an RFC3339 timestamp on or after which the update is considered rolled out to the specified location.
     * 
     */
    public Map<String,String> locationRolloutPolicies() {
        return this.locationRolloutPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultRolloutTime;
        private Map<String,String> locationRolloutPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRolloutTime = defaults.defaultRolloutTime;
    	      this.locationRolloutPolicies = defaults.locationRolloutPolicies;
        }

        public Builder defaultRolloutTime(String defaultRolloutTime) {
            this.defaultRolloutTime = Objects.requireNonNull(defaultRolloutTime);
            return this;
        }
        public Builder locationRolloutPolicies(Map<String,String> locationRolloutPolicies) {
            this.locationRolloutPolicies = Objects.requireNonNull(locationRolloutPolicies);
            return this;
        }        public RolloutPolicyResponse build() {
            return new RolloutPolicyResponse(defaultRolloutTime, locationRolloutPolicies);
        }
    }
}

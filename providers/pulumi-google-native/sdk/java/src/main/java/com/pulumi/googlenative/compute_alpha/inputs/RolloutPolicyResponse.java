// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A rollout policy configuration.
 * 
 */
public final class RolloutPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final RolloutPolicyResponse Empty = new RolloutPolicyResponse();

    /**
     * An optional RFC3339 timestamp on or after which the update is considered rolled out to any zone that is not explicitly stated.
     * 
     */
    @Import(name="defaultRolloutTime", required=true)
    private String defaultRolloutTime;

    public String defaultRolloutTime() {
        return this.defaultRolloutTime;
    }

    /**
     * Location based rollout policies to apply to the resource. Currently only zone names are supported and must be represented as valid URLs, like: zones/us-central1-a. The value expects an RFC3339 timestamp on or after which the update is considered rolled out to the specified location.
     * 
     */
    @Import(name="locationRolloutPolicies", required=true)
    private Map<String,String> locationRolloutPolicies;

    public Map<String,String> locationRolloutPolicies() {
        return this.locationRolloutPolicies;
    }

    private RolloutPolicyResponse() {}

    private RolloutPolicyResponse(RolloutPolicyResponse $) {
        this.defaultRolloutTime = $.defaultRolloutTime;
        this.locationRolloutPolicies = $.locationRolloutPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutPolicyResponse $;

        public Builder() {
            $ = new RolloutPolicyResponse();
        }

        public Builder(RolloutPolicyResponse defaults) {
            $ = new RolloutPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultRolloutTime(String defaultRolloutTime) {
            $.defaultRolloutTime = defaultRolloutTime;
            return this;
        }

        public Builder locationRolloutPolicies(Map<String,String> locationRolloutPolicies) {
            $.locationRolloutPolicies = locationRolloutPolicies;
            return this;
        }

        public RolloutPolicyResponse build() {
            $.defaultRolloutTime = Objects.requireNonNull($.defaultRolloutTime, "expected parameter 'defaultRolloutTime' to be non-null");
            $.locationRolloutPolicies = Objects.requireNonNull($.locationRolloutPolicies, "expected parameter 'locationRolloutPolicies' to be non-null");
            return $;
        }
    }

}

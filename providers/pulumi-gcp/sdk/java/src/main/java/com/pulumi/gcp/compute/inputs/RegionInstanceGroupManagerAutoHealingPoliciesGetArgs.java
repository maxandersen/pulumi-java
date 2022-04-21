// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RegionInstanceGroupManagerAutoHealingPoliciesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerAutoHealingPoliciesGetArgs Empty = new RegionInstanceGroupManagerAutoHealingPoliciesGetArgs();

    /**
     * The health check resource that signals autohealing.
     * 
     */
    @Import(name="healthCheck", required=true)
    private Output<String> healthCheck;

    public Output<String> healthCheck() {
        return this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before
     * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
     */
    @Import(name="initialDelaySec", required=true)
    private Output<Integer> initialDelaySec;

    public Output<Integer> initialDelaySec() {
        return this.initialDelaySec;
    }

    private RegionInstanceGroupManagerAutoHealingPoliciesGetArgs() {}

    private RegionInstanceGroupManagerAutoHealingPoliciesGetArgs(RegionInstanceGroupManagerAutoHealingPoliciesGetArgs $) {
        this.healthCheck = $.healthCheck;
        this.initialDelaySec = $.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceGroupManagerAutoHealingPoliciesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceGroupManagerAutoHealingPoliciesGetArgs $;

        public Builder() {
            $ = new RegionInstanceGroupManagerAutoHealingPoliciesGetArgs();
        }

        public Builder(RegionInstanceGroupManagerAutoHealingPoliciesGetArgs defaults) {
            $ = new RegionInstanceGroupManagerAutoHealingPoliciesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder healthCheck(Output<String> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(String healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        public Builder initialDelaySec(Output<Integer> initialDelaySec) {
            $.initialDelaySec = initialDelaySec;
            return this;
        }

        public Builder initialDelaySec(Integer initialDelaySec) {
            return initialDelaySec(Output.of(initialDelaySec));
        }

        public RegionInstanceGroupManagerAutoHealingPoliciesGetArgs build() {
            $.healthCheck = Objects.requireNonNull($.healthCheck, "expected parameter 'healthCheck' to be non-null");
            $.initialDelaySec = Objects.requireNonNull($.initialDelaySec, "expected parameter 'initialDelaySec' to be non-null");
            return $;
        }
    }

}

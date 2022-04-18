// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Message to configure the rollout at the zonal level for the OS policy assignment.
 * 
 */
public final class OSPolicyAssignmentRolloutResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyAssignmentRolloutResponse Empty = new OSPolicyAssignmentRolloutResponse();

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    @Import(name="disruptionBudget", required=true)
      private final FixedOrPercentResponse disruptionBudget;

    public FixedOrPercentResponse disruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    @Import(name="minWaitDuration", required=true)
      private final String minWaitDuration;

    public String minWaitDuration() {
        return this.minWaitDuration;
    }

    public OSPolicyAssignmentRolloutResponse(
        FixedOrPercentResponse disruptionBudget,
        String minWaitDuration) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
        this.minWaitDuration = Objects.requireNonNull(minWaitDuration, "expected parameter 'minWaitDuration' to be non-null");
    }

    private OSPolicyAssignmentRolloutResponse() {
        this.disruptionBudget = null;
        this.minWaitDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentRolloutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse disruptionBudget;
        private String minWaitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentRolloutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.minWaitDuration = defaults.minWaitDuration;
        }

        public Builder disruptionBudget(FixedOrPercentResponse disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }
        public Builder minWaitDuration(String minWaitDuration) {
            this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
            return this;
        }        public OSPolicyAssignmentRolloutResponse build() {
            return new OSPolicyAssignmentRolloutResponse(disruptionBudget, minWaitDuration);
        }
    }
}

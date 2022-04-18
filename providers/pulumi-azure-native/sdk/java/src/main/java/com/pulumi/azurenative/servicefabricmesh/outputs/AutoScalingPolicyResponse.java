// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.azurenative.servicefabricmesh.outputs.AddRemoveReplicaScalingMechanismResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.AverageLoadScalingTriggerResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AutoScalingPolicyResponse {
    /**
     * The mechanism that is used to scale when auto scaling operation is invoked.
     * 
     */
    private final AddRemoveReplicaScalingMechanismResponse mechanism;
    /**
     * The name of the auto scaling policy.
     * 
     */
    private final String name;
    /**
     * Determines when auto scaling operation will be invoked.
     * 
     */
    private final AverageLoadScalingTriggerResponse trigger;

    @CustomType.Constructor
    private AutoScalingPolicyResponse(
        @CustomType.Parameter("mechanism") AddRemoveReplicaScalingMechanismResponse mechanism,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("trigger") AverageLoadScalingTriggerResponse trigger) {
        this.mechanism = mechanism;
        this.name = name;
        this.trigger = trigger;
    }

    /**
     * The mechanism that is used to scale when auto scaling operation is invoked.
     * 
    */
    public AddRemoveReplicaScalingMechanismResponse mechanism() {
        return this.mechanism;
    }
    /**
     * The name of the auto scaling policy.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Determines when auto scaling operation will be invoked.
     * 
    */
    public AverageLoadScalingTriggerResponse trigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddRemoveReplicaScalingMechanismResponse mechanism;
        private String name;
        private AverageLoadScalingTriggerResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mechanism = defaults.mechanism;
    	      this.name = defaults.name;
    	      this.trigger = defaults.trigger;
        }

        public Builder mechanism(AddRemoveReplicaScalingMechanismResponse mechanism) {
            this.mechanism = Objects.requireNonNull(mechanism);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder trigger(AverageLoadScalingTriggerResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }        public AutoScalingPolicyResponse build() {
            return new AutoScalingPolicyResponse(mechanism, name, trigger);
        }
    }
}

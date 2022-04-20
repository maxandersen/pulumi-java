// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.InstanceGroupManagerAutoHealingPolicyUpdateInstances;
import com.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerAutoHealingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerAutoHealingPolicyArgs Empty = new InstanceGroupManagerAutoHealingPolicyArgs();

    /**
     * Restricts what triggers autohealing.
     * 
     */
    @Import(name="autoHealingTriggers")
      private final @Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers;

    public Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers() {
        return this.autoHealingTriggers == null ? Codegen.empty() : this.autoHealingTriggers;
    }

    /**
     * The URL for the health check that signals autohealing.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<String> healthCheck;

    public Output<String> healthCheck() {
        return this.healthCheck == null ? Codegen.empty() : this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    @Import(name="initialDelaySec")
      private final @Nullable Output<Integer> initialDelaySec;

    public Output<Integer> initialDelaySec() {
        return this.initialDelaySec == null ? Codegen.empty() : this.initialDelaySec;
    }

    /**
     * Maximum number of instances that can be unavailable when autohealing. When &#39;percent&#39; is used, the value is rounded if necessary. The instance is considered available if all of the following conditions are satisfied: 1. Instance&#39;s status is RUNNING. 2. Instance&#39;s currentAction is NONE (in particular its liveness health check result was observed to be HEALTHY at least once as it passed VERIFYING). 3. There is no outgoing action on an instance triggered by IGM. By default, number of concurrently autohealed instances is smaller than the managed instance group target size. However, if a zonal managed instance group has only one instance, or a regional managed instance group has only one instance per zone, autohealing will recreate these instances when they become unhealthy.
     * 
     */
    @Import(name="maxUnavailable")
      private final @Nullable Output<FixedOrPercentArgs> maxUnavailable;

    public Output<FixedOrPercentArgs> maxUnavailable() {
        return this.maxUnavailable == null ? Codegen.empty() : this.maxUnavailable;
    }

    @Import(name="updateInstances")
      private final @Nullable Output<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances;

    public Output<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances() {
        return this.updateInstances == null ? Codegen.empty() : this.updateInstances;
    }

    public InstanceGroupManagerAutoHealingPolicyArgs(
        @Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers,
        @Nullable Output<String> healthCheck,
        @Nullable Output<Integer> initialDelaySec,
        @Nullable Output<FixedOrPercentArgs> maxUnavailable,
        @Nullable Output<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances) {
        this.autoHealingTriggers = autoHealingTriggers;
        this.healthCheck = healthCheck;
        this.initialDelaySec = initialDelaySec;
        this.maxUnavailable = maxUnavailable;
        this.updateInstances = updateInstances;
    }

    private InstanceGroupManagerAutoHealingPolicyArgs() {
        this.autoHealingTriggers = Codegen.empty();
        this.healthCheck = Codegen.empty();
        this.initialDelaySec = Codegen.empty();
        this.maxUnavailable = Codegen.empty();
        this.updateInstances = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers;
        private @Nullable Output<String> healthCheck;
        private @Nullable Output<Integer> initialDelaySec;
        private @Nullable Output<FixedOrPercentArgs> maxUnavailable;
        private @Nullable Output<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingTriggers = defaults.autoHealingTriggers;
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.updateInstances = defaults.updateInstances;
        }

        public Builder autoHealingTriggers(@Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs> autoHealingTriggers) {
            this.autoHealingTriggers = autoHealingTriggers;
            return this;
        }
        public Builder autoHealingTriggers(@Nullable InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs autoHealingTriggers) {
            this.autoHealingTriggers = Codegen.ofNullable(autoHealingTriggers);
            return this;
        }
        public Builder healthCheck(@Nullable Output<String> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Builder healthCheck(@Nullable String healthCheck) {
            this.healthCheck = Codegen.ofNullable(healthCheck);
            return this;
        }
        public Builder initialDelaySec(@Nullable Output<Integer> initialDelaySec) {
            this.initialDelaySec = initialDelaySec;
            return this;
        }
        public Builder initialDelaySec(@Nullable Integer initialDelaySec) {
            this.initialDelaySec = Codegen.ofNullable(initialDelaySec);
            return this;
        }
        public Builder maxUnavailable(@Nullable Output<FixedOrPercentArgs> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailable(@Nullable FixedOrPercentArgs maxUnavailable) {
            this.maxUnavailable = Codegen.ofNullable(maxUnavailable);
            return this;
        }
        public Builder updateInstances(@Nullable Output<InstanceGroupManagerAutoHealingPolicyUpdateInstances> updateInstances) {
            this.updateInstances = updateInstances;
            return this;
        }
        public Builder updateInstances(@Nullable InstanceGroupManagerAutoHealingPolicyUpdateInstances updateInstances) {
            this.updateInstances = Codegen.ofNullable(updateInstances);
            return this;
        }        public InstanceGroupManagerAutoHealingPolicyArgs build() {
            return new InstanceGroupManagerAutoHealingPolicyArgs(autoHealingTriggers, healthCheck, initialDelaySec, maxUnavailable, updateInstances);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs Empty = new InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs();

    /**
     * If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
     * 
     */
    @Import(name="onHealthCheck")
    private @Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck> onHealthCheck;

    public Optional<Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck>> onHealthCheck() {
        return Optional.ofNullable(this.onHealthCheck);
    }

    private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs() {}

    private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs $) {
        this.onHealthCheck = $.onHealthCheck;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs $;

        public Builder() {
            $ = new InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs();
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs defaults) {
            $ = new InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs(Objects.requireNonNull(defaults));
        }

        public Builder onHealthCheck(@Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck> onHealthCheck) {
            $.onHealthCheck = onHealthCheck;
            return this;
        }

        public Builder onHealthCheck(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck onHealthCheck) {
            return onHealthCheck(Output.of(onHealthCheck));
        }

        public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs build() {
            return $;
        }
    }

}

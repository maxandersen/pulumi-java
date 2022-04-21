// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices;

import com.pulumi.azurenative.recoveryservices.inputs.CreateRecoveryPlanInputPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationRecoveryPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationRecoveryPlanArgs Empty = new ReplicationRecoveryPlanArgs();

    /**
     * Recovery plan creation properties.
     * 
     */
    @Import(name="properties", required=true)
    private Output<CreateRecoveryPlanInputPropertiesArgs> properties;

    public Output<CreateRecoveryPlanInputPropertiesArgs> properties() {
        return this.properties;
    }

    /**
     * Recovery plan name.
     * 
     */
    @Import(name="recoveryPlanName")
    private @Nullable Output<String> recoveryPlanName;

    public Optional<Output<String>> recoveryPlanName() {
        return Optional.ofNullable(this.recoveryPlanName);
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    private ReplicationRecoveryPlanArgs() {}

    private ReplicationRecoveryPlanArgs(ReplicationRecoveryPlanArgs $) {
        this.properties = $.properties;
        this.recoveryPlanName = $.recoveryPlanName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationRecoveryPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationRecoveryPlanArgs $;

        public Builder() {
            $ = new ReplicationRecoveryPlanArgs();
        }

        public Builder(ReplicationRecoveryPlanArgs defaults) {
            $ = new ReplicationRecoveryPlanArgs(Objects.requireNonNull(defaults));
        }

        public Builder properties(Output<CreateRecoveryPlanInputPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(CreateRecoveryPlanInputPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder recoveryPlanName(@Nullable Output<String> recoveryPlanName) {
            $.recoveryPlanName = recoveryPlanName;
            return this;
        }

        public Builder recoveryPlanName(String recoveryPlanName) {
            return recoveryPlanName(Output.of(recoveryPlanName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public ReplicationRecoveryPlanArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}

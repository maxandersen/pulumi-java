// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.azurenative.migrate.inputs.AvailabilitySetResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.DiskEncryptionSetResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.KeyVaultResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.LoadBalancerResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.MoveResourceDependencyOverrideArgs;
import com.pulumi.azurenative.migrate.inputs.NetworkInterfaceResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.NetworkSecurityGroupResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.PublicIPAddressResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.ResourceGroupResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.SqlDatabaseResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.SqlElasticPoolResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.SqlServerResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.VirtualMachineResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.VirtualNetworkResourceSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the move resource properties.
 * 
 */
public final class MoveResourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MoveResourcePropertiesArgs Empty = new MoveResourcePropertiesArgs();

    /**
     * Gets or sets the move resource dependencies overrides.
     * 
     */
    @Import(name="dependsOnOverrides")
    private @Nullable Output<List<MoveResourceDependencyOverrideArgs>> dependsOnOverrides;

    public Optional<Output<List<MoveResourceDependencyOverrideArgs>>> dependsOnOverrides() {
        return Optional.ofNullable(this.dependsOnOverrides);
    }

    /**
     * Gets or sets the existing target ARM Id of the resource.
     * 
     */
    @Import(name="existingTargetId")
    private @Nullable Output<String> existingTargetId;

    public Optional<Output<String>> existingTargetId() {
        return Optional.ofNullable(this.existingTargetId);
    }

    /**
     * Gets or sets the resource settings.
     * 
     */
    @Import(name="resourceSettings")
    private @Nullable Output<Object> resourceSettings;

    public Optional<Output<Object>> resourceSettings() {
        return Optional.ofNullable(this.resourceSettings);
    }

    /**
     * Gets or sets the Source ARM Id of the resource.
     * 
     */
    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    private MoveResourcePropertiesArgs() {}

    private MoveResourcePropertiesArgs(MoveResourcePropertiesArgs $) {
        this.dependsOnOverrides = $.dependsOnOverrides;
        this.existingTargetId = $.existingTargetId;
        this.resourceSettings = $.resourceSettings;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MoveResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoveResourcePropertiesArgs $;

        public Builder() {
            $ = new MoveResourcePropertiesArgs();
        }

        public Builder(MoveResourcePropertiesArgs defaults) {
            $ = new MoveResourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder dependsOnOverrides(@Nullable Output<List<MoveResourceDependencyOverrideArgs>> dependsOnOverrides) {
            $.dependsOnOverrides = dependsOnOverrides;
            return this;
        }

        public Builder dependsOnOverrides(List<MoveResourceDependencyOverrideArgs> dependsOnOverrides) {
            return dependsOnOverrides(Output.of(dependsOnOverrides));
        }

        public Builder dependsOnOverrides(MoveResourceDependencyOverrideArgs... dependsOnOverrides) {
            return dependsOnOverrides(List.of(dependsOnOverrides));
        }

        public Builder existingTargetId(@Nullable Output<String> existingTargetId) {
            $.existingTargetId = existingTargetId;
            return this;
        }

        public Builder existingTargetId(String existingTargetId) {
            return existingTargetId(Output.of(existingTargetId));
        }

        public Builder resourceSettings(@Nullable Output<Object> resourceSettings) {
            $.resourceSettings = resourceSettings;
            return this;
        }

        public Builder resourceSettings(Object resourceSettings) {
            return resourceSettings(Output.of(resourceSettings));
        }

        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public MoveResourcePropertiesArgs build() {
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}

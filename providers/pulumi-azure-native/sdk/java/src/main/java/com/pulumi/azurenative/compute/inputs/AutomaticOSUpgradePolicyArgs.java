// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration parameters used for performing automatic OS upgrade.
 * 
 */
public final class AutomaticOSUpgradePolicyArgs extends ResourceArgs {

    public static final AutomaticOSUpgradePolicyArgs Empty = new AutomaticOSUpgradePolicyArgs();

    /**
     * Whether OS image rollback feature should be disabled. Default value is false.
     * 
     */
    @Import(name="disableAutomaticRollback")
    private @Nullable Output<Boolean> disableAutomaticRollback;

    /**
     * @return Whether OS image rollback feature should be disabled. Default value is false.
     * 
     */
    public Optional<Output<Boolean>> disableAutomaticRollback() {
        return Optional.ofNullable(this.disableAutomaticRollback);
    }

    /**
     * Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is false. &lt;br&gt;&lt;br&gt; If this is set to true for Windows based scale sets, [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to true.
     * 
     */
    @Import(name="enableAutomaticOSUpgrade")
    private @Nullable Output<Boolean> enableAutomaticOSUpgrade;

    /**
     * @return Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is false. &lt;br&gt;&lt;br&gt; If this is set to true for Windows based scale sets, [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to true.
     * 
     */
    public Optional<Output<Boolean>> enableAutomaticOSUpgrade() {
        return Optional.ofNullable(this.enableAutomaticOSUpgrade);
    }

    private AutomaticOSUpgradePolicyArgs() {}

    private AutomaticOSUpgradePolicyArgs(AutomaticOSUpgradePolicyArgs $) {
        this.disableAutomaticRollback = $.disableAutomaticRollback;
        this.enableAutomaticOSUpgrade = $.enableAutomaticOSUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticOSUpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticOSUpgradePolicyArgs $;

        public Builder() {
            $ = new AutomaticOSUpgradePolicyArgs();
        }

        public Builder(AutomaticOSUpgradePolicyArgs defaults) {
            $ = new AutomaticOSUpgradePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableAutomaticRollback Whether OS image rollback feature should be disabled. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder disableAutomaticRollback(@Nullable Output<Boolean> disableAutomaticRollback) {
            $.disableAutomaticRollback = disableAutomaticRollback;
            return this;
        }

        /**
         * @param disableAutomaticRollback Whether OS image rollback feature should be disabled. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder disableAutomaticRollback(Boolean disableAutomaticRollback) {
            return disableAutomaticRollback(Output.of(disableAutomaticRollback));
        }

        /**
         * @param enableAutomaticOSUpgrade Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is false. &lt;br&gt;&lt;br&gt; If this is set to true for Windows based scale sets, [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to true.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticOSUpgrade(@Nullable Output<Boolean> enableAutomaticOSUpgrade) {
            $.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
            return this;
        }

        /**
         * @param enableAutomaticOSUpgrade Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is false. &lt;br&gt;&lt;br&gt; If this is set to true for Windows based scale sets, [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to true.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticOSUpgrade(Boolean enableAutomaticOSUpgrade) {
            return enableAutomaticOSUpgrade(Output.of(enableAutomaticOSUpgrade));
        }

        public AutomaticOSUpgradePolicyArgs build() {
            return $;
        }
    }

}

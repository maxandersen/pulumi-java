// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration parameters used for performing automatic OS upgrade.
 * 
 */
public final class AutomaticOSUpgradePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomaticOSUpgradePolicyResponse Empty = new AutomaticOSUpgradePolicyResponse();

    /**
     * Whether OS image rollback feature should be disabled. Default value is false.
     * 
     */
    @Import(name="disableAutomaticRollback")
      private final @Nullable Boolean disableAutomaticRollback;

    public Optional<Boolean> disableAutomaticRollback() {
        return this.disableAutomaticRollback == null ? Optional.empty() : Optional.ofNullable(this.disableAutomaticRollback);
    }

    /**
     * Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is false. <br><br> If this is set to true for Windows based scale sets, [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to true.
     * 
     */
    @Import(name="enableAutomaticOSUpgrade")
      private final @Nullable Boolean enableAutomaticOSUpgrade;

    public Optional<Boolean> enableAutomaticOSUpgrade() {
        return this.enableAutomaticOSUpgrade == null ? Optional.empty() : Optional.ofNullable(this.enableAutomaticOSUpgrade);
    }

    public AutomaticOSUpgradePolicyResponse(
        @Nullable Boolean disableAutomaticRollback,
        @Nullable Boolean enableAutomaticOSUpgrade) {
        this.disableAutomaticRollback = disableAutomaticRollback;
        this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
    }

    private AutomaticOSUpgradePolicyResponse() {
        this.disableAutomaticRollback = null;
        this.enableAutomaticOSUpgrade = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticOSUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableAutomaticRollback;
        private @Nullable Boolean enableAutomaticOSUpgrade;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticOSUpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutomaticRollback = defaults.disableAutomaticRollback;
    	      this.enableAutomaticOSUpgrade = defaults.enableAutomaticOSUpgrade;
        }

        public Builder disableAutomaticRollback(@Nullable Boolean disableAutomaticRollback) {
            this.disableAutomaticRollback = disableAutomaticRollback;
            return this;
        }
        public Builder enableAutomaticOSUpgrade(@Nullable Boolean enableAutomaticOSUpgrade) {
            this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
            return this;
        }        public AutomaticOSUpgradePolicyResponse build() {
            return new AutomaticOSUpgradePolicyResponse(disableAutomaticRollback, enableAutomaticOSUpgrade);
        }
    }
}

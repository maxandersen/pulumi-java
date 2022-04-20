// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.AutomaticOSUpgradePolicyResponse;
import com.pulumi.azurenative.compute.inputs.RollingUpgradePolicyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an upgrade policy - automatic, manual, or rolling.
 * 
 */
public final class UpgradePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final UpgradePolicyResponse Empty = new UpgradePolicyResponse();

    /**
     * Configuration parameters used for performing automatic OS Upgrade.
     * 
     */
    @Import(name="automaticOSUpgradePolicy")
      private final @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy;

    public Optional<AutomaticOSUpgradePolicyResponse> automaticOSUpgradePolicy() {
        return this.automaticOSUpgradePolicy == null ? Optional.empty() : Optional.ofNullable(this.automaticOSUpgradePolicy);
    }

    /**
     * Specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt; **Automatic** - All virtual machines in the scale set are  automatically updated at the same time.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> mode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The configuration parameters used while performing a rolling upgrade.
     * 
     */
    @Import(name="rollingUpgradePolicy")
      private final @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy;

    public Optional<RollingUpgradePolicyResponse> rollingUpgradePolicy() {
        return this.rollingUpgradePolicy == null ? Optional.empty() : Optional.ofNullable(this.rollingUpgradePolicy);
    }

    public UpgradePolicyResponse(
        @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy,
        @Nullable String mode,
        @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        this.mode = mode;
        this.rollingUpgradePolicy = rollingUpgradePolicy;
    }

    private UpgradePolicyResponse() {
        this.automaticOSUpgradePolicy = null;
        this.mode = null;
        this.rollingUpgradePolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy;
        private @Nullable String mode;
        private @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticOSUpgradePolicy = defaults.automaticOSUpgradePolicy;
    	      this.mode = defaults.mode;
    	      this.rollingUpgradePolicy = defaults.rollingUpgradePolicy;
        }

        public Builder automaticOSUpgradePolicy(@Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy) {
            this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder rollingUpgradePolicy(@Nullable RollingUpgradePolicyResponse rollingUpgradePolicy) {
            this.rollingUpgradePolicy = rollingUpgradePolicy;
            return this;
        }        public UpgradePolicyResponse build() {
            return new UpgradePolicyResponse(automaticOSUpgradePolicy, mode, rollingUpgradePolicy);
        }
    }
}

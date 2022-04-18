// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Auto upgrade profile for a managed cluster.
 * 
 */
public final class ManagedClusterAutoUpgradeProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedClusterAutoUpgradeProfileResponse Empty = new ManagedClusterAutoUpgradeProfileResponse();

    /**
     * upgrade channel for auto upgrade.
     * 
     */
    @Import(name="upgradeChannel")
      private final @Nullable String upgradeChannel;

    public Optional<String> upgradeChannel() {
        return this.upgradeChannel == null ? Optional.empty() : Optional.ofNullable(this.upgradeChannel);
    }

    public ManagedClusterAutoUpgradeProfileResponse(@Nullable String upgradeChannel) {
        this.upgradeChannel = upgradeChannel;
    }

    private ManagedClusterAutoUpgradeProfileResponse() {
        this.upgradeChannel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAutoUpgradeProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String upgradeChannel;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAutoUpgradeProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.upgradeChannel = defaults.upgradeChannel;
        }

        public Builder upgradeChannel(@Nullable String upgradeChannel) {
            this.upgradeChannel = upgradeChannel;
            return this;
        }        public ManagedClusterAutoUpgradeProfileResponse build() {
            return new ManagedClusterAutoUpgradeProfileResponse(upgradeChannel);
        }
    }
}

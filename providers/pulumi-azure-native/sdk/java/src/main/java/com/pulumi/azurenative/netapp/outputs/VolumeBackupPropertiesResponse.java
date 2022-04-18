// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeBackupPropertiesResponse {
    /**
     * Backup Enabled
     * 
     */
    private final @Nullable Boolean backupEnabled;
    /**
     * Backup Policy Resource ID
     * 
     */
    private final @Nullable String backupPolicyId;
    /**
     * Policy Enforced
     * 
     */
    private final @Nullable Boolean policyEnforced;
    /**
     * Vault Resource ID
     * 
     */
    private final @Nullable String vaultId;

    @CustomType.Constructor
    private VolumeBackupPropertiesResponse(
        @CustomType.Parameter("backupEnabled") @Nullable Boolean backupEnabled,
        @CustomType.Parameter("backupPolicyId") @Nullable String backupPolicyId,
        @CustomType.Parameter("policyEnforced") @Nullable Boolean policyEnforced,
        @CustomType.Parameter("vaultId") @Nullable String vaultId) {
        this.backupEnabled = backupEnabled;
        this.backupPolicyId = backupPolicyId;
        this.policyEnforced = policyEnforced;
        this.vaultId = vaultId;
    }

    /**
     * Backup Enabled
     * 
    */
    public Optional<Boolean> backupEnabled() {
        return Optional.ofNullable(this.backupEnabled);
    }
    /**
     * Backup Policy Resource ID
     * 
    */
    public Optional<String> backupPolicyId() {
        return Optional.ofNullable(this.backupPolicyId);
    }
    /**
     * Policy Enforced
     * 
    */
    public Optional<Boolean> policyEnforced() {
        return Optional.ofNullable(this.policyEnforced);
    }
    /**
     * Vault Resource ID
     * 
    */
    public Optional<String> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeBackupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean backupEnabled;
        private @Nullable String backupPolicyId;
        private @Nullable Boolean policyEnforced;
        private @Nullable String vaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeBackupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupEnabled = defaults.backupEnabled;
    	      this.backupPolicyId = defaults.backupPolicyId;
    	      this.policyEnforced = defaults.policyEnforced;
    	      this.vaultId = defaults.vaultId;
        }

        public Builder backupEnabled(@Nullable Boolean backupEnabled) {
            this.backupEnabled = backupEnabled;
            return this;
        }
        public Builder backupPolicyId(@Nullable String backupPolicyId) {
            this.backupPolicyId = backupPolicyId;
            return this;
        }
        public Builder policyEnforced(@Nullable Boolean policyEnforced) {
            this.policyEnforced = policyEnforced;
            return this;
        }
        public Builder vaultId(@Nullable String vaultId) {
            this.vaultId = vaultId;
            return this;
        }        public VolumeBackupPropertiesResponse build() {
            return new VolumeBackupPropertiesResponse(backupEnabled, backupPolicyId, policyEnforced, vaultId);
        }
    }
}

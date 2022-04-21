// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * Name of the policy
     * 
     */
    @Import(name="backupPolicyName")
    private @Nullable Output<String> backupPolicyName;

    public Optional<Output<String>> backupPolicyName() {
        return Optional.ofNullable(this.backupPolicyName);
    }

    /**
     * BaseBackupPolicyResource properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<com.pulumi.azurenative.dataprotection.inputs.BackupPolicyArgs> properties;

    public Optional<Output<com.pulumi.azurenative.dataprotection.inputs.BackupPolicyArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    public Output<String> vaultName() {
        return this.vaultName;
    }

    private BackupPolicyArgs() {}

    private BackupPolicyArgs(BackupPolicyArgs $) {
        this.backupPolicyName = $.backupPolicyName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyArgs $;

        public Builder() {
            $ = new BackupPolicyArgs();
        }

        public Builder(BackupPolicyArgs defaults) {
            $ = new BackupPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupPolicyName(@Nullable Output<String> backupPolicyName) {
            $.backupPolicyName = backupPolicyName;
            return this;
        }

        public Builder backupPolicyName(String backupPolicyName) {
            return backupPolicyName(Output.of(backupPolicyName));
        }

        public Builder properties(@Nullable Output<com.pulumi.azurenative.dataprotection.inputs.BackupPolicyArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(com.pulumi.azurenative.dataprotection.inputs.BackupPolicyArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        public BackupPolicyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.azurenative.keyvault.enums.CreateMode;
import com.pulumi.azurenative.keyvault.enums.VaultProvisioningState;
import com.pulumi.azurenative.keyvault.inputs.AccessPolicyEntryArgs;
import com.pulumi.azurenative.keyvault.inputs.NetworkRuleSetArgs;
import com.pulumi.azurenative.keyvault.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the vault
 * 
 */
public final class VaultPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultPropertiesArgs Empty = new VaultPropertiesArgs();

    /**
     * An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault&#39;s tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
     * 
     */
    @Import(name="accessPolicies")
    private @Nullable Output<List<AccessPolicyEntryArgs>> accessPolicies;

    /**
     * @return An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault&#39;s tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
     * 
     */
    public Optional<Output<List<AccessPolicyEntryArgs>>> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }

    /**
     * The vault&#39;s create mode to indicate whether the vault need to be recovered or not.
     * 
     */
    @Import(name="createMode")
    private @Nullable Output<CreateMode> createMode;

    /**
     * @return The vault&#39;s create mode to indicate whether the vault need to be recovered or not.
     * 
     */
    public Optional<Output<CreateMode>> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * Property specifying whether protection against purge is enabled for this vault. Setting this property to true activates protection against purge for this vault and its content - only the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its value.
     * 
     */
    @Import(name="enablePurgeProtection")
    private @Nullable Output<Boolean> enablePurgeProtection;

    /**
     * @return Property specifying whether protection against purge is enabled for this vault. Setting this property to true activates protection against purge for this vault and its content - only the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its value.
     * 
     */
    public Optional<Output<Boolean>> enablePurgeProtection() {
        return Optional.ofNullable(this.enablePurgeProtection);
    }

    /**
     * Property that controls how data actions are authorized. When true, the key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be  ignored. When false, the key vault will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified, the vault is created with the default value of false. Note that management actions are always authorized with RBAC.
     * 
     */
    @Import(name="enableRbacAuthorization")
    private @Nullable Output<Boolean> enableRbacAuthorization;

    /**
     * @return Property that controls how data actions are authorized. When true, the key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be  ignored. When false, the key vault will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified, the vault is created with the default value of false. Note that management actions are always authorized with RBAC.
     * 
     */
    public Optional<Output<Boolean>> enableRbacAuthorization() {
        return Optional.ofNullable(this.enableRbacAuthorization);
    }

    /**
     * Property to specify whether the &#39;soft delete&#39; functionality is enabled for this key vault. If it&#39;s not set to any value(true or false) when creating new key vault, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    @Import(name="enableSoftDelete")
    private @Nullable Output<Boolean> enableSoftDelete;

    /**
     * @return Property to specify whether the &#39;soft delete&#39; functionality is enabled for this key vault. If it&#39;s not set to any value(true or false) when creating new key vault, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    public Optional<Output<Boolean>> enableSoftDelete() {
        return Optional.ofNullable(this.enableSoftDelete);
    }

    /**
     * Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
     * 
     */
    @Import(name="enabledForDeployment")
    private @Nullable Output<Boolean> enabledForDeployment;

    /**
     * @return Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
     * 
     */
    public Optional<Output<Boolean>> enabledForDeployment() {
        return Optional.ofNullable(this.enabledForDeployment);
    }

    /**
     * Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
     * 
     */
    @Import(name="enabledForDiskEncryption")
    private @Nullable Output<Boolean> enabledForDiskEncryption;

    /**
     * @return Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
     * 
     */
    public Optional<Output<Boolean>> enabledForDiskEncryption() {
        return Optional.ofNullable(this.enabledForDiskEncryption);
    }

    /**
     * Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     * 
     */
    @Import(name="enabledForTemplateDeployment")
    private @Nullable Output<Boolean> enabledForTemplateDeployment;

    /**
     * @return Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     * 
     */
    public Optional<Output<Boolean>> enabledForTemplateDeployment() {
        return Optional.ofNullable(this.enabledForTemplateDeployment);
    }

    /**
     * Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    @Import(name="networkAcls")
    private @Nullable Output<NetworkRuleSetArgs> networkAcls;

    /**
     * @return Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    public Optional<Output<NetworkRuleSetArgs>> networkAcls() {
        return Optional.ofNullable(this.networkAcls);
    }

    /**
     * Provisioning state of the vault.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,VaultProvisioningState>> provisioningState;

    /**
     * @return Provisioning state of the vault.
     * 
     */
    public Optional<Output<Either<String,VaultProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * SKU details
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    /**
     * @return SKU details
     * 
     */
    public Output<SkuArgs> sku() {
        return this.sku;
    }

    /**
     * softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     * 
     */
    @Import(name="softDeleteRetentionInDays")
    private @Nullable Output<Integer> softDeleteRetentionInDays;

    /**
     * @return softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     * 
     */
    public Optional<Output<Integer>> softDeleteRetentionInDays() {
        return Optional.ofNullable(this.softDeleteRetentionInDays);
    }

    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     * The URI of the vault for performing operations on keys and secrets. This property is readonly
     * 
     */
    @Import(name="vaultUri")
    private @Nullable Output<String> vaultUri;

    /**
     * @return The URI of the vault for performing operations on keys and secrets. This property is readonly
     * 
     */
    public Optional<Output<String>> vaultUri() {
        return Optional.ofNullable(this.vaultUri);
    }

    private VaultPropertiesArgs() {}

    private VaultPropertiesArgs(VaultPropertiesArgs $) {
        this.accessPolicies = $.accessPolicies;
        this.createMode = $.createMode;
        this.enablePurgeProtection = $.enablePurgeProtection;
        this.enableRbacAuthorization = $.enableRbacAuthorization;
        this.enableSoftDelete = $.enableSoftDelete;
        this.enabledForDeployment = $.enabledForDeployment;
        this.enabledForDiskEncryption = $.enabledForDiskEncryption;
        this.enabledForTemplateDeployment = $.enabledForTemplateDeployment;
        this.networkAcls = $.networkAcls;
        this.provisioningState = $.provisioningState;
        this.sku = $.sku;
        this.softDeleteRetentionInDays = $.softDeleteRetentionInDays;
        this.tenantId = $.tenantId;
        this.vaultUri = $.vaultUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultPropertiesArgs $;

        public Builder() {
            $ = new VaultPropertiesArgs();
        }

        public Builder(VaultPropertiesArgs defaults) {
            $ = new VaultPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicies An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault&#39;s tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(@Nullable Output<List<AccessPolicyEntryArgs>> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        /**
         * @param accessPolicies An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault&#39;s tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(List<AccessPolicyEntryArgs> accessPolicies) {
            return accessPolicies(Output.of(accessPolicies));
        }

        /**
         * @param accessPolicies An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault&#39;s tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(AccessPolicyEntryArgs... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }

        /**
         * @param createMode The vault&#39;s create mode to indicate whether the vault need to be recovered or not.
         * 
         * @return builder
         * 
         */
        public Builder createMode(@Nullable Output<CreateMode> createMode) {
            $.createMode = createMode;
            return this;
        }

        /**
         * @param createMode The vault&#39;s create mode to indicate whether the vault need to be recovered or not.
         * 
         * @return builder
         * 
         */
        public Builder createMode(CreateMode createMode) {
            return createMode(Output.of(createMode));
        }

        /**
         * @param enablePurgeProtection Property specifying whether protection against purge is enabled for this vault. Setting this property to true activates protection against purge for this vault and its content - only the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its value.
         * 
         * @return builder
         * 
         */
        public Builder enablePurgeProtection(@Nullable Output<Boolean> enablePurgeProtection) {
            $.enablePurgeProtection = enablePurgeProtection;
            return this;
        }

        /**
         * @param enablePurgeProtection Property specifying whether protection against purge is enabled for this vault. Setting this property to true activates protection against purge for this vault and its content - only the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its value.
         * 
         * @return builder
         * 
         */
        public Builder enablePurgeProtection(Boolean enablePurgeProtection) {
            return enablePurgeProtection(Output.of(enablePurgeProtection));
        }

        /**
         * @param enableRbacAuthorization Property that controls how data actions are authorized. When true, the key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be  ignored. When false, the key vault will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified, the vault is created with the default value of false. Note that management actions are always authorized with RBAC.
         * 
         * @return builder
         * 
         */
        public Builder enableRbacAuthorization(@Nullable Output<Boolean> enableRbacAuthorization) {
            $.enableRbacAuthorization = enableRbacAuthorization;
            return this;
        }

        /**
         * @param enableRbacAuthorization Property that controls how data actions are authorized. When true, the key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be  ignored. When false, the key vault will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified, the vault is created with the default value of false. Note that management actions are always authorized with RBAC.
         * 
         * @return builder
         * 
         */
        public Builder enableRbacAuthorization(Boolean enableRbacAuthorization) {
            return enableRbacAuthorization(Output.of(enableRbacAuthorization));
        }

        /**
         * @param enableSoftDelete Property to specify whether the &#39;soft delete&#39; functionality is enabled for this key vault. If it&#39;s not set to any value(true or false) when creating new key vault, it will be set to true by default. Once set to true, it cannot be reverted to false.
         * 
         * @return builder
         * 
         */
        public Builder enableSoftDelete(@Nullable Output<Boolean> enableSoftDelete) {
            $.enableSoftDelete = enableSoftDelete;
            return this;
        }

        /**
         * @param enableSoftDelete Property to specify whether the &#39;soft delete&#39; functionality is enabled for this key vault. If it&#39;s not set to any value(true or false) when creating new key vault, it will be set to true by default. Once set to true, it cannot be reverted to false.
         * 
         * @return builder
         * 
         */
        public Builder enableSoftDelete(Boolean enableSoftDelete) {
            return enableSoftDelete(Output.of(enableSoftDelete));
        }

        /**
         * @param enabledForDeployment Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDeployment(@Nullable Output<Boolean> enabledForDeployment) {
            $.enabledForDeployment = enabledForDeployment;
            return this;
        }

        /**
         * @param enabledForDeployment Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDeployment(Boolean enabledForDeployment) {
            return enabledForDeployment(Output.of(enabledForDeployment));
        }

        /**
         * @param enabledForDiskEncryption Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDiskEncryption(@Nullable Output<Boolean> enabledForDiskEncryption) {
            $.enabledForDiskEncryption = enabledForDiskEncryption;
            return this;
        }

        /**
         * @param enabledForDiskEncryption Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDiskEncryption(Boolean enabledForDiskEncryption) {
            return enabledForDiskEncryption(Output.of(enabledForDiskEncryption));
        }

        /**
         * @param enabledForTemplateDeployment Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
         * 
         * @return builder
         * 
         */
        public Builder enabledForTemplateDeployment(@Nullable Output<Boolean> enabledForTemplateDeployment) {
            $.enabledForTemplateDeployment = enabledForTemplateDeployment;
            return this;
        }

        /**
         * @param enabledForTemplateDeployment Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
         * 
         * @return builder
         * 
         */
        public Builder enabledForTemplateDeployment(Boolean enabledForTemplateDeployment) {
            return enabledForTemplateDeployment(Output.of(enabledForTemplateDeployment));
        }

        /**
         * @param networkAcls Rules governing the accessibility of the key vault from specific network locations.
         * 
         * @return builder
         * 
         */
        public Builder networkAcls(@Nullable Output<NetworkRuleSetArgs> networkAcls) {
            $.networkAcls = networkAcls;
            return this;
        }

        /**
         * @param networkAcls Rules governing the accessibility of the key vault from specific network locations.
         * 
         * @return builder
         * 
         */
        public Builder networkAcls(NetworkRuleSetArgs networkAcls) {
            return networkAcls(Output.of(networkAcls));
        }

        /**
         * @param provisioningState Provisioning state of the vault.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<Either<String,VaultProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the vault.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(Either<String,VaultProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param provisioningState Provisioning state of the vault.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        /**
         * @param provisioningState Provisioning state of the vault.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(VaultProvisioningState provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        /**
         * @param sku SKU details
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku SKU details
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param softDeleteRetentionInDays softDelete data retention days. It accepts &gt;=7 and &lt;=90.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteRetentionInDays(@Nullable Output<Integer> softDeleteRetentionInDays) {
            $.softDeleteRetentionInDays = softDeleteRetentionInDays;
            return this;
        }

        /**
         * @param softDeleteRetentionInDays softDelete data retention days. It accepts &gt;=7 and &lt;=90.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
            return softDeleteRetentionInDays(Output.of(softDeleteRetentionInDays));
        }

        /**
         * @param tenantId The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param vaultUri The URI of the vault for performing operations on keys and secrets. This property is readonly
         * 
         * @return builder
         * 
         */
        public Builder vaultUri(@Nullable Output<String> vaultUri) {
            $.vaultUri = vaultUri;
            return this;
        }

        /**
         * @param vaultUri The URI of the vault for performing operations on keys and secrets. This property is readonly
         * 
         * @return builder
         * 
         */
        public Builder vaultUri(String vaultUri) {
            return vaultUri(Output.of(vaultUri));
        }

        public VaultPropertiesArgs build() {
            $.enableRbacAuthorization = Codegen.booleanProp("enableRbacAuthorization").output().arg($.enableRbacAuthorization).def(false).getNullable();
            $.enableSoftDelete = Codegen.booleanProp("enableSoftDelete").output().arg($.enableSoftDelete).def(true).getNullable();
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            $.softDeleteRetentionInDays = Codegen.integerProp("softDeleteRetentionInDays").output().arg($.softDeleteRetentionInDays).def(90).getNullable();
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}

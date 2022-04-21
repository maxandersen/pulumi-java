// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Recovery Services Vault specific protection intent item.
 * 
 */
public final class AzureRecoveryServiceVaultProtectionIntentResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureRecoveryServiceVaultProtectionIntentResponse Empty = new AzureRecoveryServiceVaultProtectionIntentResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable String backupManagementType;

    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    @Import(name="itemId")
    private @Nullable String itemId;

    public Optional<String> itemId() {
        return Optional.ofNullable(this.itemId);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
    private @Nullable String policyId;

    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * backup protectionIntent type.
     * Expected value is &#39;RecoveryServiceVaultItem&#39;.
     * 
     */
    @Import(name="protectionIntentItemType", required=true)
    private String protectionIntentItemType;

    public String protectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
    private @Nullable String protectionState;

    public Optional<String> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable String sourceResourceId;

    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    private AzureRecoveryServiceVaultProtectionIntentResponse() {}

    private AzureRecoveryServiceVaultProtectionIntentResponse(AzureRecoveryServiceVaultProtectionIntentResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.itemId = $.itemId;
        this.policyId = $.policyId;
        this.protectionIntentItemType = $.protectionIntentItemType;
        this.protectionState = $.protectionState;
        this.sourceResourceId = $.sourceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureRecoveryServiceVaultProtectionIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureRecoveryServiceVaultProtectionIntentResponse $;

        public Builder() {
            $ = new AzureRecoveryServiceVaultProtectionIntentResponse();
        }

        public Builder(AzureRecoveryServiceVaultProtectionIntentResponse defaults) {
            $ = new AzureRecoveryServiceVaultProtectionIntentResponse(Objects.requireNonNull(defaults));
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        public Builder itemId(@Nullable String itemId) {
            $.itemId = itemId;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder protectionIntentItemType(String protectionIntentItemType) {
            $.protectionIntentItemType = protectionIntentItemType;
            return this;
        }

        public Builder protectionState(@Nullable String protectionState) {
            $.protectionState = protectionState;
            return this;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        public AzureRecoveryServiceVaultProtectionIntentResponse build() {
            $.protectionIntentItemType = Codegen.stringProp("protectionIntentItemType").arg($.protectionIntentItemType).require();
            return $;
        }
    }

}

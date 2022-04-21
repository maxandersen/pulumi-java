// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.azurenative.databricks.inputs.WorkspaceCustomBooleanParameterResponse;
import com.pulumi.azurenative.databricks.inputs.WorkspaceCustomObjectParameterResponse;
import com.pulumi.azurenative.databricks.inputs.WorkspaceCustomStringParameterResponse;
import com.pulumi.azurenative.databricks.inputs.WorkspaceEncryptionParameterResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom Parameters used for Cluster Creation.
 * 
 */
public final class WorkspaceCustomParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkspaceCustomParametersResponse Empty = new WorkspaceCustomParametersResponse();

    /**
     * The ID of a Azure Machine Learning workspace to link with Databricks workspace
     * 
     */
    @Import(name="amlWorkspaceId")
    private @Nullable WorkspaceCustomStringParameterResponse amlWorkspaceId;

    public Optional<WorkspaceCustomStringParameterResponse> amlWorkspaceId() {
        return Optional.ofNullable(this.amlWorkspaceId);
    }

    /**
     * The name of the Private Subnet within the Virtual Network
     * 
     */
    @Import(name="customPrivateSubnetName")
    private @Nullable WorkspaceCustomStringParameterResponse customPrivateSubnetName;

    public Optional<WorkspaceCustomStringParameterResponse> customPrivateSubnetName() {
        return Optional.ofNullable(this.customPrivateSubnetName);
    }

    /**
     * The name of a Public Subnet within the Virtual Network
     * 
     */
    @Import(name="customPublicSubnetName")
    private @Nullable WorkspaceCustomStringParameterResponse customPublicSubnetName;

    public Optional<WorkspaceCustomStringParameterResponse> customPublicSubnetName() {
        return Optional.ofNullable(this.customPublicSubnetName);
    }

    /**
     * The ID of a Virtual Network where this Databricks Cluster should be created
     * 
     */
    @Import(name="customVirtualNetworkId")
    private @Nullable WorkspaceCustomStringParameterResponse customVirtualNetworkId;

    public Optional<WorkspaceCustomStringParameterResponse> customVirtualNetworkId() {
        return Optional.ofNullable(this.customVirtualNetworkId);
    }

    /**
     * Should the Public IP be Disabled?
     * 
     */
    @Import(name="enableNoPublicIp")
    private @Nullable WorkspaceCustomBooleanParameterResponse enableNoPublicIp;

    public Optional<WorkspaceCustomBooleanParameterResponse> enableNoPublicIp() {
        return Optional.ofNullable(this.enableNoPublicIp);
    }

    /**
     * Contains the encryption details for Customer-Managed Key (CMK) enabled workspace.
     * 
     */
    @Import(name="encryption")
    private @Nullable WorkspaceEncryptionParameterResponse encryption;

    public Optional<WorkspaceEncryptionParameterResponse> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * Name of the outbound Load Balancer Backend Pool for Secure Cluster Connectivity (No Public IP).
     * 
     */
    @Import(name="loadBalancerBackendPoolName")
    private @Nullable WorkspaceCustomStringParameterResponse loadBalancerBackendPoolName;

    public Optional<WorkspaceCustomStringParameterResponse> loadBalancerBackendPoolName() {
        return Optional.ofNullable(this.loadBalancerBackendPoolName);
    }

    /**
     * Resource URI of Outbound Load balancer for Secure Cluster Connectivity (No Public IP) workspace.
     * 
     */
    @Import(name="loadBalancerId")
    private @Nullable WorkspaceCustomStringParameterResponse loadBalancerId;

    public Optional<WorkspaceCustomStringParameterResponse> loadBalancerId() {
        return Optional.ofNullable(this.loadBalancerId);
    }

    /**
     * Name of the NAT gateway for Secure Cluster Connectivity (No Public IP) workspace subnets.
     * 
     */
    @Import(name="natGatewayName")
    private @Nullable WorkspaceCustomStringParameterResponse natGatewayName;

    public Optional<WorkspaceCustomStringParameterResponse> natGatewayName() {
        return Optional.ofNullable(this.natGatewayName);
    }

    /**
     * Prepare the workspace for encryption. Enables the Managed Identity for managed storage account.
     * 
     */
    @Import(name="prepareEncryption")
    private @Nullable WorkspaceCustomBooleanParameterResponse prepareEncryption;

    public Optional<WorkspaceCustomBooleanParameterResponse> prepareEncryption() {
        return Optional.ofNullable(this.prepareEncryption);
    }

    /**
     * Name of the Public IP for No Public IP workspace with managed vNet.
     * 
     */
    @Import(name="publicIpName")
    private @Nullable WorkspaceCustomStringParameterResponse publicIpName;

    public Optional<WorkspaceCustomStringParameterResponse> publicIpName() {
        return Optional.ofNullable(this.publicIpName);
    }

    /**
     * A boolean indicating whether or not the DBFS root file system will be enabled with secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    @Import(name="requireInfrastructureEncryption")
    private @Nullable WorkspaceCustomBooleanParameterResponse requireInfrastructureEncryption;

    public Optional<WorkspaceCustomBooleanParameterResponse> requireInfrastructureEncryption() {
        return Optional.ofNullable(this.requireInfrastructureEncryption);
    }

    /**
     * Tags applied to resources under Managed resource group. These can be updated by updating tags at workspace level.
     * 
     */
    @Import(name="resourceTags", required=true)
    private WorkspaceCustomObjectParameterResponse resourceTags;

    public WorkspaceCustomObjectParameterResponse resourceTags() {
        return this.resourceTags;
    }

    /**
     * Default DBFS storage account name.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable WorkspaceCustomStringParameterResponse storageAccountName;

    public Optional<WorkspaceCustomStringParameterResponse> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    /**
     * Storage account SKU name, ex: Standard_GRS, Standard_LRS. Refer https://aka.ms/storageskus for valid inputs.
     * 
     */
    @Import(name="storageAccountSkuName")
    private @Nullable WorkspaceCustomStringParameterResponse storageAccountSkuName;

    public Optional<WorkspaceCustomStringParameterResponse> storageAccountSkuName() {
        return Optional.ofNullable(this.storageAccountSkuName);
    }

    /**
     * Address prefix for Managed virtual network. Default value for this input is 10.139.
     * 
     */
    @Import(name="vnetAddressPrefix")
    private @Nullable WorkspaceCustomStringParameterResponse vnetAddressPrefix;

    public Optional<WorkspaceCustomStringParameterResponse> vnetAddressPrefix() {
        return Optional.ofNullable(this.vnetAddressPrefix);
    }

    private WorkspaceCustomParametersResponse() {}

    private WorkspaceCustomParametersResponse(WorkspaceCustomParametersResponse $) {
        this.amlWorkspaceId = $.amlWorkspaceId;
        this.customPrivateSubnetName = $.customPrivateSubnetName;
        this.customPublicSubnetName = $.customPublicSubnetName;
        this.customVirtualNetworkId = $.customVirtualNetworkId;
        this.enableNoPublicIp = $.enableNoPublicIp;
        this.encryption = $.encryption;
        this.loadBalancerBackendPoolName = $.loadBalancerBackendPoolName;
        this.loadBalancerId = $.loadBalancerId;
        this.natGatewayName = $.natGatewayName;
        this.prepareEncryption = $.prepareEncryption;
        this.publicIpName = $.publicIpName;
        this.requireInfrastructureEncryption = $.requireInfrastructureEncryption;
        this.resourceTags = $.resourceTags;
        this.storageAccountName = $.storageAccountName;
        this.storageAccountSkuName = $.storageAccountSkuName;
        this.vnetAddressPrefix = $.vnetAddressPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceCustomParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceCustomParametersResponse $;

        public Builder() {
            $ = new WorkspaceCustomParametersResponse();
        }

        public Builder(WorkspaceCustomParametersResponse defaults) {
            $ = new WorkspaceCustomParametersResponse(Objects.requireNonNull(defaults));
        }

        public Builder amlWorkspaceId(@Nullable WorkspaceCustomStringParameterResponse amlWorkspaceId) {
            $.amlWorkspaceId = amlWorkspaceId;
            return this;
        }

        public Builder customPrivateSubnetName(@Nullable WorkspaceCustomStringParameterResponse customPrivateSubnetName) {
            $.customPrivateSubnetName = customPrivateSubnetName;
            return this;
        }

        public Builder customPublicSubnetName(@Nullable WorkspaceCustomStringParameterResponse customPublicSubnetName) {
            $.customPublicSubnetName = customPublicSubnetName;
            return this;
        }

        public Builder customVirtualNetworkId(@Nullable WorkspaceCustomStringParameterResponse customVirtualNetworkId) {
            $.customVirtualNetworkId = customVirtualNetworkId;
            return this;
        }

        public Builder enableNoPublicIp(@Nullable WorkspaceCustomBooleanParameterResponse enableNoPublicIp) {
            $.enableNoPublicIp = enableNoPublicIp;
            return this;
        }

        public Builder encryption(@Nullable WorkspaceEncryptionParameterResponse encryption) {
            $.encryption = encryption;
            return this;
        }

        public Builder loadBalancerBackendPoolName(@Nullable WorkspaceCustomStringParameterResponse loadBalancerBackendPoolName) {
            $.loadBalancerBackendPoolName = loadBalancerBackendPoolName;
            return this;
        }

        public Builder loadBalancerId(@Nullable WorkspaceCustomStringParameterResponse loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        public Builder natGatewayName(@Nullable WorkspaceCustomStringParameterResponse natGatewayName) {
            $.natGatewayName = natGatewayName;
            return this;
        }

        public Builder prepareEncryption(@Nullable WorkspaceCustomBooleanParameterResponse prepareEncryption) {
            $.prepareEncryption = prepareEncryption;
            return this;
        }

        public Builder publicIpName(@Nullable WorkspaceCustomStringParameterResponse publicIpName) {
            $.publicIpName = publicIpName;
            return this;
        }

        public Builder requireInfrastructureEncryption(@Nullable WorkspaceCustomBooleanParameterResponse requireInfrastructureEncryption) {
            $.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }

        public Builder resourceTags(WorkspaceCustomObjectParameterResponse resourceTags) {
            $.resourceTags = resourceTags;
            return this;
        }

        public Builder storageAccountName(@Nullable WorkspaceCustomStringParameterResponse storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public Builder storageAccountSkuName(@Nullable WorkspaceCustomStringParameterResponse storageAccountSkuName) {
            $.storageAccountSkuName = storageAccountSkuName;
            return this;
        }

        public Builder vnetAddressPrefix(@Nullable WorkspaceCustomStringParameterResponse vnetAddressPrefix) {
            $.vnetAddressPrefix = vnetAddressPrefix;
            return this;
        }

        public WorkspaceCustomParametersResponse build() {
            $.resourceTags = Objects.requireNonNull($.resourceTags, "expected parameter 'resourceTags' to be non-null");
            return $;
        }
    }

}

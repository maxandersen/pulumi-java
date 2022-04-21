// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.IPConfigResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hyper V VM network details.
 * 
 */
public final class VMNicDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VMNicDetailsResponse Empty = new VMNicDetailsResponse();

    /**
     * A value indicating whether the NIC has accelerated networking enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworkingOnRecovery")
    private @Nullable Boolean enableAcceleratedNetworkingOnRecovery;

    public Optional<Boolean> enableAcceleratedNetworkingOnRecovery() {
        return Optional.ofNullable(this.enableAcceleratedNetworkingOnRecovery);
    }

    /**
     * Whether the test failover NIC has accelerated networking enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworkingOnTfo")
    private @Nullable Boolean enableAcceleratedNetworkingOnTfo;

    public Optional<Boolean> enableAcceleratedNetworkingOnTfo() {
        return Optional.ofNullable(this.enableAcceleratedNetworkingOnTfo);
    }

    /**
     * Ip address type.
     * 
     */
    @Import(name="ipAddressType")
    private @Nullable String ipAddressType;

    public Optional<String> ipAddressType() {
        return Optional.ofNullable(this.ipAddressType);
    }

    /**
     * The nic Id.
     * 
     */
    @Import(name="nicId")
    private @Nullable String nicId;

    public Optional<String> nicId() {
        return Optional.ofNullable(this.nicId);
    }

    /**
     * Primary nic static IP address.
     * 
     */
    @Import(name="primaryNicStaticIPAddress")
    private @Nullable String primaryNicStaticIPAddress;

    public Optional<String> primaryNicStaticIPAddress() {
        return Optional.ofNullable(this.primaryNicStaticIPAddress);
    }

    /**
     * The target backend address pools for the NIC.
     * 
     */
    @Import(name="recoveryLBBackendAddressPoolIds")
    private @Nullable List<String> recoveryLBBackendAddressPoolIds;

    public Optional<List<String>> recoveryLBBackendAddressPoolIds() {
        return Optional.ofNullable(this.recoveryLBBackendAddressPoolIds);
    }

    /**
     * The id of the NSG associated with the NIC.
     * 
     */
    @Import(name="recoveryNetworkSecurityGroupId")
    private @Nullable String recoveryNetworkSecurityGroupId;

    public Optional<String> recoveryNetworkSecurityGroupId() {
        return Optional.ofNullable(this.recoveryNetworkSecurityGroupId);
    }

    /**
     * IP allocation type for recovery VM.
     * 
     */
    @Import(name="recoveryNicIpAddressType")
    private @Nullable String recoveryNicIpAddressType;

    public Optional<String> recoveryNicIpAddressType() {
        return Optional.ofNullable(this.recoveryNicIpAddressType);
    }

    /**
     * The name of the NIC to be used when creating target NICs.
     * 
     */
    @Import(name="recoveryNicName")
    private @Nullable String recoveryNicName;

    public Optional<String> recoveryNicName() {
        return Optional.ofNullable(this.recoveryNicName);
    }

    /**
     * The resource group of the NIC to be used when creating target NICs.
     * 
     */
    @Import(name="recoveryNicResourceGroupName")
    private @Nullable String recoveryNicResourceGroupName;

    public Optional<String> recoveryNicResourceGroupName() {
        return Optional.ofNullable(this.recoveryNicResourceGroupName);
    }

    /**
     * The id of the public IP address resource associated with the NIC.
     * 
     */
    @Import(name="recoveryPublicIpAddressId")
    private @Nullable String recoveryPublicIpAddressId;

    public Optional<String> recoveryPublicIpAddressId() {
        return Optional.ofNullable(this.recoveryPublicIpAddressId);
    }

    /**
     * Recovery VM network Id.
     * 
     */
    @Import(name="recoveryVMNetworkId")
    private @Nullable String recoveryVMNetworkId;

    public Optional<String> recoveryVMNetworkId() {
        return Optional.ofNullable(this.recoveryVMNetworkId);
    }

    /**
     * Recovery VM subnet name.
     * 
     */
    @Import(name="recoveryVMSubnetName")
    private @Nullable String recoveryVMSubnetName;

    public Optional<String> recoveryVMSubnetName() {
        return Optional.ofNullable(this.recoveryVMSubnetName);
    }

    /**
     * The replica nic Id.
     * 
     */
    @Import(name="replicaNicId")
    private @Nullable String replicaNicId;

    public Optional<String> replicaNicId() {
        return Optional.ofNullable(this.replicaNicId);
    }

    /**
     * Replica nic static IP address.
     * 
     */
    @Import(name="replicaNicStaticIPAddress")
    private @Nullable String replicaNicStaticIPAddress;

    public Optional<String> replicaNicStaticIPAddress() {
        return Optional.ofNullable(this.replicaNicStaticIPAddress);
    }

    /**
     * A value indicating whether an existing NIC is allowed to be reused during failover subject to availability.
     * 
     */
    @Import(name="reuseExistingNic")
    private @Nullable Boolean reuseExistingNic;

    public Optional<Boolean> reuseExistingNic() {
        return Optional.ofNullable(this.reuseExistingNic);
    }

    /**
     * Selection type for failover.
     * 
     */
    @Import(name="selectionType")
    private @Nullable String selectionType;

    public Optional<String> selectionType() {
        return Optional.ofNullable(this.selectionType);
    }

    /**
     * The source nic ARM Id.
     * 
     */
    @Import(name="sourceNicArmId")
    private @Nullable String sourceNicArmId;

    public Optional<String> sourceNicArmId() {
        return Optional.ofNullable(this.sourceNicArmId);
    }

    /**
     * The IP configurations to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoIPConfigs")
    private @Nullable List<IPConfigResponse> tfoIPConfigs;

    public Optional<List<IPConfigResponse>> tfoIPConfigs() {
        return Optional.ofNullable(this.tfoIPConfigs);
    }

    /**
     * The NSG to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoNetworkSecurityGroupId")
    private @Nullable String tfoNetworkSecurityGroupId;

    public Optional<String> tfoNetworkSecurityGroupId() {
        return Optional.ofNullable(this.tfoNetworkSecurityGroupId);
    }

    /**
     * The name of the NIC to be used when creating target NICs in TFO.
     * 
     */
    @Import(name="tfoRecoveryNicName")
    private @Nullable String tfoRecoveryNicName;

    public Optional<String> tfoRecoveryNicName() {
        return Optional.ofNullable(this.tfoRecoveryNicName);
    }

    /**
     * The resource group of the NIC to be used when creating target NICs in TFO.
     * 
     */
    @Import(name="tfoRecoveryNicResourceGroupName")
    private @Nullable String tfoRecoveryNicResourceGroupName;

    public Optional<String> tfoRecoveryNicResourceGroupName() {
        return Optional.ofNullable(this.tfoRecoveryNicResourceGroupName);
    }

    /**
     * A value indicating whether an existing NIC is allowed to be reused during test failover subject to availability.
     * 
     */
    @Import(name="tfoReuseExistingNic")
    private @Nullable Boolean tfoReuseExistingNic;

    public Optional<Boolean> tfoReuseExistingNic() {
        return Optional.ofNullable(this.tfoReuseExistingNic);
    }

    /**
     * The network to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoVMNetworkId")
    private @Nullable String tfoVMNetworkId;

    public Optional<String> tfoVMNetworkId() {
        return Optional.ofNullable(this.tfoVMNetworkId);
    }

    /**
     * The subnet to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoVMSubnetName")
    private @Nullable String tfoVMSubnetName;

    public Optional<String> tfoVMSubnetName() {
        return Optional.ofNullable(this.tfoVMSubnetName);
    }

    /**
     * VM network name.
     * 
     */
    @Import(name="vMNetworkName")
    private @Nullable String vMNetworkName;

    public Optional<String> vMNetworkName() {
        return Optional.ofNullable(this.vMNetworkName);
    }

    /**
     * VM subnet name.
     * 
     */
    @Import(name="vMSubnetName")
    private @Nullable String vMSubnetName;

    public Optional<String> vMSubnetName() {
        return Optional.ofNullable(this.vMSubnetName);
    }

    private VMNicDetailsResponse() {}

    private VMNicDetailsResponse(VMNicDetailsResponse $) {
        this.enableAcceleratedNetworkingOnRecovery = $.enableAcceleratedNetworkingOnRecovery;
        this.enableAcceleratedNetworkingOnTfo = $.enableAcceleratedNetworkingOnTfo;
        this.ipAddressType = $.ipAddressType;
        this.nicId = $.nicId;
        this.primaryNicStaticIPAddress = $.primaryNicStaticIPAddress;
        this.recoveryLBBackendAddressPoolIds = $.recoveryLBBackendAddressPoolIds;
        this.recoveryNetworkSecurityGroupId = $.recoveryNetworkSecurityGroupId;
        this.recoveryNicIpAddressType = $.recoveryNicIpAddressType;
        this.recoveryNicName = $.recoveryNicName;
        this.recoveryNicResourceGroupName = $.recoveryNicResourceGroupName;
        this.recoveryPublicIpAddressId = $.recoveryPublicIpAddressId;
        this.recoveryVMNetworkId = $.recoveryVMNetworkId;
        this.recoveryVMSubnetName = $.recoveryVMSubnetName;
        this.replicaNicId = $.replicaNicId;
        this.replicaNicStaticIPAddress = $.replicaNicStaticIPAddress;
        this.reuseExistingNic = $.reuseExistingNic;
        this.selectionType = $.selectionType;
        this.sourceNicArmId = $.sourceNicArmId;
        this.tfoIPConfigs = $.tfoIPConfigs;
        this.tfoNetworkSecurityGroupId = $.tfoNetworkSecurityGroupId;
        this.tfoRecoveryNicName = $.tfoRecoveryNicName;
        this.tfoRecoveryNicResourceGroupName = $.tfoRecoveryNicResourceGroupName;
        this.tfoReuseExistingNic = $.tfoReuseExistingNic;
        this.tfoVMNetworkId = $.tfoVMNetworkId;
        this.tfoVMSubnetName = $.tfoVMSubnetName;
        this.vMNetworkName = $.vMNetworkName;
        this.vMSubnetName = $.vMSubnetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMNicDetailsResponse $;

        public Builder() {
            $ = new VMNicDetailsResponse();
        }

        public Builder(VMNicDetailsResponse defaults) {
            $ = new VMNicDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder enableAcceleratedNetworkingOnRecovery(@Nullable Boolean enableAcceleratedNetworkingOnRecovery) {
            $.enableAcceleratedNetworkingOnRecovery = enableAcceleratedNetworkingOnRecovery;
            return this;
        }

        public Builder enableAcceleratedNetworkingOnTfo(@Nullable Boolean enableAcceleratedNetworkingOnTfo) {
            $.enableAcceleratedNetworkingOnTfo = enableAcceleratedNetworkingOnTfo;
            return this;
        }

        public Builder ipAddressType(@Nullable String ipAddressType) {
            $.ipAddressType = ipAddressType;
            return this;
        }

        public Builder nicId(@Nullable String nicId) {
            $.nicId = nicId;
            return this;
        }

        public Builder primaryNicStaticIPAddress(@Nullable String primaryNicStaticIPAddress) {
            $.primaryNicStaticIPAddress = primaryNicStaticIPAddress;
            return this;
        }

        public Builder recoveryLBBackendAddressPoolIds(@Nullable List<String> recoveryLBBackendAddressPoolIds) {
            $.recoveryLBBackendAddressPoolIds = recoveryLBBackendAddressPoolIds;
            return this;
        }

        public Builder recoveryLBBackendAddressPoolIds(String... recoveryLBBackendAddressPoolIds) {
            return recoveryLBBackendAddressPoolIds(List.of(recoveryLBBackendAddressPoolIds));
        }

        public Builder recoveryNetworkSecurityGroupId(@Nullable String recoveryNetworkSecurityGroupId) {
            $.recoveryNetworkSecurityGroupId = recoveryNetworkSecurityGroupId;
            return this;
        }

        public Builder recoveryNicIpAddressType(@Nullable String recoveryNicIpAddressType) {
            $.recoveryNicIpAddressType = recoveryNicIpAddressType;
            return this;
        }

        public Builder recoveryNicName(@Nullable String recoveryNicName) {
            $.recoveryNicName = recoveryNicName;
            return this;
        }

        public Builder recoveryNicResourceGroupName(@Nullable String recoveryNicResourceGroupName) {
            $.recoveryNicResourceGroupName = recoveryNicResourceGroupName;
            return this;
        }

        public Builder recoveryPublicIpAddressId(@Nullable String recoveryPublicIpAddressId) {
            $.recoveryPublicIpAddressId = recoveryPublicIpAddressId;
            return this;
        }

        public Builder recoveryVMNetworkId(@Nullable String recoveryVMNetworkId) {
            $.recoveryVMNetworkId = recoveryVMNetworkId;
            return this;
        }

        public Builder recoveryVMSubnetName(@Nullable String recoveryVMSubnetName) {
            $.recoveryVMSubnetName = recoveryVMSubnetName;
            return this;
        }

        public Builder replicaNicId(@Nullable String replicaNicId) {
            $.replicaNicId = replicaNicId;
            return this;
        }

        public Builder replicaNicStaticIPAddress(@Nullable String replicaNicStaticIPAddress) {
            $.replicaNicStaticIPAddress = replicaNicStaticIPAddress;
            return this;
        }

        public Builder reuseExistingNic(@Nullable Boolean reuseExistingNic) {
            $.reuseExistingNic = reuseExistingNic;
            return this;
        }

        public Builder selectionType(@Nullable String selectionType) {
            $.selectionType = selectionType;
            return this;
        }

        public Builder sourceNicArmId(@Nullable String sourceNicArmId) {
            $.sourceNicArmId = sourceNicArmId;
            return this;
        }

        public Builder tfoIPConfigs(@Nullable List<IPConfigResponse> tfoIPConfigs) {
            $.tfoIPConfigs = tfoIPConfigs;
            return this;
        }

        public Builder tfoIPConfigs(IPConfigResponse... tfoIPConfigs) {
            return tfoIPConfigs(List.of(tfoIPConfigs));
        }

        public Builder tfoNetworkSecurityGroupId(@Nullable String tfoNetworkSecurityGroupId) {
            $.tfoNetworkSecurityGroupId = tfoNetworkSecurityGroupId;
            return this;
        }

        public Builder tfoRecoveryNicName(@Nullable String tfoRecoveryNicName) {
            $.tfoRecoveryNicName = tfoRecoveryNicName;
            return this;
        }

        public Builder tfoRecoveryNicResourceGroupName(@Nullable String tfoRecoveryNicResourceGroupName) {
            $.tfoRecoveryNicResourceGroupName = tfoRecoveryNicResourceGroupName;
            return this;
        }

        public Builder tfoReuseExistingNic(@Nullable Boolean tfoReuseExistingNic) {
            $.tfoReuseExistingNic = tfoReuseExistingNic;
            return this;
        }

        public Builder tfoVMNetworkId(@Nullable String tfoVMNetworkId) {
            $.tfoVMNetworkId = tfoVMNetworkId;
            return this;
        }

        public Builder tfoVMSubnetName(@Nullable String tfoVMSubnetName) {
            $.tfoVMSubnetName = tfoVMSubnetName;
            return this;
        }

        public Builder vMNetworkName(@Nullable String vMNetworkName) {
            $.vMNetworkName = vMNetworkName;
            return this;
        }

        public Builder vMSubnetName(@Nullable String vMSubnetName) {
            $.vMSubnetName = vMSubnetName;
            return this;
        }

        public VMNicDetailsResponse build() {
            $.reuseExistingNic = Codegen.booleanProp("reuseExistingNic").arg($.reuseExistingNic).def(false).getNullable();
            $.tfoReuseExistingNic = Codegen.booleanProp("tfoReuseExistingNic").arg($.tfoReuseExistingNic).def(false).getNullable();
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.inputs.SubnetSharedPublicIpAddressConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Property overrides on a subnet of a virtual network.
 * 
 */
public final class SubnetOverrideResponse extends com.pulumi.resources.InvokeArgs {

    public static final SubnetOverrideResponse Empty = new SubnetOverrideResponse();

    /**
     * The name given to the subnet within the lab.
     * 
     */
    @Import(name="labSubnetName")
    private @Nullable String labSubnetName;

    public Optional<String> labSubnetName() {
        return Optional.ofNullable(this.labSubnetName);
    }

    /**
     * The resource ID of the subnet.
     * 
     */
    @Import(name="resourceId")
    private @Nullable String resourceId;

    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Properties that virtual machines on this subnet will share.
     * 
     */
    @Import(name="sharedPublicIpAddressConfiguration")
    private @Nullable SubnetSharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration;

    public Optional<SubnetSharedPublicIpAddressConfigurationResponse> sharedPublicIpAddressConfiguration() {
        return Optional.ofNullable(this.sharedPublicIpAddressConfiguration);
    }

    /**
     * Indicates whether this subnet can be used during virtual machine creation (i.e. Allow, Deny).
     * 
     */
    @Import(name="useInVmCreationPermission")
    private @Nullable String useInVmCreationPermission;

    public Optional<String> useInVmCreationPermission() {
        return Optional.ofNullable(this.useInVmCreationPermission);
    }

    /**
     * Indicates whether public IP addresses can be assigned to virtual machines on this subnet (i.e. Allow, Deny).
     * 
     */
    @Import(name="usePublicIpAddressPermission")
    private @Nullable String usePublicIpAddressPermission;

    public Optional<String> usePublicIpAddressPermission() {
        return Optional.ofNullable(this.usePublicIpAddressPermission);
    }

    /**
     * The virtual network pool associated with this subnet.
     * 
     */
    @Import(name="virtualNetworkPoolName")
    private @Nullable String virtualNetworkPoolName;

    public Optional<String> virtualNetworkPoolName() {
        return Optional.ofNullable(this.virtualNetworkPoolName);
    }

    private SubnetOverrideResponse() {}

    private SubnetOverrideResponse(SubnetOverrideResponse $) {
        this.labSubnetName = $.labSubnetName;
        this.resourceId = $.resourceId;
        this.sharedPublicIpAddressConfiguration = $.sharedPublicIpAddressConfiguration;
        this.useInVmCreationPermission = $.useInVmCreationPermission;
        this.usePublicIpAddressPermission = $.usePublicIpAddressPermission;
        this.virtualNetworkPoolName = $.virtualNetworkPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetOverrideResponse $;

        public Builder() {
            $ = new SubnetOverrideResponse();
        }

        public Builder(SubnetOverrideResponse defaults) {
            $ = new SubnetOverrideResponse(Objects.requireNonNull(defaults));
        }

        public Builder labSubnetName(@Nullable String labSubnetName) {
            $.labSubnetName = labSubnetName;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder sharedPublicIpAddressConfiguration(@Nullable SubnetSharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration) {
            $.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
            return this;
        }

        public Builder useInVmCreationPermission(@Nullable String useInVmCreationPermission) {
            $.useInVmCreationPermission = useInVmCreationPermission;
            return this;
        }

        public Builder usePublicIpAddressPermission(@Nullable String usePublicIpAddressPermission) {
            $.usePublicIpAddressPermission = usePublicIpAddressPermission;
            return this;
        }

        public Builder virtualNetworkPoolName(@Nullable String virtualNetworkPoolName) {
            $.virtualNetworkPoolName = virtualNetworkPoolName;
            return this;
        }

        public SubnetOverrideResponse build() {
            return $;
        }
    }

}

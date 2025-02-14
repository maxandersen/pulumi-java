// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.outputs;

import com.pulumi.azurenative.devtestlab.outputs.SubnetSharedPublicIpAddressConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubnetOverrideResponse {
    /**
     * @return The name given to the subnet within the lab.
     * 
     */
    private final @Nullable String labSubnetName;
    /**
     * @return The resource ID of the subnet.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * @return Properties that virtual machines on this subnet will share.
     * 
     */
    private final @Nullable SubnetSharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration;
    /**
     * @return Indicates whether this subnet can be used during virtual machine creation (i.e. Allow, Deny).
     * 
     */
    private final @Nullable String useInVmCreationPermission;
    /**
     * @return Indicates whether public IP addresses can be assigned to virtual machines on this subnet (i.e. Allow, Deny).
     * 
     */
    private final @Nullable String usePublicIpAddressPermission;
    /**
     * @return The virtual network pool associated with this subnet.
     * 
     */
    private final @Nullable String virtualNetworkPoolName;

    @CustomType.Constructor
    private SubnetOverrideResponse(
        @CustomType.Parameter("labSubnetName") @Nullable String labSubnetName,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("sharedPublicIpAddressConfiguration") @Nullable SubnetSharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration,
        @CustomType.Parameter("useInVmCreationPermission") @Nullable String useInVmCreationPermission,
        @CustomType.Parameter("usePublicIpAddressPermission") @Nullable String usePublicIpAddressPermission,
        @CustomType.Parameter("virtualNetworkPoolName") @Nullable String virtualNetworkPoolName) {
        this.labSubnetName = labSubnetName;
        this.resourceId = resourceId;
        this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
        this.useInVmCreationPermission = useInVmCreationPermission;
        this.usePublicIpAddressPermission = usePublicIpAddressPermission;
        this.virtualNetworkPoolName = virtualNetworkPoolName;
    }

    /**
     * @return The name given to the subnet within the lab.
     * 
     */
    public Optional<String> labSubnetName() {
        return Optional.ofNullable(this.labSubnetName);
    }
    /**
     * @return The resource ID of the subnet.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return Properties that virtual machines on this subnet will share.
     * 
     */
    public Optional<SubnetSharedPublicIpAddressConfigurationResponse> sharedPublicIpAddressConfiguration() {
        return Optional.ofNullable(this.sharedPublicIpAddressConfiguration);
    }
    /**
     * @return Indicates whether this subnet can be used during virtual machine creation (i.e. Allow, Deny).
     * 
     */
    public Optional<String> useInVmCreationPermission() {
        return Optional.ofNullable(this.useInVmCreationPermission);
    }
    /**
     * @return Indicates whether public IP addresses can be assigned to virtual machines on this subnet (i.e. Allow, Deny).
     * 
     */
    public Optional<String> usePublicIpAddressPermission() {
        return Optional.ofNullable(this.usePublicIpAddressPermission);
    }
    /**
     * @return The virtual network pool associated with this subnet.
     * 
     */
    public Optional<String> virtualNetworkPoolName() {
        return Optional.ofNullable(this.virtualNetworkPoolName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String labSubnetName;
        private @Nullable String resourceId;
        private @Nullable SubnetSharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration;
        private @Nullable String useInVmCreationPermission;
        private @Nullable String usePublicIpAddressPermission;
        private @Nullable String virtualNetworkPoolName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labSubnetName = defaults.labSubnetName;
    	      this.resourceId = defaults.resourceId;
    	      this.sharedPublicIpAddressConfiguration = defaults.sharedPublicIpAddressConfiguration;
    	      this.useInVmCreationPermission = defaults.useInVmCreationPermission;
    	      this.usePublicIpAddressPermission = defaults.usePublicIpAddressPermission;
    	      this.virtualNetworkPoolName = defaults.virtualNetworkPoolName;
        }

        public Builder labSubnetName(@Nullable String labSubnetName) {
            this.labSubnetName = labSubnetName;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder sharedPublicIpAddressConfiguration(@Nullable SubnetSharedPublicIpAddressConfigurationResponse sharedPublicIpAddressConfiguration) {
            this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
            return this;
        }
        public Builder useInVmCreationPermission(@Nullable String useInVmCreationPermission) {
            this.useInVmCreationPermission = useInVmCreationPermission;
            return this;
        }
        public Builder usePublicIpAddressPermission(@Nullable String usePublicIpAddressPermission) {
            this.usePublicIpAddressPermission = usePublicIpAddressPermission;
            return this;
        }
        public Builder virtualNetworkPoolName(@Nullable String virtualNetworkPoolName) {
            this.virtualNetworkPoolName = virtualNetworkPoolName;
            return this;
        }        public SubnetOverrideResponse build() {
            return new SubnetOverrideResponse(labSubnetName, resourceId, sharedPublicIpAddressConfiguration, useInVmCreationPermission, usePublicIpAddressPermission, virtualNetworkPoolName);
        }
    }
}

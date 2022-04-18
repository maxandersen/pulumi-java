// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.outputs;

import com.pulumi.azurenative.managednetwork.outputs.ManagedNetworkGroupResponse;
import com.pulumi.azurenative.managednetwork.outputs.ManagedNetworkPeeringPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConnectivityCollectionResponse {
    /**
     * The collection of connectivity related Managed Network Groups within the Managed Network
     * 
     */
    private final List<ManagedNetworkGroupResponse> groups;
    /**
     * The collection of Managed Network Peering Policies within the Managed Network
     * 
     */
    private final List<ManagedNetworkPeeringPolicyResponse> peerings;

    @CustomType.Constructor
    private ConnectivityCollectionResponse(
        @CustomType.Parameter("groups") List<ManagedNetworkGroupResponse> groups,
        @CustomType.Parameter("peerings") List<ManagedNetworkPeeringPolicyResponse> peerings) {
        this.groups = groups;
        this.peerings = peerings;
    }

    /**
     * The collection of connectivity related Managed Network Groups within the Managed Network
     * 
    */
    public List<ManagedNetworkGroupResponse> groups() {
        return this.groups;
    }
    /**
     * The collection of Managed Network Peering Policies within the Managed Network
     * 
    */
    public List<ManagedNetworkPeeringPolicyResponse> peerings() {
        return this.peerings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ManagedNetworkGroupResponse> groups;
        private List<ManagedNetworkPeeringPolicyResponse> peerings;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.peerings = defaults.peerings;
        }

        public Builder groups(List<ManagedNetworkGroupResponse> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(ManagedNetworkGroupResponse... groups) {
            return groups(List.of(groups));
        }
        public Builder peerings(List<ManagedNetworkPeeringPolicyResponse> peerings) {
            this.peerings = Objects.requireNonNull(peerings);
            return this;
        }
        public Builder peerings(ManagedNetworkPeeringPolicyResponse... peerings) {
            return peerings(List.of(peerings));
        }        public ConnectivityCollectionResponse build() {
            return new ConnectivityCollectionResponse(groups, peerings);
        }
    }
}

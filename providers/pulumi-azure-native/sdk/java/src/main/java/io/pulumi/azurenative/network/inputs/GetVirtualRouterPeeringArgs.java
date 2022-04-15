// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualRouterPeeringArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualRouterPeeringArgs Empty = new GetVirtualRouterPeeringArgs();

    /**
     * The name of the Virtual Router Peering.
     * 
     */
    @Import(name="peeringName", required=true)
      private final String peeringName;

    public String peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Virtual Router.
     * 
     */
    @Import(name="virtualRouterName", required=true)
      private final String virtualRouterName;

    public String virtualRouterName() {
        return this.virtualRouterName;
    }

    public GetVirtualRouterPeeringArgs(
        String peeringName,
        String resourceGroupName,
        String virtualRouterName) {
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualRouterName = Objects.requireNonNull(virtualRouterName, "expected parameter 'virtualRouterName' to be non-null");
    }

    private GetVirtualRouterPeeringArgs() {
        this.peeringName = null;
        this.resourceGroupName = null;
        this.virtualRouterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualRouterPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peeringName;
        private String resourceGroupName;
        private String virtualRouterName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualRouterPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringName = defaults.peeringName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualRouterName = defaults.virtualRouterName;
        }

        public Builder peeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder virtualRouterName(String virtualRouterName) {
            this.virtualRouterName = Objects.requireNonNull(virtualRouterName);
            return this;
        }        public GetVirtualRouterPeeringArgs build() {
            return new GetVirtualRouterPeeringArgs(peeringName, resourceGroupName, virtualRouterName);
        }
    }
}

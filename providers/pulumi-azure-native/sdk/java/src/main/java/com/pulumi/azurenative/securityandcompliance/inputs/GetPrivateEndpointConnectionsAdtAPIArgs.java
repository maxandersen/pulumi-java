// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionsAdtAPIArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionsAdtAPIArgs Empty = new GetPrivateEndpointConnectionsAdtAPIArgs();

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
      private final String privateEndpointConnectionName;

    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    public GetPrivateEndpointConnectionsAdtAPIArgs(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String resourceName) {
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetPrivateEndpointConnectionsAdtAPIArgs() {
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionsAdtAPIArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateEndpointConnectionName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionsAdtAPIArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public GetPrivateEndpointConnectionsAdtAPIArgs build() {
            return new GetPrivateEndpointConnectionsAdtAPIArgs(privateEndpointConnectionName, resourceGroupName, resourceName);
        }
    }
}

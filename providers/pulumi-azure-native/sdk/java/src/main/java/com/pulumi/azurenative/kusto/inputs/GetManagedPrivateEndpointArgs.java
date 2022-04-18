// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedPrivateEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedPrivateEndpointArgs Empty = new GetManagedPrivateEndpointArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the managed private endpoint.
     * 
     */
    @Import(name="managedPrivateEndpointName", required=true)
      private final String managedPrivateEndpointName;

    public String managedPrivateEndpointName() {
        return this.managedPrivateEndpointName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetManagedPrivateEndpointArgs(
        String clusterName,
        String managedPrivateEndpointName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.managedPrivateEndpointName = Objects.requireNonNull(managedPrivateEndpointName, "expected parameter 'managedPrivateEndpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetManagedPrivateEndpointArgs() {
        this.clusterName = null;
        this.managedPrivateEndpointName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String managedPrivateEndpointName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedPrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.managedPrivateEndpointName = defaults.managedPrivateEndpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder managedPrivateEndpointName(String managedPrivateEndpointName) {
            this.managedPrivateEndpointName = Objects.requireNonNull(managedPrivateEndpointName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetManagedPrivateEndpointArgs build() {
            return new GetManagedPrivateEndpointArgs(clusterName, managedPrivateEndpointName, resourceGroupName);
        }
    }
}

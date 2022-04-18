// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryArgs Empty = new GetRegistryArgs();

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
      private final String registryName;

    public String registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetRegistryArgs(
        String registryName,
        String resourceGroupName) {
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetRegistryArgs() {
        this.registryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder registryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetRegistryArgs build() {
            return new GetRegistryArgs(registryName, resourceGroupName);
        }
    }
}

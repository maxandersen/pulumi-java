// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeploymentArgs Empty = new GetDeploymentArgs();

    /**
     * The name of the deployment.
     * 
     */
    @Import(name="deploymentName", required=true)
      private final String deploymentName;

    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDeploymentArgs(
        String deploymentName,
        String resourceGroupName) {
        this.deploymentName = Objects.requireNonNull(deploymentName, "expected parameter 'deploymentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDeploymentArgs() {
        this.deploymentName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder deploymentName(String deploymentName) {
            this.deploymentName = Objects.requireNonNull(deploymentName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetDeploymentArgs build() {
            return new GetDeploymentArgs(deploymentName, resourceGroupName);
        }
    }
}

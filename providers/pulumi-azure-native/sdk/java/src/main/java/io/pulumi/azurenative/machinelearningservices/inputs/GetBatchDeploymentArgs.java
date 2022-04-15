// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBatchDeploymentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBatchDeploymentArgs Empty = new GetBatchDeploymentArgs();

    /**
     * The identifier for the Batch deployments.
     * 
     */
    @Import(name="deploymentName", required=true)
      private final String deploymentName;

    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Endpoint name
     * 
     */
    @Import(name="endpointName", required=true)
      private final String endpointName;

    public String endpointName() {
        return this.endpointName;
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

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    public GetBatchDeploymentArgs(
        String deploymentName,
        String endpointName,
        String resourceGroupName,
        String workspaceName) {
        this.deploymentName = Objects.requireNonNull(deploymentName, "expected parameter 'deploymentName' to be non-null");
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetBatchDeploymentArgs() {
        this.deploymentName = null;
        this.endpointName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentName;
        private String endpointName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBatchDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.endpointName = defaults.endpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder deploymentName(String deploymentName) {
            this.deploymentName = Objects.requireNonNull(deploymentName);
            return this;
        }
        public Builder endpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetBatchDeploymentArgs build() {
            return new GetBatchDeploymentArgs(deploymentName, endpointName, resourceGroupName, workspaceName);
        }
    }
}

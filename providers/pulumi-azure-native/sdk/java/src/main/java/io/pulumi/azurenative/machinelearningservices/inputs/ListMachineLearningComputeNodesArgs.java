// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListMachineLearningComputeNodesArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListMachineLearningComputeNodesArgs Empty = new ListMachineLearningComputeNodesArgs();

    /**
     * Name of the Azure Machine Learning compute.
     * 
     */
    @Import(name="computeName", required=true)
      private final String computeName;

    public String computeName() {
        return this.computeName;
    }

    /**
     * Name of the resource group in which workspace is located.
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

    public ListMachineLearningComputeNodesArgs(
        String computeName,
        String resourceGroupName,
        String workspaceName) {
        this.computeName = Objects.requireNonNull(computeName, "expected parameter 'computeName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ListMachineLearningComputeNodesArgs() {
        this.computeName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMachineLearningComputeNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMachineLearningComputeNodesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeName = defaults.computeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder computeName(String computeName) {
            this.computeName = Objects.requireNonNull(computeName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public ListMachineLearningComputeNodesArgs build() {
            return new ListMachineLearningComputeNodesArgs(computeName, resourceGroupName, workspaceName);
        }
    }
}

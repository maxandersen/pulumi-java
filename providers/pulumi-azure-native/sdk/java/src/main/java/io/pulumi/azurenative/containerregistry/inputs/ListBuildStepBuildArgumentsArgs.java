// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListBuildStepBuildArgumentsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListBuildStepBuildArgumentsArgs Empty = new ListBuildStepBuildArgumentsArgs();

    /**
     * The name of the container registry build task.
     * 
     */
    @Import(name="buildTaskName", required=true)
      private final String buildTaskName;

    public String buildTaskName() {
        return this.buildTaskName;
    }

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

    /**
     * The name of a build step for a container registry build task.
     * 
     */
    @Import(name="stepName", required=true)
      private final String stepName;

    public String stepName() {
        return this.stepName;
    }

    public ListBuildStepBuildArgumentsArgs(
        String buildTaskName,
        String registryName,
        String resourceGroupName,
        String stepName) {
        this.buildTaskName = Objects.requireNonNull(buildTaskName, "expected parameter 'buildTaskName' to be non-null");
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.stepName = Objects.requireNonNull(stepName, "expected parameter 'stepName' to be non-null");
    }

    private ListBuildStepBuildArgumentsArgs() {
        this.buildTaskName = null;
        this.registryName = null;
        this.resourceGroupName = null;
        this.stepName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBuildStepBuildArgumentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String buildTaskName;
        private String registryName;
        private String resourceGroupName;
        private String stepName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListBuildStepBuildArgumentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildTaskName = defaults.buildTaskName;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.stepName = defaults.stepName;
        }

        public Builder buildTaskName(String buildTaskName) {
            this.buildTaskName = Objects.requireNonNull(buildTaskName);
            return this;
        }
        public Builder registryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder stepName(String stepName) {
            this.stepName = Objects.requireNonNull(stepName);
            return this;
        }        public ListBuildStepBuildArgumentsArgs build() {
            return new ListBuildStepBuildArgumentsArgs(buildTaskName, registryName, resourceGroupName, stepName);
        }
    }
}

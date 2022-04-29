// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelContainerArgs extends ResourceArgs {

    public static final ModelContainerArgs Empty = new ModelContainerArgs();

    /**
     * Container name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Container name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Additional attributes of the entity.
     * 
     */
    @Import(name="properties", required=true)
    private Output<com.pulumi.azurenative.machinelearningservices.inputs.ModelContainerArgs> properties;

    /**
     * @return Additional attributes of the entity.
     * 
     */
    public Output<com.pulumi.azurenative.machinelearningservices.inputs.ModelContainerArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private ModelContainerArgs() {}

    private ModelContainerArgs(ModelContainerArgs $) {
        this.name = $.name;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelContainerArgs $;

        public Builder() {
            $ = new ModelContainerArgs();
        }

        public Builder(ModelContainerArgs defaults) {
            $ = new ModelContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Container name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Container name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<com.pulumi.azurenative.machinelearningservices.inputs.ModelContainerArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(com.pulumi.azurenative.machinelearningservices.inputs.ModelContainerArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public ModelContainerArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}

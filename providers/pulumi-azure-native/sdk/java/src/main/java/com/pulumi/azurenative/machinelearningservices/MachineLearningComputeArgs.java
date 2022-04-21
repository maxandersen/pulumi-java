// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.inputs.AKSArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.AmlComputeArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.DataFactoryArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.DataLakeAnalyticsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.DatabricksArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.HDInsightArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.IdentityArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.SkuArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineLearningComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineLearningComputeArgs Empty = new MachineLearningComputeArgs();

    /**
     * Name of the Azure Machine Learning compute.
     * 
     */
    @Import(name="computeName")
    private @Nullable Output<String> computeName;

    public Optional<Output<String>> computeName() {
        return Optional.ofNullable(this.computeName);
    }

    /**
     * The identity of the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityArgs> identity;

    public Optional<Output<IdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Compute properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Object> properties;

    public Optional<Output<Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku of the workspace.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private MachineLearningComputeArgs() {}

    private MachineLearningComputeArgs(MachineLearningComputeArgs $) {
        this.computeName = $.computeName;
        this.identity = $.identity;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineLearningComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineLearningComputeArgs $;

        public Builder() {
            $ = new MachineLearningComputeArgs();
        }

        public Builder(MachineLearningComputeArgs defaults) {
            $ = new MachineLearningComputeArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeName(@Nullable Output<String> computeName) {
            $.computeName = computeName;
            return this;
        }

        public Builder computeName(String computeName) {
            return computeName(Output.of(computeName));
        }

        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(IdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(@Nullable Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Object properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public MachineLearningComputeArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.avs.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Name of the cluster in the private cloud
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The cluster size
     * 
     */
    @Import(name="clusterSize", required=true)
    private Output<Integer> clusterSize;

    public Output<Integer> clusterSize() {
        return this.clusterSize;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The cluster SKU
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku;
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.clusterName = $.clusterName;
        this.clusterSize = $.clusterSize;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder clusterSize(Output<Integer> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        public Builder clusterSize(Integer clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public ClusterArgs build() {
            $.clusterSize = Objects.requireNonNull($.clusterSize, "expected parameter 'clusterSize' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.avs.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Name of the cluster in the private cloud
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Name of the cluster in the private cloud
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The cluster size
     * 
     */
    @Import(name="clusterSize", required=true)
    private Output<Integer> clusterSize;

    /**
     * @return The cluster size
     * 
     */
    public Output<Integer> clusterSize() {
        return this.clusterSize;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return The name of the private cloud.
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
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
     * The cluster SKU
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    /**
     * @return The cluster SKU
     * 
     */
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

        /**
         * @param clusterName Name of the cluster in the private cloud
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the cluster in the private cloud
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param clusterSize The cluster size
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(Output<Integer> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param clusterSize The cluster size
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(Integer clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        /**
         * @param privateCloudName The name of the private cloud.
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName The name of the private cloud.
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
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
         * @param sku The cluster SKU
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The cluster SKU
         * 
         * @return builder
         * 
         */
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

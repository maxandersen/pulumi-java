// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight;

import com.pulumi.azurenative.hdinsight.inputs.ClusterCreatePropertiesArgs;
import com.pulumi.azurenative.hdinsight.inputs.ClusterIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The name of the cluster.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The identity of the cluster, if configured.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ClusterIdentityArgs> identity;

    /**
     * @return The identity of the cluster, if configured.
     * 
     */
    public Optional<Output<ClusterIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The location of the cluster.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the cluster.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The cluster create parameters.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ClusterCreatePropertiesArgs> properties;

    /**
     * @return The cluster create parameters.
     * 
     */
    public Optional<Output<ClusterCreatePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.clusterName = $.clusterName;
        this.identity = $.identity;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
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
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param identity The identity of the cluster, if configured.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ClusterIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The identity of the cluster, if configured.
         * 
         * @return builder
         * 
         */
        public Builder identity(ClusterIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The location of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties The cluster create parameters.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ClusterCreatePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The cluster create parameters.
         * 
         * @return builder
         * 
         */
        public Builder properties(ClusterCreatePropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ClusterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

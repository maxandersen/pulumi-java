// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CassandraDatacenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final CassandraDatacenterArgs Empty = new CassandraDatacenterArgs();

    /**
     * Determines whether availability zones are enabled. Defaults to `true`.
     * 
     */
    @Import(name="availabilityZonesEnabled")
    private @Nullable Output<Boolean> availabilityZonesEnabled;

    /**
     * @return Determines whether availability zones are enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> availabilityZonesEnabled() {
        return Optional.ofNullable(this.availabilityZonesEnabled);
    }

    /**
     * The ID of the Cassandra Cluster. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    @Import(name="cassandraClusterId", required=true)
    private Output<String> cassandraClusterId;

    /**
     * @return The ID of the Cassandra Cluster. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    public Output<String> cassandraClusterId() {
        return this.cassandraClusterId;
    }

    /**
     * The ID of the delegated management subnet for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    @Import(name="delegatedManagementSubnetId", required=true)
    private Output<String> delegatedManagementSubnetId;

    /**
     * @return The ID of the delegated management subnet for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    public Output<String> delegatedManagementSubnetId() {
        return this.delegatedManagementSubnetId;
    }

    /**
     * Determines the number of p30 disks that are attached to each node. Defaults to `4`.
     * 
     */
    @Import(name="diskCount")
    private @Nullable Output<Integer> diskCount;

    /**
     * @return Determines the number of p30 disks that are attached to each node. Defaults to `4`.
     * 
     */
    public Optional<Output<Integer>> diskCount() {
        return Optional.ofNullable(this.diskCount);
    }

    /**
     * The Azure Region where the Cassandra Datacenter should exist. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Cassandra Datacenter should exist. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of nodes the Cassandra Datacenter should have. The number should be equal or greater than `3`. Defaults to `3`.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return The number of nodes the Cassandra Datacenter should have. The number should be equal or greater than `3`. Defaults to `3`.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    /**
     * Determines the selected sku. Defaults to Standard_DS14_v2.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return Determines the selected sku. Defaults to Standard_DS14_v2.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    private CassandraDatacenterArgs() {}

    private CassandraDatacenterArgs(CassandraDatacenterArgs $) {
        this.availabilityZonesEnabled = $.availabilityZonesEnabled;
        this.cassandraClusterId = $.cassandraClusterId;
        this.delegatedManagementSubnetId = $.delegatedManagementSubnetId;
        this.diskCount = $.diskCount;
        this.location = $.location;
        this.name = $.name;
        this.nodeCount = $.nodeCount;
        this.skuName = $.skuName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CassandraDatacenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CassandraDatacenterArgs $;

        public Builder() {
            $ = new CassandraDatacenterArgs();
        }

        public Builder(CassandraDatacenterArgs defaults) {
            $ = new CassandraDatacenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZonesEnabled Determines whether availability zones are enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZonesEnabled(@Nullable Output<Boolean> availabilityZonesEnabled) {
            $.availabilityZonesEnabled = availabilityZonesEnabled;
            return this;
        }

        /**
         * @param availabilityZonesEnabled Determines whether availability zones are enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZonesEnabled(Boolean availabilityZonesEnabled) {
            return availabilityZonesEnabled(Output.of(availabilityZonesEnabled));
        }

        /**
         * @param cassandraClusterId The ID of the Cassandra Cluster. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder cassandraClusterId(Output<String> cassandraClusterId) {
            $.cassandraClusterId = cassandraClusterId;
            return this;
        }

        /**
         * @param cassandraClusterId The ID of the Cassandra Cluster. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder cassandraClusterId(String cassandraClusterId) {
            return cassandraClusterId(Output.of(cassandraClusterId));
        }

        /**
         * @param delegatedManagementSubnetId The ID of the delegated management subnet for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder delegatedManagementSubnetId(Output<String> delegatedManagementSubnetId) {
            $.delegatedManagementSubnetId = delegatedManagementSubnetId;
            return this;
        }

        /**
         * @param delegatedManagementSubnetId The ID of the delegated management subnet for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder delegatedManagementSubnetId(String delegatedManagementSubnetId) {
            return delegatedManagementSubnetId(Output.of(delegatedManagementSubnetId));
        }

        /**
         * @param diskCount Determines the number of p30 disks that are attached to each node. Defaults to `4`.
         * 
         * @return builder
         * 
         */
        public Builder diskCount(@Nullable Output<Integer> diskCount) {
            $.diskCount = diskCount;
            return this;
        }

        /**
         * @param diskCount Determines the number of p30 disks that are attached to each node. Defaults to `4`.
         * 
         * @return builder
         * 
         */
        public Builder diskCount(Integer diskCount) {
            return diskCount(Output.of(diskCount));
        }

        /**
         * @param location The Azure Region where the Cassandra Datacenter should exist. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Cassandra Datacenter should exist. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Cassandra Datacenter. Changing this forces a new Cassandra Datacenter to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeCount The number of nodes the Cassandra Datacenter should have. The number should be equal or greater than `3`. Defaults to `3`.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount The number of nodes the Cassandra Datacenter should have. The number should be equal or greater than `3`. Defaults to `3`.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param skuName Determines the selected sku. Defaults to Standard_DS14_v2.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName Determines the selected sku. Defaults to Standard_DS14_v2.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        public CassandraDatacenterArgs build() {
            $.cassandraClusterId = Objects.requireNonNull($.cassandraClusterId, "expected parameter 'cassandraClusterId' to be non-null");
            $.delegatedManagementSubnetId = Objects.requireNonNull($.delegatedManagementSubnetId, "expected parameter 'delegatedManagementSubnetId' to be non-null");
            return $;
        }
    }

}

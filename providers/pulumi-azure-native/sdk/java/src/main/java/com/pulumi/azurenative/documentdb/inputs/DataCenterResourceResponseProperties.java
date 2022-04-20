// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.SeedNodeResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a managed Cassandra data center.
 * 
 */
public final class DataCenterResourceResponseProperties extends com.pulumi.resources.InvokeArgs {

    public static final DataCenterResourceResponseProperties Empty = new DataCenterResourceResponseProperties();

    /**
     * A fragment of a cassandra.yaml configuration file to be included in the cassandra.yaml for all nodes in this data center. The fragment should be Base64 encoded, and only a subset of keys are allowed.
     * 
     */
    @Import(name="base64EncodedCassandraYamlFragment")
      private final @Nullable String base64EncodedCassandraYamlFragment;

    public Optional<String> base64EncodedCassandraYamlFragment() {
        return this.base64EncodedCassandraYamlFragment == null ? Optional.empty() : Optional.ofNullable(this.base64EncodedCassandraYamlFragment);
    }

    /**
     * The region this data center should be created in.
     * 
     */
    @Import(name="dataCenterLocation")
      private final @Nullable String dataCenterLocation;

    public Optional<String> dataCenterLocation() {
        return this.dataCenterLocation == null ? Optional.empty() : Optional.ofNullable(this.dataCenterLocation);
    }

    /**
     * Resource id of a subnet the nodes in this data center should have their network interfaces connected to. The subnet must be in the same region specified in &#39;dataCenterLocation&#39; and must be able to route to the subnet specified in the cluster&#39;s &#39;delegatedManagementSubnetId&#39; property. This resource id will be of the form &#39;/subscriptions/&lt;subscription id&gt;/resourceGroups/&lt;resource group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual network&gt;/subnets/&lt;subnet&gt;&#39;.
     * 
     */
    @Import(name="delegatedSubnetId")
      private final @Nullable String delegatedSubnetId;

    public Optional<String> delegatedSubnetId() {
        return this.delegatedSubnetId == null ? Optional.empty() : Optional.ofNullable(this.delegatedSubnetId);
    }

    /**
     * The number of nodes the data center should have. This is the desired number. After it is set, it may take some time for the data center to be scaled to match. To monitor the number of nodes and their status, use the fetchNodeStatus method on the cluster.
     * 
     */
    @Import(name="nodeCount")
      private final @Nullable Integer nodeCount;

    public Optional<Integer> nodeCount() {
        return this.nodeCount == null ? Optional.empty() : Optional.ofNullable(this.nodeCount);
    }

    /**
     * The status of the resource at the time the operation was called.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * IP addresses for seed nodes in this data center. This is for reference. Generally you will want to use the seedNodes property on the cluster, which aggregates the seed nodes from all data centers in the cluster.
     * 
     */
    @Import(name="seedNodes", required=true)
      private final List<SeedNodeResponse> seedNodes;

    public List<SeedNodeResponse> seedNodes() {
        return this.seedNodes;
    }

    public DataCenterResourceResponseProperties(
        @Nullable String base64EncodedCassandraYamlFragment,
        @Nullable String dataCenterLocation,
        @Nullable String delegatedSubnetId,
        @Nullable Integer nodeCount,
        @Nullable String provisioningState,
        List<SeedNodeResponse> seedNodes) {
        this.base64EncodedCassandraYamlFragment = base64EncodedCassandraYamlFragment;
        this.dataCenterLocation = dataCenterLocation;
        this.delegatedSubnetId = delegatedSubnetId;
        this.nodeCount = nodeCount;
        this.provisioningState = provisioningState;
        this.seedNodes = Objects.requireNonNull(seedNodes, "expected parameter 'seedNodes' to be non-null");
    }

    private DataCenterResourceResponseProperties() {
        this.base64EncodedCassandraYamlFragment = null;
        this.dataCenterLocation = null;
        this.delegatedSubnetId = null;
        this.nodeCount = null;
        this.provisioningState = null;
        this.seedNodes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCenterResourceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String base64EncodedCassandraYamlFragment;
        private @Nullable String dataCenterLocation;
        private @Nullable String delegatedSubnetId;
        private @Nullable Integer nodeCount;
        private @Nullable String provisioningState;
        private List<SeedNodeResponse> seedNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCenterResourceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base64EncodedCassandraYamlFragment = defaults.base64EncodedCassandraYamlFragment;
    	      this.dataCenterLocation = defaults.dataCenterLocation;
    	      this.delegatedSubnetId = defaults.delegatedSubnetId;
    	      this.nodeCount = defaults.nodeCount;
    	      this.provisioningState = defaults.provisioningState;
    	      this.seedNodes = defaults.seedNodes;
        }

        public Builder base64EncodedCassandraYamlFragment(@Nullable String base64EncodedCassandraYamlFragment) {
            this.base64EncodedCassandraYamlFragment = base64EncodedCassandraYamlFragment;
            return this;
        }
        public Builder dataCenterLocation(@Nullable String dataCenterLocation) {
            this.dataCenterLocation = dataCenterLocation;
            return this;
        }
        public Builder delegatedSubnetId(@Nullable String delegatedSubnetId) {
            this.delegatedSubnetId = delegatedSubnetId;
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder seedNodes(List<SeedNodeResponse> seedNodes) {
            this.seedNodes = Objects.requireNonNull(seedNodes);
            return this;
        }
        public Builder seedNodes(SeedNodeResponse... seedNodes) {
            return seedNodes(List.of(seedNodes));
        }        public DataCenterResourceResponseProperties build() {
            return new DataCenterResourceResponseProperties(base64EncodedCassandraYamlFragment, dataCenterLocation, delegatedSubnetId, nodeCount, provisioningState, seedNodes);
        }
    }
}

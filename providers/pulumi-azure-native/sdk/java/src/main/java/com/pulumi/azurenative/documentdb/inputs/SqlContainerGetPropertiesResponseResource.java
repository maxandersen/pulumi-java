// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.ConflictResolutionPolicyResponse;
import com.pulumi.azurenative.documentdb.inputs.ContainerPartitionKeyResponse;
import com.pulumi.azurenative.documentdb.inputs.IndexingPolicyResponse;
import com.pulumi.azurenative.documentdb.inputs.UniqueKeyPolicyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlContainerGetPropertiesResponseResource extends com.pulumi.resources.InvokeArgs {

    public static final SqlContainerGetPropertiesResponseResource Empty = new SqlContainerGetPropertiesResponseResource();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
      private final @Nullable Double analyticalStorageTtl;

    public Optional<Double> analyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Optional.empty() : Optional.ofNullable(this.analyticalStorageTtl);
    }

    /**
     * The conflict resolution policy for the container.
     * 
     */
    @Import(name="conflictResolutionPolicy")
      private final @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;

    public Optional<ConflictResolutionPolicyResponse> conflictResolutionPolicy() {
        return this.conflictResolutionPolicy == null ? Optional.empty() : Optional.ofNullable(this.conflictResolutionPolicy);
    }

    /**
     * Default time to live
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Integer defaultTtl;

    public Optional<Integer> defaultTtl() {
        return this.defaultTtl == null ? Optional.empty() : Optional.ofNullable(this.defaultTtl);
    }

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Name of the Cosmos DB SQL container
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    @Import(name="indexingPolicy")
      private final @Nullable IndexingPolicyResponse indexingPolicy;

    public Optional<IndexingPolicyResponse> indexingPolicy() {
        return this.indexingPolicy == null ? Optional.empty() : Optional.ofNullable(this.indexingPolicy);
    }

    /**
     * The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable ContainerPartitionKeyResponse partitionKey;

    public Optional<ContainerPartitionKeyResponse> partitionKey() {
        return this.partitionKey == null ? Optional.empty() : Optional.ofNullable(this.partitionKey);
    }

    /**
     * A system generated property. A unique identifier.
     * 
     */
    @Import(name="rid", required=true)
      private final String rid;

    public String rid() {
        return this.rid;
    }

    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    @Import(name="ts", required=true)
      private final Double ts;

    public Double ts() {
        return this.ts;
    }

    /**
     * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    @Import(name="uniqueKeyPolicy")
      private final @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

    public Optional<UniqueKeyPolicyResponse> uniqueKeyPolicy() {
        return this.uniqueKeyPolicy == null ? Optional.empty() : Optional.ofNullable(this.uniqueKeyPolicy);
    }

    public SqlContainerGetPropertiesResponseResource(
        @Nullable Double analyticalStorageTtl,
        @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy,
        @Nullable Integer defaultTtl,
        String etag,
        String id,
        @Nullable IndexingPolicyResponse indexingPolicy,
        @Nullable ContainerPartitionKeyResponse partitionKey,
        String rid,
        Double ts,
        @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.defaultTtl = defaultTtl;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.indexingPolicy = indexingPolicy;
        this.partitionKey = partitionKey;
        this.rid = Objects.requireNonNull(rid, "expected parameter 'rid' to be non-null");
        this.ts = Objects.requireNonNull(ts, "expected parameter 'ts' to be non-null");
        this.uniqueKeyPolicy = uniqueKeyPolicy;
    }

    private SqlContainerGetPropertiesResponseResource() {
        this.analyticalStorageTtl = null;
        this.conflictResolutionPolicy = null;
        this.defaultTtl = null;
        this.etag = null;
        this.id = null;
        this.indexingPolicy = null;
        this.partitionKey = null;
        this.rid = null;
        this.ts = null;
        this.uniqueKeyPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double analyticalStorageTtl;
        private @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;
        private @Nullable Integer defaultTtl;
        private String etag;
        private String id;
        private @Nullable IndexingPolicyResponse indexingPolicy;
        private @Nullable ContainerPartitionKeyResponse partitionKey;
        private String rid;
        private Double ts;
        private @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.indexingPolicy = defaults.indexingPolicy;
    	      this.partitionKey = defaults.partitionKey;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
    	      this.uniqueKeyPolicy = defaults.uniqueKeyPolicy;
        }

        public Builder analyticalStorageTtl(@Nullable Double analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }
        public Builder conflictResolutionPolicy(@Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder indexingPolicy(@Nullable IndexingPolicyResponse indexingPolicy) {
            this.indexingPolicy = indexingPolicy;
            return this;
        }
        public Builder partitionKey(@Nullable ContainerPartitionKeyResponse partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder rid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }
        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }
        public Builder uniqueKeyPolicy(@Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
            this.uniqueKeyPolicy = uniqueKeyPolicy;
            return this;
        }        public SqlContainerGetPropertiesResponseResource build() {
            return new SqlContainerGetPropertiesResponseResource(analyticalStorageTtl, conflictResolutionPolicy, defaultTtl, etag, id, indexingPolicy, partitionKey, rid, ts, uniqueKeyPolicy);
        }
    }
}

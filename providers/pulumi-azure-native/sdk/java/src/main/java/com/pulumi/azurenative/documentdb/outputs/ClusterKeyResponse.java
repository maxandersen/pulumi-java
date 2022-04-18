// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterKeyResponse {
    /**
     * Name of the Cosmos DB Cassandra table cluster key
     * 
     */
    private final @Nullable String name;
    /**
     * Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc"
     * 
     */
    private final @Nullable String orderBy;

    @CustomType.Constructor
    private ClusterKeyResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("orderBy") @Nullable String orderBy) {
        this.name = name;
        this.orderBy = orderBy;
    }

    /**
     * Name of the Cosmos DB Cassandra table cluster key
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc"
     * 
    */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String orderBy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.orderBy = defaults.orderBy;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder orderBy(@Nullable String orderBy) {
            this.orderBy = orderBy;
            return this;
        }        public ClusterKeyResponse build() {
            return new ClusterKeyResponse(name, orderBy);
        }
    }
}

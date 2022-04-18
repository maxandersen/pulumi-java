// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure Cosmos DB Mongo DB Resource.
 * 
 */
public final class PrivilegeResponseResource extends com.pulumi.resources.InvokeArgs {

    public static final PrivilegeResponseResource Empty = new PrivilegeResponseResource();

    /**
     * The collection name the role is applied.
     * 
     */
    @Import(name="collection")
      private final @Nullable String collection;

    public Optional<String> collection() {
        return this.collection == null ? Optional.empty() : Optional.ofNullable(this.collection);
    }

    /**
     * The database name the role is applied.
     * 
     */
    @Import(name="db")
      private final @Nullable String db;

    public Optional<String> db() {
        return this.db == null ? Optional.empty() : Optional.ofNullable(this.db);
    }

    public PrivilegeResponseResource(
        @Nullable String collection,
        @Nullable String db) {
        this.collection = collection;
        this.db = db;
    }

    private PrivilegeResponseResource() {
        this.collection = null;
        this.db = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivilegeResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String collection;
        private @Nullable String db;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivilegeResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.db = defaults.db;
        }

        public Builder collection(@Nullable String collection) {
            this.collection = collection;
            return this;
        }
        public Builder db(@Nullable String db) {
            this.db = db;
            return this;
        }        public PrivilegeResponseResource build() {
            return new PrivilegeResponseResource(collection, db);
        }
    }
}

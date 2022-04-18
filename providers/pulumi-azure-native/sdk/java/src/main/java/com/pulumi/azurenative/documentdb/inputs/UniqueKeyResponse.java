// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The unique key on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
 * 
 */
public final class UniqueKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final UniqueKeyResponse Empty = new UniqueKeyResponse();

    /**
     * List of paths must be unique for each document in the Azure Cosmos DB service
     * 
     */
    @Import(name="paths")
      private final @Nullable List<String> paths;

    public List<String> paths() {
        return this.paths == null ? List.of() : this.paths;
    }

    public UniqueKeyResponse(@Nullable List<String> paths) {
        this.paths = paths;
    }

    private UniqueKeyResponse() {
        this.paths = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniqueKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(UniqueKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        public Builder paths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }        public UniqueKeyResponse build() {
            return new UniqueKeyResponse(paths);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.IndexesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The paths that are included in indexing
 * 
 */
public final class IncludedPathResponse extends com.pulumi.resources.InvokeArgs {

    public static final IncludedPathResponse Empty = new IncludedPathResponse();

    /**
     * List of indexes for this path
     * 
     */
    @Import(name="indexes")
      private final @Nullable List<IndexesResponse> indexes;

    public List<IndexesResponse> indexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @Import(name="path")
      private final @Nullable String path;

    public Optional<String> path() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    public IncludedPathResponse(
        @Nullable List<IndexesResponse> indexes,
        @Nullable String path) {
        this.indexes = indexes;
        this.path = path;
    }

    private IncludedPathResponse() {
        this.indexes = List.of();
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncludedPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IndexesResponse> indexes;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(IncludedPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexes = defaults.indexes;
    	      this.path = defaults.path;
        }

        public Builder indexes(@Nullable List<IndexesResponse> indexes) {
            this.indexes = indexes;
            return this;
        }
        public Builder indexes(IndexesResponse... indexes) {
            return indexes(List.of(indexes));
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }        public IncludedPathResponse build() {
            return new IncludedPathResponse(indexes, path);
        }
    }
}

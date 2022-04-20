// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpatialSpecResponse {
    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    private final @Nullable String path;
    /**
     * List of path&#39;s spatial type
     * 
     */
    private final @Nullable List<String> types;

    @CustomType.Constructor
    private SpatialSpecResponse(
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("types") @Nullable List<String> types) {
        this.path = path;
        this.types = types;
    }

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
    */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * List of path&#39;s spatial type
     * 
    */
    public List<String> types() {
        return this.types == null ? List.of() : this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpatialSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String path;
        private @Nullable List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(SpatialSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.types = defaults.types;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder types(@Nullable List<String> types) {
            this.types = types;
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }        public SpatialSpecResponse build() {
            return new SpatialSpecResponse(path, types);
        }
    }
}

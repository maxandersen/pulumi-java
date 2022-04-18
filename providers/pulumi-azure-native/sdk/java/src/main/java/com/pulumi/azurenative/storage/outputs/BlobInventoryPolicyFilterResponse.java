// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlobInventoryPolicyFilterResponse {
    /**
     * An array of predefined enum values. Valid values include blockBlob, appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     * 
     */
    private final List<String> blobTypes;
    /**
     * Includes blob versions in blob inventory when value set to true.
     * 
     */
    private final @Nullable Boolean includeBlobVersions;
    /**
     * Includes blob snapshots in blob inventory when value set to true.
     * 
     */
    private final @Nullable Boolean includeSnapshots;
    /**
     * An array of strings for blob prefixes to be matched.
     * 
     */
    private final @Nullable List<String> prefixMatch;

    @CustomType.Constructor
    private BlobInventoryPolicyFilterResponse(
        @CustomType.Parameter("blobTypes") List<String> blobTypes,
        @CustomType.Parameter("includeBlobVersions") @Nullable Boolean includeBlobVersions,
        @CustomType.Parameter("includeSnapshots") @Nullable Boolean includeSnapshots,
        @CustomType.Parameter("prefixMatch") @Nullable List<String> prefixMatch) {
        this.blobTypes = blobTypes;
        this.includeBlobVersions = includeBlobVersions;
        this.includeSnapshots = includeSnapshots;
        this.prefixMatch = prefixMatch;
    }

    /**
     * An array of predefined enum values. Valid values include blockBlob, appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     * 
    */
    public List<String> blobTypes() {
        return this.blobTypes;
    }
    /**
     * Includes blob versions in blob inventory when value set to true.
     * 
    */
    public Optional<Boolean> includeBlobVersions() {
        return Optional.ofNullable(this.includeBlobVersions);
    }
    /**
     * Includes blob snapshots in blob inventory when value set to true.
     * 
    */
    public Optional<Boolean> includeSnapshots() {
        return Optional.ofNullable(this.includeSnapshots);
    }
    /**
     * An array of strings for blob prefixes to be matched.
     * 
    */
    public List<String> prefixMatch() {
        return this.prefixMatch == null ? List.of() : this.prefixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> blobTypes;
        private @Nullable Boolean includeBlobVersions;
        private @Nullable Boolean includeSnapshots;
        private @Nullable List<String> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobTypes = defaults.blobTypes;
    	      this.includeBlobVersions = defaults.includeBlobVersions;
    	      this.includeSnapshots = defaults.includeSnapshots;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder blobTypes(List<String> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }
        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }
        public Builder includeBlobVersions(@Nullable Boolean includeBlobVersions) {
            this.includeBlobVersions = includeBlobVersions;
            return this;
        }
        public Builder includeSnapshots(@Nullable Boolean includeSnapshots) {
            this.includeSnapshots = includeSnapshots;
            return this;
        }
        public Builder prefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }
        public Builder prefixMatch(String... prefixMatch) {
            return prefixMatch(List.of(prefixMatch));
        }        public BlobInventoryPolicyFilterResponse build() {
            return new BlobInventoryPolicyFilterResponse(blobTypes, includeBlobVersions, includeSnapshots, prefixMatch);
        }
    }
}

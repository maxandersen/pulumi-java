// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild_v1.outputs.RepoSourceResponse;
import com.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceManifestResponse;
import com.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceResponse;
import java.util.Objects;

@CustomType
public final class SourceResponse {
    /**
     * @return If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    private final RepoSourceResponse repoSource;
    /**
     * @return If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    private final StorageSourceResponse storageSource;
    /**
     * @return If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
     * 
     */
    private final StorageSourceManifestResponse storageSourceManifest;

    @CustomType.Constructor
    private SourceResponse(
        @CustomType.Parameter("repoSource") RepoSourceResponse repoSource,
        @CustomType.Parameter("storageSource") StorageSourceResponse storageSource,
        @CustomType.Parameter("storageSourceManifest") StorageSourceManifestResponse storageSourceManifest) {
        this.repoSource = repoSource;
        this.storageSource = storageSource;
        this.storageSourceManifest = storageSourceManifest;
    }

    /**
     * @return If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    public RepoSourceResponse repoSource() {
        return this.repoSource;
    }
    /**
     * @return If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    public StorageSourceResponse storageSource() {
        return this.storageSource;
    }
    /**
     * @return If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
     * 
     */
    public StorageSourceManifestResponse storageSourceManifest() {
        return this.storageSourceManifest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoSourceResponse repoSource;
        private StorageSourceResponse storageSource;
        private StorageSourceManifestResponse storageSourceManifest;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
    	      this.storageSourceManifest = defaults.storageSourceManifest;
        }

        public Builder repoSource(RepoSourceResponse repoSource) {
            this.repoSource = Objects.requireNonNull(repoSource);
            return this;
        }
        public Builder storageSource(StorageSourceResponse storageSource) {
            this.storageSource = Objects.requireNonNull(storageSource);
            return this;
        }
        public Builder storageSourceManifest(StorageSourceManifestResponse storageSourceManifest) {
            this.storageSourceManifest = Objects.requireNonNull(storageSourceManifest);
            return this;
        }        public SourceResponse build() {
            return new SourceResponse(repoSource, storageSource, storageSourceManifest);
        }
    }
}

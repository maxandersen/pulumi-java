// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.RepoSourceResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceManifestResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceResponse;
import java.util.Objects;


/**
 * Location of the source in a supported storage service.
 * 
 */
public final class SourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    /**
     * If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    @Import(name="repoSource", required=true)
      private final RepoSourceResponse repoSource;

    public RepoSourceResponse repoSource() {
        return this.repoSource;
    }

    /**
     * If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    @Import(name="storageSource", required=true)
      private final StorageSourceResponse storageSource;

    public StorageSourceResponse storageSource() {
        return this.storageSource;
    }

    /**
     * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
     * 
     */
    @Import(name="storageSourceManifest", required=true)
      private final StorageSourceManifestResponse storageSourceManifest;

    public StorageSourceManifestResponse storageSourceManifest() {
        return this.storageSourceManifest;
    }

    public SourceResponse(
        RepoSourceResponse repoSource,
        StorageSourceResponse storageSource,
        StorageSourceManifestResponse storageSourceManifest) {
        this.repoSource = Objects.requireNonNull(repoSource, "expected parameter 'repoSource' to be non-null");
        this.storageSource = Objects.requireNonNull(storageSource, "expected parameter 'storageSource' to be non-null");
        this.storageSourceManifest = Objects.requireNonNull(storageSourceManifest, "expected parameter 'storageSourceManifest' to be non-null");
    }

    private SourceResponse() {
        this.repoSource = null;
        this.storageSource = null;
        this.storageSourceManifest = null;
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

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.RepoSourceArgs;
import com.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceArgs;
import com.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceManifestArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of the source in a supported storage service.
 * 
 */
public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    @Import(name="repoSource")
    private @Nullable Output<RepoSourceArgs> repoSource;

    /**
     * @return If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    public Optional<Output<RepoSourceArgs>> repoSource() {
        return Optional.ofNullable(this.repoSource);
    }

    /**
     * If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    @Import(name="storageSource")
    private @Nullable Output<StorageSourceArgs> storageSource;

    /**
     * @return If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    public Optional<Output<StorageSourceArgs>> storageSource() {
        return Optional.ofNullable(this.storageSource);
    }

    /**
     * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
     * 
     */
    @Import(name="storageSourceManifest")
    private @Nullable Output<StorageSourceManifestArgs> storageSourceManifest;

    /**
     * @return If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
     * 
     */
    public Optional<Output<StorageSourceManifestArgs>> storageSourceManifest() {
        return Optional.ofNullable(this.storageSourceManifest);
    }

    private SourceArgs() {}

    private SourceArgs(SourceArgs $) {
        this.repoSource = $.repoSource;
        this.storageSource = $.storageSource;
        this.storageSourceManifest = $.storageSourceManifest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceArgs $;

        public Builder() {
            $ = new SourceArgs();
        }

        public Builder(SourceArgs defaults) {
            $ = new SourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repoSource If provided, get the source from this location in a Cloud Source Repository.
         * 
         * @return builder
         * 
         */
        public Builder repoSource(@Nullable Output<RepoSourceArgs> repoSource) {
            $.repoSource = repoSource;
            return this;
        }

        /**
         * @param repoSource If provided, get the source from this location in a Cloud Source Repository.
         * 
         * @return builder
         * 
         */
        public Builder repoSource(RepoSourceArgs repoSource) {
            return repoSource(Output.of(repoSource));
        }

        /**
         * @param storageSource If provided, get the source from this location in Google Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder storageSource(@Nullable Output<StorageSourceArgs> storageSource) {
            $.storageSource = storageSource;
            return this;
        }

        /**
         * @param storageSource If provided, get the source from this location in Google Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder storageSource(StorageSourceArgs storageSource) {
            return storageSource(Output.of(storageSource));
        }

        /**
         * @param storageSourceManifest If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
         * 
         * @return builder
         * 
         */
        public Builder storageSourceManifest(@Nullable Output<StorageSourceManifestArgs> storageSourceManifest) {
            $.storageSourceManifest = storageSourceManifest;
            return this;
        }

        /**
         * @param storageSourceManifest If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
         * 
         * @return builder
         * 
         */
        public Builder storageSourceManifest(StorageSourceManifestArgs storageSourceManifest) {
            return storageSourceManifest(Output.of(storageSourceManifest));
        }

        public SourceArgs build() {
            return $;
        }
    }

}

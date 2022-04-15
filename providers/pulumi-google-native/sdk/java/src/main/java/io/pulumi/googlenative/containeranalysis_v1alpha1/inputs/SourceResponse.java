// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.RepoSourceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.StorageSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Source describes the location of the source used for the build.
 * 
 */
public final class SourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    @Import(name="additionalContexts", required=true)
      private final List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts;

    public List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts() {
        return this.additionalContexts;
    }

    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    @Import(name="artifactStorageSource", required=true)
      private final StorageSourceResponse artifactStorageSource;

    public StorageSourceResponse artifactStorageSource() {
        return this.artifactStorageSource;
    }

    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    @Import(name="context", required=true)
      private final GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context;

    public GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context() {
        return this.context;
    }

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    @Import(name="fileHashes", required=true)
      private final Map<String,String> fileHashes;

    public Map<String,String> fileHashes() {
        return this.fileHashes;
    }

    /**
     * If provided, get source from this location in a Cloud Repo.
     * 
     */
    @Import(name="repoSource", required=true)
      private final RepoSourceResponse repoSource;

    public RepoSourceResponse repoSource() {
        return this.repoSource;
    }

    /**
     * If provided, get the source from this location in in Google Cloud Storage.
     * 
     */
    @Import(name="storageSource", required=true)
      private final StorageSourceResponse storageSource;

    public StorageSourceResponse storageSource() {
        return this.storageSource;
    }

    public SourceResponse(
        List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts,
        StorageSourceResponse artifactStorageSource,
        GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context,
        Map<String,String> fileHashes,
        RepoSourceResponse repoSource,
        StorageSourceResponse storageSource) {
        this.additionalContexts = Objects.requireNonNull(additionalContexts, "expected parameter 'additionalContexts' to be non-null");
        this.artifactStorageSource = Objects.requireNonNull(artifactStorageSource, "expected parameter 'artifactStorageSource' to be non-null");
        this.context = Objects.requireNonNull(context, "expected parameter 'context' to be non-null");
        this.fileHashes = Objects.requireNonNull(fileHashes, "expected parameter 'fileHashes' to be non-null");
        this.repoSource = Objects.requireNonNull(repoSource, "expected parameter 'repoSource' to be non-null");
        this.storageSource = Objects.requireNonNull(storageSource, "expected parameter 'storageSource' to be non-null");
    }

    private SourceResponse() {
        this.additionalContexts = List.of();
        this.artifactStorageSource = null;
        this.context = null;
        this.fileHashes = Map.of();
        this.repoSource = null;
        this.storageSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts;
        private StorageSourceResponse artifactStorageSource;
        private GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context;
        private Map<String,String> fileHashes;
        private RepoSourceResponse repoSource;
        private StorageSourceResponse storageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalContexts = defaults.additionalContexts;
    	      this.artifactStorageSource = defaults.artifactStorageSource;
    	      this.context = defaults.context;
    	      this.fileHashes = defaults.fileHashes;
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
        }

        public Builder additionalContexts(List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts) {
            this.additionalContexts = Objects.requireNonNull(additionalContexts);
            return this;
        }
        public Builder additionalContexts(GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse... additionalContexts) {
            return additionalContexts(List.of(additionalContexts));
        }
        public Builder artifactStorageSource(StorageSourceResponse artifactStorageSource) {
            this.artifactStorageSource = Objects.requireNonNull(artifactStorageSource);
            return this;
        }
        public Builder context(GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }
        public Builder fileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }
        public Builder repoSource(RepoSourceResponse repoSource) {
            this.repoSource = Objects.requireNonNull(repoSource);
            return this;
        }
        public Builder storageSource(StorageSourceResponse storageSource) {
            this.storageSource = Objects.requireNonNull(storageSource);
            return this;
        }        public SourceResponse build() {
            return new SourceResponse(additionalContexts, artifactStorageSource, context, fileHashes, repoSource, storageSource);
        }
    }
}

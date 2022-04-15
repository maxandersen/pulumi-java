// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * GitFileSource describes a file within a (possibly remote) code repository.
 * 
 */
public final class GitFileSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GitFileSourceResponse Empty = new GitFileSourceResponse();

    /**
     * The path of the file, with the repo root as the root of the path.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    /**
     * See RepoType above.
     * 
     */
    @Import(name="repoType", required=true)
      private final String repoType;

    public String repoType() {
        return this.repoType;
    }

    /**
     * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
     * 
     */
    @Import(name="revision", required=true)
      private final String revision;

    public String revision() {
        return this.revision;
    }

    /**
     * The URI of the repo (optional). If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public GitFileSourceResponse(
        String path,
        String repoType,
        String revision,
        String uri) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.repoType = Objects.requireNonNull(repoType, "expected parameter 'repoType' to be non-null");
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GitFileSourceResponse() {
        this.path = null;
        this.repoType = null;
        this.revision = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitFileSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String repoType;
        private String revision;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitFileSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.repoType = defaults.repoType;
    	      this.revision = defaults.revision;
    	      this.uri = defaults.uri;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder repoType(String repoType) {
            this.repoType = Objects.requireNonNull(repoType);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GitFileSourceResponse build() {
            return new GitFileSourceResponse(path, repoType, revision, uri);
        }
    }
}

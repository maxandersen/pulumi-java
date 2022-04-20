// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * GitRepoSource describes a repo and ref of a code repository.
 * 
 */
public final class GitRepoSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GitRepoSourceResponse Empty = new GitRepoSourceResponse();

    /**
     * The branch or tag to use. Must start with &#34;refs/&#34; (required).
     * 
     */
    @Import(name="ref", required=true)
      private final String ref;

    public String ref() {
        return this.ref;
    }

    /**
     * See RepoType below.
     * 
     */
    @Import(name="repoType", required=true)
      private final String repoType;

    public String repoType() {
        return this.repoType;
    }

    /**
     * The URI of the repo (required).
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public GitRepoSourceResponse(
        String ref,
        String repoType,
        String uri) {
        this.ref = Objects.requireNonNull(ref, "expected parameter 'ref' to be non-null");
        this.repoType = Objects.requireNonNull(repoType, "expected parameter 'repoType' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GitRepoSourceResponse() {
        this.ref = null;
        this.repoType = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ref;
        private String repoType;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
    	      this.repoType = defaults.repoType;
    	      this.uri = defaults.uri;
        }

        public Builder ref(String ref) {
            this.ref = Objects.requireNonNull(ref);
            return this;
        }
        public Builder repoType(String repoType) {
            this.repoType = Objects.requireNonNull(repoType);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GitRepoSourceResponse build() {
            return new GitRepoSourceResponse(ref, repoType, uri);
        }
    }
}

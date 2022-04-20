// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.cloudbuild_v1.inputs.PullRequestFilterArgs;
import com.pulumi.googlenative.cloudbuild_v1.inputs.PushFilterArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
 * 
 */
public final class BitbucketServerTriggerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BitbucketServerTriggerConfigArgs Empty = new BitbucketServerTriggerConfigArgs();

    /**
     * The Bitbucket server config resource that this trigger config maps to.
     * 
     */
    @Import(name="bitbucketServerConfigResource", required=true)
      private final Output<String> bitbucketServerConfigResource;

    public Output<String> bitbucketServerConfigResource() {
        return this.bitbucketServerConfigResource;
    }

    /**
     * Key of the project that the repo is in. For example: The key for http://mybitbucket.server/projects/TEST/repos/test-repo is &#34;TEST&#34;.
     * 
     */
    @Import(name="projectKey", required=true)
      private final Output<String> projectKey;

    public Output<String> projectKey() {
        return this.projectKey;
    }

    /**
     * Filter to match changes in pull requests.
     * 
     */
    @Import(name="pullRequest")
      private final @Nullable Output<PullRequestFilterArgs> pullRequest;

    public Output<PullRequestFilterArgs> pullRequest() {
        return this.pullRequest == null ? Codegen.empty() : this.pullRequest;
    }

    /**
     * Filter to match changes in refs like branches, tags.
     * 
     */
    @Import(name="push")
      private final @Nullable Output<PushFilterArgs> push;

    public Output<PushFilterArgs> push() {
        return this.push == null ? Codegen.empty() : this.push;
    }

    /**
     * Slug of the repository. A repository slug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL. For example, if the repository name is &#39;test repo&#39;, in the URL it would become &#39;test-repo&#39; as in http://mybitbucket.server/projects/TEST/repos/test-repo.
     * 
     */
    @Import(name="repoSlug", required=true)
      private final Output<String> repoSlug;

    public Output<String> repoSlug() {
        return this.repoSlug;
    }

    public BitbucketServerTriggerConfigArgs(
        Output<String> bitbucketServerConfigResource,
        Output<String> projectKey,
        @Nullable Output<PullRequestFilterArgs> pullRequest,
        @Nullable Output<PushFilterArgs> push,
        Output<String> repoSlug) {
        this.bitbucketServerConfigResource = Objects.requireNonNull(bitbucketServerConfigResource, "expected parameter 'bitbucketServerConfigResource' to be non-null");
        this.projectKey = Objects.requireNonNull(projectKey, "expected parameter 'projectKey' to be non-null");
        this.pullRequest = pullRequest;
        this.push = push;
        this.repoSlug = Objects.requireNonNull(repoSlug, "expected parameter 'repoSlug' to be non-null");
    }

    private BitbucketServerTriggerConfigArgs() {
        this.bitbucketServerConfigResource = Codegen.empty();
        this.projectKey = Codegen.empty();
        this.pullRequest = Codegen.empty();
        this.push = Codegen.empty();
        this.repoSlug = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerTriggerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bitbucketServerConfigResource;
        private Output<String> projectKey;
        private @Nullable Output<PullRequestFilterArgs> pullRequest;
        private @Nullable Output<PushFilterArgs> push;
        private Output<String> repoSlug;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerTriggerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitbucketServerConfigResource = defaults.bitbucketServerConfigResource;
    	      this.projectKey = defaults.projectKey;
    	      this.pullRequest = defaults.pullRequest;
    	      this.push = defaults.push;
    	      this.repoSlug = defaults.repoSlug;
        }

        public Builder bitbucketServerConfigResource(Output<String> bitbucketServerConfigResource) {
            this.bitbucketServerConfigResource = Objects.requireNonNull(bitbucketServerConfigResource);
            return this;
        }
        public Builder bitbucketServerConfigResource(String bitbucketServerConfigResource) {
            this.bitbucketServerConfigResource = Output.of(Objects.requireNonNull(bitbucketServerConfigResource));
            return this;
        }
        public Builder projectKey(Output<String> projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
            return this;
        }
        public Builder projectKey(String projectKey) {
            this.projectKey = Output.of(Objects.requireNonNull(projectKey));
            return this;
        }
        public Builder pullRequest(@Nullable Output<PullRequestFilterArgs> pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }
        public Builder pullRequest(@Nullable PullRequestFilterArgs pullRequest) {
            this.pullRequest = Codegen.ofNullable(pullRequest);
            return this;
        }
        public Builder push(@Nullable Output<PushFilterArgs> push) {
            this.push = push;
            return this;
        }
        public Builder push(@Nullable PushFilterArgs push) {
            this.push = Codegen.ofNullable(push);
            return this;
        }
        public Builder repoSlug(Output<String> repoSlug) {
            this.repoSlug = Objects.requireNonNull(repoSlug);
            return this;
        }
        public Builder repoSlug(String repoSlug) {
            this.repoSlug = Output.of(Objects.requireNonNull(repoSlug));
            return this;
        }        public BitbucketServerTriggerConfigArgs build() {
            return new BitbucketServerTriggerConfigArgs(bitbucketServerConfigResource, projectKey, pullRequest, push, repoSlug);
        }
    }
}

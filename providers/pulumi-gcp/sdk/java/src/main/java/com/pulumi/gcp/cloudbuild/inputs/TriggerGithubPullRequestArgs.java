// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerGithubPullRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerGithubPullRequestArgs Empty = new TriggerGithubPullRequestArgs();

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    @Import(name="branch", required=true)
      private final Output<String> branch;

    public Output<String> branch() {
        return this.branch;
    }

    /**
     * Whether to block builds on a &#34;/gcbrun&#34; comment from a repository owner or collaborator.
     * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
     * 
     */
    @Import(name="commentControl")
      private final @Nullable Output<String> commentControl;

    public Output<String> commentControl() {
        return this.commentControl == null ? Codegen.empty() : this.commentControl;
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @Import(name="invertRegex")
      private final @Nullable Output<Boolean> invertRegex;

    public Output<Boolean> invertRegex() {
        return this.invertRegex == null ? Codegen.empty() : this.invertRegex;
    }

    public TriggerGithubPullRequestArgs(
        Output<String> branch,
        @Nullable Output<String> commentControl,
        @Nullable Output<Boolean> invertRegex) {
        this.branch = Objects.requireNonNull(branch, "expected parameter 'branch' to be non-null");
        this.commentControl = commentControl;
        this.invertRegex = invertRegex;
    }

    private TriggerGithubPullRequestArgs() {
        this.branch = Codegen.empty();
        this.commentControl = Codegen.empty();
        this.invertRegex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithubPullRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> branch;
        private @Nullable Output<String> commentControl;
        private @Nullable Output<Boolean> invertRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithubPullRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commentControl = defaults.commentControl;
    	      this.invertRegex = defaults.invertRegex;
        }

        public Builder branch(Output<String> branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }
        public Builder branch(String branch) {
            this.branch = Output.of(Objects.requireNonNull(branch));
            return this;
        }
        public Builder commentControl(@Nullable Output<String> commentControl) {
            this.commentControl = commentControl;
            return this;
        }
        public Builder commentControl(@Nullable String commentControl) {
            this.commentControl = Codegen.ofNullable(commentControl);
            return this;
        }
        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }
        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = Codegen.ofNullable(invertRegex);
            return this;
        }        public TriggerGithubPullRequestArgs build() {
            return new TriggerGithubPullRequestArgs(branch, commentControl, invertRegex);
        }
    }
}

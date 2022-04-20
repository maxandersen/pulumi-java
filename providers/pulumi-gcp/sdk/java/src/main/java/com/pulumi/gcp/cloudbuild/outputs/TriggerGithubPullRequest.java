// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerGithubPullRequest {
    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    private final String branch;
    /**
     * Whether to block builds on a &#34;/gcbrun&#34; comment from a repository owner or collaborator.
     * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
     * 
     */
    private final @Nullable String commentControl;
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    private final @Nullable Boolean invertRegex;

    @CustomType.Constructor
    private TriggerGithubPullRequest(
        @CustomType.Parameter("branch") String branch,
        @CustomType.Parameter("commentControl") @Nullable String commentControl,
        @CustomType.Parameter("invertRegex") @Nullable Boolean invertRegex) {
        this.branch = branch;
        this.commentControl = commentControl;
        this.invertRegex = invertRegex;
    }

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
    */
    public String branch() {
        return this.branch;
    }
    /**
     * Whether to block builds on a &#34;/gcbrun&#34; comment from a repository owner or collaborator.
     * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
     * 
    */
    public Optional<String> commentControl() {
        return Optional.ofNullable(this.commentControl);
    }
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
    */
    public Optional<Boolean> invertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithubPullRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branch;
        private @Nullable String commentControl;
        private @Nullable Boolean invertRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithubPullRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commentControl = defaults.commentControl;
    	      this.invertRegex = defaults.invertRegex;
        }

        public Builder branch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }
        public Builder commentControl(@Nullable String commentControl) {
            this.commentControl = commentControl;
            return this;
        }
        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }        public TriggerGithubPullRequest build() {
            return new TriggerGithubPullRequest(branch, commentControl, invertRegex);
        }
    }
}

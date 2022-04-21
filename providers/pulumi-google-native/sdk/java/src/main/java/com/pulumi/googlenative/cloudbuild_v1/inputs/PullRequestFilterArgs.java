// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.enums.PullRequestFilterCommentControl;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PullRequestFilter contains filter properties for matching GitHub Pull Requests.
 * 
 */
public final class PullRequestFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final PullRequestFilterArgs Empty = new PullRequestFilterArgs();

    /**
     * Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`.
     * 
     */
    @Import(name="commentControl")
    private @Nullable Output<PullRequestFilterCommentControl> commentControl;

    public Optional<Output<PullRequestFilterCommentControl>> commentControl() {
        return Optional.ofNullable(this.commentControl);
    }

    /**
     * If true, branches that do NOT match the git_ref will trigger a build.
     * 
     */
    @Import(name="invertRegex")
    private @Nullable Output<Boolean> invertRegex;

    public Optional<Output<Boolean>> invertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }

    private PullRequestFilterArgs() {}

    private PullRequestFilterArgs(PullRequestFilterArgs $) {
        this.branch = $.branch;
        this.commentControl = $.commentControl;
        this.invertRegex = $.invertRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PullRequestFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PullRequestFilterArgs $;

        public Builder() {
            $ = new PullRequestFilterArgs();
        }

        public Builder(PullRequestFilterArgs defaults) {
            $ = new PullRequestFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        public Builder commentControl(@Nullable Output<PullRequestFilterCommentControl> commentControl) {
            $.commentControl = commentControl;
            return this;
        }

        public Builder commentControl(PullRequestFilterCommentControl commentControl) {
            return commentControl(Output.of(commentControl));
        }

        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            $.invertRegex = invertRegex;
            return this;
        }

        public Builder invertRegex(Boolean invertRegex) {
            return invertRegex(Output.of(invertRegex));
        }

        public PullRequestFilterArgs build() {
            return $;
        }
    }

}

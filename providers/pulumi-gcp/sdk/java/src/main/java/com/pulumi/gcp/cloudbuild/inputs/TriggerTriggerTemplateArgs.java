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


public final class TriggerTriggerTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerTriggerTemplateArgs Empty = new TriggerTriggerTemplateArgs();

    /**
     * Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="branchName")
      private final @Nullable Output<String> branchName;

    public Output<String> branchName() {
        return this.branchName == null ? Codegen.empty() : this.branchName;
    }

    /**
     * Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    @Import(name="commitSha")
      private final @Nullable Output<String> commitSha;

    public Output<String> commitSha() {
        return this.commitSha == null ? Codegen.empty() : this.commitSha;
    }

    /**
     * Working directory to use when running this step&#39;s container.
     * If this value is a relative path, it is relative to the build&#39;s working
     * directory. If this value is absolute, it may be outside the build&#39;s working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step&#39;s execution.
     * 
     */
    @Import(name="dir")
      private final @Nullable Output<String> dir;

    public Output<String> dir() {
        return this.dir == null ? Codegen.empty() : this.dir;
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

    /**
     * ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId == null ? Codegen.empty() : this.projectId;
    }

    /**
     * Name of the Cloud Source Repository.
     * 
     */
    @Import(name="repoName")
      private final @Nullable Output<String> repoName;

    public Output<String> repoName() {
        return this.repoName == null ? Codegen.empty() : this.repoName;
    }

    /**
     * Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="tagName")
      private final @Nullable Output<String> tagName;

    public Output<String> tagName() {
        return this.tagName == null ? Codegen.empty() : this.tagName;
    }

    public TriggerTriggerTemplateArgs(
        @Nullable Output<String> branchName,
        @Nullable Output<String> commitSha,
        @Nullable Output<String> dir,
        @Nullable Output<Boolean> invertRegex,
        @Nullable Output<String> projectId,
        @Nullable Output<String> repoName,
        @Nullable Output<String> tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.dir = dir;
        this.invertRegex = invertRegex;
        this.projectId = projectId;
        this.repoName = repoName;
        this.tagName = tagName;
    }

    private TriggerTriggerTemplateArgs() {
        this.branchName = Codegen.empty();
        this.commitSha = Codegen.empty();
        this.dir = Codegen.empty();
        this.invertRegex = Codegen.empty();
        this.projectId = Codegen.empty();
        this.repoName = Codegen.empty();
        this.tagName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTriggerTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> branchName;
        private @Nullable Output<String> commitSha;
        private @Nullable Output<String> dir;
        private @Nullable Output<Boolean> invertRegex;
        private @Nullable Output<String> projectId;
        private @Nullable Output<String> repoName;
        private @Nullable Output<String> tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTriggerTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.projectId = defaults.projectId;
    	      this.repoName = defaults.repoName;
    	      this.tagName = defaults.tagName;
        }

        public Builder branchName(@Nullable Output<String> branchName) {
            this.branchName = branchName;
            return this;
        }
        public Builder branchName(@Nullable String branchName) {
            this.branchName = Codegen.ofNullable(branchName);
            return this;
        }
        public Builder commitSha(@Nullable Output<String> commitSha) {
            this.commitSha = commitSha;
            return this;
        }
        public Builder commitSha(@Nullable String commitSha) {
            this.commitSha = Codegen.ofNullable(commitSha);
            return this;
        }
        public Builder dir(@Nullable Output<String> dir) {
            this.dir = dir;
            return this;
        }
        public Builder dir(@Nullable String dir) {
            this.dir = Codegen.ofNullable(dir);
            return this;
        }
        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }
        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = Codegen.ofNullable(invertRegex);
            return this;
        }
        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = Codegen.ofNullable(projectId);
            return this;
        }
        public Builder repoName(@Nullable Output<String> repoName) {
            this.repoName = repoName;
            return this;
        }
        public Builder repoName(@Nullable String repoName) {
            this.repoName = Codegen.ofNullable(repoName);
            return this;
        }
        public Builder tagName(@Nullable Output<String> tagName) {
            this.tagName = tagName;
            return this;
        }
        public Builder tagName(@Nullable String tagName) {
            this.tagName = Codegen.ofNullable(tagName);
            return this;
        }        public TriggerTriggerTemplateArgs build() {
            return new TriggerTriggerTemplateArgs(branchName, commitSha, dir, invertRegex, projectId, repoName, tagName);
        }
    }
}

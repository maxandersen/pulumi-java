// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.aws.codebuild.inputs.ProjectSourceAuthGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSourceBuildStatusConfigGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSourceGitSubmodulesConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSourceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSourceGetArgs Empty = new ProjectSourceGetArgs();

    /**
     * Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console&#39;s use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    @Import(name="auth")
      private final @Nullable Output<ProjectSourceAuthGetArgs> auth;

    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Output<ProjectSourceAuthGetArgs> auth() {
        return this.auth == null ? Codegen.empty() : this.auth;
    }

    /**
     * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     * 
     */
    @Import(name="buildStatusConfig")
      private final @Nullable Output<ProjectSourceBuildStatusConfigGetArgs> buildStatusConfig;

    public Output<ProjectSourceBuildStatusConfigGetArgs> buildStatusConfig() {
        return this.buildStatusConfig == null ? Codegen.empty() : this.buildStatusConfig;
    }

    /**
     * Build specification to use for this build project&#39;s related builds. This must be set when `type` is `NO_SOURCE`.
     * 
     */
    @Import(name="buildspec")
      private final @Nullable Output<String> buildspec;

    public Output<String> buildspec() {
        return this.buildspec == null ? Codegen.empty() : this.buildspec;
    }

    /**
     * Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     * 
     */
    @Import(name="gitCloneDepth")
      private final @Nullable Output<Integer> gitCloneDepth;

    public Output<Integer> gitCloneDepth() {
        return this.gitCloneDepth == null ? Codegen.empty() : this.gitCloneDepth;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="gitSubmodulesConfig")
      private final @Nullable Output<ProjectSourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig;

    public Output<ProjectSourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig() {
        return this.gitSubmodulesConfig == null ? Codegen.empty() : this.gitSubmodulesConfig;
    }

    /**
     * Ignore SSL warnings when connecting to source control.
     * 
     */
    @Import(name="insecureSsl")
      private final @Nullable Output<Boolean> insecureSsl;

    public Output<Boolean> insecureSsl() {
        return this.insecureSsl == null ? Codegen.empty() : this.insecureSsl;
    }

    /**
     * Location of the source code from git or s3.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Whether to report the status of a build&#39;s start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     * 
     */
    @Import(name="reportBuildStatus")
      private final @Nullable Output<Boolean> reportBuildStatus;

    public Output<Boolean> reportBuildStatus() {
        return this.reportBuildStatus == null ? Codegen.empty() : this.reportBuildStatus;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ProjectSourceGetArgs(
        @Nullable Output<ProjectSourceAuthGetArgs> auth,
        @Nullable Output<ProjectSourceBuildStatusConfigGetArgs> buildStatusConfig,
        @Nullable Output<String> buildspec,
        @Nullable Output<Integer> gitCloneDepth,
        @Nullable Output<ProjectSourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig,
        @Nullable Output<Boolean> insecureSsl,
        @Nullable Output<String> location,
        @Nullable Output<Boolean> reportBuildStatus,
        Output<String> type) {
        this.auth = auth;
        this.buildStatusConfig = buildStatusConfig;
        this.buildspec = buildspec;
        this.gitCloneDepth = gitCloneDepth;
        this.gitSubmodulesConfig = gitSubmodulesConfig;
        this.insecureSsl = insecureSsl;
        this.location = location;
        this.reportBuildStatus = reportBuildStatus;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSourceGetArgs() {
        this.auth = Codegen.empty();
        this.buildStatusConfig = Codegen.empty();
        this.buildspec = Codegen.empty();
        this.gitCloneDepth = Codegen.empty();
        this.gitSubmodulesConfig = Codegen.empty();
        this.insecureSsl = Codegen.empty();
        this.location = Codegen.empty();
        this.reportBuildStatus = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ProjectSourceAuthGetArgs> auth;
        private @Nullable Output<ProjectSourceBuildStatusConfigGetArgs> buildStatusConfig;
        private @Nullable Output<String> buildspec;
        private @Nullable Output<Integer> gitCloneDepth;
        private @Nullable Output<ProjectSourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig;
        private @Nullable Output<Boolean> insecureSsl;
        private @Nullable Output<String> location;
        private @Nullable Output<Boolean> reportBuildStatus;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.buildStatusConfig = defaults.buildStatusConfig;
    	      this.buildspec = defaults.buildspec;
    	      this.gitCloneDepth = defaults.gitCloneDepth;
    	      this.gitSubmodulesConfig = defaults.gitSubmodulesConfig;
    	      this.insecureSsl = defaults.insecureSsl;
    	      this.location = defaults.location;
    	      this.reportBuildStatus = defaults.reportBuildStatus;
    	      this.type = defaults.type;
        }

        public Builder auth(@Nullable Output<ProjectSourceAuthGetArgs> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(@Nullable ProjectSourceAuthGetArgs auth) {
            this.auth = Codegen.ofNullable(auth);
            return this;
        }
        public Builder buildStatusConfig(@Nullable Output<ProjectSourceBuildStatusConfigGetArgs> buildStatusConfig) {
            this.buildStatusConfig = buildStatusConfig;
            return this;
        }
        public Builder buildStatusConfig(@Nullable ProjectSourceBuildStatusConfigGetArgs buildStatusConfig) {
            this.buildStatusConfig = Codegen.ofNullable(buildStatusConfig);
            return this;
        }
        public Builder buildspec(@Nullable Output<String> buildspec) {
            this.buildspec = buildspec;
            return this;
        }
        public Builder buildspec(@Nullable String buildspec) {
            this.buildspec = Codegen.ofNullable(buildspec);
            return this;
        }
        public Builder gitCloneDepth(@Nullable Output<Integer> gitCloneDepth) {
            this.gitCloneDepth = gitCloneDepth;
            return this;
        }
        public Builder gitCloneDepth(@Nullable Integer gitCloneDepth) {
            this.gitCloneDepth = Codegen.ofNullable(gitCloneDepth);
            return this;
        }
        public Builder gitSubmodulesConfig(@Nullable Output<ProjectSourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig) {
            this.gitSubmodulesConfig = gitSubmodulesConfig;
            return this;
        }
        public Builder gitSubmodulesConfig(@Nullable ProjectSourceGitSubmodulesConfigGetArgs gitSubmodulesConfig) {
            this.gitSubmodulesConfig = Codegen.ofNullable(gitSubmodulesConfig);
            return this;
        }
        public Builder insecureSsl(@Nullable Output<Boolean> insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }
        public Builder insecureSsl(@Nullable Boolean insecureSsl) {
            this.insecureSsl = Codegen.ofNullable(insecureSsl);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder reportBuildStatus(@Nullable Output<Boolean> reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }
        public Builder reportBuildStatus(@Nullable Boolean reportBuildStatus) {
            this.reportBuildStatus = Codegen.ofNullable(reportBuildStatus);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ProjectSourceGetArgs build() {
            return new ProjectSourceGetArgs(auth, buildStatusConfig, buildspec, gitCloneDepth, gitSubmodulesConfig, insecureSsl, location, reportBuildStatus, type);
        }
    }
}

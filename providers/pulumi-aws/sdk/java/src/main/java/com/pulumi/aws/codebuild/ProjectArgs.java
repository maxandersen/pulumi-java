// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild;

import com.pulumi.aws.codebuild.inputs.ProjectArtifactsArgs;
import com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs;
import com.pulumi.aws.codebuild.inputs.ProjectCacheArgs;
import com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs;
import com.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationArgs;
import com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSourceArgs;
import com.pulumi.aws.codebuild.inputs.ProjectVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="artifacts", required=true)
      private final Output<ProjectArtifactsArgs> artifacts;

    public Output<ProjectArtifactsArgs> artifacts() {
        return this.artifacts;
    }

    /**
     * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
     * 
     */
    @Import(name="badgeEnabled")
      private final @Nullable Output<Boolean> badgeEnabled;

    public Output<Boolean> badgeEnabled() {
        return this.badgeEnabled == null ? Codegen.empty() : this.badgeEnabled;
    }

    /**
     * Defines the batch build options for the project.
     * 
     */
    @Import(name="buildBatchConfig")
      private final @Nullable Output<ProjectBuildBatchConfigArgs> buildBatchConfig;

    public Output<ProjectBuildBatchConfigArgs> buildBatchConfig() {
        return this.buildBatchConfig == null ? Codegen.empty() : this.buildBatchConfig;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
     * 
     */
    @Import(name="buildTimeout")
      private final @Nullable Output<Integer> buildTimeout;

    public Output<Integer> buildTimeout() {
        return this.buildTimeout == null ? Codegen.empty() : this.buildTimeout;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="cache")
      private final @Nullable Output<ProjectCacheArgs> cache;

    public Output<ProjectCacheArgs> cache() {
        return this.cache == null ? Codegen.empty() : this.cache;
    }

    /**
     * Specify a maximum number of concurrent builds for the project. The value specified must be greater than 0 and less than the account concurrent running builds limit.
     * 
     */
    @Import(name="concurrentBuildLimit")
      private final @Nullable Output<Integer> concurrentBuildLimit;

    public Output<Integer> concurrentBuildLimit() {
        return this.concurrentBuildLimit == null ? Codegen.empty() : this.concurrentBuildLimit;
    }

    /**
     * Short description of the project.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project&#39;s build output artifacts.
     * 
     */
    @Import(name="encryptionKey")
      private final @Nullable Output<String> encryptionKey;

    public Output<String> encryptionKey() {
        return this.encryptionKey == null ? Codegen.empty() : this.encryptionKey;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="environment", required=true)
      private final Output<ProjectEnvironmentArgs> environment;

    public Output<ProjectEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * A set of file system locations to to mount inside the build. File system locations are documented below.
     * 
     */
    @Import(name="fileSystemLocations")
      private final @Nullable Output<List<ProjectFileSystemLocationArgs>> fileSystemLocations;

    public Output<List<ProjectFileSystemLocationArgs>> fileSystemLocations() {
        return this.fileSystemLocations == null ? Codegen.empty() : this.fileSystemLocations;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="logsConfig")
      private final @Nullable Output<ProjectLogsConfigArgs> logsConfig;

    public Output<ProjectLogsConfigArgs> logsConfig() {
        return this.logsConfig == null ? Codegen.empty() : this.logsConfig;
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies the visibility of the project&#39;s builds. Possible values are: `PUBLIC_READ` and `PRIVATE`. Default value is `PRIVATE`.
     * 
     */
    @Import(name="projectVisibility")
      private final @Nullable Output<String> projectVisibility;

    public Output<String> projectVisibility() {
        return this.projectVisibility == null ? Codegen.empty() : this.projectVisibility;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
     * 
     */
    @Import(name="queuedTimeout")
      private final @Nullable Output<Integer> queuedTimeout;

    public Output<Integer> queuedTimeout() {
        return this.queuedTimeout == null ? Codegen.empty() : this.queuedTimeout;
    }

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project&#39;s builds.
     * 
     */
    @Import(name="resourceAccessRole")
      private final @Nullable Output<String> resourceAccessRole;

    public Output<String> resourceAccessRole() {
        return this.resourceAccessRole == null ? Codegen.empty() : this.resourceAccessRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondaryArtifacts")
      private final @Nullable Output<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts;

    public Output<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts() {
        return this.secondaryArtifacts == null ? Codegen.empty() : this.secondaryArtifacts;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondarySourceVersions")
      private final @Nullable Output<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions;

    public Output<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions() {
        return this.secondarySourceVersions == null ? Codegen.empty() : this.secondarySourceVersions;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondarySources")
      private final @Nullable Output<List<ProjectSecondarySourceArgs>> secondarySources;

    public Output<List<ProjectSecondarySourceArgs>> secondarySources() {
        return this.secondarySources == null ? Codegen.empty() : this.secondarySources;
    }

    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    @Import(name="serviceRole", required=true)
      private final Output<String> serviceRole;

    public Output<String> serviceRole() {
        return this.serviceRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="source", required=true)
      private final Output<ProjectSourceArgs> source;

    public Output<ProjectSourceArgs> source() {
        return this.source;
    }

    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @Import(name="sourceVersion")
      private final @Nullable Output<String> sourceVersion;

    public Output<String> sourceVersion() {
        return this.sourceVersion == null ? Codegen.empty() : this.sourceVersion;
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<ProjectVpcConfigArgs> vpcConfig;

    public Output<ProjectVpcConfigArgs> vpcConfig() {
        return this.vpcConfig == null ? Codegen.empty() : this.vpcConfig;
    }

    public ProjectArgs(
        Output<ProjectArtifactsArgs> artifacts,
        @Nullable Output<Boolean> badgeEnabled,
        @Nullable Output<ProjectBuildBatchConfigArgs> buildBatchConfig,
        @Nullable Output<Integer> buildTimeout,
        @Nullable Output<ProjectCacheArgs> cache,
        @Nullable Output<Integer> concurrentBuildLimit,
        @Nullable Output<String> description,
        @Nullable Output<String> encryptionKey,
        Output<ProjectEnvironmentArgs> environment,
        @Nullable Output<List<ProjectFileSystemLocationArgs>> fileSystemLocations,
        @Nullable Output<ProjectLogsConfigArgs> logsConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> projectVisibility,
        @Nullable Output<Integer> queuedTimeout,
        @Nullable Output<String> resourceAccessRole,
        @Nullable Output<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts,
        @Nullable Output<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions,
        @Nullable Output<List<ProjectSecondarySourceArgs>> secondarySources,
        Output<String> serviceRole,
        Output<ProjectSourceArgs> source,
        @Nullable Output<String> sourceVersion,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<ProjectVpcConfigArgs> vpcConfig) {
        this.artifacts = Objects.requireNonNull(artifacts, "expected parameter 'artifacts' to be non-null");
        this.badgeEnabled = badgeEnabled;
        this.buildBatchConfig = buildBatchConfig;
        this.buildTimeout = buildTimeout;
        this.cache = cache;
        this.concurrentBuildLimit = concurrentBuildLimit;
        this.description = description;
        this.encryptionKey = encryptionKey;
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.fileSystemLocations = fileSystemLocations;
        this.logsConfig = logsConfig;
        this.name = name;
        this.projectVisibility = projectVisibility;
        this.queuedTimeout = queuedTimeout;
        this.resourceAccessRole = resourceAccessRole;
        this.secondaryArtifacts = secondaryArtifacts;
        this.secondarySourceVersions = secondarySourceVersions;
        this.secondarySources = secondarySources;
        this.serviceRole = Objects.requireNonNull(serviceRole, "expected parameter 'serviceRole' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceVersion = sourceVersion;
        this.tags = tags;
        this.vpcConfig = vpcConfig;
    }

    private ProjectArgs() {
        this.artifacts = Codegen.empty();
        this.badgeEnabled = Codegen.empty();
        this.buildBatchConfig = Codegen.empty();
        this.buildTimeout = Codegen.empty();
        this.cache = Codegen.empty();
        this.concurrentBuildLimit = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptionKey = Codegen.empty();
        this.environment = Codegen.empty();
        this.fileSystemLocations = Codegen.empty();
        this.logsConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.projectVisibility = Codegen.empty();
        this.queuedTimeout = Codegen.empty();
        this.resourceAccessRole = Codegen.empty();
        this.secondaryArtifacts = Codegen.empty();
        this.secondarySourceVersions = Codegen.empty();
        this.secondarySources = Codegen.empty();
        this.serviceRole = Codegen.empty();
        this.source = Codegen.empty();
        this.sourceVersion = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ProjectArtifactsArgs> artifacts;
        private @Nullable Output<Boolean> badgeEnabled;
        private @Nullable Output<ProjectBuildBatchConfigArgs> buildBatchConfig;
        private @Nullable Output<Integer> buildTimeout;
        private @Nullable Output<ProjectCacheArgs> cache;
        private @Nullable Output<Integer> concurrentBuildLimit;
        private @Nullable Output<String> description;
        private @Nullable Output<String> encryptionKey;
        private Output<ProjectEnvironmentArgs> environment;
        private @Nullable Output<List<ProjectFileSystemLocationArgs>> fileSystemLocations;
        private @Nullable Output<ProjectLogsConfigArgs> logsConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> projectVisibility;
        private @Nullable Output<Integer> queuedTimeout;
        private @Nullable Output<String> resourceAccessRole;
        private @Nullable Output<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts;
        private @Nullable Output<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions;
        private @Nullable Output<List<ProjectSecondarySourceArgs>> secondarySources;
        private Output<String> serviceRole;
        private Output<ProjectSourceArgs> source;
        private @Nullable Output<String> sourceVersion;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<ProjectVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.badgeEnabled = defaults.badgeEnabled;
    	      this.buildBatchConfig = defaults.buildBatchConfig;
    	      this.buildTimeout = defaults.buildTimeout;
    	      this.cache = defaults.cache;
    	      this.concurrentBuildLimit = defaults.concurrentBuildLimit;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.environment = defaults.environment;
    	      this.fileSystemLocations = defaults.fileSystemLocations;
    	      this.logsConfig = defaults.logsConfig;
    	      this.name = defaults.name;
    	      this.projectVisibility = defaults.projectVisibility;
    	      this.queuedTimeout = defaults.queuedTimeout;
    	      this.resourceAccessRole = defaults.resourceAccessRole;
    	      this.secondaryArtifacts = defaults.secondaryArtifacts;
    	      this.secondarySourceVersions = defaults.secondarySourceVersions;
    	      this.secondarySources = defaults.secondarySources;
    	      this.serviceRole = defaults.serviceRole;
    	      this.source = defaults.source;
    	      this.sourceVersion = defaults.sourceVersion;
    	      this.tags = defaults.tags;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder artifacts(Output<ProjectArtifactsArgs> artifacts) {
            this.artifacts = Objects.requireNonNull(artifacts);
            return this;
        }
        public Builder artifacts(ProjectArtifactsArgs artifacts) {
            this.artifacts = Output.of(Objects.requireNonNull(artifacts));
            return this;
        }
        public Builder badgeEnabled(@Nullable Output<Boolean> badgeEnabled) {
            this.badgeEnabled = badgeEnabled;
            return this;
        }
        public Builder badgeEnabled(@Nullable Boolean badgeEnabled) {
            this.badgeEnabled = Codegen.ofNullable(badgeEnabled);
            return this;
        }
        public Builder buildBatchConfig(@Nullable Output<ProjectBuildBatchConfigArgs> buildBatchConfig) {
            this.buildBatchConfig = buildBatchConfig;
            return this;
        }
        public Builder buildBatchConfig(@Nullable ProjectBuildBatchConfigArgs buildBatchConfig) {
            this.buildBatchConfig = Codegen.ofNullable(buildBatchConfig);
            return this;
        }
        public Builder buildTimeout(@Nullable Output<Integer> buildTimeout) {
            this.buildTimeout = buildTimeout;
            return this;
        }
        public Builder buildTimeout(@Nullable Integer buildTimeout) {
            this.buildTimeout = Codegen.ofNullable(buildTimeout);
            return this;
        }
        public Builder cache(@Nullable Output<ProjectCacheArgs> cache) {
            this.cache = cache;
            return this;
        }
        public Builder cache(@Nullable ProjectCacheArgs cache) {
            this.cache = Codegen.ofNullable(cache);
            return this;
        }
        public Builder concurrentBuildLimit(@Nullable Output<Integer> concurrentBuildLimit) {
            this.concurrentBuildLimit = concurrentBuildLimit;
            return this;
        }
        public Builder concurrentBuildLimit(@Nullable Integer concurrentBuildLimit) {
            this.concurrentBuildLimit = Codegen.ofNullable(concurrentBuildLimit);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Codegen.ofNullable(encryptionKey);
            return this;
        }
        public Builder environment(Output<ProjectEnvironmentArgs> environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder environment(ProjectEnvironmentArgs environment) {
            this.environment = Output.of(Objects.requireNonNull(environment));
            return this;
        }
        public Builder fileSystemLocations(@Nullable Output<List<ProjectFileSystemLocationArgs>> fileSystemLocations) {
            this.fileSystemLocations = fileSystemLocations;
            return this;
        }
        public Builder fileSystemLocations(@Nullable List<ProjectFileSystemLocationArgs> fileSystemLocations) {
            this.fileSystemLocations = Codegen.ofNullable(fileSystemLocations);
            return this;
        }
        public Builder fileSystemLocations(ProjectFileSystemLocationArgs... fileSystemLocations) {
            return fileSystemLocations(List.of(fileSystemLocations));
        }
        public Builder logsConfig(@Nullable Output<ProjectLogsConfigArgs> logsConfig) {
            this.logsConfig = logsConfig;
            return this;
        }
        public Builder logsConfig(@Nullable ProjectLogsConfigArgs logsConfig) {
            this.logsConfig = Codegen.ofNullable(logsConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder projectVisibility(@Nullable Output<String> projectVisibility) {
            this.projectVisibility = projectVisibility;
            return this;
        }
        public Builder projectVisibility(@Nullable String projectVisibility) {
            this.projectVisibility = Codegen.ofNullable(projectVisibility);
            return this;
        }
        public Builder queuedTimeout(@Nullable Output<Integer> queuedTimeout) {
            this.queuedTimeout = queuedTimeout;
            return this;
        }
        public Builder queuedTimeout(@Nullable Integer queuedTimeout) {
            this.queuedTimeout = Codegen.ofNullable(queuedTimeout);
            return this;
        }
        public Builder resourceAccessRole(@Nullable Output<String> resourceAccessRole) {
            this.resourceAccessRole = resourceAccessRole;
            return this;
        }
        public Builder resourceAccessRole(@Nullable String resourceAccessRole) {
            this.resourceAccessRole = Codegen.ofNullable(resourceAccessRole);
            return this;
        }
        public Builder secondaryArtifacts(@Nullable Output<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts) {
            this.secondaryArtifacts = secondaryArtifacts;
            return this;
        }
        public Builder secondaryArtifacts(@Nullable List<ProjectSecondaryArtifactArgs> secondaryArtifacts) {
            this.secondaryArtifacts = Codegen.ofNullable(secondaryArtifacts);
            return this;
        }
        public Builder secondaryArtifacts(ProjectSecondaryArtifactArgs... secondaryArtifacts) {
            return secondaryArtifacts(List.of(secondaryArtifacts));
        }
        public Builder secondarySourceVersions(@Nullable Output<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions) {
            this.secondarySourceVersions = secondarySourceVersions;
            return this;
        }
        public Builder secondarySourceVersions(@Nullable List<ProjectSecondarySourceVersionArgs> secondarySourceVersions) {
            this.secondarySourceVersions = Codegen.ofNullable(secondarySourceVersions);
            return this;
        }
        public Builder secondarySourceVersions(ProjectSecondarySourceVersionArgs... secondarySourceVersions) {
            return secondarySourceVersions(List.of(secondarySourceVersions));
        }
        public Builder secondarySources(@Nullable Output<List<ProjectSecondarySourceArgs>> secondarySources) {
            this.secondarySources = secondarySources;
            return this;
        }
        public Builder secondarySources(@Nullable List<ProjectSecondarySourceArgs> secondarySources) {
            this.secondarySources = Codegen.ofNullable(secondarySources);
            return this;
        }
        public Builder secondarySources(ProjectSecondarySourceArgs... secondarySources) {
            return secondarySources(List.of(secondarySources));
        }
        public Builder serviceRole(Output<String> serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = Output.of(Objects.requireNonNull(serviceRole));
            return this;
        }
        public Builder source(Output<ProjectSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(ProjectSourceArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public Builder sourceVersion(@Nullable Output<String> sourceVersion) {
            this.sourceVersion = sourceVersion;
            return this;
        }
        public Builder sourceVersion(@Nullable String sourceVersion) {
            this.sourceVersion = Codegen.ofNullable(sourceVersion);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<ProjectVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable ProjectVpcConfigArgs vpcConfig) {
            this.vpcConfig = Codegen.ofNullable(vpcConfig);
            return this;
        }        public ProjectArgs build() {
            return new ProjectArgs(artifacts, badgeEnabled, buildBatchConfig, buildTimeout, cache, concurrentBuildLimit, description, encryptionKey, environment, fileSystemLocations, logsConfig, name, projectVisibility, queuedTimeout, resourceAccessRole, secondaryArtifacts, secondarySourceVersions, secondarySources, serviceRole, source, sourceVersion, tags, vpcConfig);
        }
    }
}

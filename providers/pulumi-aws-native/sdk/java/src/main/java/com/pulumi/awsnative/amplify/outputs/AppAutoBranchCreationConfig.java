// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplify.outputs;

import com.pulumi.awsnative.amplify.enums.AppAutoBranchCreationConfigStage;
import com.pulumi.awsnative.amplify.outputs.AppBasicAuthConfig;
import com.pulumi.awsnative.amplify.outputs.AppEnvironmentVariable;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppAutoBranchCreationConfig {
    private final @Nullable List<String> autoBranchCreationPatterns;
    private final @Nullable AppBasicAuthConfig basicAuthConfig;
    private final @Nullable String buildSpec;
    private final @Nullable Boolean enableAutoBranchCreation;
    private final @Nullable Boolean enableAutoBuild;
    private final @Nullable Boolean enablePerformanceMode;
    private final @Nullable Boolean enablePullRequestPreview;
    private final @Nullable List<AppEnvironmentVariable> environmentVariables;
    private final @Nullable String pullRequestEnvironmentName;
    private final @Nullable AppAutoBranchCreationConfigStage stage;

    @CustomType.Constructor
    private AppAutoBranchCreationConfig(
        @CustomType.Parameter("autoBranchCreationPatterns") @Nullable List<String> autoBranchCreationPatterns,
        @CustomType.Parameter("basicAuthConfig") @Nullable AppBasicAuthConfig basicAuthConfig,
        @CustomType.Parameter("buildSpec") @Nullable String buildSpec,
        @CustomType.Parameter("enableAutoBranchCreation") @Nullable Boolean enableAutoBranchCreation,
        @CustomType.Parameter("enableAutoBuild") @Nullable Boolean enableAutoBuild,
        @CustomType.Parameter("enablePerformanceMode") @Nullable Boolean enablePerformanceMode,
        @CustomType.Parameter("enablePullRequestPreview") @Nullable Boolean enablePullRequestPreview,
        @CustomType.Parameter("environmentVariables") @Nullable List<AppEnvironmentVariable> environmentVariables,
        @CustomType.Parameter("pullRequestEnvironmentName") @Nullable String pullRequestEnvironmentName,
        @CustomType.Parameter("stage") @Nullable AppAutoBranchCreationConfigStage stage) {
        this.autoBranchCreationPatterns = autoBranchCreationPatterns;
        this.basicAuthConfig = basicAuthConfig;
        this.buildSpec = buildSpec;
        this.enableAutoBranchCreation = enableAutoBranchCreation;
        this.enableAutoBuild = enableAutoBuild;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
    }

    public List<String> autoBranchCreationPatterns() {
        return this.autoBranchCreationPatterns == null ? List.of() : this.autoBranchCreationPatterns;
    }
    public Optional<AppBasicAuthConfig> basicAuthConfig() {
        return Optional.ofNullable(this.basicAuthConfig);
    }
    public Optional<String> buildSpec() {
        return Optional.ofNullable(this.buildSpec);
    }
    public Optional<Boolean> enableAutoBranchCreation() {
        return Optional.ofNullable(this.enableAutoBranchCreation);
    }
    public Optional<Boolean> enableAutoBuild() {
        return Optional.ofNullable(this.enableAutoBuild);
    }
    public Optional<Boolean> enablePerformanceMode() {
        return Optional.ofNullable(this.enablePerformanceMode);
    }
    public Optional<Boolean> enablePullRequestPreview() {
        return Optional.ofNullable(this.enablePullRequestPreview);
    }
    public List<AppEnvironmentVariable> environmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    public Optional<String> pullRequestEnvironmentName() {
        return Optional.ofNullable(this.pullRequestEnvironmentName);
    }
    public Optional<AppAutoBranchCreationConfigStage> stage() {
        return Optional.ofNullable(this.stage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppAutoBranchCreationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> autoBranchCreationPatterns;
        private @Nullable AppBasicAuthConfig basicAuthConfig;
        private @Nullable String buildSpec;
        private @Nullable Boolean enableAutoBranchCreation;
        private @Nullable Boolean enableAutoBuild;
        private @Nullable Boolean enablePerformanceMode;
        private @Nullable Boolean enablePullRequestPreview;
        private @Nullable List<AppEnvironmentVariable> environmentVariables;
        private @Nullable String pullRequestEnvironmentName;
        private @Nullable AppAutoBranchCreationConfigStage stage;

        public Builder() {
    	      // Empty
        }

        public Builder(AppAutoBranchCreationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoBranchCreationPatterns = defaults.autoBranchCreationPatterns;
    	      this.basicAuthConfig = defaults.basicAuthConfig;
    	      this.buildSpec = defaults.buildSpec;
    	      this.enableAutoBranchCreation = defaults.enableAutoBranchCreation;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
        }

        public Builder autoBranchCreationPatterns(@Nullable List<String> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = autoBranchCreationPatterns;
            return this;
        }
        public Builder autoBranchCreationPatterns(String... autoBranchCreationPatterns) {
            return autoBranchCreationPatterns(List.of(autoBranchCreationPatterns));
        }
        public Builder basicAuthConfig(@Nullable AppBasicAuthConfig basicAuthConfig) {
            this.basicAuthConfig = basicAuthConfig;
            return this;
        }
        public Builder buildSpec(@Nullable String buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }
        public Builder enableAutoBranchCreation(@Nullable Boolean enableAutoBranchCreation) {
            this.enableAutoBranchCreation = enableAutoBranchCreation;
            return this;
        }
        public Builder enableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }
        public Builder enablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }
        public Builder enablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }
        public Builder environmentVariables(@Nullable List<AppEnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(AppEnvironmentVariable... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public Builder pullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }
        public Builder stage(@Nullable AppAutoBranchCreationConfigStage stage) {
            this.stage = stage;
            return this;
        }        public AppAutoBranchCreationConfig build() {
            return new AppAutoBranchCreationConfig(autoBranchCreationPatterns, basicAuthConfig, buildSpec, enableAutoBranchCreation, enableAutoBuild, enablePerformanceMode, enablePullRequestPreview, environmentVariables, pullRequestEnvironmentName, stage);
        }
    }
}

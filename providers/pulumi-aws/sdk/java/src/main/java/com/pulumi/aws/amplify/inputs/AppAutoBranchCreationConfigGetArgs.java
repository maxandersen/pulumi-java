// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppAutoBranchCreationConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppAutoBranchCreationConfigGetArgs Empty = new AppAutoBranchCreationConfigGetArgs();

    /**
     * The basic authorization credentials for the autocreated branch.
     * 
     */
    @Import(name="basicAuthCredentials")
    private @Nullable Output<String> basicAuthCredentials;

    public Optional<Output<String>> basicAuthCredentials() {
        return Optional.ofNullable(this.basicAuthCredentials);
    }

    /**
     * The build specification (build spec) for the autocreated branch.
     * 
     */
    @Import(name="buildSpec")
    private @Nullable Output<String> buildSpec;

    public Optional<Output<String>> buildSpec() {
        return Optional.ofNullable(this.buildSpec);
    }

    /**
     * Enables auto building for the autocreated branch.
     * 
     */
    @Import(name="enableAutoBuild")
    private @Nullable Output<Boolean> enableAutoBuild;

    public Optional<Output<Boolean>> enableAutoBuild() {
        return Optional.ofNullable(this.enableAutoBuild);
    }

    /**
     * Enables basic authorization for the autocreated branch.
     * 
     */
    @Import(name="enableBasicAuth")
    private @Nullable Output<Boolean> enableBasicAuth;

    public Optional<Output<Boolean>> enableBasicAuth() {
        return Optional.ofNullable(this.enableBasicAuth);
    }

    /**
     * Enables performance mode for the branch.
     * 
     */
    @Import(name="enablePerformanceMode")
    private @Nullable Output<Boolean> enablePerformanceMode;

    public Optional<Output<Boolean>> enablePerformanceMode() {
        return Optional.ofNullable(this.enablePerformanceMode);
    }

    /**
     * Enables pull request previews for the autocreated branch.
     * 
     */
    @Import(name="enablePullRequestPreview")
    private @Nullable Output<Boolean> enablePullRequestPreview;

    public Optional<Output<Boolean>> enablePullRequestPreview() {
        return Optional.ofNullable(this.enablePullRequestPreview);
    }

    /**
     * The environment variables for the autocreated branch.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The framework for the autocreated branch.
     * 
     */
    @Import(name="framework")
    private @Nullable Output<String> framework;

    public Optional<Output<String>> framework() {
        return Optional.ofNullable(this.framework);
    }

    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @Import(name="pullRequestEnvironmentName")
    private @Nullable Output<String> pullRequestEnvironmentName;

    public Optional<Output<String>> pullRequestEnvironmentName() {
        return Optional.ofNullable(this.pullRequestEnvironmentName);
    }

    /**
     * Describes the current stage for the autocreated branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @Import(name="stage")
    private @Nullable Output<String> stage;

    public Optional<Output<String>> stage() {
        return Optional.ofNullable(this.stage);
    }

    private AppAutoBranchCreationConfigGetArgs() {}

    private AppAutoBranchCreationConfigGetArgs(AppAutoBranchCreationConfigGetArgs $) {
        this.basicAuthCredentials = $.basicAuthCredentials;
        this.buildSpec = $.buildSpec;
        this.enableAutoBuild = $.enableAutoBuild;
        this.enableBasicAuth = $.enableBasicAuth;
        this.enablePerformanceMode = $.enablePerformanceMode;
        this.enablePullRequestPreview = $.enablePullRequestPreview;
        this.environmentVariables = $.environmentVariables;
        this.framework = $.framework;
        this.pullRequestEnvironmentName = $.pullRequestEnvironmentName;
        this.stage = $.stage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppAutoBranchCreationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppAutoBranchCreationConfigGetArgs $;

        public Builder() {
            $ = new AppAutoBranchCreationConfigGetArgs();
        }

        public Builder(AppAutoBranchCreationConfigGetArgs defaults) {
            $ = new AppAutoBranchCreationConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder basicAuthCredentials(@Nullable Output<String> basicAuthCredentials) {
            $.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder basicAuthCredentials(String basicAuthCredentials) {
            return basicAuthCredentials(Output.of(basicAuthCredentials));
        }

        public Builder buildSpec(@Nullable Output<String> buildSpec) {
            $.buildSpec = buildSpec;
            return this;
        }

        public Builder buildSpec(String buildSpec) {
            return buildSpec(Output.of(buildSpec));
        }

        public Builder enableAutoBuild(@Nullable Output<Boolean> enableAutoBuild) {
            $.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder enableAutoBuild(Boolean enableAutoBuild) {
            return enableAutoBuild(Output.of(enableAutoBuild));
        }

        public Builder enableBasicAuth(@Nullable Output<Boolean> enableBasicAuth) {
            $.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder enableBasicAuth(Boolean enableBasicAuth) {
            return enableBasicAuth(Output.of(enableBasicAuth));
        }

        public Builder enablePerformanceMode(@Nullable Output<Boolean> enablePerformanceMode) {
            $.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder enablePerformanceMode(Boolean enablePerformanceMode) {
            return enablePerformanceMode(Output.of(enablePerformanceMode));
        }

        public Builder enablePullRequestPreview(@Nullable Output<Boolean> enablePullRequestPreview) {
            $.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder enablePullRequestPreview(Boolean enablePullRequestPreview) {
            return enablePullRequestPreview(Output.of(enablePullRequestPreview));
        }

        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        public Builder framework(@Nullable Output<String> framework) {
            $.framework = framework;
            return this;
        }

        public Builder framework(String framework) {
            return framework(Output.of(framework));
        }

        public Builder pullRequestEnvironmentName(@Nullable Output<String> pullRequestEnvironmentName) {
            $.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder pullRequestEnvironmentName(String pullRequestEnvironmentName) {
            return pullRequestEnvironmentName(Output.of(pullRequestEnvironmentName));
        }

        public Builder stage(@Nullable Output<String> stage) {
            $.stage = stage;
            return this;
        }

        public Builder stage(String stage) {
            return stage(Output.of(stage));
        }

        public AppAutoBranchCreationConfigGetArgs build() {
            return $;
        }
    }

}

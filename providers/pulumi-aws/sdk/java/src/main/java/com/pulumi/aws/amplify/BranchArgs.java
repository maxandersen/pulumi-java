// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BranchArgs extends com.pulumi.resources.ResourceArgs {

    public static final BranchArgs Empty = new BranchArgs();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    @Import(name="backendEnvironmentArn")
    private @Nullable Output<String> backendEnvironmentArn;

    public Optional<Output<String>> backendEnvironmentArn() {
        return Optional.ofNullable(this.backendEnvironmentArn);
    }

    /**
     * The basic authorization credentials for the branch.
     * 
     */
    @Import(name="basicAuthCredentials")
    private @Nullable Output<String> basicAuthCredentials;

    public Optional<Output<String>> basicAuthCredentials() {
        return Optional.ofNullable(this.basicAuthCredentials);
    }

    /**
     * The name for the branch.
     * 
     */
    @Import(name="branchName", required=true)
    private Output<String> branchName;

    public Output<String> branchName() {
        return this.branchName;
    }

    /**
     * The description for the branch.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name for a branch. This is used as the default domain prefix.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Enables auto building for the branch.
     * 
     */
    @Import(name="enableAutoBuild")
    private @Nullable Output<Boolean> enableAutoBuild;

    public Optional<Output<Boolean>> enableAutoBuild() {
        return Optional.ofNullable(this.enableAutoBuild);
    }

    /**
     * Enables basic authorization for the branch.
     * 
     */
    @Import(name="enableBasicAuth")
    private @Nullable Output<Boolean> enableBasicAuth;

    public Optional<Output<Boolean>> enableBasicAuth() {
        return Optional.ofNullable(this.enableBasicAuth);
    }

    /**
     * Enables notifications for the branch.
     * 
     */
    @Import(name="enableNotification")
    private @Nullable Output<Boolean> enableNotification;

    public Optional<Output<Boolean>> enableNotification() {
        return Optional.ofNullable(this.enableNotification);
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
     * Enables pull request previews for this branch.
     * 
     */
    @Import(name="enablePullRequestPreview")
    private @Nullable Output<Boolean> enablePullRequestPreview;

    public Optional<Output<Boolean>> enablePullRequestPreview() {
        return Optional.ofNullable(this.enablePullRequestPreview);
    }

    /**
     * The environment variables for the branch.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The framework for the branch.
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
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @Import(name="stage")
    private @Nullable Output<String> stage;

    public Optional<Output<String>> stage() {
        return Optional.ofNullable(this.stage);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The content Time To Live (TTL) for the website in seconds.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<String> ttl;

    public Optional<Output<String>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private BranchArgs() {}

    private BranchArgs(BranchArgs $) {
        this.appId = $.appId;
        this.backendEnvironmentArn = $.backendEnvironmentArn;
        this.basicAuthCredentials = $.basicAuthCredentials;
        this.branchName = $.branchName;
        this.description = $.description;
        this.displayName = $.displayName;
        this.enableAutoBuild = $.enableAutoBuild;
        this.enableBasicAuth = $.enableBasicAuth;
        this.enableNotification = $.enableNotification;
        this.enablePerformanceMode = $.enablePerformanceMode;
        this.enablePullRequestPreview = $.enablePullRequestPreview;
        this.environmentVariables = $.environmentVariables;
        this.framework = $.framework;
        this.pullRequestEnvironmentName = $.pullRequestEnvironmentName;
        this.stage = $.stage;
        this.tags = $.tags;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BranchArgs $;

        public Builder() {
            $ = new BranchArgs();
        }

        public Builder(BranchArgs defaults) {
            $ = new BranchArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder backendEnvironmentArn(@Nullable Output<String> backendEnvironmentArn) {
            $.backendEnvironmentArn = backendEnvironmentArn;
            return this;
        }

        public Builder backendEnvironmentArn(String backendEnvironmentArn) {
            return backendEnvironmentArn(Output.of(backendEnvironmentArn));
        }

        public Builder basicAuthCredentials(@Nullable Output<String> basicAuthCredentials) {
            $.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder basicAuthCredentials(String basicAuthCredentials) {
            return basicAuthCredentials(Output.of(basicAuthCredentials));
        }

        public Builder branchName(Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
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

        public Builder enableNotification(@Nullable Output<Boolean> enableNotification) {
            $.enableNotification = enableNotification;
            return this;
        }

        public Builder enableNotification(Boolean enableNotification) {
            return enableNotification(Output.of(enableNotification));
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder ttl(@Nullable Output<String> ttl) {
            $.ttl = ttl;
            return this;
        }

        public Builder ttl(String ttl) {
            return ttl(Output.of(ttl));
        }

        public BranchArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.branchName = Objects.requireNonNull($.branchName, "expected parameter 'branchName' to be non-null");
            return $;
        }
    }

}

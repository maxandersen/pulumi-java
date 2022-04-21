// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplify;

import com.pulumi.awsnative.amplify.enums.BranchStage;
import com.pulumi.awsnative.amplify.inputs.BranchBasicAuthConfigArgs;
import com.pulumi.awsnative.amplify.inputs.BranchEnvironmentVariableArgs;
import com.pulumi.awsnative.amplify.inputs.BranchTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BranchArgs extends com.pulumi.resources.ResourceArgs {

    public static final BranchArgs Empty = new BranchArgs();

    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    @Import(name="basicAuthConfig")
    private @Nullable Output<BranchBasicAuthConfigArgs> basicAuthConfig;

    public Optional<Output<BranchBasicAuthConfigArgs>> basicAuthConfig() {
        return Optional.ofNullable(this.basicAuthConfig);
    }

    @Import(name="branchName")
    private @Nullable Output<String> branchName;

    public Optional<Output<String>> branchName() {
        return Optional.ofNullable(this.branchName);
    }

    @Import(name="buildSpec")
    private @Nullable Output<String> buildSpec;

    public Optional<Output<String>> buildSpec() {
        return Optional.ofNullable(this.buildSpec);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="enableAutoBuild")
    private @Nullable Output<Boolean> enableAutoBuild;

    public Optional<Output<Boolean>> enableAutoBuild() {
        return Optional.ofNullable(this.enableAutoBuild);
    }

    @Import(name="enablePerformanceMode")
    private @Nullable Output<Boolean> enablePerformanceMode;

    public Optional<Output<Boolean>> enablePerformanceMode() {
        return Optional.ofNullable(this.enablePerformanceMode);
    }

    @Import(name="enablePullRequestPreview")
    private @Nullable Output<Boolean> enablePullRequestPreview;

    public Optional<Output<Boolean>> enablePullRequestPreview() {
        return Optional.ofNullable(this.enablePullRequestPreview);
    }

    @Import(name="environmentVariables")
    private @Nullable Output<List<BranchEnvironmentVariableArgs>> environmentVariables;

    public Optional<Output<List<BranchEnvironmentVariableArgs>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    @Import(name="pullRequestEnvironmentName")
    private @Nullable Output<String> pullRequestEnvironmentName;

    public Optional<Output<String>> pullRequestEnvironmentName() {
        return Optional.ofNullable(this.pullRequestEnvironmentName);
    }

    @Import(name="stage")
    private @Nullable Output<BranchStage> stage;

    public Optional<Output<BranchStage>> stage() {
        return Optional.ofNullable(this.stage);
    }

    @Import(name="tags")
    private @Nullable Output<List<BranchTagArgs>> tags;

    public Optional<Output<List<BranchTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BranchArgs() {}

    private BranchArgs(BranchArgs $) {
        this.appId = $.appId;
        this.basicAuthConfig = $.basicAuthConfig;
        this.branchName = $.branchName;
        this.buildSpec = $.buildSpec;
        this.description = $.description;
        this.enableAutoBuild = $.enableAutoBuild;
        this.enablePerformanceMode = $.enablePerformanceMode;
        this.enablePullRequestPreview = $.enablePullRequestPreview;
        this.environmentVariables = $.environmentVariables;
        this.pullRequestEnvironmentName = $.pullRequestEnvironmentName;
        this.stage = $.stage;
        this.tags = $.tags;
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

        public Builder basicAuthConfig(@Nullable Output<BranchBasicAuthConfigArgs> basicAuthConfig) {
            $.basicAuthConfig = basicAuthConfig;
            return this;
        }

        public Builder basicAuthConfig(BranchBasicAuthConfigArgs basicAuthConfig) {
            return basicAuthConfig(Output.of(basicAuthConfig));
        }

        public Builder branchName(@Nullable Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        public Builder buildSpec(@Nullable Output<String> buildSpec) {
            $.buildSpec = buildSpec;
            return this;
        }

        public Builder buildSpec(String buildSpec) {
            return buildSpec(Output.of(buildSpec));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableAutoBuild(@Nullable Output<Boolean> enableAutoBuild) {
            $.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder enableAutoBuild(Boolean enableAutoBuild) {
            return enableAutoBuild(Output.of(enableAutoBuild));
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

        public Builder environmentVariables(@Nullable Output<List<BranchEnvironmentVariableArgs>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(List<BranchEnvironmentVariableArgs> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        public Builder environmentVariables(BranchEnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }

        public Builder pullRequestEnvironmentName(@Nullable Output<String> pullRequestEnvironmentName) {
            $.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder pullRequestEnvironmentName(String pullRequestEnvironmentName) {
            return pullRequestEnvironmentName(Output.of(pullRequestEnvironmentName));
        }

        public Builder stage(@Nullable Output<BranchStage> stage) {
            $.stage = stage;
            return this;
        }

        public Builder stage(BranchStage stage) {
            return stage(Output.of(stage));
        }

        public Builder tags(@Nullable Output<List<BranchTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<BranchTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(BranchTagArgs... tags) {
            return tags(List.of(tags));
        }

        public BranchArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}

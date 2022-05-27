// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.SourceControlGithubActionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceControlState extends com.pulumi.resources.ResourceArgs {

    public static final SourceControlState Empty = new SourceControlState();

    /**
     * The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The branch name to use for deployments. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return The branch name to use for deployments. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * A `github_action_configuration` block as defined below.
     * 
     */
    @Import(name="githubActionConfiguration")
    private @Nullable Output<SourceControlGithubActionConfigurationArgs> githubActionConfiguration;

    /**
     * @return A `github_action_configuration` block as defined below.
     * 
     */
    public Optional<Output<SourceControlGithubActionConfigurationArgs>> githubActionConfiguration() {
        return Optional.ofNullable(this.githubActionConfiguration);
    }

    /**
     * The URL for the repository. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="repoUrl")
    private @Nullable Output<String> repoUrl;

    /**
     * @return The URL for the repository. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> repoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }

    /**
     * Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="rollbackEnabled")
    private @Nullable Output<Boolean> rollbackEnabled;

    /**
     * @return Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> rollbackEnabled() {
        return Optional.ofNullable(this.rollbackEnabled);
    }

    /**
     * The SCM Type in use. This value is decoded by the service from the repository information supplied.
     * 
     */
    @Import(name="scmType")
    private @Nullable Output<String> scmType;

    /**
     * @return The SCM Type in use. This value is decoded by the service from the repository information supplied.
     * 
     */
    public Optional<Output<String>> scmType() {
        return Optional.ofNullable(this.scmType);
    }

    /**
     * Should the App use local Git configuration. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="useLocalGit")
    private @Nullable Output<Boolean> useLocalGit;

    /**
     * @return Should the App use local Git configuration. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> useLocalGit() {
        return Optional.ofNullable(this.useLocalGit);
    }

    /**
     * Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="useManualIntegration")
    private @Nullable Output<Boolean> useManualIntegration;

    /**
     * @return Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> useManualIntegration() {
        return Optional.ofNullable(this.useManualIntegration);
    }

    /**
     * The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="useMercurial")
    private @Nullable Output<Boolean> useMercurial;

    /**
     * @return The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> useMercurial() {
        return Optional.ofNullable(this.useMercurial);
    }

    /**
     * Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
     * 
     */
    @Import(name="usesGithubAction")
    private @Nullable Output<Boolean> usesGithubAction;

    /**
     * @return Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
     * 
     */
    public Optional<Output<Boolean>> usesGithubAction() {
        return Optional.ofNullable(this.usesGithubAction);
    }

    private SourceControlState() {}

    private SourceControlState(SourceControlState $) {
        this.appId = $.appId;
        this.branch = $.branch;
        this.githubActionConfiguration = $.githubActionConfiguration;
        this.repoUrl = $.repoUrl;
        this.rollbackEnabled = $.rollbackEnabled;
        this.scmType = $.scmType;
        this.useLocalGit = $.useLocalGit;
        this.useManualIntegration = $.useManualIntegration;
        this.useMercurial = $.useMercurial;
        this.usesGithubAction = $.usesGithubAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceControlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceControlState $;

        public Builder() {
            $ = new SourceControlState();
        }

        public Builder(SourceControlState defaults) {
            $ = new SourceControlState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param branch The branch name to use for deployments. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch The branch name to use for deployments. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param githubActionConfiguration A `github_action_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder githubActionConfiguration(@Nullable Output<SourceControlGithubActionConfigurationArgs> githubActionConfiguration) {
            $.githubActionConfiguration = githubActionConfiguration;
            return this;
        }

        /**
         * @param githubActionConfiguration A `github_action_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder githubActionConfiguration(SourceControlGithubActionConfigurationArgs githubActionConfiguration) {
            return githubActionConfiguration(Output.of(githubActionConfiguration));
        }

        /**
         * @param repoUrl The URL for the repository. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder repoUrl(@Nullable Output<String> repoUrl) {
            $.repoUrl = repoUrl;
            return this;
        }

        /**
         * @param repoUrl The URL for the repository. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder repoUrl(String repoUrl) {
            return repoUrl(Output.of(repoUrl));
        }

        /**
         * @param rollbackEnabled Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder rollbackEnabled(@Nullable Output<Boolean> rollbackEnabled) {
            $.rollbackEnabled = rollbackEnabled;
            return this;
        }

        /**
         * @param rollbackEnabled Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder rollbackEnabled(Boolean rollbackEnabled) {
            return rollbackEnabled(Output.of(rollbackEnabled));
        }

        /**
         * @param scmType The SCM Type in use. This value is decoded by the service from the repository information supplied.
         * 
         * @return builder
         * 
         */
        public Builder scmType(@Nullable Output<String> scmType) {
            $.scmType = scmType;
            return this;
        }

        /**
         * @param scmType The SCM Type in use. This value is decoded by the service from the repository information supplied.
         * 
         * @return builder
         * 
         */
        public Builder scmType(String scmType) {
            return scmType(Output.of(scmType));
        }

        /**
         * @param useLocalGit Should the App use local Git configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder useLocalGit(@Nullable Output<Boolean> useLocalGit) {
            $.useLocalGit = useLocalGit;
            return this;
        }

        /**
         * @param useLocalGit Should the App use local Git configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder useLocalGit(Boolean useLocalGit) {
            return useLocalGit(Output.of(useLocalGit));
        }

        /**
         * @param useManualIntegration Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder useManualIntegration(@Nullable Output<Boolean> useManualIntegration) {
            $.useManualIntegration = useManualIntegration;
            return this;
        }

        /**
         * @param useManualIntegration Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder useManualIntegration(Boolean useManualIntegration) {
            return useManualIntegration(Output.of(useManualIntegration));
        }

        /**
         * @param useMercurial The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder useMercurial(@Nullable Output<Boolean> useMercurial) {
            $.useMercurial = useMercurial;
            return this;
        }

        /**
         * @param useMercurial The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder useMercurial(Boolean useMercurial) {
            return useMercurial(Output.of(useMercurial));
        }

        /**
         * @param usesGithubAction Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
         * 
         * @return builder
         * 
         */
        public Builder usesGithubAction(@Nullable Output<Boolean> usesGithubAction) {
            $.usesGithubAction = usesGithubAction;
            return this;
        }

        /**
         * @param usesGithubAction Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
         * 
         * @return builder
         * 
         */
        public Builder usesGithubAction(Boolean usesGithubAction) {
            return usesGithubAction(Output.of(usesGithubAction));
        }

        public SourceControlState build() {
            return $;
        }
    }

}

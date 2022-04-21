// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.inputs;

import com.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigGetArgs;
import com.pulumi.aws.amplify.inputs.AppCustomRuleGetArgs;
import com.pulumi.aws.amplify.inputs.AppProductionBranchGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppState extends com.pulumi.resources.ResourceArgs {

    public static final AppState Empty = new AppState();

    /**
     * The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * The Amazon Resource Name (ARN) of the Amplify app.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The automated branch creation configuration for an Amplify app. An `auto_branch_creation_config` block is documented below.
     * 
     */
    @Import(name="autoBranchCreationConfig")
    private @Nullable Output<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig;

    public Optional<Output<AppAutoBranchCreationConfigGetArgs>> autoBranchCreationConfig() {
        return Optional.ofNullable(this.autoBranchCreationConfig);
    }

    /**
     * The automated branch creation glob patterns for an Amplify app.
     * 
     */
    @Import(name="autoBranchCreationPatterns")
    private @Nullable Output<List<String>> autoBranchCreationPatterns;

    public Optional<Output<List<String>>> autoBranchCreationPatterns() {
        return Optional.ofNullable(this.autoBranchCreationPatterns);
    }

    /**
     * The credentials for basic authorization for an Amplify app.
     * 
     */
    @Import(name="basicAuthCredentials")
    private @Nullable Output<String> basicAuthCredentials;

    public Optional<Output<String>> basicAuthCredentials() {
        return Optional.ofNullable(this.basicAuthCredentials);
    }

    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     * 
     */
    @Import(name="buildSpec")
    private @Nullable Output<String> buildSpec;

    public Optional<Output<String>> buildSpec() {
        return Optional.ofNullable(this.buildSpec);
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app. A `custom_rule` block is documented below.
     * 
     */
    @Import(name="customRules")
    private @Nullable Output<List<AppCustomRuleGetArgs>> customRules;

    public Optional<Output<List<AppCustomRuleGetArgs>>> customRules() {
        return Optional.ofNullable(this.customRules);
    }

    /**
     * The default domain for the Amplify app.
     * 
     */
    @Import(name="defaultDomain")
    private @Nullable Output<String> defaultDomain;

    public Optional<Output<String>> defaultDomain() {
        return Optional.ofNullable(this.defaultDomain);
    }

    /**
     * The description for an Amplify app.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enables automated branch creation for an Amplify app.
     * 
     */
    @Import(name="enableAutoBranchCreation")
    private @Nullable Output<Boolean> enableAutoBranchCreation;

    public Optional<Output<Boolean>> enableAutoBranchCreation() {
        return Optional.ofNullable(this.enableAutoBranchCreation);
    }

    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     * 
     */
    @Import(name="enableBasicAuth")
    private @Nullable Output<Boolean> enableBasicAuth;

    public Optional<Output<Boolean>> enableBasicAuth() {
        return Optional.ofNullable(this.enableBasicAuth);
    }

    /**
     * Enables auto-building of branches for the Amplify App.
     * 
     */
    @Import(name="enableBranchAutoBuild")
    private @Nullable Output<Boolean> enableBranchAutoBuild;

    public Optional<Output<Boolean>> enableBranchAutoBuild() {
        return Optional.ofNullable(this.enableBranchAutoBuild);
    }

    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     * 
     */
    @Import(name="enableBranchAutoDeletion")
    private @Nullable Output<Boolean> enableBranchAutoDeletion;

    public Optional<Output<Boolean>> enableBranchAutoDeletion() {
        return Optional.ofNullable(this.enableBranchAutoDeletion);
    }

    /**
     * The environment variables map for an Amplify app.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The AWS Identity and Access Management (IAM) service role for an Amplify app.
     * 
     */
    @Import(name="iamServiceRoleArn")
    private @Nullable Output<String> iamServiceRoleArn;

    public Optional<Output<String>> iamServiceRoleArn() {
        return Optional.ofNullable(this.iamServiceRoleArn);
    }

    /**
     * The name for an Amplify app.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     * 
     */
    @Import(name="oauthToken")
    private @Nullable Output<String> oauthToken;

    public Optional<Output<String>> oauthToken() {
        return Optional.ofNullable(this.oauthToken);
    }

    /**
     * The platform or framework for an Amplify app. Valid values: `WEB`.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * Describes the information about a production branch for an Amplify app. A `production_branch` block is documented below.
     * 
     */
    @Import(name="productionBranches")
    private @Nullable Output<List<AppProductionBranchGetArgs>> productionBranches;

    public Optional<Output<List<AppProductionBranchGetArgs>>> productionBranches() {
        return Optional.ofNullable(this.productionBranches);
    }

    /**
     * The repository for an Amplify app.
     * 
     */
    @Import(name="repository")
    private @Nullable Output<String> repository;

    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
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
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private AppState() {}

    private AppState(AppState $) {
        this.accessToken = $.accessToken;
        this.arn = $.arn;
        this.autoBranchCreationConfig = $.autoBranchCreationConfig;
        this.autoBranchCreationPatterns = $.autoBranchCreationPatterns;
        this.basicAuthCredentials = $.basicAuthCredentials;
        this.buildSpec = $.buildSpec;
        this.customRules = $.customRules;
        this.defaultDomain = $.defaultDomain;
        this.description = $.description;
        this.enableAutoBranchCreation = $.enableAutoBranchCreation;
        this.enableBasicAuth = $.enableBasicAuth;
        this.enableBranchAutoBuild = $.enableBranchAutoBuild;
        this.enableBranchAutoDeletion = $.enableBranchAutoDeletion;
        this.environmentVariables = $.environmentVariables;
        this.iamServiceRoleArn = $.iamServiceRoleArn;
        this.name = $.name;
        this.oauthToken = $.oauthToken;
        this.platform = $.platform;
        this.productionBranches = $.productionBranches;
        this.repository = $.repository;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppState $;

        public Builder() {
            $ = new AppState();
        }

        public Builder(AppState defaults) {
            $ = new AppState(Objects.requireNonNull(defaults));
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder autoBranchCreationConfig(@Nullable Output<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig) {
            $.autoBranchCreationConfig = autoBranchCreationConfig;
            return this;
        }

        public Builder autoBranchCreationConfig(AppAutoBranchCreationConfigGetArgs autoBranchCreationConfig) {
            return autoBranchCreationConfig(Output.of(autoBranchCreationConfig));
        }

        public Builder autoBranchCreationPatterns(@Nullable Output<List<String>> autoBranchCreationPatterns) {
            $.autoBranchCreationPatterns = autoBranchCreationPatterns;
            return this;
        }

        public Builder autoBranchCreationPatterns(List<String> autoBranchCreationPatterns) {
            return autoBranchCreationPatterns(Output.of(autoBranchCreationPatterns));
        }

        public Builder autoBranchCreationPatterns(String... autoBranchCreationPatterns) {
            return autoBranchCreationPatterns(List.of(autoBranchCreationPatterns));
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

        public Builder customRules(@Nullable Output<List<AppCustomRuleGetArgs>> customRules) {
            $.customRules = customRules;
            return this;
        }

        public Builder customRules(List<AppCustomRuleGetArgs> customRules) {
            return customRules(Output.of(customRules));
        }

        public Builder customRules(AppCustomRuleGetArgs... customRules) {
            return customRules(List.of(customRules));
        }

        public Builder defaultDomain(@Nullable Output<String> defaultDomain) {
            $.defaultDomain = defaultDomain;
            return this;
        }

        public Builder defaultDomain(String defaultDomain) {
            return defaultDomain(Output.of(defaultDomain));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableAutoBranchCreation(@Nullable Output<Boolean> enableAutoBranchCreation) {
            $.enableAutoBranchCreation = enableAutoBranchCreation;
            return this;
        }

        public Builder enableAutoBranchCreation(Boolean enableAutoBranchCreation) {
            return enableAutoBranchCreation(Output.of(enableAutoBranchCreation));
        }

        public Builder enableBasicAuth(@Nullable Output<Boolean> enableBasicAuth) {
            $.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder enableBasicAuth(Boolean enableBasicAuth) {
            return enableBasicAuth(Output.of(enableBasicAuth));
        }

        public Builder enableBranchAutoBuild(@Nullable Output<Boolean> enableBranchAutoBuild) {
            $.enableBranchAutoBuild = enableBranchAutoBuild;
            return this;
        }

        public Builder enableBranchAutoBuild(Boolean enableBranchAutoBuild) {
            return enableBranchAutoBuild(Output.of(enableBranchAutoBuild));
        }

        public Builder enableBranchAutoDeletion(@Nullable Output<Boolean> enableBranchAutoDeletion) {
            $.enableBranchAutoDeletion = enableBranchAutoDeletion;
            return this;
        }

        public Builder enableBranchAutoDeletion(Boolean enableBranchAutoDeletion) {
            return enableBranchAutoDeletion(Output.of(enableBranchAutoDeletion));
        }

        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        public Builder iamServiceRoleArn(@Nullable Output<String> iamServiceRoleArn) {
            $.iamServiceRoleArn = iamServiceRoleArn;
            return this;
        }

        public Builder iamServiceRoleArn(String iamServiceRoleArn) {
            return iamServiceRoleArn(Output.of(iamServiceRoleArn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder oauthToken(@Nullable Output<String> oauthToken) {
            $.oauthToken = oauthToken;
            return this;
        }

        public Builder oauthToken(String oauthToken) {
            return oauthToken(Output.of(oauthToken));
        }

        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        public Builder productionBranches(@Nullable Output<List<AppProductionBranchGetArgs>> productionBranches) {
            $.productionBranches = productionBranches;
            return this;
        }

        public Builder productionBranches(List<AppProductionBranchGetArgs> productionBranches) {
            return productionBranches(Output.of(productionBranches));
        }

        public Builder productionBranches(AppProductionBranchGetArgs... productionBranches) {
            return productionBranches(List.of(productionBranches));
        }

        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public AppState build() {
            return $;
        }
    }

}

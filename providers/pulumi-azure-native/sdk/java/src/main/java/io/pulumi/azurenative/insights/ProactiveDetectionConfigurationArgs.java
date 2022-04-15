// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProactiveDetectionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProactiveDetectionConfigurationArgs Empty = new ProactiveDetectionConfigurationArgs();

    /**
     * The ProactiveDetection configuration ID. This is unique within a Application Insights component.
     * 
     */
    @Import(name="configurationId")
      private final @Nullable Output<String> configurationId;

    public Output<String> configurationId() {
        return this.configurationId == null ? Codegen.empty() : this.configurationId;
    }

    /**
     * Custom email addresses for this rule notifications
     * 
     */
    @Import(name="customEmails")
      private final @Nullable Output<List<String>> customEmails;

    public Output<List<String>> customEmails() {
        return this.customEmails == null ? Codegen.empty() : this.customEmails;
    }

    /**
     * A flag that indicates whether this rule is enabled by the user
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The last time this rule was updated
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable Output<String> lastUpdatedTime;

    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime == null ? Codegen.empty() : this.lastUpdatedTime;
    }

    /**
     * The rule name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Static definitions of the ProactiveDetection configuration rule (same values for all components).
     * 
     */
    @Import(name="ruleDefinitions")
      private final @Nullable Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions;

    public Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions() {
        return this.ruleDefinitions == null ? Codegen.empty() : this.ruleDefinitions;
    }

    /**
     * A flag that indicated whether notifications on this rule should be sent to subscription owners
     * 
     */
    @Import(name="sendEmailsToSubscriptionOwners")
      private final @Nullable Output<Boolean> sendEmailsToSubscriptionOwners;

    public Output<Boolean> sendEmailsToSubscriptionOwners() {
        return this.sendEmailsToSubscriptionOwners == null ? Codegen.empty() : this.sendEmailsToSubscriptionOwners;
    }

    public ProactiveDetectionConfigurationArgs(
        @Nullable Output<String> configurationId,
        @Nullable Output<List<String>> customEmails,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> lastUpdatedTime,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        Output<String> resourceName,
        @Nullable Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions,
        @Nullable Output<Boolean> sendEmailsToSubscriptionOwners) {
        this.configurationId = configurationId;
        this.customEmails = customEmails;
        this.enabled = enabled;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.ruleDefinitions = ruleDefinitions;
        this.sendEmailsToSubscriptionOwners = sendEmailsToSubscriptionOwners;
    }

    private ProactiveDetectionConfigurationArgs() {
        this.configurationId = Codegen.empty();
        this.customEmails = Codegen.empty();
        this.enabled = Codegen.empty();
        this.lastUpdatedTime = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.ruleDefinitions = Codegen.empty();
        this.sendEmailsToSubscriptionOwners = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProactiveDetectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationId;
        private @Nullable Output<List<String>> customEmails;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> lastUpdatedTime;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;
        private @Nullable Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions;
        private @Nullable Output<Boolean> sendEmailsToSubscriptionOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(ProactiveDetectionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationId = defaults.configurationId;
    	      this.customEmails = defaults.customEmails;
    	      this.enabled = defaults.enabled;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.ruleDefinitions = defaults.ruleDefinitions;
    	      this.sendEmailsToSubscriptionOwners = defaults.sendEmailsToSubscriptionOwners;
        }

        public Builder configurationId(@Nullable Output<String> configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public Builder configurationId(@Nullable String configurationId) {
            this.configurationId = Codegen.ofNullable(configurationId);
            return this;
        }
        public Builder customEmails(@Nullable Output<List<String>> customEmails) {
            this.customEmails = customEmails;
            return this;
        }
        public Builder customEmails(@Nullable List<String> customEmails) {
            this.customEmails = Codegen.ofNullable(customEmails);
            return this;
        }
        public Builder customEmails(String... customEmails) {
            return customEmails(List.of(customEmails));
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Codegen.ofNullable(lastUpdatedTime);
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public Builder ruleDefinitions(@Nullable Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions) {
            this.ruleDefinitions = ruleDefinitions;
            return this;
        }
        public Builder ruleDefinitions(@Nullable ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs ruleDefinitions) {
            this.ruleDefinitions = Codegen.ofNullable(ruleDefinitions);
            return this;
        }
        public Builder sendEmailsToSubscriptionOwners(@Nullable Output<Boolean> sendEmailsToSubscriptionOwners) {
            this.sendEmailsToSubscriptionOwners = sendEmailsToSubscriptionOwners;
            return this;
        }
        public Builder sendEmailsToSubscriptionOwners(@Nullable Boolean sendEmailsToSubscriptionOwners) {
            this.sendEmailsToSubscriptionOwners = Codegen.ofNullable(sendEmailsToSubscriptionOwners);
            return this;
        }        public ProactiveDetectionConfigurationArgs build() {
            return new ProactiveDetectionConfigurationArgs(configurationId, customEmails, enabled, lastUpdatedTime, name, resourceGroupName, resourceName, ruleDefinitions, sendEmailsToSubscriptionOwners);
        }
    }
}

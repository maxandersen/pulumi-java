// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.outputs;

import com.pulumi.awsnative.applicationinsights.outputs.ApplicationComponentMonitoringSetting;
import com.pulumi.awsnative.applicationinsights.outputs.ApplicationCustomComponent;
import com.pulumi.awsnative.applicationinsights.outputs.ApplicationLogPatternSet;
import com.pulumi.awsnative.applicationinsights.outputs.ApplicationTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationResult {
    /**
     * The ARN of the ApplicationInsights application.
     * 
     */
    private final @Nullable String applicationARN;
    /**
     * If set to true, application will be configured with recommended monitoring configuration.
     * 
     */
    private final @Nullable Boolean autoConfigurationEnabled;
    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources.
     * 
     */
    private final @Nullable Boolean cWEMonitorEnabled;
    /**
     * The monitoring settings of the components.
     * 
     */
    private final @Nullable List<ApplicationComponentMonitoringSetting> componentMonitoringSettings;
    /**
     * The custom grouped components.
     * 
     */
    private final @Nullable List<ApplicationCustomComponent> customComponents;
    /**
     * The log pattern sets.
     * 
     */
    private final @Nullable List<ApplicationLogPatternSet> logPatternSets;
    /**
     * When set to true, creates opsItems for any problems detected on an application.
     * 
     */
    private final @Nullable Boolean opsCenterEnabled;
    /**
     * The SNS topic provided to Application Insights that is associated to the created opsItem.
     * 
     */
    private final @Nullable String opsItemSNSTopicArn;
    /**
     * The tags of Application Insights application.
     * 
     */
    private final @Nullable List<ApplicationTag> tags;

    @CustomType.Constructor
    private GetApplicationResult(
        @CustomType.Parameter("applicationARN") @Nullable String applicationARN,
        @CustomType.Parameter("autoConfigurationEnabled") @Nullable Boolean autoConfigurationEnabled,
        @CustomType.Parameter("cWEMonitorEnabled") @Nullable Boolean cWEMonitorEnabled,
        @CustomType.Parameter("componentMonitoringSettings") @Nullable List<ApplicationComponentMonitoringSetting> componentMonitoringSettings,
        @CustomType.Parameter("customComponents") @Nullable List<ApplicationCustomComponent> customComponents,
        @CustomType.Parameter("logPatternSets") @Nullable List<ApplicationLogPatternSet> logPatternSets,
        @CustomType.Parameter("opsCenterEnabled") @Nullable Boolean opsCenterEnabled,
        @CustomType.Parameter("opsItemSNSTopicArn") @Nullable String opsItemSNSTopicArn,
        @CustomType.Parameter("tags") @Nullable List<ApplicationTag> tags) {
        this.applicationARN = applicationARN;
        this.autoConfigurationEnabled = autoConfigurationEnabled;
        this.cWEMonitorEnabled = cWEMonitorEnabled;
        this.componentMonitoringSettings = componentMonitoringSettings;
        this.customComponents = customComponents;
        this.logPatternSets = logPatternSets;
        this.opsCenterEnabled = opsCenterEnabled;
        this.opsItemSNSTopicArn = opsItemSNSTopicArn;
        this.tags = tags;
    }

    /**
     * The ARN of the ApplicationInsights application.
     * 
    */
    public Optional<String> applicationARN() {
        return Optional.ofNullable(this.applicationARN);
    }
    /**
     * If set to true, application will be configured with recommended monitoring configuration.
     * 
    */
    public Optional<Boolean> autoConfigurationEnabled() {
        return Optional.ofNullable(this.autoConfigurationEnabled);
    }
    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources.
     * 
    */
    public Optional<Boolean> cWEMonitorEnabled() {
        return Optional.ofNullable(this.cWEMonitorEnabled);
    }
    /**
     * The monitoring settings of the components.
     * 
    */
    public List<ApplicationComponentMonitoringSetting> componentMonitoringSettings() {
        return this.componentMonitoringSettings == null ? List.of() : this.componentMonitoringSettings;
    }
    /**
     * The custom grouped components.
     * 
    */
    public List<ApplicationCustomComponent> customComponents() {
        return this.customComponents == null ? List.of() : this.customComponents;
    }
    /**
     * The log pattern sets.
     * 
    */
    public List<ApplicationLogPatternSet> logPatternSets() {
        return this.logPatternSets == null ? List.of() : this.logPatternSets;
    }
    /**
     * When set to true, creates opsItems for any problems detected on an application.
     * 
    */
    public Optional<Boolean> opsCenterEnabled() {
        return Optional.ofNullable(this.opsCenterEnabled);
    }
    /**
     * The SNS topic provided to Application Insights that is associated to the created opsItem.
     * 
    */
    public Optional<String> opsItemSNSTopicArn() {
        return Optional.ofNullable(this.opsItemSNSTopicArn);
    }
    /**
     * The tags of Application Insights application.
     * 
    */
    public List<ApplicationTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationARN;
        private @Nullable Boolean autoConfigurationEnabled;
        private @Nullable Boolean cWEMonitorEnabled;
        private @Nullable List<ApplicationComponentMonitoringSetting> componentMonitoringSettings;
        private @Nullable List<ApplicationCustomComponent> customComponents;
        private @Nullable List<ApplicationLogPatternSet> logPatternSets;
        private @Nullable Boolean opsCenterEnabled;
        private @Nullable String opsItemSNSTopicArn;
        private @Nullable List<ApplicationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationARN = defaults.applicationARN;
    	      this.autoConfigurationEnabled = defaults.autoConfigurationEnabled;
    	      this.cWEMonitorEnabled = defaults.cWEMonitorEnabled;
    	      this.componentMonitoringSettings = defaults.componentMonitoringSettings;
    	      this.customComponents = defaults.customComponents;
    	      this.logPatternSets = defaults.logPatternSets;
    	      this.opsCenterEnabled = defaults.opsCenterEnabled;
    	      this.opsItemSNSTopicArn = defaults.opsItemSNSTopicArn;
    	      this.tags = defaults.tags;
        }

        public Builder applicationARN(@Nullable String applicationARN) {
            this.applicationARN = applicationARN;
            return this;
        }
        public Builder autoConfigurationEnabled(@Nullable Boolean autoConfigurationEnabled) {
            this.autoConfigurationEnabled = autoConfigurationEnabled;
            return this;
        }
        public Builder cWEMonitorEnabled(@Nullable Boolean cWEMonitorEnabled) {
            this.cWEMonitorEnabled = cWEMonitorEnabled;
            return this;
        }
        public Builder componentMonitoringSettings(@Nullable List<ApplicationComponentMonitoringSetting> componentMonitoringSettings) {
            this.componentMonitoringSettings = componentMonitoringSettings;
            return this;
        }
        public Builder componentMonitoringSettings(ApplicationComponentMonitoringSetting... componentMonitoringSettings) {
            return componentMonitoringSettings(List.of(componentMonitoringSettings));
        }
        public Builder customComponents(@Nullable List<ApplicationCustomComponent> customComponents) {
            this.customComponents = customComponents;
            return this;
        }
        public Builder customComponents(ApplicationCustomComponent... customComponents) {
            return customComponents(List.of(customComponents));
        }
        public Builder logPatternSets(@Nullable List<ApplicationLogPatternSet> logPatternSets) {
            this.logPatternSets = logPatternSets;
            return this;
        }
        public Builder logPatternSets(ApplicationLogPatternSet... logPatternSets) {
            return logPatternSets(List.of(logPatternSets));
        }
        public Builder opsCenterEnabled(@Nullable Boolean opsCenterEnabled) {
            this.opsCenterEnabled = opsCenterEnabled;
            return this;
        }
        public Builder opsItemSNSTopicArn(@Nullable String opsItemSNSTopicArn) {
            this.opsItemSNSTopicArn = opsItemSNSTopicArn;
            return this;
        }
        public Builder tags(@Nullable List<ApplicationTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ApplicationTag... tags) {
            return tags(List.of(tags));
        }        public GetApplicationResult build() {
            return new GetApplicationResult(applicationARN, autoConfigurationEnabled, cWEMonitorEnabled, componentMonitoringSettings, customComponents, logPatternSets, opsCenterEnabled, opsItemSNSTopicArn, tags);
        }
    }
}

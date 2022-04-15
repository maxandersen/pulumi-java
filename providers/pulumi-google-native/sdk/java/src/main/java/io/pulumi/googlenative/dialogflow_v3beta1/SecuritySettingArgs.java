// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.SecuritySettingPurgeDataTypesItem;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.SecuritySettingRedactionScope;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.SecuritySettingRedactionStrategy;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecuritySettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecuritySettingArgs Empty = new SecuritySettingArgs();

    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    @Import(name="deidentifyTemplate")
      private final @Nullable Output<String> deidentifyTemplate;

    public Output<String> deidentifyTemplate() {
        return this.deidentifyTemplate == null ? Codegen.empty() : this.deidentifyTemplate;
    }

    /**
     * The human-readable name of the security settings, unique within the location.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    @Import(name="insightsExportSettings")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs> insightsExportSettings;

    public Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs> insightsExportSettings() {
        return this.insightsExportSettings == null ? Codegen.empty() : this.insightsExportSettings;
    }

    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    @Import(name="inspectTemplate")
      private final @Nullable Output<String> inspectTemplate;

    public Output<String> inspectTemplate() {
        return this.inspectTemplate == null ? Codegen.empty() : this.inspectTemplate;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * List of types of data to remove when retention settings triggers purge.
     * 
     */
    @Import(name="purgeDataTypes")
      private final @Nullable Output<List<SecuritySettingPurgeDataTypesItem>> purgeDataTypes;

    public Output<List<SecuritySettingPurgeDataTypesItem>> purgeDataTypes() {
        return this.purgeDataTypes == null ? Codegen.empty() : this.purgeDataTypes;
    }

    /**
     * Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    @Import(name="redactionScope")
      private final @Nullable Output<SecuritySettingRedactionScope> redactionScope;

    public Output<SecuritySettingRedactionScope> redactionScope() {
        return this.redactionScope == null ? Codegen.empty() : this.redactionScope;
    }

    /**
     * Strategy that defines how we do redaction.
     * 
     */
    @Import(name="redactionStrategy")
      private final @Nullable Output<SecuritySettingRedactionStrategy> redactionStrategy;

    public Output<SecuritySettingRedactionStrategy> redactionStrategy() {
        return this.redactionStrategy == null ? Codegen.empty() : this.redactionStrategy;
    }

    /**
     * Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow's default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow's default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    @Import(name="retentionWindowDays")
      private final @Nullable Output<Integer> retentionWindowDays;

    public Output<Integer> retentionWindowDays() {
        return this.retentionWindowDays == null ? Codegen.empty() : this.retentionWindowDays;
    }

    public SecuritySettingArgs(
        @Nullable Output<String> deidentifyTemplate,
        Output<String> displayName,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs> insightsExportSettings,
        @Nullable Output<String> inspectTemplate,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<SecuritySettingPurgeDataTypesItem>> purgeDataTypes,
        @Nullable Output<SecuritySettingRedactionScope> redactionScope,
        @Nullable Output<SecuritySettingRedactionStrategy> redactionStrategy,
        @Nullable Output<Integer> retentionWindowDays) {
        this.deidentifyTemplate = deidentifyTemplate;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.insightsExportSettings = insightsExportSettings;
        this.inspectTemplate = inspectTemplate;
        this.location = location;
        this.name = name;
        this.project = project;
        this.purgeDataTypes = purgeDataTypes;
        this.redactionScope = redactionScope;
        this.redactionStrategy = redactionStrategy;
        this.retentionWindowDays = retentionWindowDays;
    }

    private SecuritySettingArgs() {
        this.deidentifyTemplate = Codegen.empty();
        this.displayName = Codegen.empty();
        this.insightsExportSettings = Codegen.empty();
        this.inspectTemplate = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.purgeDataTypes = Codegen.empty();
        this.redactionScope = Codegen.empty();
        this.redactionStrategy = Codegen.empty();
        this.retentionWindowDays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecuritySettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deidentifyTemplate;
        private Output<String> displayName;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs> insightsExportSettings;
        private @Nullable Output<String> inspectTemplate;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<SecuritySettingPurgeDataTypesItem>> purgeDataTypes;
        private @Nullable Output<SecuritySettingRedactionScope> redactionScope;
        private @Nullable Output<SecuritySettingRedactionStrategy> redactionStrategy;
        private @Nullable Output<Integer> retentionWindowDays;

        public Builder() {
    	      // Empty
        }

        public Builder(SecuritySettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deidentifyTemplate = defaults.deidentifyTemplate;
    	      this.displayName = defaults.displayName;
    	      this.insightsExportSettings = defaults.insightsExportSettings;
    	      this.inspectTemplate = defaults.inspectTemplate;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.purgeDataTypes = defaults.purgeDataTypes;
    	      this.redactionScope = defaults.redactionScope;
    	      this.redactionStrategy = defaults.redactionStrategy;
    	      this.retentionWindowDays = defaults.retentionWindowDays;
        }

        public Builder deidentifyTemplate(@Nullable Output<String> deidentifyTemplate) {
            this.deidentifyTemplate = deidentifyTemplate;
            return this;
        }
        public Builder deidentifyTemplate(@Nullable String deidentifyTemplate) {
            this.deidentifyTemplate = Codegen.ofNullable(deidentifyTemplate);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder insightsExportSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs> insightsExportSettings) {
            this.insightsExportSettings = insightsExportSettings;
            return this;
        }
        public Builder insightsExportSettings(@Nullable GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs insightsExportSettings) {
            this.insightsExportSettings = Codegen.ofNullable(insightsExportSettings);
            return this;
        }
        public Builder inspectTemplate(@Nullable Output<String> inspectTemplate) {
            this.inspectTemplate = inspectTemplate;
            return this;
        }
        public Builder inspectTemplate(@Nullable String inspectTemplate) {
            this.inspectTemplate = Codegen.ofNullable(inspectTemplate);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder purgeDataTypes(@Nullable Output<List<SecuritySettingPurgeDataTypesItem>> purgeDataTypes) {
            this.purgeDataTypes = purgeDataTypes;
            return this;
        }
        public Builder purgeDataTypes(@Nullable List<SecuritySettingPurgeDataTypesItem> purgeDataTypes) {
            this.purgeDataTypes = Codegen.ofNullable(purgeDataTypes);
            return this;
        }
        public Builder purgeDataTypes(SecuritySettingPurgeDataTypesItem... purgeDataTypes) {
            return purgeDataTypes(List.of(purgeDataTypes));
        }
        public Builder redactionScope(@Nullable Output<SecuritySettingRedactionScope> redactionScope) {
            this.redactionScope = redactionScope;
            return this;
        }
        public Builder redactionScope(@Nullable SecuritySettingRedactionScope redactionScope) {
            this.redactionScope = Codegen.ofNullable(redactionScope);
            return this;
        }
        public Builder redactionStrategy(@Nullable Output<SecuritySettingRedactionStrategy> redactionStrategy) {
            this.redactionStrategy = redactionStrategy;
            return this;
        }
        public Builder redactionStrategy(@Nullable SecuritySettingRedactionStrategy redactionStrategy) {
            this.redactionStrategy = Codegen.ofNullable(redactionStrategy);
            return this;
        }
        public Builder retentionWindowDays(@Nullable Output<Integer> retentionWindowDays) {
            this.retentionWindowDays = retentionWindowDays;
            return this;
        }
        public Builder retentionWindowDays(@Nullable Integer retentionWindowDays) {
            this.retentionWindowDays = Codegen.ofNullable(retentionWindowDays);
            return this;
        }        public SecuritySettingArgs build() {
            return new SecuritySettingArgs(deidentifyTemplate, displayName, insightsExportSettings, inspectTemplate, location, name, project, purgeDataTypes, redactionScope, redactionStrategy, retentionWindowDays);
        }
    }
}

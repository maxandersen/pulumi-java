// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v3.SecuritySettingArgs;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create security settings in the specified location.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3:SecuritySetting")
public class SecuritySetting extends com.pulumi.resources.CustomResource {
    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    @Export(name="deidentifyTemplate", type=String.class, parameters={})
    private Output<String> deidentifyTemplate;

    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public Output<String> deidentifyTemplate() {
        return this.deidentifyTemplate;
    }
    /**
     * The human-readable name of the security settings, unique within the location.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the security settings, unique within the location.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    @Export(name="insightsExportSettings", type=GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse> insightsExportSettings;

    /**
     * @return Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse> insightsExportSettings() {
        return this.insightsExportSettings;
    }
    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    @Export(name="inspectTemplate", type=String.class, parameters={})
    private Output<String> inspectTemplate;

    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public Output<String> inspectTemplate() {
        return this.inspectTemplate;
    }
    /**
     * Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of types of data to remove when retention settings triggers purge.
     * 
     */
    @Export(name="purgeDataTypes", type=List.class, parameters={String.class})
    private Output<List<String>> purgeDataTypes;

    /**
     * @return List of types of data to remove when retention settings triggers purge.
     * 
     */
    public Output<List<String>> purgeDataTypes() {
        return this.purgeDataTypes;
    }
    /**
     * Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    @Export(name="redactionScope", type=String.class, parameters={})
    private Output<String> redactionScope;

    /**
     * @return Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    public Output<String> redactionScope() {
        return this.redactionScope;
    }
    /**
     * Strategy that defines how we do redaction.
     * 
     */
    @Export(name="redactionStrategy", type=String.class, parameters={})
    private Output<String> redactionStrategy;

    /**
     * @return Strategy that defines how we do redaction.
     * 
     */
    public Output<String> redactionStrategy() {
        return this.redactionStrategy;
    }
    /**
     * Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    @Export(name="retentionWindowDays", type=Integer.class, parameters={})
    private Output<Integer> retentionWindowDays;

    /**
     * @return Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    public Output<Integer> retentionWindowDays() {
        return this.retentionWindowDays;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecuritySetting(String name) {
        this(name, SecuritySettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecuritySetting(String name, SecuritySettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecuritySetting(String name, SecuritySettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:SecuritySetting", name, args == null ? SecuritySettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecuritySetting(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:SecuritySetting", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecuritySetting get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecuritySetting(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentArgs Empty = new AgentArgs();

    /**
     * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * 
     */
    @Import(name="advancedSettings")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs> advancedSettings;

    public Optional<Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs>> advancedSettings() {
        return Optional.ofNullable(this.advancedSettings);
    }

    /**
     * The URI of the agent&#39;s avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
     * 
     */
    @Import(name="avatarUri")
    private @Nullable Output<String> avatarUri;

    public Optional<Output<String>> avatarUri() {
        return Optional.ofNullable(this.avatarUri);
    }

    /**
     * Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
     * 
     */
    @Import(name="defaultLanguageCode", required=true)
    private Output<String> defaultLanguageCode;

    public Output<String> defaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @Import(name="enableSpellCorrection")
    private @Nullable Output<Boolean> enableSpellCorrection;

    public Optional<Output<Boolean>> enableSpellCorrection() {
        return Optional.ofNullable(this.enableSpellCorrection);
    }

    /**
     * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
     * 
     */
    @Import(name="enableStackdriverLogging")
    private @Nullable Output<Boolean> enableStackdriverLogging;

    public Optional<Output<Boolean>> enableStackdriverLogging() {
        return Optional.ofNullable(this.enableStackdriverLogging);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Import(name="securitySettings")
    private @Nullable Output<String> securitySettings;

    public Optional<Output<String>> securitySettings() {
        return Optional.ofNullable(this.securitySettings);
    }

    /**
     * Speech recognition related settings.
     * 
     */
    @Import(name="speechToTextSettings")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs> speechToTextSettings;

    public Optional<Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs>> speechToTextSettings() {
        return Optional.ofNullable(this.speechToTextSettings);
    }

    /**
     * Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="startFlow")
    private @Nullable Output<String> startFlow;

    public Optional<Output<String>> startFlow() {
        return Optional.ofNullable(this.startFlow);
    }

    /**
     * The list of all languages supported by the agent (except for the `default_language_code`).
     * 
     */
    @Import(name="supportedLanguageCodes")
    private @Nullable Output<List<String>> supportedLanguageCodes;

    public Optional<Output<List<String>>> supportedLanguageCodes() {
        return Optional.ofNullable(this.supportedLanguageCodes);
    }

    /**
     * The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone;
    }

    private AgentArgs() {}

    private AgentArgs(AgentArgs $) {
        this.advancedSettings = $.advancedSettings;
        this.avatarUri = $.avatarUri;
        this.defaultLanguageCode = $.defaultLanguageCode;
        this.description = $.description;
        this.displayName = $.displayName;
        this.enableSpellCorrection = $.enableSpellCorrection;
        this.enableStackdriverLogging = $.enableStackdriverLogging;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.securitySettings = $.securitySettings;
        this.speechToTextSettings = $.speechToTextSettings;
        this.startFlow = $.startFlow;
        this.supportedLanguageCodes = $.supportedLanguageCodes;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentArgs $;

        public Builder() {
            $ = new AgentArgs();
        }

        public Builder(AgentArgs defaults) {
            $ = new AgentArgs(Objects.requireNonNull(defaults));
        }

        public Builder advancedSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs> advancedSettings) {
            $.advancedSettings = advancedSettings;
            return this;
        }

        public Builder advancedSettings(GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs advancedSettings) {
            return advancedSettings(Output.of(advancedSettings));
        }

        public Builder avatarUri(@Nullable Output<String> avatarUri) {
            $.avatarUri = avatarUri;
            return this;
        }

        public Builder avatarUri(String avatarUri) {
            return avatarUri(Output.of(avatarUri));
        }

        public Builder defaultLanguageCode(Output<String> defaultLanguageCode) {
            $.defaultLanguageCode = defaultLanguageCode;
            return this;
        }

        public Builder defaultLanguageCode(String defaultLanguageCode) {
            return defaultLanguageCode(Output.of(defaultLanguageCode));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder enableSpellCorrection(@Nullable Output<Boolean> enableSpellCorrection) {
            $.enableSpellCorrection = enableSpellCorrection;
            return this;
        }

        public Builder enableSpellCorrection(Boolean enableSpellCorrection) {
            return enableSpellCorrection(Output.of(enableSpellCorrection));
        }

        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            $.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            return enableStackdriverLogging(Output.of(enableStackdriverLogging));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder securitySettings(@Nullable Output<String> securitySettings) {
            $.securitySettings = securitySettings;
            return this;
        }

        public Builder securitySettings(String securitySettings) {
            return securitySettings(Output.of(securitySettings));
        }

        public Builder speechToTextSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs> speechToTextSettings) {
            $.speechToTextSettings = speechToTextSettings;
            return this;
        }

        public Builder speechToTextSettings(GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs speechToTextSettings) {
            return speechToTextSettings(Output.of(speechToTextSettings));
        }

        public Builder startFlow(@Nullable Output<String> startFlow) {
            $.startFlow = startFlow;
            return this;
        }

        public Builder startFlow(String startFlow) {
            return startFlow(Output.of(startFlow));
        }

        public Builder supportedLanguageCodes(@Nullable Output<List<String>> supportedLanguageCodes) {
            $.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }

        public Builder supportedLanguageCodes(List<String> supportedLanguageCodes) {
            return supportedLanguageCodes(Output.of(supportedLanguageCodes));
        }

        public Builder supportedLanguageCodes(String... supportedLanguageCodes) {
            return supportedLanguageCodes(List.of(supportedLanguageCodes));
        }

        public Builder timeZone(Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public AgentArgs build() {
            $.defaultLanguageCode = Objects.requireNonNull($.defaultLanguageCode, "expected parameter 'defaultLanguageCode' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.timeZone = Objects.requireNonNull($.timeZone, "expected parameter 'timeZone' to be non-null");
            return $;
        }
    }

}

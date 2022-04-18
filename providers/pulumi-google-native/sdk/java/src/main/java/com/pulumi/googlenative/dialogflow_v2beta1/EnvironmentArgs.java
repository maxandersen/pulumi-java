// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1FulfillmentArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1TextToSpeechSettingsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    @Import(name="agentVersion")
      private final @Nullable Output<String> agentVersion;

    public Output<String> agentVersion() {
        return this.agentVersion == null ? Codegen.empty() : this.agentVersion;
    }

    /**
     * Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Optional. The fulfillment settings to use for this environment.
     * 
     */
    @Import(name="fulfillment")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentArgs> fulfillment;

    public Output<GoogleCloudDialogflowV2beta1FulfillmentArgs> fulfillment() {
        return this.fulfillment == null ? Codegen.empty() : this.fulfillment;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. Text to speech settings for this environment.
     * 
     */
    @Import(name="textToSpeechSettings")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1TextToSpeechSettingsArgs> textToSpeechSettings;

    public Output<GoogleCloudDialogflowV2beta1TextToSpeechSettingsArgs> textToSpeechSettings() {
        return this.textToSpeechSettings == null ? Codegen.empty() : this.textToSpeechSettings;
    }

    public EnvironmentArgs(
        @Nullable Output<String> agentVersion,
        @Nullable Output<String> description,
        Output<String> environmentId,
        @Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentArgs> fulfillment,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudDialogflowV2beta1TextToSpeechSettingsArgs> textToSpeechSettings) {
        this.agentVersion = agentVersion;
        this.description = description;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.fulfillment = fulfillment;
        this.location = location;
        this.project = project;
        this.textToSpeechSettings = textToSpeechSettings;
    }

    private EnvironmentArgs() {
        this.agentVersion = Codegen.empty();
        this.description = Codegen.empty();
        this.environmentId = Codegen.empty();
        this.fulfillment = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.textToSpeechSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> agentVersion;
        private @Nullable Output<String> description;
        private Output<String> environmentId;
        private @Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentArgs> fulfillment;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudDialogflowV2beta1TextToSpeechSettingsArgs> textToSpeechSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.fulfillment = defaults.fulfillment;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.textToSpeechSettings = defaults.textToSpeechSettings;
        }

        public Builder agentVersion(@Nullable Output<String> agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = Codegen.ofNullable(agentVersion);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }
        public Builder fulfillment(@Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentArgs> fulfillment) {
            this.fulfillment = fulfillment;
            return this;
        }
        public Builder fulfillment(@Nullable GoogleCloudDialogflowV2beta1FulfillmentArgs fulfillment) {
            this.fulfillment = Codegen.ofNullable(fulfillment);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder textToSpeechSettings(@Nullable Output<GoogleCloudDialogflowV2beta1TextToSpeechSettingsArgs> textToSpeechSettings) {
            this.textToSpeechSettings = textToSpeechSettings;
            return this;
        }
        public Builder textToSpeechSettings(@Nullable GoogleCloudDialogflowV2beta1TextToSpeechSettingsArgs textToSpeechSettings) {
            this.textToSpeechSettings = Codegen.ofNullable(textToSpeechSettings);
            return this;
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(agentVersion, description, environmentId, fulfillment, location, project, textToSpeechSettings);
        }
    }
}

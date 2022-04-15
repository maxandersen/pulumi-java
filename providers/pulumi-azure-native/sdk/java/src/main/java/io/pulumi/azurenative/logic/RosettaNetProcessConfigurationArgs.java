// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.RosettaNetPipActivitySettingsArgs;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipRoleSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RosettaNetProcessConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RosettaNetProcessConfigurationArgs Empty = new RosettaNetProcessConfigurationArgs();

    /**
     * The RosettaNet process configuration activity settings.
     * 
     */
    @Import(name="activitySettings", required=true)
      private final Output<RosettaNetPipActivitySettingsArgs> activitySettings;

    public Output<RosettaNetPipActivitySettingsArgs> activitySettings() {
        return this.activitySettings;
    }

    /**
     * The integration account RosettaNet ProcessConfiguration properties.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The RosettaNet initiator role settings.
     * 
     */
    @Import(name="initiatorRoleSettings", required=true)
      private final Output<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings;

    public Output<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings() {
        return this.initiatorRoleSettings;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
      private final Output<String> integrationAccountName;

    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The integration account RosettaNet process code.
     * 
     */
    @Import(name="processCode", required=true)
      private final Output<String> processCode;

    public Output<String> processCode() {
        return this.processCode;
    }

    /**
     * The integration account RosettaNet process name.
     * 
     */
    @Import(name="processName", required=true)
      private final Output<String> processName;

    public Output<String> processName() {
        return this.processName;
    }

    /**
     * The integration account RosettaNet process version.
     * 
     */
    @Import(name="processVersion", required=true)
      private final Output<String> processVersion;

    public Output<String> processVersion() {
        return this.processVersion;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The RosettaNet responder role settings.
     * 
     */
    @Import(name="responderRoleSettings", required=true)
      private final Output<RosettaNetPipRoleSettingsArgs> responderRoleSettings;

    public Output<RosettaNetPipRoleSettingsArgs> responderRoleSettings() {
        return this.responderRoleSettings;
    }

    /**
     * The integration account RosettaNet ProcessConfiguration name.
     * 
     */
    @Import(name="rosettaNetProcessConfigurationName")
      private final @Nullable Output<String> rosettaNetProcessConfigurationName;

    public Output<String> rosettaNetProcessConfigurationName() {
        return this.rosettaNetProcessConfigurationName == null ? Codegen.empty() : this.rosettaNetProcessConfigurationName;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RosettaNetProcessConfigurationArgs(
        Output<RosettaNetPipActivitySettingsArgs> activitySettings,
        @Nullable Output<String> description,
        Output<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings,
        Output<String> integrationAccountName,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> metadata,
        Output<String> processCode,
        Output<String> processName,
        Output<String> processVersion,
        Output<String> resourceGroupName,
        Output<RosettaNetPipRoleSettingsArgs> responderRoleSettings,
        @Nullable Output<String> rosettaNetProcessConfigurationName,
        @Nullable Output<Map<String,String>> tags) {
        this.activitySettings = Objects.requireNonNull(activitySettings, "expected parameter 'activitySettings' to be non-null");
        this.description = description;
        this.initiatorRoleSettings = Objects.requireNonNull(initiatorRoleSettings, "expected parameter 'initiatorRoleSettings' to be non-null");
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.location = location;
        this.metadata = metadata;
        this.processCode = Objects.requireNonNull(processCode, "expected parameter 'processCode' to be non-null");
        this.processName = Objects.requireNonNull(processName, "expected parameter 'processName' to be non-null");
        this.processVersion = Objects.requireNonNull(processVersion, "expected parameter 'processVersion' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.responderRoleSettings = Objects.requireNonNull(responderRoleSettings, "expected parameter 'responderRoleSettings' to be non-null");
        this.rosettaNetProcessConfigurationName = rosettaNetProcessConfigurationName;
        this.tags = tags;
    }

    private RosettaNetProcessConfigurationArgs() {
        this.activitySettings = Codegen.empty();
        this.description = Codegen.empty();
        this.initiatorRoleSettings = Codegen.empty();
        this.integrationAccountName = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.processCode = Codegen.empty();
        this.processName = Codegen.empty();
        this.processVersion = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.responderRoleSettings = Codegen.empty();
        this.rosettaNetProcessConfigurationName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetProcessConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RosettaNetPipActivitySettingsArgs> activitySettings;
        private @Nullable Output<String> description;
        private Output<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings;
        private Output<String> integrationAccountName;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> metadata;
        private Output<String> processCode;
        private Output<String> processName;
        private Output<String> processVersion;
        private Output<String> resourceGroupName;
        private Output<RosettaNetPipRoleSettingsArgs> responderRoleSettings;
        private @Nullable Output<String> rosettaNetProcessConfigurationName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetProcessConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activitySettings = defaults.activitySettings;
    	      this.description = defaults.description;
    	      this.initiatorRoleSettings = defaults.initiatorRoleSettings;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.processCode = defaults.processCode;
    	      this.processName = defaults.processName;
    	      this.processVersion = defaults.processVersion;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.responderRoleSettings = defaults.responderRoleSettings;
    	      this.rosettaNetProcessConfigurationName = defaults.rosettaNetProcessConfigurationName;
    	      this.tags = defaults.tags;
        }

        public Builder activitySettings(Output<RosettaNetPipActivitySettingsArgs> activitySettings) {
            this.activitySettings = Objects.requireNonNull(activitySettings);
            return this;
        }
        public Builder activitySettings(RosettaNetPipActivitySettingsArgs activitySettings) {
            this.activitySettings = Output.of(Objects.requireNonNull(activitySettings));
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
        public Builder initiatorRoleSettings(Output<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings) {
            this.initiatorRoleSettings = Objects.requireNonNull(initiatorRoleSettings);
            return this;
        }
        public Builder initiatorRoleSettings(RosettaNetPipRoleSettingsArgs initiatorRoleSettings) {
            this.initiatorRoleSettings = Output.of(Objects.requireNonNull(initiatorRoleSettings));
            return this;
        }
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }
        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Output.of(Objects.requireNonNull(integrationAccountName));
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
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder processCode(Output<String> processCode) {
            this.processCode = Objects.requireNonNull(processCode);
            return this;
        }
        public Builder processCode(String processCode) {
            this.processCode = Output.of(Objects.requireNonNull(processCode));
            return this;
        }
        public Builder processName(Output<String> processName) {
            this.processName = Objects.requireNonNull(processName);
            return this;
        }
        public Builder processName(String processName) {
            this.processName = Output.of(Objects.requireNonNull(processName));
            return this;
        }
        public Builder processVersion(Output<String> processVersion) {
            this.processVersion = Objects.requireNonNull(processVersion);
            return this;
        }
        public Builder processVersion(String processVersion) {
            this.processVersion = Output.of(Objects.requireNonNull(processVersion));
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
        public Builder responderRoleSettings(Output<RosettaNetPipRoleSettingsArgs> responderRoleSettings) {
            this.responderRoleSettings = Objects.requireNonNull(responderRoleSettings);
            return this;
        }
        public Builder responderRoleSettings(RosettaNetPipRoleSettingsArgs responderRoleSettings) {
            this.responderRoleSettings = Output.of(Objects.requireNonNull(responderRoleSettings));
            return this;
        }
        public Builder rosettaNetProcessConfigurationName(@Nullable Output<String> rosettaNetProcessConfigurationName) {
            this.rosettaNetProcessConfigurationName = rosettaNetProcessConfigurationName;
            return this;
        }
        public Builder rosettaNetProcessConfigurationName(@Nullable String rosettaNetProcessConfigurationName) {
            this.rosettaNetProcessConfigurationName = Codegen.ofNullable(rosettaNetProcessConfigurationName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public RosettaNetProcessConfigurationArgs build() {
            return new RosettaNetProcessConfigurationArgs(activitySettings, description, initiatorRoleSettings, integrationAccountName, location, metadata, processCode, processName, processVersion, resourceGroupName, responderRoleSettings, rosettaNetProcessConfigurationName, tags);
        }
    }
}

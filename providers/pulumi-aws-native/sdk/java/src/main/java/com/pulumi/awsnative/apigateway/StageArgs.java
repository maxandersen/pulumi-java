// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.apigateway.inputs.StageAccessLogSettingArgs;
import com.pulumi.awsnative.apigateway.inputs.StageCanarySettingArgs;
import com.pulumi.awsnative.apigateway.inputs.StageMethodSettingArgs;
import com.pulumi.awsnative.apigateway.inputs.StageTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StageArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageArgs Empty = new StageArgs();

    /**
     * Specifies settings for logging access in this stage.
     * 
     */
    @Import(name="accessLogSetting")
      private final @Nullable Output<StageAccessLogSettingArgs> accessLogSetting;

    public Output<StageAccessLogSettingArgs> accessLogSetting() {
        return this.accessLogSetting == null ? Codegen.empty() : this.accessLogSetting;
    }

    /**
     * Indicates whether cache clustering is enabled for the stage.
     * 
     */
    @Import(name="cacheClusterEnabled")
      private final @Nullable Output<Boolean> cacheClusterEnabled;

    public Output<Boolean> cacheClusterEnabled() {
        return this.cacheClusterEnabled == null ? Codegen.empty() : this.cacheClusterEnabled;
    }

    /**
     * The stage's cache cluster size.
     * 
     */
    @Import(name="cacheClusterSize")
      private final @Nullable Output<String> cacheClusterSize;

    public Output<String> cacheClusterSize() {
        return this.cacheClusterSize == null ? Codegen.empty() : this.cacheClusterSize;
    }

    /**
     * Specifies settings for the canary deployment in this stage.
     * 
     */
    @Import(name="canarySetting")
      private final @Nullable Output<StageCanarySettingArgs> canarySetting;

    public Output<StageCanarySettingArgs> canarySetting() {
        return this.canarySetting == null ? Codegen.empty() : this.canarySetting;
    }

    /**
     * The ID of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
     */
    @Import(name="clientCertificateId")
      private final @Nullable Output<String> clientCertificateId;

    public Output<String> clientCertificateId() {
        return this.clientCertificateId == null ? Codegen.empty() : this.clientCertificateId;
    }

    /**
     * The ID of the deployment that the stage is associated with. This parameter is required to create a stage.
     * 
     */
    @Import(name="deploymentId")
      private final @Nullable Output<String> deploymentId;

    public Output<String> deploymentId() {
        return this.deploymentId == null ? Codegen.empty() : this.deploymentId;
    }

    /**
     * A description of the stage.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The version ID of the API documentation snapshot.
     * 
     */
    @Import(name="documentationVersion")
      private final @Nullable Output<String> documentationVersion;

    public Output<String> documentationVersion() {
        return this.documentationVersion == null ? Codegen.empty() : this.documentationVersion;
    }

    /**
     * Settings for all methods in the stage.
     * 
     */
    @Import(name="methodSettings")
      private final @Nullable Output<List<StageMethodSettingArgs>> methodSettings;

    public Output<List<StageMethodSettingArgs>> methodSettings() {
        return this.methodSettings == null ? Codegen.empty() : this.methodSettings;
    }

    /**
     * The ID of the RestApi resource that you're deploying with this stage.
     * 
     */
    @Import(name="restApiId", required=true)
      private final Output<String> restApiId;

    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI).
     * 
     */
    @Import(name="stageName")
      private final @Nullable Output<String> stageName;

    public Output<String> stageName() {
        return this.stageName == null ? Codegen.empty() : this.stageName;
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<StageTagArgs>> tags;

    public Output<List<StageTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Specifies whether active X-Ray tracing is enabled for this stage.
     * 
     */
    @Import(name="tracingEnabled")
      private final @Nullable Output<Boolean> tracingEnabled;

    public Output<Boolean> tracingEnabled() {
        return this.tracingEnabled == null ? Codegen.empty() : this.tracingEnabled;
    }

    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the key and the variable value is the value.
     * 
     */
    @Import(name="variables")
      private final @Nullable Output<Object> variables;

    public Output<Object> variables() {
        return this.variables == null ? Codegen.empty() : this.variables;
    }

    public StageArgs(
        @Nullable Output<StageAccessLogSettingArgs> accessLogSetting,
        @Nullable Output<Boolean> cacheClusterEnabled,
        @Nullable Output<String> cacheClusterSize,
        @Nullable Output<StageCanarySettingArgs> canarySetting,
        @Nullable Output<String> clientCertificateId,
        @Nullable Output<String> deploymentId,
        @Nullable Output<String> description,
        @Nullable Output<String> documentationVersion,
        @Nullable Output<List<StageMethodSettingArgs>> methodSettings,
        Output<String> restApiId,
        @Nullable Output<String> stageName,
        @Nullable Output<List<StageTagArgs>> tags,
        @Nullable Output<Boolean> tracingEnabled,
        @Nullable Output<Object> variables) {
        this.accessLogSetting = accessLogSetting;
        this.cacheClusterEnabled = cacheClusterEnabled;
        this.cacheClusterSize = cacheClusterSize;
        this.canarySetting = canarySetting;
        this.clientCertificateId = clientCertificateId;
        this.deploymentId = deploymentId;
        this.description = description;
        this.documentationVersion = documentationVersion;
        this.methodSettings = methodSettings;
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
        this.stageName = stageName;
        this.tags = tags;
        this.tracingEnabled = tracingEnabled;
        this.variables = variables;
    }

    private StageArgs() {
        this.accessLogSetting = Codegen.empty();
        this.cacheClusterEnabled = Codegen.empty();
        this.cacheClusterSize = Codegen.empty();
        this.canarySetting = Codegen.empty();
        this.clientCertificateId = Codegen.empty();
        this.deploymentId = Codegen.empty();
        this.description = Codegen.empty();
        this.documentationVersion = Codegen.empty();
        this.methodSettings = Codegen.empty();
        this.restApiId = Codegen.empty();
        this.stageName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tracingEnabled = Codegen.empty();
        this.variables = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StageAccessLogSettingArgs> accessLogSetting;
        private @Nullable Output<Boolean> cacheClusterEnabled;
        private @Nullable Output<String> cacheClusterSize;
        private @Nullable Output<StageCanarySettingArgs> canarySetting;
        private @Nullable Output<String> clientCertificateId;
        private @Nullable Output<String> deploymentId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> documentationVersion;
        private @Nullable Output<List<StageMethodSettingArgs>> methodSettings;
        private Output<String> restApiId;
        private @Nullable Output<String> stageName;
        private @Nullable Output<List<StageTagArgs>> tags;
        private @Nullable Output<Boolean> tracingEnabled;
        private @Nullable Output<Object> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(StageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSetting = defaults.accessLogSetting;
    	      this.cacheClusterEnabled = defaults.cacheClusterEnabled;
    	      this.cacheClusterSize = defaults.cacheClusterSize;
    	      this.canarySetting = defaults.canarySetting;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.methodSettings = defaults.methodSettings;
    	      this.restApiId = defaults.restApiId;
    	      this.stageName = defaults.stageName;
    	      this.tags = defaults.tags;
    	      this.tracingEnabled = defaults.tracingEnabled;
    	      this.variables = defaults.variables;
        }

        public Builder accessLogSetting(@Nullable Output<StageAccessLogSettingArgs> accessLogSetting) {
            this.accessLogSetting = accessLogSetting;
            return this;
        }
        public Builder accessLogSetting(@Nullable StageAccessLogSettingArgs accessLogSetting) {
            this.accessLogSetting = Codegen.ofNullable(accessLogSetting);
            return this;
        }
        public Builder cacheClusterEnabled(@Nullable Output<Boolean> cacheClusterEnabled) {
            this.cacheClusterEnabled = cacheClusterEnabled;
            return this;
        }
        public Builder cacheClusterEnabled(@Nullable Boolean cacheClusterEnabled) {
            this.cacheClusterEnabled = Codegen.ofNullable(cacheClusterEnabled);
            return this;
        }
        public Builder cacheClusterSize(@Nullable Output<String> cacheClusterSize) {
            this.cacheClusterSize = cacheClusterSize;
            return this;
        }
        public Builder cacheClusterSize(@Nullable String cacheClusterSize) {
            this.cacheClusterSize = Codegen.ofNullable(cacheClusterSize);
            return this;
        }
        public Builder canarySetting(@Nullable Output<StageCanarySettingArgs> canarySetting) {
            this.canarySetting = canarySetting;
            return this;
        }
        public Builder canarySetting(@Nullable StageCanarySettingArgs canarySetting) {
            this.canarySetting = Codegen.ofNullable(canarySetting);
            return this;
        }
        public Builder clientCertificateId(@Nullable Output<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }
        public Builder clientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Codegen.ofNullable(clientCertificateId);
            return this;
        }
        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public Builder deploymentId(@Nullable String deploymentId) {
            this.deploymentId = Codegen.ofNullable(deploymentId);
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
        public Builder documentationVersion(@Nullable Output<String> documentationVersion) {
            this.documentationVersion = documentationVersion;
            return this;
        }
        public Builder documentationVersion(@Nullable String documentationVersion) {
            this.documentationVersion = Codegen.ofNullable(documentationVersion);
            return this;
        }
        public Builder methodSettings(@Nullable Output<List<StageMethodSettingArgs>> methodSettings) {
            this.methodSettings = methodSettings;
            return this;
        }
        public Builder methodSettings(@Nullable List<StageMethodSettingArgs> methodSettings) {
            this.methodSettings = Codegen.ofNullable(methodSettings);
            return this;
        }
        public Builder methodSettings(StageMethodSettingArgs... methodSettings) {
            return methodSettings(List.of(methodSettings));
        }
        public Builder restApiId(Output<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Output.of(Objects.requireNonNull(restApiId));
            return this;
        }
        public Builder stageName(@Nullable Output<String> stageName) {
            this.stageName = stageName;
            return this;
        }
        public Builder stageName(@Nullable String stageName) {
            this.stageName = Codegen.ofNullable(stageName);
            return this;
        }
        public Builder tags(@Nullable Output<List<StageTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<StageTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(StageTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder tracingEnabled(@Nullable Output<Boolean> tracingEnabled) {
            this.tracingEnabled = tracingEnabled;
            return this;
        }
        public Builder tracingEnabled(@Nullable Boolean tracingEnabled) {
            this.tracingEnabled = Codegen.ofNullable(tracingEnabled);
            return this;
        }
        public Builder variables(@Nullable Output<Object> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(@Nullable Object variables) {
            this.variables = Codegen.ofNullable(variables);
            return this;
        }        public StageArgs build() {
            return new StageArgs(accessLogSetting, cacheClusterEnabled, cacheClusterSize, canarySetting, clientCertificateId, deploymentId, description, documentationVersion, methodSettings, restApiId, stageName, tags, tracingEnabled, variables);
        }
    }
}

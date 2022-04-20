// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StageState extends com.pulumi.resources.ResourceArgs {

    public static final StageState Empty = new StageState();

    /**
     * Enables access logs for the API stage. Detailed below.
     * 
     */
    @Import(name="accessLogSettings")
      private final @Nullable Output<StageAccessLogSettingsGetArgs> accessLogSettings;

    public Output<StageAccessLogSettingsGetArgs> accessLogSettings() {
        return this.accessLogSettings == null ? Codegen.empty() : this.accessLogSettings;
    }

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Specifies whether a cache cluster is enabled for the stage
     * 
     */
    @Import(name="cacheClusterEnabled")
      private final @Nullable Output<Boolean> cacheClusterEnabled;

    public Output<Boolean> cacheClusterEnabled() {
        return this.cacheClusterEnabled == null ? Codegen.empty() : this.cacheClusterEnabled;
    }

    /**
     * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
     * 
     */
    @Import(name="cacheClusterSize")
      private final @Nullable Output<String> cacheClusterSize;

    public Output<String> cacheClusterSize() {
        return this.cacheClusterSize == null ? Codegen.empty() : this.cacheClusterSize;
    }

    /**
     * The identifier of a client certificate for the stage.
     * 
     */
    @Import(name="clientCertificateId")
      private final @Nullable Output<String> clientCertificateId;

    public Output<String> clientCertificateId() {
        return this.clientCertificateId == null ? Codegen.empty() : this.clientCertificateId;
    }

    /**
     * The ID of the deployment that the stage points to
     * 
     */
    @Import(name="deployment")
      private final @Nullable Output<String> deployment;

    public Output<String> deployment() {
        return this.deployment == null ? Codegen.empty() : this.deployment;
    }

    /**
     * The description of the stage
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The version of the associated API documentation
     * 
     */
    @Import(name="documentationVersion")
      private final @Nullable Output<String> documentationVersion;

    public Output<String> documentationVersion() {
        return this.documentationVersion == null ? Codegen.empty() : this.documentationVersion;
    }

    /**
     * The execution ARN to be used in `lambda_permission`&#39;s `source_arn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     * 
     */
    @Import(name="executionArn")
      private final @Nullable Output<String> executionArn;

    public Output<String> executionArn() {
        return this.executionArn == null ? Codegen.empty() : this.executionArn;
    }

    /**
     * The URL to invoke the API pointing to the stage,
     * e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     * 
     */
    @Import(name="invokeUrl")
      private final @Nullable Output<String> invokeUrl;

    public Output<String> invokeUrl() {
        return this.invokeUrl == null ? Codegen.empty() : this.invokeUrl;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi")
      private final @Nullable Output<String> restApi;

    public Output<String> restApi() {
        return this.restApi == null ? Codegen.empty() : this.restApi;
    }

    /**
     * The name of the stage
     * 
     */
    @Import(name="stageName")
      private final @Nullable Output<String> stageName;

    public Output<String> stageName() {
        return this.stageName == null ? Codegen.empty() : this.stageName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * A map that defines the stage variables
     * 
     */
    @Import(name="variables")
      private final @Nullable Output<Map<String,String>> variables;

    public Output<Map<String,String>> variables() {
        return this.variables == null ? Codegen.empty() : this.variables;
    }

    /**
     * The ARN of the WebAcl associated with the Stage.
     * 
     */
    @Import(name="webAclArn")
      private final @Nullable Output<String> webAclArn;

    public Output<String> webAclArn() {
        return this.webAclArn == null ? Codegen.empty() : this.webAclArn;
    }

    /**
     * Whether active tracing with X-ray is enabled. Defaults to `false`.
     * 
     */
    @Import(name="xrayTracingEnabled")
      private final @Nullable Output<Boolean> xrayTracingEnabled;

    public Output<Boolean> xrayTracingEnabled() {
        return this.xrayTracingEnabled == null ? Codegen.empty() : this.xrayTracingEnabled;
    }

    public StageState(
        @Nullable Output<StageAccessLogSettingsGetArgs> accessLogSettings,
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> cacheClusterEnabled,
        @Nullable Output<String> cacheClusterSize,
        @Nullable Output<String> clientCertificateId,
        @Nullable Output<String> deployment,
        @Nullable Output<String> description,
        @Nullable Output<String> documentationVersion,
        @Nullable Output<String> executionArn,
        @Nullable Output<String> invokeUrl,
        @Nullable Output<String> restApi,
        @Nullable Output<String> stageName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Map<String,String>> variables,
        @Nullable Output<String> webAclArn,
        @Nullable Output<Boolean> xrayTracingEnabled) {
        this.accessLogSettings = accessLogSettings;
        this.arn = arn;
        this.cacheClusterEnabled = cacheClusterEnabled;
        this.cacheClusterSize = cacheClusterSize;
        this.clientCertificateId = clientCertificateId;
        this.deployment = deployment;
        this.description = description;
        this.documentationVersion = documentationVersion;
        this.executionArn = executionArn;
        this.invokeUrl = invokeUrl;
        this.restApi = restApi;
        this.stageName = stageName;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.variables = variables;
        this.webAclArn = webAclArn;
        this.xrayTracingEnabled = xrayTracingEnabled;
    }

    private StageState() {
        this.accessLogSettings = Codegen.empty();
        this.arn = Codegen.empty();
        this.cacheClusterEnabled = Codegen.empty();
        this.cacheClusterSize = Codegen.empty();
        this.clientCertificateId = Codegen.empty();
        this.deployment = Codegen.empty();
        this.description = Codegen.empty();
        this.documentationVersion = Codegen.empty();
        this.executionArn = Codegen.empty();
        this.invokeUrl = Codegen.empty();
        this.restApi = Codegen.empty();
        this.stageName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.variables = Codegen.empty();
        this.webAclArn = Codegen.empty();
        this.xrayTracingEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StageAccessLogSettingsGetArgs> accessLogSettings;
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> cacheClusterEnabled;
        private @Nullable Output<String> cacheClusterSize;
        private @Nullable Output<String> clientCertificateId;
        private @Nullable Output<String> deployment;
        private @Nullable Output<String> description;
        private @Nullable Output<String> documentationVersion;
        private @Nullable Output<String> executionArn;
        private @Nullable Output<String> invokeUrl;
        private @Nullable Output<String> restApi;
        private @Nullable Output<String> stageName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Map<String,String>> variables;
        private @Nullable Output<String> webAclArn;
        private @Nullable Output<Boolean> xrayTracingEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StageState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSettings = defaults.accessLogSettings;
    	      this.arn = defaults.arn;
    	      this.cacheClusterEnabled = defaults.cacheClusterEnabled;
    	      this.cacheClusterSize = defaults.cacheClusterSize;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.deployment = defaults.deployment;
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.executionArn = defaults.executionArn;
    	      this.invokeUrl = defaults.invokeUrl;
    	      this.restApi = defaults.restApi;
    	      this.stageName = defaults.stageName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.variables = defaults.variables;
    	      this.webAclArn = defaults.webAclArn;
    	      this.xrayTracingEnabled = defaults.xrayTracingEnabled;
        }

        public Builder accessLogSettings(@Nullable Output<StageAccessLogSettingsGetArgs> accessLogSettings) {
            this.accessLogSettings = accessLogSettings;
            return this;
        }
        public Builder accessLogSettings(@Nullable StageAccessLogSettingsGetArgs accessLogSettings) {
            this.accessLogSettings = Codegen.ofNullable(accessLogSettings);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
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
        public Builder clientCertificateId(@Nullable Output<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }
        public Builder clientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Codegen.ofNullable(clientCertificateId);
            return this;
        }
        public Builder deployment(@Nullable Output<String> deployment) {
            this.deployment = deployment;
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
        public Builder executionArn(@Nullable Output<String> executionArn) {
            this.executionArn = executionArn;
            return this;
        }
        public Builder executionArn(@Nullable String executionArn) {
            this.executionArn = Codegen.ofNullable(executionArn);
            return this;
        }
        public Builder invokeUrl(@Nullable Output<String> invokeUrl) {
            this.invokeUrl = invokeUrl;
            return this;
        }
        public Builder invokeUrl(@Nullable String invokeUrl) {
            this.invokeUrl = Codegen.ofNullable(invokeUrl);
            return this;
        }
        public Builder restApi(@Nullable Output<String> restApi) {
            this.restApi = restApi;
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder variables(@Nullable Output<Map<String,String>> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(@Nullable Map<String,String> variables) {
            this.variables = Codegen.ofNullable(variables);
            return this;
        }
        public Builder webAclArn(@Nullable Output<String> webAclArn) {
            this.webAclArn = webAclArn;
            return this;
        }
        public Builder webAclArn(@Nullable String webAclArn) {
            this.webAclArn = Codegen.ofNullable(webAclArn);
            return this;
        }
        public Builder xrayTracingEnabled(@Nullable Output<Boolean> xrayTracingEnabled) {
            this.xrayTracingEnabled = xrayTracingEnabled;
            return this;
        }
        public Builder xrayTracingEnabled(@Nullable Boolean xrayTracingEnabled) {
            this.xrayTracingEnabled = Codegen.ofNullable(xrayTracingEnabled);
            return this;
        }        public StageState build() {
            return new StageState(accessLogSettings, arn, cacheClusterEnabled, cacheClusterSize, clientCertificateId, deployment, description, documentationVersion, executionArn, invokeUrl, restApi, stageName, tags, tagsAll, variables, webAclArn, xrayTracingEnabled);
        }
    }
}

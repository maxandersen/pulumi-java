// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs;
import com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiConfigArgs Empty = new ApiConfigArgs();

    /**
     * The API to attach the config to.
     * 
     */
    @Import(name="api", required=true)
    private Output<String> api;

    public Output<String> api() {
        return this.api;
    }

    /**
     * Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
     * 
     */
    @Import(name="apiConfigId")
    private @Nullable Output<String> apiConfigId;

    public Optional<Output<String>> apiConfigId() {
        return Optional.ofNullable(this.apiConfigId);
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
     * 
     */
    @Import(name="apiConfigIdPrefix")
    private @Nullable Output<String> apiConfigIdPrefix;

    public Optional<Output<String>> apiConfigIdPrefix() {
        return Optional.ofNullable(this.apiConfigIdPrefix);
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * 
     */
    @Import(name="gatewayConfig")
    private @Nullable Output<ApiConfigGatewayConfigArgs> gatewayConfig;

    public Optional<Output<ApiConfigGatewayConfigArgs>> gatewayConfig() {
        return Optional.ofNullable(this.gatewayConfig);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * An OpenAPI Specification Document describing an API.
     * Structure is documented below.
     * 
     */
    @Import(name="openapiDocuments", required=true)
    private Output<List<ApiConfigOpenapiDocumentArgs>> openapiDocuments;

    public Output<List<ApiConfigOpenapiDocumentArgs>> openapiDocuments() {
        return this.openapiDocuments;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ApiConfigArgs() {}

    private ApiConfigArgs(ApiConfigArgs $) {
        this.api = $.api;
        this.apiConfigId = $.apiConfigId;
        this.apiConfigIdPrefix = $.apiConfigIdPrefix;
        this.displayName = $.displayName;
        this.gatewayConfig = $.gatewayConfig;
        this.labels = $.labels;
        this.openapiDocuments = $.openapiDocuments;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigArgs $;

        public Builder() {
            $ = new ApiConfigArgs();
        }

        public Builder(ApiConfigArgs defaults) {
            $ = new ApiConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder api(Output<String> api) {
            $.api = api;
            return this;
        }

        public Builder api(String api) {
            return api(Output.of(api));
        }

        public Builder apiConfigId(@Nullable Output<String> apiConfigId) {
            $.apiConfigId = apiConfigId;
            return this;
        }

        public Builder apiConfigId(String apiConfigId) {
            return apiConfigId(Output.of(apiConfigId));
        }

        public Builder apiConfigIdPrefix(@Nullable Output<String> apiConfigIdPrefix) {
            $.apiConfigIdPrefix = apiConfigIdPrefix;
            return this;
        }

        public Builder apiConfigIdPrefix(String apiConfigIdPrefix) {
            return apiConfigIdPrefix(Output.of(apiConfigIdPrefix));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder gatewayConfig(@Nullable Output<ApiConfigGatewayConfigArgs> gatewayConfig) {
            $.gatewayConfig = gatewayConfig;
            return this;
        }

        public Builder gatewayConfig(ApiConfigGatewayConfigArgs gatewayConfig) {
            return gatewayConfig(Output.of(gatewayConfig));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder openapiDocuments(Output<List<ApiConfigOpenapiDocumentArgs>> openapiDocuments) {
            $.openapiDocuments = openapiDocuments;
            return this;
        }

        public Builder openapiDocuments(List<ApiConfigOpenapiDocumentArgs> openapiDocuments) {
            return openapiDocuments(Output.of(openapiDocuments));
        }

        public Builder openapiDocuments(ApiConfigOpenapiDocumentArgs... openapiDocuments) {
            return openapiDocuments(List.of(openapiDocuments));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ApiConfigArgs build() {
            $.api = Objects.requireNonNull($.api, "expected parameter 'api' to be non-null");
            $.openapiDocuments = Objects.requireNonNull($.openapiDocuments, "expected parameter 'openapiDocuments' to be non-null");
            return $;
        }
    }

}

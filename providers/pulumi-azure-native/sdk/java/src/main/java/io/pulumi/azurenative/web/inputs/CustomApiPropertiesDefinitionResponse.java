// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ApiResourceBackendServiceResponse;
import io.pulumi.azurenative.web.inputs.ApiResourceDefinitionsResponse;
import io.pulumi.azurenative.web.inputs.ConnectionParameterResponse;
import io.pulumi.azurenative.web.inputs.WsdlDefinitionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom API properties
 * 
 */
public final class CustomApiPropertiesDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomApiPropertiesDefinitionResponse Empty = new CustomApiPropertiesDefinitionResponse();

    /**
     * API Definitions
     * 
     */
    @Import(name="apiDefinitions")
      private final @Nullable ApiResourceDefinitionsResponse apiDefinitions;

    public Optional<ApiResourceDefinitionsResponse> apiDefinitions() {
        return this.apiDefinitions == null ? Optional.empty() : Optional.ofNullable(this.apiDefinitions);
    }

    /**
     * The API type
     * 
     */
    @Import(name="apiType")
      private final @Nullable String apiType;

    public Optional<String> apiType() {
        return this.apiType == null ? Optional.empty() : Optional.ofNullable(this.apiType);
    }

    /**
     * The API backend service
     * 
     */
    @Import(name="backendService")
      private final @Nullable ApiResourceBackendServiceResponse backendService;

    public Optional<ApiResourceBackendServiceResponse> backendService() {
        return this.backendService == null ? Optional.empty() : Optional.ofNullable(this.backendService);
    }

    /**
     * Brand color
     * 
     */
    @Import(name="brandColor")
      private final @Nullable String brandColor;

    public Optional<String> brandColor() {
        return this.brandColor == null ? Optional.empty() : Optional.ofNullable(this.brandColor);
    }

    /**
     * The custom API capabilities
     * 
     */
    @Import(name="capabilities")
      private final @Nullable List<String> capabilities;

    public List<String> capabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }

    /**
     * Connection parameters
     * 
     */
    @Import(name="connectionParameters")
      private final @Nullable Map<String,ConnectionParameterResponse> connectionParameters;

    public Map<String,ConnectionParameterResponse> connectionParameters() {
        return this.connectionParameters == null ? Map.of() : this.connectionParameters;
    }

    /**
     * The custom API description
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The display name
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The icon URI
     * 
     */
    @Import(name="iconUri")
      private final @Nullable String iconUri;

    public Optional<String> iconUri() {
        return this.iconUri == null ? Optional.empty() : Optional.ofNullable(this.iconUri);
    }

    /**
     * Runtime URLs
     * 
     */
    @Import(name="runtimeUrls")
      private final @Nullable List<String> runtimeUrls;

    public List<String> runtimeUrls() {
        return this.runtimeUrls == null ? List.of() : this.runtimeUrls;
    }

    /**
     * The JSON representation of the swagger
     * 
     */
    @Import(name="swagger")
      private final @Nullable Object swagger;

    public Optional<Object> swagger() {
        return this.swagger == null ? Optional.empty() : Optional.ofNullable(this.swagger);
    }

    /**
     * The WSDL definition
     * 
     */
    @Import(name="wsdlDefinition")
      private final @Nullable WsdlDefinitionResponse wsdlDefinition;

    public Optional<WsdlDefinitionResponse> wsdlDefinition() {
        return this.wsdlDefinition == null ? Optional.empty() : Optional.ofNullable(this.wsdlDefinition);
    }

    public CustomApiPropertiesDefinitionResponse(
        @Nullable ApiResourceDefinitionsResponse apiDefinitions,
        @Nullable String apiType,
        @Nullable ApiResourceBackendServiceResponse backendService,
        @Nullable String brandColor,
        @Nullable List<String> capabilities,
        @Nullable Map<String,ConnectionParameterResponse> connectionParameters,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String iconUri,
        @Nullable List<String> runtimeUrls,
        @Nullable Object swagger,
        @Nullable WsdlDefinitionResponse wsdlDefinition) {
        this.apiDefinitions = apiDefinitions;
        this.apiType = apiType;
        this.backendService = backendService;
        this.brandColor = brandColor;
        this.capabilities = capabilities;
        this.connectionParameters = connectionParameters;
        this.description = description;
        this.displayName = displayName;
        this.iconUri = iconUri;
        this.runtimeUrls = runtimeUrls;
        this.swagger = swagger;
        this.wsdlDefinition = wsdlDefinition;
    }

    private CustomApiPropertiesDefinitionResponse() {
        this.apiDefinitions = null;
        this.apiType = null;
        this.backendService = null;
        this.brandColor = null;
        this.capabilities = List.of();
        this.connectionParameters = Map.of();
        this.description = null;
        this.displayName = null;
        this.iconUri = null;
        this.runtimeUrls = List.of();
        this.swagger = null;
        this.wsdlDefinition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomApiPropertiesDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiResourceDefinitionsResponse apiDefinitions;
        private @Nullable String apiType;
        private @Nullable ApiResourceBackendServiceResponse backendService;
        private @Nullable String brandColor;
        private @Nullable List<String> capabilities;
        private @Nullable Map<String,ConnectionParameterResponse> connectionParameters;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String iconUri;
        private @Nullable List<String> runtimeUrls;
        private @Nullable Object swagger;
        private @Nullable WsdlDefinitionResponse wsdlDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomApiPropertiesDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiDefinitions = defaults.apiDefinitions;
    	      this.apiType = defaults.apiType;
    	      this.backendService = defaults.backendService;
    	      this.brandColor = defaults.brandColor;
    	      this.capabilities = defaults.capabilities;
    	      this.connectionParameters = defaults.connectionParameters;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconUri = defaults.iconUri;
    	      this.runtimeUrls = defaults.runtimeUrls;
    	      this.swagger = defaults.swagger;
    	      this.wsdlDefinition = defaults.wsdlDefinition;
        }

        public Builder apiDefinitions(@Nullable ApiResourceDefinitionsResponse apiDefinitions) {
            this.apiDefinitions = apiDefinitions;
            return this;
        }
        public Builder apiType(@Nullable String apiType) {
            this.apiType = apiType;
            return this;
        }
        public Builder backendService(@Nullable ApiResourceBackendServiceResponse backendService) {
            this.backendService = backendService;
            return this;
        }
        public Builder brandColor(@Nullable String brandColor) {
            this.brandColor = brandColor;
            return this;
        }
        public Builder capabilities(@Nullable List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder connectionParameters(@Nullable Map<String,ConnectionParameterResponse> connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder iconUri(@Nullable String iconUri) {
            this.iconUri = iconUri;
            return this;
        }
        public Builder runtimeUrls(@Nullable List<String> runtimeUrls) {
            this.runtimeUrls = runtimeUrls;
            return this;
        }
        public Builder runtimeUrls(String... runtimeUrls) {
            return runtimeUrls(List.of(runtimeUrls));
        }
        public Builder swagger(@Nullable Object swagger) {
            this.swagger = swagger;
            return this;
        }
        public Builder wsdlDefinition(@Nullable WsdlDefinitionResponse wsdlDefinition) {
            this.wsdlDefinition = wsdlDefinition;
            return this;
        }        public CustomApiPropertiesDefinitionResponse build() {
            return new CustomApiPropertiesDefinitionResponse(apiDefinitions, apiType, backendService, brandColor, capabilities, connectionParameters, description, displayName, iconUri, runtimeUrls, swagger, wsdlDefinition);
        }
    }
}

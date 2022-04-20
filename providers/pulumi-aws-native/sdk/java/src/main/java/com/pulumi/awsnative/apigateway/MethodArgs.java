// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.apigateway.enums.MethodAuthorizationType;
import com.pulumi.awsnative.apigateway.inputs.MethodIntegrationArgs;
import com.pulumi.awsnative.apigateway.inputs.MethodResponseArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodArgs Empty = new MethodArgs();

    /**
     * Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    @Import(name="apiKeyRequired")
      private final @Nullable Output<Boolean> apiKeyRequired;

    public Output<Boolean> apiKeyRequired() {
        return this.apiKeyRequired == null ? Codegen.empty() : this.apiKeyRequired;
    }

    /**
     * A list of authorization scopes configured on the method.
     * 
     */
    @Import(name="authorizationScopes")
      private final @Nullable Output<List<String>> authorizationScopes;

    public Output<List<String>> authorizationScopes() {
        return this.authorizationScopes == null ? Codegen.empty() : this.authorizationScopes;
    }

    /**
     * The method&#39;s authorization type.
     * 
     */
    @Import(name="authorizationType")
      private final @Nullable Output<MethodAuthorizationType> authorizationType;

    public Output<MethodAuthorizationType> authorizationType() {
        return this.authorizationType == null ? Codegen.empty() : this.authorizationType;
    }

    /**
     * The identifier of the authorizer to use on this method.
     * 
     */
    @Import(name="authorizerId")
      private final @Nullable Output<String> authorizerId;

    public Output<String> authorizerId() {
        return this.authorizerId == null ? Codegen.empty() : this.authorizerId;
    }

    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Import(name="httpMethod", required=true)
      private final Output<String> httpMethod;

    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Import(name="integration")
      private final @Nullable Output<MethodIntegrationArgs> integration;

    public Output<MethodIntegrationArgs> integration() {
        return this.integration == null ? Codegen.empty() : this.integration;
    }

    /**
     * The responses that can be sent to the client who calls the method.
     * 
     */
    @Import(name="methodResponses")
      private final @Nullable Output<List<MethodResponseArgs>> methodResponses;

    public Output<List<MethodResponseArgs>> methodResponses() {
        return this.methodResponses == null ? Codegen.empty() : this.methodResponses;
    }

    /**
     * A friendly operation name for the method.
     * 
     */
    @Import(name="operationName")
      private final @Nullable Output<String> operationName;

    public Output<String> operationName() {
        return this.operationName == null ? Codegen.empty() : this.operationName;
    }

    /**
     * The resources that are used for the request&#39;s content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    @Import(name="requestModels")
      private final @Nullable Output<Object> requestModels;

    public Output<Object> requestModels() {
        return this.requestModels == null ? Codegen.empty() : this.requestModels;
    }

    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    @Import(name="requestParameters")
      private final @Nullable Output<Object> requestParameters;

    public Output<Object> requestParameters() {
        return this.requestParameters == null ? Codegen.empty() : this.requestParameters;
    }

    /**
     * The ID of the associated request validator.
     * 
     */
    @Import(name="requestValidatorId")
      private final @Nullable Output<String> requestValidatorId;

    public Output<String> requestValidatorId() {
        return this.requestValidatorId == null ? Codegen.empty() : this.requestValidatorId;
    }

    /**
     * The ID of an API Gateway resource.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    @Import(name="restApiId", required=true)
      private final Output<String> restApiId;

    public Output<String> restApiId() {
        return this.restApiId;
    }

    public MethodArgs(
        @Nullable Output<Boolean> apiKeyRequired,
        @Nullable Output<List<String>> authorizationScopes,
        @Nullable Output<MethodAuthorizationType> authorizationType,
        @Nullable Output<String> authorizerId,
        Output<String> httpMethod,
        @Nullable Output<MethodIntegrationArgs> integration,
        @Nullable Output<List<MethodResponseArgs>> methodResponses,
        @Nullable Output<String> operationName,
        @Nullable Output<Object> requestModels,
        @Nullable Output<Object> requestParameters,
        @Nullable Output<String> requestValidatorId,
        Output<String> resourceId,
        Output<String> restApiId) {
        this.apiKeyRequired = apiKeyRequired;
        this.authorizationScopes = authorizationScopes;
        this.authorizationType = authorizationType;
        this.authorizerId = authorizerId;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.integration = integration;
        this.methodResponses = methodResponses;
        this.operationName = operationName;
        this.requestModels = requestModels;
        this.requestParameters = requestParameters;
        this.requestValidatorId = requestValidatorId;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private MethodArgs() {
        this.apiKeyRequired = Codegen.empty();
        this.authorizationScopes = Codegen.empty();
        this.authorizationType = Codegen.empty();
        this.authorizerId = Codegen.empty();
        this.httpMethod = Codegen.empty();
        this.integration = Codegen.empty();
        this.methodResponses = Codegen.empty();
        this.operationName = Codegen.empty();
        this.requestModels = Codegen.empty();
        this.requestParameters = Codegen.empty();
        this.requestValidatorId = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.restApiId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> apiKeyRequired;
        private @Nullable Output<List<String>> authorizationScopes;
        private @Nullable Output<MethodAuthorizationType> authorizationType;
        private @Nullable Output<String> authorizerId;
        private Output<String> httpMethod;
        private @Nullable Output<MethodIntegrationArgs> integration;
        private @Nullable Output<List<MethodResponseArgs>> methodResponses;
        private @Nullable Output<String> operationName;
        private @Nullable Output<Object> requestModels;
        private @Nullable Output<Object> requestParameters;
        private @Nullable Output<String> requestValidatorId;
        private Output<String> resourceId;
        private Output<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyRequired = defaults.apiKeyRequired;
    	      this.authorizationScopes = defaults.authorizationScopes;
    	      this.authorizationType = defaults.authorizationType;
    	      this.authorizerId = defaults.authorizerId;
    	      this.httpMethod = defaults.httpMethod;
    	      this.integration = defaults.integration;
    	      this.methodResponses = defaults.methodResponses;
    	      this.operationName = defaults.operationName;
    	      this.requestModels = defaults.requestModels;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestValidatorId = defaults.requestValidatorId;
    	      this.resourceId = defaults.resourceId;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder apiKeyRequired(@Nullable Output<Boolean> apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }
        public Builder apiKeyRequired(@Nullable Boolean apiKeyRequired) {
            this.apiKeyRequired = Codegen.ofNullable(apiKeyRequired);
            return this;
        }
        public Builder authorizationScopes(@Nullable Output<List<String>> authorizationScopes) {
            this.authorizationScopes = authorizationScopes;
            return this;
        }
        public Builder authorizationScopes(@Nullable List<String> authorizationScopes) {
            this.authorizationScopes = Codegen.ofNullable(authorizationScopes);
            return this;
        }
        public Builder authorizationScopes(String... authorizationScopes) {
            return authorizationScopes(List.of(authorizationScopes));
        }
        public Builder authorizationType(@Nullable Output<MethodAuthorizationType> authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public Builder authorizationType(@Nullable MethodAuthorizationType authorizationType) {
            this.authorizationType = Codegen.ofNullable(authorizationType);
            return this;
        }
        public Builder authorizerId(@Nullable Output<String> authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }
        public Builder authorizerId(@Nullable String authorizerId) {
            this.authorizerId = Codegen.ofNullable(authorizerId);
            return this;
        }
        public Builder httpMethod(Output<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = Output.of(Objects.requireNonNull(httpMethod));
            return this;
        }
        public Builder integration(@Nullable Output<MethodIntegrationArgs> integration) {
            this.integration = integration;
            return this;
        }
        public Builder integration(@Nullable MethodIntegrationArgs integration) {
            this.integration = Codegen.ofNullable(integration);
            return this;
        }
        public Builder methodResponses(@Nullable Output<List<MethodResponseArgs>> methodResponses) {
            this.methodResponses = methodResponses;
            return this;
        }
        public Builder methodResponses(@Nullable List<MethodResponseArgs> methodResponses) {
            this.methodResponses = Codegen.ofNullable(methodResponses);
            return this;
        }
        public Builder methodResponses(MethodResponseArgs... methodResponses) {
            return methodResponses(List.of(methodResponses));
        }
        public Builder operationName(@Nullable Output<String> operationName) {
            this.operationName = operationName;
            return this;
        }
        public Builder operationName(@Nullable String operationName) {
            this.operationName = Codegen.ofNullable(operationName);
            return this;
        }
        public Builder requestModels(@Nullable Output<Object> requestModels) {
            this.requestModels = requestModels;
            return this;
        }
        public Builder requestModels(@Nullable Object requestModels) {
            this.requestModels = Codegen.ofNullable(requestModels);
            return this;
        }
        public Builder requestParameters(@Nullable Output<Object> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }
        public Builder requestParameters(@Nullable Object requestParameters) {
            this.requestParameters = Codegen.ofNullable(requestParameters);
            return this;
        }
        public Builder requestValidatorId(@Nullable Output<String> requestValidatorId) {
            this.requestValidatorId = requestValidatorId;
            return this;
        }
        public Builder requestValidatorId(@Nullable String requestValidatorId) {
            this.requestValidatorId = Codegen.ofNullable(requestValidatorId);
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder restApiId(Output<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Output.of(Objects.requireNonNull(restApiId));
            return this;
        }        public MethodArgs build() {
            return new MethodArgs(apiKeyRequired, authorizationScopes, authorizationType, authorizerId, httpMethod, integration, methodResponses, operationName, requestModels, requestParameters, requestValidatorId, resourceId, restApiId);
        }
    }
}

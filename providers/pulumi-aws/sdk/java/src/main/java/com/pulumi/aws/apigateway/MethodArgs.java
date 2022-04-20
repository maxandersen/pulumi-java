// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodArgs Empty = new MethodArgs();

    /**
     * Specify if the method requires an API key
     * 
     */
    @Import(name="apiKeyRequired")
      private final @Nullable Output<Boolean> apiKeyRequired;

    public Output<Boolean> apiKeyRequired() {
        return this.apiKeyRequired == null ? Codegen.empty() : this.apiKeyRequired;
    }

    /**
     * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
     * 
     */
    @Import(name="authorization", required=true)
      private final Output<String> authorization;

    public Output<String> authorization() {
        return this.authorization;
    }

    /**
     * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
     * 
     */
    @Import(name="authorizationScopes")
      private final @Nullable Output<List<String>> authorizationScopes;

    public Output<List<String>> authorizationScopes() {
        return this.authorizationScopes == null ? Codegen.empty() : this.authorizationScopes;
    }

    /**
     * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
     * 
     */
    @Import(name="authorizerId")
      private final @Nullable Output<String> authorizerId;

    public Output<String> authorizerId() {
        return this.authorizerId == null ? Codegen.empty() : this.authorizerId;
    }

    /**
     * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @Import(name="httpMethod", required=true)
      private final Output<String> httpMethod;

    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * The function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
     * 
     */
    @Import(name="operationName")
      private final @Nullable Output<String> operationName;

    public Output<String> operationName() {
        return this.operationName == null ? Codegen.empty() : this.operationName;
    }

    /**
     * A map of the API models used for the request&#39;s content type
     * where key is the content type (e.g., `application/json`)
     * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`&#39;s `name`.
     * 
     */
    @Import(name="requestModels")
      private final @Nullable Output<Map<String,String>> requestModels;

    public Output<Map<String,String>> requestModels() {
        return this.requestModels == null ? Codegen.empty() : this.requestModels;
    }

    /**
     * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
     * For example: `request_parameters = {&#34;method.request.header.X-Some-Header&#34; = true &#34;method.request.querystring.some-query-param&#34; = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
     * 
     */
    @Import(name="requestParameters")
      private final @Nullable Output<Map<String,Boolean>> requestParameters;

    public Output<Map<String,Boolean>> requestParameters() {
        return this.requestParameters == null ? Codegen.empty() : this.requestParameters;
    }

    /**
     * The ID of a `aws.apigateway.RequestValidator`
     * 
     */
    @Import(name="requestValidatorId")
      private final @Nullable Output<String> requestValidatorId;

    public Output<String> requestValidatorId() {
        return this.requestValidatorId == null ? Codegen.empty() : this.requestValidatorId;
    }

    /**
     * The API resource ID
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi", required=true)
      private final Output<String> restApi;

    public Output<String> restApi() {
        return this.restApi;
    }

    public MethodArgs(
        @Nullable Output<Boolean> apiKeyRequired,
        Output<String> authorization,
        @Nullable Output<List<String>> authorizationScopes,
        @Nullable Output<String> authorizerId,
        Output<String> httpMethod,
        @Nullable Output<String> operationName,
        @Nullable Output<Map<String,String>> requestModels,
        @Nullable Output<Map<String,Boolean>> requestParameters,
        @Nullable Output<String> requestValidatorId,
        Output<String> resourceId,
        Output<String> restApi) {
        this.apiKeyRequired = apiKeyRequired;
        this.authorization = Objects.requireNonNull(authorization, "expected parameter 'authorization' to be non-null");
        this.authorizationScopes = authorizationScopes;
        this.authorizerId = authorizerId;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.operationName = operationName;
        this.requestModels = requestModels;
        this.requestParameters = requestParameters;
        this.requestValidatorId = requestValidatorId;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
    }

    private MethodArgs() {
        this.apiKeyRequired = Codegen.empty();
        this.authorization = Codegen.empty();
        this.authorizationScopes = Codegen.empty();
        this.authorizerId = Codegen.empty();
        this.httpMethod = Codegen.empty();
        this.operationName = Codegen.empty();
        this.requestModels = Codegen.empty();
        this.requestParameters = Codegen.empty();
        this.requestValidatorId = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.restApi = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> apiKeyRequired;
        private Output<String> authorization;
        private @Nullable Output<List<String>> authorizationScopes;
        private @Nullable Output<String> authorizerId;
        private Output<String> httpMethod;
        private @Nullable Output<String> operationName;
        private @Nullable Output<Map<String,String>> requestModels;
        private @Nullable Output<Map<String,Boolean>> requestParameters;
        private @Nullable Output<String> requestValidatorId;
        private Output<String> resourceId;
        private Output<String> restApi;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyRequired = defaults.apiKeyRequired;
    	      this.authorization = defaults.authorization;
    	      this.authorizationScopes = defaults.authorizationScopes;
    	      this.authorizerId = defaults.authorizerId;
    	      this.httpMethod = defaults.httpMethod;
    	      this.operationName = defaults.operationName;
    	      this.requestModels = defaults.requestModels;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestValidatorId = defaults.requestValidatorId;
    	      this.resourceId = defaults.resourceId;
    	      this.restApi = defaults.restApi;
        }

        public Builder apiKeyRequired(@Nullable Output<Boolean> apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }
        public Builder apiKeyRequired(@Nullable Boolean apiKeyRequired) {
            this.apiKeyRequired = Codegen.ofNullable(apiKeyRequired);
            return this;
        }
        public Builder authorization(Output<String> authorization) {
            this.authorization = Objects.requireNonNull(authorization);
            return this;
        }
        public Builder authorization(String authorization) {
            this.authorization = Output.of(Objects.requireNonNull(authorization));
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
        public Builder operationName(@Nullable Output<String> operationName) {
            this.operationName = operationName;
            return this;
        }
        public Builder operationName(@Nullable String operationName) {
            this.operationName = Codegen.ofNullable(operationName);
            return this;
        }
        public Builder requestModels(@Nullable Output<Map<String,String>> requestModels) {
            this.requestModels = requestModels;
            return this;
        }
        public Builder requestModels(@Nullable Map<String,String> requestModels) {
            this.requestModels = Codegen.ofNullable(requestModels);
            return this;
        }
        public Builder requestParameters(@Nullable Output<Map<String,Boolean>> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }
        public Builder requestParameters(@Nullable Map<String,Boolean> requestParameters) {
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
        public Builder restApi(Output<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }        public MethodArgs build() {
            return new MethodArgs(apiKeyRequired, authorization, authorizationScopes, authorizerId, httpMethod, operationName, requestModels, requestParameters, requestValidatorId, resourceId, restApi);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MethodState extends com.pulumi.resources.ResourceArgs {

    public static final MethodState Empty = new MethodState();

    /**
     * Specify if the method requires an API key
     * 
     */
    @Import(name="apiKeyRequired")
    private @Nullable Output<Boolean> apiKeyRequired;

    public Optional<Output<Boolean>> apiKeyRequired() {
        return Optional.ofNullable(this.apiKeyRequired);
    }

    /**
     * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
     * 
     */
    @Import(name="authorization")
    private @Nullable Output<String> authorization;

    public Optional<Output<String>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
     * 
     */
    @Import(name="authorizationScopes")
    private @Nullable Output<List<String>> authorizationScopes;

    public Optional<Output<List<String>>> authorizationScopes() {
        return Optional.ofNullable(this.authorizationScopes);
    }

    /**
     * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
     * 
     */
    @Import(name="authorizerId")
    private @Nullable Output<String> authorizerId;

    public Optional<Output<String>> authorizerId() {
        return Optional.ofNullable(this.authorizerId);
    }

    /**
     * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<String> httpMethod;

    public Optional<Output<String>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * The function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
     * 
     */
    @Import(name="operationName")
    private @Nullable Output<String> operationName;

    public Optional<Output<String>> operationName() {
        return Optional.ofNullable(this.operationName);
    }

    /**
     * A map of the API models used for the request&#39;s content type
     * where key is the content type (e.g., `application/json`)
     * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`&#39;s `name`.
     * 
     */
    @Import(name="requestModels")
    private @Nullable Output<Map<String,String>> requestModels;

    public Optional<Output<Map<String,String>>> requestModels() {
        return Optional.ofNullable(this.requestModels);
    }

    /**
     * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
     * For example: `request_parameters = {&#34;method.request.header.X-Some-Header&#34; = true &#34;method.request.querystring.some-query-param&#34; = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
     * 
     */
    @Import(name="requestParameters")
    private @Nullable Output<Map<String,Boolean>> requestParameters;

    public Optional<Output<Map<String,Boolean>>> requestParameters() {
        return Optional.ofNullable(this.requestParameters);
    }

    /**
     * The ID of a `aws.apigateway.RequestValidator`
     * 
     */
    @Import(name="requestValidatorId")
    private @Nullable Output<String> requestValidatorId;

    public Optional<Output<String>> requestValidatorId() {
        return Optional.ofNullable(this.requestValidatorId);
    }

    /**
     * The API resource ID
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi")
    private @Nullable Output<String> restApi;

    public Optional<Output<String>> restApi() {
        return Optional.ofNullable(this.restApi);
    }

    private MethodState() {}

    private MethodState(MethodState $) {
        this.apiKeyRequired = $.apiKeyRequired;
        this.authorization = $.authorization;
        this.authorizationScopes = $.authorizationScopes;
        this.authorizerId = $.authorizerId;
        this.httpMethod = $.httpMethod;
        this.operationName = $.operationName;
        this.requestModels = $.requestModels;
        this.requestParameters = $.requestParameters;
        this.requestValidatorId = $.requestValidatorId;
        this.resourceId = $.resourceId;
        this.restApi = $.restApi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodState $;

        public Builder() {
            $ = new MethodState();
        }

        public Builder(MethodState defaults) {
            $ = new MethodState(Objects.requireNonNull(defaults));
        }

        public Builder apiKeyRequired(@Nullable Output<Boolean> apiKeyRequired) {
            $.apiKeyRequired = apiKeyRequired;
            return this;
        }

        public Builder apiKeyRequired(Boolean apiKeyRequired) {
            return apiKeyRequired(Output.of(apiKeyRequired));
        }

        public Builder authorization(@Nullable Output<String> authorization) {
            $.authorization = authorization;
            return this;
        }

        public Builder authorization(String authorization) {
            return authorization(Output.of(authorization));
        }

        public Builder authorizationScopes(@Nullable Output<List<String>> authorizationScopes) {
            $.authorizationScopes = authorizationScopes;
            return this;
        }

        public Builder authorizationScopes(List<String> authorizationScopes) {
            return authorizationScopes(Output.of(authorizationScopes));
        }

        public Builder authorizationScopes(String... authorizationScopes) {
            return authorizationScopes(List.of(authorizationScopes));
        }

        public Builder authorizerId(@Nullable Output<String> authorizerId) {
            $.authorizerId = authorizerId;
            return this;
        }

        public Builder authorizerId(String authorizerId) {
            return authorizerId(Output.of(authorizerId));
        }

        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        public Builder operationName(@Nullable Output<String> operationName) {
            $.operationName = operationName;
            return this;
        }

        public Builder operationName(String operationName) {
            return operationName(Output.of(operationName));
        }

        public Builder requestModels(@Nullable Output<Map<String,String>> requestModels) {
            $.requestModels = requestModels;
            return this;
        }

        public Builder requestModels(Map<String,String> requestModels) {
            return requestModels(Output.of(requestModels));
        }

        public Builder requestParameters(@Nullable Output<Map<String,Boolean>> requestParameters) {
            $.requestParameters = requestParameters;
            return this;
        }

        public Builder requestParameters(Map<String,Boolean> requestParameters) {
            return requestParameters(Output.of(requestParameters));
        }

        public Builder requestValidatorId(@Nullable Output<String> requestValidatorId) {
            $.requestValidatorId = requestValidatorId;
            return this;
        }

        public Builder requestValidatorId(String requestValidatorId) {
            return requestValidatorId(Output.of(requestValidatorId));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder restApi(@Nullable Output<String> restApi) {
            $.restApi = restApi;
            return this;
        }

        public Builder restApi(String restApi) {
            return restApi(Output.of(restApi));
        }

        public MethodState build() {
            return $;
        }
    }

}

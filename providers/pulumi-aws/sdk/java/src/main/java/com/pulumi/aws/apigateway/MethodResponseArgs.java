// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodResponseArgs Empty = new MethodResponseArgs();

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
     * The API resource ID
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * A map of the API models used for the response's content type
     * 
     */
    @Import(name="responseModels")
      private final @Nullable Output<Map<String,String>> responseModels;

    public Output<Map<String,String>> responseModels() {
        return this.responseModels == null ? Codegen.empty() : this.responseModels;
    }

    /**
     * A map of response parameters that can be sent to the caller.
     * For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
     * would define that the header `X-Some-Header` can be provided on the response.
     * 
     */
    @Import(name="responseParameters")
      private final @Nullable Output<Map<String,Boolean>> responseParameters;

    public Output<Map<String,Boolean>> responseParameters() {
        return this.responseParameters == null ? Codegen.empty() : this.responseParameters;
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

    /**
     * The HTTP status code
     * 
     */
    @Import(name="statusCode", required=true)
      private final Output<String> statusCode;

    public Output<String> statusCode() {
        return this.statusCode;
    }

    public MethodResponseArgs(
        Output<String> httpMethod,
        Output<String> resourceId,
        @Nullable Output<Map<String,String>> responseModels,
        @Nullable Output<Map<String,Boolean>> responseParameters,
        Output<String> restApi,
        Output<String> statusCode) {
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.responseModels = responseModels;
        this.responseParameters = responseParameters;
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private MethodResponseArgs() {
        this.httpMethod = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.responseModels = Codegen.empty();
        this.responseParameters = Codegen.empty();
        this.restApi = Codegen.empty();
        this.statusCode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> httpMethod;
        private Output<String> resourceId;
        private @Nullable Output<Map<String,String>> responseModels;
        private @Nullable Output<Map<String,Boolean>> responseParameters;
        private Output<String> restApi;
        private Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpMethod = defaults.httpMethod;
    	      this.resourceId = defaults.resourceId;
    	      this.responseModels = defaults.responseModels;
    	      this.responseParameters = defaults.responseParameters;
    	      this.restApi = defaults.restApi;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder httpMethod(Output<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = Output.of(Objects.requireNonNull(httpMethod));
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
        public Builder responseModels(@Nullable Output<Map<String,String>> responseModels) {
            this.responseModels = responseModels;
            return this;
        }
        public Builder responseModels(@Nullable Map<String,String> responseModels) {
            this.responseModels = Codegen.ofNullable(responseModels);
            return this;
        }
        public Builder responseParameters(@Nullable Output<Map<String,Boolean>> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }
        public Builder responseParameters(@Nullable Map<String,Boolean> responseParameters) {
            this.responseParameters = Codegen.ofNullable(responseParameters);
            return this;
        }
        public Builder restApi(Output<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }
        public Builder statusCode(Output<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Output.of(Objects.requireNonNull(statusCode));
            return this;
        }        public MethodResponseArgs build() {
            return new MethodResponseArgs(httpMethod, resourceId, responseModels, responseParameters, restApi, statusCode);
        }
    }
}

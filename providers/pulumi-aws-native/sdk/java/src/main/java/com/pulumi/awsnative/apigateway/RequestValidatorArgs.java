// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RequestValidatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestValidatorArgs Empty = new RequestValidatorArgs();

    /**
     * Name of the request validator.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The identifier of the targeted API entity.
     * 
     */
    @Import(name="restApiId", required=true)
      private final Output<String> restApiId;

    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     * Indicates whether to validate the request body according to the configured schema for the targeted API and method.
     * 
     */
    @Import(name="validateRequestBody")
      private final @Nullable Output<Boolean> validateRequestBody;

    public Output<Boolean> validateRequestBody() {
        return this.validateRequestBody == null ? Codegen.empty() : this.validateRequestBody;
    }

    /**
     * Indicates whether to validate request parameters.
     * 
     */
    @Import(name="validateRequestParameters")
      private final @Nullable Output<Boolean> validateRequestParameters;

    public Output<Boolean> validateRequestParameters() {
        return this.validateRequestParameters == null ? Codegen.empty() : this.validateRequestParameters;
    }

    public RequestValidatorArgs(
        @Nullable Output<String> name,
        Output<String> restApiId,
        @Nullable Output<Boolean> validateRequestBody,
        @Nullable Output<Boolean> validateRequestParameters) {
        this.name = name;
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
        this.validateRequestBody = validateRequestBody;
        this.validateRequestParameters = validateRequestParameters;
    }

    private RequestValidatorArgs() {
        this.name = Codegen.empty();
        this.restApiId = Codegen.empty();
        this.validateRequestBody = Codegen.empty();
        this.validateRequestParameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestValidatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<String> restApiId;
        private @Nullable Output<Boolean> validateRequestBody;
        private @Nullable Output<Boolean> validateRequestParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestValidatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.restApiId = defaults.restApiId;
    	      this.validateRequestBody = defaults.validateRequestBody;
    	      this.validateRequestParameters = defaults.validateRequestParameters;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder restApiId(Output<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Output.of(Objects.requireNonNull(restApiId));
            return this;
        }
        public Builder validateRequestBody(@Nullable Output<Boolean> validateRequestBody) {
            this.validateRequestBody = validateRequestBody;
            return this;
        }
        public Builder validateRequestBody(@Nullable Boolean validateRequestBody) {
            this.validateRequestBody = Codegen.ofNullable(validateRequestBody);
            return this;
        }
        public Builder validateRequestParameters(@Nullable Output<Boolean> validateRequestParameters) {
            this.validateRequestParameters = validateRequestParameters;
            return this;
        }
        public Builder validateRequestParameters(@Nullable Boolean validateRequestParameters) {
            this.validateRequestParameters = Codegen.ofNullable(validateRequestParameters);
            return this;
        }        public RequestValidatorArgs build() {
            return new RequestValidatorArgs(name, restApiId, validateRequestBody, validateRequestParameters);
        }
    }
}

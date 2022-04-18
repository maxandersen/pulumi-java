// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayApiConfigFileResponse;
import java.util.List;
import java.util.Objects;


/**
 * A gRPC service definition.
 * 
 */
public final class ApigatewayApiConfigGrpcServiceDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApigatewayApiConfigGrpcServiceDefinitionResponse Empty = new ApigatewayApiConfigGrpcServiceDefinitionResponse();

    /**
     * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
     * 
     */
    @Import(name="fileDescriptorSet", required=true)
      private final ApigatewayApiConfigFileResponse fileDescriptorSet;

    public ApigatewayApiConfigFileResponse fileDescriptorSet() {
        return this.fileDescriptorSet;
    }

    /**
     * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to 'protoc' command used to generate file_descriptor_set.
     * 
     */
    @Import(name="source", required=true)
      private final List<ApigatewayApiConfigFileResponse> source;

    public List<ApigatewayApiConfigFileResponse> source() {
        return this.source;
    }

    public ApigatewayApiConfigGrpcServiceDefinitionResponse(
        ApigatewayApiConfigFileResponse fileDescriptorSet,
        List<ApigatewayApiConfigFileResponse> source) {
        this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet, "expected parameter 'fileDescriptorSet' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private ApigatewayApiConfigGrpcServiceDefinitionResponse() {
        this.fileDescriptorSet = null;
        this.source = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigFileResponse fileDescriptorSet;
        private List<ApigatewayApiConfigFileResponse> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileDescriptorSet = defaults.fileDescriptorSet;
    	      this.source = defaults.source;
        }

        public Builder fileDescriptorSet(ApigatewayApiConfigFileResponse fileDescriptorSet) {
            this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet);
            return this;
        }
        public Builder source(List<ApigatewayApiConfigFileResponse> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(ApigatewayApiConfigFileResponse... source) {
            return source(List.of(source));
        }        public ApigatewayApiConfigGrpcServiceDefinitionResponse build() {
            return new ApigatewayApiConfigGrpcServiceDefinitionResponse(fileDescriptorSet, source);
        }
    }
}

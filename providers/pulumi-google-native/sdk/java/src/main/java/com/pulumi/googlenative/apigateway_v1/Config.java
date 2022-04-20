// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigateway_v1.ConfigArgs;
import com.pulumi.googlenative.apigateway_v1.outputs.ApigatewayApiConfigFileResponse;
import com.pulumi.googlenative.apigateway_v1.outputs.ApigatewayApiConfigGrpcServiceDefinitionResponse;
import com.pulumi.googlenative.apigateway_v1.outputs.ApigatewayApiConfigOpenApiDocumentResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new ApiConfig in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigateway/v1:Config")
public class Config extends com.pulumi.resources.CustomResource {
    /**
     * Created time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Created time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account&#39;s email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
     */
    @Export(name="gatewayServiceAccount", type=String.class, parameters={})
    private Output<String> gatewayServiceAccount;

    /**
     * @return Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account&#39;s email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
     */
    public Output<String> gatewayServiceAccount() {
        return this.gatewayServiceAccount;
    }
    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
     */
    @Export(name="grpcServices", type=List.class, parameters={ApigatewayApiConfigGrpcServiceDefinitionResponse.class})
    private Output<List<ApigatewayApiConfigGrpcServiceDefinitionResponse>> grpcServices;

    /**
     * @return Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
     */
    public Output<List<ApigatewayApiConfigGrpcServiceDefinitionResponse>> grpcServices() {
        return this.grpcServices;
    }
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
     */
    @Export(name="managedServiceConfigs", type=List.class, parameters={ApigatewayApiConfigFileResponse.class})
    private Output<List<ApigatewayApiConfigFileResponse>> managedServiceConfigs;

    /**
     * @return Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
     */
    public Output<List<ApigatewayApiConfigFileResponse>> managedServiceConfigs() {
        return this.managedServiceConfigs;
    }
    /**
     * Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
     */
    @Export(name="openapiDocuments", type=List.class, parameters={ApigatewayApiConfigOpenApiDocumentResponse.class})
    private Output<List<ApigatewayApiConfigOpenApiDocumentResponse>> openapiDocuments;

    /**
     * @return Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
     */
    public Output<List<ApigatewayApiConfigOpenApiDocumentResponse>> openapiDocuments() {
        return this.openapiDocuments;
    }
    /**
     * The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    @Export(name="serviceConfigId", type=String.class, parameters={})
    private Output<String> serviceConfigId;

    /**
     * @return The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    public Output<String> serviceConfigId() {
        return this.serviceConfigId;
    }
    /**
     * State of the API Config.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the API Config.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Updated time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Updated time.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Config(String name) {
        this(name, ConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Config(String name, ConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Config(String name, ConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:Config", name, args == null ? ConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Config(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:Config", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Config get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Config(name, id, options);
    }
}

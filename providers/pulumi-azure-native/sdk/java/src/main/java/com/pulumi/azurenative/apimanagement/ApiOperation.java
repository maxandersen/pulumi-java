// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ApiOperationArgs;
import com.pulumi.azurenative.apimanagement.outputs.ParameterContractResponse;
import com.pulumi.azurenative.apimanagement.outputs.RequestContractResponse;
import com.pulumi.azurenative.apimanagement.outputs.ResponseContractResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Api Operation details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiOperation newoperations /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/PetStoreTemplate2/operations/newoperations 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiOperation")
public class ApiOperation extends com.pulumi.resources.CustomResource {
    /**
     * Description of the operation. May include HTML formatting tags.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the operation. May include HTML formatting tags.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Operation Name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Operation Name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them.
     * 
     */
    @Export(name="method", type=String.class, parameters={})
    private Output<String> method;

    /**
     * @return A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them.
     * 
     */
    public Output<String> method() {
        return this.method;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Operation Policies
     * 
     */
    @Export(name="policies", type=String.class, parameters={})
    private Output</* @Nullable */ String> policies;

    /**
     * @return Operation Policies
     * 
     */
    public Output<Optional<String>> policies() {
        return Codegen.optional(this.policies);
    }
    /**
     * An entity containing request details.
     * 
     */
    @Export(name="request", type=RequestContractResponse.class, parameters={})
    private Output</* @Nullable */ RequestContractResponse> request;

    /**
     * @return An entity containing request details.
     * 
     */
    public Output<Optional<RequestContractResponse>> request() {
        return Codegen.optional(this.request);
    }
    /**
     * Array of Operation responses.
     * 
     */
    @Export(name="responses", type=List.class, parameters={ResponseContractResponse.class})
    private Output</* @Nullable */ List<ResponseContractResponse>> responses;

    /**
     * @return Array of Operation responses.
     * 
     */
    public Output<Optional<List<ResponseContractResponse>>> responses() {
        return Codegen.optional(this.responses);
    }
    /**
     * Collection of URL template parameters.
     * 
     */
    @Export(name="templateParameters", type=List.class, parameters={ParameterContractResponse.class})
    private Output</* @Nullable */ List<ParameterContractResponse>> templateParameters;

    /**
     * @return Collection of URL template parameters.
     * 
     */
    public Output<Optional<List<ParameterContractResponse>>> templateParameters() {
        return Codegen.optional(this.templateParameters);
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}
     * 
     */
    @Export(name="urlTemplate", type=String.class, parameters={})
    private Output<String> urlTemplate;

    /**
     * @return Relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}
     * 
     */
    public Output<String> urlTemplate() {
        return this.urlTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiOperation(String name) {
        this(name, ApiOperationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiOperation(String name, ApiOperationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiOperation(String name, ApiOperationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiOperation", name, args == null ? ApiOperationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiOperation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiOperation", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20160707:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20161010:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:ApiOperation").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:ApiOperation").build())
            ))
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
    public static ApiOperation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiOperation(name, id, options);
    }
}

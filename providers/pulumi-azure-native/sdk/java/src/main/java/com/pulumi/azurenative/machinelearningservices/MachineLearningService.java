// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.machinelearningservices.MachineLearningServiceArgs;
import com.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.AKSVariantResponseResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Machine Learning service object wrapped into ARM resource envelope.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:MachineLearningService service456 subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.MachineLearningServices/workspaces/workspaces123/services/service456 
 * ```
 * 
 * @deprecated
 * Please use one of the variants: ACIService, AKSService, EndpointVariant.
 * 
 */
@Deprecated /* Please use one of the variants: ACIService, AKSService, EndpointVariant. */
@ResourceType(type="azure-native:machinelearningservices:MachineLearningService")
public class MachineLearningService extends com.pulumi.resources.CustomResource {
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> identity() {
        return this.identity;
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Service properties
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Service properties
     * 
     */
    public Output<Object> properties() {
        return this.properties;
    }
    /**
     * The sku of the workspace.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the workspace.
     * 
     */
    public Output</* @Nullable */ SkuResponse> sku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineLearningService(String name) {
        this(name, MachineLearningServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineLearningService(String name, MachineLearningServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineLearningService(String name, MachineLearningServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningService", name, args == null ? MachineLearningServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MachineLearningService(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningService", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200501preview:MachineLearningService").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200515preview:MachineLearningService").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200901preview:MachineLearningService").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210101:MachineLearningService").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210401:MachineLearningService").build())
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
    public static MachineLearningService get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MachineLearningService(name, id, options);
    }
}

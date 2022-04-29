// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hybridnetwork.VendorSkusArgs;
import com.pulumi.azurenative.hybridnetwork.outputs.NetworkFunctionTemplateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Sku sub resource.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridnetwork:VendorSkus TestSku /subscriptions/subid/providers/Microsoft.HybridNetwork/vendors/TestVendor/vendorskus/TestSku 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridnetwork:VendorSkus")
public class VendorSkus extends CustomResource {
    /**
     * The sku deployment mode.
     * 
     */
    @Export(name="deploymentMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentMode;

    /**
     * @return The sku deployment mode.
     * 
     */
    public Output<Optional<String>> deploymentMode() {
        return Codegen.optional(this.deploymentMode);
    }
    /**
     * The parameters for the managed application to be supplied by the vendor.
     * 
     */
    @Export(name="managedApplicationParameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> managedApplicationParameters;

    /**
     * @return The parameters for the managed application to be supplied by the vendor.
     * 
     */
    public Output<Optional<Object>> managedApplicationParameters() {
        return Codegen.optional(this.managedApplicationParameters);
    }
    /**
     * The template for the managed application deployment.
     * 
     */
    @Export(name="managedApplicationTemplate", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> managedApplicationTemplate;

    /**
     * @return The template for the managed application deployment.
     * 
     */
    public Output<Optional<Object>> managedApplicationTemplate() {
        return Codegen.optional(this.managedApplicationTemplate);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The template definition of the network function.
     * 
     */
    @Export(name="networkFunctionTemplate", type=NetworkFunctionTemplateResponse.class, parameters={})
    private Output</* @Nullable */ NetworkFunctionTemplateResponse> networkFunctionTemplate;

    /**
     * @return The template definition of the network function.
     * 
     */
    public Output<Optional<NetworkFunctionTemplateResponse>> networkFunctionTemplate() {
        return Codegen.optional(this.networkFunctionTemplate);
    }
    /**
     * Indicates if the vendor sku is in preview mode.
     * 
     */
    @Export(name="preview", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> preview;

    /**
     * @return Indicates if the vendor sku is in preview mode.
     * 
     */
    public Output<Optional<Boolean>> preview() {
        return Codegen.optional(this.preview);
    }
    /**
     * The provisioning state of the vendor sku sub resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the vendor sku sub resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku type.
     * 
     */
    @Export(name="skuType", type=String.class, parameters={})
    private Output</* @Nullable */ String> skuType;

    /**
     * @return The sku type.
     * 
     */
    public Output<Optional<String>> skuType() {
        return Codegen.optional(this.skuType);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VendorSkus(String name) {
        this(name, VendorSkusArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VendorSkus(String name, VendorSkusArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VendorSkus(String name, VendorSkusArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkus", name, args == null ? VendorSkusArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VendorSkus(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkus", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20200101preview:VendorSkus").build()),
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20210501:VendorSkus").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VendorSkus get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new VendorSkus(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.VendorSkuPreviewArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Customer subscription which can use a sku.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridnetwork:VendorSkuPreview previewSub /subscriptions/subid/providers/Microsoft.HybridNetwork/vendors/TestVendor/vendorskus/TestSku/previewsubscriptions/previewSub 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridnetwork:VendorSkuPreview")
public class VendorSkuPreview extends io.pulumi.resources.CustomResource {
    /**
     * The preview subscription ID.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The preview subscription ID.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VendorSkuPreview(String name) {
        this(name, VendorSkuPreviewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VendorSkuPreview(String name, VendorSkuPreviewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VendorSkuPreview(String name, VendorSkuPreviewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkuPreview", name, args == null ? VendorSkuPreviewArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VendorSkuPreview(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkuPreview", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20200101preview:VendorSkuPreview").build()),
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20210501:VendorSkuPreview").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VendorSkuPreview get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VendorSkuPreview(name, id, options);
    }
}

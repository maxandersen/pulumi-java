// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datalakestore.TrustedIdProviderArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Data Lake Store trusted identity provider information.
 * API Version: 2016-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datalakestore:TrustedIdProvider test_trusted_id_provider_name 34adfa4f-cedf-4dc0-ba29-b6d1a69ab345 
 * ```
 * 
 */
@ResourceType(type="azure-native:datalakestore:TrustedIdProvider")
public class TrustedIdProvider extends CustomResource {
    /**
     * The URL of this trusted identity provider.
     * 
     */
    @Export(name="idProvider", type=String.class, parameters={})
    private Output<String> idProvider;

    /**
     * @return The URL of this trusted identity provider.
     * 
     */
    public Output<String> idProvider() {
        return this.idProvider;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrustedIdProvider(String name) {
        this(name, TrustedIdProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrustedIdProvider(String name, TrustedIdProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrustedIdProvider(String name, TrustedIdProviderArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:datalakestore:TrustedIdProvider", name, args == null ? TrustedIdProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrustedIdProvider(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:datalakestore:TrustedIdProvider", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datalakestore/v20161101:TrustedIdProvider").build())
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
    public static TrustedIdProvider get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new TrustedIdProvider(name, id, options);
    }
}

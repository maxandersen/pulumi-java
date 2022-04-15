// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.offazure.HyperVSiteArgs;
import io.pulumi.azurenative.offazure.outputs.SitePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Site REST Resource.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:offazure:HyperVSite appliance1e39site /subscriptions/4bd2aa0f-2bd2-4d67-91a8-5a4533d58600/resourceGroups/pajindTest/providers/Microsoft.OffAzure/HyperVSites/appliance1e39site 
 * ```
 * 
 */
@ResourceType(type="azure-native:offazure:HyperVSite")
public class HyperVSite extends io.pulumi.resources.CustomResource {
    /**
     * eTag for concurrency control.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return eTag for concurrency control.
     * 
     */
    public Output</* @Nullable */ String> eTag() {
        return this.eTag;
    }
    /**
     * Azure location in which Sites is created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Azure location in which Sites is created.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Name of the Hyper-V site.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the Hyper-V site.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * Nested properties of Hyper-V site.
     * 
     */
    @Export(name="properties", type=SitePropertiesResponse.class, parameters={})
    private Output<SitePropertiesResponse> properties;

    /**
     * @return Nested properties of Hyper-V site.
     * 
     */
    public Output<SitePropertiesResponse> properties() {
        return this.properties;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Type of resource. Type = Microsoft.OffAzure/HyperVSites.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of resource. Type = Microsoft.OffAzure/HyperVSites.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HyperVSite(String name) {
        this(name, HyperVSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HyperVSite(String name, HyperVSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HyperVSite(String name, HyperVSiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:offazure:HyperVSite", name, args == null ? HyperVSiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HyperVSite(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:offazure:HyperVSite", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:offazure/v20200101:HyperVSite").build()),
                Output.of(Alias.builder().type("azure-native:offazure/v20200707:HyperVSite").build())
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
    public static HyperVSite get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HyperVSite(name, id, options);
    }
}

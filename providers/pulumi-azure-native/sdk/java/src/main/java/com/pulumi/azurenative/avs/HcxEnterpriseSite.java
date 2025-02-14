// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.avs.HcxEnterpriseSiteArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An HCX Enterprise Site resource
 * API Version: 2020-03-20.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:avs:HcxEnterpriseSite site1 /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/hcxEnterpriseSites/site1 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:HcxEnterpriseSite")
public class HcxEnterpriseSite extends com.pulumi.resources.CustomResource {
    /**
     * The activation key
     * 
     */
    @Export(name="activationKey", type=String.class, parameters={})
    private Output<String> activationKey;

    /**
     * @return The activation key
     * 
     */
    public Output<String> activationKey() {
        return this.activationKey;
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
     * The status of the HCX Enterprise Site
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the HCX Enterprise Site
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HcxEnterpriseSite(String name) {
        this(name, HcxEnterpriseSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HcxEnterpriseSite(String name, HcxEnterpriseSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HcxEnterpriseSite(String name, HcxEnterpriseSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:HcxEnterpriseSite", name, args == null ? HcxEnterpriseSiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HcxEnterpriseSite(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:HcxEnterpriseSite", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:avs/v20200320:HcxEnterpriseSite").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20200717preview:HcxEnterpriseSite").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20210101preview:HcxEnterpriseSite").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20210601:HcxEnterpriseSite").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20211201:HcxEnterpriseSite").build())
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
    public static HcxEnterpriseSite get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HcxEnterpriseSite(name, id, options);
    }
}

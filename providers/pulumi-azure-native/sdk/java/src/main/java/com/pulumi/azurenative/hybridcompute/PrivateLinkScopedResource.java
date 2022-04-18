// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hybridcompute.PrivateLinkScopedResourceArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A private link scoped resource
 * API Version: 2020-08-15-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridcompute:PrivateLinkScopedResource scoped-resource-name /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/myResourceGroup/providers/Microsoft.HybridCompute/privateLinkScopes/myPrivateLinkScope/scopedResources/scoped-resource-name 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridcompute:PrivateLinkScopedResource")
public class PrivateLinkScopedResource extends com.pulumi.resources.CustomResource {
    /**
     * The resource id of the scoped Azure monitor resource.
     * 
     */
    @Export(name="linkedResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkedResourceId;

    /**
     * @return The resource id of the scoped Azure monitor resource.
     * 
     */
    public Output</* @Nullable */ String> linkedResourceId() {
        return this.linkedResourceId;
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
     * State of the private endpoint connection.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the private endpoint connection.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkScopedResource(String name) {
        this(name, PrivateLinkScopedResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkScopedResource(String name, PrivateLinkScopedResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkScopedResource(String name, PrivateLinkScopedResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:PrivateLinkScopedResource", name, args == null ? PrivateLinkScopedResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkScopedResource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:PrivateLinkScopedResource", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20200815preview:PrivateLinkScopedResource").build())
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
    public static PrivateLinkScopedResource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkScopedResource(name, id, options);
    }
}

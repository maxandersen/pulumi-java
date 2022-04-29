// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.operationalinsights.LinkedServiceArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The top level Linked service resource container.
 * API Version: 2020-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:LinkedService TestLinkWS/Cluster /subscriptions/00000000-0000-0000-0000-00000000000/resourcegroups/mms-eus/providers/microsoft.operationalinsights/workspaces/testlinkws/linkedservices/cluster 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:LinkedService")
public class LinkedService extends CustomResource {
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
     * The provisioning state of the linked service.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning state of the linked service.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
     */
    public Output<Optional<String>> resourceId() {
        return Codegen.optional(this.resourceId);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
     */
    @Export(name="writeAccessResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> writeAccessResourceId;

    /**
     * @return The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
     */
    public Output<Optional<String>> writeAccessResourceId() {
        return Codegen.optional(this.writeAccessResourceId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedService(String name) {
        this(name, LinkedServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedService(String name, LinkedServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedService(String name, LinkedServiceArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:operationalinsights:LinkedService", name, args == null ? LinkedServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedService(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:operationalinsights:LinkedService", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20151101preview:LinkedService").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20190801preview:LinkedService").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20200301preview:LinkedService").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20200801:LinkedService").build())
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
    public static LinkedService get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new LinkedService(name, id, options);
    }
}

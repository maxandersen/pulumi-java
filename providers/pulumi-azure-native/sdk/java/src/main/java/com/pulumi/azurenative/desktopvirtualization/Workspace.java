// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.desktopvirtualization.WorkspaceArgs;
import com.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseIdentity;
import com.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponsePlan;
import com.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseSku;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a Workspace definition.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:desktopvirtualization:Workspace workspace1 /subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/workspaces/workspace1 
 * ```
 * 
 */
@ResourceType(type="azure-native:desktopvirtualization:Workspace")
public class Workspace extends com.pulumi.resources.CustomResource {
    /**
     * List of applicationGroup resource Ids.
     * 
     */
    @Export(name="applicationGroupReferences", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> applicationGroupReferences;

    /**
     * @return List of applicationGroup resource Ids.
     * 
     */
    public Output</* @Nullable */ List<String>> applicationGroupReferences() {
        return this.applicationGroupReferences;
    }
    /**
     * Is cloud pc resource.
     * 
     */
    @Export(name="cloudPcResource", type=Boolean.class, parameters={})
    private Output<Boolean> cloudPcResource;

    /**
     * @return Is cloud pc resource.
     * 
     */
    public Output<Boolean> cloudPcResource() {
        return this.cloudPcResource;
    }
    /**
     * Description of Workspace.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of Workspace.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Friendly name of Workspace.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly name of Workspace.
     * 
     */
    public Output</* @Nullable */ String> friendlyName() {
        return this.friendlyName;
    }
    @Export(name="identity", type=ResourceModelWithAllowedPropertySetResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseIdentity> identity;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseIdentity> identity() {
        return this.identity;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    @Export(name="managedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedBy;

    /**
     * @return The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    public Output</* @Nullable */ String> managedBy() {
        return this.managedBy;
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
     * ObjectId of Workspace. (internal use)
     * 
     */
    @Export(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    /**
     * @return ObjectId of Workspace. (internal use)
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }
    @Export(name="plan", type=ResourceModelWithAllowedPropertySetResponsePlan.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponsePlan> plan;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponsePlan> plan() {
        return this.plan;
    }
    @Export(name="sku", type=ResourceModelWithAllowedPropertySetResponseSku.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseSku> sku;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseSku> sku() {
        return this.sku;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
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
    public Workspace(String name) {
        this(name, WorkspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workspace(String name, WorkspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workspace(String name, WorkspaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workspace(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Workspace", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20190123preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20190924preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20191210preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20200921preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201019preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201102preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201110preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210114preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210201preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210309preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210401preview:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210712:Workspace").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210903preview:Workspace").build())
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
    public static Workspace get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, options);
    }
}

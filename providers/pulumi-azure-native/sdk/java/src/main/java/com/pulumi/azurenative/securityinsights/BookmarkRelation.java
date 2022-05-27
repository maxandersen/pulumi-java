// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityinsights.BookmarkRelationArgs;
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
 * Represents a relation between two resources
 * API Version: 2019-01-01-preview.
 * 
 * ## Example Usage
 * ### Creates or updates a bookmark relation.
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var bookmarkRelation = new BookmarkRelation(&#34;bookmarkRelation&#34;, BookmarkRelationArgs.builder()        
 *             .bookmarkId(&#34;2216d0e1-91e3-4902-89fd-d2df8c535096&#34;)
 *             .operationalInsightsResourceProvider(&#34;Microsoft.OperationalInsights&#34;)
 *             .relatedResourceId(&#34;/subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/incidents/afbd324f-6c48-459c-8710-8d1e1cd03812&#34;)
 *             .relationName(&#34;4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014&#34;)
 *             .resourceGroupName(&#34;myRg&#34;)
 *             .workspaceName(&#34;myWorkspace&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:BookmarkRelation 4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/bookmarks/2216d0e1-91e3-4902-89fd-d2df8c535096/relations/4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:BookmarkRelation")
public class BookmarkRelation extends com.pulumi.resources.CustomResource {
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the related resource
     * 
     */
    @Export(name="relatedResourceId", type=String.class, parameters={})
    private Output<String> relatedResourceId;

    /**
     * @return The resource ID of the related resource
     * 
     */
    public Output<String> relatedResourceId() {
        return this.relatedResourceId;
    }
    /**
     * The resource kind of the related resource
     * 
     */
    @Export(name="relatedResourceKind", type=String.class, parameters={})
    private Output<String> relatedResourceKind;

    /**
     * @return The resource kind of the related resource
     * 
     */
    public Output<String> relatedResourceKind() {
        return this.relatedResourceKind;
    }
    /**
     * The name of the related resource
     * 
     */
    @Export(name="relatedResourceName", type=String.class, parameters={})
    private Output<String> relatedResourceName;

    /**
     * @return The name of the related resource
     * 
     */
    public Output<String> relatedResourceName() {
        return this.relatedResourceName;
    }
    /**
     * The resource type of the related resource
     * 
     */
    @Export(name="relatedResourceType", type=String.class, parameters={})
    private Output<String> relatedResourceType;

    /**
     * @return The resource type of the related resource
     * 
     */
    public Output<String> relatedResourceType() {
        return this.relatedResourceType;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BookmarkRelation(String name) {
        this(name, BookmarkRelationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BookmarkRelation(String name, BookmarkRelationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BookmarkRelation(String name, BookmarkRelationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:BookmarkRelation", name, args == null ? BookmarkRelationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BookmarkRelation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:BookmarkRelation", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:BookmarkRelation").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:BookmarkRelation").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20211001preview:BookmarkRelation").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20220101preview:BookmarkRelation").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20220401preview:BookmarkRelation").build())
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
    public static BookmarkRelation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BookmarkRelation(name, id, options);
    }
}

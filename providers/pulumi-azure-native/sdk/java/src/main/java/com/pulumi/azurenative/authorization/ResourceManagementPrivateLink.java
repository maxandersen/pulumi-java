// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.authorization.ResourceManagementPrivateLinkArgs;
import com.pulumi.azurenative.authorization.outputs.ResourceManagementPrivateLinkEndpointConnectionsResponse;
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
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * ### Create Resource Management Private Link.
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
 *         var resourceManagementPrivateLink = new ResourceManagementPrivateLink(&#34;resourceManagementPrivateLink&#34;, ResourceManagementPrivateLinkArgs.builder()        
 *             .location(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;my-resource-group&#34;)
 *             .rmplName(&#34;my-rmplName&#34;)
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
 * $ pulumi import azure-native:authorization:ResourceManagementPrivateLink my-pla 00000000-0000-0000-0000-000000000000 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:ResourceManagementPrivateLink")
public class ResourceManagementPrivateLink extends com.pulumi.resources.CustomResource {
    /**
     * the region of the rmpl
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return the region of the rmpl
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The rmpl Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The rmpl Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="properties", type=ResourceManagementPrivateLinkEndpointConnectionsResponse.class, parameters={})
    private Output<ResourceManagementPrivateLinkEndpointConnectionsResponse> properties;

    public Output<ResourceManagementPrivateLinkEndpointConnectionsResponse> properties() {
        return this.properties;
    }
    /**
     * The operation type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The operation type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceManagementPrivateLink(String name) {
        this(name, ResourceManagementPrivateLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceManagementPrivateLink(String name, ResourceManagementPrivateLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceManagementPrivateLink(String name, ResourceManagementPrivateLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ResourceManagementPrivateLink", name, args == null ? ResourceManagementPrivateLinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceManagementPrivateLink(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ResourceManagementPrivateLink", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:authorization/v20200501:ResourceManagementPrivateLink").build())
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
    public static ResourceManagementPrivateLink get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceManagementPrivateLink(name, id, options);
    }
}

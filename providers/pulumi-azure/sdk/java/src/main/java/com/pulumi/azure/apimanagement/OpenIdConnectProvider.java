// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.OpenIdConnectProviderArgs;
import com.pulumi.azure.apimanagement.inputs.OpenIdConnectProviderState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an OpenID Connect Provider within a API Management Service.
 * 
 * ## Example Usage
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .publisherName(&#34;My Company&#34;)
 *             .publisherEmail(&#34;company@exmaple.com&#34;)
 *             .skuName(&#34;Developer_1&#34;)
 *             .build());
 * 
 *         var exampleOpenIdConnectProvider = new OpenIdConnectProvider(&#34;exampleOpenIdConnectProvider&#34;, OpenIdConnectProviderArgs.builder()        
 *             .apiManagementName(exampleService.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .clientId(&#34;00001111-2222-3333-4444-555566667777&#34;)
 *             .displayName(&#34;Example Provider&#34;)
 *             .metadataEndpoint(&#34;https://example.com/example&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management OpenID Connect Providers can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/openIdConnectProvider:OpenIdConnectProvider example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/openidConnectProviders/provider1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/openIdConnectProvider:OpenIdConnectProvider")
public class OpenIdConnectProvider extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API Management Service in which this OpenID Connect Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", type=String.class, parameters={})
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which this OpenID Connect Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * The Client ID used for the Client Application.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The Client ID used for the Client Application.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * The Client Secret used for the Client Application.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return The Client Secret used for the Client Application.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * A description of this OpenID Connect Provider.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this OpenID Connect Provider.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A user-friendly name for this OpenID Connect Provider.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A user-friendly name for this OpenID Connect Provider.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The URI of the Metadata endpoint.
     * 
     */
    @Export(name="metadataEndpoint", type=String.class, parameters={})
    private Output<String> metadataEndpoint;

    /**
     * @return The URI of the Metadata endpoint.
     * 
     */
    public Output<String> metadataEndpoint() {
        return this.metadataEndpoint;
    }
    /**
     * the Name of the OpenID Connect Provider which should be created within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return the Name of the OpenID Connect Provider which should be created within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpenIdConnectProvider(String name) {
        this(name, OpenIdConnectProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpenIdConnectProvider(String name, OpenIdConnectProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpenIdConnectProvider(String name, OpenIdConnectProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/openIdConnectProvider:OpenIdConnectProvider", name, args == null ? OpenIdConnectProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpenIdConnectProvider(String name, Output<String> id, @Nullable OpenIdConnectProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/openIdConnectProvider:OpenIdConnectProvider", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OpenIdConnectProvider get(String name, Output<String> id, @Nullable OpenIdConnectProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OpenIdConnectProvider(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.BackendArgs;
import com.pulumi.azure.apimanagement.inputs.BackendState;
import com.pulumi.azure.apimanagement.outputs.BackendCredentials;
import com.pulumi.azure.apimanagement.outputs.BackendProxy;
import com.pulumi.azure.apimanagement.outputs.BackendServiceFabricCluster;
import com.pulumi.azure.apimanagement.outputs.BackendTls;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a backend within an API Management Service.
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
 *         var exampleBackend = new Backend(&#34;exampleBackend&#34;, BackendArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .apiManagementName(exampleService.getName())
 *             .protocol(&#34;http&#34;)
 *             .url(&#34;https://backend&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management backends can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/backend:Backend example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/backends/backend1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/backend:Backend")
public class Backend extends com.pulumi.resources.CustomResource {
    /**
     * The Name of the API Management Service where this backend should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", type=String.class, parameters={})
    private Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where this backend should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * A `credentials` block as documented below.
     * 
     */
    @Export(name="credentials", type=BackendCredentials.class, parameters={})
    private Output</* @Nullable */ BackendCredentials> credentials;

    /**
     * @return A `credentials` block as documented below.
     * 
     */
    public Output<Optional<BackendCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The description of the backend.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the backend.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the API Management backend. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the API Management backend. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The protocol used by the backend host. Possible values are `http` or `soap`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol used by the backend host. Possible values are `http` or `soap`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * A `proxy` block as documented below.
     * 
     */
    @Export(name="proxy", type=BackendProxy.class, parameters={})
    private Output</* @Nullable */ BackendProxy> proxy;

    /**
     * @return A `proxy` block as documented below.
     * 
     */
    public Output<Optional<BackendProxy>> proxy() {
        return Codegen.optional(this.proxy);
    }
    /**
     * The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The management URI of the backend host in an external system. This URI can be the ARM Resource ID of Logic Apps, Function Apps or API Apps, or the management endpoint of a Service Fabric cluster.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The management URI of the backend host in an external system. This URI can be the ARM Resource ID of Logic Apps, Function Apps or API Apps, or the management endpoint of a Service Fabric cluster.
     * 
     */
    public Output<Optional<String>> resourceId() {
        return Codegen.optional(this.resourceId);
    }
    /**
     * A `service_fabric_cluster` block as documented below.
     * 
     */
    @Export(name="serviceFabricCluster", type=BackendServiceFabricCluster.class, parameters={})
    private Output</* @Nullable */ BackendServiceFabricCluster> serviceFabricCluster;

    /**
     * @return A `service_fabric_cluster` block as documented below.
     * 
     */
    public Output<Optional<BackendServiceFabricCluster>> serviceFabricCluster() {
        return Codegen.optional(this.serviceFabricCluster);
    }
    /**
     * The title of the backend.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output</* @Nullable */ String> title;

    /**
     * @return The title of the backend.
     * 
     */
    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }
    /**
     * A `tls` block as documented below.
     * 
     */
    @Export(name="tls", type=BackendTls.class, parameters={})
    private Output</* @Nullable */ BackendTls> tls;

    /**
     * @return A `tls` block as documented below.
     * 
     */
    public Output<Optional<BackendTls>> tls() {
        return Codegen.optional(this.tls);
    }
    /**
     * The URL of the backend host.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL of the backend host.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Backend(String name) {
        this(name, BackendArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Backend(String name, BackendArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backend(String name, BackendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/backend:Backend", name, args == null ? BackendArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Backend(String name, Output<String> id, @Nullable BackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/backend:Backend", name, state, makeResourceOptions(options, id));
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
    public static Backend get(String name, Output<String> id, @Nullable BackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Backend(name, id, state, options);
    }
}

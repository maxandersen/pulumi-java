// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.analysisservices;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.analysisservices.ServerArgs;
import com.pulumi.azure.analysisservices.inputs.ServerState;
import com.pulumi.azure.analysisservices.outputs.ServerIpv4FirewallRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Analysis Services Server.
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
 *         var rg = new ResourceGroup(&#34;rg&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var server = new Server(&#34;server&#34;, ServerArgs.builder()        
 *             .location(&#34;northeurope&#34;)
 *             .resourceGroupName(rg.getName())
 *             .sku(&#34;S0&#34;)
 *             .adminUsers(&#34;myuser@domain.tld&#34;)
 *             .enablePowerBiService(true)
 *             .ipv4FirewallRules(ServerIpv4FirewallRule.builder()
 *                 .name(&#34;myRule1&#34;)
 *                 .rangeStart(&#34;210.117.252.0&#34;)
 *                 .rangeEnd(&#34;210.117.252.255&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;abc&#34;, 123))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * &gt; **NOTE:** The server resource will automatically be started and stopped during an update if it is in `paused` state.
 * 
 * ## Import
 * 
 * Analysis Services Server can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:analysisservices/server:Server server /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AnalysisServices/servers/server1
 * ```
 * 
 */
@ResourceType(type="azure:analysisservices/server:Server")
public class Server extends com.pulumi.resources.CustomResource {
    /**
     * List of email addresses of admin users.
     * 
     */
    @Export(name="adminUsers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> adminUsers;

    /**
     * @return List of email addresses of admin users.
     * 
     */
    public Output<Optional<List<String>>> adminUsers() {
        return Codegen.optional(this.adminUsers);
    }
    /**
     * URI and SAS token for a blob container to store backups.
     * 
     */
    @Export(name="backupBlobContainerUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupBlobContainerUri;

    /**
     * @return URI and SAS token for a blob container to store backups.
     * 
     */
    public Output<Optional<String>> backupBlobContainerUri() {
        return Codegen.optional(this.backupBlobContainerUri);
    }
    /**
     * Indicates if the Power BI service is allowed to access or not.
     * 
     */
    @Export(name="enablePowerBiService", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePowerBiService;

    /**
     * @return Indicates if the Power BI service is allowed to access or not.
     * 
     */
    public Output<Optional<Boolean>> enablePowerBiService() {
        return Codegen.optional(this.enablePowerBiService);
    }
    /**
     * One or more `ipv4_firewall_rule` block(s) as defined below.
     * 
     */
    @Export(name="ipv4FirewallRules", type=List.class, parameters={ServerIpv4FirewallRule.class})
    private Output</* @Nullable */ List<ServerIpv4FirewallRule>> ipv4FirewallRules;

    /**
     * @return One or more `ipv4_firewall_rule` block(s) as defined below.
     * 
     */
    public Output<Optional<List<ServerIpv4FirewallRule>>> ipv4FirewallRules() {
        return Codegen.optional(this.ipv4FirewallRules);
    }
    /**
     * The Azure location where the Analysis Services Server exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure location where the Analysis Services Server exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the firewall rule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the firewall rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Controls how the read-write server is used in the query pool. If this value is set to `All` then read-write servers are also used for queries. Otherwise with `ReadOnly` these servers do not participate in query operations.
     * 
     */
    @Export(name="querypoolConnectionMode", type=String.class, parameters={})
    private Output<String> querypoolConnectionMode;

    /**
     * @return Controls how the read-write server is used in the query pool. If this value is set to `All` then read-write servers are also used for queries. Otherwise with `ReadOnly` these servers do not participate in query operations.
     * 
     */
    public Output<String> querypoolConnectionMode() {
        return this.querypoolConnectionMode;
    }
    /**
     * The name of the Resource Group in which the Analysis Services Server should be exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Analysis Services Server should be exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The full name of the Analysis Services Server.
     * 
     */
    @Export(name="serverFullName", type=String.class, parameters={})
    private Output<String> serverFullName;

    /**
     * @return The full name of the Analysis Services Server.
     * 
     */
    public Output<String> serverFullName() {
        return this.serverFullName;
    }
    /**
     * SKU for the Analysis Services Server. Possible values are: `D1`, `B1`, `B2`, `S0`, `S1`, `S2`, `S4`, `S8`, `S9`, `S8v2` and `S9v2`.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output<String> sku;

    /**
     * @return SKU for the Analysis Services Server. Possible values are: `D1`, `B1`, `B2`, `S0`, `S1`, `S2`, `S4`, `S8`, `S9`, `S8v2` and `S9v2`.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Server(String name) {
        this(name, ServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Server(String name, ServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Server(String name, ServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:analysisservices/server:Server", name, args == null ? ServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Server(String name, Output<String> id, @Nullable ServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:analysisservices/server:Server", name, state, makeResourceOptions(options, id));
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
    public static Server get(String name, Output<String> id, @Nullable ServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Server(name, id, state, options);
    }
}

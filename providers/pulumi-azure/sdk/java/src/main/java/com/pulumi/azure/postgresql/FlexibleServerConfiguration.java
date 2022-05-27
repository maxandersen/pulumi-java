// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.postgresql.FlexibleServerConfigurationArgs;
import com.pulumi.azure.postgresql.inputs.FlexibleServerConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Sets a PostgreSQL Configuration value on a Azure PostgreSQL Flexible Server.
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
 *         var exampleFlexibleServer = new FlexibleServer(&#34;exampleFlexibleServer&#34;, FlexibleServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .version(&#34;12&#34;)
 *             .administratorLogin(&#34;psqladmin&#34;)
 *             .administratorPassword(&#34;H@Sh1CoR3!&#34;)
 *             .storageMb(32768)
 *             .skuName(&#34;GP_Standard_D4s_v3&#34;)
 *             .build());
 * 
 *         var exampleFlexibleServerConfiguration = new FlexibleServerConfiguration(&#34;exampleFlexibleServerConfiguration&#34;, FlexibleServerConfigurationArgs.builder()        
 *             .serverId(exampleFlexibleServer.getId())
 *             .value(&#34;on&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * PostgreSQL Configurations can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforPostgreSQL/flexibleServers/server1/configurations/configuration1
 * ```
 * 
 */
@ResourceType(type="azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration")
public class FlexibleServerConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlexibleServerConfiguration(String name) {
        this(name, FlexibleServerConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlexibleServerConfiguration(String name, FlexibleServerConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlexibleServerConfiguration(String name, FlexibleServerConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration", name, args == null ? FlexibleServerConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlexibleServerConfiguration(String name, Output<String> id, @Nullable FlexibleServerConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration", name, state, makeResourceOptions(options, id));
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
    public static FlexibleServerConfiguration get(String name, Output<String> id, @Nullable FlexibleServerConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlexibleServerConfiguration(name, id, state, options);
    }
}

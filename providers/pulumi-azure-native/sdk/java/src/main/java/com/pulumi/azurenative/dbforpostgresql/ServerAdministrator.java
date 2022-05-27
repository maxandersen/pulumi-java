// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dbforpostgresql.ServerAdministratorArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a and external administrator to be created.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * ### ServerAdministratorCreate
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
 *         var serverAdministrator = new ServerAdministrator(&#34;serverAdministrator&#34;, ServerAdministratorArgs.builder()        
 *             .administratorType(&#34;ActiveDirectory&#34;)
 *             .login(&#34;bob@contoso.com&#34;)
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .serverName(&#34;pgtestsvc4&#34;)
 *             .sid(&#34;c6b82b90-a647-49cb-8a62-0d2d3cb7ac7c&#34;)
 *             .tenantId(&#34;c6b82b90-a647-49cb-8a62-0d2d3cb7ac7c&#34;)
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
 * $ pulumi import azure-native:dbforpostgresql:ServerAdministrator activeDirectory /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforPostgreSQL/servers/pgtestsvc4/administrators/activeDirectory 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbforpostgresql:ServerAdministrator")
public class ServerAdministrator extends com.pulumi.resources.CustomResource {
    /**
     * The type of administrator.
     * 
     */
    @Export(name="administratorType", type=String.class, parameters={})
    private Output<String> administratorType;

    /**
     * @return The type of administrator.
     * 
     */
    public Output<String> administratorType() {
        return this.administratorType;
    }
    /**
     * The server administrator login account name.
     * 
     */
    @Export(name="login", type=String.class, parameters={})
    private Output<String> login;

    /**
     * @return The server administrator login account name.
     * 
     */
    public Output<String> login() {
        return this.login;
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
     * The server administrator Sid (Secure ID).
     * 
     */
    @Export(name="sid", type=String.class, parameters={})
    private Output<String> sid;

    /**
     * @return The server administrator Sid (Secure ID).
     * 
     */
    public Output<String> sid() {
        return this.sid;
    }
    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The server Active Directory Administrator tenant id.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerAdministrator(String name) {
        this(name, ServerAdministratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerAdministrator(String name, ServerAdministratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerAdministrator(String name, ServerAdministratorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:ServerAdministrator", name, args == null ? ServerAdministratorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerAdministrator(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:ServerAdministrator", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20171201:ServerAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20171201preview:ServerAdministrator").build())
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
    public static ServerAdministrator get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerAdministrator(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dbforpostgresql.ServerKeyArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A PostgreSQL Server key.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbforpostgresql:ServerKey omeVault_someKey_01234567890123456789012345678901 /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforPostgreSQL/servers/testserver/keys/someVault_someKey_01234567890123456789012345678901 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbforpostgresql:ServerKey")
public class ServerKey extends com.pulumi.resources.CustomResource {
    /**
     * The key creation date.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The key creation date.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * Kind of encryption protector used to protect the key.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of encryption protector used to protect the key.
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
     * The key type like 'AzureKeyVault'.
     * 
     */
    @Export(name="serverKeyType", type=String.class, parameters={})
    private Output<String> serverKeyType;

    /**
     * @return The key type like 'AzureKeyVault'.
     * 
     */
    public Output<String> serverKeyType() {
        return this.serverKeyType;
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
     * The URI of the key.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output</* @Nullable */ String> uri;

    /**
     * @return The URI of the key.
     * 
     */
    public Output</* @Nullable */ String> uri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerKey(String name) {
        this(name, ServerKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerKey(String name, ServerKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerKey(String name, ServerKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:ServerKey", name, args == null ? ServerKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerKey(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:ServerKey", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20200101:ServerKey").build()),
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20200101privatepreview:ServerKey").build())
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
    public static ServerKey get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerKey(name, id, options);
    }
}

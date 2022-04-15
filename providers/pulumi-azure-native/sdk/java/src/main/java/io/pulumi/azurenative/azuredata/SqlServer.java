// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azuredata.SqlServerArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A SQL server.
 * API Version: 2019-07-24-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azuredata:SqlServer testsqlserver /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.AzureData/SqlServerRegistrations/testsqlregistration/sqlServers/testsqlserver 
 * ```
 * 
 */
@ResourceType(type="azure-native:azuredata:SqlServer")
public class SqlServer extends io.pulumi.resources.CustomResource {
    /**
     * Cores of the Sql Server.
     * 
     */
    @Export(name="cores", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cores;

    /**
     * @return Cores of the Sql Server.
     * 
     */
    public Output</* @Nullable */ Integer> cores() {
        return this.cores;
    }
    /**
     * Sql Server Edition.
     * 
     */
    @Export(name="edition", type=String.class, parameters={})
    private Output</* @Nullable */ String> edition;

    /**
     * @return Sql Server Edition.
     * 
     */
    public Output</* @Nullable */ String> edition() {
        return this.edition;
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
     * Sql Server Json Property Bag.
     * 
     */
    @Export(name="propertyBag", type=String.class, parameters={})
    private Output</* @Nullable */ String> propertyBag;

    /**
     * @return Sql Server Json Property Bag.
     * 
     */
    public Output</* @Nullable */ String> propertyBag() {
        return this.propertyBag;
    }
    /**
     * ID for Parent Sql Server Registration.
     * 
     */
    @Export(name="registrationID", type=String.class, parameters={})
    private Output</* @Nullable */ String> registrationID;

    /**
     * @return ID for Parent Sql Server Registration.
     * 
     */
    public Output</* @Nullable */ String> registrationID() {
        return this.registrationID;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Version of the Sql Server.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Version of the Sql Server.
     * 
     */
    public Output</* @Nullable */ String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlServer(String name) {
        this(name, SqlServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlServer(String name, SqlServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlServer(String name, SqlServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azuredata:SqlServer", name, args == null ? SqlServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlServer(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azuredata:SqlServer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:azuredata/v20170301preview:SqlServer").build()),
                Output.of(Alias.builder().type("azure-native:azuredata/v20190724preview:SqlServer").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SqlServer get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlServer(name, id, options);
    }
}

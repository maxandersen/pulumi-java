// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.GeoBackupPolicyArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A database geo backup policy.
 * API Version: 2014-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:GeoBackupPolicy Default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-4799/providers/Microsoft.Sql/servers/sqlcrudtest-5961/databases/testdw/geoBackupPolicies/Default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:GeoBackupPolicy")
public class GeoBackupPolicy extends CustomResource {
    /**
     * Kind of geo backup policy.  This is metadata used for the Azure portal experience.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of geo backup policy.  This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Backup policy location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Backup policy location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The state of the geo backup policy.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the geo backup policy.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The storage type of the geo backup policy.
     * 
     */
    @Export(name="storageType", type=String.class, parameters={})
    private Output<String> storageType;

    /**
     * @return The storage type of the geo backup policy.
     * 
     */
    public Output<String> storageType() {
        return this.storageType;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GeoBackupPolicy(String name) {
        this(name, GeoBackupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GeoBackupPolicy(String name, GeoBackupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GeoBackupPolicy(String name, GeoBackupPolicyArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:GeoBackupPolicy", name, args == null ? GeoBackupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GeoBackupPolicy(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:GeoBackupPolicy", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20140401:GeoBackupPolicy").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GeoBackupPolicy get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new GeoBackupPolicy(name, id, options);
    }
}

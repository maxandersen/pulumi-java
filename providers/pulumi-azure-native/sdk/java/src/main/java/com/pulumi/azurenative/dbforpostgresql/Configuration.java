// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dbforpostgresql.ConfigurationArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a Configuration.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbforpostgresql:Configuration array_nulls /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.DBforPostgreSQL/servers/testserver/configurations/array_nulls 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbforpostgresql:Configuration")
public class Configuration extends CustomResource {
    /**
     * Allowed values of the configuration.
     * 
     */
    @Export(name="allowedValues", type=String.class, parameters={})
    private Output<String> allowedValues;

    /**
     * @return Allowed values of the configuration.
     * 
     */
    public Output<String> allowedValues() {
        return this.allowedValues;
    }
    /**
     * Data type of the configuration.
     * 
     */
    @Export(name="dataType", type=String.class, parameters={})
    private Output<String> dataType;

    /**
     * @return Data type of the configuration.
     * 
     */
    public Output<String> dataType() {
        return this.dataType;
    }
    /**
     * Default value of the configuration.
     * 
     */
    @Export(name="defaultValue", type=String.class, parameters={})
    private Output<String> defaultValue;

    /**
     * @return Default value of the configuration.
     * 
     */
    public Output<String> defaultValue() {
        return this.defaultValue;
    }
    /**
     * Description of the configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the configuration.
     * 
     */
    public Output<String> description() {
        return this.description;
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
     * Source of the configuration.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return Source of the configuration.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
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
     * Value of the configuration.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Value of the configuration.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Configuration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Configuration", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20171201:Configuration").build()),
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20171201preview:Configuration").build())
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
    public static Configuration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Configuration(name, id, options);
    }
}

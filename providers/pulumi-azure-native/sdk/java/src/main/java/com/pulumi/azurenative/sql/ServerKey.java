// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ServerKeyArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A server key.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerKey sqlcrudtest-4645 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-7398/providers/Microsoft.Sql/servers/sqlcrudtest-4645/keys/someVault_someKey_01234567890123456789012345678901 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerKey")
public class ServerKey extends CustomResource {
    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
     */
    @Export(name="autoRotationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> autoRotationEnabled;

    /**
     * @return Key auto rotation opt-in flag. Either true or false.
     * 
     */
    public Output<Boolean> autoRotationEnabled() {
        return this.autoRotationEnabled;
    }
    /**
     * The server key creation date.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The server key creation date.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
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
     * Subregion of the server key.
     * 
     */
    @Export(name="subregion", type=String.class, parameters={})
    private Output<String> subregion;

    /**
     * @return Subregion of the server key.
     * 
     */
    public Output<String> subregion() {
        return this.subregion;
    }
    /**
     * Thumbprint of the server key.
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    /**
     * @return Thumbprint of the server key.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
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
    public ServerKey(String name, ServerKeyArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:ServerKey", name, args == null ? ServerKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerKey(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:ServerKey", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:ServerKey").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:ServerKey").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:ServerKey").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:ServerKey").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:ServerKey").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ServerKey").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ServerKey").build())
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
    public static ServerKey get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ServerKey(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.subscription;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.subscription.AliasArgs;
import io.pulumi.azurenative.subscription.outputs.PutAliasResponsePropertiesResponse;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Subscription Information with the alias.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:subscription:Alias aliasForNewSub /providers/Microsoft.Subscription/aliases/aliasForNewSub 
 * ```
 * 
 */
@ResourceType(type="azure-native:subscription:Alias")
public class Alias extends io.pulumi.resources.CustomResource {
    /**
     * Alias ID.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Alias ID.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Put Alias response properties.
     * 
     */
    @Export(name="properties", type=PutAliasResponsePropertiesResponse.class, parameters={})
    private Output<PutAliasResponsePropertiesResponse> properties;

    /**
     * @return Put Alias response properties.
     * 
     */
    public Output<PutAliasResponsePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Resource type, Microsoft.Subscription/aliases.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type, Microsoft.Subscription/aliases.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:subscription:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alias(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:subscription:Alias", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(io.pulumi.core.Alias.builder().type("azure-native:subscription/v20191001preview:Alias").build()),
                Output.of(io.pulumi.core.Alias.builder().type("azure-native:subscription/v20200901:Alias").build()),
                Output.of(io.pulumi.core.Alias.builder().type("azure-native:subscription/v20211001:Alias").build())
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
    public static Alias get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, options);
    }
}

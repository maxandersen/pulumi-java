// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.providerhub.DefaultRolloutArgs;
import com.pulumi.azurenative.providerhub.outputs.DefaultRolloutResponseProperties;
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
 * Default rollout definition.
 * API Version: 2020-11-20.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:providerhub:DefaultRollout Microsoft.Contoso/2020week10 /subscriptions/ab7a8701-f7ef-471a-a2f4-d0ebbf494f77providers/Microsoft.ProviderHub/providerRegistrations/Microsoft.Contoso/defaultRollouts/2020week10 
 * ```
 * 
 */
@ResourceType(type="azure-native:providerhub:DefaultRollout")
public class DefaultRollout extends CustomResource {
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
     * Properties of the rollout.
     * 
     */
    @Export(name="properties", type=DefaultRolloutResponseProperties.class, parameters={})
    private Output<DefaultRolloutResponseProperties> properties;

    /**
     * @return Properties of the rollout.
     * 
     */
    public Output<DefaultRolloutResponseProperties> properties() {
        return this.properties;
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
    public DefaultRollout(String name) {
        this(name, DefaultRolloutArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultRollout(String name, DefaultRolloutArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultRollout(String name, DefaultRolloutArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:providerhub:DefaultRollout", name, args == null ? DefaultRolloutArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultRollout(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:providerhub:DefaultRollout", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:providerhub/v20201120:DefaultRollout").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210501preview:DefaultRollout").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210601preview:DefaultRollout").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210901preview:DefaultRollout").build())
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
    public static DefaultRollout get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DefaultRollout(name, id, options);
    }
}

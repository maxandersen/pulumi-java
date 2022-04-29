// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.peering.PrefixArgs;
import com.pulumi.azurenative.peering.outputs.PeeringServicePrefixEventResponse;
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
 * The peering service prefix class.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:peering:Prefix peeringServicePrefixName /subscriptions/subId/resourceGroups/rgName/providers/Microsoft.Peering/peeringServices/peeringServiceName/prefixes/peeringServicePrefixName 
 * ```
 * 
 */
@ResourceType(type="azure-native:peering:Prefix")
public class Prefix extends CustomResource {
    /**
     * The error message for validation state
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return The error message for validation state
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * The list of events for peering service prefix
     * 
     */
    @Export(name="events", type=List.class, parameters={PeeringServicePrefixEventResponse.class})
    private Output<List<PeeringServicePrefixEventResponse>> events;

    /**
     * @return The list of events for peering service prefix
     * 
     */
    public Output<List<PeeringServicePrefixEventResponse>> events() {
        return this.events;
    }
    /**
     * The prefix learned type
     * 
     */
    @Export(name="learnedType", type=String.class, parameters={})
    private Output<String> learnedType;

    /**
     * @return The prefix learned type
     * 
     */
    public Output<String> learnedType() {
        return this.learnedType;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The peering service prefix key
     * 
     */
    @Export(name="peeringServicePrefixKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringServicePrefixKey;

    /**
     * @return The peering service prefix key
     * 
     */
    public Output<Optional<String>> peeringServicePrefixKey() {
        return Codegen.optional(this.peeringServicePrefixKey);
    }
    /**
     * The prefix from which your traffic originates.
     * 
     */
    @Export(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return The prefix from which your traffic originates.
     * 
     */
    public Output<Optional<String>> prefix() {
        return Codegen.optional(this.prefix);
    }
    /**
     * The prefix validation state
     * 
     */
    @Export(name="prefixValidationState", type=String.class, parameters={})
    private Output<String> prefixValidationState;

    /**
     * @return The prefix validation state
     * 
     */
    public Output<String> prefixValidationState() {
        return this.prefixValidationState;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Prefix(String name) {
        this(name, PrefixArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Prefix(String name, PrefixArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Prefix(String name, PrefixArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:peering:Prefix", name, args == null ? PrefixArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Prefix(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:peering:Prefix", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:peering/v20190801preview:Prefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20190901preview:Prefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20200101preview:Prefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20200401:Prefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20201001:Prefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210101:Prefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210601:Prefix").build())
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
    public static Prefix get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Prefix(name, id, options);
    }
}

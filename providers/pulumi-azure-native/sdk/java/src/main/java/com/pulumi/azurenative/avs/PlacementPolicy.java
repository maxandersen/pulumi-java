// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.avs.PlacementPolicyArgs;
import com.pulumi.azurenative.avs.outputs.VmHostPlacementPolicyPropertiesResponse;
import com.pulumi.azurenative.avs.outputs.VmVmPlacementPolicyPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
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
 * A vSphere Distributed Resource Scheduler (DRS) placement policy
 * API Version: 2021-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:avs:PlacementPolicy policy1 /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/clusters/cluster1/placementPolicies/policy1 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:PlacementPolicy")
public class PlacementPolicy extends CustomResource {
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
     * placement policy properties
     * 
     */
    @Export(name="properties", type=Either.class, parameters={VmHostPlacementPolicyPropertiesResponse.class, VmVmPlacementPolicyPropertiesResponse.class})
    private Output<Either<VmHostPlacementPolicyPropertiesResponse,VmVmPlacementPolicyPropertiesResponse>> properties;

    /**
     * @return placement policy properties
     * 
     */
    public Output<Either<VmHostPlacementPolicyPropertiesResponse,VmVmPlacementPolicyPropertiesResponse>> properties() {
        return this.properties;
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
    public PlacementPolicy(String name) {
        this(name, PlacementPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlacementPolicy(String name, PlacementPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlacementPolicy(String name, PlacementPolicyArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:avs:PlacementPolicy", name, args == null ? PlacementPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PlacementPolicy(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:avs:PlacementPolicy", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:avs/v20211201:PlacementPolicy").build())
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
    public static PlacementPolicy get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new PlacementPolicy(name, id, options);
    }
}

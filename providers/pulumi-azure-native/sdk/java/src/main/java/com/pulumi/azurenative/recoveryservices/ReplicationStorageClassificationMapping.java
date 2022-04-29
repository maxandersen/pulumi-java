// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.recoveryservices.ReplicationStorageClassificationMappingArgs;
import com.pulumi.azurenative.recoveryservices.outputs.StorageClassificationMappingPropertiesResponse;
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
 * Storage mapping object.
 * API Version: 2018-07-10.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ReplicationStorageClassificationMapping testStorageMapping /Subscriptions/9112a37f-0f3e-46ec-9c00-060c6edca071/resourceGroups/resourceGroupPS1/providers/Microsoft.RecoveryServices/vaults/vault1/replicationFabrics/2a48e3770ac08aa2be8bfbd94fcfb1cbf2dcc487b78fb9d3bd778304441b06a0/replicationStorageClassifications/8891569e-aaef-4a46-a4a0-78c14f2d7b09/replicationStorageClassificationMappings/testStorageMapping 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ReplicationStorageClassificationMapping")
public class ReplicationStorageClassificationMapping extends CustomResource {
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of the storage mapping object.
     * 
     */
    @Export(name="properties", type=StorageClassificationMappingPropertiesResponse.class, parameters={})
    private Output<StorageClassificationMappingPropertiesResponse> properties;

    /**
     * @return Properties of the storage mapping object.
     * 
     */
    public Output<StorageClassificationMappingPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationStorageClassificationMapping(String name) {
        this(name, ReplicationStorageClassificationMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationStorageClassificationMapping(String name, ReplicationStorageClassificationMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationStorageClassificationMapping(String name, ReplicationStorageClassificationMappingArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationStorageClassificationMapping", name, args == null ? ReplicationStorageClassificationMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationStorageClassificationMapping(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationStorageClassificationMapping", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20160810:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180110:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180710:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211101:ReplicationStorageClassificationMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:ReplicationStorageClassificationMapping").build())
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
    public static ReplicationStorageClassificationMapping get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ReplicationStorageClassificationMapping(name, id, options);
    }
}

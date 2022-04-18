// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storsimple.VolumeArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The volume.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storsimple:Volume Volume1ForSDKTest /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/managers/ManagerForSDKTest1/devices/Device05ForSDKTest/volumeContainers/VolumeContainerForSDKTest/volumes/Volume1ForSDKTest 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:Volume")
public class Volume extends com.pulumi.resources.CustomResource {
    /**
     * The IDs of the access control records, associated with the volume.
     * 
     */
    @Export(name="accessControlRecordIds", type=List.class, parameters={String.class})
    private Output<List<String>> accessControlRecordIds;

    /**
     * @return The IDs of the access control records, associated with the volume.
     * 
     */
    public Output<List<String>> accessControlRecordIds() {
        return this.accessControlRecordIds;
    }
    /**
     * The IDs of the backup policies, in which this volume is part of.
     * 
     */
    @Export(name="backupPolicyIds", type=List.class, parameters={String.class})
    private Output<List<String>> backupPolicyIds;

    /**
     * @return The IDs of the backup policies, in which this volume is part of.
     * 
     */
    public Output<List<String>> backupPolicyIds() {
        return this.backupPolicyIds;
    }
    /**
     * The backup status of the volume.
     * 
     */
    @Export(name="backupStatus", type=String.class, parameters={})
    private Output<String> backupStatus;

    /**
     * @return The backup status of the volume.
     * 
     */
    public Output<String> backupStatus() {
        return this.backupStatus;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * The monitoring status of the volume.
     * 
     */
    @Export(name="monitoringStatus", type=String.class, parameters={})
    private Output<String> monitoringStatus;

    /**
     * @return The monitoring status of the volume.
     * 
     */
    public Output<String> monitoringStatus() {
        return this.monitoringStatus;
    }
    /**
     * The name of the object.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The operation status on the volume.
     * 
     */
    @Export(name="operationStatus", type=String.class, parameters={})
    private Output<String> operationStatus;

    /**
     * @return The operation status on the volume.
     * 
     */
    public Output<String> operationStatus() {
        return this.operationStatus;
    }
    /**
     * The size of the volume in bytes.
     * 
     */
    @Export(name="sizeInBytes", type=Double.class, parameters={})
    private Output<Double> sizeInBytes;

    /**
     * @return The size of the volume in bytes.
     * 
     */
    public Output<Double> sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The ID of the volume container, in which this volume is created.
     * 
     */
    @Export(name="volumeContainerId", type=String.class, parameters={})
    private Output<String> volumeContainerId;

    /**
     * @return The ID of the volume container, in which this volume is created.
     * 
     */
    public Output<String> volumeContainerId() {
        return this.volumeContainerId;
    }
    /**
     * The volume status.
     * 
     */
    @Export(name="volumeStatus", type=String.class, parameters={})
    private Output<String> volumeStatus;

    /**
     * @return The volume status.
     * 
     */
    public Output<String> volumeStatus() {
        return this.volumeStatus;
    }
    /**
     * The type of the volume.
     * 
     */
    @Export(name="volumeType", type=String.class, parameters={})
    private Output<String> volumeType;

    /**
     * @return The type of the volume.
     * 
     */
    public Output<String> volumeType() {
        return this.volumeType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Volume", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storsimple/v20170601:Volume").build())
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
    public static Volume get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, options);
    }
}

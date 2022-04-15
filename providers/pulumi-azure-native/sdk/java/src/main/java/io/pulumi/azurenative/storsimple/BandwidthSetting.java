// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.BandwidthSettingArgs;
import io.pulumi.azurenative.storsimple.outputs.BandwidthScheduleResponse;
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
 * The bandwidth setting.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storsimple:BandwidthSetting BWSForTest /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/managers/ManagerForSDKTest1/bandwidthSettings/BWSForTest 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:BandwidthSetting")
public class BandwidthSetting extends io.pulumi.resources.CustomResource {
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
     * The schedules.
     * 
     */
    @Export(name="schedules", type=List.class, parameters={BandwidthScheduleResponse.class})
    private Output<List<BandwidthScheduleResponse>> schedules;

    /**
     * @return The schedules.
     * 
     */
    public Output<List<BandwidthScheduleResponse>> schedules() {
        return this.schedules;
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
     * The number of volumes that uses the bandwidth setting.
     * 
     */
    @Export(name="volumeCount", type=Integer.class, parameters={})
    private Output<Integer> volumeCount;

    /**
     * @return The number of volumes that uses the bandwidth setting.
     * 
     */
    public Output<Integer> volumeCount() {
        return this.volumeCount;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BandwidthSetting(String name) {
        this(name, BandwidthSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BandwidthSetting(String name, BandwidthSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BandwidthSetting(String name, BandwidthSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BandwidthSetting", name, args == null ? BandwidthSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BandwidthSetting(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BandwidthSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storsimple/v20170601:BandwidthSetting").build())
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
    public static BandwidthSetting get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BandwidthSetting(name, id, options);
    }
}

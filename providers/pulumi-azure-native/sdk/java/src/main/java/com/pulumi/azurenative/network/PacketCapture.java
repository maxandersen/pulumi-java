// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.PacketCaptureArgs;
import com.pulumi.azurenative.network.outputs.PacketCaptureFilterResponse;
import com.pulumi.azurenative.network.outputs.PacketCaptureStorageLocationResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Information about packet capture session.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:PacketCapture pc1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkWatchers/nw1/packetCaptures/pc1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PacketCapture")
public class PacketCapture extends CustomResource {
    /**
     * Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     */
    @Export(name="bytesToCapturePerPacket", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> bytesToCapturePerPacket;

    /**
     * @return Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     */
    public Output<Optional<Double>> bytesToCapturePerPacket() {
        return Codegen.optional(this.bytesToCapturePerPacket);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * A list of packet capture filters.
     * 
     */
    @Export(name="filters", type=List.class, parameters={PacketCaptureFilterResponse.class})
    private Output</* @Nullable */ List<PacketCaptureFilterResponse>> filters;

    /**
     * @return A list of packet capture filters.
     * 
     */
    public Output<Optional<List<PacketCaptureFilterResponse>>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * Name of the packet capture session.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the packet capture session.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the packet capture session.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the packet capture session.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The storage location for a packet capture session.
     * 
     */
    @Export(name="storageLocation", type=PacketCaptureStorageLocationResponse.class, parameters={})
    private Output<PacketCaptureStorageLocationResponse> storageLocation;

    /**
     * @return The storage location for a packet capture session.
     * 
     */
    public Output<PacketCaptureStorageLocationResponse> storageLocation() {
        return this.storageLocation;
    }
    /**
     * The ID of the targeted resource, only VM is currently supported.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output<String> target;

    /**
     * @return The ID of the targeted resource, only VM is currently supported.
     * 
     */
    public Output<String> target() {
        return this.target;
    }
    /**
     * Maximum duration of the capture session in seconds.
     * 
     */
    @Export(name="timeLimitInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeLimitInSeconds;

    /**
     * @return Maximum duration of the capture session in seconds.
     * 
     */
    public Output<Optional<Integer>> timeLimitInSeconds() {
        return Codegen.optional(this.timeLimitInSeconds);
    }
    /**
     * Maximum size of the capture output.
     * 
     */
    @Export(name="totalBytesPerSession", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> totalBytesPerSession;

    /**
     * @return Maximum size of the capture output.
     * 
     */
    public Output<Optional<Double>> totalBytesPerSession() {
        return Codegen.optional(this.totalBytesPerSession);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PacketCapture(String name) {
        this(name, PacketCaptureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PacketCapture(String name, PacketCaptureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PacketCapture(String name, PacketCaptureArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:network:PacketCapture", name, args == null ? PacketCaptureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PacketCapture(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:network:PacketCapture", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20160901:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:PacketCapture").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:PacketCapture").build())
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
    public static PacketCapture get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new PacketCapture(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.AvailabilitySetArgs;
import com.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import com.pulumi.azurenative.compute.outputs.SkuResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Manage the availability of virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:AvailabilitySet myAvailabilitySet /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/availabilitySets/myAvailabilitySet 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:AvailabilitySet")
public class AvailabilitySet extends CustomResource {
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Fault Domain count.
     * 
     */
    @Export(name="platformFaultDomainCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomainCount;

    /**
     * @return Fault Domain count.
     * 
     */
    public Output<Optional<Integer>> platformFaultDomainCount() {
        return Codegen.optional(this.platformFaultDomainCount);
    }
    /**
     * Update Domain count.
     * 
     */
    @Export(name="platformUpdateDomainCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformUpdateDomainCount;

    /**
     * @return Update Domain count.
     * 
     */
    public Output<Optional<Integer>> platformUpdateDomainCount() {
        return Codegen.optional(this.platformUpdateDomainCount);
    }
    /**
     * Specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     */
    @Export(name="proximityPlacementGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> proximityPlacementGroup;

    /**
     * @return Specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     */
    public Output<Optional<SubResourceResponse>> proximityPlacementGroup() {
        return Codegen.optional(this.proximityPlacementGroup);
    }
    /**
     * Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use &#39;Aligned&#39; for virtual machines with managed disks and &#39;Classic&#39; for virtual machines with unmanaged disks. Default value is &#39;Classic&#39;.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use &#39;Aligned&#39; for virtual machines with managed disks and &#39;Classic&#39; for virtual machines with unmanaged disks. Default value is &#39;Classic&#39;.
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * The resource status information.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={InstanceViewStatusResponse.class})
    private Output<List<InstanceViewStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<InstanceViewStatusResponse>> statuses() {
        return this.statuses;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A list of references to all virtual machines in the availability set.
     * 
     */
    @Export(name="virtualMachines", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> virtualMachines;

    /**
     * @return A list of references to all virtual machines in the availability set.
     * 
     */
    public Output<Optional<List<SubResourceResponse>>> virtualMachines() {
        return Codegen.optional(this.virtualMachines);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AvailabilitySet(String name) {
        this(name, AvailabilitySetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AvailabilitySet(String name, AvailabilitySetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AvailabilitySet(String name, AvailabilitySetArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:compute:AvailabilitySet", name, args == null ? AvailabilitySetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AvailabilitySet(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:compute:AvailabilitySet", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20150615:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20160330:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20160430preview:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20170330:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20171201:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180401:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180601:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20181001:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190301:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200601:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:AvailabilitySet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:AvailabilitySet").build())
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
    public static AvailabilitySet get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new AvailabilitySet(name, id, options);
    }
}

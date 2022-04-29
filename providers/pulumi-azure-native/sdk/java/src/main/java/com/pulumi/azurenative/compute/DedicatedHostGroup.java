// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.DedicatedHostGroupArgs;
import com.pulumi.azurenative.compute.outputs.DedicatedHostGroupInstanceViewResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Specifies information about the dedicated host group that the dedicated hosts should be assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated host can only be added to a dedicated host group at creation time. An existing dedicated host cannot be added to another dedicated host group.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:DedicatedHostGroup myDedicatedHostGroup /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/HostGroups/myDedicatedHostGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:DedicatedHostGroup")
public class DedicatedHostGroup extends CustomResource {
    /**
     * A list of references to all dedicated hosts in the dedicated host group.
     * 
     */
    @Export(name="hosts", type=List.class, parameters={SubResourceReadOnlyResponse.class})
    private Output<List<SubResourceReadOnlyResponse>> hosts;

    /**
     * @return A list of references to all dedicated hosts in the dedicated host group.
     * 
     */
    public Output<List<SubResourceReadOnlyResponse>> hosts() {
        return this.hosts;
    }
    /**
     * The dedicated host group instance view, which has the list of instance view of the dedicated hosts under the dedicated host group.
     * 
     */
    @Export(name="instanceView", type=DedicatedHostGroupInstanceViewResponse.class, parameters={})
    private Output<DedicatedHostGroupInstanceViewResponse> instanceView;

    /**
     * @return The dedicated host group instance view, which has the list of instance view of the dedicated hosts under the dedicated host group.
     * 
     */
    public Output<DedicatedHostGroupInstanceViewResponse> instanceView() {
        return this.instanceView;
    }
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
     * Number of fault domains that the host group can span.
     * 
     */
    @Export(name="platformFaultDomainCount", type=Integer.class, parameters={})
    private Output<Integer> platformFaultDomainCount;

    /**
     * @return Number of fault domains that the host group can span.
     * 
     */
    public Output<Integer> platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }
    /**
     * Specifies whether virtual machines or virtual machine scale sets can be placed automatically on the dedicated host group. Automatic placement means resources are allocated on dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to &#39;false&#39; when not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     * 
     */
    @Export(name="supportAutomaticPlacement", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> supportAutomaticPlacement;

    /**
     * @return Specifies whether virtual machines or virtual machine scale sets can be placed automatically on the dedicated host group. Automatic placement means resources are allocated on dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to &#39;false&#39; when not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     * 
     */
    public Output<Optional<Boolean>> supportAutomaticPlacement() {
        return Codegen.optional(this.supportAutomaticPlacement);
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
     * Availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the group to be in the same zone.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the group to be in the same zone.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedHostGroup(String name) {
        this(name, DedicatedHostGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedHostGroup(String name, DedicatedHostGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedHostGroup(String name, DedicatedHostGroupArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:compute:DedicatedHostGroup", name, args == null ? DedicatedHostGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedHostGroup(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:compute:DedicatedHostGroup", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20190301:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200601:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:DedicatedHostGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:DedicatedHostGroup").build())
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
    public static DedicatedHostGroup get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DedicatedHostGroup(name, id, options);
    }
}

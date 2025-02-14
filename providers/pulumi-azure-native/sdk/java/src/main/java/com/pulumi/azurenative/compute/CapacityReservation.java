// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.CapacityReservationArgs;
import com.pulumi.azurenative.compute.outputs.CapacityReservationInstanceViewResponse;
import com.pulumi.azurenative.compute.outputs.SkuResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Specifies information about the capacity reservation.
 * API Version: 2021-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:CapacityReservation myCapacityReservation /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/capacityReservationGroups/myCapacityReservationGroup/capacityReservations/myCapacityReservation 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:CapacityReservation")
public class CapacityReservation extends com.pulumi.resources.CustomResource {
    /**
     * The Capacity reservation instance view.
     * 
     */
    @Export(name="instanceView", type=CapacityReservationInstanceViewResponse.class, parameters={})
    private Output<CapacityReservationInstanceViewResponse> instanceView;

    /**
     * @return The Capacity reservation instance view.
     * 
     */
    public Output<CapacityReservationInstanceViewResponse> instanceView() {
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
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The date time when the capacity reservation was last updated.
     * 
     */
    @Export(name="provisioningTime", type=String.class, parameters={})
    private Output<String> provisioningTime;

    /**
     * @return The date time when the capacity reservation was last updated.
     * 
     */
    public Output<String> provisioningTime() {
        return this.provisioningTime;
    }
    /**
     * A unique id generated and assigned to the capacity reservation by the platform which does not change throughout the lifetime of the resource.
     * 
     */
    @Export(name="reservationId", type=String.class, parameters={})
    private Output<String> reservationId;

    /**
     * @return A unique id generated and assigned to the capacity reservation by the platform which does not change throughout the lifetime of the resource.
     * 
     */
    public Output<String> reservationId() {
        return this.reservationId;
    }
    /**
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set. Currently VM Skus with the capability called &#39;CapacityReservationSupported&#39; set to true are supported. Refer to List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set. Currently VM Skus with the capability called &#39;CapacityReservationSupported&#39; set to true are supported. Refer to List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
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
     * A list of all virtual machine resource ids that are associated with the capacity reservation.
     * 
     */
    @Export(name="virtualMachinesAssociated", type=List.class, parameters={SubResourceReadOnlyResponse.class})
    private Output<List<SubResourceReadOnlyResponse>> virtualMachinesAssociated;

    /**
     * @return A list of all virtual machine resource ids that are associated with the capacity reservation.
     * 
     */
    public Output<List<SubResourceReadOnlyResponse>> virtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }
    /**
     * Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part for the list of zones specified during the capacity reservation group creation. The zone can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part for the list of zones specified during the capacity reservation group creation. The zone can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityReservation(String name) {
        this(name, CapacityReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityReservation(String name, CapacityReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityReservation(String name, CapacityReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:CapacityReservation", name, args == null ? CapacityReservationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CapacityReservation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:CapacityReservation", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20210401:CapacityReservation").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:CapacityReservation").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:CapacityReservation").build())
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
    public static CapacityReservation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CapacityReservation(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databoxedge;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.databoxedge.OrderArgs;
import com.pulumi.azure.databoxedge.inputs.OrderState;
import com.pulumi.azure.databoxedge.outputs.OrderContact;
import com.pulumi.azure.databoxedge.outputs.OrderReturnTracking;
import com.pulumi.azure.databoxedge.outputs.OrderShipmentAddress;
import com.pulumi.azure.databoxedge.outputs.OrderShipmentHistory;
import com.pulumi.azure.databoxedge.outputs.OrderShipmentTracking;
import com.pulumi.azure.databoxedge.outputs.OrderStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Databox Edge Order.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleDevice = new Device(&#34;exampleDevice&#34;, DeviceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .skuName(&#34;EdgeP_Base-Standard&#34;)
 *             .build());
 * 
 *         var exampleOrder = new Order(&#34;exampleOrder&#34;, OrderArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .deviceName(exampleDevice.getName())
 *             .contact(OrderContact.builder()
 *                 .companyName(&#34;Contoso Corporation&#34;)
 *                 .name(&#34;Bart&#34;)
 *                 .emailLists(&#34;bart@example.com&#34;)
 *                 .phone(&#34;(800) 867-5309&#34;)
 *                 .build())
 *             .shipmentAddress(OrderShipmentAddress.builder()
 *                 .addresses(&#34;740 Evergreen Terrace&#34;)
 *                 .city(&#34;Springfield&#34;)
 *                 .country(&#34;United States&#34;)
 *                 .postalCode(&#34;97403&#34;)
 *                 .state(&#34;OR&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Databox Edge Orders can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:databoxedge/order:Order example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/device1/orders/default
 * ```
 * 
 */
@ResourceType(type="azure:databoxedge/order:Order")
public class Order extends com.pulumi.resources.CustomResource {
    /**
     * A `contact` block as defined below.
     * 
     */
    @Export(name="contact", type=OrderContact.class, parameters={})
    private Output<OrderContact> contact;

    /**
     * @return A `contact` block as defined below.
     * 
     */
    public Output<OrderContact> contact() {
        return this.contact;
    }
    /**
     * The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    @Export(name="deviceName", type=String.class, parameters={})
    private Output<String> deviceName;

    /**
     * @return The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }
    /**
     * The contact person name. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The contact person name. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Tracking information for the package returned from the customer whether it has an original or a replacement device. A `return_tracking` block as defined below.
     * 
     */
    @Export(name="returnTrackings", type=List.class, parameters={OrderReturnTracking.class})
    private Output<List<OrderReturnTracking>> returnTrackings;

    /**
     * @return Tracking information for the package returned from the customer whether it has an original or a replacement device. A `return_tracking` block as defined below.
     * 
     */
    public Output<List<OrderReturnTracking>> returnTrackings() {
        return this.returnTrackings;
    }
    /**
     * Serial number of the device being tracked.
     * 
     */
    @Export(name="serialNumber", type=String.class, parameters={})
    private Output<String> serialNumber;

    /**
     * @return Serial number of the device being tracked.
     * 
     */
    public Output<String> serialNumber() {
        return this.serialNumber;
    }
    /**
     * A `shipment_address block as defined below.
     * 
     */
    @Export(name="shipmentAddress", type=OrderShipmentAddress.class, parameters={})
    private Output<OrderShipmentAddress> shipmentAddress;

    /**
     * @return A `shipment_address block as defined below.
     * 
     */
    public Output<OrderShipmentAddress> shipmentAddress() {
        return this.shipmentAddress;
    }
    /**
     * List of status changes in the order. A `shipment_history` block as defined below.
     * 
     */
    @Export(name="shipmentHistories", type=List.class, parameters={OrderShipmentHistory.class})
    private Output<List<OrderShipmentHistory>> shipmentHistories;

    /**
     * @return List of status changes in the order. A `shipment_history` block as defined below.
     * 
     */
    public Output<List<OrderShipmentHistory>> shipmentHistories() {
        return this.shipmentHistories;
    }
    /**
     * Tracking information for the package delivered to the customer whether it has an original or a replacement device. A `shipment_tracking` block as defined below.
     * 
     */
    @Export(name="shipmentTrackings", type=List.class, parameters={OrderShipmentTracking.class})
    private Output<List<OrderShipmentTracking>> shipmentTrackings;

    /**
     * @return Tracking information for the package delivered to the customer whether it has an original or a replacement device. A `shipment_tracking` block as defined below.
     * 
     */
    public Output<List<OrderShipmentTracking>> shipmentTrackings() {
        return this.shipmentTrackings;
    }
    /**
     * The current status of the order. A `status` block as defined below.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={OrderStatus.class})
    private Output<List<OrderStatus>> statuses;

    /**
     * @return The current status of the order. A `status` block as defined below.
     * 
     */
    public Output<List<OrderStatus>> statuses() {
        return this.statuses;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Order(String name) {
        this(name, OrderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Order(String name, OrderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Order(String name, OrderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:databoxedge/order:Order", name, args == null ? OrderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Order(String name, Output<String> id, @Nullable OrderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:databoxedge/order:Order", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Order get(String name, Output<String> id, @Nullable OrderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Order(name, id, state, options);
    }
}

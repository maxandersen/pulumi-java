// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.OrchestratedVirtualMachineScaleSetArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetState;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepair;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetBootDiagnostics;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetDataDisk;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetExtension;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetIdentity;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetNetworkInterface;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetOsDisk;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetOsProfile;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetPlan;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetSourceImageReference;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetTerminationNotification;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Orchestrated Virtual Machine Scale Set.
 * 
 * ## Disclaimers
 * 
 * &gt; **NOTE:** As of the **v2.86.0** (November 19, 2021) release of the provider this resource will only create Virtual Machine Scale Sets with the **Flexible** Orchestration Mode.
 * 
 * &gt; **NOTE:** All arguments including the administrator login and password will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
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
 *         var exampleOrchestratedVirtualMachineScaleSet = new OrchestratedVirtualMachineScaleSet(&#34;exampleOrchestratedVirtualMachineScaleSet&#34;, OrchestratedVirtualMachineScaleSetArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .platformFaultDomainCount(1)
 *             .zones(&#34;1&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * An Orchestrated Virtual Machine Scale Set can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/orchestratedVirtualMachineScaleSet:OrchestratedVirtualMachineScaleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/Microsoft.Compute/virtualMachineScaleSets/scaleset1
 * ```
 * 
 */
@ResourceType(type="azure:compute/orchestratedVirtualMachineScaleSet:OrchestratedVirtualMachineScaleSet")
public class OrchestratedVirtualMachineScaleSet extends com.pulumi.resources.CustomResource {
    @Export(name="automaticInstanceRepair", type=OrchestratedVirtualMachineScaleSetAutomaticInstanceRepair.class, parameters={})
    private Output<OrchestratedVirtualMachineScaleSetAutomaticInstanceRepair> automaticInstanceRepair;

    public Output<OrchestratedVirtualMachineScaleSetAutomaticInstanceRepair> automaticInstanceRepair() {
        return this.automaticInstanceRepair;
    }
    @Export(name="bootDiagnostics", type=OrchestratedVirtualMachineScaleSetBootDiagnostics.class, parameters={})
    private Output</* @Nullable */ OrchestratedVirtualMachineScaleSetBootDiagnostics> bootDiagnostics;

    public Output<Optional<OrchestratedVirtualMachineScaleSetBootDiagnostics>> bootDiagnostics() {
        return Codegen.optional(this.bootDiagnostics);
    }
    @Export(name="dataDisks", type=List.class, parameters={OrchestratedVirtualMachineScaleSetDataDisk.class})
    private Output</* @Nullable */ List<OrchestratedVirtualMachineScaleSetDataDisk>> dataDisks;

    public Output<Optional<List<OrchestratedVirtualMachineScaleSetDataDisk>>> dataDisks() {
        return Codegen.optional(this.dataDisks);
    }
    @Export(name="encryptionAtHostEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encryptionAtHostEnabled;

    public Output<Optional<Boolean>> encryptionAtHostEnabled() {
        return Codegen.optional(this.encryptionAtHostEnabled);
    }
    @Export(name="evictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> evictionPolicy;

    public Output<Optional<String>> evictionPolicy() {
        return Codegen.optional(this.evictionPolicy);
    }
    @Export(name="extensions", type=List.class, parameters={OrchestratedVirtualMachineScaleSetExtension.class})
    private Output<List<OrchestratedVirtualMachineScaleSetExtension>> extensions;

    public Output<List<OrchestratedVirtualMachineScaleSetExtension>> extensions() {
        return this.extensions;
    }
    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M).
     * 
     */
    @Export(name="extensionsTimeBudget", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionsTimeBudget;

    /**
     * @return Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M).
     * 
     */
    public Output<Optional<String>> extensionsTimeBudget() {
        return Codegen.optional(this.extensionsTimeBudget);
    }
    @Export(name="identity", type=OrchestratedVirtualMachineScaleSetIdentity.class, parameters={})
    private Output</* @Nullable */ OrchestratedVirtualMachineScaleSetIdentity> identity;

    public Output<Optional<OrchestratedVirtualMachineScaleSetIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The number of Virtual Machines in the Orcestrated Virtual Machine Scale Set.
     * 
     */
    @Export(name="instances", type=Integer.class, parameters={})
    private Output<Integer> instances;

    /**
     * @return The number of Virtual Machines in the Orcestrated Virtual Machine Scale Set.
     * 
     */
    public Output<Integer> instances() {
        return this.instances;
    }
    @Export(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    public Output<Optional<String>> licenseType() {
        return Codegen.optional(this.licenseType);
    }
    /**
     * The Azure location where the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure location where the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    @Export(name="maxBidPrice", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxBidPrice;

    public Output<Optional<Double>> maxBidPrice() {
        return Codegen.optional(this.maxBidPrice);
    }
    /**
     * The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="networkInterfaces", type=List.class, parameters={OrchestratedVirtualMachineScaleSetNetworkInterface.class})
    private Output</* @Nullable */ List<OrchestratedVirtualMachineScaleSetNetworkInterface>> networkInterfaces;

    public Output<Optional<List<OrchestratedVirtualMachineScaleSetNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    @Export(name="osDisk", type=OrchestratedVirtualMachineScaleSetOsDisk.class, parameters={})
    private Output</* @Nullable */ OrchestratedVirtualMachineScaleSetOsDisk> osDisk;

    public Output<Optional<OrchestratedVirtualMachineScaleSetOsDisk>> osDisk() {
        return Codegen.optional(this.osDisk);
    }
    @Export(name="osProfile", type=OrchestratedVirtualMachineScaleSetOsProfile.class, parameters={})
    private Output</* @Nullable */ OrchestratedVirtualMachineScaleSetOsProfile> osProfile;

    public Output<Optional<OrchestratedVirtualMachineScaleSetOsProfile>> osProfile() {
        return Codegen.optional(this.osProfile);
    }
    @Export(name="plan", type=OrchestratedVirtualMachineScaleSetPlan.class, parameters={})
    private Output</* @Nullable */ OrchestratedVirtualMachineScaleSetPlan> plan;

    public Output<Optional<OrchestratedVirtualMachineScaleSetPlan>> plan() {
        return Codegen.optional(this.plan);
    }
    /**
     * Specifies the number of fault domains that are used by this Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="platformFaultDomainCount", type=Integer.class, parameters={})
    private Output<Integer> platformFaultDomainCount;

    /**
     * @return Specifies the number of fault domains that are used by this Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }
    @Export(name="priority", type=String.class, parameters={})
    private Output</* @Nullable */ String> priority;

    public Output<Optional<String>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The ID of the Proximity Placement Group which the Orchestrated Virtual Machine should be assigned to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="proximityPlacementGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> proximityPlacementGroupId;

    /**
     * @return The ID of the Proximity Placement Group which the Orchestrated Virtual Machine should be assigned to. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> proximityPlacementGroupId() {
        return Codegen.optional(this.proximityPlacementGroupId);
    }
    /**
     * The name of the Resource Group in which the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    @Export(name="skuName", type=String.class, parameters={})
    private Output</* @Nullable */ String> skuName;

    public Output<Optional<String>> skuName() {
        return Codegen.optional(this.skuName);
    }
    @Export(name="sourceImageId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceImageId;

    public Output<Optional<String>> sourceImageId() {
        return Codegen.optional(this.sourceImageId);
    }
    /**
     * A `source_image_reference` block as defined below.
     * 
     */
    @Export(name="sourceImageReference", type=OrchestratedVirtualMachineScaleSetSourceImageReference.class, parameters={})
    private Output</* @Nullable */ OrchestratedVirtualMachineScaleSetSourceImageReference> sourceImageReference;

    /**
     * @return A `source_image_reference` block as defined below.
     * 
     */
    public Output<Optional<OrchestratedVirtualMachineScaleSetSourceImageReference>> sourceImageReference() {
        return Codegen.optional(this.sourceImageReference);
    }
    /**
     * A mapping of tags which should be assigned to this Orchestrated Virtual Machine Scale Set.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to this Orchestrated Virtual Machine Scale Set.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="terminationNotification", type=OrchestratedVirtualMachineScaleSetTerminationNotification.class, parameters={})
    private Output<OrchestratedVirtualMachineScaleSetTerminationNotification> terminationNotification;

    public Output<OrchestratedVirtualMachineScaleSetTerminationNotification> terminationNotification() {
        return this.terminationNotification;
    }
    /**
     * The Unique ID for the Orchestrated Virtual Machine Scale Set.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return The Unique ID for the Orchestrated Virtual Machine Scale Set.
     * 
     */
    public Output<String> uniqueId() {
        return this.uniqueId;
    }
    @Export(name="zoneBalance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneBalance;

    public Output<Optional<Boolean>> zoneBalance() {
        return Codegen.optional(this.zoneBalance);
    }
    /**
     * Specifies a list of Availability Zones in which this Orchestrated Virtual Machine should be located. Changing this forces a new Orchestrated Virtual Machine to be created.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Orchestrated Virtual Machine should be located. Changing this forces a new Orchestrated Virtual Machine to be created.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrchestratedVirtualMachineScaleSet(String name) {
        this(name, OrchestratedVirtualMachineScaleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrchestratedVirtualMachineScaleSet(String name, OrchestratedVirtualMachineScaleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrchestratedVirtualMachineScaleSet(String name, OrchestratedVirtualMachineScaleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/orchestratedVirtualMachineScaleSet:OrchestratedVirtualMachineScaleSet", name, args == null ? OrchestratedVirtualMachineScaleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrchestratedVirtualMachineScaleSet(String name, Output<String> id, @Nullable OrchestratedVirtualMachineScaleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/orchestratedVirtualMachineScaleSet:OrchestratedVirtualMachineScaleSet", name, state, makeResourceOptions(options, id));
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
    public static OrchestratedVirtualMachineScaleSet get(String name, Output<String> id, @Nullable OrchestratedVirtualMachineScaleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrchestratedVirtualMachineScaleSet(name, id, state, options);
    }
}

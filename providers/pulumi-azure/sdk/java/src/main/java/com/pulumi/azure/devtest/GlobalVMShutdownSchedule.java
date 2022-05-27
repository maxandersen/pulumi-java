// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs;
import com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleState;
import com.pulumi.azure.devtest.outputs.GlobalVMShutdownScheduleNotificationSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages automated shutdown schedules for Azure VMs that are not within an Azure DevTest Lab. While this is part of the DevTest Labs service in Azure,
 * this resource applies only to standard VMs, not DevTest Lab VMs. To manage automated shutdown schedules for DevTest Lab VMs, reference the
 * `azure.devtest.Schedule` resource
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
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .ipConfigurations(NetworkInterfaceIpConfiguration.builder()
 *                 .name(&#34;testconfiguration1&#34;)
 *                 .subnetId(exampleSubnet.getId())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleLinuxVirtualMachine = new LinuxVirtualMachine(&#34;exampleLinuxVirtualMachine&#34;, LinuxVirtualMachineArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .networkInterfaceIds(exampleNetworkInterface.getId())
 *             .size(&#34;Standard_B2s&#34;)
 *             .sourceImageReference(LinuxVirtualMachineSourceImageReference.builder()
 *                 .publisher(&#34;Canonical&#34;)
 *                 .offer(&#34;UbuntuServer&#34;)
 *                 .sku(&#34;16.04-LTS&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .osDisk(LinuxVirtualMachineOsDisk.builder()
 *                 .name(&#34;myosdisk-%d&#34;)
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .managedDiskType(&#34;Standard_LRS&#34;)
 *                 .build())
 *             .adminUsername(&#34;testadmin&#34;)
 *             .adminPassword(&#34;Password1234!&#34;)
 *             .disablePasswordAuthentication(false)
 *             .build());
 * 
 *         var exampleGlobalVMShutdownSchedule = new GlobalVMShutdownSchedule(&#34;exampleGlobalVMShutdownSchedule&#34;, GlobalVMShutdownScheduleArgs.builder()        
 *             .virtualMachineId(azurerm_virtual_machine.getExample().getId())
 *             .location(exampleResourceGroup.getLocation())
 *             .enabled(true)
 *             .dailyRecurrenceTime(&#34;1100&#34;)
 *             .timezone(&#34;Pacific Standard Time&#34;)
 *             .notificationSettings(GlobalVMShutdownScheduleNotificationSettings.builder()
 *                 .enabled(true)
 *                 .timeInMinutes(&#34;60&#34;)
 *                 .webhookUrl(&#34;https://sample-webhook-url.example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * An existing Dev Test Global Shutdown Schedule can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:devtest/globalVMShutdownSchedule:GlobalVMShutdownSchedule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/sample-rg/providers/Microsoft.DevTestLab/schedules/shutdown-computevm-SampleVM
 * ```
 * 
 *  The name of the resource within the `resource id` will always follow the format `shutdown-computevm-&lt;VM Name&gt;` where `&lt;VM Name&gt;` is replaced by the name of the target Virtual Machine
 * 
 */
@ResourceType(type="azure:devtest/globalVMShutdownSchedule:GlobalVMShutdownSchedule")
public class GlobalVMShutdownSchedule extends com.pulumi.resources.CustomResource {
    /**
     * The time each day when the schedule takes effect. Must match the format HHmm where HH is 00-23 and mm is 00-59 (e.g. 0930, 2300, etc.)
     * 
     */
    @Export(name="dailyRecurrenceTime", type=String.class, parameters={})
    private Output<String> dailyRecurrenceTime;

    /**
     * @return The time each day when the schedule takes effect. Must match the format HHmm where HH is 00-23 and mm is 00-59 (e.g. 0930, 2300, etc.)
     * 
     */
    public Output<String> dailyRecurrenceTime() {
        return this.dailyRecurrenceTime;
    }
    /**
     * Whether to enable the schedule. Possible values are `true` and `false`. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether to enable the schedule. Possible values are `true` and `false`. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The location where the schedule is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location where the schedule is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    @Export(name="notificationSettings", type=GlobalVMShutdownScheduleNotificationSettings.class, parameters={})
    private Output<GlobalVMShutdownScheduleNotificationSettings> notificationSettings;

    public Output<GlobalVMShutdownScheduleNotificationSettings> notificationSettings() {
        return this.notificationSettings;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The time zone ID (e.g. Pacific Standard time). Refer to this guide for a [full list of accepted time zone names](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
     * 
     */
    @Export(name="timezone", type=String.class, parameters={})
    private Output<String> timezone;

    /**
     * @return The time zone ID (e.g. Pacific Standard time). Refer to this guide for a [full list of accepted time zone names](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }
    /**
     * The resource ID of the target ARM-based Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualMachineId", type=String.class, parameters={})
    private Output<String> virtualMachineId;

    /**
     * @return The resource ID of the target ARM-based Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalVMShutdownSchedule(String name) {
        this(name, GlobalVMShutdownScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalVMShutdownSchedule(String name, GlobalVMShutdownScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalVMShutdownSchedule(String name, GlobalVMShutdownScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:devtest/globalVMShutdownSchedule:GlobalVMShutdownSchedule", name, args == null ? GlobalVMShutdownScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalVMShutdownSchedule(String name, Output<String> id, @Nullable GlobalVMShutdownScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:devtest/globalVMShutdownSchedule:GlobalVMShutdownSchedule", name, state, makeResourceOptions(options, id));
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
    public static GlobalVMShutdownSchedule get(String name, Output<String> id, @Nullable GlobalVMShutdownScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalVMShutdownSchedule(name, id, state, options);
    }
}

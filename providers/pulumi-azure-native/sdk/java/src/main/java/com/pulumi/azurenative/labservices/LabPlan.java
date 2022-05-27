// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.labservices.LabPlanArgs;
import com.pulumi.azurenative.labservices.outputs.AutoShutdownProfileResponse;
import com.pulumi.azurenative.labservices.outputs.ConnectionProfileResponse;
import com.pulumi.azurenative.labservices.outputs.LabPlanNetworkProfileResponse;
import com.pulumi.azurenative.labservices.outputs.SupportInfoResponse;
import com.pulumi.azurenative.labservices.outputs.SystemDataResponse;
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
 * Lab Plans act as a permission container for creating labs via labs.azure.com. Additionally, they can provide a set of default configurations that will apply at the time of creating a lab, but these defaults can still be overwritten.
 * API Version: 2021-10-01-preview.
 * 
 * ## Example Usage
 * ### putLabPlan
 * 
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
 *         var labPlan = new LabPlan(&#34;labPlan&#34;, LabPlanArgs.builder()        
 *             .defaultAutoShutdownProfile(Map.ofEntries(
 *                 Map.entry(&#34;disconnectDelay&#34;, &#34;00:05&#34;),
 *                 Map.entry(&#34;idleDelay&#34;, &#34;01:00&#34;),
 *                 Map.entry(&#34;noConnectDelay&#34;, &#34;01:00&#34;),
 *                 Map.entry(&#34;shutdownOnDisconnect&#34;, &#34;Enabled&#34;),
 *                 Map.entry(&#34;shutdownOnIdle&#34;, &#34;UserAbsence&#34;),
 *                 Map.entry(&#34;shutdownWhenNotConnected&#34;, &#34;Enabled&#34;)
 *             ))
 *             .defaultConnectionProfile(Map.ofEntries(
 *                 Map.entry(&#34;clientRdpAccess&#34;, &#34;Public&#34;),
 *                 Map.entry(&#34;clientSshAccess&#34;, &#34;Public&#34;),
 *                 Map.entry(&#34;webRdpAccess&#34;, &#34;None&#34;),
 *                 Map.entry(&#34;webSshAccess&#34;, &#34;None&#34;)
 *             ))
 *             .defaultNetworkProfile(Map.of(&#34;subnetId&#34;, &#34;/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/default&#34;))
 *             .labPlanName(&#34;testlabplan&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;testrg123&#34;)
 *             .sharedGalleryId(&#34;/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Compute/galleries/testsig&#34;)
 *             .supportInfo(Map.ofEntries(
 *                 Map.entry(&#34;email&#34;, &#34;help@contoso.com&#34;),
 *                 Map.entry(&#34;instructions&#34;, &#34;Contact support for help.&#34;),
 *                 Map.entry(&#34;phone&#34;, &#34;+1-202-555-0123&#34;),
 *                 Map.entry(&#34;url&#34;, &#34;help.contoso.com&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:LabPlan testlabplan /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.LabServices/labPlans/testlabplan 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:LabPlan")
public class LabPlan extends com.pulumi.resources.CustomResource {
    /**
     * The allowed regions for the lab creator to use when creating labs using this lab plan.
     * 
     */
    @Export(name="allowedRegions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedRegions;

    /**
     * @return The allowed regions for the lab creator to use when creating labs using this lab plan.
     * 
     */
    public Output<Optional<List<String>>> allowedRegions() {
        return Codegen.optional(this.allowedRegions);
    }
    /**
     * The default lab shutdown profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    @Export(name="defaultAutoShutdownProfile", type=AutoShutdownProfileResponse.class, parameters={})
    private Output</* @Nullable */ AutoShutdownProfileResponse> defaultAutoShutdownProfile;

    /**
     * @return The default lab shutdown profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    public Output<Optional<AutoShutdownProfileResponse>> defaultAutoShutdownProfile() {
        return Codegen.optional(this.defaultAutoShutdownProfile);
    }
    /**
     * The default lab connection profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    @Export(name="defaultConnectionProfile", type=ConnectionProfileResponse.class, parameters={})
    private Output</* @Nullable */ ConnectionProfileResponse> defaultConnectionProfile;

    /**
     * @return The default lab connection profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    public Output<Optional<ConnectionProfileResponse>> defaultConnectionProfile() {
        return Codegen.optional(this.defaultConnectionProfile);
    }
    /**
     * The lab plan network profile. To enforce lab network policies they must be defined here and cannot be changed when there are existing labs associated with this lab plan.
     * 
     */
    @Export(name="defaultNetworkProfile", type=LabPlanNetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ LabPlanNetworkProfileResponse> defaultNetworkProfile;

    /**
     * @return The lab plan network profile. To enforce lab network policies they must be defined here and cannot be changed when there are existing labs associated with this lab plan.
     * 
     */
    public Output<Optional<LabPlanNetworkProfileResponse>> defaultNetworkProfile() {
        return Codegen.optional(this.defaultNetworkProfile);
    }
    /**
     * Base Url of the lms instance this lab plan can link lab rosters against.
     * 
     */
    @Export(name="linkedLmsInstance", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkedLmsInstance;

    /**
     * @return Base Url of the lms instance this lab plan can link lab rosters against.
     * 
     */
    public Output<Optional<String>> linkedLmsInstance() {
        return Codegen.optional(this.linkedLmsInstance);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Current provisioning state of the lab plan.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current provisioning state of the lab plan.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource ID of the Shared Image Gallery attached to this lab plan. When saving a lab template virtual machine image it will be persisted in this gallery. Shared images from the gallery can be made available to use when creating new labs.
     * 
     */
    @Export(name="sharedGalleryId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedGalleryId;

    /**
     * @return Resource ID of the Shared Image Gallery attached to this lab plan. When saving a lab template virtual machine image it will be persisted in this gallery. Shared images from the gallery can be made available to use when creating new labs.
     * 
     */
    public Output<Optional<String>> sharedGalleryId() {
        return Codegen.optional(this.sharedGalleryId);
    }
    /**
     * Support contact information and instructions for users of the lab plan. This information is displayed to lab owners and virtual machine users for all labs in the lab plan.
     * 
     */
    @Export(name="supportInfo", type=SupportInfoResponse.class, parameters={})
    private Output</* @Nullable */ SupportInfoResponse> supportInfo;

    /**
     * @return Support contact information and instructions for users of the lab plan. This information is displayed to lab owners and virtual machine users for all labs in the lab plan.
     * 
     */
    public Output<Optional<SupportInfoResponse>> supportInfo() {
        return Codegen.optional(this.supportInfo);
    }
    /**
     * Metadata pertaining to creation and last modification of the lab plan.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the lab plan.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LabPlan(String name) {
        this(name, LabPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LabPlan(String name, LabPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LabPlan(String name, LabPlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:LabPlan", name, args == null ? LabPlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LabPlan(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:LabPlan", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:labservices/v20211001preview:LabPlan").build()),
                Output.of(Alias.builder().type("azure-native:labservices/v20211115preview:LabPlan").build())
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
    public static LabPlan get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LabPlan(name, id, options);
    }
}

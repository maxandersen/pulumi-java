// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.devtestlab.LabArgs;
import com.pulumi.azurenative.devtestlab.outputs.LabAnnouncementPropertiesResponse;
import com.pulumi.azurenative.devtestlab.outputs.LabSupportPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A lab.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devtestlab:Lab {labName} /subscriptions/{subscriptionId}/resourcegroups/resourceGroupName/providers/microsoft.devtestlab/labs/{labName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:Lab")
public class Lab extends com.pulumi.resources.CustomResource {
    /**
     * The properties of any lab announcement associated with this lab
     * 
     */
    @Export(name="announcement", type=LabAnnouncementPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LabAnnouncementPropertiesResponse> announcement;

    /**
     * @return The properties of any lab announcement associated with this lab
     * 
     */
    public Output</* @Nullable */ LabAnnouncementPropertiesResponse> announcement() {
        return this.announcement;
    }
    /**
     * The lab&#39;s artifact storage account.
     * 
     */
    @Export(name="artifactsStorageAccount", type=String.class, parameters={})
    private Output<String> artifactsStorageAccount;

    /**
     * @return The lab&#39;s artifact storage account.
     * 
     */
    public Output<String> artifactsStorageAccount() {
        return this.artifactsStorageAccount;
    }
    /**
     * The creation date of the lab.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the lab.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * The lab&#39;s default premium storage account.
     * 
     */
    @Export(name="defaultPremiumStorageAccount", type=String.class, parameters={})
    private Output<String> defaultPremiumStorageAccount;

    /**
     * @return The lab&#39;s default premium storage account.
     * 
     */
    public Output<String> defaultPremiumStorageAccount() {
        return this.defaultPremiumStorageAccount;
    }
    /**
     * The lab&#39;s default storage account.
     * 
     */
    @Export(name="defaultStorageAccount", type=String.class, parameters={})
    private Output<String> defaultStorageAccount;

    /**
     * @return The lab&#39;s default storage account.
     * 
     */
    public Output<String> defaultStorageAccount() {
        return this.defaultStorageAccount;
    }
    /**
     * The access rights to be granted to the user when provisioning an environment
     * 
     */
    @Export(name="environmentPermission", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentPermission;

    /**
     * @return The access rights to be granted to the user when provisioning an environment
     * 
     */
    public Output</* @Nullable */ String> environmentPermission() {
        return this.environmentPermission;
    }
    /**
     * Extended properties of the lab used for experimental features
     * 
     */
    @Export(name="extendedProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> extendedProperties;

    /**
     * @return Extended properties of the lab used for experimental features
     * 
     */
    public Output</* @Nullable */ Map<String,String>> extendedProperties() {
        return this.extendedProperties;
    }
    /**
     * Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
     */
    @Export(name="labStorageType", type=String.class, parameters={})
    private Output</* @Nullable */ String> labStorageType;

    /**
     * @return Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
     */
    public Output</* @Nullable */ String> labStorageType() {
        return this.labStorageType;
    }
    /**
     * The load balancer used to for lab VMs that use shared IP address.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The load balancer used to for lab VMs that use shared IP address.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * The location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @Export(name="mandatoryArtifactsResourceIdsLinux", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsLinux;

    /**
     * @return The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    public Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsLinux() {
        return this.mandatoryArtifactsResourceIdsLinux;
    }
    /**
     * The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @Export(name="mandatoryArtifactsResourceIdsWindows", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsWindows;

    /**
     * @return The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    public Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsWindows() {
        return this.mandatoryArtifactsResourceIdsWindows;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Network Security Group attached to the lab VMs Network interfaces to restrict open ports.
     * 
     */
    @Export(name="networkSecurityGroupId", type=String.class, parameters={})
    private Output<String> networkSecurityGroupId;

    /**
     * @return The Network Security Group attached to the lab VMs Network interfaces to restrict open ports.
     * 
     */
    public Output<String> networkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }
    /**
     * The lab&#39;s premium data disk storage account.
     * 
     */
    @Export(name="premiumDataDiskStorageAccount", type=String.class, parameters={})
    private Output<String> premiumDataDiskStorageAccount;

    /**
     * @return The lab&#39;s premium data disk storage account.
     * 
     */
    public Output<String> premiumDataDiskStorageAccount() {
        return this.premiumDataDiskStorageAccount;
    }
    /**
     * The setting to enable usage of premium data disks.
     * When its value is &#39;Enabled&#39;, creation of standard or premium data disks is allowed.
     * When its value is &#39;Disabled&#39;, only creation of standard data disks is allowed.
     * 
     */
    @Export(name="premiumDataDisks", type=String.class, parameters={})
    private Output</* @Nullable */ String> premiumDataDisks;

    /**
     * @return The setting to enable usage of premium data disks.
     * When its value is &#39;Enabled&#39;, creation of standard or premium data disks is allowed.
     * When its value is &#39;Disabled&#39;, only creation of standard data disks is allowed.
     * 
     */
    public Output</* @Nullable */ String> premiumDataDisks() {
        return this.premiumDataDisks;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The public IP address for the lab&#39;s load balancer.
     * 
     */
    @Export(name="publicIpId", type=String.class, parameters={})
    private Output<String> publicIpId;

    /**
     * @return The public IP address for the lab&#39;s load balancer.
     * 
     */
    public Output<String> publicIpId() {
        return this.publicIpId;
    }
    /**
     * The properties of any lab support message associated with this lab
     * 
     */
    @Export(name="support", type=LabSupportPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LabSupportPropertiesResponse> support;

    /**
     * @return The properties of any lab support message associated with this lab
     * 
     */
    public Output</* @Nullable */ LabSupportPropertiesResponse> support() {
        return this.support;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Export(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> uniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * The lab&#39;s Key vault.
     * 
     */
    @Export(name="vaultName", type=String.class, parameters={})
    private Output<String> vaultName;

    /**
     * @return The lab&#39;s Key vault.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }
    /**
     * The resource group in which all new lab virtual machines will be created. To let DevTest Labs manage resource group creation, set this value to null.
     * 
     */
    @Export(name="vmCreationResourceGroup", type=String.class, parameters={})
    private Output<String> vmCreationResourceGroup;

    /**
     * @return The resource group in which all new lab virtual machines will be created. To let DevTest Labs manage resource group creation, set this value to null.
     * 
     */
    public Output<String> vmCreationResourceGroup() {
        return this.vmCreationResourceGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lab(String name) {
        this(name, LabArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lab(String name, LabArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lab(String name, LabArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Lab", name, args == null ? LabArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Lab(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Lab", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:devtestlab/v20150521preview:Lab").build()),
                Output.of(Alias.builder().type("azure-native:devtestlab/v20160515:Lab").build()),
                Output.of(Alias.builder().type("azure-native:devtestlab/v20180915:Lab").build())
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
    public static Lab get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Lab(name, id, options);
    }
}

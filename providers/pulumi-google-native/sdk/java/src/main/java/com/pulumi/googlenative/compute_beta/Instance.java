// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_beta.InstanceArgs;
import com.pulumi.googlenative.compute_beta.outputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.compute_beta.outputs.AdvancedMachineFeaturesResponse;
import com.pulumi.googlenative.compute_beta.outputs.AttachedDiskResponse;
import com.pulumi.googlenative.compute_beta.outputs.ConfidentialInstanceConfigResponse;
import com.pulumi.googlenative.compute_beta.outputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute_beta.outputs.DisplayDeviceResponse;
import com.pulumi.googlenative.compute_beta.outputs.InstanceParamsResponse;
import com.pulumi.googlenative.compute_beta.outputs.MetadataResponse;
import com.pulumi.googlenative.compute_beta.outputs.NetworkInterfaceResponse;
import com.pulumi.googlenative.compute_beta.outputs.NetworkPerformanceConfigResponse;
import com.pulumi.googlenative.compute_beta.outputs.ReservationAffinityResponse;
import com.pulumi.googlenative.compute_beta.outputs.SchedulingResponse;
import com.pulumi.googlenative.compute_beta.outputs.ServiceAccountResponse;
import com.pulumi.googlenative.compute_beta.outputs.ShieldedInstanceConfigResponse;
import com.pulumi.googlenative.compute_beta.outputs.ShieldedInstanceIntegrityPolicyResponse;
import com.pulumi.googlenative.compute_beta.outputs.ShieldedVmConfigResponse;
import com.pulumi.googlenative.compute_beta.outputs.ShieldedVmIntegrityPolicyResponse;
import com.pulumi.googlenative.compute_beta.outputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an instance resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @Export(name="advancedMachineFeatures", type=AdvancedMachineFeaturesResponse.class, parameters={})
    private Output<AdvancedMachineFeaturesResponse> advancedMachineFeatures;

    /**
     * @return Controls for advanced machine-related behavior features.
     * 
     */
    public Output<AdvancedMachineFeaturesResponse> advancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding .
     * 
     */
    @Export(name="canIpForward", type=Boolean.class, parameters={})
    private Output<Boolean> canIpForward;

    /**
     * @return Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding .
     * 
     */
    public Output<Boolean> canIpForward() {
        return this.canIpForward;
    }
    @Export(name="confidentialInstanceConfig", type=ConfidentialInstanceConfigResponse.class, parameters={})
    private Output<ConfidentialInstanceConfigResponse> confidentialInstanceConfig;

    public Output<ConfidentialInstanceConfigResponse> confidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * The CPU platform used by this instance.
     * 
     */
    @Export(name="cpuPlatform", type=String.class, parameters={})
    private Output<String> cpuPlatform;

    /**
     * @return The CPU platform used by this instance.
     * 
     */
    public Output<String> cpuPlatform() {
        return this.cpuPlatform;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Whether the resource should be protected against deletion.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output<Boolean> deletionProtection;

    /**
     * @return Whether the resource should be protected against deletion.
     * 
     */
    public Output<Boolean> deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
     * 
     */
    @Export(name="disks", type=List.class, parameters={AttachedDiskResponse.class})
    private Output<List<AttachedDiskResponse>> disks;

    /**
     * @return Array of disks associated with this instance. Persistent disks must be created before you can assign them.
     * 
     */
    public Output<List<AttachedDiskResponse>> disks() {
        return this.disks;
    }
    /**
     * Enables display device for the instance.
     * 
     */
    @Export(name="displayDevice", type=DisplayDeviceResponse.class, parameters={})
    private Output<DisplayDeviceResponse> displayDevice;

    /**
     * @return Enables display device for the instance.
     * 
     */
    public Output<DisplayDeviceResponse> displayDevice() {
        return this.displayDevice;
    }
    /**
     * Specifies whether the disks restored from source snapshots or source machine image should erase Windows specific VSS signature.
     * 
     */
    @Export(name="eraseWindowsVssSignature", type=Boolean.class, parameters={})
    private Output<Boolean> eraseWindowsVssSignature;

    /**
     * @return Specifies whether the disks restored from source snapshots or source machine image should erase Windows specific VSS signature.
     * 
     */
    public Output<Boolean> eraseWindowsVssSignature() {
        return this.eraseWindowsVssSignature;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the instance&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance. You must always provide an up-to-date fingerprint hash in order to update the instance. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the instance&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance. You must always provide an up-to-date fingerprint hash in order to update the instance. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * A list of the type and count of accelerator cards attached to the instance.
     * 
     */
    @Export(name="guestAccelerators", type=List.class, parameters={AcceleratorConfigResponse.class})
    private Output<List<AcceleratorConfigResponse>> guestAccelerators;

    /**
     * @return A list of the type and count of accelerator cards attached to the instance.
     * 
     */
    public Output<List<AcceleratorConfigResponse>> guestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * Type of the resource. Always compute#instance for instances.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#instance for instances.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A fingerprint for this request, which is essentially a hash of the label&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for this request, which is essentially a hash of the label&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Last start timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastStartTimestamp", type=String.class, parameters={})
    private Output<String> lastStartTimestamp;

    /**
     * @return Last start timestamp in RFC3339 text format.
     * 
     */
    public Output<String> lastStartTimestamp() {
        return this.lastStartTimestamp;
    }
    /**
     * Last stop timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastStopTimestamp", type=String.class, parameters={})
    private Output<String> lastStopTimestamp;

    /**
     * @return Last stop timestamp in RFC3339 text format.
     * 
     */
    public Output<String> lastStopTimestamp() {
        return this.lastStopTimestamp;
    }
    /**
     * Last suspended timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastSuspendedTimestamp", type=String.class, parameters={})
    private Output<String> lastSuspendedTimestamp;

    /**
     * @return Last suspended timestamp in RFC3339 text format.
     * 
     */
    public Output<String> lastSuspendedTimestamp() {
        return this.lastSuspendedTimestamp;
    }
    /**
     * Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type: zones/us-central1-f/machineTypes/n1-standard-1 To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY For example: zones/us-central1-f/machineTypes/custom-4-5120 For a full list of restrictions, read the Specifications for custom machine types.
     * 
     */
    @Export(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type: zones/us-central1-f/machineTypes/n1-standard-1 To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY For example: zones/us-central1-f/machineTypes/custom-4-5120 For a full list of restrictions, read the Specifications for custom machine types.
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }
    /**
     * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
     * 
     */
    @Export(name="metadata", type=MetadataResponse.class, parameters={})
    private Output<MetadataResponse> metadata;

    /**
     * @return The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
     * 
     */
    public Output<MetadataResponse> metadata() {
        return this.metadata;
    }
    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;.
     * 
     */
    @Export(name="minCpuPlatform", type=String.class, parameters={})
    private Output<String> minCpuPlatform;

    /**
     * @return Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;.
     * 
     */
    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    /**
     * @return An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> networkInterfaces() {
        return this.networkInterfaces;
    }
    @Export(name="networkPerformanceConfig", type=NetworkPerformanceConfigResponse.class, parameters={})
    private Output<NetworkPerformanceConfigResponse> networkPerformanceConfig;

    public Output<NetworkPerformanceConfigResponse> networkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * Input only. [Input Only] Additional params passed with the request, but not persisted as part of resource payload.
     * 
     */
    @Export(name="params", type=InstanceParamsResponse.class, parameters={})
    private Output<InstanceParamsResponse> params;

    /**
     * @return Input only. [Input Only] Additional params passed with the request, but not persisted as part of resource payload.
     * 
     */
    public Output<InstanceParamsResponse> params() {
        return this.params;
    }
    /**
     * PostKeyRevocationActionType of the instance.
     * 
     */
    @Export(name="postKeyRevocationActionType", type=String.class, parameters={})
    private Output<String> postKeyRevocationActionType;

    /**
     * @return PostKeyRevocationActionType of the instance.
     * 
     */
    public Output<String> postKeyRevocationActionType() {
        return this.postKeyRevocationActionType;
    }
    /**
     * The private IPv6 google access type for the VM. If not specified, use INHERIT_FROM_SUBNETWORK as default.
     * 
     */
    @Export(name="privateIpv6GoogleAccess", type=String.class, parameters={})
    private Output<String> privateIpv6GoogleAccess;

    /**
     * @return The private IPv6 google access type for the VM. If not specified, use INHERIT_FROM_SUBNETWORK as default.
     * 
     */
    public Output<String> privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @Export(name="reservationAffinity", type=ReservationAffinityResponse.class, parameters={})
    private Output<ReservationAffinityResponse> reservationAffinity;

    /**
     * @return Specifies the reservations that this instance can consume from.
     * 
     */
    public Output<ReservationAffinityResponse> reservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * Resource policies applied to this instance.
     * 
     */
    @Export(name="resourcePolicies", type=List.class, parameters={String.class})
    private Output<List<String>> resourcePolicies;

    /**
     * @return Resource policies applied to this instance.
     * 
     */
    public Output<List<String>> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * Reserved for future use.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Sets the scheduling options for this instance.
     * 
     */
    @Export(name="scheduling", type=SchedulingResponse.class, parameters={})
    private Output<SchedulingResponse> scheduling;

    /**
     * @return Sets the scheduling options for this instance.
     * 
     */
    public Output<SchedulingResponse> scheduling() {
        return this.scheduling;
    }
    /**
     * Server-defined URL for this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported. Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
     * 
     */
    @Export(name="serviceAccounts", type=List.class, parameters={ServiceAccountResponse.class})
    private Output<List<ServiceAccountResponse>> serviceAccounts;

    /**
     * @return A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported. Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
     * 
     */
    public Output<List<ServiceAccountResponse>> serviceAccounts() {
        return this.serviceAccounts;
    }
    @Export(name="shieldedInstanceConfig", type=ShieldedInstanceConfigResponse.class, parameters={})
    private Output<ShieldedInstanceConfigResponse> shieldedInstanceConfig;

    public Output<ShieldedInstanceConfigResponse> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    @Export(name="shieldedInstanceIntegrityPolicy", type=ShieldedInstanceIntegrityPolicyResponse.class, parameters={})
    private Output<ShieldedInstanceIntegrityPolicyResponse> shieldedInstanceIntegrityPolicy;

    public Output<ShieldedInstanceIntegrityPolicyResponse> shieldedInstanceIntegrityPolicy() {
        return this.shieldedInstanceIntegrityPolicy;
    }
    /**
     * Deprecating, please use shielded_instance_config.
     * 
     */
    @Export(name="shieldedVmConfig", type=ShieldedVmConfigResponse.class, parameters={})
    private Output<ShieldedVmConfigResponse> shieldedVmConfig;

    /**
     * @return Deprecating, please use shielded_instance_config.
     * 
     */
    public Output<ShieldedVmConfigResponse> shieldedVmConfig() {
        return this.shieldedVmConfig;
    }
    /**
     * Deprecating, please use shielded_instance_integrity_policy.
     * 
     */
    @Export(name="shieldedVmIntegrityPolicy", type=ShieldedVmIntegrityPolicyResponse.class, parameters={})
    private Output<ShieldedVmIntegrityPolicyResponse> shieldedVmIntegrityPolicy;

    /**
     * @return Deprecating, please use shielded_instance_integrity_policy.
     * 
     */
    public Output<ShieldedVmIntegrityPolicyResponse> shieldedVmIntegrityPolicy() {
        return this.shieldedVmIntegrityPolicy;
    }
    /**
     * Source machine image
     * 
     */
    @Export(name="sourceMachineImage", type=String.class, parameters={})
    private Output<String> sourceMachineImage;

    /**
     * @return Source machine image
     * 
     */
    public Output<String> sourceMachineImage() {
        return this.sourceMachineImage;
    }
    /**
     * Source machine image encryption key when creating an instance from a machine image.
     * 
     */
    @Export(name="sourceMachineImageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceMachineImageEncryptionKey;

    /**
     * @return Source machine image encryption key when creating an instance from a machine image.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> sourceMachineImageEncryptionKey() {
        return this.sourceMachineImageEncryptionKey;
    }
    /**
     * Whether a VM has been restricted for start because Compute Engine has detected suspicious activity.
     * 
     */
    @Export(name="startRestricted", type=Boolean.class, parameters={})
    private Output<Boolean> startRestricted;

    /**
     * @return Whether a VM has been restricted for start because Compute Engine has detected suspicious activity.
     * 
     */
    public Output<Boolean> startRestricted() {
        return this.startRestricted;
    }
    /**
     * The status of the instance. One of the following values: PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see Instance life cycle.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the instance. One of the following values: PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see Instance life cycle.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * An optional, human-readable explanation of the status.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return An optional, human-readable explanation of the status.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the &#39;tags.items&#39; field.
     * 
     */
    @Export(name="tags", type=TagsResponse.class, parameters={})
    private Output<TagsResponse> tags;

    /**
     * @return Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the &#39;tags.items&#39; field.
     * 
     */
    public Output<TagsResponse> tags() {
        return this.tags;
    }
    /**
     * URL of the zone where the instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return URL of the zone where the instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, @Nullable InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, @Nullable InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Instance", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}

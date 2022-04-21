// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.compute_v1.inputs.MetadataResponse;
import com.pulumi.googlenative.compute_v1.inputs.NetworkInterfaceResponse;
import com.pulumi.googlenative.compute_v1.inputs.SavedAttachedDiskResponse;
import com.pulumi.googlenative.compute_v1.inputs.SchedulingResponse;
import com.pulumi.googlenative.compute_v1.inputs.ServiceAccountResponse;
import com.pulumi.googlenative.compute_v1.inputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * DEPRECATED: Please use compute#instanceProperties instead. New properties will not be added to this field.
 * 
 */
public final class SourceInstancePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceInstancePropertiesResponse Empty = new SourceInstancePropertiesResponse();

    /**
     * Enables instances created based on this machine image to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    @Import(name="canIpForward", required=true)
    private Boolean canIpForward;

    public Boolean canIpForward() {
        return this.canIpForward;
    }

    /**
     * Whether the instance created from this machine image should be protected against deletion.
     * 
     */
    @Import(name="deletionProtection", required=true)
    private Boolean deletionProtection;

    public Boolean deletionProtection() {
        return this.deletionProtection;
    }

    /**
     * An optional text description for the instances that are created from this machine image.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * An array of disks that are associated with the instances that are created from this machine image.
     * 
     */
    @Import(name="disks", required=true)
    private List<SavedAttachedDiskResponse> disks;

    public List<SavedAttachedDiskResponse> disks() {
        return this.disks;
    }

    /**
     * A list of guest accelerator cards&#39; type and count to use for instances created from this machine image.
     * 
     */
    @Import(name="guestAccelerators", required=true)
    private List<AcceleratorConfigResponse> guestAccelerators;

    public List<AcceleratorConfigResponse> guestAccelerators() {
        return this.guestAccelerators;
    }

    /**
     * Labels to apply to instances that are created from this machine image.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The machine type to use for instances that are created from this machine image.
     * 
     */
    @Import(name="machineType", required=true)
    private String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    @Import(name="metadata", required=true)
    private MetadataResponse metadata;

    public MetadataResponse metadata() {
        return this.metadata;
    }

    /**
     * Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;. For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    @Import(name="minCpuPlatform", required=true)
    private String minCpuPlatform;

    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * An array of network access configurations for this interface.
     * 
     */
    @Import(name="networkInterfaces", required=true)
    private List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Specifies the scheduling options for the instances that are created from this machine image.
     * 
     */
    @Import(name="scheduling", required=true)
    private SchedulingResponse scheduling;

    public SchedulingResponse scheduling() {
        return this.scheduling;
    }

    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    @Import(name="serviceAccounts", required=true)
    private List<ServiceAccountResponse> serviceAccounts;

    public List<ServiceAccountResponse> serviceAccounts() {
        return this.serviceAccounts;
    }

    /**
     * A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    @Import(name="tags", required=true)
    private TagsResponse tags;

    public TagsResponse tags() {
        return this.tags;
    }

    private SourceInstancePropertiesResponse() {}

    private SourceInstancePropertiesResponse(SourceInstancePropertiesResponse $) {
        this.canIpForward = $.canIpForward;
        this.deletionProtection = $.deletionProtection;
        this.description = $.description;
        this.disks = $.disks;
        this.guestAccelerators = $.guestAccelerators;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.minCpuPlatform = $.minCpuPlatform;
        this.networkInterfaces = $.networkInterfaces;
        this.scheduling = $.scheduling;
        this.serviceAccounts = $.serviceAccounts;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceInstancePropertiesResponse $;

        public Builder() {
            $ = new SourceInstancePropertiesResponse();
        }

        public Builder(SourceInstancePropertiesResponse defaults) {
            $ = new SourceInstancePropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder canIpForward(Boolean canIpForward) {
            $.canIpForward = canIpForward;
            return this;
        }

        public Builder deletionProtection(Boolean deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder disks(List<SavedAttachedDiskResponse> disks) {
            $.disks = disks;
            return this;
        }

        public Builder disks(SavedAttachedDiskResponse... disks) {
            return disks(List.of(disks));
        }

        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            $.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder guestAccelerators(AcceleratorConfigResponse... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public Builder machineType(String machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder metadata(MetadataResponse metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder scheduling(SchedulingResponse scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        public Builder serviceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            $.serviceAccounts = serviceAccounts;
            return this;
        }

        public Builder serviceAccounts(ServiceAccountResponse... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }

        public Builder tags(TagsResponse tags) {
            $.tags = tags;
            return this;
        }

        public SourceInstancePropertiesResponse build() {
            $.canIpForward = Objects.requireNonNull($.canIpForward, "expected parameter 'canIpForward' to be non-null");
            $.deletionProtection = Objects.requireNonNull($.deletionProtection, "expected parameter 'deletionProtection' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.disks = Objects.requireNonNull($.disks, "expected parameter 'disks' to be non-null");
            $.guestAccelerators = Objects.requireNonNull($.guestAccelerators, "expected parameter 'guestAccelerators' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.minCpuPlatform = Objects.requireNonNull($.minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
            $.networkInterfaces = Objects.requireNonNull($.networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
            $.scheduling = Objects.requireNonNull($.scheduling, "expected parameter 'scheduling' to be non-null");
            $.serviceAccounts = Objects.requireNonNull($.serviceAccounts, "expected parameter 'serviceAccounts' to be non-null");
            $.tags = Objects.requireNonNull($.tags, "expected parameter 'tags' to be non-null");
            return $;
        }
    }

}

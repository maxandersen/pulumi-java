// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_alpha.ResourcePolicyArgs;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyGroupPlacementPolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyInstanceSchedulePolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyResourceStatusResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicySnapshotSchedulePolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyVmMaintenancePolicyResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new resource policy.
 * 
 */
@ResourceType(type="google-native:compute/alpha:ResourcePolicy")
public class ResourcePolicy extends com.pulumi.resources.CustomResource {
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
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    /**
     * Resource policy for instances for placement configuration.
     * 
     */
    @Export(name="groupPlacementPolicy", type=ResourcePolicyGroupPlacementPolicyResponse.class, parameters={})
    private Output<ResourcePolicyGroupPlacementPolicyResponse> groupPlacementPolicy;

    /**
     * @return Resource policy for instances for placement configuration.
     * 
     */
    public Output<ResourcePolicyGroupPlacementPolicyResponse> groupPlacementPolicy() {
        return this.groupPlacementPolicy;
    }
    /**
     * Resource policy for scheduling instance operations.
     * 
     */
    @Export(name="instanceSchedulePolicy", type=ResourcePolicyInstanceSchedulePolicyResponse.class, parameters={})
    private Output<ResourcePolicyInstanceSchedulePolicyResponse> instanceSchedulePolicy;

    /**
     * @return Resource policy for scheduling instance operations.
     * 
     */
    public Output<ResourcePolicyInstanceSchedulePolicyResponse> instanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }
    /**
     * Type of the resource. Always compute#resource_policies for resource policies.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#resource_policies for resource policies.
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    /**
     * The system status of the resource policy.
     * 
     */
    @Export(name="resourceStatus", type=ResourcePolicyResourceStatusResponse.class, parameters={})
    private Output<ResourcePolicyResourceStatusResponse> resourceStatus;

    /**
     * @return The system status of the resource policy.
     * 
     */
    public Output<ResourcePolicyResourceStatusResponse> resourceStatus() {
        return this.resourceStatus;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
     */
    @Export(name="snapshotSchedulePolicy", type=ResourcePolicySnapshotSchedulePolicyResponse.class, parameters={})
    private Output<ResourcePolicySnapshotSchedulePolicyResponse> snapshotSchedulePolicy;

    /**
     * @return Resource policy for persistent disks for creating snapshots.
     * 
     */
    public Output<ResourcePolicySnapshotSchedulePolicyResponse> snapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy;
    }
    /**
     * The status of resource policy creation.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of resource policy creation.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Resource policy applicable to VMs for infrastructure maintenance.
     * 
     */
    @Export(name="vmMaintenancePolicy", type=ResourcePolicyVmMaintenancePolicyResponse.class, parameters={})
    private Output<ResourcePolicyVmMaintenancePolicyResponse> vmMaintenancePolicy;

    /**
     * @return Resource policy applicable to VMs for infrastructure maintenance.
     * 
     */
    public Output<ResourcePolicyVmMaintenancePolicyResponse> vmMaintenancePolicy() {
        return this.vmMaintenancePolicy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicy(String name) {
        this(name, ResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:ResourcePolicy", name, null, makeResourceOptions(options, id));
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
    public static ResourcePolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, options);
    }
}

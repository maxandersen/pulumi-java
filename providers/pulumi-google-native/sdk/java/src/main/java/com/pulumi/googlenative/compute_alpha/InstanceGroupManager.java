// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_alpha.InstanceGroupManagerArgs;
import com.pulumi.googlenative.compute_alpha.outputs.DistributionPolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerActionsSummaryResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAllInstancesConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAutoHealingPolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerInstanceLifecyclePolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerStandbyPolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerStatusResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerUpdatePolicyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerVersionResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NamedPortResponse;
import com.pulumi.googlenative.compute_alpha.outputs.StatefulPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a managed instance group using the information that you specify in the request. After the group is created, instances in the group are created using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method. A managed instance group can have up to 1000 VM instances per group. Please contact Cloud Support if you need an increase in this limit.
 * 
 */
@ResourceType(type="google-native:compute/alpha:InstanceGroupManager")
public class InstanceGroupManager extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the instances configs overrides that should be applied for all instances in the MIG.
     * 
     */
    @Export(name="allInstancesConfig", type=InstanceGroupManagerAllInstancesConfigResponse.class, parameters={})
    private Output<InstanceGroupManagerAllInstancesConfigResponse> allInstancesConfig;

    /**
     * @return Specifies the instances configs overrides that should be applied for all instances in the MIG.
     * 
     */
    public Output<InstanceGroupManagerAllInstancesConfigResponse> allInstancesConfig() {
        return this.allInstancesConfig;
    }
    /**
     * The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    @Export(name="autoHealingPolicies", type=List.class, parameters={InstanceGroupManagerAutoHealingPolicyResponse.class})
    private Output<List<InstanceGroupManagerAutoHealingPolicyResponse>> autoHealingPolicies;

    /**
     * @return The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    public Output<List<InstanceGroupManagerAutoHealingPolicyResponse>> autoHealingPolicies() {
        return this.autoHealingPolicies;
    }
    /**
     * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    @Export(name="baseInstanceName", type=String.class, parameters={})
    private Output<String> baseInstanceName;

    /**
     * @return The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    public Output<String> baseInstanceName() {
        return this.baseInstanceName;
    }
    /**
     * The creation timestamp for this managed instance group in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return The creation timestamp for this managed instance group in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
     * 
     */
    @Export(name="currentActions", type=InstanceGroupManagerActionsSummaryResponse.class, parameters={})
    private Output<InstanceGroupManagerActionsSummaryResponse> currentActions;

    /**
     * @return The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions.
     * 
     */
    public Output<InstanceGroupManagerActionsSummaryResponse> currentActions() {
        return this.currentActions;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    @Export(name="distributionPolicy", type=DistributionPolicyResponse.class, parameters={})
    private Output<DistributionPolicyResponse> distributionPolicy;

    /**
     * @return Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    public Output<DistributionPolicyResponse> distributionPolicy() {
        return this.distributionPolicy;
    }
    /**
     * The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    @Export(name="failoverAction", type=String.class, parameters={})
    private Output<String> failoverAction;

    /**
     * @return The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    public Output<String> failoverAction() {
        return this.failoverAction;
    }
    /**
     * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The URL of the Instance Group resource.
     * 
     */
    @Export(name="instanceGroup", type=String.class, parameters={})
    private Output<String> instanceGroup;

    /**
     * @return The URL of the Instance Group resource.
     * 
     */
    public Output<String> instanceGroup() {
        return this.instanceGroup;
    }
    /**
     * Instance lifecycle policy for this Instance Group Manager.
     * 
     */
    @Export(name="instanceLifecyclePolicy", type=InstanceGroupManagerInstanceLifecyclePolicyResponse.class, parameters={})
    private Output<InstanceGroupManagerInstanceLifecyclePolicyResponse> instanceLifecyclePolicy;

    /**
     * @return Instance lifecycle policy for this Instance Group Manager.
     * 
     */
    public Output<InstanceGroupManagerInstanceLifecyclePolicyResponse> instanceLifecyclePolicy() {
        return this.instanceLifecyclePolicy;
    }
    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
     * 
     */
    @Export(name="instanceTemplate", type=String.class, parameters={})
    private Output<String> instanceTemplate;

    /**
     * @return The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
     * 
     */
    public Output<String> instanceTemplate() {
        return this.instanceTemplate;
    }
    /**
     * The resource type, which is always compute#instanceGroupManager for managed instance groups.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The resource type, which is always compute#instanceGroupManager for managed instance groups.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    @Export(name="namedPorts", type=List.class, parameters={NamedPortResponse.class})
    private Output<List<NamedPortResponse>> namedPorts;

    /**
     * @return Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    public Output<List<NamedPortResponse>> namedPorts() {
        return this.namedPorts;
    }
    /**
     * The URL of the region where the managed instance group resides (for regional resources).
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The URL of the region where the managed instance group resides (for regional resources).
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The URL for this managed instance group. The server defines this URL.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URL for this managed instance group. The server defines this URL.
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
     * The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * Standby policy for stopped and suspended instances.
     * 
     */
    @Export(name="standbyPolicy", type=InstanceGroupManagerStandbyPolicyResponse.class, parameters={})
    private Output<InstanceGroupManagerStandbyPolicyResponse> standbyPolicy;

    /**
     * @return Standby policy for stopped and suspended instances.
     * 
     */
    public Output<InstanceGroupManagerStandbyPolicyResponse> standbyPolicy() {
        return this.standbyPolicy;
    }
    /**
     * Stateful configuration for this Instanced Group Manager
     * 
     */
    @Export(name="statefulPolicy", type=StatefulPolicyResponse.class, parameters={})
    private Output<StatefulPolicyResponse> statefulPolicy;

    /**
     * @return Stateful configuration for this Instanced Group Manager
     * 
     */
    public Output<StatefulPolicyResponse> statefulPolicy() {
        return this.statefulPolicy;
    }
    /**
     * The status of this managed instance group.
     * 
     */
    @Export(name="status", type=InstanceGroupManagerStatusResponse.class, parameters={})
    private Output<InstanceGroupManagerStatusResponse> status;

    /**
     * @return The status of this managed instance group.
     * 
     */
    public Output<InstanceGroupManagerStatusResponse> status() {
        return this.status;
    }
    /**
     * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    @Export(name="targetPools", type=List.class, parameters={String.class})
    private Output<List<String>> targetPools;

    /**
     * @return The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    public Output<List<String>> targetPools() {
        return this.targetPools;
    }
    /**
     * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    @Export(name="targetSize", type=Integer.class, parameters={})
    private Output<Integer> targetSize;

    /**
     * @return The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    public Output<Integer> targetSize() {
        return this.targetSize;
    }
    /**
     * The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
     * 
     */
    @Export(name="targetStoppedSize", type=Integer.class, parameters={})
    private Output<Integer> targetStoppedSize;

    /**
     * @return The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
     * 
     */
    public Output<Integer> targetStoppedSize() {
        return this.targetStoppedSize;
    }
    /**
     * The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
     * 
     */
    @Export(name="targetSuspendedSize", type=Integer.class, parameters={})
    private Output<Integer> targetSuspendedSize;

    /**
     * @return The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
     * 
     */
    public Output<Integer> targetSuspendedSize() {
        return this.targetSuspendedSize;
    }
    /**
     * The update policy for this managed instance group.
     * 
     */
    @Export(name="updatePolicy", type=InstanceGroupManagerUpdatePolicyResponse.class, parameters={})
    private Output<InstanceGroupManagerUpdatePolicyResponse> updatePolicy;

    /**
     * @return The update policy for this managed instance group.
     * 
     */
    public Output<InstanceGroupManagerUpdatePolicyResponse> updatePolicy() {
        return this.updatePolicy;
    }
    /**
     * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    @Export(name="versions", type=List.class, parameters={InstanceGroupManagerVersionResponse.class})
    private Output<List<InstanceGroupManagerVersionResponse>> versions;

    /**
     * @return Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    public Output<List<InstanceGroupManagerVersionResponse>> versions() {
        return this.versions;
    }
    /**
     * The URL of a zone where the managed instance group is located (for zonal resources).
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The URL of a zone where the managed instance group is located (for zonal resources).
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceGroupManager(String name) {
        this(name, InstanceGroupManagerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceGroupManager(String name, @Nullable InstanceGroupManagerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceGroupManager(String name, @Nullable InstanceGroupManagerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:InstanceGroupManager", name, args == null ? InstanceGroupManagerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceGroupManager(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:InstanceGroupManager", name, null, makeResourceOptions(options, id));
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
    public static InstanceGroupManager get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceGroupManager(name, id, options);
    }
}

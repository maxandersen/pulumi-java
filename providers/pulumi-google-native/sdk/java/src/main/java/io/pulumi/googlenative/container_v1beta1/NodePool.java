// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.container_v1beta1.NodePoolArgs;
import io.pulumi.googlenative.container_v1beta1.outputs.MaxPodsConstraintResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.NodeConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.NodeManagementResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.NodeNetworkConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.NodePoolAutoscalingResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.PlacementPolicyResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.StatusConditionResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.UpgradeSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a node pool for a cluster.
 * 
 */
@ResourceType(type="google-native:container/v1beta1:NodePool")
public class NodePool extends io.pulumi.resources.CustomResource {
    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    @Export(name="autoscaling", type=NodePoolAutoscalingResponse.class, parameters={})
    private Output<NodePoolAutoscalingResponse> autoscaling;

    /**
     * @return Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    public Output<NodePoolAutoscalingResponse> autoscaling() {
        return this.autoscaling;
    }
    /**
     * Which conditions caused the current node pool state.
     * 
     */
    @Export(name="conditions", type=List.class, parameters={StatusConditionResponse.class})
    private Output<List<StatusConditionResponse>> conditions;

    /**
     * @return Which conditions caused the current node pool state.
     * 
     */
    public Output<List<StatusConditionResponse>> conditions() {
        return this.conditions;
    }
    /**
     * The node configuration of the pool.
     * 
     */
    @Export(name="config", type=NodeConfigResponse.class, parameters={})
    private Output<NodeConfigResponse> config;

    /**
     * @return The node configuration of the pool.
     * 
     */
    public Output<NodeConfigResponse> config() {
        return this.config;
    }
    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    @Export(name="initialNodeCount", type=Integer.class, parameters={})
    private Output<Integer> initialNodeCount;

    /**
     * @return The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    public Output<Integer> initialNodeCount() {
        return this.initialNodeCount;
    }
    /**
     * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this node pool.
     * 
     */
    @Export(name="instanceGroupUrls", type=List.class, parameters={String.class})
    private Output<List<String>> instanceGroupUrls;

    /**
     * @return [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this node pool.
     * 
     */
    public Output<List<String>> instanceGroupUrls() {
        return this.instanceGroupUrls;
    }
    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    @Export(name="locations", type=List.class, parameters={String.class})
    private Output<List<String>> locations;

    /**
     * @return The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    public Output<List<String>> locations() {
        return this.locations;
    }
    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    @Export(name="management", type=NodeManagementResponse.class, parameters={})
    private Output<NodeManagementResponse> management;

    /**
     * @return NodeManagement configuration for this NodePool.
     * 
     */
    public Output<NodeManagementResponse> management() {
        return this.management;
    }
    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @Export(name="maxPodsConstraint", type=MaxPodsConstraintResponse.class, parameters={})
    private Output<MaxPodsConstraintResponse> maxPodsConstraint;

    /**
     * @return The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    public Output<MaxPodsConstraintResponse> maxPodsConstraint() {
        return this.maxPodsConstraint;
    }
    /**
     * The name of the node pool.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the node pool.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    @Export(name="networkConfig", type=NodeNetworkConfigResponse.class, parameters={})
    private Output<NodeNetworkConfigResponse> networkConfig;

    /**
     * @return Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    public Output<NodeNetworkConfigResponse> networkConfig() {
        return this.networkConfig;
    }
    /**
     * Specifies the node placement policy.
     * 
     */
    @Export(name="placementPolicy", type=PlacementPolicyResponse.class, parameters={})
    private Output<PlacementPolicyResponse> placementPolicy;

    /**
     * @return Specifies the node placement policy.
     * 
     */
    public Output<PlacementPolicyResponse> placementPolicy() {
        return this.placementPolicy;
    }
    /**
     * [Output only] The pod CIDR block size per node in this node pool.
     * 
     */
    @Export(name="podIpv4CidrSize", type=Integer.class, parameters={})
    private Output<Integer> podIpv4CidrSize;

    /**
     * @return [Output only] The pod CIDR block size per node in this node pool.
     * 
     */
    public Output<Integer> podIpv4CidrSize() {
        return this.podIpv4CidrSize;
    }
    /**
     * [Output only] Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return [Output only] Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * [Output only] The status of the nodes in this pool instance.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return [Output only] The status of the nodes in this pool instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    @Export(name="upgradeSettings", type=UpgradeSettingsResponse.class, parameters={})
    private Output<UpgradeSettingsResponse> upgradeSettings;

    /**
     * @return Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    public Output<UpgradeSettingsResponse> upgradeSettings() {
        return this.upgradeSettings;
    }
    /**
     * The version of the Kubernetes of this node.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the Kubernetes of this node.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodePool(String name) {
        this(name, NodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodePool(String name, NodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodePool(String name, NodePoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:container/v1beta1:NodePool", name, args == null ? NodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodePool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:container/v1beta1:NodePool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NodePool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodePool(name, id, options);
    }
}

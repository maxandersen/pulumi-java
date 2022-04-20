// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container_v1.outputs.MaxPodsConstraintResponse;
import com.pulumi.googlenative.container_v1.outputs.NodeConfigResponse;
import com.pulumi.googlenative.container_v1.outputs.NodeManagementResponse;
import com.pulumi.googlenative.container_v1.outputs.NodeNetworkConfigResponse;
import com.pulumi.googlenative.container_v1.outputs.NodePoolAutoscalingResponse;
import com.pulumi.googlenative.container_v1.outputs.StatusConditionResponse;
import com.pulumi.googlenative.container_v1.outputs.UpgradeSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NodePoolResponse {
    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    private final NodePoolAutoscalingResponse autoscaling;
    /**
     * Which conditions caused the current node pool state.
     * 
     */
    private final List<StatusConditionResponse> conditions;
    /**
     * The node configuration of the pool.
     * 
     */
    private final NodeConfigResponse config;
    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    private final Integer initialNodeCount;
    /**
     * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this node pool.
     * 
     */
    private final List<String> instanceGroupUrls;
    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    private final List<String> locations;
    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    private final NodeManagementResponse management;
    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    private final MaxPodsConstraintResponse maxPodsConstraint;
    /**
     * The name of the node pool.
     * 
     */
    private final String name;
    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    private final NodeNetworkConfigResponse networkConfig;
    /**
     * [Output only] The pod CIDR block size per node in this node pool.
     * 
     */
    private final Integer podIpv4CidrSize;
    /**
     * [Output only] Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * [Output only] The status of the nodes in this pool instance.
     * 
     */
    private final String status;
    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    private final UpgradeSettingsResponse upgradeSettings;
    /**
     * The version of the Kubernetes of this node.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private NodePoolResponse(
        @CustomType.Parameter("autoscaling") NodePoolAutoscalingResponse autoscaling,
        @CustomType.Parameter("conditions") List<StatusConditionResponse> conditions,
        @CustomType.Parameter("config") NodeConfigResponse config,
        @CustomType.Parameter("initialNodeCount") Integer initialNodeCount,
        @CustomType.Parameter("instanceGroupUrls") List<String> instanceGroupUrls,
        @CustomType.Parameter("locations") List<String> locations,
        @CustomType.Parameter("management") NodeManagementResponse management,
        @CustomType.Parameter("maxPodsConstraint") MaxPodsConstraintResponse maxPodsConstraint,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkConfig") NodeNetworkConfigResponse networkConfig,
        @CustomType.Parameter("podIpv4CidrSize") Integer podIpv4CidrSize,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("upgradeSettings") UpgradeSettingsResponse upgradeSettings,
        @CustomType.Parameter("version") String version) {
        this.autoscaling = autoscaling;
        this.conditions = conditions;
        this.config = config;
        this.initialNodeCount = initialNodeCount;
        this.instanceGroupUrls = instanceGroupUrls;
        this.locations = locations;
        this.management = management;
        this.maxPodsConstraint = maxPodsConstraint;
        this.name = name;
        this.networkConfig = networkConfig;
        this.podIpv4CidrSize = podIpv4CidrSize;
        this.selfLink = selfLink;
        this.status = status;
        this.upgradeSettings = upgradeSettings;
        this.version = version;
    }

    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
    */
    public NodePoolAutoscalingResponse autoscaling() {
        return this.autoscaling;
    }
    /**
     * Which conditions caused the current node pool state.
     * 
    */
    public List<StatusConditionResponse> conditions() {
        return this.conditions;
    }
    /**
     * The node configuration of the pool.
     * 
    */
    public NodeConfigResponse config() {
        return this.config;
    }
    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
    */
    public Integer initialNodeCount() {
        return this.initialNodeCount;
    }
    /**
     * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this node pool.
     * 
    */
    public List<String> instanceGroupUrls() {
        return this.instanceGroupUrls;
    }
    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
    */
    public List<String> locations() {
        return this.locations;
    }
    /**
     * NodeManagement configuration for this NodePool.
     * 
    */
    public NodeManagementResponse management() {
        return this.management;
    }
    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
    */
    public MaxPodsConstraintResponse maxPodsConstraint() {
        return this.maxPodsConstraint;
    }
    /**
     * The name of the node pool.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
    */
    public NodeNetworkConfigResponse networkConfig() {
        return this.networkConfig;
    }
    /**
     * [Output only] The pod CIDR block size per node in this node pool.
     * 
    */
    public Integer podIpv4CidrSize() {
        return this.podIpv4CidrSize;
    }
    /**
     * [Output only] Server-defined URL for the resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * [Output only] The status of the nodes in this pool instance.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
    */
    public UpgradeSettingsResponse upgradeSettings() {
        return this.upgradeSettings;
    }
    /**
     * The version of the Kubernetes of this node.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolAutoscalingResponse autoscaling;
        private List<StatusConditionResponse> conditions;
        private NodeConfigResponse config;
        private Integer initialNodeCount;
        private List<String> instanceGroupUrls;
        private List<String> locations;
        private NodeManagementResponse management;
        private MaxPodsConstraintResponse maxPodsConstraint;
        private String name;
        private NodeNetworkConfigResponse networkConfig;
        private Integer podIpv4CidrSize;
        private String selfLink;
        private String status;
        private UpgradeSettingsResponse upgradeSettings;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.conditions = defaults.conditions;
    	      this.config = defaults.config;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.instanceGroupUrls = defaults.instanceGroupUrls;
    	      this.locations = defaults.locations;
    	      this.management = defaults.management;
    	      this.maxPodsConstraint = defaults.maxPodsConstraint;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.podIpv4CidrSize = defaults.podIpv4CidrSize;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.version = defaults.version;
        }

        public Builder autoscaling(NodePoolAutoscalingResponse autoscaling) {
            this.autoscaling = Objects.requireNonNull(autoscaling);
            return this;
        }
        public Builder conditions(List<StatusConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(StatusConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder config(NodeConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder initialNodeCount(Integer initialNodeCount) {
            this.initialNodeCount = Objects.requireNonNull(initialNodeCount);
            return this;
        }
        public Builder instanceGroupUrls(List<String> instanceGroupUrls) {
            this.instanceGroupUrls = Objects.requireNonNull(instanceGroupUrls);
            return this;
        }
        public Builder instanceGroupUrls(String... instanceGroupUrls) {
            return instanceGroupUrls(List.of(instanceGroupUrls));
        }
        public Builder locations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder management(NodeManagementResponse management) {
            this.management = Objects.requireNonNull(management);
            return this;
        }
        public Builder maxPodsConstraint(MaxPodsConstraintResponse maxPodsConstraint) {
            this.maxPodsConstraint = Objects.requireNonNull(maxPodsConstraint);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkConfig(NodeNetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }
        public Builder podIpv4CidrSize(Integer podIpv4CidrSize) {
            this.podIpv4CidrSize = Objects.requireNonNull(podIpv4CidrSize);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder upgradeSettings(UpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public NodePoolResponse build() {
            return new NodePoolResponse(autoscaling, conditions, config, initialNodeCount, instanceGroupUrls, locations, management, maxPodsConstraint, name, networkConfig, podIpv4CidrSize, selfLink, status, upgradeSettings, version);
        }
    }
}

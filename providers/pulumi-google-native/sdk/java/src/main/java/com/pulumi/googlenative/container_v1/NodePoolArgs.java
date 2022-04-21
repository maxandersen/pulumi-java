// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.MaxPodsConstraintArgs;
import com.pulumi.googlenative.container_v1.inputs.NodeConfigArgs;
import com.pulumi.googlenative.container_v1.inputs.NodeManagementArgs;
import com.pulumi.googlenative.container_v1.inputs.NodeNetworkConfigArgs;
import com.pulumi.googlenative.container_v1.inputs.NodePoolAutoscalingArgs;
import com.pulumi.googlenative.container_v1.inputs.StatusConditionArgs;
import com.pulumi.googlenative.container_v1.inputs.UpgradeSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolArgs Empty = new NodePoolArgs();

    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    @Import(name="autoscaling")
    private @Nullable Output<NodePoolAutoscalingArgs> autoscaling;

    public Optional<Output<NodePoolAutoscalingArgs>> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }

    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Which conditions caused the current node pool state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<StatusConditionArgs>> conditions;

    public Optional<Output<List<StatusConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The node configuration of the pool.
     * 
     */
    @Import(name="config")
    private @Nullable Output<NodeConfigArgs> config;

    public Optional<Output<NodeConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    @Import(name="initialNodeCount")
    private @Nullable Output<Integer> initialNodeCount;

    public Optional<Output<Integer>> initialNodeCount() {
        return Optional.ofNullable(this.initialNodeCount);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    @Import(name="management")
    private @Nullable Output<NodeManagementArgs> management;

    public Optional<Output<NodeManagementArgs>> management() {
        return Optional.ofNullable(this.management);
    }

    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @Import(name="maxPodsConstraint")
    private @Nullable Output<MaxPodsConstraintArgs> maxPodsConstraint;

    public Optional<Output<MaxPodsConstraintArgs>> maxPodsConstraint() {
        return Optional.ofNullable(this.maxPodsConstraint);
    }

    /**
     * The name of the node pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<NodeNetworkConfigArgs> networkConfig;

    public Optional<Output<NodeNetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The parent (project, location, cluster id) where the node pool will be created. Specified in the format `projects/*{@literal /}locations/*{@literal /}clusters/*`.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    @Import(name="upgradeSettings")
    private @Nullable Output<UpgradeSettingsArgs> upgradeSettings;

    public Optional<Output<UpgradeSettingsArgs>> upgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }

    /**
     * The version of the Kubernetes of this node.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private NodePoolArgs() {}

    private NodePoolArgs(NodePoolArgs $) {
        this.autoscaling = $.autoscaling;
        this.clusterId = $.clusterId;
        this.conditions = $.conditions;
        this.config = $.config;
        this.initialNodeCount = $.initialNodeCount;
        this.location = $.location;
        this.locations = $.locations;
        this.management = $.management;
        this.maxPodsConstraint = $.maxPodsConstraint;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.parent = $.parent;
        this.project = $.project;
        this.upgradeSettings = $.upgradeSettings;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolArgs $;

        public Builder() {
            $ = new NodePoolArgs();
        }

        public Builder(NodePoolArgs defaults) {
            $ = new NodePoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscaling(@Nullable Output<NodePoolAutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        public Builder autoscaling(NodePoolAutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder conditions(@Nullable Output<List<StatusConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<StatusConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(StatusConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder config(@Nullable Output<NodeConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(NodeConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder initialNodeCount(@Nullable Output<Integer> initialNodeCount) {
            $.initialNodeCount = initialNodeCount;
            return this;
        }

        public Builder initialNodeCount(Integer initialNodeCount) {
            return initialNodeCount(Output.of(initialNodeCount));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public Builder management(@Nullable Output<NodeManagementArgs> management) {
            $.management = management;
            return this;
        }

        public Builder management(NodeManagementArgs management) {
            return management(Output.of(management));
        }

        public Builder maxPodsConstraint(@Nullable Output<MaxPodsConstraintArgs> maxPodsConstraint) {
            $.maxPodsConstraint = maxPodsConstraint;
            return this;
        }

        public Builder maxPodsConstraint(MaxPodsConstraintArgs maxPodsConstraint) {
            return maxPodsConstraint(Output.of(maxPodsConstraint));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkConfig(@Nullable Output<NodeNetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        public Builder networkConfig(NodeNetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder upgradeSettings(@Nullable Output<UpgradeSettingsArgs> upgradeSettings) {
            $.upgradeSettings = upgradeSettings;
            return this;
        }

        public Builder upgradeSettings(UpgradeSettingsArgs upgradeSettings) {
            return upgradeSettings(Output.of(upgradeSettings));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public NodePoolArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}

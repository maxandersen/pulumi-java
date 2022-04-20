// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks;

import com.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs;
import com.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs;
import com.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs;
import com.pulumi.aws.eks.inputs.NodeGroupTaintArgs;
import com.pulumi.aws.iam.Role;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.eks.inputs.CoreDataArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedNodeGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedNodeGroupArgs Empty = new ManagedNodeGroupArgs();

    /**
     * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="amiType")
      private final @Nullable Output<String> amiType;

    public Output<String> amiType() {
        return this.amiType == null ? Codegen.empty() : this.amiType;
    }

    /**
     * Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="capacityType")
      private final @Nullable Output<String> capacityType;

    public Output<String> capacityType() {
        return this.capacityType == null ? Codegen.empty() : this.capacityType;
    }

    /**
     * The target EKS cluster.
     * 
     */
    @Import(name="cluster", required=true)
      private final Output<CoreDataArgs> cluster;

    public Output<CoreDataArgs> cluster() {
        return this.cluster;
    }

    /**
     * Name of the EKS Cluster.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName == null ? Codegen.empty() : this.clusterName;
    }

    /**
     * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="diskSize")
      private final @Nullable Output<Integer> diskSize;

    public Output<Integer> diskSize() {
        return this.diskSize == null ? Codegen.empty() : this.diskSize;
    }

    /**
     * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
     * 
     */
    @Import(name="forceUpdateVersion")
      private final @Nullable Output<Boolean> forceUpdateVersion;

    public Output<Boolean> forceUpdateVersion() {
        return this.forceUpdateVersion == null ? Codegen.empty() : this.forceUpdateVersion;
    }

    /**
     * Set of instance types associated with the EKS Node Group. Defaults to `[&#34;t3.medium&#34;]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
     * 
     */
    @Import(name="instanceTypes")
      private final @Nullable Output<List<String>> instanceTypes;

    public Output<List<String>> instanceTypes() {
        return this.instanceTypes == null ? Codegen.empty() : this.instanceTypes;
    }

    /**
     * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Launch Template settings.
     * 
     */
    @Import(name="launchTemplate")
      private final @Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate;

    public Output<NodeGroupLaunchTemplateArgs> launchTemplate() {
        return this.launchTemplate == null ? Codegen.empty() : this.launchTemplate;
    }

    /**
     * Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `nodeGroupNamePrefix`.
     * 
     */
    @Import(name="nodeGroupName")
      private final @Nullable Output<String> nodeGroupName;

    public Output<String> nodeGroupName() {
        return this.nodeGroupName == null ? Codegen.empty() : this.nodeGroupName;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `nodeGroupName`.
     * 
     */
    @Import(name="nodeGroupNamePrefix")
      private final @Nullable Output<String> nodeGroupNamePrefix;

    public Output<String> nodeGroupNamePrefix() {
        return this.nodeGroupNamePrefix == null ? Codegen.empty() : this.nodeGroupNamePrefix;
    }

    /**
     * The IAM Role that provides permissions for the EKS Node Group.
     * 
     * Note, `nodeRole` and `nodeRoleArn` are mutually exclusive, and a single option must be used.
     * 
     */
    @Import(name="nodeRole")
      private final @Nullable Output<Role> nodeRole;

    public Output<Role> nodeRole() {
        return this.nodeRole == null ? Codegen.empty() : this.nodeRole;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
     * Note, `nodeRoleArn` and `nodeRole` are mutually exclusive, and a single option must be used.
     * 
     */
    @Import(name="nodeRoleArn")
      private final @Nullable Output<String> nodeRoleArn;

    public Output<String> nodeRoleArn() {
        return this.nodeRoleArn == null ? Codegen.empty() : this.nodeRoleArn;
    }

    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     * 
     */
    @Import(name="releaseVersion")
      private final @Nullable Output<String> releaseVersion;

    public Output<String> releaseVersion() {
        return this.releaseVersion == null ? Codegen.empty() : this.releaseVersion;
    }

    /**
     * Remote access settings.
     * 
     */
    @Import(name="remoteAccess")
      private final @Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess;

    public Output<NodeGroupRemoteAccessArgs> remoteAccess() {
        return this.remoteAccess == null ? Codegen.empty() : this.remoteAccess;
    }

    /**
     * Scaling settings.
     * 
     * Default scaling amounts of the node group autoscaling group are:
     *   - desiredSize: 2
     *   - minSize: 1
     *   - maxSize: 2
     * 
     */
    @Import(name="scalingConfig")
      private final @Nullable Output<NodeGroupScalingConfigArgs> scalingConfig;

    public Output<NodeGroupScalingConfigArgs> scalingConfig() {
        return this.scalingConfig == null ? Codegen.empty() : this.scalingConfig;
    }

    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     * Default subnetIds is chosen from the following list, in order, if subnetIds arg is not set:
     *   - core.subnetIds
     *   - core.privateIds
     *   - core.publicSubnetIds
     * 
     * This default logic is based on the existing subnet IDs logic of this package: https://git.io/JeM11
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    /**
     * Key-value mapping of resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group.
     * 
     */
    @Import(name="taints")
      private final @Nullable Output<List<NodeGroupTaintArgs>> taints;

    public Output<List<NodeGroupTaintArgs>> taints() {
        return this.taints == null ? Codegen.empty() : this.taints;
    }

    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ManagedNodeGroupArgs(
        @Nullable Output<String> amiType,
        @Nullable Output<String> capacityType,
        Output<CoreDataArgs> cluster,
        @Nullable Output<String> clusterName,
        @Nullable Output<Integer> diskSize,
        @Nullable Output<Boolean> forceUpdateVersion,
        @Nullable Output<List<String>> instanceTypes,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate,
        @Nullable Output<String> nodeGroupName,
        @Nullable Output<String> nodeGroupNamePrefix,
        @Nullable Output<Role> nodeRole,
        @Nullable Output<String> nodeRoleArn,
        @Nullable Output<String> releaseVersion,
        @Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess,
        @Nullable Output<NodeGroupScalingConfigArgs> scalingConfig,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<NodeGroupTaintArgs>> taints,
        @Nullable Output<String> version) {
        this.amiType = amiType;
        this.capacityType = capacityType;
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.clusterName = clusterName;
        this.diskSize = diskSize;
        this.forceUpdateVersion = forceUpdateVersion;
        this.instanceTypes = instanceTypes;
        this.labels = labels;
        this.launchTemplate = launchTemplate;
        this.nodeGroupName = nodeGroupName;
        this.nodeGroupNamePrefix = nodeGroupNamePrefix;
        this.nodeRole = nodeRole;
        this.nodeRoleArn = nodeRoleArn;
        this.releaseVersion = releaseVersion;
        this.remoteAccess = remoteAccess;
        this.scalingConfig = scalingConfig;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.taints = taints;
        this.version = version;
    }

    private ManagedNodeGroupArgs() {
        this.amiType = Codegen.empty();
        this.capacityType = Codegen.empty();
        this.cluster = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.diskSize = Codegen.empty();
        this.forceUpdateVersion = Codegen.empty();
        this.instanceTypes = Codegen.empty();
        this.labels = Codegen.empty();
        this.launchTemplate = Codegen.empty();
        this.nodeGroupName = Codegen.empty();
        this.nodeGroupNamePrefix = Codegen.empty();
        this.nodeRole = Codegen.empty();
        this.nodeRoleArn = Codegen.empty();
        this.releaseVersion = Codegen.empty();
        this.remoteAccess = Codegen.empty();
        this.scalingConfig = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.taints = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> amiType;
        private @Nullable Output<String> capacityType;
        private Output<CoreDataArgs> cluster;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<Integer> diskSize;
        private @Nullable Output<Boolean> forceUpdateVersion;
        private @Nullable Output<List<String>> instanceTypes;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate;
        private @Nullable Output<String> nodeGroupName;
        private @Nullable Output<String> nodeGroupNamePrefix;
        private @Nullable Output<Role> nodeRole;
        private @Nullable Output<String> nodeRoleArn;
        private @Nullable Output<String> releaseVersion;
        private @Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess;
        private @Nullable Output<NodeGroupScalingConfigArgs> scalingConfig;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<NodeGroupTaintArgs>> taints;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiType = defaults.amiType;
    	      this.capacityType = defaults.capacityType;
    	      this.cluster = defaults.cluster;
    	      this.clusterName = defaults.clusterName;
    	      this.diskSize = defaults.diskSize;
    	      this.forceUpdateVersion = defaults.forceUpdateVersion;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.labels = defaults.labels;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeGroupNamePrefix = defaults.nodeGroupNamePrefix;
    	      this.nodeRole = defaults.nodeRole;
    	      this.nodeRoleArn = defaults.nodeRoleArn;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.remoteAccess = defaults.remoteAccess;
    	      this.scalingConfig = defaults.scalingConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.version = defaults.version;
        }

        public Builder amiType(@Nullable Output<String> amiType) {
            this.amiType = amiType;
            return this;
        }
        public Builder amiType(@Nullable String amiType) {
            this.amiType = Codegen.ofNullable(amiType);
            return this;
        }
        public Builder capacityType(@Nullable Output<String> capacityType) {
            this.capacityType = capacityType;
            return this;
        }
        public Builder capacityType(@Nullable String capacityType) {
            this.capacityType = Codegen.ofNullable(capacityType);
            return this;
        }
        public Builder cluster(Output<CoreDataArgs> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder cluster(CoreDataArgs cluster) {
            this.cluster = Output.of(Objects.requireNonNull(cluster));
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Codegen.ofNullable(clusterName);
            return this;
        }
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Builder diskSize(@Nullable Integer diskSize) {
            this.diskSize = Codegen.ofNullable(diskSize);
            return this;
        }
        public Builder forceUpdateVersion(@Nullable Output<Boolean> forceUpdateVersion) {
            this.forceUpdateVersion = forceUpdateVersion;
            return this;
        }
        public Builder forceUpdateVersion(@Nullable Boolean forceUpdateVersion) {
            this.forceUpdateVersion = Codegen.ofNullable(forceUpdateVersion);
            return this;
        }
        public Builder instanceTypes(@Nullable Output<List<String>> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public Builder instanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = Codegen.ofNullable(instanceTypes);
            return this;
        }
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder launchTemplate(@Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }
        public Builder launchTemplate(@Nullable NodeGroupLaunchTemplateArgs launchTemplate) {
            this.launchTemplate = Codegen.ofNullable(launchTemplate);
            return this;
        }
        public Builder nodeGroupName(@Nullable Output<String> nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public Builder nodeGroupName(@Nullable String nodeGroupName) {
            this.nodeGroupName = Codegen.ofNullable(nodeGroupName);
            return this;
        }
        public Builder nodeGroupNamePrefix(@Nullable Output<String> nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = nodeGroupNamePrefix;
            return this;
        }
        public Builder nodeGroupNamePrefix(@Nullable String nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = Codegen.ofNullable(nodeGroupNamePrefix);
            return this;
        }
        public Builder nodeRole(@Nullable Output<Role> nodeRole) {
            this.nodeRole = nodeRole;
            return this;
        }
        public Builder nodeRole(@Nullable Role nodeRole) {
            this.nodeRole = Codegen.ofNullable(nodeRole);
            return this;
        }
        public Builder nodeRoleArn(@Nullable Output<String> nodeRoleArn) {
            this.nodeRoleArn = nodeRoleArn;
            return this;
        }
        public Builder nodeRoleArn(@Nullable String nodeRoleArn) {
            this.nodeRoleArn = Codegen.ofNullable(nodeRoleArn);
            return this;
        }
        public Builder releaseVersion(@Nullable Output<String> releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public Builder releaseVersion(@Nullable String releaseVersion) {
            this.releaseVersion = Codegen.ofNullable(releaseVersion);
            return this;
        }
        public Builder remoteAccess(@Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess) {
            this.remoteAccess = remoteAccess;
            return this;
        }
        public Builder remoteAccess(@Nullable NodeGroupRemoteAccessArgs remoteAccess) {
            this.remoteAccess = Codegen.ofNullable(remoteAccess);
            return this;
        }
        public Builder scalingConfig(@Nullable Output<NodeGroupScalingConfigArgs> scalingConfig) {
            this.scalingConfig = scalingConfig;
            return this;
        }
        public Builder scalingConfig(@Nullable NodeGroupScalingConfigArgs scalingConfig) {
            this.scalingConfig = Codegen.ofNullable(scalingConfig);
            return this;
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder taints(@Nullable Output<List<NodeGroupTaintArgs>> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(@Nullable List<NodeGroupTaintArgs> taints) {
            this.taints = Codegen.ofNullable(taints);
            return this;
        }
        public Builder taints(NodeGroupTaintArgs... taints) {
            return taints(List.of(taints));
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ManagedNodeGroupArgs build() {
            return new ManagedNodeGroupArgs(amiType, capacityType, cluster, clusterName, diskSize, forceUpdateVersion, instanceTypes, labels, launchTemplate, nodeGroupName, nodeGroupNamePrefix, nodeRole, nodeRoleArn, releaseVersion, remoteAccess, scalingConfig, subnetIds, tags, taints, version);
        }
    }
}

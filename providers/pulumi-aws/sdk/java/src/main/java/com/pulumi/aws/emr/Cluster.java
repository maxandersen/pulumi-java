// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.emr.ClusterArgs;
import com.pulumi.aws.emr.inputs.ClusterState;
import com.pulumi.aws.emr.outputs.ClusterAutoTerminationPolicy;
import com.pulumi.aws.emr.outputs.ClusterBootstrapAction;
import com.pulumi.aws.emr.outputs.ClusterCoreInstanceFleet;
import com.pulumi.aws.emr.outputs.ClusterCoreInstanceGroup;
import com.pulumi.aws.emr.outputs.ClusterEc2Attributes;
import com.pulumi.aws.emr.outputs.ClusterKerberosAttributes;
import com.pulumi.aws.emr.outputs.ClusterMasterInstanceFleet;
import com.pulumi.aws.emr.outputs.ClusterMasterInstanceGroup;
import com.pulumi.aws.emr.outputs.ClusterStep;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Elastic MapReduce Cluster, a web service that makes it easy to process large amounts of data efficiently. See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/elastic-mapreduce/) for more information.
 * 
 * To configure [Instance Groups](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for [task nodes](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-task), see the `aws.emr.InstanceGroup` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EMR clusters can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:emr/cluster:Cluster cluster j-123456ABCDEF
 * ```
 * 
 *  Since the API does not return the actual values for Kerberos configurations, environments with those configurations will need to use the resource options configuration block `ignoreChanges` argument available to all provider resources to prevent perpetual differences, e.g. terraform resource &#34;aws_emr_cluster&#34; &#34;example&#34; {
 * 
 * # ... other configuration ...
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [kerberos_attributes]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:emr/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
     * 
     */
    @Export(name="additionalInfo", type=String.class, parameters={})
    private Output</* @Nullable */ String> additionalInfo;

    /**
     * @return JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
     * 
     */
    public Output</* @Nullable */ String> additionalInfo() {
        return this.additionalInfo;
    }
    /**
     * List of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive.
     * 
     */
    @Export(name="applications", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> applications;

    /**
     * @return List of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive.
     * 
     */
    public Output</* @Nullable */ List<String>> applications() {
        return this.applications;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * An auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in seconds after which a cluster automatically terminates. See Auto Termination Policy Below.
     * 
     */
    @Export(name="autoTerminationPolicy", type=ClusterAutoTerminationPolicy.class, parameters={})
    private Output</* @Nullable */ ClusterAutoTerminationPolicy> autoTerminationPolicy;

    /**
     * @return An auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in seconds after which a cluster automatically terminates. See Auto Termination Policy Below.
     * 
     */
    public Output</* @Nullable */ ClusterAutoTerminationPolicy> autoTerminationPolicy() {
        return this.autoTerminationPolicy;
    }
    /**
     * IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
     * 
     */
    @Export(name="autoscalingRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoscalingRole;

    /**
     * @return IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
     * 
     */
    public Output</* @Nullable */ String> autoscalingRole() {
        return this.autoscalingRole;
    }
    /**
     * Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. See below.
     * 
     */
    @Export(name="bootstrapActions", type=List.class, parameters={ClusterBootstrapAction.class})
    private Output</* @Nullable */ List<ClusterBootstrapAction>> bootstrapActions;

    /**
     * @return Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. See below.
     * 
     */
    public Output</* @Nullable */ List<ClusterBootstrapAction>> bootstrapActions() {
        return this.bootstrapActions;
    }
    @Export(name="clusterState", type=String.class, parameters={})
    private Output<String> clusterState;

    public Output<String> clusterState() {
        return this.clusterState;
    }
    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    @Export(name="configurations", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurations;

    /**
     * @return Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    public Output</* @Nullable */ String> configurations() {
        return this.configurations;
    }
    /**
     * JSON string for supplying list of configurations for the EMR cluster.
     * 
     */
    @Export(name="configurationsJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationsJson;

    /**
     * @return JSON string for supplying list of configurations for the EMR cluster.
     * 
     */
    public Output</* @Nullable */ String> configurationsJson() {
        return this.configurationsJson;
    }
    /**
     * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `core_instance_group` configuration blocks are set. Detailed below.
     * 
     */
    @Export(name="coreInstanceFleet", type=ClusterCoreInstanceFleet.class, parameters={})
    private Output<ClusterCoreInstanceFleet> coreInstanceFleet;

    /**
     * @return Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `core_instance_group` configuration blocks are set. Detailed below.
     * 
     */
    public Output<ClusterCoreInstanceFleet> coreInstanceFleet() {
        return this.coreInstanceFleet;
    }
    /**
     * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
     * 
     */
    @Export(name="coreInstanceGroup", type=ClusterCoreInstanceGroup.class, parameters={})
    private Output<ClusterCoreInstanceGroup> coreInstanceGroup;

    /**
     * @return Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
     * 
     */
    public Output<ClusterCoreInstanceGroup> coreInstanceGroup() {
        return this.coreInstanceGroup;
    }
    /**
     * Custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
     * 
     */
    @Export(name="customAmiId", type=String.class, parameters={})
    private Output</* @Nullable */ String> customAmiId;

    /**
     * @return Custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
     * 
     */
    public Output</* @Nullable */ String> customAmiId() {
        return this.customAmiId;
    }
    /**
     * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
     * 
     */
    @Export(name="ebsRootVolumeSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ebsRootVolumeSize;

    /**
     * @return Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
     * 
     */
    public Output</* @Nullable */ Integer> ebsRootVolumeSize() {
        return this.ebsRootVolumeSize;
    }
    /**
     * Attributes for the EC2 instances running the job flow. See below.
     * 
     */
    @Export(name="ec2Attributes", type=ClusterEc2Attributes.class, parameters={})
    private Output</* @Nullable */ ClusterEc2Attributes> ec2Attributes;

    /**
     * @return Attributes for the EC2 instances running the job flow. See below.
     * 
     */
    public Output</* @Nullable */ ClusterEc2Attributes> ec2Attributes() {
        return this.ec2Attributes;
    }
    /**
     * Switch on/off run cluster with no steps or when all steps are complete (default is on)
     * 
     */
    @Export(name="keepJobFlowAliveWhenNoSteps", type=Boolean.class, parameters={})
    private Output<Boolean> keepJobFlowAliveWhenNoSteps;

    /**
     * @return Switch on/off run cluster with no steps or when all steps are complete (default is on)
     * 
     */
    public Output<Boolean> keepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps;
    }
    /**
     * Kerberos configuration for the cluster. See below.
     * 
     */
    @Export(name="kerberosAttributes", type=ClusterKerberosAttributes.class, parameters={})
    private Output</* @Nullable */ ClusterKerberosAttributes> kerberosAttributes;

    /**
     * @return Kerberos configuration for the cluster. See below.
     * 
     */
    public Output</* @Nullable */ ClusterKerberosAttributes> kerberosAttributes() {
        return this.kerberosAttributes;
    }
    /**
     * AWS KMS customer master key (CMK) key ID or arn used for encrypting log files. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
     * 
     */
    @Export(name="logEncryptionKmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> logEncryptionKmsKeyId;

    /**
     * @return AWS KMS customer master key (CMK) key ID or arn used for encrypting log files. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
     * 
     */
    public Output</* @Nullable */ String> logEncryptionKmsKeyId() {
        return this.logEncryptionKmsKeyId;
    }
    /**
     * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created.
     * 
     */
    @Export(name="logUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> logUri;

    /**
     * @return S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created.
     * 
     */
    public Output</* @Nullable */ String> logUri() {
        return this.logUri;
    }
    /**
     * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `master_instance_group` configuration blocks are set. Detailed below.
     * 
     */
    @Export(name="masterInstanceFleet", type=ClusterMasterInstanceFleet.class, parameters={})
    private Output<ClusterMasterInstanceFleet> masterInstanceFleet;

    /**
     * @return Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `master_instance_group` configuration blocks are set. Detailed below.
     * 
     */
    public Output<ClusterMasterInstanceFleet> masterInstanceFleet() {
        return this.masterInstanceFleet;
    }
    /**
     * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
     * 
     */
    @Export(name="masterInstanceGroup", type=ClusterMasterInstanceGroup.class, parameters={})
    private Output<ClusterMasterInstanceGroup> masterInstanceGroup;

    /**
     * @return Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
     * 
     */
    public Output<ClusterMasterInstanceGroup> masterInstanceGroup() {
        return this.masterInstanceGroup;
    }
    /**
     * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
     * 
     */
    @Export(name="masterPublicDns", type=String.class, parameters={})
    private Output<String> masterPublicDns;

    /**
     * @return The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
     * 
     */
    public Output<String> masterPublicDns() {
        return this.masterPublicDns;
    }
    /**
     * Name of the step.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the step.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Release label for the Amazon EMR release.
     * 
     */
    @Export(name="releaseLabel", type=String.class, parameters={})
    private Output<String> releaseLabel;

    /**
     * @return Release label for the Amazon EMR release.
     * 
     */
    public Output<String> releaseLabel() {
        return this.releaseLabel;
    }
    /**
     * Way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
     * 
     */
    @Export(name="scaleDownBehavior", type=String.class, parameters={})
    private Output<String> scaleDownBehavior;

    /**
     * @return Way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
     * 
     */
    public Output<String> scaleDownBehavior() {
        return this.scaleDownBehavior;
    }
    /**
     * Security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `release_label` 4.8.0 or greater.
     * 
     */
    @Export(name="securityConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityConfiguration;

    /**
     * @return Security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `release_label` 4.8.0 or greater.
     * 
     */
    public Output</* @Nullable */ String> securityConfiguration() {
        return this.securityConfiguration;
    }
    /**
     * IAM role that will be assumed by the Amazon EMR service to access AWS resources.
     * 
     */
    @Export(name="serviceRole", type=String.class, parameters={})
    private Output<String> serviceRole;

    /**
     * @return IAM role that will be assumed by the Amazon EMR service to access AWS resources.
     * 
     */
    public Output<String> serviceRole() {
        return this.serviceRole;
    }
    /**
     * Number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `release_label` 5.28.0 or greater (default is 1).
     * 
     */
    @Export(name="stepConcurrencyLevel", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> stepConcurrencyLevel;

    /**
     * @return Number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `release_label` 5.28.0 or greater (default is 1).
     * 
     */
    public Output</* @Nullable */ Integer> stepConcurrencyLevel() {
        return this.stepConcurrencyLevel;
    }
    /**
     * List of steps to run when creating the cluster. See below. It is highly recommended to utilize the lifecycle resource options block with `ignoreChanges` if other steps are being managed outside of this provider.
     * 
     */
    @Export(name="steps", type=List.class, parameters={ClusterStep.class})
    private Output<List<ClusterStep>> steps;

    /**
     * @return List of steps to run when creating the cluster. See below. It is highly recommended to utilize the lifecycle resource options block with `ignoreChanges` if other steps are being managed outside of this provider.
     * 
     */
    public Output<List<ClusterStep>> steps() {
        return this.steps;
    }
    /**
     * list of tags to apply to the EMR Cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return list of tags to apply to the EMR Cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
     * 
     */
    @Export(name="terminationProtection", type=Boolean.class, parameters={})
    private Output<Boolean> terminationProtection;

    /**
     * @return Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
     * 
     */
    public Output<Boolean> terminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default value is `true`.
     * 
     */
    @Export(name="visibleToAllUsers", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> visibleToAllUsers;

    /**
     * @return Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default value is `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> visibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}

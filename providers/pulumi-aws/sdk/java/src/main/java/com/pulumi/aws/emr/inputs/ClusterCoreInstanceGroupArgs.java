// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupEbsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceGroupArgs Empty = new ClusterCoreInstanceGroupArgs();

    /**
     * String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
     * 
     */
    @Import(name="autoscalingPolicy")
      private final @Nullable Output<String> autoscalingPolicy;

    public Output<String> autoscalingPolicy() {
        return this.autoscalingPolicy == null ? Codegen.empty() : this.autoscalingPolicy;
    }

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @Import(name="bidPrice")
      private final @Nullable Output<String> bidPrice;

    public Output<String> bidPrice() {
        return this.bidPrice == null ? Codegen.empty() : this.bidPrice;
    }

    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    @Import(name="ebsConfigs")
      private final @Nullable Output<List<ClusterCoreInstanceGroupEbsConfigArgs>> ebsConfigs;

    public Output<List<ClusterCoreInstanceGroupEbsConfigArgs>> ebsConfigs() {
        return this.ebsConfigs == null ? Codegen.empty() : this.ebsConfigs;
    }

    /**
     * ID of the cluster.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource&#39;s `core_instance_group` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have map public IP on launch enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `termination_protection = false` configuration applied before destroying this resource.
     * 
     */
    @Import(name="instanceCount")
      private final @Nullable Output<Integer> instanceCount;

    public Output<Integer> instanceCount() {
        return this.instanceCount == null ? Codegen.empty() : this.instanceCount;
    }

    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * Name of the step.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ClusterCoreInstanceGroupArgs(
        @Nullable Output<String> autoscalingPolicy,
        @Nullable Output<String> bidPrice,
        @Nullable Output<List<ClusterCoreInstanceGroupEbsConfigArgs>> ebsConfigs,
        @Nullable Output<String> id,
        @Nullable Output<Integer> instanceCount,
        Output<String> instanceType,
        @Nullable Output<String> name) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.bidPrice = bidPrice;
        this.ebsConfigs = ebsConfigs;
        this.id = id;
        this.instanceCount = instanceCount;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.name = name;
    }

    private ClusterCoreInstanceGroupArgs() {
        this.autoscalingPolicy = Codegen.empty();
        this.bidPrice = Codegen.empty();
        this.ebsConfigs = Codegen.empty();
        this.id = Codegen.empty();
        this.instanceCount = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoscalingPolicy;
        private @Nullable Output<String> bidPrice;
        private @Nullable Output<List<ClusterCoreInstanceGroupEbsConfigArgs>> ebsConfigs;
        private @Nullable Output<String> id;
        private @Nullable Output<Integer> instanceCount;
        private Output<String> instanceType;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.bidPrice = defaults.bidPrice;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.id = defaults.id;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.name = defaults.name;
        }

        public Builder autoscalingPolicy(@Nullable Output<String> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }
        public Builder autoscalingPolicy(@Nullable String autoscalingPolicy) {
            this.autoscalingPolicy = Codegen.ofNullable(autoscalingPolicy);
            return this;
        }
        public Builder bidPrice(@Nullable Output<String> bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }
        public Builder bidPrice(@Nullable String bidPrice) {
            this.bidPrice = Codegen.ofNullable(bidPrice);
            return this;
        }
        public Builder ebsConfigs(@Nullable Output<List<ClusterCoreInstanceGroupEbsConfigArgs>> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }
        public Builder ebsConfigs(@Nullable List<ClusterCoreInstanceGroupEbsConfigArgs> ebsConfigs) {
            this.ebsConfigs = Codegen.ofNullable(ebsConfigs);
            return this;
        }
        public Builder ebsConfigs(ClusterCoreInstanceGroupEbsConfigArgs... ebsConfigs) {
            return ebsConfigs(List.of(ebsConfigs));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = Codegen.ofNullable(instanceCount);
            return this;
        }
        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ClusterCoreInstanceGroupArgs build() {
            return new ClusterCoreInstanceGroupArgs(autoscalingPolicy, bidPrice, ebsConfigs, id, instanceCount, instanceType, name);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs;
import com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceFleetInstanceTypeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetInstanceTypeConfigArgs Empty = new ClusterCoreInstanceFleetInstanceTypeConfigArgs();

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @Import(name="bidPrice")
    private @Nullable Output<String> bidPrice;

    public Optional<Output<String>> bidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }

    /**
     * Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    @Import(name="bidPriceAsPercentageOfOnDemandPrice")
    private @Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice;

    public Optional<Output<Double>> bidPriceAsPercentageOfOnDemandPrice() {
        return Optional.ofNullable(this.bidPriceAsPercentageOfOnDemandPrice);
    }

    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    @Import(name="configurations")
    private @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>> configurations;

    public Optional<Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>>> configurations() {
        return Optional.ofNullable(this.configurations);
    }

    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    @Import(name="ebsConfigs")
    private @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>> ebsConfigs;

    public Optional<Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>>> ebsConfigs() {
        return Optional.ofNullable(this.ebsConfigs);
    }

    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    @Import(name="weightedCapacity")
    private @Nullable Output<Integer> weightedCapacity;

    public Optional<Output<Integer>> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    private ClusterCoreInstanceFleetInstanceTypeConfigArgs() {}

    private ClusterCoreInstanceFleetInstanceTypeConfigArgs(ClusterCoreInstanceFleetInstanceTypeConfigArgs $) {
        this.bidPrice = $.bidPrice;
        this.bidPriceAsPercentageOfOnDemandPrice = $.bidPriceAsPercentageOfOnDemandPrice;
        this.configurations = $.configurations;
        this.ebsConfigs = $.ebsConfigs;
        this.instanceType = $.instanceType;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCoreInstanceFleetInstanceTypeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCoreInstanceFleetInstanceTypeConfigArgs $;

        public Builder() {
            $ = new ClusterCoreInstanceFleetInstanceTypeConfigArgs();
        }

        public Builder(ClusterCoreInstanceFleetInstanceTypeConfigArgs defaults) {
            $ = new ClusterCoreInstanceFleetInstanceTypeConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder bidPrice(@Nullable Output<String> bidPrice) {
            $.bidPrice = bidPrice;
            return this;
        }

        public Builder bidPrice(String bidPrice) {
            return bidPrice(Output.of(bidPrice));
        }

        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice) {
            $.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
            return this;
        }

        public Builder bidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
            return bidPriceAsPercentageOfOnDemandPrice(Output.of(bidPriceAsPercentageOfOnDemandPrice));
        }

        public Builder configurations(@Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs>> configurations) {
            $.configurations = configurations;
            return this;
        }

        public Builder configurations(List<ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs> configurations) {
            return configurations(Output.of(configurations));
        }

        public Builder configurations(ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs... configurations) {
            return configurations(List.of(configurations));
        }

        public Builder ebsConfigs(@Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs>> ebsConfigs) {
            $.ebsConfigs = ebsConfigs;
            return this;
        }

        public Builder ebsConfigs(List<ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs> ebsConfigs) {
            return ebsConfigs(Output.of(ebsConfigs));
        }

        public Builder ebsConfigs(ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs... ebsConfigs) {
            return ebsConfigs(List.of(ebsConfigs));
        }

        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder weightedCapacity(@Nullable Output<Integer> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(Integer weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public ClusterCoreInstanceFleetInstanceTypeConfigArgs build() {
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            return $;
        }
    }

}

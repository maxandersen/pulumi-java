// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Target resources and allocation
 * 
 */
public final class CostAllocationProportionArgs extends ResourceArgs {

    public static final CostAllocationProportionArgs Empty = new CostAllocationProportionArgs();

    /**
     * Target resource for cost allocation
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Target resource for cost allocation
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
     * 
     */
    @Import(name="percentage", required=true)
    private Output<Double> percentage;

    /**
     * @return Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
     * 
     */
    public Output<Double> percentage() {
        return this.percentage;
    }

    private CostAllocationProportionArgs() {}

    private CostAllocationProportionArgs(CostAllocationProportionArgs $) {
        this.name = $.name;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostAllocationProportionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostAllocationProportionArgs $;

        public Builder() {
            $ = new CostAllocationProportionArgs();
        }

        public Builder(CostAllocationProportionArgs defaults) {
            $ = new CostAllocationProportionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Target resource for cost allocation
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Target resource for cost allocation
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param percentage Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
         * 
         * @return builder
         * 
         */
        public Builder percentage(Output<Double> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
         * 
         * @return builder
         * 
         */
        public Builder percentage(Double percentage) {
            return percentage(Output.of(percentage));
        }

        public CostAllocationProportionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.percentage = Objects.requireNonNull($.percentage, "expected parameter 'percentage' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.CostAllocationPolicyType;
import com.pulumi.azurenative.costmanagement.enums.CostAllocationResourceType;
import com.pulumi.azurenative.costmanagement.inputs.CostAllocationProportionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Target resources for cost allocation.
 * 
 */
public final class TargetCostAllocationResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetCostAllocationResourceArgs Empty = new TargetCostAllocationResourceArgs();

    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Method of cost allocation for the rule
     * 
     */
    @Import(name="policyType", required=true)
    private Output<Either<String,CostAllocationPolicyType>> policyType;

    public Output<Either<String,CostAllocationPolicyType>> policyType() {
        return this.policyType;
    }

    /**
     * Type of resources contained in this cost allocation rule
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<Either<String,CostAllocationResourceType>> resourceType;

    public Output<Either<String,CostAllocationResourceType>> resourceType() {
        return this.resourceType;
    }

    /**
     * Target resources for cost allocation. This list cannot contain more than 25 values.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<CostAllocationProportionArgs>> values;

    public Output<List<CostAllocationProportionArgs>> values() {
        return this.values;
    }

    private TargetCostAllocationResourceArgs() {}

    private TargetCostAllocationResourceArgs(TargetCostAllocationResourceArgs $) {
        this.name = $.name;
        this.policyType = $.policyType;
        this.resourceType = $.resourceType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetCostAllocationResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetCostAllocationResourceArgs $;

        public Builder() {
            $ = new TargetCostAllocationResourceArgs();
        }

        public Builder(TargetCostAllocationResourceArgs defaults) {
            $ = new TargetCostAllocationResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policyType(Output<Either<String,CostAllocationPolicyType>> policyType) {
            $.policyType = policyType;
            return this;
        }

        public Builder policyType(Either<String,CostAllocationPolicyType> policyType) {
            return policyType(Output.of(policyType));
        }

        public Builder resourceType(Output<Either<String,CostAllocationResourceType>> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(Either<String,CostAllocationResourceType> resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder values(Output<List<CostAllocationProportionArgs>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<CostAllocationProportionArgs> values) {
            return values(Output.of(values));
        }

        public Builder values(CostAllocationProportionArgs... values) {
            return values(List.of(values));
        }

        public TargetCostAllocationResourceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.policyType = Objects.requireNonNull($.policyType, "expected parameter 'policyType' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}

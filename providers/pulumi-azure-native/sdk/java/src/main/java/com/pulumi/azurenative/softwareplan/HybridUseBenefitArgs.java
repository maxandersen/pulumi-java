// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.softwareplan;

import com.pulumi.azurenative.softwareplan.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridUseBenefitArgs extends ResourceArgs {

    public static final HybridUseBenefitArgs Empty = new HybridUseBenefitArgs();

    /**
     * This is a unique identifier for a plan. Should be a guid.
     * 
     */
    @Import(name="planId")
    private @Nullable Output<String> planId;

    /**
     * @return This is a unique identifier for a plan. Should be a guid.
     * 
     */
    public Optional<Output<String>> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * Hybrid use benefit SKU
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    /**
     * @return Hybrid use benefit SKU
     * 
     */
    public Output<SkuArgs> sku() {
        return this.sku;
    }

    private HybridUseBenefitArgs() {}

    private HybridUseBenefitArgs(HybridUseBenefitArgs $) {
        this.planId = $.planId;
        this.scope = $.scope;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridUseBenefitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridUseBenefitArgs $;

        public Builder() {
            $ = new HybridUseBenefitArgs();
        }

        public Builder(HybridUseBenefitArgs defaults) {
            $ = new HybridUseBenefitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planId This is a unique identifier for a plan. Should be a guid.
         * 
         * @return builder
         * 
         */
        public Builder planId(@Nullable Output<String> planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param planId This is a unique identifier for a plan. Should be a guid.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            return planId(Output.of(planId));
        }

        /**
         * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param sku Hybrid use benefit SKU
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Hybrid use benefit SKU
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public HybridUseBenefitArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}

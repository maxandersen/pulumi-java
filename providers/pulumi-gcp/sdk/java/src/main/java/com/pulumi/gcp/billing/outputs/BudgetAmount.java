// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.billing.outputs.BudgetAmountSpecifiedAmount;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetAmount {
    /**
     * Configures a budget amount that is automatically set to 100% of
     * last period&#39;s spend.
     * Boolean. Set value to true to use. Do not set to false, instead
     * use the `specified_amount` block.
     * 
     */
    private final @Nullable Boolean lastPeriodAmount;
    /**
     * A specified amount to use as the budget. currencyCode is
     * optional. If specified, it must match the currency of the
     * billing account. The currencyCode is provided on output.
     * Structure is documented below.
     * 
     */
    private final @Nullable BudgetAmountSpecifiedAmount specifiedAmount;

    @CustomType.Constructor
    private BudgetAmount(
        @CustomType.Parameter("lastPeriodAmount") @Nullable Boolean lastPeriodAmount,
        @CustomType.Parameter("specifiedAmount") @Nullable BudgetAmountSpecifiedAmount specifiedAmount) {
        this.lastPeriodAmount = lastPeriodAmount;
        this.specifiedAmount = specifiedAmount;
    }

    /**
     * Configures a budget amount that is automatically set to 100% of
     * last period&#39;s spend.
     * Boolean. Set value to true to use. Do not set to false, instead
     * use the `specified_amount` block.
     * 
    */
    public Optional<Boolean> lastPeriodAmount() {
        return Optional.ofNullable(this.lastPeriodAmount);
    }
    /**
     * A specified amount to use as the budget. currencyCode is
     * optional. If specified, it must match the currency of the
     * billing account. The currencyCode is provided on output.
     * Structure is documented below.
     * 
    */
    public Optional<BudgetAmountSpecifiedAmount> specifiedAmount() {
        return Optional.ofNullable(this.specifiedAmount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean lastPeriodAmount;
        private @Nullable BudgetAmountSpecifiedAmount specifiedAmount;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPeriodAmount = defaults.lastPeriodAmount;
    	      this.specifiedAmount = defaults.specifiedAmount;
        }

        public Builder lastPeriodAmount(@Nullable Boolean lastPeriodAmount) {
            this.lastPeriodAmount = lastPeriodAmount;
            return this;
        }
        public Builder specifiedAmount(@Nullable BudgetAmountSpecifiedAmount specifiedAmount) {
            this.specifiedAmount = specifiedAmount;
            return this;
        }        public BudgetAmount build() {
            return new BudgetAmount(lastPeriodAmount, specifiedAmount);
        }
    }
}

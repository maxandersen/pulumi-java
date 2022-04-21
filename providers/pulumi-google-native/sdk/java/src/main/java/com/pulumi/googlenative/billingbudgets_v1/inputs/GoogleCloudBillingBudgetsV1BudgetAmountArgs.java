// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1LastPeriodAmountArgs;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleTypeMoneyArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The budgeted amount for each usage period.
 * 
 */
public final class GoogleCloudBillingBudgetsV1BudgetAmountArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1BudgetAmountArgs Empty = new GoogleCloudBillingBudgetsV1BudgetAmountArgs();

    /**
     * Use the last period&#39;s actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget&#39;s time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
     */
    @Import(name="lastPeriodAmount")
    private @Nullable Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs> lastPeriodAmount;

    public Optional<Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs>> lastPeriodAmount() {
        return Optional.ofNullable(this.lastPeriodAmount);
    }

    /**
     * A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
     */
    @Import(name="specifiedAmount")
    private @Nullable Output<GoogleTypeMoneyArgs> specifiedAmount;

    public Optional<Output<GoogleTypeMoneyArgs>> specifiedAmount() {
        return Optional.ofNullable(this.specifiedAmount);
    }

    private GoogleCloudBillingBudgetsV1BudgetAmountArgs() {}

    private GoogleCloudBillingBudgetsV1BudgetAmountArgs(GoogleCloudBillingBudgetsV1BudgetAmountArgs $) {
        this.lastPeriodAmount = $.lastPeriodAmount;
        this.specifiedAmount = $.specifiedAmount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudBillingBudgetsV1BudgetAmountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1BudgetAmountArgs $;

        public Builder() {
            $ = new GoogleCloudBillingBudgetsV1BudgetAmountArgs();
        }

        public Builder(GoogleCloudBillingBudgetsV1BudgetAmountArgs defaults) {
            $ = new GoogleCloudBillingBudgetsV1BudgetAmountArgs(Objects.requireNonNull(defaults));
        }

        public Builder lastPeriodAmount(@Nullable Output<GoogleCloudBillingBudgetsV1LastPeriodAmountArgs> lastPeriodAmount) {
            $.lastPeriodAmount = lastPeriodAmount;
            return this;
        }

        public Builder lastPeriodAmount(GoogleCloudBillingBudgetsV1LastPeriodAmountArgs lastPeriodAmount) {
            return lastPeriodAmount(Output.of(lastPeriodAmount));
        }

        public Builder specifiedAmount(@Nullable Output<GoogleTypeMoneyArgs> specifiedAmount) {
            $.specifiedAmount = specifiedAmount;
            return this;
        }

        public Builder specifiedAmount(GoogleTypeMoneyArgs specifiedAmount) {
            return specifiedAmount(Output.of(specifiedAmount));
        }

        public GoogleCloudBillingBudgetsV1BudgetAmountArgs build() {
            return $;
        }
    }

}

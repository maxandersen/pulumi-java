// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleGetArgs;
import com.pulumi.gcp.billing.inputs.BudgetAmountGetArgs;
import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterGetArgs;
import com.pulumi.gcp.billing.inputs.BudgetThresholdRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetState extends com.pulumi.resources.ResourceArgs {

    public static final BudgetState Empty = new BudgetState();

    /**
     * Defines notifications that are sent on every update to the
     * billing account&#39;s spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    @Import(name="allUpdatesRule")
    private @Nullable Output<BudgetAllUpdatesRuleGetArgs> allUpdatesRule;

    public Optional<Output<BudgetAllUpdatesRuleGetArgs>> allUpdatesRule() {
        return Optional.ofNullable(this.allUpdatesRule);
    }

    /**
     * The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    @Import(name="amount")
    private @Nullable Output<BudgetAmountGetArgs> amount;

    public Optional<Output<BudgetAmountGetArgs>> amount() {
        return Optional.ofNullable(this.amount);
    }

    /**
     * ID of the billing account to set a budget on.
     * 
     */
    @Import(name="billingAccount")
    private @Nullable Output<String> billingAccount;

    public Optional<Output<String>> billingAccount() {
        return Optional.ofNullable(this.billingAccount);
    }

    /**
     * Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    @Import(name="budgetFilter")
    private @Nullable Output<BudgetBudgetFilterGetArgs> budgetFilter;

    public Optional<Output<BudgetBudgetFilterGetArgs>> budgetFilter() {
        return Optional.ofNullable(this.budgetFilter);
    }

    /**
     * User data for display name in UI. Must be &lt;= 60 chars.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Resource name of the budget. The resource name implies the scope of a budget. Values are of the form
     * billingAccounts/{billingAccountId}/budgets/{budgetId}.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    @Import(name="thresholdRules")
    private @Nullable Output<List<BudgetThresholdRuleGetArgs>> thresholdRules;

    public Optional<Output<List<BudgetThresholdRuleGetArgs>>> thresholdRules() {
        return Optional.ofNullable(this.thresholdRules);
    }

    private BudgetState() {}

    private BudgetState(BudgetState $) {
        this.allUpdatesRule = $.allUpdatesRule;
        this.amount = $.amount;
        this.billingAccount = $.billingAccount;
        this.budgetFilter = $.budgetFilter;
        this.displayName = $.displayName;
        this.name = $.name;
        this.thresholdRules = $.thresholdRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetState $;

        public Builder() {
            $ = new BudgetState();
        }

        public Builder(BudgetState defaults) {
            $ = new BudgetState(Objects.requireNonNull(defaults));
        }

        public Builder allUpdatesRule(@Nullable Output<BudgetAllUpdatesRuleGetArgs> allUpdatesRule) {
            $.allUpdatesRule = allUpdatesRule;
            return this;
        }

        public Builder allUpdatesRule(BudgetAllUpdatesRuleGetArgs allUpdatesRule) {
            return allUpdatesRule(Output.of(allUpdatesRule));
        }

        public Builder amount(@Nullable Output<BudgetAmountGetArgs> amount) {
            $.amount = amount;
            return this;
        }

        public Builder amount(BudgetAmountGetArgs amount) {
            return amount(Output.of(amount));
        }

        public Builder billingAccount(@Nullable Output<String> billingAccount) {
            $.billingAccount = billingAccount;
            return this;
        }

        public Builder billingAccount(String billingAccount) {
            return billingAccount(Output.of(billingAccount));
        }

        public Builder budgetFilter(@Nullable Output<BudgetBudgetFilterGetArgs> budgetFilter) {
            $.budgetFilter = budgetFilter;
            return this;
        }

        public Builder budgetFilter(BudgetBudgetFilterGetArgs budgetFilter) {
            return budgetFilter(Output.of(budgetFilter));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder thresholdRules(@Nullable Output<List<BudgetThresholdRuleGetArgs>> thresholdRules) {
            $.thresholdRules = thresholdRules;
            return this;
        }

        public Builder thresholdRules(List<BudgetThresholdRuleGetArgs> thresholdRules) {
            return thresholdRules(Output.of(thresholdRules));
        }

        public Builder thresholdRules(BudgetThresholdRuleGetArgs... thresholdRules) {
            return thresholdRules(List.of(thresholdRules));
        }

        public BudgetState build() {
            return $;
        }
    }

}

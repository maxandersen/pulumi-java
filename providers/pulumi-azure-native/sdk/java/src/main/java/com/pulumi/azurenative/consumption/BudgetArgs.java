// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption;

import com.pulumi.azurenative.consumption.enums.CategoryType;
import com.pulumi.azurenative.consumption.enums.TimeGrainType;
import com.pulumi.azurenative.consumption.inputs.BudgetFilterArgs;
import com.pulumi.azurenative.consumption.inputs.BudgetTimePeriodArgs;
import com.pulumi.azurenative.consumption.inputs.NotificationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetArgs Empty = new BudgetArgs();

    /**
     * The total amount of cost to track with the budget
     * 
     */
    @Import(name="amount", required=true)
      private final Output<Double> amount;

    public Output<Double> amount() {
        return this.amount;
    }

    /**
     * Budget Name.
     * 
     */
    @Import(name="budgetName")
      private final @Nullable Output<String> budgetName;

    public Output<String> budgetName() {
        return this.budgetName == null ? Codegen.empty() : this.budgetName;
    }

    /**
     * The category of the budget, whether the budget tracks cost or usage.
     * 
     */
    @Import(name="category", required=true)
      private final Output<Either<String,CategoryType>> category;

    public Output<Either<String,CategoryType>> category() {
        return this.category;
    }

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> eTag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * May be used to filter budgets by user-specified dimensions and/or tags.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BudgetFilterArgs> filter;

    public Output<BudgetFilterArgs> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * Dictionary of notifications associated with the budget. Budget can have up to five notifications.
     * 
     */
    @Import(name="notifications")
      private final @Nullable Output<Map<String,NotificationArgs>> notifications;

    public Output<Map<String,NotificationArgs>> notifications() {
        return this.notifications == null ? Codegen.empty() : this.notifications;
    }

    /**
     * The scope associated with budget operations. This includes &#39;/subscriptions/{subscriptionId}/&#39; for subscription scope, &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;/providers/Microsoft.Management/managementGroups/{managementGroupId}&#39; for Management Group scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for billingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for invoiceSection scope.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * The time covered by a budget. Tracking of the amount will be reset based on the time grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers
     * 
     */
    @Import(name="timeGrain", required=true)
      private final Output<Either<String,TimeGrainType>> timeGrain;

    public Output<Either<String,TimeGrainType>> timeGrain() {
        return this.timeGrain;
    }

    /**
     * Has start and end date of the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should  be selected within the timegrain period. There are no restrictions on the end date.
     * 
     */
    @Import(name="timePeriod", required=true)
      private final Output<BudgetTimePeriodArgs> timePeriod;

    public Output<BudgetTimePeriodArgs> timePeriod() {
        return this.timePeriod;
    }

    public BudgetArgs(
        Output<Double> amount,
        @Nullable Output<String> budgetName,
        Output<Either<String,CategoryType>> category,
        @Nullable Output<String> eTag,
        @Nullable Output<BudgetFilterArgs> filter,
        @Nullable Output<Map<String,NotificationArgs>> notifications,
        Output<String> scope,
        Output<Either<String,TimeGrainType>> timeGrain,
        Output<BudgetTimePeriodArgs> timePeriod) {
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.budgetName = budgetName;
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.eTag = eTag;
        this.filter = filter;
        this.notifications = notifications;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.timeGrain = Objects.requireNonNull(timeGrain, "expected parameter 'timeGrain' to be non-null");
        this.timePeriod = Objects.requireNonNull(timePeriod, "expected parameter 'timePeriod' to be non-null");
    }

    private BudgetArgs() {
        this.amount = Codegen.empty();
        this.budgetName = Codegen.empty();
        this.category = Codegen.empty();
        this.eTag = Codegen.empty();
        this.filter = Codegen.empty();
        this.notifications = Codegen.empty();
        this.scope = Codegen.empty();
        this.timeGrain = Codegen.empty();
        this.timePeriod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Double> amount;
        private @Nullable Output<String> budgetName;
        private Output<Either<String,CategoryType>> category;
        private @Nullable Output<String> eTag;
        private @Nullable Output<BudgetFilterArgs> filter;
        private @Nullable Output<Map<String,NotificationArgs>> notifications;
        private Output<String> scope;
        private Output<Either<String,TimeGrainType>> timeGrain;
        private Output<BudgetTimePeriodArgs> timePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.budgetName = defaults.budgetName;
    	      this.category = defaults.category;
    	      this.eTag = defaults.eTag;
    	      this.filter = defaults.filter;
    	      this.notifications = defaults.notifications;
    	      this.scope = defaults.scope;
    	      this.timeGrain = defaults.timeGrain;
    	      this.timePeriod = defaults.timePeriod;
        }

        public Builder amount(Output<Double> amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        public Builder amount(Double amount) {
            this.amount = Output.of(Objects.requireNonNull(amount));
            return this;
        }
        public Builder budgetName(@Nullable Output<String> budgetName) {
            this.budgetName = budgetName;
            return this;
        }
        public Builder budgetName(@Nullable String budgetName) {
            this.budgetName = Codegen.ofNullable(budgetName);
            return this;
        }
        public Builder category(Output<Either<String,CategoryType>> category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder category(Either<String,CategoryType> category) {
            this.category = Output.of(Objects.requireNonNull(category));
            return this;
        }
        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
            return this;
        }
        public Builder filter(@Nullable Output<BudgetFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable BudgetFilterArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder notifications(@Nullable Output<Map<String,NotificationArgs>> notifications) {
            this.notifications = notifications;
            return this;
        }
        public Builder notifications(@Nullable Map<String,NotificationArgs> notifications) {
            this.notifications = Codegen.ofNullable(notifications);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder timeGrain(Output<Either<String,TimeGrainType>> timeGrain) {
            this.timeGrain = Objects.requireNonNull(timeGrain);
            return this;
        }
        public Builder timeGrain(Either<String,TimeGrainType> timeGrain) {
            this.timeGrain = Output.of(Objects.requireNonNull(timeGrain));
            return this;
        }
        public Builder timePeriod(Output<BudgetTimePeriodArgs> timePeriod) {
            this.timePeriod = Objects.requireNonNull(timePeriod);
            return this;
        }
        public Builder timePeriod(BudgetTimePeriodArgs timePeriod) {
            this.timePeriod = Output.of(Objects.requireNonNull(timePeriod));
            return this;
        }        public BudgetArgs build() {
            return new BudgetArgs(amount, budgetName, category, eTag, filter, notifications, scope, timeGrain, timePeriod);
        }
    }
}

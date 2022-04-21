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
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetArgs Empty = new BudgetArgs();

    /**
     * The total amount of cost to track with the budget
     * 
     */
    @Import(name="amount", required=true)
    private Output<Double> amount;

    public Output<Double> amount() {
        return this.amount;
    }

    /**
     * Budget Name.
     * 
     */
    @Import(name="budgetName")
    private @Nullable Output<String> budgetName;

    public Optional<Output<String>> budgetName() {
        return Optional.ofNullable(this.budgetName);
    }

    /**
     * The category of the budget, whether the budget tracks cost or usage.
     * 
     */
    @Import(name="category", required=true)
    private Output<Either<String,CategoryType>> category;

    public Output<Either<String,CategoryType>> category() {
        return this.category;
    }

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * May be used to filter budgets by user-specified dimensions and/or tags.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<BudgetFilterArgs> filter;

    public Optional<Output<BudgetFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Dictionary of notifications associated with the budget. Budget can have up to five notifications.
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<Map<String,NotificationArgs>> notifications;

    public Optional<Output<Map<String,NotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * The scope associated with budget operations. This includes &#39;/subscriptions/{subscriptionId}/&#39; for subscription scope, &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;/providers/Microsoft.Management/managementGroups/{managementGroupId}&#39; for Management Group scope, &#39;/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for billingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for invoiceSection scope.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * The time covered by a budget. Tracking of the amount will be reset based on the time grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers
     * 
     */
    @Import(name="timeGrain", required=true)
    private Output<Either<String,TimeGrainType>> timeGrain;

    public Output<Either<String,TimeGrainType>> timeGrain() {
        return this.timeGrain;
    }

    /**
     * Has start and end date of the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should  be selected within the timegrain period. There are no restrictions on the end date.
     * 
     */
    @Import(name="timePeriod", required=true)
    private Output<BudgetTimePeriodArgs> timePeriod;

    public Output<BudgetTimePeriodArgs> timePeriod() {
        return this.timePeriod;
    }

    private BudgetArgs() {}

    private BudgetArgs(BudgetArgs $) {
        this.amount = $.amount;
        this.budgetName = $.budgetName;
        this.category = $.category;
        this.eTag = $.eTag;
        this.filter = $.filter;
        this.notifications = $.notifications;
        this.scope = $.scope;
        this.timeGrain = $.timeGrain;
        this.timePeriod = $.timePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetArgs $;

        public Builder() {
            $ = new BudgetArgs();
        }

        public Builder(BudgetArgs defaults) {
            $ = new BudgetArgs(Objects.requireNonNull(defaults));
        }

        public Builder amount(Output<Double> amount) {
            $.amount = amount;
            return this;
        }

        public Builder amount(Double amount) {
            return amount(Output.of(amount));
        }

        public Builder budgetName(@Nullable Output<String> budgetName) {
            $.budgetName = budgetName;
            return this;
        }

        public Builder budgetName(String budgetName) {
            return budgetName(Output.of(budgetName));
        }

        public Builder category(Output<Either<String,CategoryType>> category) {
            $.category = category;
            return this;
        }

        public Builder category(Either<String,CategoryType> category) {
            return category(Output.of(category));
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        public Builder filter(@Nullable Output<BudgetFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(BudgetFilterArgs filter) {
            return filter(Output.of(filter));
        }

        public Builder notifications(@Nullable Output<Map<String,NotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        public Builder notifications(Map<String,NotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder timeGrain(Output<Either<String,TimeGrainType>> timeGrain) {
            $.timeGrain = timeGrain;
            return this;
        }

        public Builder timeGrain(Either<String,TimeGrainType> timeGrain) {
            return timeGrain(Output.of(timeGrain));
        }

        public Builder timePeriod(Output<BudgetTimePeriodArgs> timePeriod) {
            $.timePeriod = timePeriod;
            return this;
        }

        public Builder timePeriod(BudgetTimePeriodArgs timePeriod) {
            return timePeriod(Output.of(timePeriod));
        }

        public BudgetArgs build() {
            $.amount = Objects.requireNonNull($.amount, "expected parameter 'amount' to be non-null");
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.timeGrain = Objects.requireNonNull($.timeGrain, "expected parameter 'timeGrain' to be non-null");
            $.timePeriod = Objects.requireNonNull($.timePeriod, "expected parameter 'timePeriod' to be non-null");
            return $;
        }
    }

}

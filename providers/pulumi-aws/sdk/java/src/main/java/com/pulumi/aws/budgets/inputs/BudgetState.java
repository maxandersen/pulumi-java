// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.aws.budgets.inputs.BudgetCostTypesGetArgs;
import com.pulumi.aws.budgets.inputs.BudgetNotificationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetState extends com.pulumi.resources.ResourceArgs {

    public static final BudgetState Empty = new BudgetState();

    /**
     * The ID of the target account for budget. Will use current user&#39;s account_id by default if omitted.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The ARN of the budget.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Whether this budget tracks monetary cost or usage.
     * 
     */
    @Import(name="budgetType")
      private final @Nullable Output<String> budgetType;

    public Output<String> budgetType() {
        return this.budgetType == null ? Codegen.empty() : this.budgetType;
    }

    /**
     * Map of CostFilters key/value pairs to apply to the budget.
     * 
     */
    @Import(name="costFilters")
      private final @Nullable Output<Map<String,String>> costFilters;

    public Output<Map<String,String>> costFilters() {
        return this.costFilters == null ? Codegen.empty() : this.costFilters;
    }

    /**
     * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     * 
     */
    @Import(name="costTypes")
      private final @Nullable Output<BudgetCostTypesGetArgs> costTypes;

    public Output<BudgetCostTypesGetArgs> costTypes() {
        return this.costTypes == null ? Codegen.empty() : this.costTypes;
    }

    /**
     * The amount of cost or usage being measured for a budget.
     * 
     */
    @Import(name="limitAmount")
      private final @Nullable Output<String> limitAmount;

    public Output<String> limitAmount() {
        return this.limitAmount == null ? Codegen.empty() : this.limitAmount;
    }

    /**
     * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     * 
     */
    @Import(name="limitUnit")
      private final @Nullable Output<String> limitUnit;

    public Output<String> limitUnit() {
        return this.limitUnit == null ? Codegen.empty() : this.limitUnit;
    }

    /**
     * The name of a budget. Unique within accounts.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The prefix of the name of a budget. Unique within accounts.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
     * 
     */
    @Import(name="notifications")
      private final @Nullable Output<List<BudgetNotificationGetArgs>> notifications;

    public Output<List<BudgetNotificationGetArgs>> notifications() {
        return this.notifications == null ? Codegen.empty() : this.notifications;
    }

    /**
     * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
     * 
     */
    @Import(name="timePeriodEnd")
      private final @Nullable Output<String> timePeriodEnd;

    public Output<String> timePeriodEnd() {
        return this.timePeriodEnd == null ? Codegen.empty() : this.timePeriodEnd;
    }

    /**
     * The start of the time period covered by the budget. If you don&#39;t specify a start date, AWS defaults to the start of your chosen time period. The start date must come before the end date. Format: `2017-01-01_12:00`.
     * 
     */
    @Import(name="timePeriodStart")
      private final @Nullable Output<String> timePeriodStart;

    public Output<String> timePeriodStart() {
        return this.timePeriodStart == null ? Codegen.empty() : this.timePeriodStart;
    }

    /**
     * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`, and `DAILY`.
     * 
     */
    @Import(name="timeUnit")
      private final @Nullable Output<String> timeUnit;

    public Output<String> timeUnit() {
        return this.timeUnit == null ? Codegen.empty() : this.timeUnit;
    }

    public BudgetState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> arn,
        @Nullable Output<String> budgetType,
        @Nullable Output<Map<String,String>> costFilters,
        @Nullable Output<BudgetCostTypesGetArgs> costTypes,
        @Nullable Output<String> limitAmount,
        @Nullable Output<String> limitUnit,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<List<BudgetNotificationGetArgs>> notifications,
        @Nullable Output<String> timePeriodEnd,
        @Nullable Output<String> timePeriodStart,
        @Nullable Output<String> timeUnit) {
        this.accountId = accountId;
        this.arn = arn;
        this.budgetType = budgetType;
        this.costFilters = costFilters;
        this.costTypes = costTypes;
        this.limitAmount = limitAmount;
        this.limitUnit = limitUnit;
        this.name = name;
        this.namePrefix = namePrefix;
        this.notifications = notifications;
        this.timePeriodEnd = timePeriodEnd;
        this.timePeriodStart = timePeriodStart;
        this.timeUnit = timeUnit;
    }

    private BudgetState() {
        this.accountId = Codegen.empty();
        this.arn = Codegen.empty();
        this.budgetType = Codegen.empty();
        this.costFilters = Codegen.empty();
        this.costTypes = Codegen.empty();
        this.limitAmount = Codegen.empty();
        this.limitUnit = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.notifications = Codegen.empty();
        this.timePeriodEnd = Codegen.empty();
        this.timePeriodStart = Codegen.empty();
        this.timeUnit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> budgetType;
        private @Nullable Output<Map<String,String>> costFilters;
        private @Nullable Output<BudgetCostTypesGetArgs> costTypes;
        private @Nullable Output<String> limitAmount;
        private @Nullable Output<String> limitUnit;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<List<BudgetNotificationGetArgs>> notifications;
        private @Nullable Output<String> timePeriodEnd;
        private @Nullable Output<String> timePeriodStart;
        private @Nullable Output<String> timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.budgetType = defaults.budgetType;
    	      this.costFilters = defaults.costFilters;
    	      this.costTypes = defaults.costTypes;
    	      this.limitAmount = defaults.limitAmount;
    	      this.limitUnit = defaults.limitUnit;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.notifications = defaults.notifications;
    	      this.timePeriodEnd = defaults.timePeriodEnd;
    	      this.timePeriodStart = defaults.timePeriodStart;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder budgetType(@Nullable Output<String> budgetType) {
            this.budgetType = budgetType;
            return this;
        }
        public Builder budgetType(@Nullable String budgetType) {
            this.budgetType = Codegen.ofNullable(budgetType);
            return this;
        }
        public Builder costFilters(@Nullable Output<Map<String,String>> costFilters) {
            this.costFilters = costFilters;
            return this;
        }
        public Builder costFilters(@Nullable Map<String,String> costFilters) {
            this.costFilters = Codegen.ofNullable(costFilters);
            return this;
        }
        public Builder costTypes(@Nullable Output<BudgetCostTypesGetArgs> costTypes) {
            this.costTypes = costTypes;
            return this;
        }
        public Builder costTypes(@Nullable BudgetCostTypesGetArgs costTypes) {
            this.costTypes = Codegen.ofNullable(costTypes);
            return this;
        }
        public Builder limitAmount(@Nullable Output<String> limitAmount) {
            this.limitAmount = limitAmount;
            return this;
        }
        public Builder limitAmount(@Nullable String limitAmount) {
            this.limitAmount = Codegen.ofNullable(limitAmount);
            return this;
        }
        public Builder limitUnit(@Nullable Output<String> limitUnit) {
            this.limitUnit = limitUnit;
            return this;
        }
        public Builder limitUnit(@Nullable String limitUnit) {
            this.limitUnit = Codegen.ofNullable(limitUnit);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder notifications(@Nullable Output<List<BudgetNotificationGetArgs>> notifications) {
            this.notifications = notifications;
            return this;
        }
        public Builder notifications(@Nullable List<BudgetNotificationGetArgs> notifications) {
            this.notifications = Codegen.ofNullable(notifications);
            return this;
        }
        public Builder notifications(BudgetNotificationGetArgs... notifications) {
            return notifications(List.of(notifications));
        }
        public Builder timePeriodEnd(@Nullable Output<String> timePeriodEnd) {
            this.timePeriodEnd = timePeriodEnd;
            return this;
        }
        public Builder timePeriodEnd(@Nullable String timePeriodEnd) {
            this.timePeriodEnd = Codegen.ofNullable(timePeriodEnd);
            return this;
        }
        public Builder timePeriodStart(@Nullable Output<String> timePeriodStart) {
            this.timePeriodStart = timePeriodStart;
            return this;
        }
        public Builder timePeriodStart(@Nullable String timePeriodStart) {
            this.timePeriodStart = Codegen.ofNullable(timePeriodStart);
            return this;
        }
        public Builder timeUnit(@Nullable Output<String> timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Builder timeUnit(@Nullable String timeUnit) {
            this.timeUnit = Codegen.ofNullable(timeUnit);
            return this;
        }        public BudgetState build() {
            return new BudgetState(accountId, arn, budgetType, costFilters, costTypes, limitAmount, limitUnit, name, namePrefix, notifications, timePeriodEnd, timePeriodStart, timeUnit);
        }
    }
}

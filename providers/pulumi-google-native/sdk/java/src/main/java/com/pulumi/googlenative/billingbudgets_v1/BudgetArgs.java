// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1BudgetAmountArgs;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1FilterArgs;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1NotificationsRuleArgs;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1ThresholdRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetArgs Empty = new BudgetArgs();

    /**
     * Budgeted amount.
     * 
     */
    @Import(name="amount", required=true)
    private Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount;

    /**
     * @return Budgeted amount.
     * 
     */
    public Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount() {
        return this.amount;
    }

    @Import(name="billingAccountId", required=true)
    private Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget&#39;s time period, as well as other filters.
     * 
     */
    @Import(name="budgetFilter")
    private @Nullable Output<GoogleCloudBillingBudgetsV1FilterArgs> budgetFilter;

    /**
     * @return Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget&#39;s time period, as well as other filters.
     * 
     */
    public Optional<Output<GoogleCloudBillingBudgetsV1FilterArgs>> budgetFilter() {
        return Optional.ofNullable(this.budgetFilter);
    }

    /**
     * User data for display name in UI. The name must be less than or equal to 60 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User data for display name in UI. The name must be less than or equal to 60 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
     */
    @Import(name="notificationsRule")
    private @Nullable Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs> notificationsRule;

    /**
     * @return Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
     */
    public Optional<Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs>> notificationsRule() {
        return Optional.ofNullable(this.notificationsRule);
    }

    /**
     * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
     */
    @Import(name="thresholdRules")
    private @Nullable Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>> thresholdRules;

    /**
     * @return Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
     */
    public Optional<Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>>> thresholdRules() {
        return Optional.ofNullable(this.thresholdRules);
    }

    private BudgetArgs() {}

    private BudgetArgs(BudgetArgs $) {
        this.amount = $.amount;
        this.billingAccountId = $.billingAccountId;
        this.budgetFilter = $.budgetFilter;
        this.displayName = $.displayName;
        this.etag = $.etag;
        this.notificationsRule = $.notificationsRule;
        this.thresholdRules = $.thresholdRules;
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

        /**
         * @param amount Budgeted amount.
         * 
         * @return builder
         * 
         */
        public Builder amount(Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount) {
            $.amount = amount;
            return this;
        }

        /**
         * @param amount Budgeted amount.
         * 
         * @return builder
         * 
         */
        public Builder amount(GoogleCloudBillingBudgetsV1BudgetAmountArgs amount) {
            return amount(Output.of(amount));
        }

        public Builder billingAccountId(Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        /**
         * @param budgetFilter Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget&#39;s time period, as well as other filters.
         * 
         * @return builder
         * 
         */
        public Builder budgetFilter(@Nullable Output<GoogleCloudBillingBudgetsV1FilterArgs> budgetFilter) {
            $.budgetFilter = budgetFilter;
            return this;
        }

        /**
         * @param budgetFilter Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget&#39;s time period, as well as other filters.
         * 
         * @return builder
         * 
         */
        public Builder budgetFilter(GoogleCloudBillingBudgetsV1FilterArgs budgetFilter) {
            return budgetFilter(Output.of(budgetFilter));
        }

        /**
         * @param displayName User data for display name in UI. The name must be less than or equal to 60 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User data for display name in UI. The name must be less than or equal to 60 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param etag Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param notificationsRule Optional. Rules to apply to notifications sent based on budget spend and thresholds.
         * 
         * @return builder
         * 
         */
        public Builder notificationsRule(@Nullable Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs> notificationsRule) {
            $.notificationsRule = notificationsRule;
            return this;
        }

        /**
         * @param notificationsRule Optional. Rules to apply to notifications sent based on budget spend and thresholds.
         * 
         * @return builder
         * 
         */
        public Builder notificationsRule(GoogleCloudBillingBudgetsV1NotificationsRuleArgs notificationsRule) {
            return notificationsRule(Output.of(notificationsRule));
        }

        /**
         * @param thresholdRules Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
         * 
         * @return builder
         * 
         */
        public Builder thresholdRules(@Nullable Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>> thresholdRules) {
            $.thresholdRules = thresholdRules;
            return this;
        }

        /**
         * @param thresholdRules Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
         * 
         * @return builder
         * 
         */
        public Builder thresholdRules(List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs> thresholdRules) {
            return thresholdRules(Output.of(thresholdRules));
        }

        /**
         * @param thresholdRules Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
         * 
         * @return builder
         * 
         */
        public Builder thresholdRules(GoogleCloudBillingBudgetsV1ThresholdRuleArgs... thresholdRules) {
            return thresholdRules(List.of(thresholdRules));
        }

        public BudgetArgs build() {
            $.amount = Objects.requireNonNull($.amount, "expected parameter 'amount' to be non-null");
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * NotificationsRule defines notifications that are sent based on budget spend and thresholds.
 * 
 */
public final class GoogleCloudBillingBudgetsV1NotificationsRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudBillingBudgetsV1NotificationsRuleResponse Empty = new GoogleCloudBillingBudgetsV1NotificationsRuleResponse();

    /**
     * Optional. When set to true, disables default notifications sent when a threshold is exceeded. Default notifications are sent to those with Billing Account Administrator and Billing Account User IAM roles for the target account.
     * 
     */
    @Import(name="disableDefaultIamRecipients", required=true)
      private final Boolean disableDefaultIamRecipients;

    public Boolean disableDefaultIamRecipients() {
        return this.disableDefaultIamRecipients;
    }

    /**
     * Optional. Email targets to send notifications to when a threshold is exceeded. This is in addition to the `DefaultIamRecipients` who receive alert emails based on their billing account IAM role. The value is the full REST resource name of a Cloud Monitoring email notification channel with the form `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 email notifications are allowed. To customize budget alert email recipients with monitoring notification channels, you _must create the monitoring notification channels before you link them to a budget_. For guidance on setting up notification channels to use with budgets, see [Customize budget alert email recipients](https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients). For Cloud Billing budget alerts, you _must use email notification channels_. The other types of notification channels are _not_ supported, such as Slack, SMS, or PagerDuty. If you want to [send budget notifications to Slack](https://cloud.google.com/billing/docs/how-to/notify#send_notifications_to_slack), use a pubsubTopic and configure [programmatic notifications](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications).
     * 
     */
    @Import(name="monitoringNotificationChannels", required=true)
      private final List<String> monitoringNotificationChannels;

    public List<String> monitoringNotificationChannels() {
        return this.monitoringNotificationChannels;
    }

    /**
     * Optional. The name of the Pub/Sub topic where budget-related messages are published, in the form `projects/{project_id}/topics/{topic_id}`. Updates are sent to the topic at regular intervals; the timing of the updates is not dependent on the [threshold rules](#thresholdrule) you&#39;ve set. Note that if you want your [Pub/Sub JSON object](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format) to contain data for `alertThresholdExceeded`, you need at least one [alert threshold rule](#thresholdrule). When you set threshold rules, you must also enable at least one of the email notification options, either using the default IAM recipients or Cloud Monitoring email notification channels. To use Pub/Sub topics with budgets, you must do the following: 1. Create the Pub/Sub topic before connecting it to your budget. For guidance, see [Manage programmatic budget alert notifications](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications). 2. Grant the API caller the `pubsub.topics.setIamPolicy` permission on the Pub/Sub topic. If not set, the API call fails with PERMISSION_DENIED. For additional details on Pub/Sub roles and permissions, see [Permissions required for this task](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#permissions_required_for_this_task).
     * 
     */
    @Import(name="pubsubTopic", required=true)
      private final String pubsubTopic;

    public String pubsubTopic() {
        return this.pubsubTopic;
    }

    /**
     * Optional. Required when NotificationsRule.pubsub_topic is set. The schema version of the notification sent to NotificationsRule.pubsub_topic. Only &#34;1.0&#34; is accepted. It represents the JSON schema as defined in https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format.
     * 
     */
    @Import(name="schemaVersion", required=true)
      private final String schemaVersion;

    public String schemaVersion() {
        return this.schemaVersion;
    }

    public GoogleCloudBillingBudgetsV1NotificationsRuleResponse(
        Boolean disableDefaultIamRecipients,
        List<String> monitoringNotificationChannels,
        String pubsubTopic,
        String schemaVersion) {
        this.disableDefaultIamRecipients = Objects.requireNonNull(disableDefaultIamRecipients, "expected parameter 'disableDefaultIamRecipients' to be non-null");
        this.monitoringNotificationChannels = Objects.requireNonNull(monitoringNotificationChannels, "expected parameter 'monitoringNotificationChannels' to be non-null");
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
        this.schemaVersion = Objects.requireNonNull(schemaVersion, "expected parameter 'schemaVersion' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1NotificationsRuleResponse() {
        this.disableDefaultIamRecipients = null;
        this.monitoringNotificationChannels = List.of();
        this.pubsubTopic = null;
        this.schemaVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1NotificationsRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableDefaultIamRecipients;
        private List<String> monitoringNotificationChannels;
        private String pubsubTopic;
        private String schemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1NotificationsRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDefaultIamRecipients = defaults.disableDefaultIamRecipients;
    	      this.monitoringNotificationChannels = defaults.monitoringNotificationChannels;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.schemaVersion = defaults.schemaVersion;
        }

        public Builder disableDefaultIamRecipients(Boolean disableDefaultIamRecipients) {
            this.disableDefaultIamRecipients = Objects.requireNonNull(disableDefaultIamRecipients);
            return this;
        }
        public Builder monitoringNotificationChannels(List<String> monitoringNotificationChannels) {
            this.monitoringNotificationChannels = Objects.requireNonNull(monitoringNotificationChannels);
            return this;
        }
        public Builder monitoringNotificationChannels(String... monitoringNotificationChannels) {
            return monitoringNotificationChannels(List.of(monitoringNotificationChannels));
        }
        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = Objects.requireNonNull(schemaVersion);
            return this;
        }        public GoogleCloudBillingBudgetsV1NotificationsRuleResponse build() {
            return new GoogleCloudBillingBudgetsV1NotificationsRuleResponse(disableDefaultIamRecipients, monitoringNotificationChannels, pubsubTopic, schemaVersion);
        }
    }
}

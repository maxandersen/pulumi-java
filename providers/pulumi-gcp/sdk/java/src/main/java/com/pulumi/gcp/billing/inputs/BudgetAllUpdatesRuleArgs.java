// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetAllUpdatesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetAllUpdatesRuleArgs Empty = new BudgetAllUpdatesRuleArgs();

    /**
     * Boolean. When set to true, disables default notifications sent
     * when a threshold is exceeded. Default recipients are
     * those with Billing Account Administrators and Billing
     * Account Users IAM roles for the target account.
     * 
     */
    @Import(name="disableDefaultIamRecipients")
    private @Nullable Output<Boolean> disableDefaultIamRecipients;

    public Optional<Output<Boolean>> disableDefaultIamRecipients() {
        return Optional.ofNullable(this.disableDefaultIamRecipients);
    }

    /**
     * The full resource name of a monitoring notification
     * channel in the form
     * projects/{project_id}/notificationChannels/{channel_id}.
     * A maximum of 5 channels are allowed.
     * 
     */
    @Import(name="monitoringNotificationChannels")
    private @Nullable Output<List<String>> monitoringNotificationChannels;

    public Optional<Output<List<String>>> monitoringNotificationChannels() {
        return Optional.ofNullable(this.monitoringNotificationChannels);
    }

    /**
     * The name of the Cloud Pub/Sub topic where budget related
     * messages will be published, in the form
     * projects/{project_id}/topics/{topic_id}. Updates are sent
     * at regular intervals to the topic.
     * 
     */
    @Import(name="pubsubTopic")
    private @Nullable Output<String> pubsubTopic;

    public Optional<Output<String>> pubsubTopic() {
        return Optional.ofNullable(this.pubsubTopic);
    }

    /**
     * The schema version of the notification. Only &#34;1.0&#34; is
     * accepted. It represents the JSON schema as defined in
     * https://cloud.google.com/billing/docs/how-to/budgets#notification_format.
     * 
     */
    @Import(name="schemaVersion")
    private @Nullable Output<String> schemaVersion;

    public Optional<Output<String>> schemaVersion() {
        return Optional.ofNullable(this.schemaVersion);
    }

    private BudgetAllUpdatesRuleArgs() {}

    private BudgetAllUpdatesRuleArgs(BudgetAllUpdatesRuleArgs $) {
        this.disableDefaultIamRecipients = $.disableDefaultIamRecipients;
        this.monitoringNotificationChannels = $.monitoringNotificationChannels;
        this.pubsubTopic = $.pubsubTopic;
        this.schemaVersion = $.schemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetAllUpdatesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetAllUpdatesRuleArgs $;

        public Builder() {
            $ = new BudgetAllUpdatesRuleArgs();
        }

        public Builder(BudgetAllUpdatesRuleArgs defaults) {
            $ = new BudgetAllUpdatesRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder disableDefaultIamRecipients(@Nullable Output<Boolean> disableDefaultIamRecipients) {
            $.disableDefaultIamRecipients = disableDefaultIamRecipients;
            return this;
        }

        public Builder disableDefaultIamRecipients(Boolean disableDefaultIamRecipients) {
            return disableDefaultIamRecipients(Output.of(disableDefaultIamRecipients));
        }

        public Builder monitoringNotificationChannels(@Nullable Output<List<String>> monitoringNotificationChannels) {
            $.monitoringNotificationChannels = monitoringNotificationChannels;
            return this;
        }

        public Builder monitoringNotificationChannels(List<String> monitoringNotificationChannels) {
            return monitoringNotificationChannels(Output.of(monitoringNotificationChannels));
        }

        public Builder monitoringNotificationChannels(String... monitoringNotificationChannels) {
            return monitoringNotificationChannels(List.of(monitoringNotificationChannels));
        }

        public Builder pubsubTopic(@Nullable Output<String> pubsubTopic) {
            $.pubsubTopic = pubsubTopic;
            return this;
        }

        public Builder pubsubTopic(String pubsubTopic) {
            return pubsubTopic(Output.of(pubsubTopic));
        }

        public Builder schemaVersion(@Nullable Output<String> schemaVersion) {
            $.schemaVersion = schemaVersion;
            return this;
        }

        public Builder schemaVersion(String schemaVersion) {
            return schemaVersion(Output.of(schemaVersion));
        }

        public BudgetAllUpdatesRuleArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring_v3.outputs.AlertStrategyResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.ConditionResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.DocumentationResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.MutationRecordResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAlertPolicyResult {
    /**
     * Control over how this alert policy&#39;s notification channels are notified.
     * 
     */
    private final AlertStrategyResponse alertStrategy;
    /**
     * How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    private final String combiner;
    /**
     * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    private final List<ConditionResponse> conditions;
    /**
     * A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    private final MutationRecordResponse creationRecord;
    /**
     * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    private final String displayName;
    /**
     * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    private final DocumentationResponse documentation;
    /**
     * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    private final Boolean enabled;
    /**
     * A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    private final MutationRecordResponse mutationRecord;
    /**
     * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    private final String name;
    /**
     * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    private final List<String> notificationChannels;
    /**
     * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    private final Map<String,String> userLabels;
    /**
     * Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    private final StatusResponse validity;

    @CustomType.Constructor
    private GetAlertPolicyResult(
        @CustomType.Parameter("alertStrategy") AlertStrategyResponse alertStrategy,
        @CustomType.Parameter("combiner") String combiner,
        @CustomType.Parameter("conditions") List<ConditionResponse> conditions,
        @CustomType.Parameter("creationRecord") MutationRecordResponse creationRecord,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("documentation") DocumentationResponse documentation,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("mutationRecord") MutationRecordResponse mutationRecord,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationChannels") List<String> notificationChannels,
        @CustomType.Parameter("userLabels") Map<String,String> userLabels,
        @CustomType.Parameter("validity") StatusResponse validity) {
        this.alertStrategy = alertStrategy;
        this.combiner = combiner;
        this.conditions = conditions;
        this.creationRecord = creationRecord;
        this.displayName = displayName;
        this.documentation = documentation;
        this.enabled = enabled;
        this.mutationRecord = mutationRecord;
        this.name = name;
        this.notificationChannels = notificationChannels;
        this.userLabels = userLabels;
        this.validity = validity;
    }

    /**
     * Control over how this alert policy&#39;s notification channels are notified.
     * 
    */
    public AlertStrategyResponse alertStrategy() {
        return this.alertStrategy;
    }
    /**
     * How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
    */
    public String combiner() {
        return this.combiner;
    }
    /**
     * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
    */
    public List<ConditionResponse> conditions() {
        return this.conditions;
    }
    /**
     * A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
    */
    public MutationRecordResponse creationRecord() {
        return this.creationRecord;
    }
    /**
     * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
    */
    public DocumentationResponse documentation() {
        return this.documentation;
    }
    /**
     * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
    */
    public MutationRecordResponse mutationRecord() {
        return this.mutationRecord;
    }
    /**
     * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
    */
    public List<String> notificationChannels() {
        return this.notificationChannels;
    }
    /**
     * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
    */
    public Map<String,String> userLabels() {
        return this.userLabels;
    }
    /**
     * Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
    */
    public StatusResponse validity() {
        return this.validity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertStrategyResponse alertStrategy;
        private String combiner;
        private List<ConditionResponse> conditions;
        private MutationRecordResponse creationRecord;
        private String displayName;
        private DocumentationResponse documentation;
        private Boolean enabled;
        private MutationRecordResponse mutationRecord;
        private String name;
        private List<String> notificationChannels;
        private Map<String,String> userLabels;
        private StatusResponse validity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertStrategy = defaults.alertStrategy;
    	      this.combiner = defaults.combiner;
    	      this.conditions = defaults.conditions;
    	      this.creationRecord = defaults.creationRecord;
    	      this.displayName = defaults.displayName;
    	      this.documentation = defaults.documentation;
    	      this.enabled = defaults.enabled;
    	      this.mutationRecord = defaults.mutationRecord;
    	      this.name = defaults.name;
    	      this.notificationChannels = defaults.notificationChannels;
    	      this.userLabels = defaults.userLabels;
    	      this.validity = defaults.validity;
        }

        public Builder alertStrategy(AlertStrategyResponse alertStrategy) {
            this.alertStrategy = Objects.requireNonNull(alertStrategy);
            return this;
        }
        public Builder combiner(String combiner) {
            this.combiner = Objects.requireNonNull(combiner);
            return this;
        }
        public Builder conditions(List<ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder creationRecord(MutationRecordResponse creationRecord) {
            this.creationRecord = Objects.requireNonNull(creationRecord);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder documentation(DocumentationResponse documentation) {
            this.documentation = Objects.requireNonNull(documentation);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder mutationRecord(MutationRecordResponse mutationRecord) {
            this.mutationRecord = Objects.requireNonNull(mutationRecord);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationChannels(List<String> notificationChannels) {
            this.notificationChannels = Objects.requireNonNull(notificationChannels);
            return this;
        }
        public Builder notificationChannels(String... notificationChannels) {
            return notificationChannels(List.of(notificationChannels));
        }
        public Builder userLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }
        public Builder validity(StatusResponse validity) {
            this.validity = Objects.requireNonNull(validity);
            return this;
        }        public GetAlertPolicyResult build() {
            return new GetAlertPolicyResult(alertStrategy, combiner, conditions, creationRecord, displayName, documentation, enabled, mutationRecord, name, notificationChannels, userLabels, validity);
        }
    }
}

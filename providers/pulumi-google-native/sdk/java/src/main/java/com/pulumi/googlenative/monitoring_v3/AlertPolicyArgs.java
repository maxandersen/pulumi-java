// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.monitoring_v3.enums.AlertPolicyCombiner;
import com.pulumi.googlenative.monitoring_v3.inputs.AlertStrategyArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.ConditionArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.DocumentationArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.MutationRecordArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.StatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyArgs Empty = new AlertPolicyArgs();

    /**
     * Control over how this alert policy's notification channels are notified.
     * 
     */
    @Import(name="alertStrategy")
      private final @Nullable Output<AlertStrategyArgs> alertStrategy;

    public Output<AlertStrategyArgs> alertStrategy() {
        return this.alertStrategy == null ? Codegen.empty() : this.alertStrategy;
    }

    /**
     * How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    @Import(name="combiner")
      private final @Nullable Output<AlertPolicyCombiner> combiner;

    public Output<AlertPolicyCombiner> combiner() {
        return this.combiner == null ? Codegen.empty() : this.combiner;
    }

    /**
     * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<ConditionArgs>> conditions;

    public Output<List<ConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @Import(name="creationRecord")
      private final @Nullable Output<MutationRecordArgs> creationRecord;

    public Output<MutationRecordArgs> creationRecord() {
        return this.creationRecord == null ? Codegen.empty() : this.creationRecord;
    }

    /**
     * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    @Import(name="documentation")
      private final @Nullable Output<DocumentationArgs> documentation;

    public Output<DocumentationArgs> documentation() {
        return this.documentation == null ? Codegen.empty() : this.documentation;
    }

    /**
     * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @Import(name="mutationRecord")
      private final @Nullable Output<MutationRecordArgs> mutationRecord;

    public Output<MutationRecordArgs> mutationRecord() {
        return this.mutationRecord == null ? Codegen.empty() : this.mutationRecord;
    }

    /**
     * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    @Import(name="notificationChannels")
      private final @Nullable Output<List<String>> notificationChannels;

    public Output<List<String>> notificationChannels() {
        return this.notificationChannels == null ? Codegen.empty() : this.notificationChannels;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @Import(name="userLabels")
      private final @Nullable Output<Map<String,String>> userLabels;

    public Output<Map<String,String>> userLabels() {
        return this.userLabels == null ? Codegen.empty() : this.userLabels;
    }

    /**
     * Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    @Import(name="validity")
      private final @Nullable Output<StatusArgs> validity;

    public Output<StatusArgs> validity() {
        return this.validity == null ? Codegen.empty() : this.validity;
    }

    public AlertPolicyArgs(
        @Nullable Output<AlertStrategyArgs> alertStrategy,
        @Nullable Output<AlertPolicyCombiner> combiner,
        @Nullable Output<List<ConditionArgs>> conditions,
        @Nullable Output<MutationRecordArgs> creationRecord,
        @Nullable Output<String> displayName,
        @Nullable Output<DocumentationArgs> documentation,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<MutationRecordArgs> mutationRecord,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> notificationChannels,
        @Nullable Output<String> project,
        @Nullable Output<Map<String,String>> userLabels,
        @Nullable Output<StatusArgs> validity) {
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
        this.project = project;
        this.userLabels = userLabels;
        this.validity = validity;
    }

    private AlertPolicyArgs() {
        this.alertStrategy = Codegen.empty();
        this.combiner = Codegen.empty();
        this.conditions = Codegen.empty();
        this.creationRecord = Codegen.empty();
        this.displayName = Codegen.empty();
        this.documentation = Codegen.empty();
        this.enabled = Codegen.empty();
        this.mutationRecord = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationChannels = Codegen.empty();
        this.project = Codegen.empty();
        this.userLabels = Codegen.empty();
        this.validity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AlertStrategyArgs> alertStrategy;
        private @Nullable Output<AlertPolicyCombiner> combiner;
        private @Nullable Output<List<ConditionArgs>> conditions;
        private @Nullable Output<MutationRecordArgs> creationRecord;
        private @Nullable Output<String> displayName;
        private @Nullable Output<DocumentationArgs> documentation;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<MutationRecordArgs> mutationRecord;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> notificationChannels;
        private @Nullable Output<String> project;
        private @Nullable Output<Map<String,String>> userLabels;
        private @Nullable Output<StatusArgs> validity;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyArgs defaults) {
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
    	      this.project = defaults.project;
    	      this.userLabels = defaults.userLabels;
    	      this.validity = defaults.validity;
        }

        public Builder alertStrategy(@Nullable Output<AlertStrategyArgs> alertStrategy) {
            this.alertStrategy = alertStrategy;
            return this;
        }
        public Builder alertStrategy(@Nullable AlertStrategyArgs alertStrategy) {
            this.alertStrategy = Codegen.ofNullable(alertStrategy);
            return this;
        }
        public Builder combiner(@Nullable Output<AlertPolicyCombiner> combiner) {
            this.combiner = combiner;
            return this;
        }
        public Builder combiner(@Nullable AlertPolicyCombiner combiner) {
            this.combiner = Codegen.ofNullable(combiner);
            return this;
        }
        public Builder conditions(@Nullable Output<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder creationRecord(@Nullable Output<MutationRecordArgs> creationRecord) {
            this.creationRecord = creationRecord;
            return this;
        }
        public Builder creationRecord(@Nullable MutationRecordArgs creationRecord) {
            this.creationRecord = Codegen.ofNullable(creationRecord);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder documentation(@Nullable Output<DocumentationArgs> documentation) {
            this.documentation = documentation;
            return this;
        }
        public Builder documentation(@Nullable DocumentationArgs documentation) {
            this.documentation = Codegen.ofNullable(documentation);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder mutationRecord(@Nullable Output<MutationRecordArgs> mutationRecord) {
            this.mutationRecord = mutationRecord;
            return this;
        }
        public Builder mutationRecord(@Nullable MutationRecordArgs mutationRecord) {
            this.mutationRecord = Codegen.ofNullable(mutationRecord);
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
        public Builder notificationChannels(@Nullable Output<List<String>> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public Builder notificationChannels(@Nullable List<String> notificationChannels) {
            this.notificationChannels = Codegen.ofNullable(notificationChannels);
            return this;
        }
        public Builder notificationChannels(String... notificationChannels) {
            return notificationChannels(List.of(notificationChannels));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }
        public Builder userLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Codegen.ofNullable(userLabels);
            return this;
        }
        public Builder validity(@Nullable Output<StatusArgs> validity) {
            this.validity = validity;
            return this;
        }
        public Builder validity(@Nullable StatusArgs validity) {
            this.validity = Codegen.ofNullable(validity);
            return this;
        }        public AlertPolicyArgs build() {
            return new AlertPolicyArgs(alertStrategy, combiner, conditions, creationRecord, displayName, documentation, enabled, mutationRecord, name, notificationChannels, project, userLabels, validity);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.inputs.LogMatchResponse;
import com.pulumi.googlenative.monitoring_v3.inputs.MetricAbsenceResponse;
import com.pulumi.googlenative.monitoring_v3.inputs.MetricThresholdResponse;
import com.pulumi.googlenative.monitoring_v3.inputs.MonitoringQueryLanguageConditionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A condition is a true/false test that determines when an alerting policy should open an incident. If a condition evaluates to true, it signifies that something is wrong.
 * 
 */
public final class ConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConditionResponse Empty = new ConditionResponse();

    /**
     * A condition that checks that a time series continues to receive new data points.
     * 
     */
    @Import(name="conditionAbsent", required=true)
      private final MetricAbsenceResponse conditionAbsent;

    public MetricAbsenceResponse conditionAbsent() {
        return this.conditionAbsent;
    }

    /**
     * A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
     * 
     */
    @Import(name="conditionMatchedLog", required=true)
      private final LogMatchResponse conditionMatchedLog;

    public LogMatchResponse conditionMatchedLog() {
        return this.conditionMatchedLog;
    }

    /**
     * A condition that uses the Monitoring Query Language to define alerts.
     * 
     */
    @Import(name="conditionMonitoringQueryLanguage", required=true)
      private final MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage;

    public MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage() {
        return this.conditionMonitoringQueryLanguage;
    }

    /**
     * A condition that compares a time series against a threshold.
     * 
     */
    @Import(name="conditionThreshold", required=true)
      private final MetricThresholdResponse conditionThreshold;

    public MetricThresholdResponse conditionThreshold() {
        return this.conditionThreshold;
    }

    /**
     * A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple conditions in the same policy.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Stackdriver Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public ConditionResponse(
        MetricAbsenceResponse conditionAbsent,
        LogMatchResponse conditionMatchedLog,
        MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage,
        MetricThresholdResponse conditionThreshold,
        String displayName,
        String name) {
        this.conditionAbsent = Objects.requireNonNull(conditionAbsent, "expected parameter 'conditionAbsent' to be non-null");
        this.conditionMatchedLog = Objects.requireNonNull(conditionMatchedLog, "expected parameter 'conditionMatchedLog' to be non-null");
        this.conditionMonitoringQueryLanguage = Objects.requireNonNull(conditionMonitoringQueryLanguage, "expected parameter 'conditionMonitoringQueryLanguage' to be non-null");
        this.conditionThreshold = Objects.requireNonNull(conditionThreshold, "expected parameter 'conditionThreshold' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ConditionResponse() {
        this.conditionAbsent = null;
        this.conditionMatchedLog = null;
        this.conditionMonitoringQueryLanguage = null;
        this.conditionThreshold = null;
        this.displayName = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAbsenceResponse conditionAbsent;
        private LogMatchResponse conditionMatchedLog;
        private MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage;
        private MetricThresholdResponse conditionThreshold;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionAbsent = defaults.conditionAbsent;
    	      this.conditionMatchedLog = defaults.conditionMatchedLog;
    	      this.conditionMonitoringQueryLanguage = defaults.conditionMonitoringQueryLanguage;
    	      this.conditionThreshold = defaults.conditionThreshold;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder conditionAbsent(MetricAbsenceResponse conditionAbsent) {
            this.conditionAbsent = Objects.requireNonNull(conditionAbsent);
            return this;
        }
        public Builder conditionMatchedLog(LogMatchResponse conditionMatchedLog) {
            this.conditionMatchedLog = Objects.requireNonNull(conditionMatchedLog);
            return this;
        }
        public Builder conditionMonitoringQueryLanguage(MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage) {
            this.conditionMonitoringQueryLanguage = Objects.requireNonNull(conditionMonitoringQueryLanguage);
            return this;
        }
        public Builder conditionThreshold(MetricThresholdResponse conditionThreshold) {
            this.conditionThreshold = Objects.requireNonNull(conditionThreshold);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ConditionResponse build() {
            return new ConditionResponse(conditionAbsent, conditionMatchedLog, conditionMonitoringQueryLanguage, conditionThreshold, displayName, name);
        }
    }
}

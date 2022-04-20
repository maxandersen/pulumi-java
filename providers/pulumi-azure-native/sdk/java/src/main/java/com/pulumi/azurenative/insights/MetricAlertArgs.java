// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.MetricAlertActionArgs;
import com.pulumi.azurenative.insights.inputs.MetricAlertMultipleResourceMultipleMetricCriteriaArgs;
import com.pulumi.azurenative.insights.inputs.MetricAlertSingleResourceMultipleMetricCriteriaArgs;
import com.pulumi.azurenative.insights.inputs.WebtestLocationAvailabilityCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricAlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricAlertArgs Empty = new MetricAlertArgs();

    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    @Import(name="actions")
      private final @Nullable Output<List<MetricAlertActionArgs>> actions;

    public Output<List<MetricAlertActionArgs>> actions() {
        return this.actions == null ? Codegen.empty() : this.actions;
    }

    /**
     * the flag that indicates whether the alert should be auto resolved or not. The default is true.
     * 
     */
    @Import(name="autoMitigate")
      private final @Nullable Output<Boolean> autoMitigate;

    public Output<Boolean> autoMitigate() {
        return this.autoMitigate == null ? Codegen.empty() : this.autoMitigate;
    }

    /**
     * defines the specific alert criteria information.
     * 
     */
    @Import(name="criteria", required=true)
      private final Output<Object> criteria;

    public Output<Object> criteria() {
        return this.criteria;
    }

    /**
     * the description of the metric alert that will be included in the alert email.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * the flag that indicates whether the metric alert is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * how often the metric alert is evaluated represented in ISO 8601 duration format.
     * 
     */
    @Import(name="evaluationFrequency", required=true)
      private final Output<String> evaluationFrequency;

    public Output<String> evaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> ruleName() {
        return this.ruleName == null ? Codegen.empty() : this.ruleName;
    }

    /**
     * the list of resource id&#39;s that this metric alert is scoped to.
     * 
     */
    @Import(name="scopes", required=true)
      private final Output<List<String>> scopes;

    public Output<List<String>> scopes() {
        return this.scopes;
    }

    /**
     * Alert severity {0, 1, 2, 3, 4}
     * 
     */
    @Import(name="severity", required=true)
      private final Output<Integer> severity;

    public Output<Integer> severity() {
        return this.severity;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * the region of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    @Import(name="targetResourceRegion")
      private final @Nullable Output<String> targetResourceRegion;

    public Output<String> targetResourceRegion() {
        return this.targetResourceRegion == null ? Codegen.empty() : this.targetResourceRegion;
    }

    /**
     * the resource type of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    @Import(name="targetResourceType")
      private final @Nullable Output<String> targetResourceType;

    public Output<String> targetResourceType() {
        return this.targetResourceType == null ? Codegen.empty() : this.targetResourceType;
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * 
     */
    @Import(name="windowSize", required=true)
      private final Output<String> windowSize;

    public Output<String> windowSize() {
        return this.windowSize;
    }

    public MetricAlertArgs(
        @Nullable Output<List<MetricAlertActionArgs>> actions,
        @Nullable Output<Boolean> autoMitigate,
        Output<Object> criteria,
        @Nullable Output<String> description,
        Output<Boolean> enabled,
        Output<String> evaluationFrequency,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleName,
        Output<List<String>> scopes,
        Output<Integer> severity,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetResourceRegion,
        @Nullable Output<String> targetResourceType,
        Output<String> windowSize) {
        this.actions = actions;
        this.autoMitigate = autoMitigate;
        this.criteria = Objects.requireNonNull(criteria, "expected parameter 'criteria' to be non-null");
        this.description = description;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.evaluationFrequency = Objects.requireNonNull(evaluationFrequency, "expected parameter 'evaluationFrequency' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.tags = tags;
        this.targetResourceRegion = targetResourceRegion;
        this.targetResourceType = targetResourceType;
        this.windowSize = Objects.requireNonNull(windowSize, "expected parameter 'windowSize' to be non-null");
    }

    private MetricAlertArgs() {
        this.actions = Codegen.empty();
        this.autoMitigate = Codegen.empty();
        this.criteria = Codegen.empty();
        this.description = Codegen.empty();
        this.enabled = Codegen.empty();
        this.evaluationFrequency = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleName = Codegen.empty();
        this.scopes = Codegen.empty();
        this.severity = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetResourceRegion = Codegen.empty();
        this.targetResourceType = Codegen.empty();
        this.windowSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MetricAlertActionArgs>> actions;
        private @Nullable Output<Boolean> autoMitigate;
        private Output<Object> criteria;
        private @Nullable Output<String> description;
        private Output<Boolean> enabled;
        private Output<String> evaluationFrequency;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleName;
        private Output<List<String>> scopes;
        private Output<Integer> severity;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetResourceRegion;
        private @Nullable Output<String> targetResourceType;
        private Output<String> windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.autoMitigate = defaults.autoMitigate;
    	      this.criteria = defaults.criteria;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.evaluationFrequency = defaults.evaluationFrequency;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.scopes = defaults.scopes;
    	      this.severity = defaults.severity;
    	      this.tags = defaults.tags;
    	      this.targetResourceRegion = defaults.targetResourceRegion;
    	      this.targetResourceType = defaults.targetResourceType;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder actions(@Nullable Output<List<MetricAlertActionArgs>> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(@Nullable List<MetricAlertActionArgs> actions) {
            this.actions = Codegen.ofNullable(actions);
            return this;
        }
        public Builder actions(MetricAlertActionArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder autoMitigate(@Nullable Output<Boolean> autoMitigate) {
            this.autoMitigate = autoMitigate;
            return this;
        }
        public Builder autoMitigate(@Nullable Boolean autoMitigate) {
            this.autoMitigate = Codegen.ofNullable(autoMitigate);
            return this;
        }
        public Builder criteria(Output<Object> criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }
        public Builder criteria(Object criteria) {
            this.criteria = Output.of(Objects.requireNonNull(criteria));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder evaluationFrequency(Output<String> evaluationFrequency) {
            this.evaluationFrequency = Objects.requireNonNull(evaluationFrequency);
            return this;
        }
        public Builder evaluationFrequency(String evaluationFrequency) {
            this.evaluationFrequency = Output.of(Objects.requireNonNull(evaluationFrequency));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Codegen.ofNullable(ruleName);
            return this;
        }
        public Builder scopes(Output<List<String>> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Output.of(Objects.requireNonNull(scopes));
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder severity(Output<Integer> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder severity(Integer severity) {
            this.severity = Output.of(Objects.requireNonNull(severity));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetResourceRegion(@Nullable Output<String> targetResourceRegion) {
            this.targetResourceRegion = targetResourceRegion;
            return this;
        }
        public Builder targetResourceRegion(@Nullable String targetResourceRegion) {
            this.targetResourceRegion = Codegen.ofNullable(targetResourceRegion);
            return this;
        }
        public Builder targetResourceType(@Nullable Output<String> targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public Builder targetResourceType(@Nullable String targetResourceType) {
            this.targetResourceType = Codegen.ofNullable(targetResourceType);
            return this;
        }
        public Builder windowSize(Output<String> windowSize) {
            this.windowSize = Objects.requireNonNull(windowSize);
            return this;
        }
        public Builder windowSize(String windowSize) {
            this.windowSize = Output.of(Objects.requireNonNull(windowSize));
            return this;
        }        public MetricAlertArgs build() {
            return new MetricAlertArgs(actions, autoMitigate, criteria, description, enabled, evaluationFrequency, location, resourceGroupName, ruleName, scopes, severity, tags, targetResourceRegion, targetResourceType, windowSize);
        }
    }
}

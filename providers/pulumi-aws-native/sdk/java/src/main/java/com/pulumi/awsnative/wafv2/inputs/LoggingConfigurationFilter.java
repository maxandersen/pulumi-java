// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.LoggingConfigurationFilterBehavior;
import com.pulumi.awsnative.wafv2.enums.LoggingConfigurationFilterRequirement;
import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationCondition;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class LoggingConfigurationFilter extends com.pulumi.resources.InvokeArgs {

    public static final LoggingConfigurationFilter Empty = new LoggingConfigurationFilter();

    /**
     * How to handle logs that satisfy the filter&#39;s conditions and requirement.
     * 
     */
    @Import(name="behavior", required=true)
    private LoggingConfigurationFilterBehavior behavior;

    public LoggingConfigurationFilterBehavior behavior() {
        return this.behavior;
    }

    /**
     * Match conditions for the filter.
     * 
     */
    @Import(name="conditions", required=true)
    private List<LoggingConfigurationCondition> conditions;

    public List<LoggingConfigurationCondition> conditions() {
        return this.conditions;
    }

    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    @Import(name="requirement", required=true)
    private LoggingConfigurationFilterRequirement requirement;

    public LoggingConfigurationFilterRequirement requirement() {
        return this.requirement;
    }

    private LoggingConfigurationFilter() {}

    private LoggingConfigurationFilter(LoggingConfigurationFilter $) {
        this.behavior = $.behavior;
        this.conditions = $.conditions;
        this.requirement = $.requirement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationFilter $;

        public Builder() {
            $ = new LoggingConfigurationFilter();
        }

        public Builder(LoggingConfigurationFilter defaults) {
            $ = new LoggingConfigurationFilter(Objects.requireNonNull(defaults));
        }

        public Builder behavior(LoggingConfigurationFilterBehavior behavior) {
            $.behavior = behavior;
            return this;
        }

        public Builder conditions(List<LoggingConfigurationCondition> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(LoggingConfigurationCondition... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder requirement(LoggingConfigurationFilterRequirement requirement) {
            $.requirement = requirement;
            return this;
        }

        public LoggingConfigurationFilter build() {
            $.behavior = Objects.requireNonNull($.behavior, "expected parameter 'behavior' to be non-null");
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            $.requirement = Objects.requireNonNull($.requirement, "expected parameter 'requirement' to be non-null");
            return $;
        }
    }

}

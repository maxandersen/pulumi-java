// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs Empty = new AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs();

    /**
     * The absolute number of time series
     * that must fail the predicate for the
     * condition to be triggered.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The percentage of time series that
     * must fail the predicate for the
     * condition to be triggered.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Double> percent;

    public Optional<Output<Double>> percent() {
        return Optional.ofNullable(this.percent);
    }

    private AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs() {}

    private AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs(AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs $) {
        this.count = $.count;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs $;

        public Builder() {
            $ = new AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs();
        }

        public Builder(AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs defaults) {
            $ = new AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder percent(@Nullable Output<Double> percent) {
            $.percent = percent;
            return this;
        }

        public Builder percent(Double percent) {
            return percent(Output.of(percent));
        }

        public AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs build() {
            return $;
        }
    }

}

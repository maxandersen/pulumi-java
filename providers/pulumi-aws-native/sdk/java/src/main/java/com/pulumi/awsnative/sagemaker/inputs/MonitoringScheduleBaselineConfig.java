// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleConstraintsResource;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleStatisticsResource;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and statistics.
 * 
 */
public final class MonitoringScheduleBaselineConfig extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleBaselineConfig Empty = new MonitoringScheduleBaselineConfig();

    @Import(name="constraintsResource")
    private @Nullable MonitoringScheduleConstraintsResource constraintsResource;

    public Optional<MonitoringScheduleConstraintsResource> constraintsResource() {
        return Optional.ofNullable(this.constraintsResource);
    }

    @Import(name="statisticsResource")
    private @Nullable MonitoringScheduleStatisticsResource statisticsResource;

    public Optional<MonitoringScheduleStatisticsResource> statisticsResource() {
        return Optional.ofNullable(this.statisticsResource);
    }

    private MonitoringScheduleBaselineConfig() {}

    private MonitoringScheduleBaselineConfig(MonitoringScheduleBaselineConfig $) {
        this.constraintsResource = $.constraintsResource;
        this.statisticsResource = $.statisticsResource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleBaselineConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleBaselineConfig $;

        public Builder() {
            $ = new MonitoringScheduleBaselineConfig();
        }

        public Builder(MonitoringScheduleBaselineConfig defaults) {
            $ = new MonitoringScheduleBaselineConfig(Objects.requireNonNull(defaults));
        }

        public Builder constraintsResource(@Nullable MonitoringScheduleConstraintsResource constraintsResource) {
            $.constraintsResource = constraintsResource;
            return this;
        }

        public Builder statisticsResource(@Nullable MonitoringScheduleStatisticsResource statisticsResource) {
            $.statisticsResource = statisticsResource;
            return this;
        }

        public MonitoringScheduleBaselineConfig build() {
            return $;
        }
    }

}

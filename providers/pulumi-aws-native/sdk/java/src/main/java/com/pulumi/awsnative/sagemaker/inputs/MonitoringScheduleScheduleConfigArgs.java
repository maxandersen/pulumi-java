// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration details about the monitoring schedule.
 * 
 */
public final class MonitoringScheduleScheduleConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleScheduleConfigArgs Empty = new MonitoringScheduleScheduleConfigArgs();

    /**
     * A cron expression that describes details about the monitoring schedule.
     * 
     */
    @Import(name="scheduleExpression", required=true)
    private Output<String> scheduleExpression;

    public Output<String> scheduleExpression() {
        return this.scheduleExpression;
    }

    private MonitoringScheduleScheduleConfigArgs() {}

    private MonitoringScheduleScheduleConfigArgs(MonitoringScheduleScheduleConfigArgs $) {
        this.scheduleExpression = $.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleScheduleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleScheduleConfigArgs $;

        public Builder() {
            $ = new MonitoringScheduleScheduleConfigArgs();
        }

        public Builder(MonitoringScheduleScheduleConfigArgs defaults) {
            $ = new MonitoringScheduleScheduleConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder scheduleExpression(Output<String> scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            return scheduleExpression(Output.of(scheduleExpression));
        }

        public MonitoringScheduleScheduleConfigArgs build() {
            $.scheduleExpression = Objects.requireNonNull($.scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
            return $;
        }
    }

}

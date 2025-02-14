// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterMaintenancePolicyRecurringWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyRecurringWindowArgs Empty = new ClusterMaintenancePolicyRecurringWindowArgs();

    @Import(name="endTime", required=true)
    private Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime;
    }

    @Import(name="recurrence", required=true)
    private Output<String> recurrence;

    public Output<String> recurrence() {
        return this.recurrence;
    }

    @Import(name="startTime", required=true)
    private Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime;
    }

    private ClusterMaintenancePolicyRecurringWindowArgs() {}

    private ClusterMaintenancePolicyRecurringWindowArgs(ClusterMaintenancePolicyRecurringWindowArgs $) {
        this.endTime = $.endTime;
        this.recurrence = $.recurrence;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMaintenancePolicyRecurringWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMaintenancePolicyRecurringWindowArgs $;

        public Builder() {
            $ = new ClusterMaintenancePolicyRecurringWindowArgs();
        }

        public Builder(ClusterMaintenancePolicyRecurringWindowArgs defaults) {
            $ = new ClusterMaintenancePolicyRecurringWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder endTime(Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder recurrence(Output<String> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        public Builder recurrence(String recurrence) {
            return recurrence(Output.of(recurrence));
        }

        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ClusterMaintenancePolicyRecurringWindowArgs build() {
            $.endTime = Objects.requireNonNull($.endTime, "expected parameter 'endTime' to be non-null");
            $.recurrence = Objects.requireNonNull($.recurrence, "expected parameter 'recurrence' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}

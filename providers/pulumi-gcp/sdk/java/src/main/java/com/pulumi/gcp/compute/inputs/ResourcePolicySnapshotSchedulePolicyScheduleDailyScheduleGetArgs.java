// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs();

    /**
     * The number of days between snapshots.
     * 
     */
    @Import(name="daysInCycle", required=true)
    private Output<Integer> daysInCycle;

    public Output<Integer> daysInCycle() {
        return this.daysInCycle;
    }

    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime;
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs() {}

    private ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs(ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs $) {
        this.daysInCycle = $.daysInCycle;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs $;

        public Builder() {
            $ = new ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs();
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs defaults) {
            $ = new ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder daysInCycle(Output<Integer> daysInCycle) {
            $.daysInCycle = daysInCycle;
            return this;
        }

        public Builder daysInCycle(Integer daysInCycle) {
            return daysInCycle(Output.of(daysInCycle));
        }

        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs build() {
            $.daysInCycle = Objects.requireNonNull($.daysInCycle, "expected parameter 'daysInCycle' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}

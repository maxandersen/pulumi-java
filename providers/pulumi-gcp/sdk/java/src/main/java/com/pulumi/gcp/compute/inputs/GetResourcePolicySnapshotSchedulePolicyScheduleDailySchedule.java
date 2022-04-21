// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule Empty = new GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule();

    @Import(name="daysInCycle", required=true)
    private Integer daysInCycle;

    public Integer daysInCycle() {
        return this.daysInCycle;
    }

    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    private GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule() {}

    private GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule $) {
        this.daysInCycle = $.daysInCycle;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule $;

        public Builder() {
            $ = new GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule();
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule defaults) {
            $ = new GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(Objects.requireNonNull(defaults));
        }

        public Builder daysInCycle(Integer daysInCycle) {
            $.daysInCycle = daysInCycle;
            return this;
        }

        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule build() {
            $.daysInCycle = Objects.requireNonNull($.daysInCycle, "expected parameter 'daysInCycle' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}

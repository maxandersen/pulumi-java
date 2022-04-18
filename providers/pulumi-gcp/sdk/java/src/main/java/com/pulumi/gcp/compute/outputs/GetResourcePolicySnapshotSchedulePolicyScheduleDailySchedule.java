// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule {
    private final Integer daysInCycle;
    private final String startTime;

    @CustomType.Constructor
    private GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(
        @CustomType.Parameter("daysInCycle") Integer daysInCycle,
        @CustomType.Parameter("startTime") String startTime) {
        this.daysInCycle = daysInCycle;
        this.startTime = startTime;
    }

    public Integer daysInCycle() {
        return this.daysInCycle;
    }
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer daysInCycle;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder daysInCycle(Integer daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(daysInCycle, startTime);
        }
    }
}

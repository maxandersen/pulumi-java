// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyDailyCycleResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyHourlyCycleResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyWeeklyCycleResponse;
import java.util.Objects;

@CustomType
public final class ResourcePolicySnapshotSchedulePolicyScheduleResponse {
    private final ResourcePolicyDailyCycleResponse dailySchedule;
    private final ResourcePolicyHourlyCycleResponse hourlySchedule;
    private final ResourcePolicyWeeklyCycleResponse weeklySchedule;

    @CustomType.Constructor
    private ResourcePolicySnapshotSchedulePolicyScheduleResponse(
        @CustomType.Parameter("dailySchedule") ResourcePolicyDailyCycleResponse dailySchedule,
        @CustomType.Parameter("hourlySchedule") ResourcePolicyHourlyCycleResponse hourlySchedule,
        @CustomType.Parameter("weeklySchedule") ResourcePolicyWeeklyCycleResponse weeklySchedule) {
        this.dailySchedule = dailySchedule;
        this.hourlySchedule = hourlySchedule;
        this.weeklySchedule = weeklySchedule;
    }

    public ResourcePolicyDailyCycleResponse dailySchedule() {
        return this.dailySchedule;
    }
    public ResourcePolicyHourlyCycleResponse hourlySchedule() {
        return this.hourlySchedule;
    }
    public ResourcePolicyWeeklyCycleResponse weeklySchedule() {
        return this.weeklySchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyDailyCycleResponse dailySchedule;
        private ResourcePolicyHourlyCycleResponse hourlySchedule;
        private ResourcePolicyWeeklyCycleResponse weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder dailySchedule(ResourcePolicyDailyCycleResponse dailySchedule) {
            this.dailySchedule = Objects.requireNonNull(dailySchedule);
            return this;
        }
        public Builder hourlySchedule(ResourcePolicyHourlyCycleResponse hourlySchedule) {
            this.hourlySchedule = Objects.requireNonNull(hourlySchedule);
            return this;
        }
        public Builder weeklySchedule(ResourcePolicyWeeklyCycleResponse weeklySchedule) {
            this.weeklySchedule = Objects.requireNonNull(weeklySchedule);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyScheduleResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleResponse(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}

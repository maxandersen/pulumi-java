// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicyInstanceSchedulePolicyVmStopSchedule extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicyInstanceSchedulePolicyVmStopSchedule Empty = new GetResourcePolicyInstanceSchedulePolicyVmStopSchedule();

    @Import(name="schedule", required=true)
      private final String schedule;

    public String schedule() {
        return this.schedule;
    }

    public GetResourcePolicyInstanceSchedulePolicyVmStopSchedule(String schedule) {
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private GetResourcePolicyInstanceSchedulePolicyVmStopSchedule() {
        this.schedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyInstanceSchedulePolicyVmStopSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyInstanceSchedulePolicyVmStopSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }        public GetResourcePolicyInstanceSchedulePolicyVmStopSchedule build() {
            return new GetResourcePolicyInstanceSchedulePolicyVmStopSchedule(schedule);
        }
    }
}

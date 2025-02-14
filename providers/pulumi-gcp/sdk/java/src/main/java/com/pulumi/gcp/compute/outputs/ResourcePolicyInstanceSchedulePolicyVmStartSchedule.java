// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePolicyInstanceSchedulePolicyVmStartSchedule {
    /**
     * @return Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    private final String schedule;

    @CustomType.Constructor
    private ResourcePolicyInstanceSchedulePolicyVmStartSchedule(@CustomType.Parameter("schedule") String schedule) {
        this.schedule = schedule;
    }

    /**
     * @return Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    public String schedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyVmStartSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyVmStartSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }        public ResourcePolicyInstanceSchedulePolicyVmStartSchedule build() {
            return new ResourcePolicyInstanceSchedulePolicyVmStartSchedule(schedule);
        }
    }
}

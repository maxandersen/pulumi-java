// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicyInstanceSchedulePolicyScheduleResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicyInstanceSchedulePolicyResponse {
    /**
     * The expiration time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    private final String expirationTime;
    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    private final String startTime;
    /**
     * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    private final String timeZone;
    /**
     * Specifies the schedule for starting instances.
     * 
     */
    private final ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStartSchedule;
    /**
     * Specifies the schedule for stopping instances.
     * 
     */
    private final ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStopSchedule;

    @OutputCustomType.Constructor
    private ResourcePolicyInstanceSchedulePolicyResponse(
        @OutputCustomType.Parameter("expirationTime") String expirationTime,
        @OutputCustomType.Parameter("startTime") String startTime,
        @OutputCustomType.Parameter("timeZone") String timeZone,
        @OutputCustomType.Parameter("vmStartSchedule") ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStartSchedule,
        @OutputCustomType.Parameter("vmStopSchedule") ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStopSchedule) {
        this.expirationTime = expirationTime;
        this.startTime = startTime;
        this.timeZone = timeZone;
        this.vmStartSchedule = vmStartSchedule;
        this.vmStopSchedule = vmStopSchedule;
    }

    /**
     * The expiration time of the schedule. The timestamp is an RFC3339 string.
     * 
    */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
    */
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Specifies the schedule for starting instances.
     * 
    */
    public ResourcePolicyInstanceSchedulePolicyScheduleResponse getVmStartSchedule() {
        return this.vmStartSchedule;
    }
    /**
     * Specifies the schedule for stopping instances.
     * 
    */
    public ResourcePolicyInstanceSchedulePolicyScheduleResponse getVmStopSchedule() {
        return this.vmStopSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String startTime;
        private String timeZone;
        private ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStartSchedule;
        private ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStopSchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.vmStartSchedule = defaults.vmStartSchedule;
    	      this.vmStopSchedule = defaults.vmStopSchedule;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setVmStartSchedule(ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStartSchedule) {
            this.vmStartSchedule = Objects.requireNonNull(vmStartSchedule);
            return this;
        }

        public Builder setVmStopSchedule(ResourcePolicyInstanceSchedulePolicyScheduleResponse vmStopSchedule) {
            this.vmStopSchedule = Objects.requireNonNull(vmStopSchedule);
            return this;
        }
        public ResourcePolicyInstanceSchedulePolicyResponse build() {
            return new ResourcePolicyInstanceSchedulePolicyResponse(expirationTime, startTime, timeZone, vmStartSchedule, vmStopSchedule);
        }
    }
}

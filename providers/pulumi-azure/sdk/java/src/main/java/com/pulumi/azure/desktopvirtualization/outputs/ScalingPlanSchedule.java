// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScalingPlanSchedule {
    /**
     * @return A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
     * 
     */
    private final List<String> daysOfWeeks;
    /**
     * @return The name of the schedule.
     * 
     */
    private final String name;
    /**
     * @return The load Balancing Algorithm to use during Off-Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    private final String offPeakLoadBalancingAlgorithm;
    /**
     * @return The time at which Off-Peak scaling will begin. This is also the end-time for the Ramp-Down period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    private final String offPeakStartTime;
    /**
     * @return The load Balancing Algorithm to use during Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    private final String peakLoadBalancingAlgorithm;
    /**
     * @return The time at which Peak scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    private final String peakStartTime;
    /**
     * @return This is the value in percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-down and off-peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    private final Integer rampDownCapacityThresholdPercent;
    /**
     * @return Whether users will be forced to log-off session hosts once the `ramp_down_wait_time_minutes` value has been exceeded during the Ramp-Down period. Possible
     * 
     */
    private final Boolean rampDownForceLogoffUsers;
    /**
     * @return The load Balancing Algorithm to use during the Ramp-Down period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    private final String rampDownLoadBalancingAlgorithm;
    /**
     * @return The minimum percentage of session host virtual machines that you would like to get to for ramp-down and off-peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    private final Integer rampDownMinimumHostsPercent;
    /**
     * @return The notification message to send to users during Ramp-Down period when they are required to log-off.
     * 
     */
    private final String rampDownNotificationMessage;
    /**
     * @return The time at which Ramp-Down scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    private final String rampDownStartTime;
    /**
     * @return Controls Session Host shutdown behaviour during Ramp-Down period. Session Hosts can either be shutdown when all sessions on the Session Host have ended, or when there are no Active sessions left on the Session Host. Possible values are `ZeroSessions` and `ZeroActiveSessions`.
     * 
     */
    private final String rampDownStopHostsWhen;
    /**
     * @return The number of minutes during Ramp-Down period that autoscale will wait after setting the session host VMs to drain mode, notifying any currently signed in users to save their work before forcing the users to logoff. Once all user sessions on the session host VM have been logged off, Autoscale will shut down the VM.
     * 
     */
    private final Integer rampDownWaitTimeMinutes;
    /**
     * @return Specify minimum percentage of session host virtual machines to start for ramp-up and peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    private final @Nullable Integer rampUpCapacityThresholdPercent;
    /**
     * @return The load Balancing Algorithm to use during the Ramp-Up period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    private final String rampUpLoadBalancingAlgorithm;
    /**
     * @return This is the value of percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-up and peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    private final @Nullable Integer rampUpMinimumHostsPercent;
    /**
     * @return The time at which Ramp-Up scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    private final String rampUpStartTime;

    @CustomType.Constructor
    private ScalingPlanSchedule(
        @CustomType.Parameter("daysOfWeeks") List<String> daysOfWeeks,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("offPeakLoadBalancingAlgorithm") String offPeakLoadBalancingAlgorithm,
        @CustomType.Parameter("offPeakStartTime") String offPeakStartTime,
        @CustomType.Parameter("peakLoadBalancingAlgorithm") String peakLoadBalancingAlgorithm,
        @CustomType.Parameter("peakStartTime") String peakStartTime,
        @CustomType.Parameter("rampDownCapacityThresholdPercent") Integer rampDownCapacityThresholdPercent,
        @CustomType.Parameter("rampDownForceLogoffUsers") Boolean rampDownForceLogoffUsers,
        @CustomType.Parameter("rampDownLoadBalancingAlgorithm") String rampDownLoadBalancingAlgorithm,
        @CustomType.Parameter("rampDownMinimumHostsPercent") Integer rampDownMinimumHostsPercent,
        @CustomType.Parameter("rampDownNotificationMessage") String rampDownNotificationMessage,
        @CustomType.Parameter("rampDownStartTime") String rampDownStartTime,
        @CustomType.Parameter("rampDownStopHostsWhen") String rampDownStopHostsWhen,
        @CustomType.Parameter("rampDownWaitTimeMinutes") Integer rampDownWaitTimeMinutes,
        @CustomType.Parameter("rampUpCapacityThresholdPercent") @Nullable Integer rampUpCapacityThresholdPercent,
        @CustomType.Parameter("rampUpLoadBalancingAlgorithm") String rampUpLoadBalancingAlgorithm,
        @CustomType.Parameter("rampUpMinimumHostsPercent") @Nullable Integer rampUpMinimumHostsPercent,
        @CustomType.Parameter("rampUpStartTime") String rampUpStartTime) {
        this.daysOfWeeks = daysOfWeeks;
        this.name = name;
        this.offPeakLoadBalancingAlgorithm = offPeakLoadBalancingAlgorithm;
        this.offPeakStartTime = offPeakStartTime;
        this.peakLoadBalancingAlgorithm = peakLoadBalancingAlgorithm;
        this.peakStartTime = peakStartTime;
        this.rampDownCapacityThresholdPercent = rampDownCapacityThresholdPercent;
        this.rampDownForceLogoffUsers = rampDownForceLogoffUsers;
        this.rampDownLoadBalancingAlgorithm = rampDownLoadBalancingAlgorithm;
        this.rampDownMinimumHostsPercent = rampDownMinimumHostsPercent;
        this.rampDownNotificationMessage = rampDownNotificationMessage;
        this.rampDownStartTime = rampDownStartTime;
        this.rampDownStopHostsWhen = rampDownStopHostsWhen;
        this.rampDownWaitTimeMinutes = rampDownWaitTimeMinutes;
        this.rampUpCapacityThresholdPercent = rampUpCapacityThresholdPercent;
        this.rampUpLoadBalancingAlgorithm = rampUpLoadBalancingAlgorithm;
        this.rampUpMinimumHostsPercent = rampUpMinimumHostsPercent;
        this.rampUpStartTime = rampUpStartTime;
    }

    /**
     * @return A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
     * 
     */
    public List<String> daysOfWeeks() {
        return this.daysOfWeeks;
    }
    /**
     * @return The name of the schedule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The load Balancing Algorithm to use during Off-Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public String offPeakLoadBalancingAlgorithm() {
        return this.offPeakLoadBalancingAlgorithm;
    }
    /**
     * @return The time at which Off-Peak scaling will begin. This is also the end-time for the Ramp-Down period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public String offPeakStartTime() {
        return this.offPeakStartTime;
    }
    /**
     * @return The load Balancing Algorithm to use during Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public String peakLoadBalancingAlgorithm() {
        return this.peakLoadBalancingAlgorithm;
    }
    /**
     * @return The time at which Peak scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public String peakStartTime() {
        return this.peakStartTime;
    }
    /**
     * @return This is the value in percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-down and off-peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    public Integer rampDownCapacityThresholdPercent() {
        return this.rampDownCapacityThresholdPercent;
    }
    /**
     * @return Whether users will be forced to log-off session hosts once the `ramp_down_wait_time_minutes` value has been exceeded during the Ramp-Down period. Possible
     * 
     */
    public Boolean rampDownForceLogoffUsers() {
        return this.rampDownForceLogoffUsers;
    }
    /**
     * @return The load Balancing Algorithm to use during the Ramp-Down period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public String rampDownLoadBalancingAlgorithm() {
        return this.rampDownLoadBalancingAlgorithm;
    }
    /**
     * @return The minimum percentage of session host virtual machines that you would like to get to for ramp-down and off-peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    public Integer rampDownMinimumHostsPercent() {
        return this.rampDownMinimumHostsPercent;
    }
    /**
     * @return The notification message to send to users during Ramp-Down period when they are required to log-off.
     * 
     */
    public String rampDownNotificationMessage() {
        return this.rampDownNotificationMessage;
    }
    /**
     * @return The time at which Ramp-Down scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public String rampDownStartTime() {
        return this.rampDownStartTime;
    }
    /**
     * @return Controls Session Host shutdown behaviour during Ramp-Down period. Session Hosts can either be shutdown when all sessions on the Session Host have ended, or when there are no Active sessions left on the Session Host. Possible values are `ZeroSessions` and `ZeroActiveSessions`.
     * 
     */
    public String rampDownStopHostsWhen() {
        return this.rampDownStopHostsWhen;
    }
    /**
     * @return The number of minutes during Ramp-Down period that autoscale will wait after setting the session host VMs to drain mode, notifying any currently signed in users to save their work before forcing the users to logoff. Once all user sessions on the session host VM have been logged off, Autoscale will shut down the VM.
     * 
     */
    public Integer rampDownWaitTimeMinutes() {
        return this.rampDownWaitTimeMinutes;
    }
    /**
     * @return Specify minimum percentage of session host virtual machines to start for ramp-up and peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    public Optional<Integer> rampUpCapacityThresholdPercent() {
        return Optional.ofNullable(this.rampUpCapacityThresholdPercent);
    }
    /**
     * @return The load Balancing Algorithm to use during the Ramp-Up period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public String rampUpLoadBalancingAlgorithm() {
        return this.rampUpLoadBalancingAlgorithm;
    }
    /**
     * @return This is the value of percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-up and peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    public Optional<Integer> rampUpMinimumHostsPercent() {
        return Optional.ofNullable(this.rampUpMinimumHostsPercent);
    }
    /**
     * @return The time at which Ramp-Up scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public String rampUpStartTime() {
        return this.rampUpStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> daysOfWeeks;
        private String name;
        private String offPeakLoadBalancingAlgorithm;
        private String offPeakStartTime;
        private String peakLoadBalancingAlgorithm;
        private String peakStartTime;
        private Integer rampDownCapacityThresholdPercent;
        private Boolean rampDownForceLogoffUsers;
        private String rampDownLoadBalancingAlgorithm;
        private Integer rampDownMinimumHostsPercent;
        private String rampDownNotificationMessage;
        private String rampDownStartTime;
        private String rampDownStopHostsWhen;
        private Integer rampDownWaitTimeMinutes;
        private @Nullable Integer rampUpCapacityThresholdPercent;
        private String rampUpLoadBalancingAlgorithm;
        private @Nullable Integer rampUpMinimumHostsPercent;
        private String rampUpStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfWeeks = defaults.daysOfWeeks;
    	      this.name = defaults.name;
    	      this.offPeakLoadBalancingAlgorithm = defaults.offPeakLoadBalancingAlgorithm;
    	      this.offPeakStartTime = defaults.offPeakStartTime;
    	      this.peakLoadBalancingAlgorithm = defaults.peakLoadBalancingAlgorithm;
    	      this.peakStartTime = defaults.peakStartTime;
    	      this.rampDownCapacityThresholdPercent = defaults.rampDownCapacityThresholdPercent;
    	      this.rampDownForceLogoffUsers = defaults.rampDownForceLogoffUsers;
    	      this.rampDownLoadBalancingAlgorithm = defaults.rampDownLoadBalancingAlgorithm;
    	      this.rampDownMinimumHostsPercent = defaults.rampDownMinimumHostsPercent;
    	      this.rampDownNotificationMessage = defaults.rampDownNotificationMessage;
    	      this.rampDownStartTime = defaults.rampDownStartTime;
    	      this.rampDownStopHostsWhen = defaults.rampDownStopHostsWhen;
    	      this.rampDownWaitTimeMinutes = defaults.rampDownWaitTimeMinutes;
    	      this.rampUpCapacityThresholdPercent = defaults.rampUpCapacityThresholdPercent;
    	      this.rampUpLoadBalancingAlgorithm = defaults.rampUpLoadBalancingAlgorithm;
    	      this.rampUpMinimumHostsPercent = defaults.rampUpMinimumHostsPercent;
    	      this.rampUpStartTime = defaults.rampUpStartTime;
        }

        public Builder daysOfWeeks(List<String> daysOfWeeks) {
            this.daysOfWeeks = Objects.requireNonNull(daysOfWeeks);
            return this;
        }
        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder offPeakLoadBalancingAlgorithm(String offPeakLoadBalancingAlgorithm) {
            this.offPeakLoadBalancingAlgorithm = Objects.requireNonNull(offPeakLoadBalancingAlgorithm);
            return this;
        }
        public Builder offPeakStartTime(String offPeakStartTime) {
            this.offPeakStartTime = Objects.requireNonNull(offPeakStartTime);
            return this;
        }
        public Builder peakLoadBalancingAlgorithm(String peakLoadBalancingAlgorithm) {
            this.peakLoadBalancingAlgorithm = Objects.requireNonNull(peakLoadBalancingAlgorithm);
            return this;
        }
        public Builder peakStartTime(String peakStartTime) {
            this.peakStartTime = Objects.requireNonNull(peakStartTime);
            return this;
        }
        public Builder rampDownCapacityThresholdPercent(Integer rampDownCapacityThresholdPercent) {
            this.rampDownCapacityThresholdPercent = Objects.requireNonNull(rampDownCapacityThresholdPercent);
            return this;
        }
        public Builder rampDownForceLogoffUsers(Boolean rampDownForceLogoffUsers) {
            this.rampDownForceLogoffUsers = Objects.requireNonNull(rampDownForceLogoffUsers);
            return this;
        }
        public Builder rampDownLoadBalancingAlgorithm(String rampDownLoadBalancingAlgorithm) {
            this.rampDownLoadBalancingAlgorithm = Objects.requireNonNull(rampDownLoadBalancingAlgorithm);
            return this;
        }
        public Builder rampDownMinimumHostsPercent(Integer rampDownMinimumHostsPercent) {
            this.rampDownMinimumHostsPercent = Objects.requireNonNull(rampDownMinimumHostsPercent);
            return this;
        }
        public Builder rampDownNotificationMessage(String rampDownNotificationMessage) {
            this.rampDownNotificationMessage = Objects.requireNonNull(rampDownNotificationMessage);
            return this;
        }
        public Builder rampDownStartTime(String rampDownStartTime) {
            this.rampDownStartTime = Objects.requireNonNull(rampDownStartTime);
            return this;
        }
        public Builder rampDownStopHostsWhen(String rampDownStopHostsWhen) {
            this.rampDownStopHostsWhen = Objects.requireNonNull(rampDownStopHostsWhen);
            return this;
        }
        public Builder rampDownWaitTimeMinutes(Integer rampDownWaitTimeMinutes) {
            this.rampDownWaitTimeMinutes = Objects.requireNonNull(rampDownWaitTimeMinutes);
            return this;
        }
        public Builder rampUpCapacityThresholdPercent(@Nullable Integer rampUpCapacityThresholdPercent) {
            this.rampUpCapacityThresholdPercent = rampUpCapacityThresholdPercent;
            return this;
        }
        public Builder rampUpLoadBalancingAlgorithm(String rampUpLoadBalancingAlgorithm) {
            this.rampUpLoadBalancingAlgorithm = Objects.requireNonNull(rampUpLoadBalancingAlgorithm);
            return this;
        }
        public Builder rampUpMinimumHostsPercent(@Nullable Integer rampUpMinimumHostsPercent) {
            this.rampUpMinimumHostsPercent = rampUpMinimumHostsPercent;
            return this;
        }
        public Builder rampUpStartTime(String rampUpStartTime) {
            this.rampUpStartTime = Objects.requireNonNull(rampUpStartTime);
            return this;
        }        public ScalingPlanSchedule build() {
            return new ScalingPlanSchedule(daysOfWeeks, name, offPeakLoadBalancingAlgorithm, offPeakStartTime, peakLoadBalancingAlgorithm, peakStartTime, rampDownCapacityThresholdPercent, rampDownForceLogoffUsers, rampDownLoadBalancingAlgorithm, rampDownMinimumHostsPercent, rampDownNotificationMessage, rampDownStartTime, rampDownStopHostsWhen, rampDownWaitTimeMinutes, rampUpCapacityThresholdPercent, rampUpLoadBalancingAlgorithm, rampUpMinimumHostsPercent, rampUpStartTime);
        }
    }
}

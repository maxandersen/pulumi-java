// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingCpuUtilizationArgs;
import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingDiskUtilizationArgs;
import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingNetworkUtilizationArgs;
import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingRequestUtilizationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleAppVersionAutomaticScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionAutomaticScalingArgs Empty = new FlexibleAppVersionAutomaticScalingArgs();

    /**
     * The time period that the Autoscaler should wait before it starts collecting information from a new instance.
     * This prevents the autoscaler from collecting information when the instance is initializing,
     * during which the collected usage would not be reliable. Default: 120s
     * 
     */
    @Import(name="coolDownPeriod")
    private @Nullable Output<String> coolDownPeriod;

    public Optional<Output<String>> coolDownPeriod() {
        return Optional.ofNullable(this.coolDownPeriod);
    }

    /**
     * Target scaling by CPU usage.
     * Structure is documented below.
     * 
     */
    @Import(name="cpuUtilization", required=true)
    private Output<FlexibleAppVersionAutomaticScalingCpuUtilizationArgs> cpuUtilization;

    public Output<FlexibleAppVersionAutomaticScalingCpuUtilizationArgs> cpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * Target scaling by disk usage.
     * Structure is documented below.
     * 
     */
    @Import(name="diskUtilization")
    private @Nullable Output<FlexibleAppVersionAutomaticScalingDiskUtilizationArgs> diskUtilization;

    public Optional<Output<FlexibleAppVersionAutomaticScalingDiskUtilizationArgs>> diskUtilization() {
        return Optional.ofNullable(this.diskUtilization);
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.
     * Defaults to a runtime-specific value.
     * 
     */
    @Import(name="maxConcurrentRequests")
    private @Nullable Output<Integer> maxConcurrentRequests;

    public Optional<Output<Integer>> maxConcurrentRequests() {
        return Optional.ofNullable(this.maxConcurrentRequests);
    }

    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    @Import(name="maxIdleInstances")
    private @Nullable Output<Integer> maxIdleInstances;

    public Optional<Output<Integer>> maxIdleInstances() {
        return Optional.ofNullable(this.maxIdleInstances);
    }

    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="maxPendingLatency")
    private @Nullable Output<String> maxPendingLatency;

    public Optional<Output<String>> maxPendingLatency() {
        return Optional.ofNullable(this.maxPendingLatency);
    }

    /**
     * Maximum number of instances that should be started to handle requests for this version. Default: 20
     * 
     */
    @Import(name="maxTotalInstances")
    private @Nullable Output<Integer> maxTotalInstances;

    public Optional<Output<Integer>> maxTotalInstances() {
        return Optional.ofNullable(this.maxTotalInstances);
    }

    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    @Import(name="minIdleInstances")
    private @Nullable Output<Integer> minIdleInstances;

    public Optional<Output<Integer>> minIdleInstances() {
        return Optional.ofNullable(this.minIdleInstances);
    }

    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="minPendingLatency")
    private @Nullable Output<String> minPendingLatency;

    public Optional<Output<String>> minPendingLatency() {
        return Optional.ofNullable(this.minPendingLatency);
    }

    /**
     * Minimum number of running instances that should be maintained for this version. Default: 2
     * 
     */
    @Import(name="minTotalInstances")
    private @Nullable Output<Integer> minTotalInstances;

    public Optional<Output<Integer>> minTotalInstances() {
        return Optional.ofNullable(this.minTotalInstances);
    }

    /**
     * Target scaling by network usage.
     * Structure is documented below.
     * 
     */
    @Import(name="networkUtilization")
    private @Nullable Output<FlexibleAppVersionAutomaticScalingNetworkUtilizationArgs> networkUtilization;

    public Optional<Output<FlexibleAppVersionAutomaticScalingNetworkUtilizationArgs>> networkUtilization() {
        return Optional.ofNullable(this.networkUtilization);
    }

    /**
     * Target scaling by request utilization.
     * Structure is documented below.
     * 
     */
    @Import(name="requestUtilization")
    private @Nullable Output<FlexibleAppVersionAutomaticScalingRequestUtilizationArgs> requestUtilization;

    public Optional<Output<FlexibleAppVersionAutomaticScalingRequestUtilizationArgs>> requestUtilization() {
        return Optional.ofNullable(this.requestUtilization);
    }

    private FlexibleAppVersionAutomaticScalingArgs() {}

    private FlexibleAppVersionAutomaticScalingArgs(FlexibleAppVersionAutomaticScalingArgs $) {
        this.coolDownPeriod = $.coolDownPeriod;
        this.cpuUtilization = $.cpuUtilization;
        this.diskUtilization = $.diskUtilization;
        this.maxConcurrentRequests = $.maxConcurrentRequests;
        this.maxIdleInstances = $.maxIdleInstances;
        this.maxPendingLatency = $.maxPendingLatency;
        this.maxTotalInstances = $.maxTotalInstances;
        this.minIdleInstances = $.minIdleInstances;
        this.minPendingLatency = $.minPendingLatency;
        this.minTotalInstances = $.minTotalInstances;
        this.networkUtilization = $.networkUtilization;
        this.requestUtilization = $.requestUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionAutomaticScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionAutomaticScalingArgs $;

        public Builder() {
            $ = new FlexibleAppVersionAutomaticScalingArgs();
        }

        public Builder(FlexibleAppVersionAutomaticScalingArgs defaults) {
            $ = new FlexibleAppVersionAutomaticScalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder coolDownPeriod(@Nullable Output<String> coolDownPeriod) {
            $.coolDownPeriod = coolDownPeriod;
            return this;
        }

        public Builder coolDownPeriod(String coolDownPeriod) {
            return coolDownPeriod(Output.of(coolDownPeriod));
        }

        public Builder cpuUtilization(Output<FlexibleAppVersionAutomaticScalingCpuUtilizationArgs> cpuUtilization) {
            $.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder cpuUtilization(FlexibleAppVersionAutomaticScalingCpuUtilizationArgs cpuUtilization) {
            return cpuUtilization(Output.of(cpuUtilization));
        }

        public Builder diskUtilization(@Nullable Output<FlexibleAppVersionAutomaticScalingDiskUtilizationArgs> diskUtilization) {
            $.diskUtilization = diskUtilization;
            return this;
        }

        public Builder diskUtilization(FlexibleAppVersionAutomaticScalingDiskUtilizationArgs diskUtilization) {
            return diskUtilization(Output.of(diskUtilization));
        }

        public Builder maxConcurrentRequests(@Nullable Output<Integer> maxConcurrentRequests) {
            $.maxConcurrentRequests = maxConcurrentRequests;
            return this;
        }

        public Builder maxConcurrentRequests(Integer maxConcurrentRequests) {
            return maxConcurrentRequests(Output.of(maxConcurrentRequests));
        }

        public Builder maxIdleInstances(@Nullable Output<Integer> maxIdleInstances) {
            $.maxIdleInstances = maxIdleInstances;
            return this;
        }

        public Builder maxIdleInstances(Integer maxIdleInstances) {
            return maxIdleInstances(Output.of(maxIdleInstances));
        }

        public Builder maxPendingLatency(@Nullable Output<String> maxPendingLatency) {
            $.maxPendingLatency = maxPendingLatency;
            return this;
        }

        public Builder maxPendingLatency(String maxPendingLatency) {
            return maxPendingLatency(Output.of(maxPendingLatency));
        }

        public Builder maxTotalInstances(@Nullable Output<Integer> maxTotalInstances) {
            $.maxTotalInstances = maxTotalInstances;
            return this;
        }

        public Builder maxTotalInstances(Integer maxTotalInstances) {
            return maxTotalInstances(Output.of(maxTotalInstances));
        }

        public Builder minIdleInstances(@Nullable Output<Integer> minIdleInstances) {
            $.minIdleInstances = minIdleInstances;
            return this;
        }

        public Builder minIdleInstances(Integer minIdleInstances) {
            return minIdleInstances(Output.of(minIdleInstances));
        }

        public Builder minPendingLatency(@Nullable Output<String> minPendingLatency) {
            $.minPendingLatency = minPendingLatency;
            return this;
        }

        public Builder minPendingLatency(String minPendingLatency) {
            return minPendingLatency(Output.of(minPendingLatency));
        }

        public Builder minTotalInstances(@Nullable Output<Integer> minTotalInstances) {
            $.minTotalInstances = minTotalInstances;
            return this;
        }

        public Builder minTotalInstances(Integer minTotalInstances) {
            return minTotalInstances(Output.of(minTotalInstances));
        }

        public Builder networkUtilization(@Nullable Output<FlexibleAppVersionAutomaticScalingNetworkUtilizationArgs> networkUtilization) {
            $.networkUtilization = networkUtilization;
            return this;
        }

        public Builder networkUtilization(FlexibleAppVersionAutomaticScalingNetworkUtilizationArgs networkUtilization) {
            return networkUtilization(Output.of(networkUtilization));
        }

        public Builder requestUtilization(@Nullable Output<FlexibleAppVersionAutomaticScalingRequestUtilizationArgs> requestUtilization) {
            $.requestUtilization = requestUtilization;
            return this;
        }

        public Builder requestUtilization(FlexibleAppVersionAutomaticScalingRequestUtilizationArgs requestUtilization) {
            return requestUtilization(Output.of(requestUtilization));
        }

        public FlexibleAppVersionAutomaticScalingArgs build() {
            $.cpuUtilization = Objects.requireNonNull($.cpuUtilization, "expected parameter 'cpuUtilization' to be non-null");
            return $;
        }
    }

}

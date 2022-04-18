// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1beta.inputs.CpuUtilizationResponse;
import com.pulumi.googlenative.appengine_v1beta.inputs.CustomMetricResponse;
import com.pulumi.googlenative.appengine_v1beta.inputs.DiskUtilizationResponse;
import com.pulumi.googlenative.appengine_v1beta.inputs.NetworkUtilizationResponse;
import com.pulumi.googlenative.appengine_v1beta.inputs.RequestUtilizationResponse;
import com.pulumi.googlenative.appengine_v1beta.inputs.StandardSchedulerSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Automatic scaling is based on request rate, response latencies, and other application metrics.
 * 
 */
public final class AutomaticScalingResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutomaticScalingResponse Empty = new AutomaticScalingResponse();

    /**
     * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="coolDownPeriod", required=true)
      private final String coolDownPeriod;

    public String coolDownPeriod() {
        return this.coolDownPeriod;
    }

    /**
     * Target scaling by CPU usage.
     * 
     */
    @Import(name="cpuUtilization", required=true)
      private final CpuUtilizationResponse cpuUtilization;

    public CpuUtilizationResponse cpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * Target scaling by user-provided metrics. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="customMetrics", required=true)
      private final List<CustomMetricResponse> customMetrics;

    public List<CustomMetricResponse> customMetrics() {
        return this.customMetrics;
    }

    /**
     * Target scaling by disk usage.
     * 
     */
    @Import(name="diskUtilization", required=true)
      private final DiskUtilizationResponse diskUtilization;

    public DiskUtilizationResponse diskUtilization() {
        return this.diskUtilization;
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
     */
    @Import(name="maxConcurrentRequests", required=true)
      private final Integer maxConcurrentRequests;

    public Integer maxConcurrentRequests() {
        return this.maxConcurrentRequests;
    }

    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    @Import(name="maxIdleInstances", required=true)
      private final Integer maxIdleInstances;

    public Integer maxIdleInstances() {
        return this.maxIdleInstances;
    }

    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="maxPendingLatency", required=true)
      private final String maxPendingLatency;

    public String maxPendingLatency() {
        return this.maxPendingLatency;
    }

    /**
     * Maximum number of instances that should be started to handle requests for this version.
     * 
     */
    @Import(name="maxTotalInstances", required=true)
      private final Integer maxTotalInstances;

    public Integer maxTotalInstances() {
        return this.maxTotalInstances;
    }

    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    @Import(name="minIdleInstances", required=true)
      private final Integer minIdleInstances;

    public Integer minIdleInstances() {
        return this.minIdleInstances;
    }

    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="minPendingLatency", required=true)
      private final String minPendingLatency;

    public String minPendingLatency() {
        return this.minPendingLatency;
    }

    /**
     * Minimum number of running instances that should be maintained for this version.
     * 
     */
    @Import(name="minTotalInstances", required=true)
      private final Integer minTotalInstances;

    public Integer minTotalInstances() {
        return this.minTotalInstances;
    }

    /**
     * Target scaling by network usage.
     * 
     */
    @Import(name="networkUtilization", required=true)
      private final NetworkUtilizationResponse networkUtilization;

    public NetworkUtilizationResponse networkUtilization() {
        return this.networkUtilization;
    }

    /**
     * Target scaling by request utilization.
     * 
     */
    @Import(name="requestUtilization", required=true)
      private final RequestUtilizationResponse requestUtilization;

    public RequestUtilizationResponse requestUtilization() {
        return this.requestUtilization;
    }

    /**
     * Scheduler settings for standard environment.
     * 
     */
    @Import(name="standardSchedulerSettings", required=true)
      private final StandardSchedulerSettingsResponse standardSchedulerSettings;

    public StandardSchedulerSettingsResponse standardSchedulerSettings() {
        return this.standardSchedulerSettings;
    }

    public AutomaticScalingResponse(
        String coolDownPeriod,
        CpuUtilizationResponse cpuUtilization,
        List<CustomMetricResponse> customMetrics,
        DiskUtilizationResponse diskUtilization,
        Integer maxConcurrentRequests,
        Integer maxIdleInstances,
        String maxPendingLatency,
        Integer maxTotalInstances,
        Integer minIdleInstances,
        String minPendingLatency,
        Integer minTotalInstances,
        NetworkUtilizationResponse networkUtilization,
        RequestUtilizationResponse requestUtilization,
        StandardSchedulerSettingsResponse standardSchedulerSettings) {
        this.coolDownPeriod = Objects.requireNonNull(coolDownPeriod, "expected parameter 'coolDownPeriod' to be non-null");
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization, "expected parameter 'cpuUtilization' to be non-null");
        this.customMetrics = Objects.requireNonNull(customMetrics, "expected parameter 'customMetrics' to be non-null");
        this.diskUtilization = Objects.requireNonNull(diskUtilization, "expected parameter 'diskUtilization' to be non-null");
        this.maxConcurrentRequests = Objects.requireNonNull(maxConcurrentRequests, "expected parameter 'maxConcurrentRequests' to be non-null");
        this.maxIdleInstances = Objects.requireNonNull(maxIdleInstances, "expected parameter 'maxIdleInstances' to be non-null");
        this.maxPendingLatency = Objects.requireNonNull(maxPendingLatency, "expected parameter 'maxPendingLatency' to be non-null");
        this.maxTotalInstances = Objects.requireNonNull(maxTotalInstances, "expected parameter 'maxTotalInstances' to be non-null");
        this.minIdleInstances = Objects.requireNonNull(minIdleInstances, "expected parameter 'minIdleInstances' to be non-null");
        this.minPendingLatency = Objects.requireNonNull(minPendingLatency, "expected parameter 'minPendingLatency' to be non-null");
        this.minTotalInstances = Objects.requireNonNull(minTotalInstances, "expected parameter 'minTotalInstances' to be non-null");
        this.networkUtilization = Objects.requireNonNull(networkUtilization, "expected parameter 'networkUtilization' to be non-null");
        this.requestUtilization = Objects.requireNonNull(requestUtilization, "expected parameter 'requestUtilization' to be non-null");
        this.standardSchedulerSettings = Objects.requireNonNull(standardSchedulerSettings, "expected parameter 'standardSchedulerSettings' to be non-null");
    }

    private AutomaticScalingResponse() {
        this.coolDownPeriod = null;
        this.cpuUtilization = null;
        this.customMetrics = List.of();
        this.diskUtilization = null;
        this.maxConcurrentRequests = null;
        this.maxIdleInstances = null;
        this.maxPendingLatency = null;
        this.maxTotalInstances = null;
        this.minIdleInstances = null;
        this.minPendingLatency = null;
        this.minTotalInstances = null;
        this.networkUtilization = null;
        this.requestUtilization = null;
        this.standardSchedulerSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coolDownPeriod;
        private CpuUtilizationResponse cpuUtilization;
        private List<CustomMetricResponse> customMetrics;
        private DiskUtilizationResponse diskUtilization;
        private Integer maxConcurrentRequests;
        private Integer maxIdleInstances;
        private String maxPendingLatency;
        private Integer maxTotalInstances;
        private Integer minIdleInstances;
        private String minPendingLatency;
        private Integer minTotalInstances;
        private NetworkUtilizationResponse networkUtilization;
        private RequestUtilizationResponse requestUtilization;
        private StandardSchedulerSettingsResponse standardSchedulerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriod = defaults.coolDownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.customMetrics = defaults.customMetrics;
    	      this.diskUtilization = defaults.diskUtilization;
    	      this.maxConcurrentRequests = defaults.maxConcurrentRequests;
    	      this.maxIdleInstances = defaults.maxIdleInstances;
    	      this.maxPendingLatency = defaults.maxPendingLatency;
    	      this.maxTotalInstances = defaults.maxTotalInstances;
    	      this.minIdleInstances = defaults.minIdleInstances;
    	      this.minPendingLatency = defaults.minPendingLatency;
    	      this.minTotalInstances = defaults.minTotalInstances;
    	      this.networkUtilization = defaults.networkUtilization;
    	      this.requestUtilization = defaults.requestUtilization;
    	      this.standardSchedulerSettings = defaults.standardSchedulerSettings;
        }

        public Builder coolDownPeriod(String coolDownPeriod) {
            this.coolDownPeriod = Objects.requireNonNull(coolDownPeriod);
            return this;
        }
        public Builder cpuUtilization(CpuUtilizationResponse cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }
        public Builder customMetrics(List<CustomMetricResponse> customMetrics) {
            this.customMetrics = Objects.requireNonNull(customMetrics);
            return this;
        }
        public Builder customMetrics(CustomMetricResponse... customMetrics) {
            return customMetrics(List.of(customMetrics));
        }
        public Builder diskUtilization(DiskUtilizationResponse diskUtilization) {
            this.diskUtilization = Objects.requireNonNull(diskUtilization);
            return this;
        }
        public Builder maxConcurrentRequests(Integer maxConcurrentRequests) {
            this.maxConcurrentRequests = Objects.requireNonNull(maxConcurrentRequests);
            return this;
        }
        public Builder maxIdleInstances(Integer maxIdleInstances) {
            this.maxIdleInstances = Objects.requireNonNull(maxIdleInstances);
            return this;
        }
        public Builder maxPendingLatency(String maxPendingLatency) {
            this.maxPendingLatency = Objects.requireNonNull(maxPendingLatency);
            return this;
        }
        public Builder maxTotalInstances(Integer maxTotalInstances) {
            this.maxTotalInstances = Objects.requireNonNull(maxTotalInstances);
            return this;
        }
        public Builder minIdleInstances(Integer minIdleInstances) {
            this.minIdleInstances = Objects.requireNonNull(minIdleInstances);
            return this;
        }
        public Builder minPendingLatency(String minPendingLatency) {
            this.minPendingLatency = Objects.requireNonNull(minPendingLatency);
            return this;
        }
        public Builder minTotalInstances(Integer minTotalInstances) {
            this.minTotalInstances = Objects.requireNonNull(minTotalInstances);
            return this;
        }
        public Builder networkUtilization(NetworkUtilizationResponse networkUtilization) {
            this.networkUtilization = Objects.requireNonNull(networkUtilization);
            return this;
        }
        public Builder requestUtilization(RequestUtilizationResponse requestUtilization) {
            this.requestUtilization = Objects.requireNonNull(requestUtilization);
            return this;
        }
        public Builder standardSchedulerSettings(StandardSchedulerSettingsResponse standardSchedulerSettings) {
            this.standardSchedulerSettings = Objects.requireNonNull(standardSchedulerSettings);
            return this;
        }        public AutomaticScalingResponse build() {
            return new AutomaticScalingResponse(coolDownPeriod, cpuUtilization, customMetrics, diskUtilization, maxConcurrentRequests, maxIdleInstances, maxPendingLatency, maxTotalInstances, minIdleInstances, minPendingLatency, minTotalInstances, networkUtilization, requestUtilization, standardSchedulerSettings);
        }
    }
}

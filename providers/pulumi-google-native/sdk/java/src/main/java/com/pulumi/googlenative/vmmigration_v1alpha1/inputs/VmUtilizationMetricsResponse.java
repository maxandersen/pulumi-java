// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Utilization metrics values for a single VM.
 * 
 */
public final class VmUtilizationMetricsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VmUtilizationMetricsResponse Empty = new VmUtilizationMetricsResponse();

    /**
     * Average CPU usage, percent.
     * 
     */
    @Import(name="cpuAverage", required=true)
      private final Integer cpuAverage;

    public Integer cpuAverage() {
        return this.cpuAverage;
    }

    /**
     * Average CPU usage, percent.
     * 
     */
    @Import(name="cpuAveragePercent", required=true)
      private final Integer cpuAveragePercent;

    public Integer cpuAveragePercent() {
        return this.cpuAveragePercent;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @Import(name="cpuMax", required=true)
      private final Integer cpuMax;

    public Integer cpuMax() {
        return this.cpuMax;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @Import(name="cpuMaxPercent", required=true)
      private final Integer cpuMaxPercent;

    public Integer cpuMaxPercent() {
        return this.cpuMaxPercent;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateAverage", required=true)
      private final String diskIoRateAverage;

    public String diskIoRateAverage() {
        return this.diskIoRateAverage;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateAverageKbps", required=true)
      private final String diskIoRateAverageKbps;

    public String diskIoRateAverageKbps() {
        return this.diskIoRateAverageKbps;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateMax", required=true)
      private final String diskIoRateMax;

    public String diskIoRateMax() {
        return this.diskIoRateMax;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateMaxKbps", required=true)
      private final String diskIoRateMaxKbps;

    public String diskIoRateMaxKbps() {
        return this.diskIoRateMaxKbps;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @Import(name="memoryAverage", required=true)
      private final Integer memoryAverage;

    public Integer memoryAverage() {
        return this.memoryAverage;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @Import(name="memoryAveragePercent", required=true)
      private final Integer memoryAveragePercent;

    public Integer memoryAveragePercent() {
        return this.memoryAveragePercent;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @Import(name="memoryMax", required=true)
      private final Integer memoryMax;

    public Integer memoryMax() {
        return this.memoryMax;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @Import(name="memoryMaxPercent", required=true)
      private final Integer memoryMaxPercent;

    public Integer memoryMaxPercent() {
        return this.memoryMaxPercent;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputAverage", required=true)
      private final String networkThroughputAverage;

    public String networkThroughputAverage() {
        return this.networkThroughputAverage;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputAverageKbps", required=true)
      private final String networkThroughputAverageKbps;

    public String networkThroughputAverageKbps() {
        return this.networkThroughputAverageKbps;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputMax", required=true)
      private final String networkThroughputMax;

    public String networkThroughputMax() {
        return this.networkThroughputMax;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputMaxKbps", required=true)
      private final String networkThroughputMaxKbps;

    public String networkThroughputMaxKbps() {
        return this.networkThroughputMaxKbps;
    }

    public VmUtilizationMetricsResponse(
        Integer cpuAverage,
        Integer cpuAveragePercent,
        Integer cpuMax,
        Integer cpuMaxPercent,
        String diskIoRateAverage,
        String diskIoRateAverageKbps,
        String diskIoRateMax,
        String diskIoRateMaxKbps,
        Integer memoryAverage,
        Integer memoryAveragePercent,
        Integer memoryMax,
        Integer memoryMaxPercent,
        String networkThroughputAverage,
        String networkThroughputAverageKbps,
        String networkThroughputMax,
        String networkThroughputMaxKbps) {
        this.cpuAverage = Objects.requireNonNull(cpuAverage, "expected parameter 'cpuAverage' to be non-null");
        this.cpuAveragePercent = Objects.requireNonNull(cpuAveragePercent, "expected parameter 'cpuAveragePercent' to be non-null");
        this.cpuMax = Objects.requireNonNull(cpuMax, "expected parameter 'cpuMax' to be non-null");
        this.cpuMaxPercent = Objects.requireNonNull(cpuMaxPercent, "expected parameter 'cpuMaxPercent' to be non-null");
        this.diskIoRateAverage = Objects.requireNonNull(diskIoRateAverage, "expected parameter 'diskIoRateAverage' to be non-null");
        this.diskIoRateAverageKbps = Objects.requireNonNull(diskIoRateAverageKbps, "expected parameter 'diskIoRateAverageKbps' to be non-null");
        this.diskIoRateMax = Objects.requireNonNull(diskIoRateMax, "expected parameter 'diskIoRateMax' to be non-null");
        this.diskIoRateMaxKbps = Objects.requireNonNull(diskIoRateMaxKbps, "expected parameter 'diskIoRateMaxKbps' to be non-null");
        this.memoryAverage = Objects.requireNonNull(memoryAverage, "expected parameter 'memoryAverage' to be non-null");
        this.memoryAveragePercent = Objects.requireNonNull(memoryAveragePercent, "expected parameter 'memoryAveragePercent' to be non-null");
        this.memoryMax = Objects.requireNonNull(memoryMax, "expected parameter 'memoryMax' to be non-null");
        this.memoryMaxPercent = Objects.requireNonNull(memoryMaxPercent, "expected parameter 'memoryMaxPercent' to be non-null");
        this.networkThroughputAverage = Objects.requireNonNull(networkThroughputAverage, "expected parameter 'networkThroughputAverage' to be non-null");
        this.networkThroughputAverageKbps = Objects.requireNonNull(networkThroughputAverageKbps, "expected parameter 'networkThroughputAverageKbps' to be non-null");
        this.networkThroughputMax = Objects.requireNonNull(networkThroughputMax, "expected parameter 'networkThroughputMax' to be non-null");
        this.networkThroughputMaxKbps = Objects.requireNonNull(networkThroughputMaxKbps, "expected parameter 'networkThroughputMaxKbps' to be non-null");
    }

    private VmUtilizationMetricsResponse() {
        this.cpuAverage = null;
        this.cpuAveragePercent = null;
        this.cpuMax = null;
        this.cpuMaxPercent = null;
        this.diskIoRateAverage = null;
        this.diskIoRateAverageKbps = null;
        this.diskIoRateMax = null;
        this.diskIoRateMaxKbps = null;
        this.memoryAverage = null;
        this.memoryAveragePercent = null;
        this.memoryMax = null;
        this.memoryMaxPercent = null;
        this.networkThroughputAverage = null;
        this.networkThroughputAverageKbps = null;
        this.networkThroughputMax = null;
        this.networkThroughputMaxKbps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuAverage;
        private Integer cpuAveragePercent;
        private Integer cpuMax;
        private Integer cpuMaxPercent;
        private String diskIoRateAverage;
        private String diskIoRateAverageKbps;
        private String diskIoRateMax;
        private String diskIoRateMaxKbps;
        private Integer memoryAverage;
        private Integer memoryAveragePercent;
        private Integer memoryMax;
        private Integer memoryMaxPercent;
        private String networkThroughputAverage;
        private String networkThroughputAverageKbps;
        private String networkThroughputMax;
        private String networkThroughputMaxKbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuAverage = defaults.cpuAverage;
    	      this.cpuAveragePercent = defaults.cpuAveragePercent;
    	      this.cpuMax = defaults.cpuMax;
    	      this.cpuMaxPercent = defaults.cpuMaxPercent;
    	      this.diskIoRateAverage = defaults.diskIoRateAverage;
    	      this.diskIoRateAverageKbps = defaults.diskIoRateAverageKbps;
    	      this.diskIoRateMax = defaults.diskIoRateMax;
    	      this.diskIoRateMaxKbps = defaults.diskIoRateMaxKbps;
    	      this.memoryAverage = defaults.memoryAverage;
    	      this.memoryAveragePercent = defaults.memoryAveragePercent;
    	      this.memoryMax = defaults.memoryMax;
    	      this.memoryMaxPercent = defaults.memoryMaxPercent;
    	      this.networkThroughputAverage = defaults.networkThroughputAverage;
    	      this.networkThroughputAverageKbps = defaults.networkThroughputAverageKbps;
    	      this.networkThroughputMax = defaults.networkThroughputMax;
    	      this.networkThroughputMaxKbps = defaults.networkThroughputMaxKbps;
        }

        public Builder cpuAverage(Integer cpuAverage) {
            this.cpuAverage = Objects.requireNonNull(cpuAverage);
            return this;
        }
        public Builder cpuAveragePercent(Integer cpuAveragePercent) {
            this.cpuAveragePercent = Objects.requireNonNull(cpuAveragePercent);
            return this;
        }
        public Builder cpuMax(Integer cpuMax) {
            this.cpuMax = Objects.requireNonNull(cpuMax);
            return this;
        }
        public Builder cpuMaxPercent(Integer cpuMaxPercent) {
            this.cpuMaxPercent = Objects.requireNonNull(cpuMaxPercent);
            return this;
        }
        public Builder diskIoRateAverage(String diskIoRateAverage) {
            this.diskIoRateAverage = Objects.requireNonNull(diskIoRateAverage);
            return this;
        }
        public Builder diskIoRateAverageKbps(String diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = Objects.requireNonNull(diskIoRateAverageKbps);
            return this;
        }
        public Builder diskIoRateMax(String diskIoRateMax) {
            this.diskIoRateMax = Objects.requireNonNull(diskIoRateMax);
            return this;
        }
        public Builder diskIoRateMaxKbps(String diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = Objects.requireNonNull(diskIoRateMaxKbps);
            return this;
        }
        public Builder memoryAverage(Integer memoryAverage) {
            this.memoryAverage = Objects.requireNonNull(memoryAverage);
            return this;
        }
        public Builder memoryAveragePercent(Integer memoryAveragePercent) {
            this.memoryAveragePercent = Objects.requireNonNull(memoryAveragePercent);
            return this;
        }
        public Builder memoryMax(Integer memoryMax) {
            this.memoryMax = Objects.requireNonNull(memoryMax);
            return this;
        }
        public Builder memoryMaxPercent(Integer memoryMaxPercent) {
            this.memoryMaxPercent = Objects.requireNonNull(memoryMaxPercent);
            return this;
        }
        public Builder networkThroughputAverage(String networkThroughputAverage) {
            this.networkThroughputAverage = Objects.requireNonNull(networkThroughputAverage);
            return this;
        }
        public Builder networkThroughputAverageKbps(String networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = Objects.requireNonNull(networkThroughputAverageKbps);
            return this;
        }
        public Builder networkThroughputMax(String networkThroughputMax) {
            this.networkThroughputMax = Objects.requireNonNull(networkThroughputMax);
            return this;
        }
        public Builder networkThroughputMaxKbps(String networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = Objects.requireNonNull(networkThroughputMaxKbps);
            return this;
        }        public VmUtilizationMetricsResponse build() {
            return new VmUtilizationMetricsResponse(cpuAverage, cpuAveragePercent, cpuMax, cpuMaxPercent, diskIoRateAverage, diskIoRateAverageKbps, diskIoRateMax, diskIoRateMaxKbps, memoryAverage, memoryAveragePercent, memoryMax, memoryMaxPercent, networkThroughputAverage, networkThroughputAverageKbps, networkThroughputMax, networkThroughputMaxKbps);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Utilization metrics values for a single VM.
 * 
 */
public final class VmUtilizationMetricsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmUtilizationMetricsArgs Empty = new VmUtilizationMetricsArgs();

    /**
     * Average CPU usage, percent.
     * 
     */
    @Import(name="cpuAveragePercent")
      private final @Nullable Output<Integer> cpuAveragePercent;

    public Output<Integer> cpuAveragePercent() {
        return this.cpuAveragePercent == null ? Codegen.empty() : this.cpuAveragePercent;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @Import(name="cpuMaxPercent")
      private final @Nullable Output<Integer> cpuMaxPercent;

    public Output<Integer> cpuMaxPercent() {
        return this.cpuMaxPercent == null ? Codegen.empty() : this.cpuMaxPercent;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateAverageKbps")
      private final @Nullable Output<String> diskIoRateAverageKbps;

    public Output<String> diskIoRateAverageKbps() {
        return this.diskIoRateAverageKbps == null ? Codegen.empty() : this.diskIoRateAverageKbps;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateMaxKbps")
      private final @Nullable Output<String> diskIoRateMaxKbps;

    public Output<String> diskIoRateMaxKbps() {
        return this.diskIoRateMaxKbps == null ? Codegen.empty() : this.diskIoRateMaxKbps;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @Import(name="memoryAveragePercent")
      private final @Nullable Output<Integer> memoryAveragePercent;

    public Output<Integer> memoryAveragePercent() {
        return this.memoryAveragePercent == null ? Codegen.empty() : this.memoryAveragePercent;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @Import(name="memoryMaxPercent")
      private final @Nullable Output<Integer> memoryMaxPercent;

    public Output<Integer> memoryMaxPercent() {
        return this.memoryMaxPercent == null ? Codegen.empty() : this.memoryMaxPercent;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputAverageKbps")
      private final @Nullable Output<String> networkThroughputAverageKbps;

    public Output<String> networkThroughputAverageKbps() {
        return this.networkThroughputAverageKbps == null ? Codegen.empty() : this.networkThroughputAverageKbps;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputMaxKbps")
      private final @Nullable Output<String> networkThroughputMaxKbps;

    public Output<String> networkThroughputMaxKbps() {
        return this.networkThroughputMaxKbps == null ? Codegen.empty() : this.networkThroughputMaxKbps;
    }

    public VmUtilizationMetricsArgs(
        @Nullable Output<Integer> cpuAveragePercent,
        @Nullable Output<Integer> cpuMaxPercent,
        @Nullable Output<String> diskIoRateAverageKbps,
        @Nullable Output<String> diskIoRateMaxKbps,
        @Nullable Output<Integer> memoryAveragePercent,
        @Nullable Output<Integer> memoryMaxPercent,
        @Nullable Output<String> networkThroughputAverageKbps,
        @Nullable Output<String> networkThroughputMaxKbps) {
        this.cpuAveragePercent = cpuAveragePercent;
        this.cpuMaxPercent = cpuMaxPercent;
        this.diskIoRateAverageKbps = diskIoRateAverageKbps;
        this.diskIoRateMaxKbps = diskIoRateMaxKbps;
        this.memoryAveragePercent = memoryAveragePercent;
        this.memoryMaxPercent = memoryMaxPercent;
        this.networkThroughputAverageKbps = networkThroughputAverageKbps;
        this.networkThroughputMaxKbps = networkThroughputMaxKbps;
    }

    private VmUtilizationMetricsArgs() {
        this.cpuAveragePercent = Codegen.empty();
        this.cpuMaxPercent = Codegen.empty();
        this.diskIoRateAverageKbps = Codegen.empty();
        this.diskIoRateMaxKbps = Codegen.empty();
        this.memoryAveragePercent = Codegen.empty();
        this.memoryMaxPercent = Codegen.empty();
        this.networkThroughputAverageKbps = Codegen.empty();
        this.networkThroughputMaxKbps = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cpuAveragePercent;
        private @Nullable Output<Integer> cpuMaxPercent;
        private @Nullable Output<String> diskIoRateAverageKbps;
        private @Nullable Output<String> diskIoRateMaxKbps;
        private @Nullable Output<Integer> memoryAveragePercent;
        private @Nullable Output<Integer> memoryMaxPercent;
        private @Nullable Output<String> networkThroughputAverageKbps;
        private @Nullable Output<String> networkThroughputMaxKbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuAveragePercent = defaults.cpuAveragePercent;
    	      this.cpuMaxPercent = defaults.cpuMaxPercent;
    	      this.diskIoRateAverageKbps = defaults.diskIoRateAverageKbps;
    	      this.diskIoRateMaxKbps = defaults.diskIoRateMaxKbps;
    	      this.memoryAveragePercent = defaults.memoryAveragePercent;
    	      this.memoryMaxPercent = defaults.memoryMaxPercent;
    	      this.networkThroughputAverageKbps = defaults.networkThroughputAverageKbps;
    	      this.networkThroughputMaxKbps = defaults.networkThroughputMaxKbps;
        }

        public Builder cpuAveragePercent(@Nullable Output<Integer> cpuAveragePercent) {
            this.cpuAveragePercent = cpuAveragePercent;
            return this;
        }
        public Builder cpuAveragePercent(@Nullable Integer cpuAveragePercent) {
            this.cpuAveragePercent = Codegen.ofNullable(cpuAveragePercent);
            return this;
        }
        public Builder cpuMaxPercent(@Nullable Output<Integer> cpuMaxPercent) {
            this.cpuMaxPercent = cpuMaxPercent;
            return this;
        }
        public Builder cpuMaxPercent(@Nullable Integer cpuMaxPercent) {
            this.cpuMaxPercent = Codegen.ofNullable(cpuMaxPercent);
            return this;
        }
        public Builder diskIoRateAverageKbps(@Nullable Output<String> diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = diskIoRateAverageKbps;
            return this;
        }
        public Builder diskIoRateAverageKbps(@Nullable String diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = Codegen.ofNullable(diskIoRateAverageKbps);
            return this;
        }
        public Builder diskIoRateMaxKbps(@Nullable Output<String> diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = diskIoRateMaxKbps;
            return this;
        }
        public Builder diskIoRateMaxKbps(@Nullable String diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = Codegen.ofNullable(diskIoRateMaxKbps);
            return this;
        }
        public Builder memoryAveragePercent(@Nullable Output<Integer> memoryAveragePercent) {
            this.memoryAveragePercent = memoryAveragePercent;
            return this;
        }
        public Builder memoryAveragePercent(@Nullable Integer memoryAveragePercent) {
            this.memoryAveragePercent = Codegen.ofNullable(memoryAveragePercent);
            return this;
        }
        public Builder memoryMaxPercent(@Nullable Output<Integer> memoryMaxPercent) {
            this.memoryMaxPercent = memoryMaxPercent;
            return this;
        }
        public Builder memoryMaxPercent(@Nullable Integer memoryMaxPercent) {
            this.memoryMaxPercent = Codegen.ofNullable(memoryMaxPercent);
            return this;
        }
        public Builder networkThroughputAverageKbps(@Nullable Output<String> networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = networkThroughputAverageKbps;
            return this;
        }
        public Builder networkThroughputAverageKbps(@Nullable String networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = Codegen.ofNullable(networkThroughputAverageKbps);
            return this;
        }
        public Builder networkThroughputMaxKbps(@Nullable Output<String> networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = networkThroughputMaxKbps;
            return this;
        }
        public Builder networkThroughputMaxKbps(@Nullable String networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = Codegen.ofNullable(networkThroughputMaxKbps);
            return this;
        }        public VmUtilizationMetricsArgs build() {
            return new VmUtilizationMetricsArgs(cpuAveragePercent, cpuMaxPercent, diskIoRateAverageKbps, diskIoRateMaxKbps, memoryAveragePercent, memoryMaxPercent, networkThroughputAverageKbps, networkThroughputMaxKbps);
        }
    }
}

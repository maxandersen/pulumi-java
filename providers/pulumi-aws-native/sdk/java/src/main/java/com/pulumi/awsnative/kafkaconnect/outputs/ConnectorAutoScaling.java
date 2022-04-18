// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.outputs;

import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorScaleInPolicy;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorScaleOutPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ConnectorAutoScaling {
    /**
     * The maximum number of workers for a connector.
     * 
     */
    private final Integer maxWorkerCount;
    /**
     * Specifies how many MSK Connect Units (MCU) as the minimum scaling unit.
     * 
     */
    private final Integer mcuCount;
    /**
     * The minimum number of workers for a connector.
     * 
     */
    private final Integer minWorkerCount;
    private final ConnectorScaleInPolicy scaleInPolicy;
    private final ConnectorScaleOutPolicy scaleOutPolicy;

    @CustomType.Constructor
    private ConnectorAutoScaling(
        @CustomType.Parameter("maxWorkerCount") Integer maxWorkerCount,
        @CustomType.Parameter("mcuCount") Integer mcuCount,
        @CustomType.Parameter("minWorkerCount") Integer minWorkerCount,
        @CustomType.Parameter("scaleInPolicy") ConnectorScaleInPolicy scaleInPolicy,
        @CustomType.Parameter("scaleOutPolicy") ConnectorScaleOutPolicy scaleOutPolicy) {
        this.maxWorkerCount = maxWorkerCount;
        this.mcuCount = mcuCount;
        this.minWorkerCount = minWorkerCount;
        this.scaleInPolicy = scaleInPolicy;
        this.scaleOutPolicy = scaleOutPolicy;
    }

    /**
     * The maximum number of workers for a connector.
     * 
    */
    public Integer maxWorkerCount() {
        return this.maxWorkerCount;
    }
    /**
     * Specifies how many MSK Connect Units (MCU) as the minimum scaling unit.
     * 
    */
    public Integer mcuCount() {
        return this.mcuCount;
    }
    /**
     * The minimum number of workers for a connector.
     * 
    */
    public Integer minWorkerCount() {
        return this.minWorkerCount;
    }
    public ConnectorScaleInPolicy scaleInPolicy() {
        return this.scaleInPolicy;
    }
    public ConnectorScaleOutPolicy scaleOutPolicy() {
        return this.scaleOutPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorAutoScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxWorkerCount;
        private Integer mcuCount;
        private Integer minWorkerCount;
        private ConnectorScaleInPolicy scaleInPolicy;
        private ConnectorScaleOutPolicy scaleOutPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorAutoScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxWorkerCount = defaults.maxWorkerCount;
    	      this.mcuCount = defaults.mcuCount;
    	      this.minWorkerCount = defaults.minWorkerCount;
    	      this.scaleInPolicy = defaults.scaleInPolicy;
    	      this.scaleOutPolicy = defaults.scaleOutPolicy;
        }

        public Builder maxWorkerCount(Integer maxWorkerCount) {
            this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount);
            return this;
        }
        public Builder mcuCount(Integer mcuCount) {
            this.mcuCount = Objects.requireNonNull(mcuCount);
            return this;
        }
        public Builder minWorkerCount(Integer minWorkerCount) {
            this.minWorkerCount = Objects.requireNonNull(minWorkerCount);
            return this;
        }
        public Builder scaleInPolicy(ConnectorScaleInPolicy scaleInPolicy) {
            this.scaleInPolicy = Objects.requireNonNull(scaleInPolicy);
            return this;
        }
        public Builder scaleOutPolicy(ConnectorScaleOutPolicy scaleOutPolicy) {
            this.scaleOutPolicy = Objects.requireNonNull(scaleOutPolicy);
            return this;
        }        public ConnectorAutoScaling build() {
            return new ConnectorAutoScaling(maxWorkerCount, mcuCount, minWorkerCount, scaleInPolicy, scaleOutPolicy);
        }
    }
}

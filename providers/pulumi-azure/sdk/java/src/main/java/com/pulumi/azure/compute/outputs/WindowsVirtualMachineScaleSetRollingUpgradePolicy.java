// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WindowsVirtualMachineScaleSetRollingUpgradePolicy {
    /**
     * @return The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability.
     * 
     */
    private final Integer maxBatchInstancePercent;
    /**
     * @return The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch.
     * 
     */
    private final Integer maxUnhealthyInstancePercent;
    /**
     * @return The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts.
     * 
     */
    private final Integer maxUnhealthyUpgradedInstancePercent;
    /**
     * @return The wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format.
     * 
     */
    private final String pauseTimeBetweenBatches;

    @CustomType.Constructor
    private WindowsVirtualMachineScaleSetRollingUpgradePolicy(
        @CustomType.Parameter("maxBatchInstancePercent") Integer maxBatchInstancePercent,
        @CustomType.Parameter("maxUnhealthyInstancePercent") Integer maxUnhealthyInstancePercent,
        @CustomType.Parameter("maxUnhealthyUpgradedInstancePercent") Integer maxUnhealthyUpgradedInstancePercent,
        @CustomType.Parameter("pauseTimeBetweenBatches") String pauseTimeBetweenBatches) {
        this.maxBatchInstancePercent = maxBatchInstancePercent;
        this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
        this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
        this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
    }

    /**
     * @return The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability.
     * 
     */
    public Integer maxBatchInstancePercent() {
        return this.maxBatchInstancePercent;
    }
    /**
     * @return The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch.
     * 
     */
    public Integer maxUnhealthyInstancePercent() {
        return this.maxUnhealthyInstancePercent;
    }
    /**
     * @return The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts.
     * 
     */
    public Integer maxUnhealthyUpgradedInstancePercent() {
        return this.maxUnhealthyUpgradedInstancePercent;
    }
    /**
     * @return The wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format.
     * 
     */
    public String pauseTimeBetweenBatches() {
        return this.pauseTimeBetweenBatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsVirtualMachineScaleSetRollingUpgradePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxBatchInstancePercent;
        private Integer maxUnhealthyInstancePercent;
        private Integer maxUnhealthyUpgradedInstancePercent;
        private String pauseTimeBetweenBatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsVirtualMachineScaleSetRollingUpgradePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBatchInstancePercent = defaults.maxBatchInstancePercent;
    	      this.maxUnhealthyInstancePercent = defaults.maxUnhealthyInstancePercent;
    	      this.maxUnhealthyUpgradedInstancePercent = defaults.maxUnhealthyUpgradedInstancePercent;
    	      this.pauseTimeBetweenBatches = defaults.pauseTimeBetweenBatches;
        }

        public Builder maxBatchInstancePercent(Integer maxBatchInstancePercent) {
            this.maxBatchInstancePercent = Objects.requireNonNull(maxBatchInstancePercent);
            return this;
        }
        public Builder maxUnhealthyInstancePercent(Integer maxUnhealthyInstancePercent) {
            this.maxUnhealthyInstancePercent = Objects.requireNonNull(maxUnhealthyInstancePercent);
            return this;
        }
        public Builder maxUnhealthyUpgradedInstancePercent(Integer maxUnhealthyUpgradedInstancePercent) {
            this.maxUnhealthyUpgradedInstancePercent = Objects.requireNonNull(maxUnhealthyUpgradedInstancePercent);
            return this;
        }
        public Builder pauseTimeBetweenBatches(String pauseTimeBetweenBatches) {
            this.pauseTimeBetweenBatches = Objects.requireNonNull(pauseTimeBetweenBatches);
            return this;
        }        public WindowsVirtualMachineScaleSetRollingUpgradePolicy build() {
            return new WindowsVirtualMachineScaleSetRollingUpgradePolicy(maxBatchInstancePercent, maxUnhealthyInstancePercent, maxUnhealthyUpgradedInstancePercent, pauseTimeBetweenBatches);
        }
    }
}

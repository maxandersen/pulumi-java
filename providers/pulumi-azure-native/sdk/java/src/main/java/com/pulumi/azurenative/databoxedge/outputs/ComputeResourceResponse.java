// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ComputeResourceResponse {
    /**
     * Memory in GB
     * 
     */
    private final Double memoryInGB;
    /**
     * Processor count
     * 
     */
    private final Integer processorCount;

    @CustomType.Constructor
    private ComputeResourceResponse(
        @CustomType.Parameter("memoryInGB") Double memoryInGB,
        @CustomType.Parameter("processorCount") Integer processorCount) {
        this.memoryInGB = memoryInGB;
        this.processorCount = processorCount;
    }

    /**
     * Memory in GB
     * 
    */
    public Double memoryInGB() {
        return this.memoryInGB;
    }
    /**
     * Processor count
     * 
    */
    public Integer processorCount() {
        return this.processorCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double memoryInGB;
        private Integer processorCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.processorCount = defaults.processorCount;
        }

        public Builder memoryInGB(Double memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }
        public Builder processorCount(Integer processorCount) {
            this.processorCount = Objects.requireNonNull(processorCount);
            return this;
        }        public ComputeResourceResponse build() {
            return new ComputeResourceResponse(memoryInGB, processorCount);
        }
    }
}

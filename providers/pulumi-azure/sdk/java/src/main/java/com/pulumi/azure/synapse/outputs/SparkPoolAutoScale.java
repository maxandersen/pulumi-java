// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SparkPoolAutoScale {
    /**
     * @return The maximum number of nodes the Spark Pool can support. Must be between `3` and `200`.
     * 
     */
    private final Integer maxNodeCount;
    /**
     * @return The minimum number of nodes the Spark Pool can support. Must be between `3` and `200`.
     * 
     */
    private final Integer minNodeCount;

    @CustomType.Constructor
    private SparkPoolAutoScale(
        @CustomType.Parameter("maxNodeCount") Integer maxNodeCount,
        @CustomType.Parameter("minNodeCount") Integer minNodeCount) {
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
    }

    /**
     * @return The maximum number of nodes the Spark Pool can support. Must be between `3` and `200`.
     * 
     */
    public Integer maxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * @return The minimum number of nodes the Spark Pool can support. Must be between `3` and `200`.
     * 
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkPoolAutoScale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodeCount;
        private Integer minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkPoolAutoScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }
        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }        public SparkPoolAutoScale build() {
            return new SparkPoolAutoScale(maxNodeCount, minNodeCount);
        }
    }
}

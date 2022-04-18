// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class CapacityResponse {
    /**
     * Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16.
     * 
     */
    private final Integer publishMibPerSec;
    /**
     * Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 32.
     * 
     */
    private final Integer subscribeMibPerSec;

    @CustomType.Constructor
    private CapacityResponse(
        @CustomType.Parameter("publishMibPerSec") Integer publishMibPerSec,
        @CustomType.Parameter("subscribeMibPerSec") Integer subscribeMibPerSec) {
        this.publishMibPerSec = publishMibPerSec;
        this.subscribeMibPerSec = subscribeMibPerSec;
    }

    /**
     * Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16.
     * 
    */
    public Integer publishMibPerSec() {
        return this.publishMibPerSec;
    }
    /**
     * Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 32.
     * 
    */
    public Integer subscribeMibPerSec() {
        return this.subscribeMibPerSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer publishMibPerSec;
        private Integer subscribeMibPerSec;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMibPerSec = defaults.publishMibPerSec;
    	      this.subscribeMibPerSec = defaults.subscribeMibPerSec;
        }

        public Builder publishMibPerSec(Integer publishMibPerSec) {
            this.publishMibPerSec = Objects.requireNonNull(publishMibPerSec);
            return this;
        }
        public Builder subscribeMibPerSec(Integer subscribeMibPerSec) {
            this.subscribeMibPerSec = Objects.requireNonNull(subscribeMibPerSec);
            return this;
        }        public CapacityResponse build() {
            return new CapacityResponse(publishMibPerSec, subscribeMibPerSec);
        }
    }
}

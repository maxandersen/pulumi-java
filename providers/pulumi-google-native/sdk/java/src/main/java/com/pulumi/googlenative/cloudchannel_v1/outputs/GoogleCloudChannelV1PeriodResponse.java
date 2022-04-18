// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudChannelV1PeriodResponse {
    /**
     * Total duration of Period Type defined.
     * 
     */
    private final Integer duration;
    /**
     * Period Type.
     * 
     */
    private final String periodType;

    @CustomType.Constructor
    private GoogleCloudChannelV1PeriodResponse(
        @CustomType.Parameter("duration") Integer duration,
        @CustomType.Parameter("periodType") String periodType) {
        this.duration = duration;
        this.periodType = periodType;
    }

    /**
     * Total duration of Period Type defined.
     * 
    */
    public Integer duration() {
        return this.duration;
    }
    /**
     * Period Type.
     * 
    */
    public String periodType() {
        return this.periodType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1PeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer duration;
        private String periodType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1PeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.periodType = defaults.periodType;
        }

        public Builder duration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder periodType(String periodType) {
            this.periodType = Objects.requireNonNull(periodType);
            return this;
        }        public GoogleCloudChannelV1PeriodResponse build() {
            return new GoogleCloudChannelV1PeriodResponse(duration, periodType);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1TraceSamplingConfigResponse {
    /**
     * Sampler of distributed tracing. OFF is the default value.
     * 
     */
    private final String sampler;
    /**
     * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are > 0 and <= 0.5.
     * 
     */
    private final Double samplingRate;

    @CustomType.Constructor
    private GoogleCloudApigeeV1TraceSamplingConfigResponse(
        @CustomType.Parameter("sampler") String sampler,
        @CustomType.Parameter("samplingRate") Double samplingRate) {
        this.sampler = sampler;
        this.samplingRate = samplingRate;
    }

    /**
     * Sampler of distributed tracing. OFF is the default value.
     * 
    */
    public String sampler() {
        return this.sampler;
    }
    /**
     * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are > 0 and <= 0.5.
     * 
    */
    public Double samplingRate() {
        return this.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sampler;
        private Double samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sampler = defaults.sampler;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder sampler(String sampler) {
            this.sampler = Objects.requireNonNull(sampler);
            return this;
        }
        public Builder samplingRate(Double samplingRate) {
            this.samplingRate = Objects.requireNonNull(samplingRate);
            return this;
        }        public GoogleCloudApigeeV1TraceSamplingConfigResponse build() {
            return new GoogleCloudApigeeV1TraceSamplingConfigResponse(sampler, samplingRate);
        }
    }
}

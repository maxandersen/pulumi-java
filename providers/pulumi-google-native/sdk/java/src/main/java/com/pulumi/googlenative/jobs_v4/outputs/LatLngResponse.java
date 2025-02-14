// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class LatLngResponse {
    /**
     * @return The latitude in degrees. It must be in the range [-90.0, +90.0].
     * 
     */
    private final Double latitude;
    /**
     * @return The longitude in degrees. It must be in the range [-180.0, +180.0].
     * 
     */
    private final Double longitude;

    @CustomType.Constructor
    private LatLngResponse(
        @CustomType.Parameter("latitude") Double latitude,
        @CustomType.Parameter("longitude") Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * @return The latitude in degrees. It must be in the range [-90.0, +90.0].
     * 
     */
    public Double latitude() {
        return this.latitude;
    }
    /**
     * @return The longitude in degrees. It must be in the range [-180.0, +180.0].
     * 
     */
    public Double longitude() {
        return this.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatLngResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double latitude;
        private Double longitude;

        public Builder() {
    	      // Empty
        }

        public Builder(LatLngResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
        }

        public Builder latitude(Double latitude) {
            this.latitude = Objects.requireNonNull(latitude);
            return this;
        }
        public Builder longitude(Double longitude) {
            this.longitude = Objects.requireNonNull(longitude);
            return this;
        }        public LatLngResponse build() {
            return new LatLngResponse(latitude, longitude);
        }
    }
}

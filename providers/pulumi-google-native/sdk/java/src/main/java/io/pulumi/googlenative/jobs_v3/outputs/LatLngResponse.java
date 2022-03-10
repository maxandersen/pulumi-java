// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class LatLngResponse {
    /**
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * 
     */
    private final Double latitude;
    /**
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * 
     */
    private final Double longitude;

    @OutputCustomType.Constructor
    private LatLngResponse(
        @OutputCustomType.Parameter("latitude") Double latitude,
        @OutputCustomType.Parameter("longitude") Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * 
    */
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * 
    */
    public Double getLongitude() {
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

        public Builder setLatitude(Double latitude) {
            this.latitude = Objects.requireNonNull(latitude);
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = Objects.requireNonNull(longitude);
            return this;
        }
        public LatLngResponse build() {
            return new LatLngResponse(latitude, longitude);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * An object that represents a latitude/longitude pair. This is expressed as a pair of doubles to represent degrees latitude and degrees longitude. Unless specified otherwise, this object must conform to the WGS84 standard. Values must be within normalized ranges.
 * 
 */
public final class LatLngResponse extends com.pulumi.resources.InvokeArgs {

    public static final LatLngResponse Empty = new LatLngResponse();

    /**
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * 
     */
    @Import(name="latitude", required=true)
      private final Double latitude;

    public Double latitude() {
        return this.latitude;
    }

    /**
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * 
     */
    @Import(name="longitude", required=true)
      private final Double longitude;

    public Double longitude() {
        return this.longitude;
    }

    public LatLngResponse(
        Double latitude,
        Double longitude) {
        this.latitude = Objects.requireNonNull(latitude, "expected parameter 'latitude' to be non-null");
        this.longitude = Objects.requireNonNull(longitude, "expected parameter 'longitude' to be non-null");
    }

    private LatLngResponse() {
        this.latitude = null;
        this.longitude = null;
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

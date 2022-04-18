// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaintenanceWindowResponse {
    /**
     * The day of week, when the window starts.
     * 
     */
    private final String dayOfWeek;
    /**
     * The hour of day (0-23) when the window starts.
     * 
     */
    private final Integer hourOfDay;

    @CustomType.Constructor
    private MaintenanceWindowResponse(
        @CustomType.Parameter("dayOfWeek") String dayOfWeek,
        @CustomType.Parameter("hourOfDay") Integer hourOfDay) {
        this.dayOfWeek = dayOfWeek;
        this.hourOfDay = hourOfDay;
    }

    /**
     * The day of week, when the window starts.
     * 
    */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * The hour of day (0-23) when the window starts.
     * 
    */
    public Integer hourOfDay() {
        return this.hourOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private Integer hourOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.hourOfDay = defaults.hourOfDay;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = Objects.requireNonNull(hourOfDay);
            return this;
        }        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(dayOfWeek, hourOfDay);
        }
    }
}

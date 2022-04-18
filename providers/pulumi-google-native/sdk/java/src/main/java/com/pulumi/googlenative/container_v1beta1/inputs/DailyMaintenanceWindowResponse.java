// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Time window specified for daily maintenance operations.
 * 
 */
public final class DailyMaintenanceWindowResponse extends com.pulumi.resources.InvokeArgs {

    public static final DailyMaintenanceWindowResponse Empty = new DailyMaintenanceWindowResponse();

    /**
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    @Import(name="duration", required=true)
      private final String duration;

    public String duration() {
        return this.duration;
    }

    /**
     * Time within the maintenance window to start the maintenance operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    public DailyMaintenanceWindowResponse(
        String duration,
        String startTime) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private DailyMaintenanceWindowResponse() {
        this.duration = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DailyMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DailyMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public DailyMaintenanceWindowResponse build() {
            return new DailyMaintenanceWindowResponse(duration, startTime);
        }
    }
}

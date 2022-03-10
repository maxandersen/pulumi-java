// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ResourceStatusUpcomingMaintenanceResponse {
    /**
     * Indicates if the maintenance can be customer triggered. See go/sf-ctm-design for more details
     * 
     */
    private final Boolean canReschedule;

    @OutputCustomType.Constructor
    private ResourceStatusUpcomingMaintenanceResponse(@OutputCustomType.Parameter("canReschedule") Boolean canReschedule) {
        this.canReschedule = canReschedule;
    }

    /**
     * Indicates if the maintenance can be customer triggered. See go/sf-ctm-design for more details
     * 
    */
    public Boolean getCanReschedule() {
        return this.canReschedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusUpcomingMaintenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canReschedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusUpcomingMaintenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canReschedule = defaults.canReschedule;
        }

        public Builder setCanReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }
        public ResourceStatusUpcomingMaintenanceResponse build() {
            return new ResourceStatusUpcomingMaintenanceResponse(canReschedule);
        }
    }
}

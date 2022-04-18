// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DistributionPolicyZoneConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DistributionPolicyZoneConfigurationResponse Empty = new DistributionPolicyZoneConfigurationResponse();

    /**
     * The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
     */
    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public DistributionPolicyZoneConfigurationResponse(String zone) {
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private DistributionPolicyZoneConfigurationResponse() {
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyZoneConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyZoneConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zone = defaults.zone;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public DistributionPolicyZoneConfigurationResponse build() {
            return new DistributionPolicyZoneConfigurationResponse(zone);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v3.inputs.LocationResponse;
import java.util.Objects;


/**
 * Derived details about the company.
 * 
 */
public final class CompanyDerivedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final CompanyDerivedInfoResponse Empty = new CompanyDerivedInfoResponse();

    /**
     * A structured headquarters location of the company, resolved from Company.hq_location if provided.
     * 
     */
    @Import(name="headquartersLocation", required=true)
      private final LocationResponse headquartersLocation;

    public LocationResponse headquartersLocation() {
        return this.headquartersLocation;
    }

    public CompanyDerivedInfoResponse(LocationResponse headquartersLocation) {
        this.headquartersLocation = Objects.requireNonNull(headquartersLocation, "expected parameter 'headquartersLocation' to be non-null");
    }

    private CompanyDerivedInfoResponse() {
        this.headquartersLocation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompanyDerivedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationResponse headquartersLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(CompanyDerivedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headquartersLocation = defaults.headquartersLocation;
        }

        public Builder headquartersLocation(LocationResponse headquartersLocation) {
            this.headquartersLocation = Objects.requireNonNull(headquartersLocation);
            return this;
        }        public CompanyDerivedInfoResponse build() {
            return new CompanyDerivedInfoResponse(headquartersLocation);
        }
    }
}

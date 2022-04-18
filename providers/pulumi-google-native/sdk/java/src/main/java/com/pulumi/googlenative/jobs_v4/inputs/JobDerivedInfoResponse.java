// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v4.inputs.LocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Derived details about the job posting.
 * 
 */
public final class JobDerivedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobDerivedInfoResponse Empty = new JobDerivedInfoResponse();

    /**
     * Job categories derived from Job.title and Job.description.
     * 
     */
    @Import(name="jobCategories", required=true)
      private final List<String> jobCategories;

    public List<String> jobCategories() {
        return this.jobCategories;
    }

    /**
     * Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order.
     * 
     */
    @Import(name="locations", required=true)
      private final List<LocationResponse> locations;

    public List<LocationResponse> locations() {
        return this.locations;
    }

    public JobDerivedInfoResponse(
        List<String> jobCategories,
        List<LocationResponse> locations) {
        this.jobCategories = Objects.requireNonNull(jobCategories, "expected parameter 'jobCategories' to be non-null");
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
    }

    private JobDerivedInfoResponse() {
        this.jobCategories = List.of();
        this.locations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDerivedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> jobCategories;
        private List<LocationResponse> locations;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDerivedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobCategories = defaults.jobCategories;
    	      this.locations = defaults.locations;
        }

        public Builder jobCategories(List<String> jobCategories) {
            this.jobCategories = Objects.requireNonNull(jobCategories);
            return this;
        }
        public Builder jobCategories(String... jobCategories) {
            return jobCategories(List.of(jobCategories));
        }
        public Builder locations(List<LocationResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(LocationResponse... locations) {
            return locations(List.of(locations));
        }        public JobDerivedInfoResponse build() {
            return new JobDerivedInfoResponse(jobCategories, locations);
        }
    }
}

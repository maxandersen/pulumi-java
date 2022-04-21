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
    private List<String> jobCategories;

    public List<String> jobCategories() {
        return this.jobCategories;
    }

    /**
     * Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order.
     * 
     */
    @Import(name="locations", required=true)
    private List<LocationResponse> locations;

    public List<LocationResponse> locations() {
        return this.locations;
    }

    private JobDerivedInfoResponse() {}

    private JobDerivedInfoResponse(JobDerivedInfoResponse $) {
        this.jobCategories = $.jobCategories;
        this.locations = $.locations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobDerivedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDerivedInfoResponse $;

        public Builder() {
            $ = new JobDerivedInfoResponse();
        }

        public Builder(JobDerivedInfoResponse defaults) {
            $ = new JobDerivedInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder jobCategories(List<String> jobCategories) {
            $.jobCategories = jobCategories;
            return this;
        }

        public Builder jobCategories(String... jobCategories) {
            return jobCategories(List.of(jobCategories));
        }

        public Builder locations(List<LocationResponse> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(LocationResponse... locations) {
            return locations(List.of(locations));
        }

        public JobDerivedInfoResponse build() {
            $.jobCategories = Objects.requireNonNull($.jobCategories, "expected parameter 'jobCategories' to be non-null");
            $.locations = Objects.requireNonNull($.locations, "expected parameter 'locations' to be non-null");
            return $;
        }
    }

}

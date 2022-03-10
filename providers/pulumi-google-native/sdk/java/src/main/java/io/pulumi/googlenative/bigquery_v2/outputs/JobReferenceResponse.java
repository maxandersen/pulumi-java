// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobReferenceResponse {
    /**
     * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    private final String jobId;
    /**
     * The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
     * 
     */
    private final String location;
    /**
     * [Required] The ID of the project containing this job.
     * 
     */
    private final String project;

    @OutputCustomType.Constructor
    private JobReferenceResponse(
        @OutputCustomType.Parameter("jobId") String jobId,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("project") String project) {
        this.jobId = jobId;
        this.location = location;
        this.project = project;
    }

    /**
     * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
    */
    public String getJobId() {
        return this.jobId;
    }
    /**
     * The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * [Required] The ID of the project containing this job.
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobId;
        private String location;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(JobReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setJobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public JobReferenceResponse build() {
            return new JobReferenceResponse(jobId, location, project);
        }
    }
}

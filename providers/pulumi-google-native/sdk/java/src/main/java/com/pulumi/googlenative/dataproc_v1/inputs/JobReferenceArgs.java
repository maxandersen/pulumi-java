// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encapsulates the full scoping used to reference a job.
 * 
 */
public final class JobReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobReferenceArgs Empty = new JobReferenceArgs();

    /**
     * Optional. The job ID, which must be unique within the project.The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100 characters.If not specified by the caller, the job ID will be provided by the server.
     * 
     */
    @Import(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId == null ? Codegen.empty() : this.jobId;
    }

    /**
     * Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public JobReferenceArgs(
        @Nullable Output<String> jobId,
        @Nullable Output<String> project) {
        this.jobId = jobId;
        this.project = project;
    }

    private JobReferenceArgs() {
        this.jobId = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> jobId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(JobReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.project = defaults.project;
        }

        public Builder jobId(@Nullable Output<String> jobId) {
            this.jobId = jobId;
            return this;
        }
        public Builder jobId(@Nullable String jobId) {
            this.jobId = Codegen.ofNullable(jobId);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public JobReferenceArgs build() {
            return new JobReferenceArgs(jobId, project);
        }
    }
}

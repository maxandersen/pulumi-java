// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler;

import io.pulumi.azurenative.scheduler.inputs.JobPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The job collection name.
     * 
     */
    @Import(name="jobCollectionName", required=true)
      private final Output<String> jobCollectionName;

    public Output<String> jobCollectionName() {
        return this.jobCollectionName;
    }

    /**
     * The job name.
     * 
     */
    @Import(name="jobName")
      private final @Nullable Output<String> jobName;

    public Output<String> jobName() {
        return this.jobName == null ? Codegen.empty() : this.jobName;
    }

    /**
     * Gets or sets the job properties.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<JobPropertiesArgs> properties;

    public Output<JobPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public JobArgs(
        Output<String> jobCollectionName,
        @Nullable Output<String> jobName,
        @Nullable Output<JobPropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.jobCollectionName = Objects.requireNonNull(jobCollectionName, "expected parameter 'jobCollectionName' to be non-null");
        this.jobName = jobName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private JobArgs() {
        this.jobCollectionName = Codegen.empty();
        this.jobName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> jobCollectionName;
        private @Nullable Output<String> jobName;
        private @Nullable Output<JobPropertiesArgs> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobCollectionName = defaults.jobCollectionName;
    	      this.jobName = defaults.jobName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder jobCollectionName(Output<String> jobCollectionName) {
            this.jobCollectionName = Objects.requireNonNull(jobCollectionName);
            return this;
        }
        public Builder jobCollectionName(String jobCollectionName) {
            this.jobCollectionName = Output.of(Objects.requireNonNull(jobCollectionName));
            return this;
        }
        public Builder jobName(@Nullable Output<String> jobName) {
            this.jobName = jobName;
            return this;
        }
        public Builder jobName(@Nullable String jobName) {
            this.jobName = Codegen.ofNullable(jobName);
            return this;
        }
        public Builder properties(@Nullable Output<JobPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable JobPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public JobArgs build() {
            return new JobArgs(jobCollectionName, jobName, properties, resourceGroupName);
        }
    }
}

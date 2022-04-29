// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport;

import com.pulumi.azurenative.importexport.inputs.JobDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The name of the import/export job.
     * 
     */
    @Import(name="jobName")
    private @Nullable Output<String> jobName;

    /**
     * @return The name of the import/export job.
     * 
     */
    public Optional<Output<String>> jobName() {
        return Optional.ofNullable(this.jobName);
    }

    /**
     * Specifies the supported Azure location where the job should be created
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the job should be created
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the job properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<JobDetailsArgs> properties;

    /**
     * @return Specifies the job properties
     * 
     */
    public Optional<Output<JobDetailsArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The resource group name uniquely identifies the resource group within the user subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name uniquely identifies the resource group within the user subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the tags that will be assigned to the job.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Object> tags;

    /**
     * @return Specifies the tags that will be assigned to the job.
     * 
     */
    public Optional<Output<Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.jobName = $.jobName;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobName The name of the import/export job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(@Nullable Output<String> jobName) {
            $.jobName = jobName;
            return this;
        }

        /**
         * @param jobName The name of the import/export job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(String jobName) {
            return jobName(Output.of(jobName));
        }

        /**
         * @param location Specifies the supported Azure location where the job should be created
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the job should be created
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties Specifies the job properties
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<JobDetailsArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Specifies the job properties
         * 
         * @return builder
         * 
         */
        public Builder properties(JobDetailsArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The resource group name uniquely identifies the resource group within the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name uniquely identifies the resource group within the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Specifies the tags that will be assigned to the job.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Specifies the tags that will be assigned to the job.
         * 
         * @return builder
         * 
         */
        public Builder tags(Object tags) {
            return tags(Output.of(tags));
        }

        public JobArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

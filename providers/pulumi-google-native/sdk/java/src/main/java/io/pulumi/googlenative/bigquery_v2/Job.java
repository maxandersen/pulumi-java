// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigquery_v2.JobArgs;
import io.pulumi.googlenative.bigquery_v2.outputs.JobConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatisticsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Starts a new asynchronous job. Requires the Can View project role.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:bigquery/v2:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * [Required] Describes the job configuration.
     * 
     */
    @Export(name="configuration", type=JobConfigurationResponse.class, parameters={})
    private Output<JobConfigurationResponse> configuration;

    /**
     * @return [Required] Describes the job configuration.
     * 
     */
    public Output<JobConfigurationResponse> configuration() {
        return this.configuration;
    }
    /**
     * A hash of this resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A hash of this resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    @Export(name="jobReference", type=JobReferenceResponse.class, parameters={})
    private Output<JobReferenceResponse> jobReference;

    /**
     * @return [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    public Output<JobReferenceResponse> jobReference() {
        return this.jobReference;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A URL that can be used to access this resource again.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return A URL that can be used to access this resource again.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Information about the job, including starting time and ending time of the job.
     * 
     */
    @Export(name="statistics", type=JobStatisticsResponse.class, parameters={})
    private Output<JobStatisticsResponse> statistics;

    /**
     * @return Information about the job, including starting time and ending time of the job.
     * 
     */
    public Output<JobStatisticsResponse> statistics() {
        return this.statistics;
    }
    /**
     * The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    @Export(name="status", type=JobStatusResponse.class, parameters={})
    private Output<JobStatusResponse> status;

    /**
     * @return The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    public Output<JobStatusResponse> status() {
        return this.status;
    }
    /**
     * Email address of the user who ran the job.
     * 
     */
    @Export(name="userEmail", type=String.class, parameters={})
    private Output<String> userEmail;

    /**
     * @return Email address of the user who ran the job.
     * 
     */
    public Output<String> userEmail() {
        return this.userEmail;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, @Nullable JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, @Nullable JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Job", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}

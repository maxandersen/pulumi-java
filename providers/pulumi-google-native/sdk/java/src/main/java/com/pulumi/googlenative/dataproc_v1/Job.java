// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataproc_v1.JobArgs;
import com.pulumi.googlenative.dataproc_v1.outputs.HadoopJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.HiveJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.JobPlacementResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.JobReferenceResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.JobSchedulingResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.JobStatusResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.PigJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.PrestoJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.PySparkJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkRJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkSqlJobResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.YarnApplicationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Submits a job to a cluster.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataproc/v1:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
     */
    @Export(name="done", type=Boolean.class, parameters={})
    private Output<Boolean> done;

    /**
     * @return Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
     */
    public Output<Boolean> done() {
        return this.done;
    }
    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    @Export(name="driverControlFilesUri", type=String.class, parameters={})
    private Output<String> driverControlFilesUri;

    /**
     * @return If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    public Output<String> driverControlFilesUri() {
        return this.driverControlFilesUri;
    }
    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     * 
     */
    @Export(name="driverOutputResourceUri", type=String.class, parameters={})
    private Output<String> driverOutputResourceUri;

    /**
     * @return A URI pointing to the location of the stdout of the job's driver program.
     * 
     */
    public Output<String> driverOutputResourceUri() {
        return this.driverOutputResourceUri;
    }
    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    @Export(name="hadoopJob", type=HadoopJobResponse.class, parameters={})
    private Output<HadoopJobResponse> hadoopJob;

    /**
     * @return Optional. Job is a Hadoop job.
     * 
     */
    public Output<HadoopJobResponse> hadoopJob() {
        return this.hadoopJob;
    }
    /**
     * Optional. Job is a Hive job.
     * 
     */
    @Export(name="hiveJob", type=HiveJobResponse.class, parameters={})
    private Output<HiveJobResponse> hiveJob;

    /**
     * @return Optional. Job is a Hive job.
     * 
     */
    public Output<HiveJobResponse> hiveJob() {
        return this.hiveJob;
    }
    /**
     * A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
     */
    @Export(name="jobUuid", type=String.class, parameters={})
    private Output<String> jobUuid;

    /**
     * @return A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
     */
    public Output<String> jobUuid() {
        return this.jobUuid;
    }
    /**
     * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Optional. Job is a Pig job.
     * 
     */
    @Export(name="pigJob", type=PigJobResponse.class, parameters={})
    private Output<PigJobResponse> pigJob;

    /**
     * @return Optional. Job is a Pig job.
     * 
     */
    public Output<PigJobResponse> pigJob() {
        return this.pigJob;
    }
    /**
     * Job information, including how, when, and where to run the job.
     * 
     */
    @Export(name="placement", type=JobPlacementResponse.class, parameters={})
    private Output<JobPlacementResponse> placement;

    /**
     * @return Job information, including how, when, and where to run the job.
     * 
     */
    public Output<JobPlacementResponse> placement() {
        return this.placement;
    }
    /**
     * Optional. Job is a Presto job.
     * 
     */
    @Export(name="prestoJob", type=PrestoJobResponse.class, parameters={})
    private Output<PrestoJobResponse> prestoJob;

    /**
     * @return Optional. Job is a Presto job.
     * 
     */
    public Output<PrestoJobResponse> prestoJob() {
        return this.prestoJob;
    }
    /**
     * Optional. Job is a PySpark job.
     * 
     */
    @Export(name="pysparkJob", type=PySparkJobResponse.class, parameters={})
    private Output<PySparkJobResponse> pysparkJob;

    /**
     * @return Optional. Job is a PySpark job.
     * 
     */
    public Output<PySparkJobResponse> pysparkJob() {
        return this.pysparkJob;
    }
    /**
     * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
     */
    @Export(name="reference", type=JobReferenceResponse.class, parameters={})
    private Output<JobReferenceResponse> reference;

    /**
     * @return Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
     */
    public Output<JobReferenceResponse> reference() {
        return this.reference;
    }
    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @Export(name="scheduling", type=JobSchedulingResponse.class, parameters={})
    private Output<JobSchedulingResponse> scheduling;

    /**
     * @return Optional. Job scheduling configuration.
     * 
     */
    public Output<JobSchedulingResponse> scheduling() {
        return this.scheduling;
    }
    /**
     * Optional. Job is a Spark job.
     * 
     */
    @Export(name="sparkJob", type=SparkJobResponse.class, parameters={})
    private Output<SparkJobResponse> sparkJob;

    /**
     * @return Optional. Job is a Spark job.
     * 
     */
    public Output<SparkJobResponse> sparkJob() {
        return this.sparkJob;
    }
    /**
     * Optional. Job is a SparkR job.
     * 
     */
    @Export(name="sparkRJob", type=SparkRJobResponse.class, parameters={})
    private Output<SparkRJobResponse> sparkRJob;

    /**
     * @return Optional. Job is a SparkR job.
     * 
     */
    public Output<SparkRJobResponse> sparkRJob() {
        return this.sparkRJob;
    }
    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    @Export(name="sparkSqlJob", type=SparkSqlJobResponse.class, parameters={})
    private Output<SparkSqlJobResponse> sparkSqlJob;

    /**
     * @return Optional. Job is a SparkSql job.
     * 
     */
    public Output<SparkSqlJobResponse> sparkSqlJob() {
        return this.sparkSqlJob;
    }
    /**
     * The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
     */
    @Export(name="status", type=JobStatusResponse.class, parameters={})
    private Output<JobStatusResponse> status;

    /**
     * @return The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
     */
    public Output<JobStatusResponse> status() {
        return this.status;
    }
    /**
     * The previous job status.
     * 
     */
    @Export(name="statusHistory", type=List.class, parameters={JobStatusResponse.class})
    private Output<List<JobStatusResponse>> statusHistory;

    /**
     * @return The previous job status.
     * 
     */
    public Output<List<JobStatusResponse>> statusHistory() {
        return this.statusHistory;
    }
    /**
     * The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    @Export(name="yarnApplications", type=List.class, parameters={YarnApplicationResponse.class})
    private Output<List<YarnApplicationResponse>> yarnApplications;

    /**
     * @return The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    public Output<List<YarnApplicationResponse>> yarnApplications() {
        return this.yarnApplications;
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
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:Job", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}

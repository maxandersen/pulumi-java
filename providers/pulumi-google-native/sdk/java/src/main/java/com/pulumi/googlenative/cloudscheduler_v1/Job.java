// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudscheduler_v1.JobArgs;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.AppEngineHttpTargetResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.HttpTargetResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.PubsubTargetResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.RetryConfigResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.StatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a job.
 * 
 */
@ResourceType(type="google-native:cloudscheduler/v1:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * App Engine HTTP target.
     * 
     */
    @Export(name="appEngineHttpTarget", type=AppEngineHttpTargetResponse.class, parameters={})
    private Output<AppEngineHttpTargetResponse> appEngineHttpTarget;

    /**
     * @return App Engine HTTP target.
     * 
     */
    public Output<AppEngineHttpTargetResponse> appEngineHttpTarget() {
        return this.appEngineHttpTarget;
    }
    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds.
     * 
     */
    @Export(name="attemptDeadline", type=String.class, parameters={})
    private Output<String> attemptDeadline;

    /**
     * @return The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds.
     * 
     */
    public Output<String> attemptDeadline() {
        return this.attemptDeadline;
    }
    /**
     * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * HTTP target.
     * 
     */
    @Export(name="httpTarget", type=HttpTargetResponse.class, parameters={})
    private Output<HttpTargetResponse> httpTarget;

    /**
     * @return HTTP target.
     * 
     */
    public Output<HttpTargetResponse> httpTarget() {
        return this.httpTarget;
    }
    /**
     * The time the last job attempt started.
     * 
     */
    @Export(name="lastAttemptTime", type=String.class, parameters={})
    private Output<String> lastAttemptTime;

    /**
     * @return The time the last job attempt started.
     * 
     */
    public Output<String> lastAttemptTime() {
        return this.lastAttemptTime;
    }
    /**
     * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Pub/Sub target.
     * 
     */
    @Export(name="pubsubTarget", type=PubsubTargetResponse.class, parameters={})
    private Output<PubsubTargetResponse> pubsubTarget;

    /**
     * @return Pub/Sub target.
     * 
     */
    public Output<PubsubTargetResponse> pubsubTarget() {
        return this.pubsubTarget;
    }
    /**
     * Settings that determine the retry behavior.
     * 
     */
    @Export(name="retryConfig", type=RetryConfigResponse.class, parameters={})
    private Output<RetryConfigResponse> retryConfig;

    /**
     * @return Settings that determine the retry behavior.
     * 
     */
    public Output<RetryConfigResponse> retryConfig() {
        return this.retryConfig;
    }
    /**
     * Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    @Export(name="schedule", type=String.class, parameters={})
    private Output<String> schedule;

    /**
     * @return Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    public Output<String> schedule() {
        return this.schedule;
    }
    /**
     * The next time the job is scheduled. Note that this may be a retry of a previously failed attempt or the next execution time according to the schedule.
     * 
     */
    @Export(name="scheduleTime", type=String.class, parameters={})
    private Output<String> scheduleTime;

    /**
     * @return The next time the job is scheduled. Note that this may be a retry of a previously failed attempt or the next execution time according to the schedule.
     * 
     */
    public Output<String> scheduleTime() {
        return this.scheduleTime;
    }
    /**
     * State of the job.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The response from the target for the last attempted execution.
     * 
     */
    @Export(name="status", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> status;

    /**
     * @return The response from the target for the last attempted execution.
     * 
     */
    public Output<StatusResponse> status() {
        return this.status;
    }
    /**
     * Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }
    /**
     * The creation time of the job.
     * 
     */
    @Export(name="userUpdateTime", type=String.class, parameters={})
    private Output<String> userUpdateTime;

    /**
     * @return The creation time of the job.
     * 
     */
    public Output<String> userUpdateTime() {
        return this.userUpdateTime;
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
    public Job(String name, @Nullable JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudscheduler/v1:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudscheduler/v1:Job", name, null, makeResourceOptions(options, id));
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

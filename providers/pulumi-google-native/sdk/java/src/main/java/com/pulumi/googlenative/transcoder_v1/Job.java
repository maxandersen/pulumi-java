// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.transcoder_v1.JobArgs;
import com.pulumi.googlenative.transcoder_v1.outputs.JobConfigResponse;
import com.pulumi.googlenative.transcoder_v1.outputs.StatusResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a job in the specified region.
 * 
 */
@ResourceType(type="google-native:transcoder/v1:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * The configuration for this job.
     * 
     */
    @Export(name="config", type=JobConfigResponse.class, parameters={})
    private Output<JobConfigResponse> config;

    /**
     * @return The configuration for this job.
     * 
     */
    public Output<JobConfigResponse> config() {
        return this.config;
    }
    /**
     * The time the job was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the job was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The time the transcoding finished.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time the transcoding finished.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * An error object that describes the reason for the failure. This property is always present when `state` is `FAILED`.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return An error object that describes the reason for the failure. This property is always present when `state` is `FAILED`.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * Input only. Specify the `input_uri` to populate empty `uri` fields in each element of `Job.config.inputs` or `JobTemplate.config.inputs` when using template. URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`). See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * 
     */
    @Export(name="inputUri", type=String.class, parameters={})
    private Output<String> inputUri;

    /**
     * @return Input only. Specify the `input_uri` to populate empty `uri` fields in each element of `Job.config.inputs` or `JobTemplate.config.inputs` when using template. URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`). See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * 
     */
    public Output<String> inputUri() {
        return this.inputUri;
    }
    /**
     * The resource name of the job. Format: `projects/{project_number}/locations/{location}/jobs/{job}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the job. Format: `projects/{project_number}/locations/{location}/jobs/{job}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Input only. Specify the `output_uri` to populate an empty `Job.config.output.uri` or `JobTemplate.config.output.uri` when using template. URI for the output file(s). For example, `gs://my-bucket/outputs/`. See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * 
     */
    @Export(name="outputUri", type=String.class, parameters={})
    private Output<String> outputUri;

    /**
     * @return Input only. Specify the `output_uri` to populate an empty `Job.config.output.uri` or `JobTemplate.config.output.uri` when using template. URI for the output file(s). For example, `gs://my-bucket/outputs/`. See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * 
     */
    public Output<String> outputUri() {
        return this.outputUri;
    }
    /**
     * The time the transcoding started.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The time the transcoding started.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * The current state of the job.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Input only. Specify the `template_id` to use for populating `Job.config`. The default is `preset/web-hd`. Preset Transcoder templates: - `preset/{preset_id}` - User defined JobTemplate: `{job_template_id}`
     * 
     */
    @Export(name="templateId", type=String.class, parameters={})
    private Output<String> templateId;

    /**
     * @return Input only. Specify the `template_id` to use for populating `Job.config`. The default is `preset/web-hd`. Preset Transcoder templates: - `preset/{preset_id}` - User defined JobTemplate: `{job_template_id}`
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }
    /**
     * Job time to live value in days, which will be effective after job completion. Job should be deleted automatically after the given TTL. Enter a value between 1 and 90. The default is 30.
     * 
     */
    @Export(name="ttlAfterCompletionDays", type=Integer.class, parameters={})
    private Output<Integer> ttlAfterCompletionDays;

    /**
     * @return Job time to live value in days, which will be effective after job completion. Job should be deleted automatically after the given TTL. Enter a value between 1 and 90. The default is 30.
     * 
     */
    public Output<Integer> ttlAfterCompletionDays() {
        return this.ttlAfterCompletionDays;
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
        super("google-native:transcoder/v1:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:transcoder/v1:Job", name, null, makeResourceOptions(options, id));
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

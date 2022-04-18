// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iot.JobTemplateArgs;
import com.pulumi.awsnative.iot.outputs.AbortConfigProperties;
import com.pulumi.awsnative.iot.outputs.JobExecutionsRetryConfigProperties;
import com.pulumi.awsnative.iot.outputs.JobExecutionsRolloutConfigProperties;
import com.pulumi.awsnative.iot.outputs.JobTemplateTag;
import com.pulumi.awsnative.iot.outputs.PresignedUrlConfigProperties;
import com.pulumi.awsnative.iot.outputs.TimeoutConfigProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Job templates enable you to preconfigure jobs so that you can deploy them to multiple sets of target devices.
 * 
 */
@ResourceType(type="aws-native:iot:JobTemplate")
public class JobTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The criteria that determine when and how a job abort takes place.
     * 
     */
    @Export(name="abortConfig", type=AbortConfigProperties.class, parameters={})
    private Output</* @Nullable */ AbortConfigProperties> abortConfig;

    /**
     * @return The criteria that determine when and how a job abort takes place.
     * 
     */
    public Output</* @Nullable */ AbortConfigProperties> abortConfig() {
        return this.abortConfig;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description of the Job Template.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of the Job Template.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The job document. Required if you don't specify a value for documentSource.
     * 
     */
    @Export(name="document", type=String.class, parameters={})
    private Output</* @Nullable */ String> document;

    /**
     * @return The job document. Required if you don't specify a value for documentSource.
     * 
     */
    public Output</* @Nullable */ String> document() {
        return this.document;
    }
    /**
     * An S3 link to the job document to use in the template. Required if you don't specify a value for document.
     * 
     */
    @Export(name="documentSource", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentSource;

    /**
     * @return An S3 link to the job document to use in the template. Required if you don't specify a value for document.
     * 
     */
    public Output</* @Nullable */ String> documentSource() {
        return this.documentSource;
    }
    /**
     * Optional for copying a JobTemplate from a pre-existing Job configuration.
     * 
     */
    @Export(name="jobArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobArn;

    /**
     * @return Optional for copying a JobTemplate from a pre-existing Job configuration.
     * 
     */
    public Output</* @Nullable */ String> jobArn() {
        return this.jobArn;
    }
    @Export(name="jobExecutionsRetryConfig", type=JobExecutionsRetryConfigProperties.class, parameters={})
    private Output</* @Nullable */ JobExecutionsRetryConfigProperties> jobExecutionsRetryConfig;

    public Output</* @Nullable */ JobExecutionsRetryConfigProperties> jobExecutionsRetryConfig() {
        return this.jobExecutionsRetryConfig;
    }
    /**
     * Allows you to create a staged rollout of a job.
     * 
     */
    @Export(name="jobExecutionsRolloutConfig", type=JobExecutionsRolloutConfigProperties.class, parameters={})
    private Output</* @Nullable */ JobExecutionsRolloutConfigProperties> jobExecutionsRolloutConfig;

    /**
     * @return Allows you to create a staged rollout of a job.
     * 
     */
    public Output</* @Nullable */ JobExecutionsRolloutConfigProperties> jobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }
    @Export(name="jobTemplateId", type=String.class, parameters={})
    private Output<String> jobTemplateId;

    public Output<String> jobTemplateId() {
        return this.jobTemplateId;
    }
    /**
     * Configuration for pre-signed S3 URLs.
     * 
     */
    @Export(name="presignedUrlConfig", type=PresignedUrlConfigProperties.class, parameters={})
    private Output</* @Nullable */ PresignedUrlConfigProperties> presignedUrlConfig;

    /**
     * @return Configuration for pre-signed S3 URLs.
     * 
     */
    public Output</* @Nullable */ PresignedUrlConfigProperties> presignedUrlConfig() {
        return this.presignedUrlConfig;
    }
    /**
     * Metadata that can be used to manage the JobTemplate.
     * 
     */
    @Export(name="tags", type=List.class, parameters={JobTemplateTag.class})
    private Output</* @Nullable */ List<JobTemplateTag>> tags;

    /**
     * @return Metadata that can be used to manage the JobTemplate.
     * 
     */
    public Output</* @Nullable */ List<JobTemplateTag>> tags() {
        return this.tags;
    }
    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     * 
     */
    @Export(name="timeoutConfig", type=TimeoutConfigProperties.class, parameters={})
    private Output</* @Nullable */ TimeoutConfigProperties> timeoutConfig;

    /**
     * @return Specifies the amount of time each device has to finish its execution of the job.
     * 
     */
    public Output</* @Nullable */ TimeoutConfigProperties> timeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobTemplate(String name) {
        this(name, JobTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobTemplate(String name, JobTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobTemplate(String name, JobTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:JobTemplate", name, args == null ? JobTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobTemplate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:JobTemplate", name, null, makeResourceOptions(options, id));
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
    public static JobTemplate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobTemplate(name, id, options);
    }
}

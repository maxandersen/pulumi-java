// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elastictranscoder.PipelineArgs;
import com.pulumi.aws.elastictranscoder.inputs.PipelineState;
import com.pulumi.aws.elastictranscoder.outputs.PipelineContentConfig;
import com.pulumi.aws.elastictranscoder.outputs.PipelineContentConfigPermission;
import com.pulumi.aws.elastictranscoder.outputs.PipelineNotifications;
import com.pulumi.aws.elastictranscoder.outputs.PipelineThumbnailConfig;
import com.pulumi.aws.elastictranscoder.outputs.PipelineThumbnailConfigPermission;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Transcoder pipeline resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Elastic Transcoder pipelines can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elastictranscoder/pipeline:Pipeline basic_pipeline 1407981661351-cttk8b
 * ```
 * 
 */
@ResourceType(type="aws:elastictranscoder/pipeline:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Elastictranscoder pipeline.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Elastictranscoder pipeline.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
     * 
     */
    @Export(name="awsKmsKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsKmsKeyArn;

    /**
     * @return The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
     * 
     */
    public Output</* @Nullable */ String> awsKmsKeyArn() {
        return this.awsKmsKeyArn;
    }
    /**
     * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
     * 
     */
    @Export(name="contentConfig", type=PipelineContentConfig.class, parameters={})
    private Output<PipelineContentConfig> contentConfig;

    /**
     * @return The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
     * 
     */
    public Output<PipelineContentConfig> contentConfig() {
        return this.contentConfig;
    }
    /**
     * The permissions for the `content_config` object. (documented below)
     * 
     */
    @Export(name="contentConfigPermissions", type=List.class, parameters={PipelineContentConfigPermission.class})
    private Output</* @Nullable */ List<PipelineContentConfigPermission>> contentConfigPermissions;

    /**
     * @return The permissions for the `content_config` object. (documented below)
     * 
     */
    public Output</* @Nullable */ List<PipelineContentConfigPermission>> contentConfigPermissions() {
        return this.contentConfigPermissions;
    }
    /**
     * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
     * 
     */
    @Export(name="inputBucket", type=String.class, parameters={})
    private Output<String> inputBucket;

    /**
     * @return The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
     * 
     */
    public Output<String> inputBucket() {
        return this.inputBucket;
    }
    /**
     * The name of the pipeline. Maximum 40 characters
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the pipeline. Maximum 40 characters
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
     * 
     */
    @Export(name="notifications", type=PipelineNotifications.class, parameters={})
    private Output</* @Nullable */ PipelineNotifications> notifications;

    /**
     * @return The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
     * 
     */
    public Output</* @Nullable */ PipelineNotifications> notifications() {
        return this.notifications;
    }
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
     * 
     */
    @Export(name="outputBucket", type=String.class, parameters={})
    private Output<String> outputBucket;

    /**
     * @return The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
     * 
     */
    public Output<String> outputBucket() {
        return this.outputBucket;
    }
    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
     * 
     */
    @Export(name="thumbnailConfig", type=PipelineThumbnailConfig.class, parameters={})
    private Output<PipelineThumbnailConfig> thumbnailConfig;

    /**
     * @return The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
     * 
     */
    public Output<PipelineThumbnailConfig> thumbnailConfig() {
        return this.thumbnailConfig;
    }
    /**
     * The permissions for the `thumbnail_config` object. (documented below)
     * 
     */
    @Export(name="thumbnailConfigPermissions", type=List.class, parameters={PipelineThumbnailConfigPermission.class})
    private Output</* @Nullable */ List<PipelineThumbnailConfigPermission>> thumbnailConfigPermissions;

    /**
     * @return The permissions for the `thumbnail_config` object. (documented below)
     * 
     */
    public Output</* @Nullable */ List<PipelineThumbnailConfigPermission>> thumbnailConfigPermissions() {
        return this.thumbnailConfigPermissions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elastictranscoder/pipeline:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elastictranscoder/pipeline:Pipeline", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Pipeline get(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, state, options);
    }
}

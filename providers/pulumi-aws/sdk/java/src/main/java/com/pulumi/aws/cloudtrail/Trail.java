// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudtrail.TrailArgs;
import com.pulumi.aws.cloudtrail.inputs.TrailState;
import com.pulumi.aws.cloudtrail.outputs.TrailAdvancedEventSelector;
import com.pulumi.aws.cloudtrail.outputs.TrailEventSelector;
import com.pulumi.aws.cloudtrail.outputs.TrailInsightSelector;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CloudTrail resource.
 * 
 * > **Tip:** For a multi-region trail, this resource must be in the home region of the trail.
 * 
 * > **Tip:** For an organization trail, this resource must be in the master account of the organization.
 * 
 * ## Example Usage
 * ### Data Event Logging
 * 
 * CloudTrail can log [Data Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html) for certain services such as S3 bucket objects and Lambda function invocations. Additional information about data event configuration can be found in the following links:
 * 
 * * [CloudTrail API DataResource documentation](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_DataResource.html) (for basic event selector).
 * * [CloudTrail API AdvancedFieldSelector documentation](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedFieldSelector.html) (for advanced event selector).
 * 
 * ## Import
 * 
 * Cloudtrails can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudtrail/trail:Trail sample my-sample-trail
 * ```
 * 
 */
@ResourceType(type="aws:cloudtrail/trail:Trail")
public class Trail extends com.pulumi.resources.CustomResource {
    /**
     * Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
     * 
     */
    @Export(name="advancedEventSelectors", type=List.class, parameters={TrailAdvancedEventSelector.class})
    private Output</* @Nullable */ List<TrailAdvancedEventSelector>> advancedEventSelectors;

    /**
     * @return Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
     * 
     */
    public Output</* @Nullable */ List<TrailAdvancedEventSelector>> advancedEventSelectors() {
        return this.advancedEventSelectors;
    }
    /**
     * ARN of the trail.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the trail.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
     * 
     */
    @Export(name="cloudWatchLogsGroupArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudWatchLogsGroupArn;

    /**
     * @return Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
     * 
     */
    public Output</* @Nullable */ String> cloudWatchLogsGroupArn() {
        return this.cloudWatchLogsGroupArn;
    }
    /**
     * Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
     * 
     */
    @Export(name="cloudWatchLogsRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudWatchLogsRoleArn;

    /**
     * @return Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
     * 
     */
    public Output</* @Nullable */ String> cloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }
    /**
     * Whether log file integrity validation is enabled. Defaults to `false`.
     * 
     */
    @Export(name="enableLogFileValidation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableLogFileValidation;

    /**
     * @return Whether log file integrity validation is enabled. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> enableLogFileValidation() {
        return this.enableLogFileValidation;
    }
    /**
     * Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
     * 
     */
    @Export(name="enableLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableLogging;

    /**
     * @return Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
     * 
     */
    public Output</* @Nullable */ Boolean> enableLogging() {
        return this.enableLogging;
    }
    /**
     * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
     * 
     */
    @Export(name="eventSelectors", type=List.class, parameters={TrailEventSelector.class})
    private Output</* @Nullable */ List<TrailEventSelector>> eventSelectors;

    /**
     * @return Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
     * 
     */
    public Output</* @Nullable */ List<TrailEventSelector>> eventSelectors() {
        return this.eventSelectors;
    }
    /**
     * Region in which the trail was created.
     * 
     */
    @Export(name="homeRegion", type=String.class, parameters={})
    private Output<String> homeRegion;

    /**
     * @return Region in which the trail was created.
     * 
     */
    public Output<String> homeRegion() {
        return this.homeRegion;
    }
    /**
     * Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
     * 
     */
    @Export(name="includeGlobalServiceEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> includeGlobalServiceEvents;

    /**
     * @return Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> includeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }
    /**
     * Configuration block for identifying unusual operational activity. See details below.
     * 
     */
    @Export(name="insightSelectors", type=List.class, parameters={TrailInsightSelector.class})
    private Output</* @Nullable */ List<TrailInsightSelector>> insightSelectors;

    /**
     * @return Configuration block for identifying unusual operational activity. See details below.
     * 
     */
    public Output</* @Nullable */ List<TrailInsightSelector>> insightSelectors() {
        return this.insightSelectors;
    }
    /**
     * Whether the trail is created in the current region or in all regions. Defaults to `false`.
     * 
     */
    @Export(name="isMultiRegionTrail", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isMultiRegionTrail;

    /**
     * @return Whether the trail is created in the current region or in all regions. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> isMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }
    /**
     * Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
     * 
     */
    @Export(name="isOrganizationTrail", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isOrganizationTrail;

    /**
     * @return Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> isOrganizationTrail() {
        return this.isOrganizationTrail;
    }
    /**
     * KMS key ARN to use to encrypt the logs delivered by CloudTrail.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return KMS key ARN to use to encrypt the logs delivered by CloudTrail.
     * 
     */
    public Output</* @Nullable */ String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the S3 bucket designated for publishing log files.
     * 
     */
    @Export(name="s3BucketName", type=String.class, parameters={})
    private Output<String> s3BucketName;

    /**
     * @return Name of the S3 bucket designated for publishing log files.
     * 
     */
    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }
    /**
     * S3 key prefix that follows the name of the bucket you have designated for log file delivery.
     * 
     */
    @Export(name="s3KeyPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> s3KeyPrefix;

    /**
     * @return S3 key prefix that follows the name of the bucket you have designated for log file delivery.
     * 
     */
    public Output</* @Nullable */ String> s3KeyPrefix() {
        return this.s3KeyPrefix;
    }
    /**
     * Name of the Amazon SNS topic defined for notification of log file delivery.
     * 
     */
    @Export(name="snsTopicName", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicName;

    /**
     * @return Name of the Amazon SNS topic defined for notification of log file delivery.
     * 
     */
    public Output</* @Nullable */ String> snsTopicName() {
        return this.snsTopicName;
    }
    /**
     * Map of tags to assign to the trail. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the trail. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trail(String name) {
        this(name, TrailArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trail(String name, TrailArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trail(String name, TrailArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudtrail/trail:Trail", name, args == null ? TrailArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Trail(String name, Output<String> id, @Nullable TrailState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudtrail/trail:Trail", name, state, makeResourceOptions(options, id));
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
    public static Trail get(String name, Output<String> id, @Nullable TrailState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Trail(name, id, state, options);
    }
}

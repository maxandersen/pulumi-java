// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs;
import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs;
import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamElasticsearchConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamElasticsearchConfigurationArgs Empty = new FirehoseDeliveryStreamElasticsearchConfigurationArgs();

    /**
     * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
     * 
     */
    @Import(name="bufferingInterval")
    private @Nullable Output<Integer> bufferingInterval;

    public Optional<Output<Integer>> bufferingInterval() {
        return Optional.ofNullable(this.bufferingInterval);
    }

    /**
     * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
     * 
     */
    @Import(name="bufferingSize")
    private @Nullable Output<Integer> bufferingSize;

    public Optional<Output<Integer>> bufferingSize() {
        return Optional.ofNullable(this.bufferingSize);
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
    private @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Optional<Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs>> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }

    /**
     * The endpoint to use when communicating with the cluster. Conflicts with `domain_arn`.
     * 
     */
    @Import(name="clusterEndpoint")
    private @Nullable Output<String> clusterEndpoint;

    public Optional<Output<String>> clusterEndpoint() {
        return Optional.ofNullable(this.clusterEndpoint);
    }

    /**
     * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `cluster_endpoint`.
     * 
     */
    @Import(name="domainArn")
    private @Nullable Output<String> domainArn;

    public Optional<Output<String>> domainArn() {
        return Optional.ofNullable(this.domainArn);
    }

    /**
     * The Elasticsearch index name.
     * 
     */
    @Import(name="indexName", required=true)
    private Output<String> indexName;

    public Output<String> indexName() {
        return this.indexName;
    }

    /**
     * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
     * 
     */
    @Import(name="indexRotationPeriod")
    private @Nullable Output<String> indexRotationPeriod;

    public Optional<Output<String>> indexRotationPeriod() {
        return Optional.ofNullable(this.indexRotationPeriod);
    }

    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    @Import(name="processingConfiguration")
    private @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration;

    public Optional<Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs>> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }

    /**
     * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    @Import(name="retryDuration")
    private @Nullable Output<Integer> retryDuration;

    public Optional<Output<Integer>> retryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }

    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
     * 
     */
    @Import(name="s3BackupMode")
    private @Nullable Output<String> s3BackupMode;

    public Optional<Output<String>> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    /**
     * The Elasticsearch type name with maximum length of 100 characters.
     * 
     */
    @Import(name="typeName")
    private @Nullable Output<String> typeName;

    public Optional<Output<String>> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    /**
     * The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
     * 
     */
    @Import(name="vpcConfig")
    private @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig;

    public Optional<Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private FirehoseDeliveryStreamElasticsearchConfigurationArgs() {}

    private FirehoseDeliveryStreamElasticsearchConfigurationArgs(FirehoseDeliveryStreamElasticsearchConfigurationArgs $) {
        this.bufferingInterval = $.bufferingInterval;
        this.bufferingSize = $.bufferingSize;
        this.cloudwatchLoggingOptions = $.cloudwatchLoggingOptions;
        this.clusterEndpoint = $.clusterEndpoint;
        this.domainArn = $.domainArn;
        this.indexName = $.indexName;
        this.indexRotationPeriod = $.indexRotationPeriod;
        this.processingConfiguration = $.processingConfiguration;
        this.retryDuration = $.retryDuration;
        this.roleArn = $.roleArn;
        this.s3BackupMode = $.s3BackupMode;
        this.typeName = $.typeName;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamElasticsearchConfigurationArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamElasticsearchConfigurationArgs();
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationArgs defaults) {
            $ = new FirehoseDeliveryStreamElasticsearchConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bufferingInterval(@Nullable Output<Integer> bufferingInterval) {
            $.bufferingInterval = bufferingInterval;
            return this;
        }

        public Builder bufferingInterval(Integer bufferingInterval) {
            return bufferingInterval(Output.of(bufferingInterval));
        }

        public Builder bufferingSize(@Nullable Output<Integer> bufferingSize) {
            $.bufferingSize = bufferingSize;
            return this;
        }

        public Builder bufferingSize(Integer bufferingSize) {
            return bufferingSize(Output.of(bufferingSize));
        }

        public Builder cloudwatchLoggingOptions(@Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            $.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder cloudwatchLoggingOptions(FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            return cloudwatchLoggingOptions(Output.of(cloudwatchLoggingOptions));
        }

        public Builder clusterEndpoint(@Nullable Output<String> clusterEndpoint) {
            $.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder clusterEndpoint(String clusterEndpoint) {
            return clusterEndpoint(Output.of(clusterEndpoint));
        }

        public Builder domainArn(@Nullable Output<String> domainArn) {
            $.domainArn = domainArn;
            return this;
        }

        public Builder domainArn(String domainArn) {
            return domainArn(Output.of(domainArn));
        }

        public Builder indexName(Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        public Builder indexRotationPeriod(@Nullable Output<String> indexRotationPeriod) {
            $.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        public Builder indexRotationPeriod(String indexRotationPeriod) {
            return indexRotationPeriod(Output.of(indexRotationPeriod));
        }

        public Builder processingConfiguration(@Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration) {
            $.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder processingConfiguration(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs processingConfiguration) {
            return processingConfiguration(Output.of(processingConfiguration));
        }

        public Builder retryDuration(@Nullable Output<Integer> retryDuration) {
            $.retryDuration = retryDuration;
            return this;
        }

        public Builder retryDuration(Integer retryDuration) {
            return retryDuration(Output.of(retryDuration));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder s3BackupMode(@Nullable Output<String> s3BackupMode) {
            $.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3BackupMode(String s3BackupMode) {
            return s3BackupMode(Output.of(s3BackupMode));
        }

        public Builder typeName(@Nullable Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        public Builder vpcConfig(@Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public FirehoseDeliveryStreamElasticsearchConfigurationArgs build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}

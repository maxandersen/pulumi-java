// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamAmazonopensearchserviceDestinationConfigurationIndexRotationPeriod;
import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamAmazonopensearchserviceDestinationConfigurationS3BackupMode;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamAmazonopensearchserviceBufferingHints;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamAmazonopensearchserviceRetryOptions;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptions;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfiguration;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamVpcConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamAmazonopensearchserviceDestinationConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamAmazonopensearchserviceDestinationConfiguration Empty = new DeliveryStreamAmazonopensearchserviceDestinationConfiguration();

    @Import(name="bufferingHints")
    private @Nullable DeliveryStreamAmazonopensearchserviceBufferingHints bufferingHints;

    public Optional<DeliveryStreamAmazonopensearchserviceBufferingHints> bufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }

    @Import(name="cloudWatchLoggingOptions")
    private @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;

    public Optional<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }

    @Import(name="clusterEndpoint")
    private @Nullable String clusterEndpoint;

    public Optional<String> clusterEndpoint() {
        return Optional.ofNullable(this.clusterEndpoint);
    }

    @Import(name="domainARN")
    private @Nullable String domainARN;

    public Optional<String> domainARN() {
        return Optional.ofNullable(this.domainARN);
    }

    @Import(name="indexName", required=true)
    private String indexName;

    public String indexName() {
        return this.indexName;
    }

    @Import(name="indexRotationPeriod")
    private @Nullable DeliveryStreamAmazonopensearchserviceDestinationConfigurationIndexRotationPeriod indexRotationPeriod;

    public Optional<DeliveryStreamAmazonopensearchserviceDestinationConfigurationIndexRotationPeriod> indexRotationPeriod() {
        return Optional.ofNullable(this.indexRotationPeriod);
    }

    @Import(name="processingConfiguration")
    private @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;

    public Optional<DeliveryStreamProcessingConfiguration> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }

    @Import(name="retryOptions")
    private @Nullable DeliveryStreamAmazonopensearchserviceRetryOptions retryOptions;

    public Optional<DeliveryStreamAmazonopensearchserviceRetryOptions> retryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }

    @Import(name="roleARN", required=true)
    private String roleARN;

    public String roleARN() {
        return this.roleARN;
    }

    @Import(name="s3BackupMode")
    private @Nullable DeliveryStreamAmazonopensearchserviceDestinationConfigurationS3BackupMode s3BackupMode;

    public Optional<DeliveryStreamAmazonopensearchserviceDestinationConfigurationS3BackupMode> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    @Import(name="s3Configuration", required=true)
    private DeliveryStreamS3DestinationConfiguration s3Configuration;

    public DeliveryStreamS3DestinationConfiguration s3Configuration() {
        return this.s3Configuration;
    }

    @Import(name="typeName")
    private @Nullable String typeName;

    public Optional<String> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    @Import(name="vpcConfiguration")
    private @Nullable DeliveryStreamVpcConfiguration vpcConfiguration;

    public Optional<DeliveryStreamVpcConfiguration> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private DeliveryStreamAmazonopensearchserviceDestinationConfiguration() {}

    private DeliveryStreamAmazonopensearchserviceDestinationConfiguration(DeliveryStreamAmazonopensearchserviceDestinationConfiguration $) {
        this.bufferingHints = $.bufferingHints;
        this.cloudWatchLoggingOptions = $.cloudWatchLoggingOptions;
        this.clusterEndpoint = $.clusterEndpoint;
        this.domainARN = $.domainARN;
        this.indexName = $.indexName;
        this.indexRotationPeriod = $.indexRotationPeriod;
        this.processingConfiguration = $.processingConfiguration;
        this.retryOptions = $.retryOptions;
        this.roleARN = $.roleARN;
        this.s3BackupMode = $.s3BackupMode;
        this.s3Configuration = $.s3Configuration;
        this.typeName = $.typeName;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamAmazonopensearchserviceDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamAmazonopensearchserviceDestinationConfiguration $;

        public Builder() {
            $ = new DeliveryStreamAmazonopensearchserviceDestinationConfiguration();
        }

        public Builder(DeliveryStreamAmazonopensearchserviceDestinationConfiguration defaults) {
            $ = new DeliveryStreamAmazonopensearchserviceDestinationConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder bufferingHints(@Nullable DeliveryStreamAmazonopensearchserviceBufferingHints bufferingHints) {
            $.bufferingHints = bufferingHints;
            return this;
        }

        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            $.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder clusterEndpoint(@Nullable String clusterEndpoint) {
            $.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder domainARN(@Nullable String domainARN) {
            $.domainARN = domainARN;
            return this;
        }

        public Builder indexName(String indexName) {
            $.indexName = indexName;
            return this;
        }

        public Builder indexRotationPeriod(@Nullable DeliveryStreamAmazonopensearchserviceDestinationConfigurationIndexRotationPeriod indexRotationPeriod) {
            $.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            $.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder retryOptions(@Nullable DeliveryStreamAmazonopensearchserviceRetryOptions retryOptions) {
            $.retryOptions = retryOptions;
            return this;
        }

        public Builder roleARN(String roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder s3BackupMode(@Nullable DeliveryStreamAmazonopensearchserviceDestinationConfigurationS3BackupMode s3BackupMode) {
            $.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3Configuration(DeliveryStreamS3DestinationConfiguration s3Configuration) {
            $.s3Configuration = s3Configuration;
            return this;
        }

        public Builder typeName(@Nullable String typeName) {
            $.typeName = typeName;
            return this;
        }

        public Builder vpcConfiguration(@Nullable DeliveryStreamVpcConfiguration vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public DeliveryStreamAmazonopensearchserviceDestinationConfiguration build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            $.roleARN = Objects.requireNonNull($.roleARN, "expected parameter 'roleARN' to be non-null");
            $.s3Configuration = Objects.requireNonNull($.s3Configuration, "expected parameter 's3Configuration' to be non-null");
            return $;
        }
    }

}

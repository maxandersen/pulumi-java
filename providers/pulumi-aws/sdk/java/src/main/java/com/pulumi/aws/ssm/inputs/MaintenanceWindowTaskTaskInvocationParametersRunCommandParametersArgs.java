// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs;
import com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs;
import com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs();

    /**
     * Configuration options for sending command output to CloudWatch Logs. Documented below.
     * 
     */
    @Import(name="cloudwatchConfig")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig;

    public Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig() {
        return this.cloudwatchConfig == null ? Codegen.empty() : this.cloudwatchConfig;
    }

    /**
     * Information about the command(s) to execute.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> comment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * 
     */
    @Import(name="documentHash")
      private final @Nullable Output<String> documentHash;

    public Output<String> documentHash() {
        return this.documentHash == null ? Codegen.empty() : this.documentHash;
    }

    /**
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
     * 
     */
    @Import(name="documentHashType")
      private final @Nullable Output<String> documentHashType;

    public Output<String> documentHashType() {
        return this.documentHashType == null ? Codegen.empty() : this.documentHashType;
    }

    /**
     * The version of an Automation document to use during task execution.
     * 
     */
    @Import(name="documentVersion")
      private final @Nullable Output<String> documentVersion;

    public Output<String> documentVersion() {
        return this.documentVersion == null ? Codegen.empty() : this.documentVersion;
    }

    /**
     * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig;

    public Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig() {
        return this.notificationConfig == null ? Codegen.empty() : this.notificationConfig;
    }

    /**
     * The name of the Amazon S3 bucket.
     * 
     */
    @Import(name="outputS3Bucket")
      private final @Nullable Output<String> outputS3Bucket;

    public Output<String> outputS3Bucket() {
        return this.outputS3Bucket == null ? Codegen.empty() : this.outputS3Bucket;
    }

    /**
     * The Amazon S3 bucket subfolder.
     * 
     */
    @Import(name="outputS3KeyPrefix")
      private final @Nullable Output<String> outputS3KeyPrefix;

    public Output<String> outputS3KeyPrefix() {
        return this.outputS3KeyPrefix == null ? Codegen.empty() : this.outputS3KeyPrefix;
    }

    /**
     * The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters;

    public Output<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The IAM service role to assume during task execution.
     * 
     */
    @Import(name="serviceRoleArn")
      private final @Nullable Output<String> serviceRoleArn;

    public Output<String> serviceRoleArn() {
        return this.serviceRoleArn == null ? Codegen.empty() : this.serviceRoleArn;
    }

    /**
     * If this time is reached and the command has not already started executing, it doesn&#39;t run.
     * 
     */
    @Import(name="timeoutSeconds")
      private final @Nullable Output<Integer> timeoutSeconds;

    public Output<Integer> timeoutSeconds() {
        return this.timeoutSeconds == null ? Codegen.empty() : this.timeoutSeconds;
    }

    public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs(
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig,
        @Nullable Output<String> comment,
        @Nullable Output<String> documentHash,
        @Nullable Output<String> documentHashType,
        @Nullable Output<String> documentVersion,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig,
        @Nullable Output<String> outputS3Bucket,
        @Nullable Output<String> outputS3KeyPrefix,
        @Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters,
        @Nullable Output<String> serviceRoleArn,
        @Nullable Output<Integer> timeoutSeconds) {
        this.cloudwatchConfig = cloudwatchConfig;
        this.comment = comment;
        this.documentHash = documentHash;
        this.documentHashType = documentHashType;
        this.documentVersion = documentVersion;
        this.notificationConfig = notificationConfig;
        this.outputS3Bucket = outputS3Bucket;
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        this.parameters = parameters;
        this.serviceRoleArn = serviceRoleArn;
        this.timeoutSeconds = timeoutSeconds;
    }

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs() {
        this.cloudwatchConfig = Codegen.empty();
        this.comment = Codegen.empty();
        this.documentHash = Codegen.empty();
        this.documentHashType = Codegen.empty();
        this.documentVersion = Codegen.empty();
        this.notificationConfig = Codegen.empty();
        this.outputS3Bucket = Codegen.empty();
        this.outputS3KeyPrefix = Codegen.empty();
        this.parameters = Codegen.empty();
        this.serviceRoleArn = Codegen.empty();
        this.timeoutSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig;
        private @Nullable Output<String> comment;
        private @Nullable Output<String> documentHash;
        private @Nullable Output<String> documentHashType;
        private @Nullable Output<String> documentVersion;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig;
        private @Nullable Output<String> outputS3Bucket;
        private @Nullable Output<String> outputS3KeyPrefix;
        private @Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters;
        private @Nullable Output<String> serviceRoleArn;
        private @Nullable Output<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchConfig = defaults.cloudwatchConfig;
    	      this.comment = defaults.comment;
    	      this.documentHash = defaults.documentHash;
    	      this.documentHashType = defaults.documentHashType;
    	      this.documentVersion = defaults.documentVersion;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.outputS3Bucket = defaults.outputS3Bucket;
    	      this.outputS3KeyPrefix = defaults.outputS3KeyPrefix;
    	      this.parameters = defaults.parameters;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder cloudwatchConfig(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig) {
            this.cloudwatchConfig = cloudwatchConfig;
            return this;
        }
        public Builder cloudwatchConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs cloudwatchConfig) {
            this.cloudwatchConfig = Codegen.ofNullable(cloudwatchConfig);
            return this;
        }
        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder documentHash(@Nullable Output<String> documentHash) {
            this.documentHash = documentHash;
            return this;
        }
        public Builder documentHash(@Nullable String documentHash) {
            this.documentHash = Codegen.ofNullable(documentHash);
            return this;
        }
        public Builder documentHashType(@Nullable Output<String> documentHashType) {
            this.documentHashType = documentHashType;
            return this;
        }
        public Builder documentHashType(@Nullable String documentHashType) {
            this.documentHashType = Codegen.ofNullable(documentHashType);
            return this;
        }
        public Builder documentVersion(@Nullable Output<String> documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }
        public Builder documentVersion(@Nullable String documentVersion) {
            this.documentVersion = Codegen.ofNullable(documentVersion);
            return this;
        }
        public Builder notificationConfig(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Codegen.ofNullable(notificationConfig);
            return this;
        }
        public Builder outputS3Bucket(@Nullable Output<String> outputS3Bucket) {
            this.outputS3Bucket = outputS3Bucket;
            return this;
        }
        public Builder outputS3Bucket(@Nullable String outputS3Bucket) {
            this.outputS3Bucket = Codegen.ofNullable(outputS3Bucket);
            return this;
        }
        public Builder outputS3KeyPrefix(@Nullable Output<String> outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }
        public Builder outputS3KeyPrefix(@Nullable String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = Codegen.ofNullable(outputS3KeyPrefix);
            return this;
        }
        public Builder parameters(@Nullable Output<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }
        public Builder serviceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Codegen.ofNullable(serviceRoleArn);
            return this;
        }
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Codegen.ofNullable(timeoutSeconds);
            return this;
        }        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs(cloudwatchConfig, comment, documentHash, documentHashType, documentVersion, notificationConfig, outputS3Bucket, outputS3KeyPrefix, parameters, serviceRoleArn, timeoutSeconds);
        }
    }
}

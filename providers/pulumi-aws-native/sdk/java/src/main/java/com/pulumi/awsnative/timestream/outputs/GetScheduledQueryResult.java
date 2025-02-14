// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.outputs;

import com.pulumi.awsnative.timestream.outputs.ScheduledQueryTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScheduledQueryResult {
    private final @Nullable String arn;
    /**
     * @return Configuration for error reporting. Error reports will be generated when a problem is encountered when writing the query results.
     * 
     */
    private final @Nullable String sQErrorReportConfiguration;
    /**
     * @return The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not specified, the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the name with alias/. If ErrorReportConfiguration uses SSE_KMS as encryption type, the same KmsKeyId is used to encrypt the error report at rest.
     * 
     */
    private final @Nullable String sQKmsKeyId;
    /**
     * @return The name of the scheduled query. Scheduled query names must be unique within each Region.
     * 
     */
    private final @Nullable String sQName;
    /**
     * @return Notification configuration for the scheduled query. A notification is sent by Timestream when a query run finishes, when the state is updated or when you delete it.
     * 
     */
    private final @Nullable String sQNotificationConfiguration;
    /**
     * @return The query string to run. Parameter names can be specified in the query string @ character followed by an identifier. The named Parameter @scheduled_runtime is reserved and can be used in the query to get the time at which the query is scheduled to run. The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of @scheduled_runtime paramater for each query run. For example, consider an instance of a scheduled query executing on 2021-12-01 00:00:00. For this instance, the @scheduled_runtime parameter is initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     * 
     */
    private final @Nullable String sQQueryString;
    /**
     * @return Configuration for when the scheduled query is executed.
     * 
     */
    private final @Nullable String sQScheduleConfiguration;
    /**
     * @return The ARN for the IAM role that Timestream will assume when running the scheduled query.
     * 
     */
    private final @Nullable String sQScheduledQueryExecutionRoleArn;
    /**
     * @return Configuration of target store where scheduled query results are written to.
     * 
     */
    private final @Nullable String sQTargetConfiguration;
    private final @Nullable List<ScheduledQueryTag> tags;

    @CustomType.Constructor
    private GetScheduledQueryResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("sQErrorReportConfiguration") @Nullable String sQErrorReportConfiguration,
        @CustomType.Parameter("sQKmsKeyId") @Nullable String sQKmsKeyId,
        @CustomType.Parameter("sQName") @Nullable String sQName,
        @CustomType.Parameter("sQNotificationConfiguration") @Nullable String sQNotificationConfiguration,
        @CustomType.Parameter("sQQueryString") @Nullable String sQQueryString,
        @CustomType.Parameter("sQScheduleConfiguration") @Nullable String sQScheduleConfiguration,
        @CustomType.Parameter("sQScheduledQueryExecutionRoleArn") @Nullable String sQScheduledQueryExecutionRoleArn,
        @CustomType.Parameter("sQTargetConfiguration") @Nullable String sQTargetConfiguration,
        @CustomType.Parameter("tags") @Nullable List<ScheduledQueryTag> tags) {
        this.arn = arn;
        this.sQErrorReportConfiguration = sQErrorReportConfiguration;
        this.sQKmsKeyId = sQKmsKeyId;
        this.sQName = sQName;
        this.sQNotificationConfiguration = sQNotificationConfiguration;
        this.sQQueryString = sQQueryString;
        this.sQScheduleConfiguration = sQScheduleConfiguration;
        this.sQScheduledQueryExecutionRoleArn = sQScheduledQueryExecutionRoleArn;
        this.sQTargetConfiguration = sQTargetConfiguration;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Configuration for error reporting. Error reports will be generated when a problem is encountered when writing the query results.
     * 
     */
    public Optional<String> sQErrorReportConfiguration() {
        return Optional.ofNullable(this.sQErrorReportConfiguration);
    }
    /**
     * @return The Amazon KMS key used to encrypt the scheduled query resource, at-rest. If the Amazon KMS key is not specified, the scheduled query resource will be encrypted with a Timestream owned Amazon KMS key. To specify a KMS key, use the key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix the name with alias/. If ErrorReportConfiguration uses SSE_KMS as encryption type, the same KmsKeyId is used to encrypt the error report at rest.
     * 
     */
    public Optional<String> sQKmsKeyId() {
        return Optional.ofNullable(this.sQKmsKeyId);
    }
    /**
     * @return The name of the scheduled query. Scheduled query names must be unique within each Region.
     * 
     */
    public Optional<String> sQName() {
        return Optional.ofNullable(this.sQName);
    }
    /**
     * @return Notification configuration for the scheduled query. A notification is sent by Timestream when a query run finishes, when the state is updated or when you delete it.
     * 
     */
    public Optional<String> sQNotificationConfiguration() {
        return Optional.ofNullable(this.sQNotificationConfiguration);
    }
    /**
     * @return The query string to run. Parameter names can be specified in the query string @ character followed by an identifier. The named Parameter @scheduled_runtime is reserved and can be used in the query to get the time at which the query is scheduled to run. The timestamp calculated according to the ScheduleConfiguration parameter, will be the value of @scheduled_runtime paramater for each query run. For example, consider an instance of a scheduled query executing on 2021-12-01 00:00:00. For this instance, the @scheduled_runtime parameter is initialized to the timestamp 2021-12-01 00:00:00 when invoking the query.
     * 
     */
    public Optional<String> sQQueryString() {
        return Optional.ofNullable(this.sQQueryString);
    }
    /**
     * @return Configuration for when the scheduled query is executed.
     * 
     */
    public Optional<String> sQScheduleConfiguration() {
        return Optional.ofNullable(this.sQScheduleConfiguration);
    }
    /**
     * @return The ARN for the IAM role that Timestream will assume when running the scheduled query.
     * 
     */
    public Optional<String> sQScheduledQueryExecutionRoleArn() {
        return Optional.ofNullable(this.sQScheduledQueryExecutionRoleArn);
    }
    /**
     * @return Configuration of target store where scheduled query results are written to.
     * 
     */
    public Optional<String> sQTargetConfiguration() {
        return Optional.ofNullable(this.sQTargetConfiguration);
    }
    public List<ScheduledQueryTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String sQErrorReportConfiguration;
        private @Nullable String sQKmsKeyId;
        private @Nullable String sQName;
        private @Nullable String sQNotificationConfiguration;
        private @Nullable String sQQueryString;
        private @Nullable String sQScheduleConfiguration;
        private @Nullable String sQScheduledQueryExecutionRoleArn;
        private @Nullable String sQTargetConfiguration;
        private @Nullable List<ScheduledQueryTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.sQErrorReportConfiguration = defaults.sQErrorReportConfiguration;
    	      this.sQKmsKeyId = defaults.sQKmsKeyId;
    	      this.sQName = defaults.sQName;
    	      this.sQNotificationConfiguration = defaults.sQNotificationConfiguration;
    	      this.sQQueryString = defaults.sQQueryString;
    	      this.sQScheduleConfiguration = defaults.sQScheduleConfiguration;
    	      this.sQScheduledQueryExecutionRoleArn = defaults.sQScheduledQueryExecutionRoleArn;
    	      this.sQTargetConfiguration = defaults.sQTargetConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder sQErrorReportConfiguration(@Nullable String sQErrorReportConfiguration) {
            this.sQErrorReportConfiguration = sQErrorReportConfiguration;
            return this;
        }
        public Builder sQKmsKeyId(@Nullable String sQKmsKeyId) {
            this.sQKmsKeyId = sQKmsKeyId;
            return this;
        }
        public Builder sQName(@Nullable String sQName) {
            this.sQName = sQName;
            return this;
        }
        public Builder sQNotificationConfiguration(@Nullable String sQNotificationConfiguration) {
            this.sQNotificationConfiguration = sQNotificationConfiguration;
            return this;
        }
        public Builder sQQueryString(@Nullable String sQQueryString) {
            this.sQQueryString = sQQueryString;
            return this;
        }
        public Builder sQScheduleConfiguration(@Nullable String sQScheduleConfiguration) {
            this.sQScheduleConfiguration = sQScheduleConfiguration;
            return this;
        }
        public Builder sQScheduledQueryExecutionRoleArn(@Nullable String sQScheduledQueryExecutionRoleArn) {
            this.sQScheduledQueryExecutionRoleArn = sQScheduledQueryExecutionRoleArn;
            return this;
        }
        public Builder sQTargetConfiguration(@Nullable String sQTargetConfiguration) {
            this.sQTargetConfiguration = sQTargetConfiguration;
            return this;
        }
        public Builder tags(@Nullable List<ScheduledQueryTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ScheduledQueryTag... tags) {
            return tags(List.of(tags));
        }        public GetScheduledQueryResult build() {
            return new GetScheduledQueryResult(arn, sQErrorReportConfiguration, sQKmsKeyId, sQName, sQNotificationConfiguration, sQQueryString, sQScheduleConfiguration, sQScheduledQueryExecutionRoleArn, sQTargetConfiguration, tags);
        }
    }
}

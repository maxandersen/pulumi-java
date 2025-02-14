// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of the timespan of the items to include in scanning. Currently only supported when inspecting Google Cloud Storage and BigQuery.
 * 
 */
public final class GooglePrivacyDlpV2TimespanConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2TimespanConfigArgs Empty = new GooglePrivacyDlpV2TimespanConfigArgs();

    /**
     * When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    @Import(name="enableAutoPopulationOfTimespanConfig")
    private @Nullable Output<Boolean> enableAutoPopulationOfTimespanConfig;

    /**
     * @return When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    public Optional<Output<Boolean>> enableAutoPopulationOfTimespanConfig() {
        return Optional.ofNullable(this.enableAutoPopulationOfTimespanConfig);
    }

    /**
     * Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
     * 
     */
    @Import(name="timestampField")
    private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> timestampField;

    /**
     * @return Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2FieldIdArgs>> timestampField() {
        return Optional.ofNullable(this.timestampField);
    }

    private GooglePrivacyDlpV2TimespanConfigArgs() {}

    private GooglePrivacyDlpV2TimespanConfigArgs(GooglePrivacyDlpV2TimespanConfigArgs $) {
        this.enableAutoPopulationOfTimespanConfig = $.enableAutoPopulationOfTimespanConfig;
        this.endTime = $.endTime;
        this.startTime = $.startTime;
        this.timestampField = $.timestampField;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2TimespanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2TimespanConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2TimespanConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2TimespanConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2TimespanConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableAutoPopulationOfTimespanConfig When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
         * 
         * @return builder
         * 
         */
        public Builder enableAutoPopulationOfTimespanConfig(@Nullable Output<Boolean> enableAutoPopulationOfTimespanConfig) {
            $.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
            return this;
        }

        /**
         * @param enableAutoPopulationOfTimespanConfig When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
         * 
         * @return builder
         * 
         */
        public Builder enableAutoPopulationOfTimespanConfig(Boolean enableAutoPopulationOfTimespanConfig) {
            return enableAutoPopulationOfTimespanConfig(Output.of(enableAutoPopulationOfTimespanConfig));
        }

        /**
         * @param endTime Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timestampField Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
         * 
         * @return builder
         * 
         */
        public Builder timestampField(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> timestampField) {
            $.timestampField = timestampField;
            return this;
        }

        /**
         * @param timestampField Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
         * 
         * @return builder
         * 
         */
        public Builder timestampField(GooglePrivacyDlpV2FieldIdArgs timestampField) {
            return timestampField(Output.of(timestampField));
        }

        public GooglePrivacyDlpV2TimespanConfigArgs build() {
            return $;
        }
    }

}

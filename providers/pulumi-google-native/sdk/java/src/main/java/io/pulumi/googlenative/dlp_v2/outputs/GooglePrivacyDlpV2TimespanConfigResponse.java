// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2TimespanConfigResponse {
    /**
     * When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    private final Boolean enableAutoPopulationOfTimespanConfig;
    /**
     * Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
     * 
     */
    private final String endTime;
    /**
     * Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
     * 
     */
    private final String startTime;
    /**
     * Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse timestampField;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2TimespanConfigResponse(
        @OutputCustomType.Parameter("enableAutoPopulationOfTimespanConfig") Boolean enableAutoPopulationOfTimespanConfig,
        @OutputCustomType.Parameter("endTime") String endTime,
        @OutputCustomType.Parameter("startTime") String startTime,
        @OutputCustomType.Parameter("timestampField") GooglePrivacyDlpV2FieldIdResponse timestampField) {
        this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
        this.endTime = endTime;
        this.startTime = startTime;
        this.timestampField = timestampField;
    }

    /**
     * When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
     * 
    */
    public Boolean getEnableAutoPopulationOfTimespanConfig() {
        return this.enableAutoPopulationOfTimespanConfig;
    }
    /**
     * Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
     * 
    */
    public GooglePrivacyDlpV2FieldIdResponse getTimestampField() {
        return this.timestampField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TimespanConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableAutoPopulationOfTimespanConfig;
        private String endTime;
        private String startTime;
        private GooglePrivacyDlpV2FieldIdResponse timestampField;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TimespanConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutoPopulationOfTimespanConfig = defaults.enableAutoPopulationOfTimespanConfig;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timestampField = defaults.timestampField;
        }

        public Builder setEnableAutoPopulationOfTimespanConfig(Boolean enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = Objects.requireNonNull(enableAutoPopulationOfTimespanConfig);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTimestampField(GooglePrivacyDlpV2FieldIdResponse timestampField) {
            this.timestampField = Objects.requireNonNull(timestampField);
            return this;
        }
        public GooglePrivacyDlpV2TimespanConfigResponse build() {
            return new GooglePrivacyDlpV2TimespanConfigResponse(enableAutoPopulationOfTimespanConfig, endTime, startTime, timestampField);
        }
    }
}

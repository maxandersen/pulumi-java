// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cur;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportDefinitionArgs Empty = new ReportDefinitionArgs();

    /**
     * A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and report_versioning must be `OVERWRITE_REPORT`.
     * 
     */
    @Import(name="additionalArtifacts")
    private @Nullable Output<List<String>> additionalArtifacts;

    public Optional<Output<List<String>>> additionalArtifacts() {
        return Optional.ofNullable(this.additionalArtifacts);
    }

    /**
     * A list of schema elements. Valid values are: `RESOURCES`.
     * 
     */
    @Import(name="additionalSchemaElements", required=true)
    private Output<List<String>> additionalSchemaElements;

    public Output<List<String>> additionalSchemaElements() {
        return this.additionalSchemaElements;
    }

    /**
     * Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
     * 
     */
    @Import(name="compression", required=true)
    private Output<String> compression;

    public Output<String> compression() {
        return this.compression;
    }

    /**
     * Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    public Output<String> format() {
        return this.format;
    }

    /**
     * Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
     * 
     */
    @Import(name="refreshClosedReports")
    private @Nullable Output<Boolean> refreshClosedReports;

    public Optional<Output<Boolean>> refreshClosedReports() {
        return Optional.ofNullable(this.refreshClosedReports);
    }

    /**
     * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
     * 
     */
    @Import(name="reportName", required=true)
    private Output<String> reportName;

    public Output<String> reportName() {
        return this.reportName;
    }

    /**
     * Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
     * 
     */
    @Import(name="reportVersioning")
    private @Nullable Output<String> reportVersioning;

    public Optional<Output<String>> reportVersioning() {
        return Optional.ofNullable(this.reportVersioning);
    }

    /**
     * Name of the existing S3 bucket to hold generated reports.
     * 
     */
    @Import(name="s3Bucket", required=true)
    private Output<String> s3Bucket;

    public Output<String> s3Bucket() {
        return this.s3Bucket;
    }

    /**
     * Report path prefix. Limited to 256 characters.
     * 
     */
    @Import(name="s3Prefix")
    private @Nullable Output<String> s3Prefix;

    public Optional<Output<String>> s3Prefix() {
        return Optional.ofNullable(this.s3Prefix);
    }

    /**
     * Region of the existing S3 bucket to hold generated reports.
     * 
     */
    @Import(name="s3Region", required=true)
    private Output<String> s3Region;

    public Output<String> s3Region() {
        return this.s3Region;
    }

    /**
     * The frequency on which report data are measured and displayed.  Valid values are: `HOURLY`, `DAILY`.
     * 
     */
    @Import(name="timeUnit", required=true)
    private Output<String> timeUnit;

    public Output<String> timeUnit() {
        return this.timeUnit;
    }

    private ReportDefinitionArgs() {}

    private ReportDefinitionArgs(ReportDefinitionArgs $) {
        this.additionalArtifacts = $.additionalArtifacts;
        this.additionalSchemaElements = $.additionalSchemaElements;
        this.compression = $.compression;
        this.format = $.format;
        this.refreshClosedReports = $.refreshClosedReports;
        this.reportName = $.reportName;
        this.reportVersioning = $.reportVersioning;
        this.s3Bucket = $.s3Bucket;
        this.s3Prefix = $.s3Prefix;
        this.s3Region = $.s3Region;
        this.timeUnit = $.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDefinitionArgs $;

        public Builder() {
            $ = new ReportDefinitionArgs();
        }

        public Builder(ReportDefinitionArgs defaults) {
            $ = new ReportDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalArtifacts(@Nullable Output<List<String>> additionalArtifacts) {
            $.additionalArtifacts = additionalArtifacts;
            return this;
        }

        public Builder additionalArtifacts(List<String> additionalArtifacts) {
            return additionalArtifacts(Output.of(additionalArtifacts));
        }

        public Builder additionalArtifacts(String... additionalArtifacts) {
            return additionalArtifacts(List.of(additionalArtifacts));
        }

        public Builder additionalSchemaElements(Output<List<String>> additionalSchemaElements) {
            $.additionalSchemaElements = additionalSchemaElements;
            return this;
        }

        public Builder additionalSchemaElements(List<String> additionalSchemaElements) {
            return additionalSchemaElements(Output.of(additionalSchemaElements));
        }

        public Builder additionalSchemaElements(String... additionalSchemaElements) {
            return additionalSchemaElements(List.of(additionalSchemaElements));
        }

        public Builder compression(Output<String> compression) {
            $.compression = compression;
            return this;
        }

        public Builder compression(String compression) {
            return compression(Output.of(compression));
        }

        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder refreshClosedReports(@Nullable Output<Boolean> refreshClosedReports) {
            $.refreshClosedReports = refreshClosedReports;
            return this;
        }

        public Builder refreshClosedReports(Boolean refreshClosedReports) {
            return refreshClosedReports(Output.of(refreshClosedReports));
        }

        public Builder reportName(Output<String> reportName) {
            $.reportName = reportName;
            return this;
        }

        public Builder reportName(String reportName) {
            return reportName(Output.of(reportName));
        }

        public Builder reportVersioning(@Nullable Output<String> reportVersioning) {
            $.reportVersioning = reportVersioning;
            return this;
        }

        public Builder reportVersioning(String reportVersioning) {
            return reportVersioning(Output.of(reportVersioning));
        }

        public Builder s3Bucket(Output<String> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        public Builder s3Bucket(String s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        public Builder s3Prefix(@Nullable Output<String> s3Prefix) {
            $.s3Prefix = s3Prefix;
            return this;
        }

        public Builder s3Prefix(String s3Prefix) {
            return s3Prefix(Output.of(s3Prefix));
        }

        public Builder s3Region(Output<String> s3Region) {
            $.s3Region = s3Region;
            return this;
        }

        public Builder s3Region(String s3Region) {
            return s3Region(Output.of(s3Region));
        }

        public Builder timeUnit(Output<String> timeUnit) {
            $.timeUnit = timeUnit;
            return this;
        }

        public Builder timeUnit(String timeUnit) {
            return timeUnit(Output.of(timeUnit));
        }

        public ReportDefinitionArgs build() {
            $.additionalSchemaElements = Objects.requireNonNull($.additionalSchemaElements, "expected parameter 'additionalSchemaElements' to be non-null");
            $.compression = Objects.requireNonNull($.compression, "expected parameter 'compression' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            $.s3Bucket = Objects.requireNonNull($.s3Bucket, "expected parameter 's3Bucket' to be non-null");
            $.s3Region = Objects.requireNonNull($.s3Region, "expected parameter 's3Region' to be non-null");
            $.timeUnit = Objects.requireNonNull($.timeUnit, "expected parameter 'timeUnit' to be non-null");
            return $;
        }
    }

}

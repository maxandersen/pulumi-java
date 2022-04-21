// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.JobExtractSourceModelArgs;
import com.pulumi.gcp.bigquery.inputs.JobExtractSourceTableArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobExtractArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobExtractArgs Empty = new JobExtractArgs();

    /**
     * The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE.
     * The default value is NONE. DEFLATE and SNAPPY are only supported for Avro.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<String> compression;

    public Optional<Output<String>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO for tables and SAVED_MODEL for models.
     * The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV.
     * The default value for models is SAVED_MODEL.
     * 
     */
    @Import(name="destinationFormat")
    private @Nullable Output<String> destinationFormat;

    public Optional<Output<String>> destinationFormat() {
        return Optional.ofNullable(this.destinationFormat);
    }

    /**
     * A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    @Import(name="destinationUris", required=true)
    private Output<List<String>> destinationUris;

    public Output<List<String>> destinationUris() {
        return this.destinationUris;
    }

    /**
     * When extracting data in CSV format, this defines the delimiter to use between fields in the exported data.
     * Default is &#39;,&#39;
     * 
     */
    @Import(name="fieldDelimiter")
    private @Nullable Output<String> fieldDelimiter;

    public Optional<Output<String>> fieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }

    /**
     * Whether to print out a header row in the results. Default is true.
     * 
     */
    @Import(name="printHeader")
    private @Nullable Output<Boolean> printHeader;

    public Optional<Output<Boolean>> printHeader() {
        return Optional.ofNullable(this.printHeader);
    }

    /**
     * A reference to the model being exported.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceModel")
    private @Nullable Output<JobExtractSourceModelArgs> sourceModel;

    public Optional<Output<JobExtractSourceModelArgs>> sourceModel() {
        return Optional.ofNullable(this.sourceModel);
    }

    /**
     * A reference to the table being exported.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceTable")
    private @Nullable Output<JobExtractSourceTableArgs> sourceTable;

    public Optional<Output<JobExtractSourceTableArgs>> sourceTable() {
        return Optional.ofNullable(this.sourceTable);
    }

    /**
     * Whether to use logical types when extracting to AVRO format.
     * 
     */
    @Import(name="useAvroLogicalTypes")
    private @Nullable Output<Boolean> useAvroLogicalTypes;

    public Optional<Output<Boolean>> useAvroLogicalTypes() {
        return Optional.ofNullable(this.useAvroLogicalTypes);
    }

    private JobExtractArgs() {}

    private JobExtractArgs(JobExtractArgs $) {
        this.compression = $.compression;
        this.destinationFormat = $.destinationFormat;
        this.destinationUris = $.destinationUris;
        this.fieldDelimiter = $.fieldDelimiter;
        this.printHeader = $.printHeader;
        this.sourceModel = $.sourceModel;
        this.sourceTable = $.sourceTable;
        this.useAvroLogicalTypes = $.useAvroLogicalTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobExtractArgs $;

        public Builder() {
            $ = new JobExtractArgs();
        }

        public Builder(JobExtractArgs defaults) {
            $ = new JobExtractArgs(Objects.requireNonNull(defaults));
        }

        public Builder compression(@Nullable Output<String> compression) {
            $.compression = compression;
            return this;
        }

        public Builder compression(String compression) {
            return compression(Output.of(compression));
        }

        public Builder destinationFormat(@Nullable Output<String> destinationFormat) {
            $.destinationFormat = destinationFormat;
            return this;
        }

        public Builder destinationFormat(String destinationFormat) {
            return destinationFormat(Output.of(destinationFormat));
        }

        public Builder destinationUris(Output<List<String>> destinationUris) {
            $.destinationUris = destinationUris;
            return this;
        }

        public Builder destinationUris(List<String> destinationUris) {
            return destinationUris(Output.of(destinationUris));
        }

        public Builder destinationUris(String... destinationUris) {
            return destinationUris(List.of(destinationUris));
        }

        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            $.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder fieldDelimiter(String fieldDelimiter) {
            return fieldDelimiter(Output.of(fieldDelimiter));
        }

        public Builder printHeader(@Nullable Output<Boolean> printHeader) {
            $.printHeader = printHeader;
            return this;
        }

        public Builder printHeader(Boolean printHeader) {
            return printHeader(Output.of(printHeader));
        }

        public Builder sourceModel(@Nullable Output<JobExtractSourceModelArgs> sourceModel) {
            $.sourceModel = sourceModel;
            return this;
        }

        public Builder sourceModel(JobExtractSourceModelArgs sourceModel) {
            return sourceModel(Output.of(sourceModel));
        }

        public Builder sourceTable(@Nullable Output<JobExtractSourceTableArgs> sourceTable) {
            $.sourceTable = sourceTable;
            return this;
        }

        public Builder sourceTable(JobExtractSourceTableArgs sourceTable) {
            return sourceTable(Output.of(sourceTable));
        }

        public Builder useAvroLogicalTypes(@Nullable Output<Boolean> useAvroLogicalTypes) {
            $.useAvroLogicalTypes = useAvroLogicalTypes;
            return this;
        }

        public Builder useAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            return useAvroLogicalTypes(Output.of(useAvroLogicalTypes));
        }

        public JobExtractArgs build() {
            $.destinationUris = Objects.requireNonNull($.destinationUris, "expected parameter 'destinationUris' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationCsvOptionsArgs;
import com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationGoogleSheetsOptionsArgs;
import com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationHivePartitioningOptionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationArgs Empty = new TableExternalDataConfigurationArgs();

    /**
     * - Let BigQuery try to autodetect the schema
     *   and format of the table.
     * 
     */
    @Import(name="autodetect", required=true)
      private final Output<Boolean> autodetect;

    public Output<Boolean> autodetect() {
        return this.autodetect;
    }

    /**
     * The compression type of the data source.
     * Valid values are &#34;NONE&#34; or &#34;GZIP&#34;.
     * 
     */
    @Import(name="compression")
      private final @Nullable Output<String> compression;

    public Output<String> compression() {
        return this.compression == null ? Codegen.empty() : this.compression;
    }

    /**
     * Additional properties to set if
     * `source_format` is set to &#34;CSV&#34;. Structure is documented below.
     * 
     */
    @Import(name="csvOptions")
      private final @Nullable Output<TableExternalDataConfigurationCsvOptionsArgs> csvOptions;

    public Output<TableExternalDataConfigurationCsvOptionsArgs> csvOptions() {
        return this.csvOptions == null ? Codegen.empty() : this.csvOptions;
    }

    /**
     * Additional options if
     * `source_format` is set to &#34;GOOGLE_SHEETS&#34;. Structure is
     * documented below.
     * 
     */
    @Import(name="googleSheetsOptions")
      private final @Nullable Output<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions;

    public Output<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions() {
        return this.googleSheetsOptions == null ? Codegen.empty() : this.googleSheetsOptions;
    }

    /**
     * When set, configures hive partitioning
     * support. Not all storage formats support hive partitioning -- requesting hive
     * partitioning on an unsupported format will lead to an error, as will providing
     * an invalid specification. Structure is documented below.
     * 
     */
    @Import(name="hivePartitioningOptions")
      private final @Nullable Output<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions;

    public Output<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions() {
        return this.hivePartitioningOptions == null ? Codegen.empty() : this.hivePartitioningOptions;
    }

    /**
     * Indicates if BigQuery should
     * allow extra values that are not represented in the table schema.
     * If true, the extra values are ignored. If false, records with
     * extra columns are treated as bad records, and if there are too
     * many bad records, an invalid error is returned in the job result.
     * The default value is false.
     * 
     */
    @Import(name="ignoreUnknownValues")
      private final @Nullable Output<Boolean> ignoreUnknownValues;

    public Output<Boolean> ignoreUnknownValues() {
        return this.ignoreUnknownValues == null ? Codegen.empty() : this.ignoreUnknownValues;
    }

    /**
     * The maximum number of bad records that
     * BigQuery can ignore when reading data.
     * 
     */
    @Import(name="maxBadRecords")
      private final @Nullable Output<Integer> maxBadRecords;

    public Output<Integer> maxBadRecords() {
        return this.maxBadRecords == null ? Codegen.empty() : this.maxBadRecords;
    }

    /**
     * A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~&gt;**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn&#39;t changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> schema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    /**
     * The data format. Supported values are:
     * &#34;CSV&#34;, &#34;GOOGLE_SHEETS&#34;, &#34;NEWLINE_DELIMITED_JSON&#34;, &#34;AVRO&#34;, &#34;PARQUET&#34;, &#34;ORC&#34;,
     * &#34;DATSTORE_BACKUP&#34;, and &#34;BIGTABLE&#34;. To use &#34;GOOGLE_SHEETS&#34;
     * the `scopes` must include
     * &#34;https://www.googleapis.com/auth/drive.readonly&#34;.
     * 
     */
    @Import(name="sourceFormat", required=true)
      private final Output<String> sourceFormat;

    public Output<String> sourceFormat() {
        return this.sourceFormat;
    }

    /**
     * A list of the fully-qualified URIs that point to
     * your data in Google Cloud.
     * 
     */
    @Import(name="sourceUris", required=true)
      private final Output<List<String>> sourceUris;

    public Output<List<String>> sourceUris() {
        return this.sourceUris;
    }

    public TableExternalDataConfigurationArgs(
        Output<Boolean> autodetect,
        @Nullable Output<String> compression,
        @Nullable Output<TableExternalDataConfigurationCsvOptionsArgs> csvOptions,
        @Nullable Output<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions,
        @Nullable Output<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions,
        @Nullable Output<Boolean> ignoreUnknownValues,
        @Nullable Output<Integer> maxBadRecords,
        @Nullable Output<String> schema,
        Output<String> sourceFormat,
        Output<List<String>> sourceUris) {
        this.autodetect = Objects.requireNonNull(autodetect, "expected parameter 'autodetect' to be non-null");
        this.compression = compression;
        this.csvOptions = csvOptions;
        this.googleSheetsOptions = googleSheetsOptions;
        this.hivePartitioningOptions = hivePartitioningOptions;
        this.ignoreUnknownValues = ignoreUnknownValues;
        this.maxBadRecords = maxBadRecords;
        this.schema = schema;
        this.sourceFormat = Objects.requireNonNull(sourceFormat, "expected parameter 'sourceFormat' to be non-null");
        this.sourceUris = Objects.requireNonNull(sourceUris, "expected parameter 'sourceUris' to be non-null");
    }

    private TableExternalDataConfigurationArgs() {
        this.autodetect = Codegen.empty();
        this.compression = Codegen.empty();
        this.csvOptions = Codegen.empty();
        this.googleSheetsOptions = Codegen.empty();
        this.hivePartitioningOptions = Codegen.empty();
        this.ignoreUnknownValues = Codegen.empty();
        this.maxBadRecords = Codegen.empty();
        this.schema = Codegen.empty();
        this.sourceFormat = Codegen.empty();
        this.sourceUris = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> autodetect;
        private @Nullable Output<String> compression;
        private @Nullable Output<TableExternalDataConfigurationCsvOptionsArgs> csvOptions;
        private @Nullable Output<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions;
        private @Nullable Output<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions;
        private @Nullable Output<Boolean> ignoreUnknownValues;
        private @Nullable Output<Integer> maxBadRecords;
        private @Nullable Output<String> schema;
        private Output<String> sourceFormat;
        private Output<List<String>> sourceUris;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autodetect = defaults.autodetect;
    	      this.compression = defaults.compression;
    	      this.csvOptions = defaults.csvOptions;
    	      this.googleSheetsOptions = defaults.googleSheetsOptions;
    	      this.hivePartitioningOptions = defaults.hivePartitioningOptions;
    	      this.ignoreUnknownValues = defaults.ignoreUnknownValues;
    	      this.maxBadRecords = defaults.maxBadRecords;
    	      this.schema = defaults.schema;
    	      this.sourceFormat = defaults.sourceFormat;
    	      this.sourceUris = defaults.sourceUris;
        }

        public Builder autodetect(Output<Boolean> autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }
        public Builder autodetect(Boolean autodetect) {
            this.autodetect = Output.of(Objects.requireNonNull(autodetect));
            return this;
        }
        public Builder compression(@Nullable Output<String> compression) {
            this.compression = compression;
            return this;
        }
        public Builder compression(@Nullable String compression) {
            this.compression = Codegen.ofNullable(compression);
            return this;
        }
        public Builder csvOptions(@Nullable Output<TableExternalDataConfigurationCsvOptionsArgs> csvOptions) {
            this.csvOptions = csvOptions;
            return this;
        }
        public Builder csvOptions(@Nullable TableExternalDataConfigurationCsvOptionsArgs csvOptions) {
            this.csvOptions = Codegen.ofNullable(csvOptions);
            return this;
        }
        public Builder googleSheetsOptions(@Nullable Output<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions) {
            this.googleSheetsOptions = googleSheetsOptions;
            return this;
        }
        public Builder googleSheetsOptions(@Nullable TableExternalDataConfigurationGoogleSheetsOptionsArgs googleSheetsOptions) {
            this.googleSheetsOptions = Codegen.ofNullable(googleSheetsOptions);
            return this;
        }
        public Builder hivePartitioningOptions(@Nullable Output<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions) {
            this.hivePartitioningOptions = hivePartitioningOptions;
            return this;
        }
        public Builder hivePartitioningOptions(@Nullable TableExternalDataConfigurationHivePartitioningOptionsArgs hivePartitioningOptions) {
            this.hivePartitioningOptions = Codegen.ofNullable(hivePartitioningOptions);
            return this;
        }
        public Builder ignoreUnknownValues(@Nullable Output<Boolean> ignoreUnknownValues) {
            this.ignoreUnknownValues = ignoreUnknownValues;
            return this;
        }
        public Builder ignoreUnknownValues(@Nullable Boolean ignoreUnknownValues) {
            this.ignoreUnknownValues = Codegen.ofNullable(ignoreUnknownValues);
            return this;
        }
        public Builder maxBadRecords(@Nullable Output<Integer> maxBadRecords) {
            this.maxBadRecords = maxBadRecords;
            return this;
        }
        public Builder maxBadRecords(@Nullable Integer maxBadRecords) {
            this.maxBadRecords = Codegen.ofNullable(maxBadRecords);
            return this;
        }
        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }
        public Builder sourceFormat(Output<String> sourceFormat) {
            this.sourceFormat = Objects.requireNonNull(sourceFormat);
            return this;
        }
        public Builder sourceFormat(String sourceFormat) {
            this.sourceFormat = Output.of(Objects.requireNonNull(sourceFormat));
            return this;
        }
        public Builder sourceUris(Output<List<String>> sourceUris) {
            this.sourceUris = Objects.requireNonNull(sourceUris);
            return this;
        }
        public Builder sourceUris(List<String> sourceUris) {
            this.sourceUris = Output.of(Objects.requireNonNull(sourceUris));
            return this;
        }
        public Builder sourceUris(String... sourceUris) {
            return sourceUris(List.of(sourceUris));
        }        public TableExternalDataConfigurationArgs build() {
            return new TableExternalDataConfigurationArgs(autodetect, compression, csvOptions, googleSheetsOptions, hivePartitioningOptions, ignoreUnknownValues, maxBadRecords, schema, sourceFormat, sourceUris);
        }
    }
}

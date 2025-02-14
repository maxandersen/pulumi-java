// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
     * 
     */
    @EnumType
    public enum GooglePrivacyDlpV2OutputStorageConfigOutputSchema {
        /**
         * Unused.
         * 
         */
        OutputSchemaUnspecified("OUTPUT_SCHEMA_UNSPECIFIED"),
        /**
         * Basic schema including only `info_type`, `quote`, `certainty`, and `timestamp`.
         * 
         */
        BasicColumns("BASIC_COLUMNS"),
        /**
         * Schema tailored to findings from scanning Google Cloud Storage.
         * 
         */
        GcsColumns("GCS_COLUMNS"),
        /**
         * Schema tailored to findings from scanning Google Datastore.
         * 
         */
        DatastoreColumns("DATASTORE_COLUMNS"),
        /**
         * Schema tailored to findings from scanning Google BigQuery.
         * 
         */
        BigQueryColumns("BIG_QUERY_COLUMNS"),
        /**
         * Schema containing all columns.
         * 
         */
        AllColumns("ALL_COLUMNS");

        private final String value;

        GooglePrivacyDlpV2OutputStorageConfigOutputSchema(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GooglePrivacyDlpV2OutputStorageConfigOutputSchema[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

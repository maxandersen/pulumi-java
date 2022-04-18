// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Options defining BigQuery table and row identifiers.
 * 
 */
public final class GooglePrivacyDlpV2BigQueryOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2BigQueryOptionsResponse Empty = new GooglePrivacyDlpV2BigQueryOptionsResponse();

    /**
     * References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
     * 
     */
    @Import(name="excludedFields", required=true)
      private final List<GooglePrivacyDlpV2FieldIdResponse> excludedFields;

    public List<GooglePrivacyDlpV2FieldIdResponse> excludedFields() {
        return this.excludedFields;
    }

    /**
     * Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
     * 
     */
    @Import(name="identifyingFields", required=true)
      private final List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields;

    public List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields() {
        return this.identifyingFields;
    }

    /**
     * Limit scanning only to these fields.
     * 
     */
    @Import(name="includedFields", required=true)
      private final List<GooglePrivacyDlpV2FieldIdResponse> includedFields;

    public List<GooglePrivacyDlpV2FieldIdResponse> includedFields() {
        return this.includedFields;
    }

    /**
     * Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    @Import(name="rowsLimit", required=true)
      private final String rowsLimit;

    public String rowsLimit() {
        return this.rowsLimit;
    }

    /**
     * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    @Import(name="rowsLimitPercent", required=true)
      private final Integer rowsLimitPercent;

    public Integer rowsLimitPercent() {
        return this.rowsLimitPercent;
    }

    @Import(name="sampleMethod", required=true)
      private final String sampleMethod;

    public String sampleMethod() {
        return this.sampleMethod;
    }

    /**
     * Complete BigQuery table reference.
     * 
     */
    @Import(name="tableReference", required=true)
      private final GooglePrivacyDlpV2BigQueryTableResponse tableReference;

    public GooglePrivacyDlpV2BigQueryTableResponse tableReference() {
        return this.tableReference;
    }

    public GooglePrivacyDlpV2BigQueryOptionsResponse(
        List<GooglePrivacyDlpV2FieldIdResponse> excludedFields,
        List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields,
        List<GooglePrivacyDlpV2FieldIdResponse> includedFields,
        String rowsLimit,
        Integer rowsLimitPercent,
        String sampleMethod,
        GooglePrivacyDlpV2BigQueryTableResponse tableReference) {
        this.excludedFields = Objects.requireNonNull(excludedFields, "expected parameter 'excludedFields' to be non-null");
        this.identifyingFields = Objects.requireNonNull(identifyingFields, "expected parameter 'identifyingFields' to be non-null");
        this.includedFields = Objects.requireNonNull(includedFields, "expected parameter 'includedFields' to be non-null");
        this.rowsLimit = Objects.requireNonNull(rowsLimit, "expected parameter 'rowsLimit' to be non-null");
        this.rowsLimitPercent = Objects.requireNonNull(rowsLimitPercent, "expected parameter 'rowsLimitPercent' to be non-null");
        this.sampleMethod = Objects.requireNonNull(sampleMethod, "expected parameter 'sampleMethod' to be non-null");
        this.tableReference = Objects.requireNonNull(tableReference, "expected parameter 'tableReference' to be non-null");
    }

    private GooglePrivacyDlpV2BigQueryOptionsResponse() {
        this.excludedFields = List.of();
        this.identifyingFields = List.of();
        this.includedFields = List.of();
        this.rowsLimit = null;
        this.rowsLimitPercent = null;
        this.sampleMethod = null;
        this.tableReference = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BigQueryOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2FieldIdResponse> excludedFields;
        private List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields;
        private List<GooglePrivacyDlpV2FieldIdResponse> includedFields;
        private String rowsLimit;
        private Integer rowsLimitPercent;
        private String sampleMethod;
        private GooglePrivacyDlpV2BigQueryTableResponse tableReference;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BigQueryOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedFields = defaults.excludedFields;
    	      this.identifyingFields = defaults.identifyingFields;
    	      this.includedFields = defaults.includedFields;
    	      this.rowsLimit = defaults.rowsLimit;
    	      this.rowsLimitPercent = defaults.rowsLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
    	      this.tableReference = defaults.tableReference;
        }

        public Builder excludedFields(List<GooglePrivacyDlpV2FieldIdResponse> excludedFields) {
            this.excludedFields = Objects.requireNonNull(excludedFields);
            return this;
        }
        public Builder excludedFields(GooglePrivacyDlpV2FieldIdResponse... excludedFields) {
            return excludedFields(List.of(excludedFields));
        }
        public Builder identifyingFields(List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields) {
            this.identifyingFields = Objects.requireNonNull(identifyingFields);
            return this;
        }
        public Builder identifyingFields(GooglePrivacyDlpV2FieldIdResponse... identifyingFields) {
            return identifyingFields(List.of(identifyingFields));
        }
        public Builder includedFields(List<GooglePrivacyDlpV2FieldIdResponse> includedFields) {
            this.includedFields = Objects.requireNonNull(includedFields);
            return this;
        }
        public Builder includedFields(GooglePrivacyDlpV2FieldIdResponse... includedFields) {
            return includedFields(List.of(includedFields));
        }
        public Builder rowsLimit(String rowsLimit) {
            this.rowsLimit = Objects.requireNonNull(rowsLimit);
            return this;
        }
        public Builder rowsLimitPercent(Integer rowsLimitPercent) {
            this.rowsLimitPercent = Objects.requireNonNull(rowsLimitPercent);
            return this;
        }
        public Builder sampleMethod(String sampleMethod) {
            this.sampleMethod = Objects.requireNonNull(sampleMethod);
            return this;
        }
        public Builder tableReference(GooglePrivacyDlpV2BigQueryTableResponse tableReference) {
            this.tableReference = Objects.requireNonNull(tableReference);
            return this;
        }        public GooglePrivacyDlpV2BigQueryOptionsResponse build() {
            return new GooglePrivacyDlpV2BigQueryOptionsResponse(excludedFields, identifyingFields, includedFields, rowsLimit, rowsLimitPercent, sampleMethod, tableReference);
        }
    }
}

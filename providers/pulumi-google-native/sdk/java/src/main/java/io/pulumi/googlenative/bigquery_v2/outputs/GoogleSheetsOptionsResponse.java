// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleSheetsOptionsResponse {
    /**
     * [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
     * 
     */
    private final String range;
    /**
     * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
     */
    private final String skipLeadingRows;

    @OutputCustomType.Constructor
    private GoogleSheetsOptionsResponse(
        @OutputCustomType.Parameter("range") String range,
        @OutputCustomType.Parameter("skipLeadingRows") String skipLeadingRows) {
        this.range = range;
        this.skipLeadingRows = skipLeadingRows;
    }

    /**
     * [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
     * 
    */
    public String getRange() {
        return this.range;
    }
    /**
     * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
    */
    public String getSkipLeadingRows() {
        return this.skipLeadingRows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleSheetsOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String range;
        private String skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleSheetsOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setRange(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder setSkipLeadingRows(String skipLeadingRows) {
            this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
            return this;
        }
        public GoogleSheetsOptionsResponse build() {
            return new GoogleSheetsOptionsResponse(range, skipLeadingRows);
        }
    }
}

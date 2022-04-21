// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GoogleSheetsOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleSheetsOptionsArgs Empty = new GoogleSheetsOptionsArgs();

    /**
     * [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
     * 
     */
    @Import(name="range")
    private @Nullable Output<String> range;

    public Optional<Output<String>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N &gt; 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
     */
    @Import(name="skipLeadingRows")
    private @Nullable Output<String> skipLeadingRows;

    public Optional<Output<String>> skipLeadingRows() {
        return Optional.ofNullable(this.skipLeadingRows);
    }

    private GoogleSheetsOptionsArgs() {}

    private GoogleSheetsOptionsArgs(GoogleSheetsOptionsArgs $) {
        this.range = $.range;
        this.skipLeadingRows = $.skipLeadingRows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleSheetsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleSheetsOptionsArgs $;

        public Builder() {
            $ = new GoogleSheetsOptionsArgs();
        }

        public Builder(GoogleSheetsOptionsArgs defaults) {
            $ = new GoogleSheetsOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder range(@Nullable Output<String> range) {
            $.range = range;
            return this;
        }

        public Builder range(String range) {
            return range(Output.of(range));
        }

        public Builder skipLeadingRows(@Nullable Output<String> skipLeadingRows) {
            $.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder skipLeadingRows(String skipLeadingRows) {
            return skipLeadingRows(Output.of(skipLeadingRows));
        }

        public GoogleSheetsOptionsArgs build() {
            return $;
        }
    }

}

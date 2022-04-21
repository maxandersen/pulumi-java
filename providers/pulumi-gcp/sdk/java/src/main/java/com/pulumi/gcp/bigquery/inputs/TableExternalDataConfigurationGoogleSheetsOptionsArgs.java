// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationGoogleSheetsOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationGoogleSheetsOptionsArgs Empty = new TableExternalDataConfigurationGoogleSheetsOptionsArgs();

    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
     */
    @Import(name="range")
    private @Nullable Output<String> range;

    public Optional<Output<String>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    @Import(name="skipLeadingRows")
    private @Nullable Output<Integer> skipLeadingRows;

    public Optional<Output<Integer>> skipLeadingRows() {
        return Optional.ofNullable(this.skipLeadingRows);
    }

    private TableExternalDataConfigurationGoogleSheetsOptionsArgs() {}

    private TableExternalDataConfigurationGoogleSheetsOptionsArgs(TableExternalDataConfigurationGoogleSheetsOptionsArgs $) {
        this.range = $.range;
        this.skipLeadingRows = $.skipLeadingRows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableExternalDataConfigurationGoogleSheetsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableExternalDataConfigurationGoogleSheetsOptionsArgs $;

        public Builder() {
            $ = new TableExternalDataConfigurationGoogleSheetsOptionsArgs();
        }

        public Builder(TableExternalDataConfigurationGoogleSheetsOptionsArgs defaults) {
            $ = new TableExternalDataConfigurationGoogleSheetsOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder range(@Nullable Output<String> range) {
            $.range = range;
            return this;
        }

        public Builder range(String range) {
            return range(Output.of(range));
        }

        public Builder skipLeadingRows(@Nullable Output<Integer> skipLeadingRows) {
            $.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder skipLeadingRows(Integer skipLeadingRows) {
            return skipLeadingRows(Output.of(skipLeadingRows));
        }

        public TableExternalDataConfigurationGoogleSheetsOptionsArgs build() {
            return $;
        }
    }

}

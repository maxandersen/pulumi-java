// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of dataset in the report.
 * 
 */
public final class ReportDatasetConfigurationArgs extends ResourceArgs {

    public static final ReportDatasetConfigurationArgs Empty = new ReportDatasetConfigurationArgs();

    /**
     * Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
     * 
     */
    @Import(name="columns")
    private @Nullable Output<List<String>> columns;

    /**
     * @return Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
     * 
     */
    public Optional<Output<List<String>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    private ReportDatasetConfigurationArgs() {}

    private ReportDatasetConfigurationArgs(ReportDatasetConfigurationArgs $) {
        this.columns = $.columns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportDatasetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDatasetConfigurationArgs $;

        public Builder() {
            $ = new ReportDatasetConfigurationArgs();
        }

        public Builder(ReportDatasetConfigurationArgs defaults) {
            $ = new ReportDatasetConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columns Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable Output<List<String>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<String> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
         * 
         * @return builder
         * 
         */
        public Builder columns(String... columns) {
            return columns(List.of(columns));
        }

        public ReportDatasetConfigurationArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.inputs.InsightsTableResultResponseColumns;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Query results for table insights query.
 * 
 */
public final class InsightsTableResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final InsightsTableResultResponse Empty = new InsightsTableResultResponse();

    /**
     * Columns Metadata of the table
     * 
     */
    @Import(name="columns")
    private @Nullable List<InsightsTableResultResponseColumns> columns;

    public Optional<List<InsightsTableResultResponseColumns>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * Rows data of the table
     * 
     */
    @Import(name="rows")
    private @Nullable List<List<String>> rows;

    public Optional<List<List<String>>> rows() {
        return Optional.ofNullable(this.rows);
    }

    private InsightsTableResultResponse() {}

    private InsightsTableResultResponse(InsightsTableResultResponse $) {
        this.columns = $.columns;
        this.rows = $.rows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightsTableResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightsTableResultResponse $;

        public Builder() {
            $ = new InsightsTableResultResponse();
        }

        public Builder(InsightsTableResultResponse defaults) {
            $ = new InsightsTableResultResponse(Objects.requireNonNull(defaults));
        }

        public Builder columns(@Nullable List<InsightsTableResultResponseColumns> columns) {
            $.columns = columns;
            return this;
        }

        public Builder columns(InsightsTableResultResponseColumns... columns) {
            return columns(List.of(columns));
        }

        public Builder rows(@Nullable List<List<String>> rows) {
            $.rows = rows;
            return this;
        }

        public Builder rows(List<String>... rows) {
            return rows(List.of(rows));
        }

        public InsightsTableResultResponse build() {
            return $;
        }
    }

}

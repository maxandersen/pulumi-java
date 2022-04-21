// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPermissionsTableWithColumns extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionsTableWithColumns Empty = new GetPermissionsTableWithColumns();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId", required=true)
    private String catalogId;

    public String catalogId() {
        return this.catalogId;
    }

    /**
     * Set of column names for the table. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    @Import(name="columnNames")
    private @Nullable List<String> columnNames;

    public Optional<List<String>> columnNames() {
        return Optional.ofNullable(this.columnNames);
    }

    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set of column names for the table to exclude. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    @Import(name="excludedColumnNames")
    private @Nullable List<String> excludedColumnNames;

    public Optional<List<String>> excludedColumnNames() {
        return Optional.ofNullable(this.excludedColumnNames);
    }

    /**
     * Name of the table resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    @Import(name="wildcard")
    private @Nullable Boolean wildcard;

    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    private GetPermissionsTableWithColumns() {}

    private GetPermissionsTableWithColumns(GetPermissionsTableWithColumns $) {
        this.catalogId = $.catalogId;
        this.columnNames = $.columnNames;
        this.databaseName = $.databaseName;
        this.excludedColumnNames = $.excludedColumnNames;
        this.name = $.name;
        this.wildcard = $.wildcard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionsTableWithColumns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionsTableWithColumns $;

        public Builder() {
            $ = new GetPermissionsTableWithColumns();
        }

        public Builder(GetPermissionsTableWithColumns defaults) {
            $ = new GetPermissionsTableWithColumns(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder columnNames(@Nullable List<String> columnNames) {
            $.columnNames = columnNames;
            return this;
        }

        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }

        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder excludedColumnNames(@Nullable List<String> excludedColumnNames) {
            $.excludedColumnNames = excludedColumnNames;
            return this;
        }

        public Builder excludedColumnNames(String... excludedColumnNames) {
            return excludedColumnNames(List.of(excludedColumnNames));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder wildcard(@Nullable Boolean wildcard) {
            $.wildcard = wildcard;
            return this;
        }

        public GetPermissionsTableWithColumns build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.azurenative.operationalinsights.inputs.ColumnResponse;
import com.pulumi.azurenative.operationalinsights.inputs.RestoredLogsResponse;
import com.pulumi.azurenative.operationalinsights.inputs.SearchResultsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Table&#39;s schema.
 * 
 */
public final class SchemaResponse extends com.pulumi.resources.InvokeArgs {

    public static final SchemaResponse Empty = new SchemaResponse();

    /**
     * Table category.
     * 
     */
    @Import(name="categories", required=true)
      private final List<String> categories;

    public List<String> categories() {
        return this.categories;
    }

    /**
     * A list of table custom columns.
     * 
     */
    @Import(name="columns")
      private final @Nullable List<ColumnResponse> columns;

    public List<ColumnResponse> columns() {
        return this.columns == null ? List.of() : this.columns;
    }

    /**
     * Table description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Table display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Table labels.
     * 
     */
    @Import(name="labels", required=true)
      private final List<String> labels;

    public List<String> labels() {
        return this.labels;
    }

    /**
     * Table name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Parameters of the restore operation that initiated this table.
     * 
     */
    @Import(name="restoredLogs", required=true)
      private final RestoredLogsResponse restoredLogs;

    public RestoredLogsResponse restoredLogs() {
        return this.restoredLogs;
    }

    /**
     * Parameters of the search job that initiated this table.
     * 
     */
    @Import(name="searchResults", required=true)
      private final SearchResultsResponse searchResults;

    public SearchResultsResponse searchResults() {
        return this.searchResults;
    }

    /**
     * List of solutions the table is affiliated with
     * 
     */
    @Import(name="solutions", required=true)
      private final List<String> solutions;

    public List<String> solutions() {
        return this.solutions;
    }

    /**
     * Table&#39;s creator.
     * 
     */
    @Import(name="source", required=true)
      private final String source;

    public String source() {
        return this.source;
    }

    /**
     * A list of table standard columns.
     * 
     */
    @Import(name="standardColumns", required=true)
      private final List<ColumnResponse> standardColumns;

    public List<ColumnResponse> standardColumns() {
        return this.standardColumns;
    }

    /**
     * The subtype describes what APIs can be used to interact with the table, and what features are available against it.
     * 
     */
    @Import(name="tableSubType", required=true)
      private final String tableSubType;

    public String tableSubType() {
        return this.tableSubType;
    }

    /**
     * Table&#39;s creator.
     * 
     */
    @Import(name="tableType", required=true)
      private final String tableType;

    public String tableType() {
        return this.tableType;
    }

    public SchemaResponse(
        List<String> categories,
        @Nullable List<ColumnResponse> columns,
        @Nullable String description,
        @Nullable String displayName,
        List<String> labels,
        @Nullable String name,
        RestoredLogsResponse restoredLogs,
        SearchResultsResponse searchResults,
        List<String> solutions,
        String source,
        List<ColumnResponse> standardColumns,
        String tableSubType,
        String tableType) {
        this.categories = Objects.requireNonNull(categories, "expected parameter 'categories' to be non-null");
        this.columns = columns;
        this.description = description;
        this.displayName = displayName;
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.name = name;
        this.restoredLogs = Objects.requireNonNull(restoredLogs, "expected parameter 'restoredLogs' to be non-null");
        this.searchResults = Objects.requireNonNull(searchResults, "expected parameter 'searchResults' to be non-null");
        this.solutions = Objects.requireNonNull(solutions, "expected parameter 'solutions' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.standardColumns = Objects.requireNonNull(standardColumns, "expected parameter 'standardColumns' to be non-null");
        this.tableSubType = Objects.requireNonNull(tableSubType, "expected parameter 'tableSubType' to be non-null");
        this.tableType = Objects.requireNonNull(tableType, "expected parameter 'tableType' to be non-null");
    }

    private SchemaResponse() {
        this.categories = List.of();
        this.columns = List.of();
        this.description = null;
        this.displayName = null;
        this.labels = List.of();
        this.name = null;
        this.restoredLogs = null;
        this.searchResults = null;
        this.solutions = List.of();
        this.source = null;
        this.standardColumns = List.of();
        this.tableSubType = null;
        this.tableType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> categories;
        private @Nullable List<ColumnResponse> columns;
        private @Nullable String description;
        private @Nullable String displayName;
        private List<String> labels;
        private @Nullable String name;
        private RestoredLogsResponse restoredLogs;
        private SearchResultsResponse searchResults;
        private List<String> solutions;
        private String source;
        private List<ColumnResponse> standardColumns;
        private String tableSubType;
        private String tableType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.columns = defaults.columns;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.restoredLogs = defaults.restoredLogs;
    	      this.searchResults = defaults.searchResults;
    	      this.solutions = defaults.solutions;
    	      this.source = defaults.source;
    	      this.standardColumns = defaults.standardColumns;
    	      this.tableSubType = defaults.tableSubType;
    	      this.tableType = defaults.tableType;
        }

        public Builder categories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder columns(@Nullable List<ColumnResponse> columns) {
            this.columns = columns;
            return this;
        }
        public Builder columns(ColumnResponse... columns) {
            return columns(List.of(columns));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder labels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder restoredLogs(RestoredLogsResponse restoredLogs) {
            this.restoredLogs = Objects.requireNonNull(restoredLogs);
            return this;
        }
        public Builder searchResults(SearchResultsResponse searchResults) {
            this.searchResults = Objects.requireNonNull(searchResults);
            return this;
        }
        public Builder solutions(List<String> solutions) {
            this.solutions = Objects.requireNonNull(solutions);
            return this;
        }
        public Builder solutions(String... solutions) {
            return solutions(List.of(solutions));
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder standardColumns(List<ColumnResponse> standardColumns) {
            this.standardColumns = Objects.requireNonNull(standardColumns);
            return this;
        }
        public Builder standardColumns(ColumnResponse... standardColumns) {
            return standardColumns(List.of(standardColumns));
        }
        public Builder tableSubType(String tableSubType) {
            this.tableSubType = Objects.requireNonNull(tableSubType);
            return this;
        }
        public Builder tableType(String tableType) {
            this.tableType = Objects.requireNonNull(tableType);
            return this;
        }        public SchemaResponse build() {
            return new SchemaResponse(categories, columns, description, displayName, labels, name, restoredLogs, searchResults, solutions, source, standardColumns, tableSubType, tableType);
        }
    }
}

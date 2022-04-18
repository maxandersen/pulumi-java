// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceColumnConfiguration {
    private final List<String> changeDetectingColumns;
    private final String documentDataColumnName;
    private final String documentIdColumnName;
    private final @Nullable String documentTitleColumnName;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    @CustomType.Constructor
    private DataSourceColumnConfiguration(
        @CustomType.Parameter("changeDetectingColumns") List<String> changeDetectingColumns,
        @CustomType.Parameter("documentDataColumnName") String documentDataColumnName,
        @CustomType.Parameter("documentIdColumnName") String documentIdColumnName,
        @CustomType.Parameter("documentTitleColumnName") @Nullable String documentTitleColumnName,
        @CustomType.Parameter("fieldMappings") @Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
        this.changeDetectingColumns = changeDetectingColumns;
        this.documentDataColumnName = documentDataColumnName;
        this.documentIdColumnName = documentIdColumnName;
        this.documentTitleColumnName = documentTitleColumnName;
        this.fieldMappings = fieldMappings;
    }

    public List<String> changeDetectingColumns() {
        return this.changeDetectingColumns;
    }
    public String documentDataColumnName() {
        return this.documentDataColumnName;
    }
    public String documentIdColumnName() {
        return this.documentIdColumnName;
    }
    public Optional<String> documentTitleColumnName() {
        return Optional.ofNullable(this.documentTitleColumnName);
    }
    public List<DataSourceToIndexFieldMapping> fieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceColumnConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> changeDetectingColumns;
        private String documentDataColumnName;
        private String documentIdColumnName;
        private @Nullable String documentTitleColumnName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceColumnConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeDetectingColumns = defaults.changeDetectingColumns;
    	      this.documentDataColumnName = defaults.documentDataColumnName;
    	      this.documentIdColumnName = defaults.documentIdColumnName;
    	      this.documentTitleColumnName = defaults.documentTitleColumnName;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder changeDetectingColumns(List<String> changeDetectingColumns) {
            this.changeDetectingColumns = Objects.requireNonNull(changeDetectingColumns);
            return this;
        }
        public Builder changeDetectingColumns(String... changeDetectingColumns) {
            return changeDetectingColumns(List.of(changeDetectingColumns));
        }
        public Builder documentDataColumnName(String documentDataColumnName) {
            this.documentDataColumnName = Objects.requireNonNull(documentDataColumnName);
            return this;
        }
        public Builder documentIdColumnName(String documentIdColumnName) {
            this.documentIdColumnName = Objects.requireNonNull(documentIdColumnName);
            return this;
        }
        public Builder documentTitleColumnName(@Nullable String documentTitleColumnName) {
            this.documentTitleColumnName = documentTitleColumnName;
            return this;
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }        public DataSourceColumnConfiguration build() {
            return new DataSourceColumnConfiguration(changeDetectingColumns, documentDataColumnName, documentIdColumnName, documentTitleColumnName, fieldMappings);
        }
    }
}

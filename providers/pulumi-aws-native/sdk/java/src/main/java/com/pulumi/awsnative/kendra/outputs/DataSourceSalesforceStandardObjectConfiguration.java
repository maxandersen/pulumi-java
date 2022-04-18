// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.awsnative.kendra.enums.DataSourceSalesforceStandardObjectName;
import com.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceSalesforceStandardObjectConfiguration {
    private final String documentDataFieldName;
    private final @Nullable String documentTitleFieldName;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
    private final DataSourceSalesforceStandardObjectName name;

    @CustomType.Constructor
    private DataSourceSalesforceStandardObjectConfiguration(
        @CustomType.Parameter("documentDataFieldName") String documentDataFieldName,
        @CustomType.Parameter("documentTitleFieldName") @Nullable String documentTitleFieldName,
        @CustomType.Parameter("fieldMappings") @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @CustomType.Parameter("name") DataSourceSalesforceStandardObjectName name) {
        this.documentDataFieldName = documentDataFieldName;
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
        this.name = name;
    }

    public String documentDataFieldName() {
        return this.documentDataFieldName;
    }
    public Optional<String> documentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }
    public List<DataSourceToIndexFieldMapping> fieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }
    public DataSourceSalesforceStandardObjectName name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceStandardObjectConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentDataFieldName;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private DataSourceSalesforceStandardObjectName name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceStandardObjectConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.name = defaults.name;
        }

        public Builder documentDataFieldName(String documentDataFieldName) {
            this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
            return this;
        }
        public Builder documentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }
        public Builder name(DataSourceSalesforceStandardObjectName name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public DataSourceSalesforceStandardObjectConfiguration build() {
            return new DataSourceSalesforceStandardObjectConfiguration(documentDataFieldName, documentTitleFieldName, fieldMappings, name);
        }
    }
}

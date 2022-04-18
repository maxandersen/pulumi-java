// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceToIndexFieldMapping extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceToIndexFieldMapping Empty = new DataSourceToIndexFieldMapping();

    @Import(name="dataSourceFieldName", required=true)
      private final String dataSourceFieldName;

    public String dataSourceFieldName() {
        return this.dataSourceFieldName;
    }

    @Import(name="dateFieldFormat")
      private final @Nullable String dateFieldFormat;

    public Optional<String> dateFieldFormat() {
        return this.dateFieldFormat == null ? Optional.empty() : Optional.ofNullable(this.dateFieldFormat);
    }

    @Import(name="indexFieldName", required=true)
      private final String indexFieldName;

    public String indexFieldName() {
        return this.indexFieldName;
    }

    public DataSourceToIndexFieldMapping(
        String dataSourceFieldName,
        @Nullable String dateFieldFormat,
        String indexFieldName) {
        this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName, "expected parameter 'dataSourceFieldName' to be non-null");
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = Objects.requireNonNull(indexFieldName, "expected parameter 'indexFieldName' to be non-null");
    }

    private DataSourceToIndexFieldMapping() {
        this.dataSourceFieldName = null;
        this.dateFieldFormat = null;
        this.indexFieldName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceToIndexFieldMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSourceFieldName;
        private @Nullable String dateFieldFormat;
        private String indexFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceToIndexFieldMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceFieldName = defaults.dataSourceFieldName;
    	      this.dateFieldFormat = defaults.dateFieldFormat;
    	      this.indexFieldName = defaults.indexFieldName;
        }

        public Builder dataSourceFieldName(String dataSourceFieldName) {
            this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName);
            return this;
        }
        public Builder dateFieldFormat(@Nullable String dateFieldFormat) {
            this.dateFieldFormat = dateFieldFormat;
            return this;
        }
        public Builder indexFieldName(String indexFieldName) {
            this.indexFieldName = Objects.requireNonNull(indexFieldName);
            return this;
        }        public DataSourceToIndexFieldMapping build() {
            return new DataSourceToIndexFieldMapping(dataSourceFieldName, dateFieldFormat, indexFieldName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.awsnative.kendra.enums.DataSourceConfluenceAttachmentFieldName;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceConfluenceAttachmentToIndexFieldMapping {
    private final DataSourceConfluenceAttachmentFieldName dataSourceFieldName;
    private final @Nullable String dateFieldFormat;
    private final String indexFieldName;

    @CustomType.Constructor
    private DataSourceConfluenceAttachmentToIndexFieldMapping(
        @CustomType.Parameter("dataSourceFieldName") DataSourceConfluenceAttachmentFieldName dataSourceFieldName,
        @CustomType.Parameter("dateFieldFormat") @Nullable String dateFieldFormat,
        @CustomType.Parameter("indexFieldName") String indexFieldName) {
        this.dataSourceFieldName = dataSourceFieldName;
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = indexFieldName;
    }

    public DataSourceConfluenceAttachmentFieldName dataSourceFieldName() {
        return this.dataSourceFieldName;
    }
    public Optional<String> dateFieldFormat() {
        return Optional.ofNullable(this.dateFieldFormat);
    }
    public String indexFieldName() {
        return this.indexFieldName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceAttachmentToIndexFieldMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluenceAttachmentFieldName dataSourceFieldName;
        private @Nullable String dateFieldFormat;
        private String indexFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceAttachmentToIndexFieldMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceFieldName = defaults.dataSourceFieldName;
    	      this.dateFieldFormat = defaults.dateFieldFormat;
    	      this.indexFieldName = defaults.indexFieldName;
        }

        public Builder dataSourceFieldName(DataSourceConfluenceAttachmentFieldName dataSourceFieldName) {
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
        }        public DataSourceConfluenceAttachmentToIndexFieldMapping build() {
            return new DataSourceConfluenceAttachmentToIndexFieldMapping(dataSourceFieldName, dateFieldFormat, indexFieldName);
        }
    }
}

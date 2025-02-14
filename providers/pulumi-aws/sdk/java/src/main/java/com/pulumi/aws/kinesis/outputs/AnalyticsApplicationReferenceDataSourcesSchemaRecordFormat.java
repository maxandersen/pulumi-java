// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
    /**
     * @return The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters mappingParameters;
    /**
     * @return The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    private final @Nullable String recordFormatType;

    @CustomType.Constructor
    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat(
        @CustomType.Parameter("mappingParameters") @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters mappingParameters,
        @CustomType.Parameter("recordFormatType") @Nullable String recordFormatType) {
        this.mappingParameters = mappingParameters;
        this.recordFormatType = recordFormatType;
    }

    /**
     * @return The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    public Optional<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters> mappingParameters() {
        return Optional.ofNullable(this.mappingParameters);
    }
    /**
     * @return The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    public Optional<String> recordFormatType() {
        return Optional.ofNullable(this.recordFormatType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters mappingParameters;
        private @Nullable String recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappingParameters = defaults.mappingParameters;
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder mappingParameters(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters mappingParameters) {
            this.mappingParameters = mappingParameters;
            return this;
        }
        public Builder recordFormatType(@Nullable String recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat(mappingParameters, recordFormatType);
        }
    }
}

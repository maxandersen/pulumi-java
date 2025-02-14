// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataplex_v1.outputs.GoogleCloudDataplexV1StorageFormatCsvOptionsResponse;
import com.pulumi.googlenative.dataplex_v1.outputs.GoogleCloudDataplexV1StorageFormatJsonOptionsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1StorageFormatResponse {
    /**
     * @return Optional. The compression type associated with the stored data. If unspecified, the data is uncompressed.
     * 
     */
    private final String compressionFormat;
    /**
     * @return Optional. Additional information about CSV formatted data.
     * 
     */
    private final GoogleCloudDataplexV1StorageFormatCsvOptionsResponse csv;
    /**
     * @return The data format associated with the stored data, which represents content type values. The value is inferred from mime type.
     * 
     */
    private final String format;
    /**
     * @return Optional. Additional information about CSV formatted data.
     * 
     */
    private final GoogleCloudDataplexV1StorageFormatJsonOptionsResponse json;
    /**
     * @return The mime type descriptor for the data. Must match the pattern {type}/{subtype}. Supported values: application/x-parquet application/x-avro application/x-orc application/x-tfrecord application/json application/{subtypes} text/csv text/ image/{image subtype} video/{video subtype} audio/{audio subtype}
     * 
     */
    private final String mimeType;

    @CustomType.Constructor
    private GoogleCloudDataplexV1StorageFormatResponse(
        @CustomType.Parameter("compressionFormat") String compressionFormat,
        @CustomType.Parameter("csv") GoogleCloudDataplexV1StorageFormatCsvOptionsResponse csv,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("json") GoogleCloudDataplexV1StorageFormatJsonOptionsResponse json,
        @CustomType.Parameter("mimeType") String mimeType) {
        this.compressionFormat = compressionFormat;
        this.csv = csv;
        this.format = format;
        this.json = json;
        this.mimeType = mimeType;
    }

    /**
     * @return Optional. The compression type associated with the stored data. If unspecified, the data is uncompressed.
     * 
     */
    public String compressionFormat() {
        return this.compressionFormat;
    }
    /**
     * @return Optional. Additional information about CSV formatted data.
     * 
     */
    public GoogleCloudDataplexV1StorageFormatCsvOptionsResponse csv() {
        return this.csv;
    }
    /**
     * @return The data format associated with the stored data, which represents content type values. The value is inferred from mime type.
     * 
     */
    public String format() {
        return this.format;
    }
    /**
     * @return Optional. Additional information about CSV formatted data.
     * 
     */
    public GoogleCloudDataplexV1StorageFormatJsonOptionsResponse json() {
        return this.json;
    }
    /**
     * @return The mime type descriptor for the data. Must match the pattern {type}/{subtype}. Supported values: application/x-parquet application/x-avro application/x-orc application/x-tfrecord application/json application/{subtypes} text/csv text/ image/{image subtype} video/{video subtype} audio/{audio subtype}
     * 
     */
    public String mimeType() {
        return this.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1StorageFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compressionFormat;
        private GoogleCloudDataplexV1StorageFormatCsvOptionsResponse csv;
        private String format;
        private GoogleCloudDataplexV1StorageFormatJsonOptionsResponse json;
        private String mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDataplexV1StorageFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.csv = defaults.csv;
    	      this.format = defaults.format;
    	      this.json = defaults.json;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder compressionFormat(String compressionFormat) {
            this.compressionFormat = Objects.requireNonNull(compressionFormat);
            return this;
        }
        public Builder csv(GoogleCloudDataplexV1StorageFormatCsvOptionsResponse csv) {
            this.csv = Objects.requireNonNull(csv);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder json(GoogleCloudDataplexV1StorageFormatJsonOptionsResponse json) {
            this.json = Objects.requireNonNull(json);
            return this;
        }
        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }        public GoogleCloudDataplexV1StorageFormatResponse build() {
            return new GoogleCloudDataplexV1StorageFormatResponse(compressionFormat, csv, format, json, mimeType);
        }
    }
}

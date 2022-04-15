// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.AvroSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.BlobReferenceInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.CsvSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.DiagnosticsResponse;
import io.pulumi.azurenative.streamanalytics.outputs.JsonSerializationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReferenceInputPropertiesResponse {
    /**
     * Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable BlobReferenceInputDataSourceResponse datasource;
    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    private final DiagnosticsResponse diagnostics;
    /**
     * The current entity tag for the input. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    private final String etag;
    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Object serialization;
    /**
     * Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Reference'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ReferenceInputPropertiesResponse(
        @CustomType.Parameter("datasource") @Nullable BlobReferenceInputDataSourceResponse datasource,
        @CustomType.Parameter("diagnostics") DiagnosticsResponse diagnostics,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("serialization") @Nullable Object serialization,
        @CustomType.Parameter("type") String type) {
        this.datasource = datasource;
        this.diagnostics = diagnostics;
        this.etag = etag;
        this.serialization = serialization;
        this.type = type;
    }

    /**
     * Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<BlobReferenceInputDataSourceResponse> datasource() {
        return Optional.ofNullable(this.datasource);
    }
    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
    */
    public DiagnosticsResponse diagnostics() {
        return this.diagnostics;
    }
    /**
     * The current entity tag for the input. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<Object> serialization() {
        return Optional.ofNullable(this.serialization);
    }
    /**
     * Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Reference'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceInputPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BlobReferenceInputDataSourceResponse datasource;
        private DiagnosticsResponse diagnostics;
        private String etag;
        private @Nullable Object serialization;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceInputPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.diagnostics = defaults.diagnostics;
    	      this.etag = defaults.etag;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder datasource(@Nullable BlobReferenceInputDataSourceResponse datasource) {
            this.datasource = datasource;
            return this;
        }
        public Builder diagnostics(DiagnosticsResponse diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder serialization(@Nullable Object serialization) {
            this.serialization = serialization;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ReferenceInputPropertiesResponse build() {
            return new ReferenceInputPropertiesResponse(datasource, diagnostics, etag, serialization, type);
        }
    }
}

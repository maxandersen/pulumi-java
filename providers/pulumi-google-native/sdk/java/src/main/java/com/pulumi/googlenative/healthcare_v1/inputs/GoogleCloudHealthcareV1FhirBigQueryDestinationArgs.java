// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.enums.GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition;
import com.pulumi.googlenative.healthcare_v1.inputs.SchemaConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for exporting to BigQuery.
 * 
 */
public final class GoogleCloudHealthcareV1FhirBigQueryDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudHealthcareV1FhirBigQueryDestinationArgs Empty = new GoogleCloudHealthcareV1FhirBigQueryDestinationArgs();

    /**
     * BigQuery URI to an existing dataset, up to 2000 characters long, in the format `bq://projectId.bqDatasetId`.
     * 
     */
    @Import(name="datasetUri")
    private @Nullable Output<String> datasetUri;

    public Optional<Output<String>> datasetUri() {
        return Optional.ofNullable(this.datasetUri);
    }

    /**
     * If this flag is `TRUE`, all tables are deleted from the dataset before the new exported tables are written. If the flag is not set and the destination dataset contains tables, the export call returns an error. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The configuration for the exported BigQuery schema.
     * 
     */
    @Import(name="schemaConfig")
    private @Nullable Output<SchemaConfigArgs> schemaConfig;

    public Optional<Output<SchemaConfigArgs>> schemaConfig() {
        return Optional.ofNullable(this.schemaConfig);
    }

    /**
     * Determines if existing data in the destination dataset is overwritten, appended to, or not written if the tables contain data. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    @Import(name="writeDisposition")
    private @Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition> writeDisposition;

    public Optional<Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition>> writeDisposition() {
        return Optional.ofNullable(this.writeDisposition);
    }

    private GoogleCloudHealthcareV1FhirBigQueryDestinationArgs() {}

    private GoogleCloudHealthcareV1FhirBigQueryDestinationArgs(GoogleCloudHealthcareV1FhirBigQueryDestinationArgs $) {
        this.datasetUri = $.datasetUri;
        this.force = $.force;
        this.schemaConfig = $.schemaConfig;
        this.writeDisposition = $.writeDisposition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudHealthcareV1FhirBigQueryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudHealthcareV1FhirBigQueryDestinationArgs $;

        public Builder() {
            $ = new GoogleCloudHealthcareV1FhirBigQueryDestinationArgs();
        }

        public Builder(GoogleCloudHealthcareV1FhirBigQueryDestinationArgs defaults) {
            $ = new GoogleCloudHealthcareV1FhirBigQueryDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetUri(@Nullable Output<String> datasetUri) {
            $.datasetUri = datasetUri;
            return this;
        }

        public Builder datasetUri(String datasetUri) {
            return datasetUri(Output.of(datasetUri));
        }

        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        public Builder schemaConfig(@Nullable Output<SchemaConfigArgs> schemaConfig) {
            $.schemaConfig = schemaConfig;
            return this;
        }

        public Builder schemaConfig(SchemaConfigArgs schemaConfig) {
            return schemaConfig(Output.of(schemaConfig));
        }

        public Builder writeDisposition(@Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition> writeDisposition) {
            $.writeDisposition = writeDisposition;
            return this;
        }

        public Builder writeDisposition(GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition writeDisposition) {
            return writeDisposition(Output.of(writeDisposition));
        }

        public GoogleCloudHealthcareV1FhirBigQueryDestinationArgs build() {
            return $;
        }
    }

}

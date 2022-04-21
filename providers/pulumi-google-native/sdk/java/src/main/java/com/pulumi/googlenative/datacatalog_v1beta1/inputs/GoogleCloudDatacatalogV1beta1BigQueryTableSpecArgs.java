// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1TableSpecArgs;
import com.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1ViewSpecArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a BigQuery table.
 * 
 */
public final class GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs Empty = new GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs();

    /**
     * Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
     * 
     */
    @Import(name="tableSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1beta1TableSpecArgs> tableSpec;

    public Optional<Output<GoogleCloudDatacatalogV1beta1TableSpecArgs>> tableSpec() {
        return Optional.ofNullable(this.tableSpec);
    }

    /**
     * Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
     * 
     */
    @Import(name="viewSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1beta1ViewSpecArgs> viewSpec;

    public Optional<Output<GoogleCloudDatacatalogV1beta1ViewSpecArgs>> viewSpec() {
        return Optional.ofNullable(this.viewSpec);
    }

    private GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs() {}

    private GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs(GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs $) {
        this.tableSpec = $.tableSpec;
        this.viewSpec = $.viewSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs();
        }

        public Builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs defaults) {
            $ = new GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder tableSpec(@Nullable Output<GoogleCloudDatacatalogV1beta1TableSpecArgs> tableSpec) {
            $.tableSpec = tableSpec;
            return this;
        }

        public Builder tableSpec(GoogleCloudDatacatalogV1beta1TableSpecArgs tableSpec) {
            return tableSpec(Output.of(tableSpec));
        }

        public Builder viewSpec(@Nullable Output<GoogleCloudDatacatalogV1beta1ViewSpecArgs> viewSpec) {
            $.viewSpec = viewSpec;
            return this;
        }

        public Builder viewSpec(GoogleCloudDatacatalogV1beta1ViewSpecArgs viewSpec) {
            return viewSpec(Output.of(viewSpec));
        }

        public GoogleCloudDatacatalogV1beta1BigQueryTableSpecArgs build() {
            return $;
        }
    }

}

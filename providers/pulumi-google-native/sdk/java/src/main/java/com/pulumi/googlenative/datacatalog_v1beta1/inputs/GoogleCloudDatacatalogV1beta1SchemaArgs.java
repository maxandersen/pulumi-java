// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1ColumnSchemaArgs;
import java.util.List;
import java.util.Objects;


/**
 * Represents a schema (e.g. BigQuery, GoogleSQL, Avro schema).
 * 
 */
public final class GoogleCloudDatacatalogV1beta1SchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1beta1SchemaArgs Empty = new GoogleCloudDatacatalogV1beta1SchemaArgs();

    /**
     * Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
     * 
     */
    @Import(name="columns", required=true)
    private Output<List<GoogleCloudDatacatalogV1beta1ColumnSchemaArgs>> columns;

    /**
     * @return Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
     * 
     */
    public Output<List<GoogleCloudDatacatalogV1beta1ColumnSchemaArgs>> columns() {
        return this.columns;
    }

    private GoogleCloudDatacatalogV1beta1SchemaArgs() {}

    private GoogleCloudDatacatalogV1beta1SchemaArgs(GoogleCloudDatacatalogV1beta1SchemaArgs $) {
        this.columns = $.columns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1beta1SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1beta1SchemaArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1beta1SchemaArgs();
        }

        public Builder(GoogleCloudDatacatalogV1beta1SchemaArgs defaults) {
            $ = new GoogleCloudDatacatalogV1beta1SchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columns Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
         * 
         * @return builder
         * 
         */
        public Builder columns(Output<List<GoogleCloudDatacatalogV1beta1ColumnSchemaArgs>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<GoogleCloudDatacatalogV1beta1ColumnSchemaArgs> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
         * 
         * @return builder
         * 
         */
        public Builder columns(GoogleCloudDatacatalogV1beta1ColumnSchemaArgs... columns) {
            return columns(List.of(columns));
        }

        public GoogleCloudDatacatalogV1beta1SchemaArgs build() {
            $.columns = Objects.requireNonNull($.columns, "expected parameter 'columns' to be non-null");
            return $;
        }
    }

}

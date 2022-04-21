// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FeatureGroupDataCatalogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureGroupDataCatalogConfigArgs Empty = new FeatureGroupDataCatalogConfigArgs();

    @Import(name="catalog", required=true)
    private Output<String> catalog;

    public Output<String> catalog() {
        return this.catalog;
    }

    @Import(name="database", required=true)
    private Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    @Import(name="tableName", required=true)
    private Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName;
    }

    private FeatureGroupDataCatalogConfigArgs() {}

    private FeatureGroupDataCatalogConfigArgs(FeatureGroupDataCatalogConfigArgs $) {
        this.catalog = $.catalog;
        this.database = $.database;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureGroupDataCatalogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureGroupDataCatalogConfigArgs $;

        public Builder() {
            $ = new FeatureGroupDataCatalogConfigArgs();
        }

        public Builder(FeatureGroupDataCatalogConfigArgs defaults) {
            $ = new FeatureGroupDataCatalogConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalog(Output<String> catalog) {
            $.catalog = catalog;
            return this;
        }

        public Builder catalog(String catalog) {
            return catalog(Output.of(catalog));
        }

        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public FeatureGroupDataCatalogConfigArgs build() {
            $.catalog = Objects.requireNonNull($.catalog, "expected parameter 'catalog' to be non-null");
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.DatasetS3Location;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetDataCatalogInputDefinition extends com.pulumi.resources.InvokeArgs {

    public static final DatasetDataCatalogInputDefinition Empty = new DatasetDataCatalogInputDefinition();

    /**
     * Catalog id
     * 
     */
    @Import(name="catalogId")
    private @Nullable String catalogId;

    public Optional<String> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Database name
     * 
     */
    @Import(name="databaseName")
    private @Nullable String databaseName;

    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * Table name
     * 
     */
    @Import(name="tableName")
    private @Nullable String tableName;

    public Optional<String> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    @Import(name="tempDirectory")
    private @Nullable DatasetS3Location tempDirectory;

    public Optional<DatasetS3Location> tempDirectory() {
        return Optional.ofNullable(this.tempDirectory);
    }

    private DatasetDataCatalogInputDefinition() {}

    private DatasetDataCatalogInputDefinition(DatasetDataCatalogInputDefinition $) {
        this.catalogId = $.catalogId;
        this.databaseName = $.databaseName;
        this.tableName = $.tableName;
        this.tempDirectory = $.tempDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetDataCatalogInputDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetDataCatalogInputDefinition $;

        public Builder() {
            $ = new DatasetDataCatalogInputDefinition();
        }

        public Builder(DatasetDataCatalogInputDefinition defaults) {
            $ = new DatasetDataCatalogInputDefinition(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(@Nullable String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder tableName(@Nullable String tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tempDirectory(@Nullable DatasetS3Location tempDirectory) {
            $.tempDirectory = tempDirectory;
            return this;
        }

        public DatasetDataCatalogInputDefinition build() {
            return $;
        }
    }

}

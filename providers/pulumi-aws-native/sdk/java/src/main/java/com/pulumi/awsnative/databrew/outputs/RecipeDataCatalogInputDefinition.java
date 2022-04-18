// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.awsnative.databrew.outputs.RecipeS3Location;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecipeDataCatalogInputDefinition {
    /**
     * Catalog id
     * 
     */
    private final @Nullable String catalogId;
    /**
     * Database name
     * 
     */
    private final @Nullable String databaseName;
    /**
     * Table name
     * 
     */
    private final @Nullable String tableName;
    private final @Nullable RecipeS3Location tempDirectory;

    @CustomType.Constructor
    private RecipeDataCatalogInputDefinition(
        @CustomType.Parameter("catalogId") @Nullable String catalogId,
        @CustomType.Parameter("databaseName") @Nullable String databaseName,
        @CustomType.Parameter("tableName") @Nullable String tableName,
        @CustomType.Parameter("tempDirectory") @Nullable RecipeS3Location tempDirectory) {
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.tempDirectory = tempDirectory;
    }

    /**
     * Catalog id
     * 
    */
    public Optional<String> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * Database name
     * 
    */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * Table name
     * 
    */
    public Optional<String> tableName() {
        return Optional.ofNullable(this.tableName);
    }
    public Optional<RecipeS3Location> tempDirectory() {
        return Optional.ofNullable(this.tempDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeDataCatalogInputDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable String databaseName;
        private @Nullable String tableName;
        private @Nullable RecipeS3Location tempDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeDataCatalogInputDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.tableName = defaults.tableName;
    	      this.tempDirectory = defaults.tempDirectory;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder tempDirectory(@Nullable RecipeS3Location tempDirectory) {
            this.tempDirectory = tempDirectory;
            return this;
        }        public RecipeDataCatalogInputDefinition build() {
            return new RecipeDataCatalogInputDefinition(catalogId, databaseName, tableName, tempDirectory);
        }
    }
}

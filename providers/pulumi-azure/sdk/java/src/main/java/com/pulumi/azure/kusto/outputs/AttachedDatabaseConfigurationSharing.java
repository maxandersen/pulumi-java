// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AttachedDatabaseConfigurationSharing {
    /**
     * @return List of external tables exclude from the follower database.
     * 
     */
    private final @Nullable List<String> externalTablesToExcludes;
    /**
     * @return List of external tables to include in the follower database.
     * 
     */
    private final @Nullable List<String> externalTablesToIncludes;
    /**
     * @return List of materialized views exclude from the follower database.
     * 
     */
    private final @Nullable List<String> materializedViewsToExcludes;
    /**
     * @return List of materialized views to include in the follower database.
     * 
     */
    private final @Nullable List<String> materializedViewsToIncludes;
    /**
     * @return List of tables to exclude from the follower database.
     * 
     */
    private final @Nullable List<String> tablesToExcludes;
    /**
     * @return List of tables to include in the follower database.
     * 
     */
    private final @Nullable List<String> tablesToIncludes;

    @CustomType.Constructor
    private AttachedDatabaseConfigurationSharing(
        @CustomType.Parameter("externalTablesToExcludes") @Nullable List<String> externalTablesToExcludes,
        @CustomType.Parameter("externalTablesToIncludes") @Nullable List<String> externalTablesToIncludes,
        @CustomType.Parameter("materializedViewsToExcludes") @Nullable List<String> materializedViewsToExcludes,
        @CustomType.Parameter("materializedViewsToIncludes") @Nullable List<String> materializedViewsToIncludes,
        @CustomType.Parameter("tablesToExcludes") @Nullable List<String> tablesToExcludes,
        @CustomType.Parameter("tablesToIncludes") @Nullable List<String> tablesToIncludes) {
        this.externalTablesToExcludes = externalTablesToExcludes;
        this.externalTablesToIncludes = externalTablesToIncludes;
        this.materializedViewsToExcludes = materializedViewsToExcludes;
        this.materializedViewsToIncludes = materializedViewsToIncludes;
        this.tablesToExcludes = tablesToExcludes;
        this.tablesToIncludes = tablesToIncludes;
    }

    /**
     * @return List of external tables exclude from the follower database.
     * 
     */
    public List<String> externalTablesToExcludes() {
        return this.externalTablesToExcludes == null ? List.of() : this.externalTablesToExcludes;
    }
    /**
     * @return List of external tables to include in the follower database.
     * 
     */
    public List<String> externalTablesToIncludes() {
        return this.externalTablesToIncludes == null ? List.of() : this.externalTablesToIncludes;
    }
    /**
     * @return List of materialized views exclude from the follower database.
     * 
     */
    public List<String> materializedViewsToExcludes() {
        return this.materializedViewsToExcludes == null ? List.of() : this.materializedViewsToExcludes;
    }
    /**
     * @return List of materialized views to include in the follower database.
     * 
     */
    public List<String> materializedViewsToIncludes() {
        return this.materializedViewsToIncludes == null ? List.of() : this.materializedViewsToIncludes;
    }
    /**
     * @return List of tables to exclude from the follower database.
     * 
     */
    public List<String> tablesToExcludes() {
        return this.tablesToExcludes == null ? List.of() : this.tablesToExcludes;
    }
    /**
     * @return List of tables to include in the follower database.
     * 
     */
    public List<String> tablesToIncludes() {
        return this.tablesToIncludes == null ? List.of() : this.tablesToIncludes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDatabaseConfigurationSharing defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> externalTablesToExcludes;
        private @Nullable List<String> externalTablesToIncludes;
        private @Nullable List<String> materializedViewsToExcludes;
        private @Nullable List<String> materializedViewsToIncludes;
        private @Nullable List<String> tablesToExcludes;
        private @Nullable List<String> tablesToIncludes;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDatabaseConfigurationSharing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalTablesToExcludes = defaults.externalTablesToExcludes;
    	      this.externalTablesToIncludes = defaults.externalTablesToIncludes;
    	      this.materializedViewsToExcludes = defaults.materializedViewsToExcludes;
    	      this.materializedViewsToIncludes = defaults.materializedViewsToIncludes;
    	      this.tablesToExcludes = defaults.tablesToExcludes;
    	      this.tablesToIncludes = defaults.tablesToIncludes;
        }

        public Builder externalTablesToExcludes(@Nullable List<String> externalTablesToExcludes) {
            this.externalTablesToExcludes = externalTablesToExcludes;
            return this;
        }
        public Builder externalTablesToExcludes(String... externalTablesToExcludes) {
            return externalTablesToExcludes(List.of(externalTablesToExcludes));
        }
        public Builder externalTablesToIncludes(@Nullable List<String> externalTablesToIncludes) {
            this.externalTablesToIncludes = externalTablesToIncludes;
            return this;
        }
        public Builder externalTablesToIncludes(String... externalTablesToIncludes) {
            return externalTablesToIncludes(List.of(externalTablesToIncludes));
        }
        public Builder materializedViewsToExcludes(@Nullable List<String> materializedViewsToExcludes) {
            this.materializedViewsToExcludes = materializedViewsToExcludes;
            return this;
        }
        public Builder materializedViewsToExcludes(String... materializedViewsToExcludes) {
            return materializedViewsToExcludes(List.of(materializedViewsToExcludes));
        }
        public Builder materializedViewsToIncludes(@Nullable List<String> materializedViewsToIncludes) {
            this.materializedViewsToIncludes = materializedViewsToIncludes;
            return this;
        }
        public Builder materializedViewsToIncludes(String... materializedViewsToIncludes) {
            return materializedViewsToIncludes(List.of(materializedViewsToIncludes));
        }
        public Builder tablesToExcludes(@Nullable List<String> tablesToExcludes) {
            this.tablesToExcludes = tablesToExcludes;
            return this;
        }
        public Builder tablesToExcludes(String... tablesToExcludes) {
            return tablesToExcludes(List.of(tablesToExcludes));
        }
        public Builder tablesToIncludes(@Nullable List<String> tablesToIncludes) {
            this.tablesToIncludes = tablesToIncludes;
            return this;
        }
        public Builder tablesToIncludes(String... tablesToIncludes) {
            return tablesToIncludes(List.of(tablesToIncludes));
        }        public AttachedDatabaseConfigurationSharing build() {
            return new AttachedDatabaseConfigurationSharing(externalTablesToExcludes, externalTablesToIncludes, materializedViewsToExcludes, materializedViewsToIncludes, tablesToExcludes, tablesToIncludes);
        }
    }
}

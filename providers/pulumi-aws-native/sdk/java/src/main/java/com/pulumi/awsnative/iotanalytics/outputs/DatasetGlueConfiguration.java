// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatasetGlueConfiguration {
    private final String databaseName;
    private final String tableName;

    @CustomType.Constructor
    private DatasetGlueConfiguration(
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("tableName") String tableName) {
        this.databaseName = databaseName;
        this.tableName = tableName;
    }

    public String databaseName() {
        return this.databaseName;
    }
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetGlueConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetGlueConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.tableName = defaults.tableName;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }        public DatasetGlueConfiguration build() {
            return new DatasetGlueConfiguration(databaseName, tableName);
        }
    }
}

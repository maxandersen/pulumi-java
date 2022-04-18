// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Sql Server database on the Cloud SQL instance.
 * 
 */
public final class SqlServerDatabaseDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlServerDatabaseDetailsResponse Empty = new SqlServerDatabaseDetailsResponse();

    /**
     * The version of SQL Server with which the database is to be made compatible
     * 
     */
    @Import(name="compatibilityLevel", required=true)
      private final Integer compatibilityLevel;

    public Integer compatibilityLevel() {
        return this.compatibilityLevel;
    }

    /**
     * The recovery model of a SQL Server database
     * 
     */
    @Import(name="recoveryModel", required=true)
      private final String recoveryModel;

    public String recoveryModel() {
        return this.recoveryModel;
    }

    public SqlServerDatabaseDetailsResponse(
        Integer compatibilityLevel,
        String recoveryModel) {
        this.compatibilityLevel = Objects.requireNonNull(compatibilityLevel, "expected parameter 'compatibilityLevel' to be non-null");
        this.recoveryModel = Objects.requireNonNull(recoveryModel, "expected parameter 'recoveryModel' to be non-null");
    }

    private SqlServerDatabaseDetailsResponse() {
        this.compatibilityLevel = null;
        this.recoveryModel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerDatabaseDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer compatibilityLevel;
        private String recoveryModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerDatabaseDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.recoveryModel = defaults.recoveryModel;
        }

        public Builder compatibilityLevel(Integer compatibilityLevel) {
            this.compatibilityLevel = Objects.requireNonNull(compatibilityLevel);
            return this;
        }
        public Builder recoveryModel(String recoveryModel) {
            this.recoveryModel = Objects.requireNonNull(recoveryModel);
            return this;
        }        public SqlServerDatabaseDetailsResponse build() {
            return new SqlServerDatabaseDetailsResponse(compatibilityLevel, recoveryModel);
        }
    }
}

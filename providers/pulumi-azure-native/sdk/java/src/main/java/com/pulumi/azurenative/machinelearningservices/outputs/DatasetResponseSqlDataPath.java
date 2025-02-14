// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatasetResponseSqlDataPath {
    /**
     * @return SQL query timeout. Unit in seconds.
     * 
     */
    private final Double queryTimeout;
    /**
     * @return SQL query
     * 
     */
    private final String sqlQuery;
    /**
     * @return SQL storedProcedure name
     * 
     */
    private final String sqlStoredProcedureName;
    /**
     * @return SQL table name
     * 
     */
    private final String sqlTableName;

    @CustomType.Constructor
    private DatasetResponseSqlDataPath(
        @CustomType.Parameter("queryTimeout") Double queryTimeout,
        @CustomType.Parameter("sqlQuery") String sqlQuery,
        @CustomType.Parameter("sqlStoredProcedureName") String sqlStoredProcedureName,
        @CustomType.Parameter("sqlTableName") String sqlTableName) {
        this.queryTimeout = queryTimeout;
        this.sqlQuery = sqlQuery;
        this.sqlStoredProcedureName = sqlStoredProcedureName;
        this.sqlTableName = sqlTableName;
    }

    /**
     * @return SQL query timeout. Unit in seconds.
     * 
     */
    public Double queryTimeout() {
        return this.queryTimeout;
    }
    /**
     * @return SQL query
     * 
     */
    public String sqlQuery() {
        return this.sqlQuery;
    }
    /**
     * @return SQL storedProcedure name
     * 
     */
    public String sqlStoredProcedureName() {
        return this.sqlStoredProcedureName;
    }
    /**
     * @return SQL table name
     * 
     */
    public String sqlTableName() {
        return this.sqlTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponseSqlDataPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double queryTimeout;
        private String sqlQuery;
        private String sqlStoredProcedureName;
        private String sqlTableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponseSqlDataPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sqlQuery = defaults.sqlQuery;
    	      this.sqlStoredProcedureName = defaults.sqlStoredProcedureName;
    	      this.sqlTableName = defaults.sqlTableName;
        }

        public Builder queryTimeout(Double queryTimeout) {
            this.queryTimeout = Objects.requireNonNull(queryTimeout);
            return this;
        }
        public Builder sqlQuery(String sqlQuery) {
            this.sqlQuery = Objects.requireNonNull(sqlQuery);
            return this;
        }
        public Builder sqlStoredProcedureName(String sqlStoredProcedureName) {
            this.sqlStoredProcedureName = Objects.requireNonNull(sqlStoredProcedureName);
            return this;
        }
        public Builder sqlTableName(String sqlTableName) {
            this.sqlTableName = Objects.requireNonNull(sqlTableName);
            return this;
        }        public DatasetResponseSqlDataPath build() {
            return new DatasetResponseSqlDataPath(queryTimeout, sqlQuery, sqlStoredProcedureName, sqlTableName);
        }
    }
}

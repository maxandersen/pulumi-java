// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SqlPartitionSettingsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity SQL Data Warehouse source.
 * 
 */
public final class SqlDWSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlDWSourceResponse Empty = new SqlDWSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Object additionalColumns;

    public Optional<Object> additionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
     * 
     */
    @Import(name="partitionOption")
      private final @Nullable Object partitionOption;

    public Optional<Object> partitionOption() {
        return this.partitionOption == null ? Optional.empty() : Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    @Import(name="partitionSettings")
      private final @Nullable SqlPartitionSettingsResponse partitionSettings;

    public Optional<SqlPartitionSettingsResponse> partitionSettings() {
        return this.partitionSettings == null ? Optional.empty() : Optional.ofNullable(this.partitionSettings);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
      private final @Nullable Object queryTimeout;

    public Optional<Object> queryTimeout() {
        return this.queryTimeout == null ? Optional.empty() : Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Object sourceRetryCount;

    public Optional<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Object sourceRetryWait;

    public Optional<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * SQL Data Warehouse reader query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderQuery")
      private final @Nullable Object sqlReaderQuery;

    public Optional<Object> sqlReaderQuery() {
        return this.sqlReaderQuery == null ? Optional.empty() : Optional.ofNullable(this.sqlReaderQuery);
    }

    /**
     * Name of the stored procedure for a SQL Data Warehouse source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderStoredProcedureName")
      private final @Nullable Object sqlReaderStoredProcedureName;

    public Optional<Object> sqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName == null ? Optional.empty() : Optional.ofNullable(this.sqlReaderStoredProcedureName);
    }

    /**
     * Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;. Type: object (or Expression with resultType object), itemType: StoredProcedureParameter.
     * 
     */
    @Import(name="storedProcedureParameters")
      private final @Nullable Object storedProcedureParameters;

    public Optional<Object> storedProcedureParameters() {
        return this.storedProcedureParameters == null ? Optional.empty() : Optional.ofNullable(this.storedProcedureParameters);
    }

    /**
     * Copy source type.
     * Expected value is &#39;SqlDWSource&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SqlDWSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object partitionOption,
        @Nullable SqlPartitionSettingsResponse partitionSettings,
        @Nullable Object queryTimeout,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        @Nullable Object sqlReaderQuery,
        @Nullable Object sqlReaderStoredProcedureName,
        @Nullable Object storedProcedureParameters,
        String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.sqlReaderQuery = sqlReaderQuery;
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        this.storedProcedureParameters = storedProcedureParameters;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private SqlDWSourceResponse() {
        this.additionalColumns = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.partitionOption = null;
        this.partitionSettings = null;
        this.queryTimeout = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.sqlReaderQuery = null;
        this.sqlReaderStoredProcedureName = null;
        this.storedProcedureParameters = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object partitionOption;
        private @Nullable SqlPartitionSettingsResponse partitionSettings;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object sqlReaderQuery;
        private @Nullable Object sqlReaderStoredProcedureName;
        private @Nullable Object storedProcedureParameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.sqlReaderQuery = defaults.sqlReaderQuery;
    	      this.sqlReaderStoredProcedureName = defaults.sqlReaderStoredProcedureName;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }
        public Builder partitionSettings(@Nullable SqlPartitionSettingsResponse partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sqlReaderQuery(@Nullable Object sqlReaderQuery) {
            this.sqlReaderQuery = sqlReaderQuery;
            return this;
        }
        public Builder sqlReaderStoredProcedureName(@Nullable Object sqlReaderStoredProcedureName) {
            this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }
        public Builder storedProcedureParameters(@Nullable Object storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SqlDWSourceResponse build() {
            return new SqlDWSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, queryTimeout, sourceRetryCount, sourceRetryWait, sqlReaderQuery, sqlReaderStoredProcedureName, storedProcedureParameters, type);
        }
    }
}

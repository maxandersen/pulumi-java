// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.CassandraSourceReadConsistencyLevels;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity source for a Cassandra database.
 * 
 */
public final class CassandraSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CassandraSourceArgs Empty = new CassandraSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Output<Object> additionalColumns;

    public Output<Object> additionalColumns() {
        return this.additionalColumns == null ? Codegen.empty() : this.additionalColumns;
    }

    /**
     * The consistency level specifies how many Cassandra servers must respond to a read request before returning data to the client application. Cassandra checks the specified number of Cassandra servers for data to satisfy the read request. Must be one of cassandraSourceReadConsistencyLevels. The default value is &#39;ONE&#39;. It is case-insensitive.
     * 
     */
    @Import(name="consistencyLevel")
      private final @Nullable Output<Either<String,CassandraSourceReadConsistencyLevels>> consistencyLevel;

    public Output<Either<String,CassandraSourceReadConsistencyLevels>> consistencyLevel() {
        return this.consistencyLevel == null ? Codegen.empty() : this.consistencyLevel;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * Database query. Should be a SQL-92 query expression or Cassandra Query Language (CQL) command. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
      private final @Nullable Output<Object> query;

    public Output<Object> query() {
        return this.query == null ? Codegen.empty() : this.query;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
      private final @Nullable Output<Object> queryTimeout;

    public Output<Object> queryTimeout() {
        return this.queryTimeout == null ? Codegen.empty() : this.queryTimeout;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Codegen.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Codegen.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is &#39;CassandraSource&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public CassandraSourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Either<String,CassandraSourceReadConsistencyLevels>> consistencyLevel,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> query,
        @Nullable Output<Object> queryTimeout,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.consistencyLevel = consistencyLevel;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.query = query;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private CassandraSourceArgs() {
        this.additionalColumns = Codegen.empty();
        this.consistencyLevel = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.query = Codegen.empty();
        this.queryTimeout = Codegen.empty();
        this.sourceRetryCount = Codegen.empty();
        this.sourceRetryWait = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Either<String,CassandraSourceReadConsistencyLevels>> consistencyLevel;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> query;
        private @Nullable Output<Object> queryTimeout;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.consistencyLevel = defaults.consistencyLevel;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.query = defaults.query;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Codegen.ofNullable(additionalColumns);
            return this;
        }
        public Builder consistencyLevel(@Nullable Output<Either<String,CassandraSourceReadConsistencyLevels>> consistencyLevel) {
            this.consistencyLevel = consistencyLevel;
            return this;
        }
        public Builder consistencyLevel(@Nullable Either<String,CassandraSourceReadConsistencyLevels> consistencyLevel) {
            this.consistencyLevel = Codegen.ofNullable(consistencyLevel);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder query(@Nullable Output<Object> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable Object query) {
            this.query = Codegen.ofNullable(query);
            return this;
        }
        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Codegen.ofNullable(queryTimeout);
            return this;
        }
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Codegen.ofNullable(sourceRetryCount);
            return this;
        }
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Codegen.ofNullable(sourceRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public CassandraSourceArgs build() {
            return new CassandraSourceArgs(additionalColumns, consistencyLevel, disableMetricsCollection, maxConcurrentConnections, query, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}

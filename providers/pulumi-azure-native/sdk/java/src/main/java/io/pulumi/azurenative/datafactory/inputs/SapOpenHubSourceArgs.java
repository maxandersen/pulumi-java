// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP Business Warehouse Open Hub Destination source.
 * 
 */
public final class SapOpenHubSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapOpenHubSourceArgs Empty = new SapOpenHubSourceArgs();

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
     * The ID of request for delta loading. Once it is set, only data with requestId larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression with resultType integer ).
     * 
     */
    @Import(name="baseRequestId")
      private final @Nullable Output<Object> baseRequestId;

    public Output<Object> baseRequestId() {
        return this.baseRequestId == null ? Codegen.empty() : this.baseRequestId;
    }

    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="customRfcReadTableFunctionModule")
      private final @Nullable Output<Object> customRfcReadTableFunctionModule;

    public Output<Object> customRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule == null ? Codegen.empty() : this.customRfcReadTableFunctionModule;
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
     * Whether to exclude the records of the last request. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="excludeLastRequest")
      private final @Nullable Output<Object> excludeLastRequest;

    public Output<Object> excludeLastRequest() {
        return this.excludeLastRequest == null ? Codegen.empty() : this.excludeLastRequest;
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
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
      private final @Nullable Output<Object> queryTimeout;

    public Output<Object> queryTimeout() {
        return this.queryTimeout == null ? Codegen.empty() : this.queryTimeout;
    }

    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sapDataColumnDelimiter")
      private final @Nullable Output<Object> sapDataColumnDelimiter;

    public Output<Object> sapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter == null ? Codegen.empty() : this.sapDataColumnDelimiter;
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
     * Expected value is 'SapOpenHubSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public SapOpenHubSourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Object> baseRequestId,
        @Nullable Output<Object> customRfcReadTableFunctionModule,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> excludeLastRequest,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> queryTimeout,
        @Nullable Output<Object> sapDataColumnDelimiter,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.baseRequestId = baseRequestId;
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        this.disableMetricsCollection = disableMetricsCollection;
        this.excludeLastRequest = excludeLastRequest;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.queryTimeout = queryTimeout;
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapOpenHubSourceArgs() {
        this.additionalColumns = Codegen.empty();
        this.baseRequestId = Codegen.empty();
        this.customRfcReadTableFunctionModule = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.excludeLastRequest = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.queryTimeout = Codegen.empty();
        this.sapDataColumnDelimiter = Codegen.empty();
        this.sourceRetryCount = Codegen.empty();
        this.sourceRetryWait = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapOpenHubSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Object> baseRequestId;
        private @Nullable Output<Object> customRfcReadTableFunctionModule;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> excludeLastRequest;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> queryTimeout;
        private @Nullable Output<Object> sapDataColumnDelimiter;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapOpenHubSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.baseRequestId = defaults.baseRequestId;
    	      this.customRfcReadTableFunctionModule = defaults.customRfcReadTableFunctionModule;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.excludeLastRequest = defaults.excludeLastRequest;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sapDataColumnDelimiter = defaults.sapDataColumnDelimiter;
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
        public Builder baseRequestId(@Nullable Output<Object> baseRequestId) {
            this.baseRequestId = baseRequestId;
            return this;
        }
        public Builder baseRequestId(@Nullable Object baseRequestId) {
            this.baseRequestId = Codegen.ofNullable(baseRequestId);
            return this;
        }
        public Builder customRfcReadTableFunctionModule(@Nullable Output<Object> customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }
        public Builder customRfcReadTableFunctionModule(@Nullable Object customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = Codegen.ofNullable(customRfcReadTableFunctionModule);
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
        public Builder excludeLastRequest(@Nullable Output<Object> excludeLastRequest) {
            this.excludeLastRequest = excludeLastRequest;
            return this;
        }
        public Builder excludeLastRequest(@Nullable Object excludeLastRequest) {
            this.excludeLastRequest = Codegen.ofNullable(excludeLastRequest);
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
        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Codegen.ofNullable(queryTimeout);
            return this;
        }
        public Builder sapDataColumnDelimiter(@Nullable Output<Object> sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }
        public Builder sapDataColumnDelimiter(@Nullable Object sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = Codegen.ofNullable(sapDataColumnDelimiter);
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
        }        public SapOpenHubSourceArgs build() {
            return new SapOpenHubSourceArgs(additionalColumns, baseRequestId, customRfcReadTableFunctionModule, disableMetricsCollection, excludeLastRequest, maxConcurrentConnections, queryTimeout, sapDataColumnDelimiter, sourceRetryCount, sourceRetryWait, type);
        }
    }
}

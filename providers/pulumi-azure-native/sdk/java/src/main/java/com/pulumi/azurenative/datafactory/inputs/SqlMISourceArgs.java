// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SqlPartitionSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure SQL Managed Instance source.
 * 
 */
public final class SqlMISourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlMISourceArgs Empty = new SqlMISourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Output<Object> additionalColumns;

    public Optional<Output<Object>> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
     * 
     */
    @Import(name="partitionOption")
    private @Nullable Output<Object> partitionOption;

    public Optional<Output<Object>> partitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    @Import(name="partitionSettings")
    private @Nullable Output<SqlPartitionSettingsArgs> partitionSettings;

    public Optional<Output<SqlPartitionSettingsArgs>> partitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }

    /**
     * Which additional types to produce.
     * 
     */
    @Import(name="produceAdditionalTypes")
    private @Nullable Output<Object> produceAdditionalTypes;

    public Optional<Output<Object>> produceAdditionalTypes() {
        return Optional.ofNullable(this.produceAdditionalTypes);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Output<Object> queryTimeout;

    public Optional<Output<Object>> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderQuery")
    private @Nullable Output<Object> sqlReaderQuery;

    public Optional<Output<Object>> sqlReaderQuery() {
        return Optional.ofNullable(this.sqlReaderQuery);
    }

    /**
     * Name of the stored procedure for a Azure SQL Managed Instance source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderStoredProcedureName")
    private @Nullable Output<Object> sqlReaderStoredProcedureName;

    public Optional<Output<Object>> sqlReaderStoredProcedureName() {
        return Optional.ofNullable(this.sqlReaderStoredProcedureName);
    }

    /**
     * Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
     * 
     */
    @Import(name="storedProcedureParameters")
    private @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    public Optional<Output<Map<String,StoredProcedureParameterArgs>>> storedProcedureParameters() {
        return Optional.ofNullable(this.storedProcedureParameters);
    }

    /**
     * Copy source type.
     * Expected value is &#39;SqlMISource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private SqlMISourceArgs() {}

    private SqlMISourceArgs(SqlMISourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.partitionOption = $.partitionOption;
        this.partitionSettings = $.partitionSettings;
        this.produceAdditionalTypes = $.produceAdditionalTypes;
        this.queryTimeout = $.queryTimeout;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.sqlReaderQuery = $.sqlReaderQuery;
        this.sqlReaderStoredProcedureName = $.sqlReaderStoredProcedureName;
        this.storedProcedureParameters = $.storedProcedureParameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlMISourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlMISourceArgs $;

        public Builder() {
            $ = new SqlMISourceArgs();
        }

        public Builder(SqlMISourceArgs defaults) {
            $ = new SqlMISourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        public Builder partitionOption(@Nullable Output<Object> partitionOption) {
            $.partitionOption = partitionOption;
            return this;
        }

        public Builder partitionOption(Object partitionOption) {
            return partitionOption(Output.of(partitionOption));
        }

        public Builder partitionSettings(@Nullable Output<SqlPartitionSettingsArgs> partitionSettings) {
            $.partitionSettings = partitionSettings;
            return this;
        }

        public Builder partitionSettings(SqlPartitionSettingsArgs partitionSettings) {
            return partitionSettings(Output.of(partitionSettings));
        }

        public Builder produceAdditionalTypes(@Nullable Output<Object> produceAdditionalTypes) {
            $.produceAdditionalTypes = produceAdditionalTypes;
            return this;
        }

        public Builder produceAdditionalTypes(Object produceAdditionalTypes) {
            return produceAdditionalTypes(Output.of(produceAdditionalTypes));
        }

        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        public Builder queryTimeout(Object queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        public Builder sqlReaderQuery(@Nullable Output<Object> sqlReaderQuery) {
            $.sqlReaderQuery = sqlReaderQuery;
            return this;
        }

        public Builder sqlReaderQuery(Object sqlReaderQuery) {
            return sqlReaderQuery(Output.of(sqlReaderQuery));
        }

        public Builder sqlReaderStoredProcedureName(@Nullable Output<Object> sqlReaderStoredProcedureName) {
            $.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }

        public Builder sqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
            return sqlReaderStoredProcedureName(Output.of(sqlReaderStoredProcedureName));
        }

        public Builder storedProcedureParameters(@Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            $.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder storedProcedureParameters(Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            return storedProcedureParameters(Output.of(storedProcedureParameters));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SqlMISourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}

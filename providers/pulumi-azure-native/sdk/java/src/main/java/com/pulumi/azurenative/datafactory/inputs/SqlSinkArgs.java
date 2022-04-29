// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SqlUpsertSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity SQL sink.
 * 
 */
public final class SqlSinkArgs extends ResourceArgs {

    public static final SqlSinkArgs Empty = new SqlSinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
    private @Nullable Output<Object> preCopyScript;

    /**
     * @return SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> preCopyScript() {
        return Optional.ofNullable(this.preCopyScript);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Output<Object> sinkRetryCount;

    /**
     * @return Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Output<Object> sinkRetryWait;

    /**
     * @return Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterStoredProcedureName")
    private @Nullable Output<Object> sqlWriterStoredProcedureName;

    /**
     * @return SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sqlWriterStoredProcedureName() {
        return Optional.ofNullable(this.sqlWriterStoredProcedureName);
    }

    /**
     * SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterTableType")
    private @Nullable Output<Object> sqlWriterTableType;

    /**
     * @return SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sqlWriterTableType() {
        return Optional.ofNullable(this.sqlWriterTableType);
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="sqlWriterUseTableLock")
    private @Nullable Output<Object> sqlWriterUseTableLock;

    /**
     * @return Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> sqlWriterUseTableLock() {
        return Optional.ofNullable(this.sqlWriterUseTableLock);
    }

    /**
     * SQL stored procedure parameters.
     * 
     */
    @Import(name="storedProcedureParameters")
    private @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    /**
     * @return SQL stored procedure parameters.
     * 
     */
    public Optional<Output<Map<String,StoredProcedureParameterArgs>>> storedProcedureParameters() {
        return Optional.ofNullable(this.storedProcedureParameters);
    }

    /**
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="storedProcedureTableTypeParameterName")
    private @Nullable Output<Object> storedProcedureTableTypeParameterName;

    /**
     * @return The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> storedProcedureTableTypeParameterName() {
        return Optional.ofNullable(this.storedProcedureTableTypeParameterName);
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableOption")
    private @Nullable Output<Object> tableOption;

    /**
     * @return The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> tableOption() {
        return Optional.ofNullable(this.tableOption);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;SqlSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy sink type.
     * Expected value is &#39;SqlSink&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * SQL upsert settings.
     * 
     */
    @Import(name="upsertSettings")
    private @Nullable Output<SqlUpsertSettingsArgs> upsertSettings;

    /**
     * @return SQL upsert settings.
     * 
     */
    public Optional<Output<SqlUpsertSettingsArgs>> upsertSettings() {
        return Optional.ofNullable(this.upsertSettings);
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Output<Object> writeBatchSize;

    /**
     * @return Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Output<Object>> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Output<Object> writeBatchTimeout;

    /**
     * @return Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    /**
     * Write behavior when copying data into sql. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    @Import(name="writeBehavior")
    private @Nullable Output<Object> writeBehavior;

    /**
     * @return Write behavior when copying data into sql. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    public Optional<Output<Object>> writeBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    private SqlSinkArgs() {}

    private SqlSinkArgs(SqlSinkArgs $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.preCopyScript = $.preCopyScript;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.sqlWriterStoredProcedureName = $.sqlWriterStoredProcedureName;
        this.sqlWriterTableType = $.sqlWriterTableType;
        this.sqlWriterUseTableLock = $.sqlWriterUseTableLock;
        this.storedProcedureParameters = $.storedProcedureParameters;
        this.storedProcedureTableTypeParameterName = $.storedProcedureTableTypeParameterName;
        this.tableOption = $.tableOption;
        this.type = $.type;
        this.upsertSettings = $.upsertSettings;
        this.writeBatchSize = $.writeBatchSize;
        this.writeBatchTimeout = $.writeBatchTimeout;
        this.writeBehavior = $.writeBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlSinkArgs $;

        public Builder() {
            $ = new SqlSinkArgs();
        }

        public Builder(SqlSinkArgs defaults) {
            $ = new SqlSinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param preCopyScript SQL pre-copy script. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder preCopyScript(@Nullable Output<Object> preCopyScript) {
            $.preCopyScript = preCopyScript;
            return this;
        }

        /**
         * @param preCopyScript SQL pre-copy script. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder preCopyScript(Object preCopyScript) {
            return preCopyScript(Output.of(preCopyScript));
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(Object sinkRetryCount) {
            return sinkRetryCount(Output.of(sinkRetryCount));
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(Object sinkRetryWait) {
            return sinkRetryWait(Output.of(sinkRetryWait));
        }

        /**
         * @param sqlWriterStoredProcedureName SQL writer stored procedure name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterStoredProcedureName(@Nullable Output<Object> sqlWriterStoredProcedureName) {
            $.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
            return this;
        }

        /**
         * @param sqlWriterStoredProcedureName SQL writer stored procedure name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterStoredProcedureName(Object sqlWriterStoredProcedureName) {
            return sqlWriterStoredProcedureName(Output.of(sqlWriterStoredProcedureName));
        }

        /**
         * @param sqlWriterTableType SQL writer table type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterTableType(@Nullable Output<Object> sqlWriterTableType) {
            $.sqlWriterTableType = sqlWriterTableType;
            return this;
        }

        /**
         * @param sqlWriterTableType SQL writer table type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterTableType(Object sqlWriterTableType) {
            return sqlWriterTableType(Output.of(sqlWriterTableType));
        }

        /**
         * @param sqlWriterUseTableLock Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterUseTableLock(@Nullable Output<Object> sqlWriterUseTableLock) {
            $.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        /**
         * @param sqlWriterUseTableLock Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterUseTableLock(Object sqlWriterUseTableLock) {
            return sqlWriterUseTableLock(Output.of(sqlWriterUseTableLock));
        }

        /**
         * @param storedProcedureParameters SQL stored procedure parameters.
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureParameters(@Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            $.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        /**
         * @param storedProcedureParameters SQL stored procedure parameters.
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureParameters(Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            return storedProcedureParameters(Output.of(storedProcedureParameters));
        }

        /**
         * @param storedProcedureTableTypeParameterName The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureTableTypeParameterName(@Nullable Output<Object> storedProcedureTableTypeParameterName) {
            $.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
            return this;
        }

        /**
         * @param storedProcedureTableTypeParameterName The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureTableTypeParameterName(Object storedProcedureTableTypeParameterName) {
            return storedProcedureTableTypeParameterName(Output.of(storedProcedureTableTypeParameterName));
        }

        /**
         * @param tableOption The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableOption(@Nullable Output<Object> tableOption) {
            $.tableOption = tableOption;
            return this;
        }

        /**
         * @param tableOption The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableOption(Object tableOption) {
            return tableOption(Output.of(tableOption));
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;SqlSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;SqlSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param upsertSettings SQL upsert settings.
         * 
         * @return builder
         * 
         */
        public Builder upsertSettings(@Nullable Output<SqlUpsertSettingsArgs> upsertSettings) {
            $.upsertSettings = upsertSettings;
            return this;
        }

        /**
         * @param upsertSettings SQL upsert settings.
         * 
         * @return builder
         * 
         */
        public Builder upsertSettings(SqlUpsertSettingsArgs upsertSettings) {
            return upsertSettings(Output.of(upsertSettings));
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(Object writeBatchSize) {
            return writeBatchSize(Output.of(writeBatchSize));
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(Object writeBatchTimeout) {
            return writeBatchTimeout(Output.of(writeBatchTimeout));
        }

        /**
         * @param writeBehavior Write behavior when copying data into sql. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(@Nullable Output<Object> writeBehavior) {
            $.writeBehavior = writeBehavior;
            return this;
        }

        /**
         * @param writeBehavior Write behavior when copying data into sql. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(Object writeBehavior) {
            return writeBehavior(Output.of(writeBehavior));
        }

        public SqlSinkArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}

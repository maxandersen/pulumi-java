// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse();

    /**
     * Number of applied deletes
     * 
     */
    @Import(name="cdcDeleteCounter", required=true)
    private Double cdcDeleteCounter;

    public Double cdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Number of applied inserts
     * 
     */
    @Import(name="cdcInsertCounter", required=true)
    private Double cdcInsertCounter;

    public Double cdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Number of applied updates
     * 
     */
    @Import(name="cdcUpdateCounter", required=true)
    private Double cdcUpdateCounter;

    public Double cdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }

    /**
     * Number of data errors occurred
     * 
     */
    @Import(name="dataErrorsCounter", required=true)
    private Double dataErrorsCounter;

    public Double dataErrorsCounter() {
        return this.dataErrorsCounter;
    }

    /**
     * Name of the database
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Full load end time
     * 
     */
    @Import(name="fullLoadEndedOn", required=true)
    private String fullLoadEndedOn;

    public String fullLoadEndedOn() {
        return this.fullLoadEndedOn;
    }

    /**
     * Estimate to finish full load
     * 
     */
    @Import(name="fullLoadEstFinishTime", required=true)
    private String fullLoadEstFinishTime;

    public String fullLoadEstFinishTime() {
        return this.fullLoadEstFinishTime;
    }

    /**
     * Full load start time
     * 
     */
    @Import(name="fullLoadStartedOn", required=true)
    private String fullLoadStartedOn;

    public String fullLoadStartedOn() {
        return this.fullLoadStartedOn;
    }

    /**
     * Number of rows applied in full load
     * 
     */
    @Import(name="fullLoadTotalRows", required=true)
    private Double fullLoadTotalRows;

    public Double fullLoadTotalRows() {
        return this.fullLoadTotalRows;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Last modified time on target
     * 
     */
    @Import(name="lastModifiedTime", required=true)
    private String lastModifiedTime;

    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Result type
     * Expected value is &#39;TableLevelOutput&#39;.
     * 
     */
    @Import(name="resultType", required=true)
    private String resultType;

    public String resultType() {
        return this.resultType;
    }

    /**
     * Current state of the table migration
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    /**
     * Name of the table
     * 
     */
    @Import(name="tableName", required=true)
    private String tableName;

    public String tableName() {
        return this.tableName;
    }

    /**
     * Total number of applied changes
     * 
     */
    @Import(name="totalChangesApplied", required=true)
    private Double totalChangesApplied;

    public Double totalChangesApplied() {
        return this.totalChangesApplied;
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse() {}

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse $) {
        this.cdcDeleteCounter = $.cdcDeleteCounter;
        this.cdcInsertCounter = $.cdcInsertCounter;
        this.cdcUpdateCounter = $.cdcUpdateCounter;
        this.dataErrorsCounter = $.dataErrorsCounter;
        this.databaseName = $.databaseName;
        this.fullLoadEndedOn = $.fullLoadEndedOn;
        this.fullLoadEstFinishTime = $.fullLoadEstFinishTime;
        this.fullLoadStartedOn = $.fullLoadStartedOn;
        this.fullLoadTotalRows = $.fullLoadTotalRows;
        this.id = $.id;
        this.lastModifiedTime = $.lastModifiedTime;
        this.resultType = $.resultType;
        this.state = $.state;
        this.tableName = $.tableName;
        this.totalChangesApplied = $.totalChangesApplied;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse $;

        public Builder() {
            $ = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse();
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse defaults) {
            $ = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse(Objects.requireNonNull(defaults));
        }

        public Builder cdcDeleteCounter(Double cdcDeleteCounter) {
            $.cdcDeleteCounter = cdcDeleteCounter;
            return this;
        }

        public Builder cdcInsertCounter(Double cdcInsertCounter) {
            $.cdcInsertCounter = cdcInsertCounter;
            return this;
        }

        public Builder cdcUpdateCounter(Double cdcUpdateCounter) {
            $.cdcUpdateCounter = cdcUpdateCounter;
            return this;
        }

        public Builder dataErrorsCounter(Double dataErrorsCounter) {
            $.dataErrorsCounter = dataErrorsCounter;
            return this;
        }

        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder fullLoadEndedOn(String fullLoadEndedOn) {
            $.fullLoadEndedOn = fullLoadEndedOn;
            return this;
        }

        public Builder fullLoadEstFinishTime(String fullLoadEstFinishTime) {
            $.fullLoadEstFinishTime = fullLoadEstFinishTime;
            return this;
        }

        public Builder fullLoadStartedOn(String fullLoadStartedOn) {
            $.fullLoadStartedOn = fullLoadStartedOn;
            return this;
        }

        public Builder fullLoadTotalRows(Double fullLoadTotalRows) {
            $.fullLoadTotalRows = fullLoadTotalRows;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder lastModifiedTime(String lastModifiedTime) {
            $.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder resultType(String resultType) {
            $.resultType = resultType;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder totalChangesApplied(Double totalChangesApplied) {
            $.totalChangesApplied = totalChangesApplied;
            return this;
        }

        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse build() {
            $.cdcDeleteCounter = Objects.requireNonNull($.cdcDeleteCounter, "expected parameter 'cdcDeleteCounter' to be non-null");
            $.cdcInsertCounter = Objects.requireNonNull($.cdcInsertCounter, "expected parameter 'cdcInsertCounter' to be non-null");
            $.cdcUpdateCounter = Objects.requireNonNull($.cdcUpdateCounter, "expected parameter 'cdcUpdateCounter' to be non-null");
            $.dataErrorsCounter = Objects.requireNonNull($.dataErrorsCounter, "expected parameter 'dataErrorsCounter' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.fullLoadEndedOn = Objects.requireNonNull($.fullLoadEndedOn, "expected parameter 'fullLoadEndedOn' to be non-null");
            $.fullLoadEstFinishTime = Objects.requireNonNull($.fullLoadEstFinishTime, "expected parameter 'fullLoadEstFinishTime' to be non-null");
            $.fullLoadStartedOn = Objects.requireNonNull($.fullLoadStartedOn, "expected parameter 'fullLoadStartedOn' to be non-null");
            $.fullLoadTotalRows = Objects.requireNonNull($.fullLoadTotalRows, "expected parameter 'fullLoadTotalRows' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.lastModifiedTime = Objects.requireNonNull($.lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
            $.resultType = Codegen.stringProp("resultType").arg($.resultType).require();
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            $.totalChangesApplied = Objects.requireNonNull($.totalChangesApplied, "expected parameter 'totalChangesApplied' to be non-null");
            return $;
        }
    }

}

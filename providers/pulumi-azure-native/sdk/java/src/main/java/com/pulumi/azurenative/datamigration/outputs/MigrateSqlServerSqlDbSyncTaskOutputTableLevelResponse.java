// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse {
    /**
     * Number of applied deletes
     * 
     */
    private final Double cdcDeleteCounter;
    /**
     * Number of applied inserts
     * 
     */
    private final Double cdcInsertCounter;
    /**
     * Number of applied updates
     * 
     */
    private final Double cdcUpdateCounter;
    /**
     * Number of data errors occurred
     * 
     */
    private final Double dataErrorsCounter;
    /**
     * Name of the database
     * 
     */
    private final String databaseName;
    /**
     * Full load end time
     * 
     */
    private final String fullLoadEndedOn;
    /**
     * Estimate to finish full load
     * 
     */
    private final String fullLoadEstFinishTime;
    /**
     * Full load start time
     * 
     */
    private final String fullLoadStartedOn;
    /**
     * Number of rows applied in full load
     * 
     */
    private final Double fullLoadTotalRows;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Last modified time on target
     * 
     */
    private final String lastModifiedTime;
    /**
     * Result type
     * Expected value is &#39;TableLevelOutput&#39;.
     * 
     */
    private final String resultType;
    /**
     * Current state of the table migration
     * 
     */
    private final String state;
    /**
     * Name of the table
     * 
     */
    private final String tableName;
    /**
     * Total number of applied changes
     * 
     */
    private final Double totalChangesApplied;

    @CustomType.Constructor
    private MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse(
        @CustomType.Parameter("cdcDeleteCounter") Double cdcDeleteCounter,
        @CustomType.Parameter("cdcInsertCounter") Double cdcInsertCounter,
        @CustomType.Parameter("cdcUpdateCounter") Double cdcUpdateCounter,
        @CustomType.Parameter("dataErrorsCounter") Double dataErrorsCounter,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("fullLoadEndedOn") String fullLoadEndedOn,
        @CustomType.Parameter("fullLoadEstFinishTime") String fullLoadEstFinishTime,
        @CustomType.Parameter("fullLoadStartedOn") String fullLoadStartedOn,
        @CustomType.Parameter("fullLoadTotalRows") Double fullLoadTotalRows,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("resultType") String resultType,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("totalChangesApplied") Double totalChangesApplied) {
        this.cdcDeleteCounter = cdcDeleteCounter;
        this.cdcInsertCounter = cdcInsertCounter;
        this.cdcUpdateCounter = cdcUpdateCounter;
        this.dataErrorsCounter = dataErrorsCounter;
        this.databaseName = databaseName;
        this.fullLoadEndedOn = fullLoadEndedOn;
        this.fullLoadEstFinishTime = fullLoadEstFinishTime;
        this.fullLoadStartedOn = fullLoadStartedOn;
        this.fullLoadTotalRows = fullLoadTotalRows;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.resultType = resultType;
        this.state = state;
        this.tableName = tableName;
        this.totalChangesApplied = totalChangesApplied;
    }

    /**
     * Number of applied deletes
     * 
    */
    public Double cdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }
    /**
     * Number of applied inserts
     * 
    */
    public Double cdcInsertCounter() {
        return this.cdcInsertCounter;
    }
    /**
     * Number of applied updates
     * 
    */
    public Double cdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }
    /**
     * Number of data errors occurred
     * 
    */
    public Double dataErrorsCounter() {
        return this.dataErrorsCounter;
    }
    /**
     * Name of the database
     * 
    */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * Full load end time
     * 
    */
    public String fullLoadEndedOn() {
        return this.fullLoadEndedOn;
    }
    /**
     * Estimate to finish full load
     * 
    */
    public String fullLoadEstFinishTime() {
        return this.fullLoadEstFinishTime;
    }
    /**
     * Full load start time
     * 
    */
    public String fullLoadStartedOn() {
        return this.fullLoadStartedOn;
    }
    /**
     * Number of rows applied in full load
     * 
    */
    public Double fullLoadTotalRows() {
        return this.fullLoadTotalRows;
    }
    /**
     * Result identifier
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Last modified time on target
     * 
    */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Result type
     * Expected value is &#39;TableLevelOutput&#39;.
     * 
    */
    public String resultType() {
        return this.resultType;
    }
    /**
     * Current state of the table migration
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Name of the table
     * 
    */
    public String tableName() {
        return this.tableName;
    }
    /**
     * Total number of applied changes
     * 
    */
    public Double totalChangesApplied() {
        return this.totalChangesApplied;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cdcDeleteCounter;
        private Double cdcInsertCounter;
        private Double cdcUpdateCounter;
        private Double dataErrorsCounter;
        private String databaseName;
        private String fullLoadEndedOn;
        private String fullLoadEstFinishTime;
        private String fullLoadStartedOn;
        private Double fullLoadTotalRows;
        private String id;
        private String lastModifiedTime;
        private String resultType;
        private String state;
        private String tableName;
        private Double totalChangesApplied;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdcDeleteCounter = defaults.cdcDeleteCounter;
    	      this.cdcInsertCounter = defaults.cdcInsertCounter;
    	      this.cdcUpdateCounter = defaults.cdcUpdateCounter;
    	      this.dataErrorsCounter = defaults.dataErrorsCounter;
    	      this.databaseName = defaults.databaseName;
    	      this.fullLoadEndedOn = defaults.fullLoadEndedOn;
    	      this.fullLoadEstFinishTime = defaults.fullLoadEstFinishTime;
    	      this.fullLoadStartedOn = defaults.fullLoadStartedOn;
    	      this.fullLoadTotalRows = defaults.fullLoadTotalRows;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.resultType = defaults.resultType;
    	      this.state = defaults.state;
    	      this.tableName = defaults.tableName;
    	      this.totalChangesApplied = defaults.totalChangesApplied;
        }

        public Builder cdcDeleteCounter(Double cdcDeleteCounter) {
            this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter);
            return this;
        }
        public Builder cdcInsertCounter(Double cdcInsertCounter) {
            this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter);
            return this;
        }
        public Builder cdcUpdateCounter(Double cdcUpdateCounter) {
            this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter);
            return this;
        }
        public Builder dataErrorsCounter(Double dataErrorsCounter) {
            this.dataErrorsCounter = Objects.requireNonNull(dataErrorsCounter);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder fullLoadEndedOn(String fullLoadEndedOn) {
            this.fullLoadEndedOn = Objects.requireNonNull(fullLoadEndedOn);
            return this;
        }
        public Builder fullLoadEstFinishTime(String fullLoadEstFinishTime) {
            this.fullLoadEstFinishTime = Objects.requireNonNull(fullLoadEstFinishTime);
            return this;
        }
        public Builder fullLoadStartedOn(String fullLoadStartedOn) {
            this.fullLoadStartedOn = Objects.requireNonNull(fullLoadStartedOn);
            return this;
        }
        public Builder fullLoadTotalRows(Double fullLoadTotalRows) {
            this.fullLoadTotalRows = Objects.requireNonNull(fullLoadTotalRows);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder totalChangesApplied(Double totalChangesApplied) {
            this.totalChangesApplied = Objects.requireNonNull(totalChangesApplied);
            return this;
        }        public MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse build() {
            return new MigrateSqlServerSqlDbSyncTaskOutputTableLevelResponse(cdcDeleteCounter, cdcInsertCounter, cdcUpdateCounter, dataErrorsCounter, databaseName, fullLoadEndedOn, fullLoadEstFinishTime, fullLoadStartedOn, fullLoadTotalRows, id, lastModifiedTime, resultType, state, tableName, totalChangesApplied);
        }
    }
}

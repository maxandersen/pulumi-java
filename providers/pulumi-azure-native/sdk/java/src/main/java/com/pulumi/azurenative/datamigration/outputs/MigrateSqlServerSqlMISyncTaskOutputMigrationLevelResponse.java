// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse {
    /**
     * Count of databases
     * 
     */
    private final Integer databaseCount;
    /**
     * Number of database level errors
     * 
     */
    private final Integer databaseErrorCount;
    /**
     * Migration end time
     * 
     */
    private final String endedOn;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Result type
     * Expected value is &#39;MigrationLevelOutput&#39;.
     * 
     */
    private final String resultType;
    /**
     * Source server brand version
     * 
     */
    private final String sourceServerBrandVersion;
    /**
     * Source server name
     * 
     */
    private final String sourceServerName;
    /**
     * Source server version
     * 
     */
    private final String sourceServerVersion;
    /**
     * Migration start time
     * 
     */
    private final String startedOn;
    /**
     * Current state of migration
     * 
     */
    private final String state;
    /**
     * Target server brand version
     * 
     */
    private final String targetServerBrandVersion;
    /**
     * Target server name
     * 
     */
    private final String targetServerName;
    /**
     * Target server version
     * 
     */
    private final String targetServerVersion;

    @CustomType.Constructor
    private MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(
        @CustomType.Parameter("databaseCount") Integer databaseCount,
        @CustomType.Parameter("databaseErrorCount") Integer databaseErrorCount,
        @CustomType.Parameter("endedOn") String endedOn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("resultType") String resultType,
        @CustomType.Parameter("sourceServerBrandVersion") String sourceServerBrandVersion,
        @CustomType.Parameter("sourceServerName") String sourceServerName,
        @CustomType.Parameter("sourceServerVersion") String sourceServerVersion,
        @CustomType.Parameter("startedOn") String startedOn,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("targetServerBrandVersion") String targetServerBrandVersion,
        @CustomType.Parameter("targetServerName") String targetServerName,
        @CustomType.Parameter("targetServerVersion") String targetServerVersion) {
        this.databaseCount = databaseCount;
        this.databaseErrorCount = databaseErrorCount;
        this.endedOn = endedOn;
        this.id = id;
        this.resultType = resultType;
        this.sourceServerBrandVersion = sourceServerBrandVersion;
        this.sourceServerName = sourceServerName;
        this.sourceServerVersion = sourceServerVersion;
        this.startedOn = startedOn;
        this.state = state;
        this.targetServerBrandVersion = targetServerBrandVersion;
        this.targetServerName = targetServerName;
        this.targetServerVersion = targetServerVersion;
    }

    /**
     * Count of databases
     * 
    */
    public Integer databaseCount() {
        return this.databaseCount;
    }
    /**
     * Number of database level errors
     * 
    */
    public Integer databaseErrorCount() {
        return this.databaseErrorCount;
    }
    /**
     * Migration end time
     * 
    */
    public String endedOn() {
        return this.endedOn;
    }
    /**
     * Result identifier
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Result type
     * Expected value is &#39;MigrationLevelOutput&#39;.
     * 
    */
    public String resultType() {
        return this.resultType;
    }
    /**
     * Source server brand version
     * 
    */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }
    /**
     * Source server name
     * 
    */
    public String sourceServerName() {
        return this.sourceServerName;
    }
    /**
     * Source server version
     * 
    */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }
    /**
     * Migration start time
     * 
    */
    public String startedOn() {
        return this.startedOn;
    }
    /**
     * Current state of migration
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Target server brand version
     * 
    */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    /**
     * Target server name
     * 
    */
    public String targetServerName() {
        return this.targetServerName;
    }
    /**
     * Target server version
     * 
    */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer databaseCount;
        private Integer databaseErrorCount;
        private String endedOn;
        private String id;
        private String resultType;
        private String sourceServerBrandVersion;
        private String sourceServerName;
        private String sourceServerVersion;
        private String startedOn;
        private String state;
        private String targetServerBrandVersion;
        private String targetServerName;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseCount = defaults.databaseCount;
    	      this.databaseErrorCount = defaults.databaseErrorCount;
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerName = defaults.sourceServerName;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerName = defaults.targetServerName;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder databaseCount(Integer databaseCount) {
            this.databaseCount = Objects.requireNonNull(databaseCount);
            return this;
        }
        public Builder databaseErrorCount(Integer databaseErrorCount) {
            this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount);
            return this;
        }
        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder sourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }
        public Builder sourceServerName(String sourceServerName) {
            this.sourceServerName = Objects.requireNonNull(sourceServerName);
            return this;
        }
        public Builder sourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder targetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }
        public Builder targetServerName(String targetServerName) {
            this.targetServerName = Objects.requireNonNull(targetServerName);
            return this;
        }
        public Builder targetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }        public MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(databaseCount, databaseErrorCount, endedOn, id, resultType, sourceServerBrandVersion, sourceServerName, sourceServerVersion, startedOn, state, targetServerBrandVersion, targetServerName, targetServerVersion);
        }
    }
}

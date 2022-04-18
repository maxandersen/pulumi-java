// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse Empty = new MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse();

    /**
     * Count of databases
     * 
     */
    @Import(name="databaseCount", required=true)
      private final Integer databaseCount;

    public Integer databaseCount() {
        return this.databaseCount;
    }

    /**
     * Number of database level errors
     * 
     */
    @Import(name="databaseErrorCount", required=true)
      private final Integer databaseErrorCount;

    public Integer databaseErrorCount() {
        return this.databaseErrorCount;
    }

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String endedOn() {
        return this.endedOn;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    /**
     * Source server brand version
     * 
     */
    @Import(name="sourceServerBrandVersion", required=true)
      private final String sourceServerBrandVersion;

    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Source server name
     * 
     */
    @Import(name="sourceServerName", required=true)
      private final String sourceServerName;

    public String sourceServerName() {
        return this.sourceServerName;
    }

    /**
     * Source server version
     * 
     */
    @Import(name="sourceServerVersion", required=true)
      private final String sourceServerVersion;

    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String startedOn() {
        return this.startedOn;
    }

    /**
     * Current state of migration
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Target server brand version
     * 
     */
    @Import(name="targetServerBrandVersion", required=true)
      private final String targetServerBrandVersion;

    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Target server name
     * 
     */
    @Import(name="targetServerName", required=true)
      private final String targetServerName;

    public String targetServerName() {
        return this.targetServerName;
    }

    /**
     * Target server version
     * 
     */
    @Import(name="targetServerVersion", required=true)
      private final String targetServerVersion;

    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    public MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(
        Integer databaseCount,
        Integer databaseErrorCount,
        String endedOn,
        String id,
        String resultType,
        String sourceServerBrandVersion,
        String sourceServerName,
        String sourceServerVersion,
        String startedOn,
        String state,
        String targetServerBrandVersion,
        String targetServerName,
        String targetServerVersion) {
        this.databaseCount = Objects.requireNonNull(databaseCount, "expected parameter 'databaseCount' to be non-null");
        this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount, "expected parameter 'databaseErrorCount' to be non-null");
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion, "expected parameter 'sourceServerBrandVersion' to be non-null");
        this.sourceServerName = Objects.requireNonNull(sourceServerName, "expected parameter 'sourceServerName' to be non-null");
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.targetServerName = Objects.requireNonNull(targetServerName, "expected parameter 'targetServerName' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
    }

    private MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse() {
        this.databaseCount = null;
        this.databaseErrorCount = null;
        this.endedOn = null;
        this.id = null;
        this.resultType = null;
        this.sourceServerBrandVersion = null;
        this.sourceServerName = null;
        this.sourceServerVersion = null;
        this.startedOn = null;
        this.state = null;
        this.targetServerBrandVersion = null;
        this.targetServerName = null;
        this.targetServerVersion = null;
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

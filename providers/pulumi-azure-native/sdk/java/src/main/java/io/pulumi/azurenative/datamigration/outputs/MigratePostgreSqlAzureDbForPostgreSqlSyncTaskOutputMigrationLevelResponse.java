// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse {
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
     * Expected value is 'MigrationLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Source server name
     * 
     */
    private final String sourceServer;
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
     * Target server name
     * 
     */
    private final String targetServer;
    /**
     * Target server version
     * 
     */
    private final String targetServerVersion;

    @CustomType.Constructor
    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse(
        @CustomType.Parameter("endedOn") String endedOn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("resultType") String resultType,
        @CustomType.Parameter("sourceServer") String sourceServer,
        @CustomType.Parameter("sourceServerVersion") String sourceServerVersion,
        @CustomType.Parameter("startedOn") String startedOn,
        @CustomType.Parameter("targetServer") String targetServer,
        @CustomType.Parameter("targetServerVersion") String targetServerVersion) {
        this.endedOn = endedOn;
        this.id = id;
        this.resultType = resultType;
        this.sourceServer = sourceServer;
        this.sourceServerVersion = sourceServerVersion;
        this.startedOn = startedOn;
        this.targetServer = targetServer;
        this.targetServerVersion = targetServerVersion;
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
     * Expected value is 'MigrationLevelOutput'.
     * 
    */
    public String resultType() {
        return this.resultType;
    }
    /**
     * Source server name
     * 
    */
    public String sourceServer() {
        return this.sourceServer;
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
     * Target server name
     * 
    */
    public String targetServer() {
        return this.targetServer;
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

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String id;
        private String resultType;
        private String sourceServer;
        private String sourceServerVersion;
        private String startedOn;
        private String targetServer;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
    	      this.sourceServer = defaults.sourceServer;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.targetServer = defaults.targetServer;
    	      this.targetServerVersion = defaults.targetServerVersion;
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
        public Builder sourceServer(String sourceServer) {
            this.sourceServer = Objects.requireNonNull(sourceServer);
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
        public Builder targetServer(String targetServer) {
            this.targetServer = Objects.requireNonNull(targetServer);
            return this;
        }
        public Builder targetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse(endedOn, id, resultType, sourceServer, sourceServerVersion, startedOn, targetServer, targetServerVersion);
        }
    }
}

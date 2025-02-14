// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbSyncDatabaseInputArgs;
import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Input for task that validates migration input for SQL sync migrations
 * 
 */
public final class ValidateSyncMigrationInputSqlServerTaskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValidateSyncMigrationInputSqlServerTaskInputArgs Empty = new ValidateSyncMigrationInputSqlServerTaskInputArgs();

    /**
     * Databases to migrate
     * 
     */
    @Import(name="selectedDatabases", required=true)
    private Output<List<MigrateSqlServerSqlDbSyncDatabaseInputArgs>> selectedDatabases;

    /**
     * @return Databases to migrate
     * 
     */
    public Output<List<MigrateSqlServerSqlDbSyncDatabaseInputArgs>> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Information for connecting to source SQL server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    /**
     * @return Information for connecting to source SQL server
     * 
     */
    public Output<SqlConnectionInfoArgs> sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Information for connecting to target
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> targetConnectionInfo;

    /**
     * @return Information for connecting to target
     * 
     */
    public Output<SqlConnectionInfoArgs> targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    private ValidateSyncMigrationInputSqlServerTaskInputArgs() {}

    private ValidateSyncMigrationInputSqlServerTaskInputArgs(ValidateSyncMigrationInputSqlServerTaskInputArgs $) {
        this.selectedDatabases = $.selectedDatabases;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValidateSyncMigrationInputSqlServerTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValidateSyncMigrationInputSqlServerTaskInputArgs $;

        public Builder() {
            $ = new ValidateSyncMigrationInputSqlServerTaskInputArgs();
        }

        public Builder(ValidateSyncMigrationInputSqlServerTaskInputArgs defaults) {
            $ = new ValidateSyncMigrationInputSqlServerTaskInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param selectedDatabases Databases to migrate
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(Output<List<MigrateSqlServerSqlDbSyncDatabaseInputArgs>> selectedDatabases) {
            $.selectedDatabases = selectedDatabases;
            return this;
        }

        /**
         * @param selectedDatabases Databases to migrate
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(List<MigrateSqlServerSqlDbSyncDatabaseInputArgs> selectedDatabases) {
            return selectedDatabases(Output.of(selectedDatabases));
        }

        /**
         * @param selectedDatabases Databases to migrate
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(MigrateSqlServerSqlDbSyncDatabaseInputArgs... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }

        /**
         * @param sourceConnectionInfo Information for connecting to source SQL server
         * 
         * @return builder
         * 
         */
        public Builder sourceConnectionInfo(Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        /**
         * @param sourceConnectionInfo Information for connecting to source SQL server
         * 
         * @return builder
         * 
         */
        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            return sourceConnectionInfo(Output.of(sourceConnectionInfo));
        }

        /**
         * @param targetConnectionInfo Information for connecting to target
         * 
         * @return builder
         * 
         */
        public Builder targetConnectionInfo(Output<SqlConnectionInfoArgs> targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        /**
         * @param targetConnectionInfo Information for connecting to target
         * 
         * @return builder
         * 
         */
        public Builder targetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            return targetConnectionInfo(Output.of(targetConnectionInfo));
        }

        public ValidateSyncMigrationInputSqlServerTaskInputArgs build() {
            $.selectedDatabases = Objects.requireNonNull($.selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}

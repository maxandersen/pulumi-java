// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbSyncDatabaseInputResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrationValidationOptionsResponse;
import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for the task that migrates on-prem SQL Server databases to Azure SQL Database for online migrations
 * 
 */
public final class MigrateSqlServerSqlDbSyncTaskInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbSyncTaskInputResponse Empty = new MigrateSqlServerSqlDbSyncTaskInputResponse();

    /**
     * Databases to migrate
     * 
     */
    @Import(name="selectedDatabases", required=true)
    private List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases;

    public List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Information for connecting to source
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Information for connecting to target
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Validation options
     * 
     */
    @Import(name="validationOptions")
    private @Nullable MigrationValidationOptionsResponse validationOptions;

    public Optional<MigrationValidationOptionsResponse> validationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    private MigrateSqlServerSqlDbSyncTaskInputResponse() {}

    private MigrateSqlServerSqlDbSyncTaskInputResponse(MigrateSqlServerSqlDbSyncTaskInputResponse $) {
        this.selectedDatabases = $.selectedDatabases;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.targetConnectionInfo = $.targetConnectionInfo;
        this.validationOptions = $.validationOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateSqlServerSqlDbSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateSqlServerSqlDbSyncTaskInputResponse $;

        public Builder() {
            $ = new MigrateSqlServerSqlDbSyncTaskInputResponse();
        }

        public Builder(MigrateSqlServerSqlDbSyncTaskInputResponse defaults) {
            $ = new MigrateSqlServerSqlDbSyncTaskInputResponse(Objects.requireNonNull(defaults));
        }

        public Builder selectedDatabases(List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases) {
            $.selectedDatabases = selectedDatabases;
            return this;
        }

        public Builder selectedDatabases(MigrateSqlServerSqlDbSyncDatabaseInputResponse... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public Builder validationOptions(@Nullable MigrationValidationOptionsResponse validationOptions) {
            $.validationOptions = validationOptions;
            return this;
        }

        public MigrateSqlServerSqlDbSyncTaskInputResponse build() {
            $.selectedDatabases = Objects.requireNonNull($.selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}

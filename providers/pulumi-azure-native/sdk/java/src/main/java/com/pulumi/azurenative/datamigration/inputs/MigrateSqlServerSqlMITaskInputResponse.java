// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.BlobShareResponse;
import com.pulumi.azurenative.datamigration.inputs.FileShareResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for task that migrates SQL Server databases to Azure SQL Database Managed Instance.
 * 
 */
public final class MigrateSqlServerSqlMITaskInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMITaskInputResponse Empty = new MigrateSqlServerSqlMITaskInputResponse();

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     */
    @Import(name="backupBlobShare", required=true)
    private BlobShareResponse backupBlobShare;

    public BlobShareResponse backupBlobShare() {
        return this.backupBlobShare;
    }

    /**
     * Backup file share information for all selected databases.
     * 
     */
    @Import(name="backupFileShare")
    private @Nullable FileShareResponse backupFileShare;

    public Optional<FileShareResponse> backupFileShare() {
        return Optional.ofNullable(this.backupFileShare);
    }

    /**
     * Backup Mode to specify whether to use existing backup or create new backup. If using existing backups, backup file paths are required to be provided in selectedDatabases.
     * 
     */
    @Import(name="backupMode")
    private @Nullable String backupMode;

    public Optional<String> backupMode() {
        return Optional.ofNullable(this.backupMode);
    }

    /**
     * Agent Jobs to migrate.
     * 
     */
    @Import(name="selectedAgentJobs")
    private @Nullable List<String> selectedAgentJobs;

    public Optional<List<String>> selectedAgentJobs() {
        return Optional.ofNullable(this.selectedAgentJobs);
    }

    /**
     * Databases to migrate
     * 
     */
    @Import(name="selectedDatabases", required=true)
    private List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;

    public List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Logins to migrate.
     * 
     */
    @Import(name="selectedLogins")
    private @Nullable List<String> selectedLogins;

    public Optional<List<String>> selectedLogins() {
        return Optional.ofNullable(this.selectedLogins);
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

    private MigrateSqlServerSqlMITaskInputResponse() {}

    private MigrateSqlServerSqlMITaskInputResponse(MigrateSqlServerSqlMITaskInputResponse $) {
        this.backupBlobShare = $.backupBlobShare;
        this.backupFileShare = $.backupFileShare;
        this.backupMode = $.backupMode;
        this.selectedAgentJobs = $.selectedAgentJobs;
        this.selectedDatabases = $.selectedDatabases;
        this.selectedLogins = $.selectedLogins;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateSqlServerSqlMITaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateSqlServerSqlMITaskInputResponse $;

        public Builder() {
            $ = new MigrateSqlServerSqlMITaskInputResponse();
        }

        public Builder(MigrateSqlServerSqlMITaskInputResponse defaults) {
            $ = new MigrateSqlServerSqlMITaskInputResponse(Objects.requireNonNull(defaults));
        }

        public Builder backupBlobShare(BlobShareResponse backupBlobShare) {
            $.backupBlobShare = backupBlobShare;
            return this;
        }

        public Builder backupFileShare(@Nullable FileShareResponse backupFileShare) {
            $.backupFileShare = backupFileShare;
            return this;
        }

        public Builder backupMode(@Nullable String backupMode) {
            $.backupMode = backupMode;
            return this;
        }

        public Builder selectedAgentJobs(@Nullable List<String> selectedAgentJobs) {
            $.selectedAgentJobs = selectedAgentJobs;
            return this;
        }

        public Builder selectedAgentJobs(String... selectedAgentJobs) {
            return selectedAgentJobs(List.of(selectedAgentJobs));
        }

        public Builder selectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases) {
            $.selectedDatabases = selectedDatabases;
            return this;
        }

        public Builder selectedDatabases(MigrateSqlServerSqlMIDatabaseInputResponse... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }

        public Builder selectedLogins(@Nullable List<String> selectedLogins) {
            $.selectedLogins = selectedLogins;
            return this;
        }

        public Builder selectedLogins(String... selectedLogins) {
            return selectedLogins(List.of(selectedLogins));
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public MigrateSqlServerSqlMITaskInputResponse build() {
            $.backupBlobShare = Objects.requireNonNull($.backupBlobShare, "expected parameter 'backupBlobShare' to be non-null");
            $.selectedDatabases = Objects.requireNonNull($.selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}

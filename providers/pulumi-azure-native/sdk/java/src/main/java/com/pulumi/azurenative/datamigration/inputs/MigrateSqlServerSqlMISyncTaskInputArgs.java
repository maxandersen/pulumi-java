// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.AzureActiveDirectoryAppArgs;
import com.pulumi.azurenative.datamigration.inputs.FileShareArgs;
import com.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoArgs;
import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputArgs;
import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for task that migrates SQL Server databases to Azure SQL Database Managed Instance online scenario.
 * 
 */
public final class MigrateSqlServerSqlMISyncTaskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlMISyncTaskInputArgs Empty = new MigrateSqlServerSqlMISyncTaskInputArgs();

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    @Import(name="azureApp", required=true)
    private Output<AzureActiveDirectoryAppArgs> azureApp;

    public Output<AzureActiveDirectoryAppArgs> azureApp() {
        return this.azureApp;
    }

    /**
     * Backup file share information for all selected databases.
     * 
     */
    @Import(name="backupFileShare")
    private @Nullable Output<FileShareArgs> backupFileShare;

    public Optional<Output<FileShareArgs>> backupFileShare() {
        return Optional.ofNullable(this.backupFileShare);
    }

    /**
     * Databases to migrate
     * 
     */
    @Import(name="selectedDatabases", required=true)
    private Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases;

    public Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Connection information for source SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<SqlConnectionInfoArgs> sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Fully qualified resourceId of storage
     * 
     */
    @Import(name="storageResourceId", required=true)
    private Output<String> storageResourceId;

    public Output<String> storageResourceId() {
        return this.storageResourceId;
    }

    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private Output<MiSqlConnectionInfoArgs> targetConnectionInfo;

    public Output<MiSqlConnectionInfoArgs> targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    private MigrateSqlServerSqlMISyncTaskInputArgs() {}

    private MigrateSqlServerSqlMISyncTaskInputArgs(MigrateSqlServerSqlMISyncTaskInputArgs $) {
        this.azureApp = $.azureApp;
        this.backupFileShare = $.backupFileShare;
        this.selectedDatabases = $.selectedDatabases;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.storageResourceId = $.storageResourceId;
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateSqlServerSqlMISyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateSqlServerSqlMISyncTaskInputArgs $;

        public Builder() {
            $ = new MigrateSqlServerSqlMISyncTaskInputArgs();
        }

        public Builder(MigrateSqlServerSqlMISyncTaskInputArgs defaults) {
            $ = new MigrateSqlServerSqlMISyncTaskInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureApp(Output<AzureActiveDirectoryAppArgs> azureApp) {
            $.azureApp = azureApp;
            return this;
        }

        public Builder azureApp(AzureActiveDirectoryAppArgs azureApp) {
            return azureApp(Output.of(azureApp));
        }

        public Builder backupFileShare(@Nullable Output<FileShareArgs> backupFileShare) {
            $.backupFileShare = backupFileShare;
            return this;
        }

        public Builder backupFileShare(FileShareArgs backupFileShare) {
            return backupFileShare(Output.of(backupFileShare));
        }

        public Builder selectedDatabases(Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases) {
            $.selectedDatabases = selectedDatabases;
            return this;
        }

        public Builder selectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputArgs> selectedDatabases) {
            return selectedDatabases(Output.of(selectedDatabases));
        }

        public Builder selectedDatabases(MigrateSqlServerSqlMIDatabaseInputArgs... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }

        public Builder sourceConnectionInfo(Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            return sourceConnectionInfo(Output.of(sourceConnectionInfo));
        }

        public Builder storageResourceId(Output<String> storageResourceId) {
            $.storageResourceId = storageResourceId;
            return this;
        }

        public Builder storageResourceId(String storageResourceId) {
            return storageResourceId(Output.of(storageResourceId));
        }

        public Builder targetConnectionInfo(Output<MiSqlConnectionInfoArgs> targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public Builder targetConnectionInfo(MiSqlConnectionInfoArgs targetConnectionInfo) {
            return targetConnectionInfo(Output.of(targetConnectionInfo));
        }

        public MigrateSqlServerSqlMISyncTaskInputArgs build() {
            $.azureApp = Objects.requireNonNull($.azureApp, "expected parameter 'azureApp' to be non-null");
            $.selectedDatabases = Objects.requireNonNull($.selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.storageResourceId = Objects.requireNonNull($.storageResourceId, "expected parameter 'storageResourceId' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}

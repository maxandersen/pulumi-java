// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.BlobShareResponse;
import io.pulumi.azurenative.datamigration.inputs.FileShareResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for task that validates migration input for SQL to Azure SQL Managed Instance
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMITaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidateMigrationInputSqlServerSqlMITaskInputResponse Empty = new ValidateMigrationInputSqlServerSqlMITaskInputResponse();

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     */
    @Import(name="backupBlobShare", required=true)
      private final BlobShareResponse backupBlobShare;

    public BlobShareResponse backupBlobShare() {
        return this.backupBlobShare;
    }

    /**
     * Backup file share information for all selected databases.
     * 
     */
    @Import(name="backupFileShare")
      private final @Nullable FileShareResponse backupFileShare;

    public Optional<FileShareResponse> backupFileShare() {
        return this.backupFileShare == null ? Optional.empty() : Optional.ofNullable(this.backupFileShare);
    }

    /**
     * Backup Mode to specify whether to use existing backup or create new backup.
     * 
     */
    @Import(name="backupMode")
      private final @Nullable String backupMode;

    public Optional<String> backupMode() {
        return this.backupMode == null ? Optional.empty() : Optional.ofNullable(this.backupMode);
    }

    /**
     * Databases to migrate
     * 
     */
    @Import(name="selectedDatabases", required=true)
      private final List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;

    public List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Logins to migrate
     * 
     */
    @Import(name="selectedLogins")
      private final @Nullable List<String> selectedLogins;

    public List<String> selectedLogins() {
        return this.selectedLogins == null ? List.of() : this.selectedLogins;
    }

    /**
     * Information for connecting to source
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Information for connecting to target
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
      private final SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ValidateMigrationInputSqlServerSqlMITaskInputResponse(
        BlobShareResponse backupBlobShare,
        @Nullable FileShareResponse backupFileShare,
        @Nullable String backupMode,
        List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases,
        @Nullable List<String> selectedLogins,
        SqlConnectionInfoResponse sourceConnectionInfo,
        SqlConnectionInfoResponse targetConnectionInfo) {
        this.backupBlobShare = Objects.requireNonNull(backupBlobShare, "expected parameter 'backupBlobShare' to be non-null");
        this.backupFileShare = backupFileShare;
        this.backupMode = backupMode;
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.selectedLogins = selectedLogins;
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlMITaskInputResponse() {
        this.backupBlobShare = null;
        this.backupFileShare = null;
        this.backupMode = null;
        this.selectedDatabases = List.of();
        this.selectedLogins = List.of();
        this.sourceConnectionInfo = null;
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobShareResponse backupBlobShare;
        private @Nullable FileShareResponse backupFileShare;
        private @Nullable String backupMode;
        private List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
        private @Nullable List<String> selectedLogins;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupBlobShare = defaults.backupBlobShare;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.backupMode = defaults.backupMode;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.selectedLogins = defaults.selectedLogins;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder backupBlobShare(BlobShareResponse backupBlobShare) {
            this.backupBlobShare = Objects.requireNonNull(backupBlobShare);
            return this;
        }
        public Builder backupFileShare(@Nullable FileShareResponse backupFileShare) {
            this.backupFileShare = backupFileShare;
            return this;
        }
        public Builder backupMode(@Nullable String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public Builder selectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }
        public Builder selectedDatabases(MigrateSqlServerSqlMIDatabaseInputResponse... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }
        public Builder selectedLogins(@Nullable List<String> selectedLogins) {
            this.selectedLogins = selectedLogins;
            return this;
        }
        public Builder selectedLogins(String... selectedLogins) {
            return selectedLogins(List.of(selectedLogins));
        }
        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }        public ValidateMigrationInputSqlServerSqlMITaskInputResponse build() {
            return new ValidateMigrationInputSqlServerSqlMITaskInputResponse(backupBlobShare, backupFileShare, backupMode, selectedDatabases, selectedLogins, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}

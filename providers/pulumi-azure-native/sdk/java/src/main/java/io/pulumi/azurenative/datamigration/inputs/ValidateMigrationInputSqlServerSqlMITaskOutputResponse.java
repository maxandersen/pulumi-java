// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.DatabaseBackupInfoResponse;
import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Output for task that validates migration input for SQL to Azure SQL Managed Instance migrations
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMITaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidateMigrationInputSqlServerSqlMITaskOutputResponse Empty = new ValidateMigrationInputSqlServerSqlMITaskOutputResponse();

    /**
     * Errors associated with the BackupFolder path
     * 
     */
    @Import(name="backupFolderErrors", required=true)
      private final List<ReportableExceptionResponse> backupFolderErrors;

    public List<ReportableExceptionResponse> backupFolderErrors() {
        return this.backupFolderErrors;
    }

    /**
     * Errors associated with backup share user name and password credentials
     * 
     */
    @Import(name="backupShareCredentialsErrors", required=true)
      private final List<ReportableExceptionResponse> backupShareCredentialsErrors;

    public List<ReportableExceptionResponse> backupShareCredentialsErrors() {
        return this.backupShareCredentialsErrors;
    }

    /**
     * Errors associated with the storage account provided.
     * 
     */
    @Import(name="backupStorageAccountErrors", required=true)
      private final List<ReportableExceptionResponse> backupStorageAccountErrors;

    public List<ReportableExceptionResponse> backupStorageAccountErrors() {
        return this.backupStorageAccountErrors;
    }

    /**
     * Information about backup files when existing backup mode is used.
     * 
     */
    @Import(name="databaseBackupInfo")
      private final @Nullable DatabaseBackupInfoResponse databaseBackupInfo;

    public Optional<DatabaseBackupInfoResponse> databaseBackupInfo() {
        return this.databaseBackupInfo == null ? Optional.empty() : Optional.ofNullable(this.databaseBackupInfo);
    }

    /**
     * Errors associated with existing backup files.
     * 
     */
    @Import(name="existingBackupErrors", required=true)
      private final List<ReportableExceptionResponse> existingBackupErrors;

    public List<ReportableExceptionResponse> existingBackupErrors() {
        return this.existingBackupErrors;
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
     * Name of database
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Errors associated with the RestoreDatabaseName
     * 
     */
    @Import(name="restoreDatabaseNameErrors", required=true)
      private final List<ReportableExceptionResponse> restoreDatabaseNameErrors;

    public List<ReportableExceptionResponse> restoreDatabaseNameErrors() {
        return this.restoreDatabaseNameErrors;
    }

    public ValidateMigrationInputSqlServerSqlMITaskOutputResponse(
        List<ReportableExceptionResponse> backupFolderErrors,
        List<ReportableExceptionResponse> backupShareCredentialsErrors,
        List<ReportableExceptionResponse> backupStorageAccountErrors,
        @Nullable DatabaseBackupInfoResponse databaseBackupInfo,
        List<ReportableExceptionResponse> existingBackupErrors,
        String id,
        String name,
        List<ReportableExceptionResponse> restoreDatabaseNameErrors) {
        this.backupFolderErrors = Objects.requireNonNull(backupFolderErrors, "expected parameter 'backupFolderErrors' to be non-null");
        this.backupShareCredentialsErrors = Objects.requireNonNull(backupShareCredentialsErrors, "expected parameter 'backupShareCredentialsErrors' to be non-null");
        this.backupStorageAccountErrors = Objects.requireNonNull(backupStorageAccountErrors, "expected parameter 'backupStorageAccountErrors' to be non-null");
        this.databaseBackupInfo = databaseBackupInfo;
        this.existingBackupErrors = Objects.requireNonNull(existingBackupErrors, "expected parameter 'existingBackupErrors' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.restoreDatabaseNameErrors = Objects.requireNonNull(restoreDatabaseNameErrors, "expected parameter 'restoreDatabaseNameErrors' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlMITaskOutputResponse() {
        this.backupFolderErrors = List.of();
        this.backupShareCredentialsErrors = List.of();
        this.backupStorageAccountErrors = List.of();
        this.databaseBackupInfo = null;
        this.existingBackupErrors = List.of();
        this.id = null;
        this.name = null;
        this.restoreDatabaseNameErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReportableExceptionResponse> backupFolderErrors;
        private List<ReportableExceptionResponse> backupShareCredentialsErrors;
        private List<ReportableExceptionResponse> backupStorageAccountErrors;
        private @Nullable DatabaseBackupInfoResponse databaseBackupInfo;
        private List<ReportableExceptionResponse> existingBackupErrors;
        private String id;
        private String name;
        private List<ReportableExceptionResponse> restoreDatabaseNameErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupFolderErrors = defaults.backupFolderErrors;
    	      this.backupShareCredentialsErrors = defaults.backupShareCredentialsErrors;
    	      this.backupStorageAccountErrors = defaults.backupStorageAccountErrors;
    	      this.databaseBackupInfo = defaults.databaseBackupInfo;
    	      this.existingBackupErrors = defaults.existingBackupErrors;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.restoreDatabaseNameErrors = defaults.restoreDatabaseNameErrors;
        }

        public Builder backupFolderErrors(List<ReportableExceptionResponse> backupFolderErrors) {
            this.backupFolderErrors = Objects.requireNonNull(backupFolderErrors);
            return this;
        }
        public Builder backupFolderErrors(ReportableExceptionResponse... backupFolderErrors) {
            return backupFolderErrors(List.of(backupFolderErrors));
        }
        public Builder backupShareCredentialsErrors(List<ReportableExceptionResponse> backupShareCredentialsErrors) {
            this.backupShareCredentialsErrors = Objects.requireNonNull(backupShareCredentialsErrors);
            return this;
        }
        public Builder backupShareCredentialsErrors(ReportableExceptionResponse... backupShareCredentialsErrors) {
            return backupShareCredentialsErrors(List.of(backupShareCredentialsErrors));
        }
        public Builder backupStorageAccountErrors(List<ReportableExceptionResponse> backupStorageAccountErrors) {
            this.backupStorageAccountErrors = Objects.requireNonNull(backupStorageAccountErrors);
            return this;
        }
        public Builder backupStorageAccountErrors(ReportableExceptionResponse... backupStorageAccountErrors) {
            return backupStorageAccountErrors(List.of(backupStorageAccountErrors));
        }
        public Builder databaseBackupInfo(@Nullable DatabaseBackupInfoResponse databaseBackupInfo) {
            this.databaseBackupInfo = databaseBackupInfo;
            return this;
        }
        public Builder existingBackupErrors(List<ReportableExceptionResponse> existingBackupErrors) {
            this.existingBackupErrors = Objects.requireNonNull(existingBackupErrors);
            return this;
        }
        public Builder existingBackupErrors(ReportableExceptionResponse... existingBackupErrors) {
            return existingBackupErrors(List.of(existingBackupErrors));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder restoreDatabaseNameErrors(List<ReportableExceptionResponse> restoreDatabaseNameErrors) {
            this.restoreDatabaseNameErrors = Objects.requireNonNull(restoreDatabaseNameErrors);
            return this;
        }
        public Builder restoreDatabaseNameErrors(ReportableExceptionResponse... restoreDatabaseNameErrors) {
            return restoreDatabaseNameErrors(List.of(restoreDatabaseNameErrors));
        }        public ValidateMigrationInputSqlServerSqlMITaskOutputResponse build() {
            return new ValidateMigrationInputSqlServerSqlMITaskOutputResponse(backupFolderErrors, backupShareCredentialsErrors, backupStorageAccountErrors, databaseBackupInfo, existingBackupErrors, id, name, restoreDatabaseNameErrors);
        }
    }
}

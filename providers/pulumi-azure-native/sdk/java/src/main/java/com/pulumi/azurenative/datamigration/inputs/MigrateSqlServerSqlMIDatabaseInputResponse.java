// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.FileShareResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database specific information for SQL to Azure SQL DB Managed Instance migration task inputs
 * 
 */
public final class MigrateSqlServerSqlMIDatabaseInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMIDatabaseInputResponse Empty = new MigrateSqlServerSqlMIDatabaseInputResponse();

    /**
     * The list of backup files to be used in case of existing backups.
     * 
     */
    @Import(name="backupFilePaths")
    private @Nullable List<String> backupFilePaths;

    public Optional<List<String>> backupFilePaths() {
        return Optional.ofNullable(this.backupFilePaths);
    }

    /**
     * Backup file share information for backing up this database.
     * 
     */
    @Import(name="backupFileShare")
    private @Nullable FileShareResponse backupFileShare;

    public Optional<FileShareResponse> backupFileShare() {
        return Optional.ofNullable(this.backupFileShare);
    }

    /**
     * Name of the database
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Name of the database at destination
     * 
     */
    @Import(name="restoreDatabaseName", required=true)
    private String restoreDatabaseName;

    public String restoreDatabaseName() {
        return this.restoreDatabaseName;
    }

    private MigrateSqlServerSqlMIDatabaseInputResponse() {}

    private MigrateSqlServerSqlMIDatabaseInputResponse(MigrateSqlServerSqlMIDatabaseInputResponse $) {
        this.backupFilePaths = $.backupFilePaths;
        this.backupFileShare = $.backupFileShare;
        this.name = $.name;
        this.restoreDatabaseName = $.restoreDatabaseName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateSqlServerSqlMIDatabaseInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateSqlServerSqlMIDatabaseInputResponse $;

        public Builder() {
            $ = new MigrateSqlServerSqlMIDatabaseInputResponse();
        }

        public Builder(MigrateSqlServerSqlMIDatabaseInputResponse defaults) {
            $ = new MigrateSqlServerSqlMIDatabaseInputResponse(Objects.requireNonNull(defaults));
        }

        public Builder backupFilePaths(@Nullable List<String> backupFilePaths) {
            $.backupFilePaths = backupFilePaths;
            return this;
        }

        public Builder backupFilePaths(String... backupFilePaths) {
            return backupFilePaths(List.of(backupFilePaths));
        }

        public Builder backupFileShare(@Nullable FileShareResponse backupFileShare) {
            $.backupFileShare = backupFileShare;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder restoreDatabaseName(String restoreDatabaseName) {
            $.restoreDatabaseName = restoreDatabaseName;
            return this;
        }

        public MigrateSqlServerSqlMIDatabaseInputResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.restoreDatabaseName = Objects.requireNonNull($.restoreDatabaseName, "expected parameter 'restoreDatabaseName' to be non-null");
            return $;
        }
    }

}

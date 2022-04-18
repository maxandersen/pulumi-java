// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Azure SQL database output data source.
 * 
 */
public final class AzureSqlDatabaseOutputDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureSqlDatabaseOutputDataSourceResponse Empty = new AzureSqlDatabaseOutputDataSourceResponse();

    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="database")
      private final @Nullable String database;

    public Optional<String> database() {
        return this.database == null ? Optional.empty() : Optional.ofNullable(this.database);
    }

    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="server")
      private final @Nullable String server;

    public Optional<String> server() {
        return this.server == null ? Optional.empty() : Optional.ofNullable(this.server);
    }

    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="table")
      private final @Nullable String table;

    public Optional<String> table() {
        return this.table == null ? Optional.empty() : Optional.ofNullable(this.table);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Sql/Server/Database'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="user")
      private final @Nullable String user;

    public Optional<String> user() {
        return this.user == null ? Optional.empty() : Optional.ofNullable(this.user);
    }

    public AzureSqlDatabaseOutputDataSourceResponse(
        @Nullable String database,
        @Nullable String password,
        @Nullable String server,
        @Nullable String table,
        String type,
        @Nullable String user) {
        this.database = database;
        this.password = password;
        this.server = server;
        this.table = table;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.user = user;
    }

    private AzureSqlDatabaseOutputDataSourceResponse() {
        this.database = null;
        this.password = null;
        this.server = null;
        this.table = null;
        this.type = null;
        this.user = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDatabaseOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String database;
        private @Nullable String password;
        private @Nullable String server;
        private @Nullable String table;
        private String type;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlDatabaseOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder server(@Nullable String server) {
            this.server = server;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = table;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public AzureSqlDatabaseOutputDataSourceResponse build() {
            return new AzureSqlDatabaseOutputDataSourceResponse(database, password, server, table, type, user);
        }
    }
}

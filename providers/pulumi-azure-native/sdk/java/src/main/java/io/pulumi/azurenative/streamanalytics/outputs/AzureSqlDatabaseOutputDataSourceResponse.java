// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureSqlDatabaseOutputDataSourceResponse {
    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String database;
    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String password;
    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String server;
    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String table;
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Sql/Server/Database'.
     * 
     */
    private final String type;
    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String user;

    @CustomType.Constructor
    private AzureSqlDatabaseOutputDataSourceResponse(
        @CustomType.Parameter("database") @Nullable String database,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("server") @Nullable String server,
        @CustomType.Parameter("table") @Nullable String table,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("user") @Nullable String user) {
        this.database = database;
        this.password = password;
        this.server = server;
        this.table = table;
        this.type = type;
        this.user = user;
    }

    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> server() {
        return Optional.ofNullable(this.server);
    }
    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> table() {
        return Optional.ofNullable(this.table);
    }
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Sql/Server/Database'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
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

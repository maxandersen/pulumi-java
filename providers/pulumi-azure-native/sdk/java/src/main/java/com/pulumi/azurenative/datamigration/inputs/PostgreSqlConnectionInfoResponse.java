// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information for connecting to PostgreSQL server
 * 
 */
public final class PostgreSqlConnectionInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PostgreSqlConnectionInfoResponse Empty = new PostgreSqlConnectionInfoResponse();

    /**
     * Name of the database
     * 
     */
    @Import(name="databaseName")
      private final @Nullable String databaseName;

    public Optional<String> databaseName() {
        return this.databaseName == null ? Optional.empty() : Optional.ofNullable(this.databaseName);
    }

    /**
     * Password credential.
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Port for Server
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer port() {
        return this.port;
    }

    /**
     * Name of the server
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String serverName() {
        return this.serverName;
    }

    /**
     * Type of connection info
     * Expected value is 'PostgreSqlConnectionInfo'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @Import(name="userName")
      private final @Nullable String userName;

    public Optional<String> userName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public PostgreSqlConnectionInfoResponse(
        @Nullable String databaseName,
        @Nullable String password,
        Integer port,
        String serverName,
        String type,
        @Nullable String userName) {
        this.databaseName = databaseName;
        this.password = password;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private PostgreSqlConnectionInfoResponse() {
        this.databaseName = null;
        this.password = null;
        this.port = null;
        this.serverName = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgreSqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String password;
        private Integer port;
        private String serverName;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgreSqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverName = defaults.serverName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public PostgreSqlConnectionInfoResponse build() {
            return new PostgreSqlConnectionInfoResponse(databaseName, password, port, serverName, type, userName);
        }
    }
}

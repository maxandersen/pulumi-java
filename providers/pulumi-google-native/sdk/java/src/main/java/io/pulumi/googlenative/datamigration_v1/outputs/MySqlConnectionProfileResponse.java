// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datamigration_v1.outputs.SslConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MySqlConnectionProfileResponse {
    /**
     * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
     */
    private final String cloudSqlId;
    /**
     * The IP or hostname of the source MySQL database.
     * 
     */
    private final String host;
    /**
     * Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
     */
    private final String password;
    /**
     * Indicates If this connection profile password is stored.
     * 
     */
    private final Boolean passwordSet;
    /**
     * The network port of the source MySQL database.
     * 
     */
    private final Integer port;
    /**
     * SSL configuration for the destination to connect to the source database.
     * 
     */
    private final SslConfigResponse ssl;
    /**
     * The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private MySqlConnectionProfileResponse(
        @CustomType.Parameter("cloudSqlId") String cloudSqlId,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("passwordSet") Boolean passwordSet,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("ssl") SslConfigResponse ssl,
        @CustomType.Parameter("username") String username) {
        this.cloudSqlId = cloudSqlId;
        this.host = host;
        this.password = password;
        this.passwordSet = passwordSet;
        this.port = port;
        this.ssl = ssl;
        this.username = username;
    }

    /**
     * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
    */
    public String cloudSqlId() {
        return this.cloudSqlId;
    }
    /**
     * The IP or hostname of the source MySQL database.
     * 
    */
    public String host() {
        return this.host;
    }
    /**
     * Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
    */
    public String password() {
        return this.password;
    }
    /**
     * Indicates If this connection profile password is stored.
     * 
    */
    public Boolean passwordSet() {
        return this.passwordSet;
    }
    /**
     * The network port of the source MySQL database.
     * 
    */
    public Integer port() {
        return this.port;
    }
    /**
     * SSL configuration for the destination to connect to the source database.
     * 
    */
    public SslConfigResponse ssl() {
        return this.ssl;
    }
    /**
     * The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
    */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlConnectionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSqlId;
        private String host;
        private String password;
        private Boolean passwordSet;
        private Integer port;
        private SslConfigResponse ssl;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlConnectionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.passwordSet = defaults.passwordSet;
    	      this.port = defaults.port;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        public Builder cloudSqlId(String cloudSqlId) {
            this.cloudSqlId = Objects.requireNonNull(cloudSqlId);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder passwordSet(Boolean passwordSet) {
            this.passwordSet = Objects.requireNonNull(passwordSet);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder ssl(SslConfigResponse ssl) {
            this.ssl = Objects.requireNonNull(ssl);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public MySqlConnectionProfileResponse build() {
            return new MySqlConnectionProfileResponse(cloudSqlId, host, password, passwordSet, port, ssl, username);
        }
    }
}

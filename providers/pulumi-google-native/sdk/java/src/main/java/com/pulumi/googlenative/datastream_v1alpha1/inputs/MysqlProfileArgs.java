// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlSslConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL database profile.
 * 
 */
public final class MysqlProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlProfileArgs Empty = new MysqlProfileArgs();

    /**
     * Hostname for the MySQL connection.
     * 
     */
    @Import(name="hostname", required=true)
      private final Output<String> hostname;

    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * Input only. Password for the MySQL connection.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * Port for the MySQL connection, default value is 3306.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * SSL configuration for the MySQL connection.
     * 
     */
    @Import(name="sslConfig")
      private final @Nullable Output<MysqlSslConfigArgs> sslConfig;

    public Output<MysqlSslConfigArgs> sslConfig() {
        return this.sslConfig == null ? Codegen.empty() : this.sslConfig;
    }

    /**
     * Username for the MySQL connection.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    public MysqlProfileArgs(
        Output<String> hostname,
        Output<String> password,
        @Nullable Output<Integer> port,
        @Nullable Output<MysqlSslConfigArgs> sslConfig,
        Output<String> username) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = port;
        this.sslConfig = sslConfig;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private MysqlProfileArgs() {
        this.hostname = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.sslConfig = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> hostname;
        private Output<String> password;
        private @Nullable Output<Integer> port;
        private @Nullable Output<MysqlSslConfigArgs> sslConfig;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.sslConfig = defaults.sslConfig;
    	      this.username = defaults.username;
        }

        public Builder hostname(Output<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Output.of(Objects.requireNonNull(hostname));
            return this;
        }
        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder sslConfig(@Nullable Output<MysqlSslConfigArgs> sslConfig) {
            this.sslConfig = sslConfig;
            return this;
        }
        public Builder sslConfig(@Nullable MysqlSslConfigArgs sslConfig) {
            this.sslConfig = Codegen.ofNullable(sslConfig);
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public MysqlProfileArgs build() {
            return new MysqlProfileArgs(hostname, password, port, sslConfig, username);
        }
    }
}

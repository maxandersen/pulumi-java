// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Forward SSH Tunnel connectivity.
 * 
 */
public final class ForwardSshTunnelConnectivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardSshTunnelConnectivityArgs Empty = new ForwardSshTunnelConnectivityArgs();

    /**
     * Hostname for the SSH tunnel.
     * 
     */
    @Import(name="hostname", required=true)
      private final Output<String> hostname;

    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * Input only. SSH password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Port for the SSH tunnel, default value is 22.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Input only. SSH private key.
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey == null ? Codegen.empty() : this.privateKey;
    }

    /**
     * Username for the SSH tunnel.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    public ForwardSshTunnelConnectivityArgs(
        Output<String> hostname,
        @Nullable Output<String> password,
        @Nullable Output<Integer> port,
        @Nullable Output<String> privateKey,
        Output<String> username) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = password;
        this.port = port;
        this.privateKey = privateKey;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private ForwardSshTunnelConnectivityArgs() {
        this.hostname = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.privateKey = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardSshTunnelConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> hostname;
        private @Nullable Output<String> password;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> privateKey;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardSshTunnelConnectivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateKey = defaults.privateKey;
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
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
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
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Codegen.ofNullable(privateKey);
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public ForwardSshTunnelConnectivityArgs build() {
            return new ForwardSshTunnelConnectivityArgs(hostname, password, port, privateKey, username);
        }
    }
}

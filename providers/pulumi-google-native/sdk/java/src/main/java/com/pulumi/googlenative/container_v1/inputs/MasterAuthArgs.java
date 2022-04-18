// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.container_v1.inputs.ClientCertificateConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The authentication information for accessing the master endpoint. Authentication can be done using HTTP basic auth or using client certificates.
 * 
 */
public final class MasterAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final MasterAuthArgs Empty = new MasterAuthArgs();

    /**
     * Configuration for client certificate authentication on the cluster. For clusters before v1.12, if no configuration is specified, a client certificate is issued.
     * 
     */
    @Import(name="clientCertificateConfig")
      private final @Nullable Output<ClientCertificateConfigArgs> clientCertificateConfig;

    public Output<ClientCertificateConfigArgs> clientCertificateConfig() {
        return this.clientCertificateConfig == null ? Codegen.empty() : this.clientCertificateConfig;
    }

    /**
     * The password to use for HTTP basic authentication to the master endpoint. Because the master endpoint is open to the Internet, you should create a strong password. If a password is provided for cluster creation, username must be non-empty. Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0 and later, basic authentication can be disabled by leaving username unspecified (or setting it to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public MasterAuthArgs(
        @Nullable Output<ClientCertificateConfigArgs> clientCertificateConfig,
        @Nullable Output<String> password,
        @Nullable Output<String> username) {
        this.clientCertificateConfig = clientCertificateConfig;
        this.password = password;
        this.username = username;
    }

    private MasterAuthArgs() {
        this.clientCertificateConfig = Codegen.empty();
        this.password = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClientCertificateConfigArgs> clientCertificateConfig;
        private @Nullable Output<String> password;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterAuthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificateConfig = defaults.clientCertificateConfig;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder clientCertificateConfig(@Nullable Output<ClientCertificateConfigArgs> clientCertificateConfig) {
            this.clientCertificateConfig = clientCertificateConfig;
            return this;
        }
        public Builder clientCertificateConfig(@Nullable ClientCertificateConfigArgs clientCertificateConfig) {
            this.clientCertificateConfig = Codegen.ofNullable(clientCertificateConfig);
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
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public MasterAuthArgs build() {
            return new MasterAuthArgs(clientCertificateConfig, password, username);
        }
    }
}

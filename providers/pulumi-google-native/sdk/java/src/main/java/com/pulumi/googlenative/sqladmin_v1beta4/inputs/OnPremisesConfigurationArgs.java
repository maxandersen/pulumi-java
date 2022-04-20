// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.InstanceReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * On-premises instance configuration.
 * 
 */
public final class OnPremisesConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnPremisesConfigurationArgs Empty = new OnPremisesConfigurationArgs();

    /**
     * PEM representation of the trusted CA&#39;s x509 certificate.
     * 
     */
    @Import(name="caCertificate")
      private final @Nullable Output<String> caCertificate;

    public Output<String> caCertificate() {
        return this.caCertificate == null ? Codegen.empty() : this.caCertificate;
    }

    /**
     * PEM representation of the replica&#39;s x509 certificate.
     * 
     */
    @Import(name="clientCertificate")
      private final @Nullable Output<String> clientCertificate;

    public Output<String> clientCertificate() {
        return this.clientCertificate == null ? Codegen.empty() : this.clientCertificate;
    }

    /**
     * PEM representation of the replica&#39;s private key. The corresponsing public key is encoded in the client&#39;s certificate.
     * 
     */
    @Import(name="clientKey")
      private final @Nullable Output<String> clientKey;

    public Output<String> clientKey() {
        return this.clientKey == null ? Codegen.empty() : this.clientKey;
    }

    /**
     * The dump file to create the Cloud SQL replica.
     * 
     */
    @Import(name="dumpFilePath")
      private final @Nullable Output<String> dumpFilePath;

    public Output<String> dumpFilePath() {
        return this.dumpFilePath == null ? Codegen.empty() : this.dumpFilePath;
    }

    /**
     * The host and port of the on-premises instance in host:port format
     * 
     */
    @Import(name="hostPort")
      private final @Nullable Output<String> hostPort;

    public Output<String> hostPort() {
        return this.hostPort == null ? Codegen.empty() : this.hostPort;
    }

    /**
     * This is always `sql#onPremisesConfiguration`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The password for connecting to on-premises instance.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The reference to Cloud SQL instance if the source is Cloud SQL.
     * 
     */
    @Import(name="sourceInstance")
      private final @Nullable Output<InstanceReferenceArgs> sourceInstance;

    public Output<InstanceReferenceArgs> sourceInstance() {
        return this.sourceInstance == null ? Codegen.empty() : this.sourceInstance;
    }

    /**
     * The username for connecting to on-premises instance.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public OnPremisesConfigurationArgs(
        @Nullable Output<String> caCertificate,
        @Nullable Output<String> clientCertificate,
        @Nullable Output<String> clientKey,
        @Nullable Output<String> dumpFilePath,
        @Nullable Output<String> hostPort,
        @Nullable Output<String> kind,
        @Nullable Output<String> password,
        @Nullable Output<InstanceReferenceArgs> sourceInstance,
        @Nullable Output<String> username) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.dumpFilePath = dumpFilePath;
        this.hostPort = hostPort;
        this.kind = kind;
        this.password = password;
        this.sourceInstance = sourceInstance;
        this.username = username;
    }

    private OnPremisesConfigurationArgs() {
        this.caCertificate = Codegen.empty();
        this.clientCertificate = Codegen.empty();
        this.clientKey = Codegen.empty();
        this.dumpFilePath = Codegen.empty();
        this.hostPort = Codegen.empty();
        this.kind = Codegen.empty();
        this.password = Codegen.empty();
        this.sourceInstance = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremisesConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caCertificate;
        private @Nullable Output<String> clientCertificate;
        private @Nullable Output<String> clientKey;
        private @Nullable Output<String> dumpFilePath;
        private @Nullable Output<String> hostPort;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> password;
        private @Nullable Output<InstanceReferenceArgs> sourceInstance;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremisesConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.hostPort = defaults.hostPort;
    	      this.kind = defaults.kind;
    	      this.password = defaults.password;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.username = defaults.username;
        }

        public Builder caCertificate(@Nullable Output<String> caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }
        public Builder caCertificate(@Nullable String caCertificate) {
            this.caCertificate = Codegen.ofNullable(caCertificate);
            return this;
        }
        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }
        public Builder clientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = Codegen.ofNullable(clientCertificate);
            return this;
        }
        public Builder clientKey(@Nullable Output<String> clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = Codegen.ofNullable(clientKey);
            return this;
        }
        public Builder dumpFilePath(@Nullable Output<String> dumpFilePath) {
            this.dumpFilePath = dumpFilePath;
            return this;
        }
        public Builder dumpFilePath(@Nullable String dumpFilePath) {
            this.dumpFilePath = Codegen.ofNullable(dumpFilePath);
            return this;
        }
        public Builder hostPort(@Nullable Output<String> hostPort) {
            this.hostPort = hostPort;
            return this;
        }
        public Builder hostPort(@Nullable String hostPort) {
            this.hostPort = Codegen.ofNullable(hostPort);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
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
        public Builder sourceInstance(@Nullable Output<InstanceReferenceArgs> sourceInstance) {
            this.sourceInstance = sourceInstance;
            return this;
        }
        public Builder sourceInstance(@Nullable InstanceReferenceArgs sourceInstance) {
            this.sourceInstance = Codegen.ofNullable(sourceInstance);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public OnPremisesConfigurationArgs build() {
            return new OnPremisesConfigurationArgs(caCertificate, clientCertificate, clientKey, dumpFilePath, hostPort, kind, password, sourceInstance, username);
        }
    }
}

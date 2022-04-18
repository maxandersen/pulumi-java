// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.sqladmin_v1.outputs.InstanceReferenceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OnPremisesConfigurationResponse {
    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
     */
    private final String caCertificate;
    /**
     * PEM representation of the replica's x509 certificate.
     * 
     */
    private final String clientCertificate;
    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
     */
    private final String clientKey;
    /**
     * The dump file to create the Cloud SQL replica.
     * 
     */
    private final String dumpFilePath;
    /**
     * The host and port of the on-premises instance in host:port format
     * 
     */
    private final String hostPort;
    /**
     * This is always `sql#onPremisesConfiguration`.
     * 
     */
    private final String kind;
    /**
     * The password for connecting to on-premises instance.
     * 
     */
    private final String password;
    /**
     * The reference to Cloud SQL instance if the source is Cloud SQL.
     * 
     */
    private final InstanceReferenceResponse sourceInstance;
    /**
     * The username for connecting to on-premises instance.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private OnPremisesConfigurationResponse(
        @CustomType.Parameter("caCertificate") String caCertificate,
        @CustomType.Parameter("clientCertificate") String clientCertificate,
        @CustomType.Parameter("clientKey") String clientKey,
        @CustomType.Parameter("dumpFilePath") String dumpFilePath,
        @CustomType.Parameter("hostPort") String hostPort,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("sourceInstance") InstanceReferenceResponse sourceInstance,
        @CustomType.Parameter("username") String username) {
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

    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
    */
    public String caCertificate() {
        return this.caCertificate;
    }
    /**
     * PEM representation of the replica's x509 certificate.
     * 
    */
    public String clientCertificate() {
        return this.clientCertificate;
    }
    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
    */
    public String clientKey() {
        return this.clientKey;
    }
    /**
     * The dump file to create the Cloud SQL replica.
     * 
    */
    public String dumpFilePath() {
        return this.dumpFilePath;
    }
    /**
     * The host and port of the on-premises instance in host:port format
     * 
    */
    public String hostPort() {
        return this.hostPort;
    }
    /**
     * This is always `sql#onPremisesConfiguration`.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The password for connecting to on-premises instance.
     * 
    */
    public String password() {
        return this.password;
    }
    /**
     * The reference to Cloud SQL instance if the source is Cloud SQL.
     * 
    */
    public InstanceReferenceResponse sourceInstance() {
        return this.sourceInstance;
    }
    /**
     * The username for connecting to on-premises instance.
     * 
    */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremisesConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private String clientCertificate;
        private String clientKey;
        private String dumpFilePath;
        private String hostPort;
        private String kind;
        private String password;
        private InstanceReferenceResponse sourceInstance;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremisesConfigurationResponse defaults) {
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

        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }
        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }
        public Builder clientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }
        public Builder dumpFilePath(String dumpFilePath) {
            this.dumpFilePath = Objects.requireNonNull(dumpFilePath);
            return this;
        }
        public Builder hostPort(String hostPort) {
            this.hostPort = Objects.requireNonNull(hostPort);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder sourceInstance(InstanceReferenceResponse sourceInstance) {
            this.sourceInstance = Objects.requireNonNull(sourceInstance);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public OnPremisesConfigurationResponse build() {
            return new OnPremisesConfigurationResponse(caCertificate, clientCertificate, clientKey, dumpFilePath, hostPort, kind, password, sourceInstance, username);
        }
    }
}

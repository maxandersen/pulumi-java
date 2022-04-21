// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs();

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustAdminServer")
    private @Nullable Output<String> crossRealmTrustAdminServer;

    public Optional<Output<String>> crossRealmTrustAdminServer() {
        return Optional.ofNullable(this.crossRealmTrustAdminServer);
    }

    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustKdc")
    private @Nullable Output<String> crossRealmTrustKdc;

    public Optional<Output<String>> crossRealmTrustKdc() {
        return Optional.ofNullable(this.crossRealmTrustKdc);
    }

    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    @Import(name="crossRealmTrustRealm")
    private @Nullable Output<String> crossRealmTrustRealm;

    public Optional<Output<String>> crossRealmTrustRealm() {
        return Optional.ofNullable(this.crossRealmTrustRealm);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustSharedPassword")
    private @Nullable Output<String> crossRealmTrustSharedPassword;

    public Optional<Output<String>> crossRealmTrustSharedPassword() {
        return Optional.ofNullable(this.crossRealmTrustSharedPassword);
    }

    /**
     * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    @Import(name="enableKerberos")
    private @Nullable Output<Boolean> enableKerberos;

    public Optional<Output<Boolean>> enableKerberos() {
        return Optional.ofNullable(this.enableKerberos);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    @Import(name="kdcDbKey")
    private @Nullable Output<String> kdcDbKey;

    public Optional<Output<String>> kdcDbKey() {
        return Optional.ofNullable(this.kdcDbKey);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keyPassword")
    private @Nullable Output<String> keyPassword;

    public Optional<Output<String>> keyPassword() {
        return Optional.ofNullable(this.keyPassword);
    }

    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="keystore")
    private @Nullable Output<String> keystore;

    public Optional<Output<String>> keystore() {
        return Optional.ofNullable(this.keystore);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keystorePassword")
    private @Nullable Output<String> keystorePassword;

    public Optional<Output<String>> keystorePassword() {
        return Optional.ofNullable(this.keystorePassword);
    }

    /**
     * Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    @Import(name="realm")
    private @Nullable Output<String> realm;

    public Optional<Output<String>> realm() {
        return Optional.ofNullable(this.realm);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    @Import(name="rootPrincipalPassword")
    private @Nullable Output<String> rootPrincipalPassword;

    public Optional<Output<String>> rootPrincipalPassword() {
        return Optional.ofNullable(this.rootPrincipalPassword);
    }

    /**
     * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    @Import(name="tgtLifetimeHours")
    private @Nullable Output<Integer> tgtLifetimeHours;

    public Optional<Output<Integer>> tgtLifetimeHours() {
        return Optional.ofNullable(this.tgtLifetimeHours);
    }

    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="truststore")
    private @Nullable Output<String> truststore;

    public Optional<Output<String>> truststore() {
        return Optional.ofNullable(this.truststore);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="truststorePassword")
    private @Nullable Output<String> truststorePassword;

    public Optional<Output<String>> truststorePassword() {
        return Optional.ofNullable(this.truststorePassword);
    }

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs $) {
        this.crossRealmTrustAdminServer = $.crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = $.crossRealmTrustKdc;
        this.crossRealmTrustRealm = $.crossRealmTrustRealm;
        this.crossRealmTrustSharedPassword = $.crossRealmTrustSharedPassword;
        this.enableKerberos = $.enableKerberos;
        this.kdcDbKey = $.kdcDbKey;
        this.keyPassword = $.keyPassword;
        this.keystore = $.keystore;
        this.keystorePassword = $.keystorePassword;
        this.kmsKey = $.kmsKey;
        this.realm = $.realm;
        this.rootPrincipalPassword = $.rootPrincipalPassword;
        this.tgtLifetimeHours = $.tgtLifetimeHours;
        this.truststore = $.truststore;
        this.truststorePassword = $.truststorePassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder crossRealmTrustAdminServer(@Nullable Output<String> crossRealmTrustAdminServer) {
            $.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }

        public Builder crossRealmTrustAdminServer(String crossRealmTrustAdminServer) {
            return crossRealmTrustAdminServer(Output.of(crossRealmTrustAdminServer));
        }

        public Builder crossRealmTrustKdc(@Nullable Output<String> crossRealmTrustKdc) {
            $.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }

        public Builder crossRealmTrustKdc(String crossRealmTrustKdc) {
            return crossRealmTrustKdc(Output.of(crossRealmTrustKdc));
        }

        public Builder crossRealmTrustRealm(@Nullable Output<String> crossRealmTrustRealm) {
            $.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }

        public Builder crossRealmTrustRealm(String crossRealmTrustRealm) {
            return crossRealmTrustRealm(Output.of(crossRealmTrustRealm));
        }

        public Builder crossRealmTrustSharedPassword(@Nullable Output<String> crossRealmTrustSharedPassword) {
            $.crossRealmTrustSharedPassword = crossRealmTrustSharedPassword;
            return this;
        }

        public Builder crossRealmTrustSharedPassword(String crossRealmTrustSharedPassword) {
            return crossRealmTrustSharedPassword(Output.of(crossRealmTrustSharedPassword));
        }

        public Builder enableKerberos(@Nullable Output<Boolean> enableKerberos) {
            $.enableKerberos = enableKerberos;
            return this;
        }

        public Builder enableKerberos(Boolean enableKerberos) {
            return enableKerberos(Output.of(enableKerberos));
        }

        public Builder kdcDbKey(@Nullable Output<String> kdcDbKey) {
            $.kdcDbKey = kdcDbKey;
            return this;
        }

        public Builder kdcDbKey(String kdcDbKey) {
            return kdcDbKey(Output.of(kdcDbKey));
        }

        public Builder keyPassword(@Nullable Output<String> keyPassword) {
            $.keyPassword = keyPassword;
            return this;
        }

        public Builder keyPassword(String keyPassword) {
            return keyPassword(Output.of(keyPassword));
        }

        public Builder keystore(@Nullable Output<String> keystore) {
            $.keystore = keystore;
            return this;
        }

        public Builder keystore(String keystore) {
            return keystore(Output.of(keystore));
        }

        public Builder keystorePassword(@Nullable Output<String> keystorePassword) {
            $.keystorePassword = keystorePassword;
            return this;
        }

        public Builder keystorePassword(String keystorePassword) {
            return keystorePassword(Output.of(keystorePassword));
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public Builder realm(@Nullable Output<String> realm) {
            $.realm = realm;
            return this;
        }

        public Builder realm(String realm) {
            return realm(Output.of(realm));
        }

        public Builder rootPrincipalPassword(@Nullable Output<String> rootPrincipalPassword) {
            $.rootPrincipalPassword = rootPrincipalPassword;
            return this;
        }

        public Builder rootPrincipalPassword(String rootPrincipalPassword) {
            return rootPrincipalPassword(Output.of(rootPrincipalPassword));
        }

        public Builder tgtLifetimeHours(@Nullable Output<Integer> tgtLifetimeHours) {
            $.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }

        public Builder tgtLifetimeHours(Integer tgtLifetimeHours) {
            return tgtLifetimeHours(Output.of(tgtLifetimeHours));
        }

        public Builder truststore(@Nullable Output<String> truststore) {
            $.truststore = truststore;
            return this;
        }

        public Builder truststore(String truststore) {
            return truststore(Output.of(truststore));
        }

        public Builder truststorePassword(@Nullable Output<String> truststorePassword) {
            $.truststorePassword = truststorePassword;
            return this;
        }

        public Builder truststorePassword(String truststorePassword) {
            return truststorePassword(Output.of(truststorePassword));
        }

        public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigGetArgs build() {
            return $;
        }
    }

}

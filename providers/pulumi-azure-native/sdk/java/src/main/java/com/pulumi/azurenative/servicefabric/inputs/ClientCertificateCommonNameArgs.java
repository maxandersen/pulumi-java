// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the client certificate details using common name.
 * 
 */
public final class ClientCertificateCommonNameArgs extends ResourceArgs {

    public static final ClientCertificateCommonNameArgs Empty = new ClientCertificateCommonNameArgs();

    /**
     * The common name of the client certificate.
     * 
     */
    @Import(name="certificateCommonName", required=true)
    private Output<String> certificateCommonName;

    /**
     * @return The common name of the client certificate.
     * 
     */
    public Output<String> certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * The issuer thumbprint of the client certificate.
     * 
     */
    @Import(name="certificateIssuerThumbprint", required=true)
    private Output<String> certificateIssuerThumbprint;

    /**
     * @return The issuer thumbprint of the client certificate.
     * 
     */
    public Output<String> certificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    /**
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    @Import(name="isAdmin", required=true)
    private Output<Boolean> isAdmin;

    /**
     * @return Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    public Output<Boolean> isAdmin() {
        return this.isAdmin;
    }

    private ClientCertificateCommonNameArgs() {}

    private ClientCertificateCommonNameArgs(ClientCertificateCommonNameArgs $) {
        this.certificateCommonName = $.certificateCommonName;
        this.certificateIssuerThumbprint = $.certificateIssuerThumbprint;
        this.isAdmin = $.isAdmin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCertificateCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCertificateCommonNameArgs $;

        public Builder() {
            $ = new ClientCertificateCommonNameArgs();
        }

        public Builder(ClientCertificateCommonNameArgs defaults) {
            $ = new ClientCertificateCommonNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateCommonName The common name of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateCommonName(Output<String> certificateCommonName) {
            $.certificateCommonName = certificateCommonName;
            return this;
        }

        /**
         * @param certificateCommonName The common name of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateCommonName(String certificateCommonName) {
            return certificateCommonName(Output.of(certificateCommonName));
        }

        /**
         * @param certificateIssuerThumbprint The issuer thumbprint of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateIssuerThumbprint(Output<String> certificateIssuerThumbprint) {
            $.certificateIssuerThumbprint = certificateIssuerThumbprint;
            return this;
        }

        /**
         * @param certificateIssuerThumbprint The issuer thumbprint of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateIssuerThumbprint(String certificateIssuerThumbprint) {
            return certificateIssuerThumbprint(Output.of(certificateIssuerThumbprint));
        }

        /**
         * @param isAdmin Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder isAdmin(Output<Boolean> isAdmin) {
            $.isAdmin = isAdmin;
            return this;
        }

        /**
         * @param isAdmin Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder isAdmin(Boolean isAdmin) {
            return isAdmin(Output.of(isAdmin));
        }

        public ClientCertificateCommonNameArgs build() {
            $.certificateCommonName = Objects.requireNonNull($.certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
            $.certificateIssuerThumbprint = Objects.requireNonNull($.certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
            $.isAdmin = Objects.requireNonNull($.isAdmin, "expected parameter 'isAdmin' to be non-null");
            return $;
        }
    }

}

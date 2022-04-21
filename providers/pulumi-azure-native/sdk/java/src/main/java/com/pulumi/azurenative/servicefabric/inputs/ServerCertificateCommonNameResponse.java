// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the server certificate details using common name.
 * 
 */
public final class ServerCertificateCommonNameResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServerCertificateCommonNameResponse Empty = new ServerCertificateCommonNameResponse();

    /**
     * The common name of the server certificate.
     * 
     */
    @Import(name="certificateCommonName", required=true)
    private String certificateCommonName;

    public String certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * The issuer thumbprint of the server certificate.
     * 
     */
    @Import(name="certificateIssuerThumbprint", required=true)
    private String certificateIssuerThumbprint;

    public String certificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    private ServerCertificateCommonNameResponse() {}

    private ServerCertificateCommonNameResponse(ServerCertificateCommonNameResponse $) {
        this.certificateCommonName = $.certificateCommonName;
        this.certificateIssuerThumbprint = $.certificateIssuerThumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerCertificateCommonNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerCertificateCommonNameResponse $;

        public Builder() {
            $ = new ServerCertificateCommonNameResponse();
        }

        public Builder(ServerCertificateCommonNameResponse defaults) {
            $ = new ServerCertificateCommonNameResponse(Objects.requireNonNull(defaults));
        }

        public Builder certificateCommonName(String certificateCommonName) {
            $.certificateCommonName = certificateCommonName;
            return this;
        }

        public Builder certificateIssuerThumbprint(String certificateIssuerThumbprint) {
            $.certificateIssuerThumbprint = certificateIssuerThumbprint;
            return this;
        }

        public ServerCertificateCommonNameResponse build() {
            $.certificateCommonName = Objects.requireNonNull($.certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
            $.certificateIssuerThumbprint = Objects.requireNonNull($.certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
            return $;
        }
    }

}

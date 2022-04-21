// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration and status of a self-managed SSL certificate.
 * 
 */
public final class SslCertificateSelfManagedSslCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final SslCertificateSelfManagedSslCertificateResponse Empty = new SslCertificateSelfManagedSslCertificateResponse();

    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @Import(name="certificate", required=true)
    private String certificate;

    public String certificate() {
        return this.certificate;
    }

    /**
     * A write-only private key in PEM format. Only insert requests will include this field.
     * 
     */
    @Import(name="privateKey", required=true)
    private String privateKey;

    public String privateKey() {
        return this.privateKey;
    }

    private SslCertificateSelfManagedSslCertificateResponse() {}

    private SslCertificateSelfManagedSslCertificateResponse(SslCertificateSelfManagedSslCertificateResponse $) {
        this.certificate = $.certificate;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslCertificateSelfManagedSslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslCertificateSelfManagedSslCertificateResponse $;

        public Builder() {
            $ = new SslCertificateSelfManagedSslCertificateResponse();
        }

        public Builder(SslCertificateSelfManagedSslCertificateResponse defaults) {
            $ = new SslCertificateSelfManagedSslCertificateResponse(Objects.requireNonNull(defaults));
        }

        public Builder certificate(String certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder privateKey(String privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public SslCertificateSelfManagedSslCertificateResponse build() {
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.privateKey = Objects.requireNonNull($.privateKey, "expected parameter 'privateKey' to be non-null");
            return $;
        }
    }

}

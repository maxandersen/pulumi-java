// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * Boolean flag to indicate if the certificate should be active
     * 
     */
    @Import(name="active", required=true)
    private Output<Boolean> active;

    public Output<Boolean> active() {
        return this.active;
    }

    /**
     * The certificate signing request. Review
     * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
     * for more information on generating a certificate from a certificate signing request (CSR).
     * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
     * for more information on generating keys and a certificate.
     * 
     */
    @Import(name="csr")
    private @Nullable Output<String> csr;

    public Optional<Output<String>> csr() {
        return Optional.ofNullable(this.csr);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.active = $.active;
        this.csr = $.csr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder active(Output<Boolean> active) {
            $.active = active;
            return this;
        }

        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        public Builder csr(@Nullable Output<String> csr) {
            $.csr = csr;
            return this;
        }

        public Builder csr(String csr) {
            return csr(Output.of(csr));
        }

        public CertificateArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.inputs;

import com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationCrlConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityRevocationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityRevocationConfigurationArgs Empty = new CertificateAuthorityRevocationConfigurationArgs();

    /**
     * Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
     * 
     */
    @Import(name="crlConfiguration")
    private @Nullable Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs> crlConfiguration;

    /**
     * @return Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
     * 
     */
    public Optional<Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs>> crlConfiguration() {
        return Optional.ofNullable(this.crlConfiguration);
    }

    private CertificateAuthorityRevocationConfigurationArgs() {}

    private CertificateAuthorityRevocationConfigurationArgs(CertificateAuthorityRevocationConfigurationArgs $) {
        this.crlConfiguration = $.crlConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityRevocationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityRevocationConfigurationArgs $;

        public Builder() {
            $ = new CertificateAuthorityRevocationConfigurationArgs();
        }

        public Builder(CertificateAuthorityRevocationConfigurationArgs defaults) {
            $ = new CertificateAuthorityRevocationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crlConfiguration Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder crlConfiguration(@Nullable Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs> crlConfiguration) {
            $.crlConfiguration = crlConfiguration;
            return this;
        }

        /**
         * @param crlConfiguration Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder crlConfiguration(CertificateAuthorityRevocationConfigurationCrlConfigurationArgs crlConfiguration) {
            return crlConfiguration(Output.of(crlConfiguration));
        }

        public CertificateAuthorityRevocationConfigurationArgs build() {
            return $;
        }
    }

}

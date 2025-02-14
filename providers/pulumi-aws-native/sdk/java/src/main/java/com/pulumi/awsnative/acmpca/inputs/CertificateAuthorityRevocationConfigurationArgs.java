// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityCrlConfigurationArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityOcspConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Certificate Authority revocation information.
 * 
 */
public final class CertificateAuthorityRevocationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityRevocationConfigurationArgs Empty = new CertificateAuthorityRevocationConfigurationArgs();

    @Import(name="crlConfiguration")
    private @Nullable Output<CertificateAuthorityCrlConfigurationArgs> crlConfiguration;

    public Optional<Output<CertificateAuthorityCrlConfigurationArgs>> crlConfiguration() {
        return Optional.ofNullable(this.crlConfiguration);
    }

    @Import(name="ocspConfiguration")
    private @Nullable Output<CertificateAuthorityOcspConfigurationArgs> ocspConfiguration;

    public Optional<Output<CertificateAuthorityOcspConfigurationArgs>> ocspConfiguration() {
        return Optional.ofNullable(this.ocspConfiguration);
    }

    private CertificateAuthorityRevocationConfigurationArgs() {}

    private CertificateAuthorityRevocationConfigurationArgs(CertificateAuthorityRevocationConfigurationArgs $) {
        this.crlConfiguration = $.crlConfiguration;
        this.ocspConfiguration = $.ocspConfiguration;
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

        public Builder crlConfiguration(@Nullable Output<CertificateAuthorityCrlConfigurationArgs> crlConfiguration) {
            $.crlConfiguration = crlConfiguration;
            return this;
        }

        public Builder crlConfiguration(CertificateAuthorityCrlConfigurationArgs crlConfiguration) {
            return crlConfiguration(Output.of(crlConfiguration));
        }

        public Builder ocspConfiguration(@Nullable Output<CertificateAuthorityOcspConfigurationArgs> ocspConfiguration) {
            $.ocspConfiguration = ocspConfiguration;
            return this;
        }

        public Builder ocspConfiguration(CertificateAuthorityOcspConfigurationArgs ocspConfiguration) {
            return ocspConfiguration(Output.of(ocspConfiguration));
        }

        public CertificateAuthorityRevocationConfigurationArgs build() {
            return $;
        }
    }

}

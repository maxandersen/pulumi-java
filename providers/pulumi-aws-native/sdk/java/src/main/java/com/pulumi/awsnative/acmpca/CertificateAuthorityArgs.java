// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca;

import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityCsrExtensionsArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthoritySubjectArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    /**
     * Structure that contains CSR pass through extension information used by the CreateCertificateAuthority action.
     * 
     */
    @Import(name="csrExtensions")
    private @Nullable Output<CertificateAuthorityCsrExtensionsArgs> csrExtensions;

    public Optional<Output<CertificateAuthorityCsrExtensionsArgs>> csrExtensions() {
        return Optional.ofNullable(this.csrExtensions);
    }

    /**
     * Public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate.
     * 
     */
    @Import(name="keyAlgorithm", required=true)
    private Output<String> keyAlgorithm;

    public Output<String> keyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * KeyStorageSecurityStadard defines a cryptographic key management compliance standard used for handling CA keys.
     * 
     */
    @Import(name="keyStorageSecurityStandard")
    private @Nullable Output<String> keyStorageSecurityStandard;

    public Optional<Output<String>> keyStorageSecurityStandard() {
        return Optional.ofNullable(this.keyStorageSecurityStandard);
    }

    /**
     * Certificate revocation information used by the CreateCertificateAuthority and UpdateCertificateAuthority actions.
     * 
     */
    @Import(name="revocationConfiguration")
    private @Nullable Output<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration;

    public Optional<Output<CertificateAuthorityRevocationConfigurationArgs>> revocationConfiguration() {
        return Optional.ofNullable(this.revocationConfiguration);
    }

    /**
     * Algorithm your CA uses to sign certificate requests.
     * 
     */
    @Import(name="signingAlgorithm", required=true)
    private Output<String> signingAlgorithm;

    public Output<String> signingAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * Structure that contains X.500 distinguished name information for your CA.
     * 
     */
    @Import(name="subject", required=true)
    private Output<CertificateAuthoritySubjectArgs> subject;

    public Output<CertificateAuthoritySubjectArgs> subject() {
        return this.subject;
    }

    @Import(name="tags")
    private @Nullable Output<List<CertificateAuthorityTagArgs>> tags;

    public Optional<Output<List<CertificateAuthorityTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the certificate authority.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private CertificateAuthorityArgs() {}

    private CertificateAuthorityArgs(CertificateAuthorityArgs $) {
        this.csrExtensions = $.csrExtensions;
        this.keyAlgorithm = $.keyAlgorithm;
        this.keyStorageSecurityStandard = $.keyStorageSecurityStandard;
        this.revocationConfiguration = $.revocationConfiguration;
        this.signingAlgorithm = $.signingAlgorithm;
        this.subject = $.subject;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityArgs $;

        public Builder() {
            $ = new CertificateAuthorityArgs();
        }

        public Builder(CertificateAuthorityArgs defaults) {
            $ = new CertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        public Builder csrExtensions(@Nullable Output<CertificateAuthorityCsrExtensionsArgs> csrExtensions) {
            $.csrExtensions = csrExtensions;
            return this;
        }

        public Builder csrExtensions(CertificateAuthorityCsrExtensionsArgs csrExtensions) {
            return csrExtensions(Output.of(csrExtensions));
        }

        public Builder keyAlgorithm(Output<String> keyAlgorithm) {
            $.keyAlgorithm = keyAlgorithm;
            return this;
        }

        public Builder keyAlgorithm(String keyAlgorithm) {
            return keyAlgorithm(Output.of(keyAlgorithm));
        }

        public Builder keyStorageSecurityStandard(@Nullable Output<String> keyStorageSecurityStandard) {
            $.keyStorageSecurityStandard = keyStorageSecurityStandard;
            return this;
        }

        public Builder keyStorageSecurityStandard(String keyStorageSecurityStandard) {
            return keyStorageSecurityStandard(Output.of(keyStorageSecurityStandard));
        }

        public Builder revocationConfiguration(@Nullable Output<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration) {
            $.revocationConfiguration = revocationConfiguration;
            return this;
        }

        public Builder revocationConfiguration(CertificateAuthorityRevocationConfigurationArgs revocationConfiguration) {
            return revocationConfiguration(Output.of(revocationConfiguration));
        }

        public Builder signingAlgorithm(Output<String> signingAlgorithm) {
            $.signingAlgorithm = signingAlgorithm;
            return this;
        }

        public Builder signingAlgorithm(String signingAlgorithm) {
            return signingAlgorithm(Output.of(signingAlgorithm));
        }

        public Builder subject(Output<CertificateAuthoritySubjectArgs> subject) {
            $.subject = subject;
            return this;
        }

        public Builder subject(CertificateAuthoritySubjectArgs subject) {
            return subject(Output.of(subject));
        }

        public Builder tags(@Nullable Output<List<CertificateAuthorityTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<CertificateAuthorityTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(CertificateAuthorityTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CertificateAuthorityArgs build() {
            $.keyAlgorithm = Objects.requireNonNull($.keyAlgorithm, "expected parameter 'keyAlgorithm' to be non-null");
            $.signingAlgorithm = Objects.requireNonNull($.signingAlgorithm, "expected parameter 'signingAlgorithm' to be non-null");
            $.subject = Objects.requireNonNull($.subject, "expected parameter 'subject' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}

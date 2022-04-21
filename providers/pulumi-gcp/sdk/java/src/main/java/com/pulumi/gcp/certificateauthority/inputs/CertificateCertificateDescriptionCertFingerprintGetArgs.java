// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionCertFingerprintGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionCertFingerprintGetArgs Empty = new CertificateCertificateDescriptionCertFingerprintGetArgs();

    @Import(name="sha256Hash")
    private @Nullable Output<String> sha256Hash;

    public Optional<Output<String>> sha256Hash() {
        return Optional.ofNullable(this.sha256Hash);
    }

    private CertificateCertificateDescriptionCertFingerprintGetArgs() {}

    private CertificateCertificateDescriptionCertFingerprintGetArgs(CertificateCertificateDescriptionCertFingerprintGetArgs $) {
        this.sha256Hash = $.sha256Hash;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionCertFingerprintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionCertFingerprintGetArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionCertFingerprintGetArgs();
        }

        public Builder(CertificateCertificateDescriptionCertFingerprintGetArgs defaults) {
            $ = new CertificateCertificateDescriptionCertFingerprintGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder sha256Hash(@Nullable Output<String> sha256Hash) {
            $.sha256Hash = sha256Hash;
            return this;
        }

        public Builder sha256Hash(String sha256Hash) {
            return sha256Hash(Output.of(sha256Hash));
        }

        public CertificateCertificateDescriptionCertFingerprintGetArgs build() {
            return $;
        }
    }

}

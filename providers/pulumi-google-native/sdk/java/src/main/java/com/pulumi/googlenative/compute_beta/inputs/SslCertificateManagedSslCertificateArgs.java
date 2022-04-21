// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration and status of a managed SSL certificate.
 * 
 */
public final class SslCertificateManagedSslCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslCertificateManagedSslCertificateArgs Empty = new SslCertificateManagedSslCertificateArgs();

    /**
     * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    private SslCertificateManagedSslCertificateArgs() {}

    private SslCertificateManagedSslCertificateArgs(SslCertificateManagedSslCertificateArgs $) {
        this.domains = $.domains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslCertificateManagedSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslCertificateManagedSslCertificateArgs $;

        public Builder() {
            $ = new SslCertificateManagedSslCertificateArgs();
        }

        public Builder(SslCertificateManagedSslCertificateArgs defaults) {
            $ = new SslCertificateManagedSslCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        public SslCertificateManagedSslCertificateArgs build() {
            return $;
        }
    }

}

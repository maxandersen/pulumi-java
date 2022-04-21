// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.CdnCertificateSourceParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the certificate source parameters using CDN managed certificate for enabling SSL.
 * 
 */
public final class CdnManagedHttpsParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final CdnManagedHttpsParametersResponse Empty = new CdnManagedHttpsParametersResponse();

    /**
     * Defines the source of the SSL certificate.
     * Expected value is &#39;Cdn&#39;.
     * 
     */
    @Import(name="certificateSource", required=true)
    private String certificateSource;

    public String certificateSource() {
        return this.certificateSource;
    }

    /**
     * Defines the certificate source parameters using CDN managed certificate for enabling SSL.
     * 
     */
    @Import(name="certificateSourceParameters", required=true)
    private CdnCertificateSourceParametersResponse certificateSourceParameters;

    public CdnCertificateSourceParametersResponse certificateSourceParameters() {
        return this.certificateSourceParameters;
    }

    /**
     * TLS protocol version that will be used for Https
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable String minimumTlsVersion;

    public Optional<String> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * Defines the TLS extension protocol that is used for secure delivery.
     * 
     */
    @Import(name="protocolType", required=true)
    private String protocolType;

    public String protocolType() {
        return this.protocolType;
    }

    private CdnManagedHttpsParametersResponse() {}

    private CdnManagedHttpsParametersResponse(CdnManagedHttpsParametersResponse $) {
        this.certificateSource = $.certificateSource;
        this.certificateSourceParameters = $.certificateSourceParameters;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.protocolType = $.protocolType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CdnManagedHttpsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CdnManagedHttpsParametersResponse $;

        public Builder() {
            $ = new CdnManagedHttpsParametersResponse();
        }

        public Builder(CdnManagedHttpsParametersResponse defaults) {
            $ = new CdnManagedHttpsParametersResponse(Objects.requireNonNull(defaults));
        }

        public Builder certificateSource(String certificateSource) {
            $.certificateSource = certificateSource;
            return this;
        }

        public Builder certificateSourceParameters(CdnCertificateSourceParametersResponse certificateSourceParameters) {
            $.certificateSourceParameters = certificateSourceParameters;
            return this;
        }

        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder protocolType(String protocolType) {
            $.protocolType = protocolType;
            return this;
        }

        public CdnManagedHttpsParametersResponse build() {
            $.certificateSource = Codegen.stringProp("certificateSource").arg($.certificateSource).require();
            $.certificateSourceParameters = Objects.requireNonNull($.certificateSourceParameters, "expected parameter 'certificateSourceParameters' to be non-null");
            $.protocolType = Objects.requireNonNull($.protocolType, "expected parameter 'protocolType' to be non-null");
            return $;
        }
    }

}

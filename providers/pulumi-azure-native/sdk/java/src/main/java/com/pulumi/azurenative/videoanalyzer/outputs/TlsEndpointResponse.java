// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.PemCertificateListResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.SecureIotDeviceRemoteTunnelResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.TlsValidationOptionsResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.UsernamePasswordCredentialsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TlsEndpointResponse {
    /**
     * Credentials to be presented to the endpoint.
     * 
     */
    private final UsernamePasswordCredentialsResponse credentials;
    /**
     * List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer&#39;s list of trusted authorities should be used.
     * 
     */
    private final @Nullable PemCertificateListResponse trustedCertificates;
    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    private final @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.TlsEndpoint&#39;.
     * 
     */
    private final String type;
    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
     */
    private final String url;
    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    private final @Nullable TlsValidationOptionsResponse validationOptions;

    @CustomType.Constructor
    private TlsEndpointResponse(
        @CustomType.Parameter("credentials") UsernamePasswordCredentialsResponse credentials,
        @CustomType.Parameter("trustedCertificates") @Nullable PemCertificateListResponse trustedCertificates,
        @CustomType.Parameter("tunnel") @Nullable SecureIotDeviceRemoteTunnelResponse tunnel,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") String url,
        @CustomType.Parameter("validationOptions") @Nullable TlsValidationOptionsResponse validationOptions) {
        this.credentials = credentials;
        this.trustedCertificates = trustedCertificates;
        this.tunnel = tunnel;
        this.type = type;
        this.url = url;
        this.validationOptions = validationOptions;
    }

    /**
     * Credentials to be presented to the endpoint.
     * 
    */
    public UsernamePasswordCredentialsResponse credentials() {
        return this.credentials;
    }
    /**
     * List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer&#39;s list of trusted authorities should be used.
     * 
    */
    public Optional<PemCertificateListResponse> trustedCertificates() {
        return Optional.ofNullable(this.trustedCertificates);
    }
    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
    */
    public Optional<SecureIotDeviceRemoteTunnelResponse> tunnel() {
        return Optional.ofNullable(this.tunnel);
    }
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.TlsEndpoint&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
    */
    public String url() {
        return this.url;
    }
    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
    */
    public Optional<TlsValidationOptionsResponse> validationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsernamePasswordCredentialsResponse credentials;
        private @Nullable PemCertificateListResponse trustedCertificates;
        private @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;
        private String type;
        private String url;
        private @Nullable TlsValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.trustedCertificates = defaults.trustedCertificates;
    	      this.tunnel = defaults.tunnel;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder credentials(UsernamePasswordCredentialsResponse credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        public Builder trustedCertificates(@Nullable PemCertificateListResponse trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }
        public Builder tunnel(@Nullable SecureIotDeviceRemoteTunnelResponse tunnel) {
            this.tunnel = tunnel;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder validationOptions(@Nullable TlsValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }        public TlsEndpointResponse build() {
            return new TlsEndpointResponse(credentials, trustedCertificates, tunnel, type, url, validationOptions);
        }
    }
}

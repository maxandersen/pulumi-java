// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Configuration and status of a managed SSL certificate.
 * 
 */
public final class SslCertificateManagedSslCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final SslCertificateManagedSslCertificateResponse Empty = new SslCertificateManagedSslCertificateResponse();

    /**
     * [Output only] Detailed statuses of the domains specified for managed certificate resource.
     * 
     */
    @Import(name="domainStatus", required=true)
    private Map<String,String> domainStatus;

    public Map<String,String> domainStatus() {
        return this.domainStatus;
    }

    /**
     * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
     * 
     */
    @Import(name="domains", required=true)
    private List<String> domains;

    public List<String> domains() {
        return this.domains;
    }

    /**
     * [Output only] Status of the managed certificate resource.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    public String status() {
        return this.status;
    }

    private SslCertificateManagedSslCertificateResponse() {}

    private SslCertificateManagedSslCertificateResponse(SslCertificateManagedSslCertificateResponse $) {
        this.domainStatus = $.domainStatus;
        this.domains = $.domains;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslCertificateManagedSslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslCertificateManagedSslCertificateResponse $;

        public Builder() {
            $ = new SslCertificateManagedSslCertificateResponse();
        }

        public Builder(SslCertificateManagedSslCertificateResponse defaults) {
            $ = new SslCertificateManagedSslCertificateResponse(Objects.requireNonNull(defaults));
        }

        public Builder domainStatus(Map<String,String> domainStatus) {
            $.domainStatus = domainStatus;
            return this;
        }

        public Builder domains(List<String> domains) {
            $.domains = domains;
            return this;
        }

        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public SslCertificateManagedSslCertificateResponse build() {
            $.domainStatus = Objects.requireNonNull($.domainStatus, "expected parameter 'domainStatus' to be non-null");
            $.domains = Objects.requireNonNull($.domains, "expected parameter 'domains' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}

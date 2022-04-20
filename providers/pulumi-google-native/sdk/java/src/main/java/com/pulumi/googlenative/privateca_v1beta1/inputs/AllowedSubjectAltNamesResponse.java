// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * AllowedSubjectAltNames specifies the allowed values for SubjectAltNames by the CertificateAuthority when issuing Certificates.
 * 
 */
public final class AllowedSubjectAltNamesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AllowedSubjectAltNamesResponse Empty = new AllowedSubjectAltNamesResponse();

    /**
     * Optional. Specifies if to allow custom X509Extension values.
     * 
     */
    @Import(name="allowCustomSans", required=true)
      private final Boolean allowCustomSans;

    public Boolean allowCustomSans() {
        return this.allowCustomSans;
    }

    /**
     * Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
     * 
     */
    @Import(name="allowGlobbingDnsWildcards", required=true)
      private final Boolean allowGlobbingDnsWildcards;

    public Boolean allowGlobbingDnsWildcards() {
        return this.allowGlobbingDnsWildcards;
    }

    /**
     * Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
     * 
     */
    @Import(name="allowedDnsNames", required=true)
      private final List<String> allowedDnsNames;

    public List<String> allowedDnsNames() {
        return this.allowedDnsNames;
    }

    /**
     * Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
     * 
     */
    @Import(name="allowedEmailAddresses", required=true)
      private final List<String> allowedEmailAddresses;

    public List<String> allowedEmailAddresses() {
        return this.allowedEmailAddresses;
    }

    /**
     * Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the &#39;/&#39; notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
     * 
     */
    @Import(name="allowedIps", required=true)
      private final List<String> allowedIps;

    public List<String> allowedIps() {
        return this.allowedIps;
    }

    /**
     * Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. &#39;/&#39;) use the double star glob pattern (i.e. &#39;**&#39;).
     * 
     */
    @Import(name="allowedUris", required=true)
      private final List<String> allowedUris;

    public List<String> allowedUris() {
        return this.allowedUris;
    }

    public AllowedSubjectAltNamesResponse(
        Boolean allowCustomSans,
        Boolean allowGlobbingDnsWildcards,
        List<String> allowedDnsNames,
        List<String> allowedEmailAddresses,
        List<String> allowedIps,
        List<String> allowedUris) {
        this.allowCustomSans = Objects.requireNonNull(allowCustomSans, "expected parameter 'allowCustomSans' to be non-null");
        this.allowGlobbingDnsWildcards = Objects.requireNonNull(allowGlobbingDnsWildcards, "expected parameter 'allowGlobbingDnsWildcards' to be non-null");
        this.allowedDnsNames = Objects.requireNonNull(allowedDnsNames, "expected parameter 'allowedDnsNames' to be non-null");
        this.allowedEmailAddresses = Objects.requireNonNull(allowedEmailAddresses, "expected parameter 'allowedEmailAddresses' to be non-null");
        this.allowedIps = Objects.requireNonNull(allowedIps, "expected parameter 'allowedIps' to be non-null");
        this.allowedUris = Objects.requireNonNull(allowedUris, "expected parameter 'allowedUris' to be non-null");
    }

    private AllowedSubjectAltNamesResponse() {
        this.allowCustomSans = null;
        this.allowGlobbingDnsWildcards = null;
        this.allowedDnsNames = List.of();
        this.allowedEmailAddresses = List.of();
        this.allowedIps = List.of();
        this.allowedUris = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedSubjectAltNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowCustomSans;
        private Boolean allowGlobbingDnsWildcards;
        private List<String> allowedDnsNames;
        private List<String> allowedEmailAddresses;
        private List<String> allowedIps;
        private List<String> allowedUris;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedSubjectAltNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCustomSans = defaults.allowCustomSans;
    	      this.allowGlobbingDnsWildcards = defaults.allowGlobbingDnsWildcards;
    	      this.allowedDnsNames = defaults.allowedDnsNames;
    	      this.allowedEmailAddresses = defaults.allowedEmailAddresses;
    	      this.allowedIps = defaults.allowedIps;
    	      this.allowedUris = defaults.allowedUris;
        }

        public Builder allowCustomSans(Boolean allowCustomSans) {
            this.allowCustomSans = Objects.requireNonNull(allowCustomSans);
            return this;
        }
        public Builder allowGlobbingDnsWildcards(Boolean allowGlobbingDnsWildcards) {
            this.allowGlobbingDnsWildcards = Objects.requireNonNull(allowGlobbingDnsWildcards);
            return this;
        }
        public Builder allowedDnsNames(List<String> allowedDnsNames) {
            this.allowedDnsNames = Objects.requireNonNull(allowedDnsNames);
            return this;
        }
        public Builder allowedDnsNames(String... allowedDnsNames) {
            return allowedDnsNames(List.of(allowedDnsNames));
        }
        public Builder allowedEmailAddresses(List<String> allowedEmailAddresses) {
            this.allowedEmailAddresses = Objects.requireNonNull(allowedEmailAddresses);
            return this;
        }
        public Builder allowedEmailAddresses(String... allowedEmailAddresses) {
            return allowedEmailAddresses(List.of(allowedEmailAddresses));
        }
        public Builder allowedIps(List<String> allowedIps) {
            this.allowedIps = Objects.requireNonNull(allowedIps);
            return this;
        }
        public Builder allowedIps(String... allowedIps) {
            return allowedIps(List.of(allowedIps));
        }
        public Builder allowedUris(List<String> allowedUris) {
            this.allowedUris = Objects.requireNonNull(allowedUris);
            return this;
        }
        public Builder allowedUris(String... allowedUris) {
            return allowedUris(List.of(allowedUris));
        }        public AllowedSubjectAltNamesResponse build() {
            return new AllowedSubjectAltNamesResponse(allowCustomSans, allowGlobbingDnsWildcards, allowedDnsNames, allowedEmailAddresses, allowedIps, allowedUris);
        }
    }
}

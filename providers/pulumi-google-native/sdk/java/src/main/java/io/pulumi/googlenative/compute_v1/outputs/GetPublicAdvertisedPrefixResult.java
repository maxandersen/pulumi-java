// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.PublicAdvertisedPrefixPublicDelegatedPrefixResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetPublicAdvertisedPrefixResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The IPv4 address to be used for reverse DNS verification.
     * 
     */
    private final String dnsVerificationIp;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
     * 
     */
    private final String fingerprint;
    /**
     * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
     */
    private final String ipCidrRange;
    /**
     * Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The list of public delegated prefixes that exist for this public advertised prefix.
     * 
     */
    private final List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The shared secret to be used for reverse DNS verification.
     * 
     */
    private final String sharedSecret;
    /**
     * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private GetPublicAdvertisedPrefixResult(
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("dnsVerificationIp") String dnsVerificationIp,
        @OutputCustomType.Parameter("fingerprint") String fingerprint,
        @OutputCustomType.Parameter("ipCidrRange") String ipCidrRange,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("publicDelegatedPrefixs") List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("sharedSecret") String sharedSecret,
        @OutputCustomType.Parameter("status") String status) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.dnsVerificationIp = dnsVerificationIp;
        this.fingerprint = fingerprint;
        this.ipCidrRange = ipCidrRange;
        this.kind = kind;
        this.name = name;
        this.publicDelegatedPrefixs = publicDelegatedPrefixs;
        this.selfLink = selfLink;
        this.sharedSecret = sharedSecret;
        this.status = status;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The IPv4 address to be used for reverse DNS verification.
     * 
    */
    public String getDnsVerificationIp() {
        return this.dnsVerificationIp;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
    */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The list of public delegated prefixes that exist for this public advertised prefix.
     * 
    */
    public List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> getPublicDelegatedPrefixs() {
        return this.publicDelegatedPrefixs;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The shared secret to be used for reverse DNS verification.
     * 
    */
    public String getSharedSecret() {
        return this.sharedSecret;
    }
    /**
     * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicAdvertisedPrefixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String dnsVerificationIp;
        private String fingerprint;
        private String ipCidrRange;
        private String kind;
        private String name;
        private List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs;
        private String selfLink;
        private String sharedSecret;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicAdvertisedPrefixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.dnsVerificationIp = defaults.dnsVerificationIp;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publicDelegatedPrefixs = defaults.publicDelegatedPrefixs;
    	      this.selfLink = defaults.selfLink;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.status = defaults.status;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDnsVerificationIp(String dnsVerificationIp) {
            this.dnsVerificationIp = Objects.requireNonNull(dnsVerificationIp);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicDelegatedPrefixs(List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs) {
            this.publicDelegatedPrefixs = Objects.requireNonNull(publicDelegatedPrefixs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSharedSecret(String sharedSecret) {
            this.sharedSecret = Objects.requireNonNull(sharedSecret);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetPublicAdvertisedPrefixResult build() {
            return new GetPublicAdvertisedPrefixResult(creationTimestamp, description, dnsVerificationIp, fingerprint, ipCidrRange, kind, name, publicDelegatedPrefixs, selfLink, sharedSecret, status);
        }
    }
}

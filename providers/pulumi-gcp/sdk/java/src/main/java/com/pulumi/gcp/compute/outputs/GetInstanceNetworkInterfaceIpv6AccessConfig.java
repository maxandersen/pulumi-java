// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkInterfaceIpv6AccessConfig {
    private final String externalIpv6;
    private final String externalIpv6PrefixLength;
    /**
     * The [networking tier][network-tier] used for configuring this instance. One of `PREMIUM` or `STANDARD`.
     * 
     */
    private final String networkTier;
    /**
     * The DNS domain name for the public PTR record.
     * 
     */
    private final String publicPtrDomainName;

    @CustomType.Constructor
    private GetInstanceNetworkInterfaceIpv6AccessConfig(
        @CustomType.Parameter("externalIpv6") String externalIpv6,
        @CustomType.Parameter("externalIpv6PrefixLength") String externalIpv6PrefixLength,
        @CustomType.Parameter("networkTier") String networkTier,
        @CustomType.Parameter("publicPtrDomainName") String publicPtrDomainName) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
    }

    public String externalIpv6() {
        return this.externalIpv6;
    }
    public String externalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength;
    }
    /**
     * The [networking tier][network-tier] used for configuring this instance. One of `PREMIUM` or `STANDARD`.
     * 
    */
    public String networkTier() {
        return this.networkTier;
    }
    /**
     * The DNS domain name for the public PTR record.
     * 
    */
    public String publicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkInterfaceIpv6AccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIpv6;
        private String externalIpv6PrefixLength;
        private String networkTier;
        private String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNetworkInterfaceIpv6AccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder externalIpv6(String externalIpv6) {
            this.externalIpv6 = Objects.requireNonNull(externalIpv6);
            return this;
        }
        public Builder externalIpv6PrefixLength(String externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Objects.requireNonNull(externalIpv6PrefixLength);
            return this;
        }
        public Builder networkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }
        public Builder publicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }        public GetInstanceNetworkInterfaceIpv6AccessConfig build() {
            return new GetInstanceNetworkInterfaceIpv6AccessConfig(externalIpv6, externalIpv6PrefixLength, networkTier, publicPtrDomainName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceNetworkInterfaceIpv6AccessConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceNetworkInterfaceIpv6AccessConfig Empty = new GetInstanceNetworkInterfaceIpv6AccessConfig();

    @Import(name="externalIpv6", required=true)
    private String externalIpv6;

    public String externalIpv6() {
        return this.externalIpv6;
    }

    @Import(name="externalIpv6PrefixLength", required=true)
    private String externalIpv6PrefixLength;

    public String externalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength;
    }

    /**
     * The [networking tier][network-tier] used for configuring this instance. One of `PREMIUM` or `STANDARD`.
     * 
     */
    @Import(name="networkTier", required=true)
    private String networkTier;

    public String networkTier() {
        return this.networkTier;
    }

    /**
     * The DNS domain name for the public PTR record.
     * 
     */
    @Import(name="publicPtrDomainName", required=true)
    private String publicPtrDomainName;

    public String publicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    private GetInstanceNetworkInterfaceIpv6AccessConfig() {}

    private GetInstanceNetworkInterfaceIpv6AccessConfig(GetInstanceNetworkInterfaceIpv6AccessConfig $) {
        this.externalIpv6 = $.externalIpv6;
        this.externalIpv6PrefixLength = $.externalIpv6PrefixLength;
        this.networkTier = $.networkTier;
        this.publicPtrDomainName = $.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceNetworkInterfaceIpv6AccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceNetworkInterfaceIpv6AccessConfig $;

        public Builder() {
            $ = new GetInstanceNetworkInterfaceIpv6AccessConfig();
        }

        public Builder(GetInstanceNetworkInterfaceIpv6AccessConfig defaults) {
            $ = new GetInstanceNetworkInterfaceIpv6AccessConfig(Objects.requireNonNull(defaults));
        }

        public Builder externalIpv6(String externalIpv6) {
            $.externalIpv6 = externalIpv6;
            return this;
        }

        public Builder externalIpv6PrefixLength(String externalIpv6PrefixLength) {
            $.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }

        public Builder networkTier(String networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        public Builder publicPtrDomainName(String publicPtrDomainName) {
            $.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public GetInstanceNetworkInterfaceIpv6AccessConfig build() {
            $.externalIpv6 = Objects.requireNonNull($.externalIpv6, "expected parameter 'externalIpv6' to be non-null");
            $.externalIpv6PrefixLength = Objects.requireNonNull($.externalIpv6PrefixLength, "expected parameter 'externalIpv6PrefixLength' to be non-null");
            $.networkTier = Objects.requireNonNull($.networkTier, "expected parameter 'networkTier' to be non-null");
            $.publicPtrDomainName = Objects.requireNonNull($.publicPtrDomainName, "expected parameter 'publicPtrDomainName' to be non-null");
            return $;
        }
    }

}

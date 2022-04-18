// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessConfigResponse {
    /**
     * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
     * 
     */
    private final String externalIpv6;
    /**
     * The prefix length of the external IPv6 range.
     * 
     */
    private final Integer externalIpv6PrefixLength;
    /**
     * Type of the resource. Always compute#accessConfig for access configs.
     * 
     */
    private final String kind;
    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
     */
    private final String name;
    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
     */
    private final String natIP;
    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
     */
    private final String networkTier;
    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
     */
    private final String publicPtrDomainName;
    /**
     * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
     */
    private final Boolean setPublicPtr;
    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AccessConfigResponse(
        @CustomType.Parameter("externalIpv6") String externalIpv6,
        @CustomType.Parameter("externalIpv6PrefixLength") Integer externalIpv6PrefixLength,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("natIP") String natIP,
        @CustomType.Parameter("networkTier") String networkTier,
        @CustomType.Parameter("publicPtrDomainName") String publicPtrDomainName,
        @CustomType.Parameter("setPublicPtr") Boolean setPublicPtr,
        @CustomType.Parameter("type") String type) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.kind = kind;
        this.name = name;
        this.natIP = natIP;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
        this.setPublicPtr = setPublicPtr;
        this.type = type;
    }

    /**
     * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
     * 
    */
    public String externalIpv6() {
        return this.externalIpv6;
    }
    /**
     * The prefix length of the external IPv6 range.
     * 
    */
    public Integer externalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength;
    }
    /**
     * Type of the resource. Always compute#accessConfig for access configs.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
    */
    public String natIP() {
        return this.natIP;
    }
    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
    */
    public String networkTier() {
        return this.networkTier;
    }
    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
    */
    public String publicPtrDomainName() {
        return this.publicPtrDomainName;
    }
    /**
     * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
    */
    public Boolean setPublicPtr() {
        return this.setPublicPtr;
    }
    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIpv6;
        private Integer externalIpv6PrefixLength;
        private String kind;
        private String name;
        private String natIP;
        private String networkTier;
        private String publicPtrDomainName;
        private Boolean setPublicPtr;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.natIP = defaults.natIP;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
    	      this.setPublicPtr = defaults.setPublicPtr;
    	      this.type = defaults.type;
        }

        public Builder externalIpv6(String externalIpv6) {
            this.externalIpv6 = Objects.requireNonNull(externalIpv6);
            return this;
        }
        public Builder externalIpv6PrefixLength(Integer externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Objects.requireNonNull(externalIpv6PrefixLength);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder natIP(String natIP) {
            this.natIP = Objects.requireNonNull(natIP);
            return this;
        }
        public Builder networkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }
        public Builder publicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }
        public Builder setPublicPtr(Boolean setPublicPtr) {
            this.setPublicPtr = Objects.requireNonNull(setPublicPtr);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AccessConfigResponse build() {
            return new AccessConfigResponse(externalIpv6, externalIpv6PrefixLength, kind, name, natIP, networkTier, publicPtrDomainName, setPublicPtr, type);
        }
    }
}

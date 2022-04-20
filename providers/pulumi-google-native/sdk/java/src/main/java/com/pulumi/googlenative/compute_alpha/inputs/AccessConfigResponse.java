// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * An access configuration attached to an instance&#39;s network interface. Only one access config per instance is supported.
 * 
 */
public final class AccessConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final AccessConfigResponse Empty = new AccessConfigResponse();

    /**
     * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
     * 
     */
    @Import(name="externalIpv6", required=true)
      private final String externalIpv6;

    public String externalIpv6() {
        return this.externalIpv6;
    }

    /**
     * The prefix length of the external IPv6 range.
     * 
     */
    @Import(name="externalIpv6PrefixLength", required=true)
      private final Integer externalIpv6PrefixLength;

    public Integer externalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength;
    }

    /**
     * Type of the resource. Always compute#accessConfig for access configs.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
     */
    @Import(name="natIP", required=true)
      private final String natIP;

    public String natIP() {
        return this.natIP;
    }

    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
     */
    @Import(name="networkTier", required=true)
      private final String networkTier;

    public String networkTier() {
        return this.networkTier;
    }

    /**
     * The public DNS domain name for the instance.
     * 
     */
    @Import(name="publicDnsName", required=true)
      private final String publicDnsName;

    public String publicDnsName() {
        return this.publicDnsName;
    }

    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
     */
    @Import(name="publicPtrDomainName", required=true)
      private final String publicPtrDomainName;

    public String publicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    /**
     * Specifies whether a public DNS &#39;A&#39; record should be created for the external IP address of this access configuration.
     * 
     */
    @Import(name="setPublicDns", required=true)
      private final Boolean setPublicDns;

    public Boolean setPublicDns() {
        return this.setPublicDns;
    }

    /**
     * Specifies whether a public DNS &#39;PTR&#39; record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
     */
    @Import(name="setPublicPtr", required=true)
      private final Boolean setPublicPtr;

    public Boolean setPublicPtr() {
        return this.setPublicPtr;
    }

    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AccessConfigResponse(
        String externalIpv6,
        Integer externalIpv6PrefixLength,
        String kind,
        String name,
        String natIP,
        String networkTier,
        String publicDnsName,
        String publicPtrDomainName,
        Boolean setPublicDns,
        Boolean setPublicPtr,
        String type) {
        this.externalIpv6 = Objects.requireNonNull(externalIpv6, "expected parameter 'externalIpv6' to be non-null");
        this.externalIpv6PrefixLength = Objects.requireNonNull(externalIpv6PrefixLength, "expected parameter 'externalIpv6PrefixLength' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.natIP = Objects.requireNonNull(natIP, "expected parameter 'natIP' to be non-null");
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.publicDnsName = Objects.requireNonNull(publicDnsName, "expected parameter 'publicDnsName' to be non-null");
        this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName, "expected parameter 'publicPtrDomainName' to be non-null");
        this.setPublicDns = Objects.requireNonNull(setPublicDns, "expected parameter 'setPublicDns' to be non-null");
        this.setPublicPtr = Objects.requireNonNull(setPublicPtr, "expected parameter 'setPublicPtr' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccessConfigResponse() {
        this.externalIpv6 = null;
        this.externalIpv6PrefixLength = null;
        this.kind = null;
        this.name = null;
        this.natIP = null;
        this.networkTier = null;
        this.publicDnsName = null;
        this.publicPtrDomainName = null;
        this.setPublicDns = null;
        this.setPublicPtr = null;
        this.type = null;
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
        private String publicDnsName;
        private String publicPtrDomainName;
        private Boolean setPublicDns;
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
    	      this.publicDnsName = defaults.publicDnsName;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
    	      this.setPublicDns = defaults.setPublicDns;
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
        public Builder publicDnsName(String publicDnsName) {
            this.publicDnsName = Objects.requireNonNull(publicDnsName);
            return this;
        }
        public Builder publicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }
        public Builder setPublicDns(Boolean setPublicDns) {
            this.setPublicDns = Objects.requireNonNull(setPublicDns);
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
            return new AccessConfigResponse(externalIpv6, externalIpv6PrefixLength, kind, name, natIP, networkTier, publicDnsName, publicPtrDomainName, setPublicDns, setPublicPtr, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.enums.AccessConfigNetworkTier;
import com.pulumi.googlenative.compute_beta.enums.AccessConfigType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An access configuration attached to an instance&#39;s network interface. Only one access config per instance is supported.
 * 
 */
public final class AccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessConfigArgs Empty = new AccessConfigArgs();

    /**
     * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
     * 
     */
    @Import(name="externalIpv6")
      private final @Nullable Output<String> externalIpv6;

    public Output<String> externalIpv6() {
        return this.externalIpv6 == null ? Codegen.empty() : this.externalIpv6;
    }

    /**
     * The prefix length of the external IPv6 range.
     * 
     */
    @Import(name="externalIpv6PrefixLength")
      private final @Nullable Output<Integer> externalIpv6PrefixLength;

    public Output<Integer> externalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength == null ? Codegen.empty() : this.externalIpv6PrefixLength;
    }

    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
     */
    @Import(name="natIP")
      private final @Nullable Output<String> natIP;

    public Output<String> natIP() {
        return this.natIP == null ? Codegen.empty() : this.natIP;
    }

    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
     */
    @Import(name="networkTier")
      private final @Nullable Output<AccessConfigNetworkTier> networkTier;

    public Output<AccessConfigNetworkTier> networkTier() {
        return this.networkTier == null ? Codegen.empty() : this.networkTier;
    }

    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
     */
    @Import(name="publicPtrDomainName")
      private final @Nullable Output<String> publicPtrDomainName;

    public Output<String> publicPtrDomainName() {
        return this.publicPtrDomainName == null ? Codegen.empty() : this.publicPtrDomainName;
    }

    /**
     * Specifies whether a public DNS &#39;PTR&#39; record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
     */
    @Import(name="setPublicPtr")
      private final @Nullable Output<Boolean> setPublicPtr;

    public Output<Boolean> setPublicPtr() {
        return this.setPublicPtr == null ? Codegen.empty() : this.setPublicPtr;
    }

    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<AccessConfigType> type;

    public Output<AccessConfigType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public AccessConfigArgs(
        @Nullable Output<String> externalIpv6,
        @Nullable Output<Integer> externalIpv6PrefixLength,
        @Nullable Output<String> name,
        @Nullable Output<String> natIP,
        @Nullable Output<AccessConfigNetworkTier> networkTier,
        @Nullable Output<String> publicPtrDomainName,
        @Nullable Output<Boolean> setPublicPtr,
        @Nullable Output<AccessConfigType> type) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.name = name;
        this.natIP = natIP;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
        this.setPublicPtr = setPublicPtr;
        this.type = type;
    }

    private AccessConfigArgs() {
        this.externalIpv6 = Codegen.empty();
        this.externalIpv6PrefixLength = Codegen.empty();
        this.name = Codegen.empty();
        this.natIP = Codegen.empty();
        this.networkTier = Codegen.empty();
        this.publicPtrDomainName = Codegen.empty();
        this.setPublicPtr = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> externalIpv6;
        private @Nullable Output<Integer> externalIpv6PrefixLength;
        private @Nullable Output<String> name;
        private @Nullable Output<String> natIP;
        private @Nullable Output<AccessConfigNetworkTier> networkTier;
        private @Nullable Output<String> publicPtrDomainName;
        private @Nullable Output<Boolean> setPublicPtr;
        private @Nullable Output<AccessConfigType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.name = defaults.name;
    	      this.natIP = defaults.natIP;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
    	      this.setPublicPtr = defaults.setPublicPtr;
    	      this.type = defaults.type;
        }

        public Builder externalIpv6(@Nullable Output<String> externalIpv6) {
            this.externalIpv6 = externalIpv6;
            return this;
        }
        public Builder externalIpv6(@Nullable String externalIpv6) {
            this.externalIpv6 = Codegen.ofNullable(externalIpv6);
            return this;
        }
        public Builder externalIpv6PrefixLength(@Nullable Output<Integer> externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }
        public Builder externalIpv6PrefixLength(@Nullable Integer externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Codegen.ofNullable(externalIpv6PrefixLength);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder natIP(@Nullable Output<String> natIP) {
            this.natIP = natIP;
            return this;
        }
        public Builder natIP(@Nullable String natIP) {
            this.natIP = Codegen.ofNullable(natIP);
            return this;
        }
        public Builder networkTier(@Nullable Output<AccessConfigNetworkTier> networkTier) {
            this.networkTier = networkTier;
            return this;
        }
        public Builder networkTier(@Nullable AccessConfigNetworkTier networkTier) {
            this.networkTier = Codegen.ofNullable(networkTier);
            return this;
        }
        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }
        public Builder publicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Codegen.ofNullable(publicPtrDomainName);
            return this;
        }
        public Builder setPublicPtr(@Nullable Output<Boolean> setPublicPtr) {
            this.setPublicPtr = setPublicPtr;
            return this;
        }
        public Builder setPublicPtr(@Nullable Boolean setPublicPtr) {
            this.setPublicPtr = Codegen.ofNullable(setPublicPtr);
            return this;
        }
        public Builder type(@Nullable Output<AccessConfigType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable AccessConfigType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public AccessConfigArgs build() {
            return new AccessConfigArgs(externalIpv6, externalIpv6PrefixLength, name, natIP, networkTier, publicPtrDomainName, setPublicPtr, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.AccessConfigNetworkTier;
import com.pulumi.googlenative.compute_alpha.enums.AccessConfigType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<String> externalIpv6;

    public Optional<Output<String>> externalIpv6() {
        return Optional.ofNullable(this.externalIpv6);
    }

    /**
     * The prefix length of the external IPv6 range.
     * 
     */
    @Import(name="externalIpv6PrefixLength")
    private @Nullable Output<Integer> externalIpv6PrefixLength;

    public Optional<Output<Integer>> externalIpv6PrefixLength() {
        return Optional.ofNullable(this.externalIpv6PrefixLength);
    }

    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
     */
    @Import(name="natIP")
    private @Nullable Output<String> natIP;

    public Optional<Output<String>> natIP() {
        return Optional.ofNullable(this.natIP);
    }

    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
     */
    @Import(name="networkTier")
    private @Nullable Output<AccessConfigNetworkTier> networkTier;

    public Optional<Output<AccessConfigNetworkTier>> networkTier() {
        return Optional.ofNullable(this.networkTier);
    }

    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
     */
    @Import(name="publicPtrDomainName")
    private @Nullable Output<String> publicPtrDomainName;

    public Optional<Output<String>> publicPtrDomainName() {
        return Optional.ofNullable(this.publicPtrDomainName);
    }

    /**
     * Specifies whether a public DNS &#39;A&#39; record should be created for the external IP address of this access configuration.
     * 
     */
    @Import(name="setPublicDns")
    private @Nullable Output<Boolean> setPublicDns;

    public Optional<Output<Boolean>> setPublicDns() {
        return Optional.ofNullable(this.setPublicDns);
    }

    /**
     * Specifies whether a public DNS &#39;PTR&#39; record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
     */
    @Import(name="setPublicPtr")
    private @Nullable Output<Boolean> setPublicPtr;

    public Optional<Output<Boolean>> setPublicPtr() {
        return Optional.ofNullable(this.setPublicPtr);
    }

    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
     */
    @Import(name="type")
    private @Nullable Output<AccessConfigType> type;

    public Optional<Output<AccessConfigType>> type() {
        return Optional.ofNullable(this.type);
    }

    private AccessConfigArgs() {}

    private AccessConfigArgs(AccessConfigArgs $) {
        this.externalIpv6 = $.externalIpv6;
        this.externalIpv6PrefixLength = $.externalIpv6PrefixLength;
        this.name = $.name;
        this.natIP = $.natIP;
        this.networkTier = $.networkTier;
        this.publicPtrDomainName = $.publicPtrDomainName;
        this.setPublicDns = $.setPublicDns;
        this.setPublicPtr = $.setPublicPtr;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessConfigArgs $;

        public Builder() {
            $ = new AccessConfigArgs();
        }

        public Builder(AccessConfigArgs defaults) {
            $ = new AccessConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalIpv6(@Nullable Output<String> externalIpv6) {
            $.externalIpv6 = externalIpv6;
            return this;
        }

        public Builder externalIpv6(String externalIpv6) {
            return externalIpv6(Output.of(externalIpv6));
        }

        public Builder externalIpv6PrefixLength(@Nullable Output<Integer> externalIpv6PrefixLength) {
            $.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }

        public Builder externalIpv6PrefixLength(Integer externalIpv6PrefixLength) {
            return externalIpv6PrefixLength(Output.of(externalIpv6PrefixLength));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder natIP(@Nullable Output<String> natIP) {
            $.natIP = natIP;
            return this;
        }

        public Builder natIP(String natIP) {
            return natIP(Output.of(natIP));
        }

        public Builder networkTier(@Nullable Output<AccessConfigNetworkTier> networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(AccessConfigNetworkTier networkTier) {
            return networkTier(Output.of(networkTier));
        }

        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            $.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder publicPtrDomainName(String publicPtrDomainName) {
            return publicPtrDomainName(Output.of(publicPtrDomainName));
        }

        public Builder setPublicDns(@Nullable Output<Boolean> setPublicDns) {
            $.setPublicDns = setPublicDns;
            return this;
        }

        public Builder setPublicDns(Boolean setPublicDns) {
            return setPublicDns(Output.of(setPublicDns));
        }

        public Builder setPublicPtr(@Nullable Output<Boolean> setPublicPtr) {
            $.setPublicPtr = setPublicPtr;
            return this;
        }

        public Builder setPublicPtr(Boolean setPublicPtr) {
            return setPublicPtr(Output.of(setPublicPtr));
        }

        public Builder type(@Nullable Output<AccessConfigType> type) {
            $.type = type;
            return this;
        }

        public Builder type(AccessConfigType type) {
            return type(Output.of(type));
        }

        public AccessConfigArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceTemplateNetworkInterfaceAccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateNetworkInterfaceAccessConfigArgs Empty = new InstanceTemplateNetworkInterfaceAccessConfigArgs();

    /**
     * The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    @Import(name="natIp")
    private @Nullable Output<String> natIp;

    public Optional<Output<String>> natIp() {
        return Optional.ofNullable(this.natIp);
    }

    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    @Import(name="networkTier")
    private @Nullable Output<String> networkTier;

    public Optional<Output<String>> networkTier() {
        return Optional.ofNullable(this.networkTier);
    }

    @Import(name="publicPtrDomainName")
    private @Nullable Output<String> publicPtrDomainName;

    public Optional<Output<String>> publicPtrDomainName() {
        return Optional.ofNullable(this.publicPtrDomainName);
    }

    private InstanceTemplateNetworkInterfaceAccessConfigArgs() {}

    private InstanceTemplateNetworkInterfaceAccessConfigArgs(InstanceTemplateNetworkInterfaceAccessConfigArgs $) {
        this.natIp = $.natIp;
        this.networkTier = $.networkTier;
        this.publicPtrDomainName = $.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceTemplateNetworkInterfaceAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceTemplateNetworkInterfaceAccessConfigArgs $;

        public Builder() {
            $ = new InstanceTemplateNetworkInterfaceAccessConfigArgs();
        }

        public Builder(InstanceTemplateNetworkInterfaceAccessConfigArgs defaults) {
            $ = new InstanceTemplateNetworkInterfaceAccessConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder natIp(@Nullable Output<String> natIp) {
            $.natIp = natIp;
            return this;
        }

        public Builder natIp(String natIp) {
            return natIp(Output.of(natIp));
        }

        public Builder networkTier(@Nullable Output<String> networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(String networkTier) {
            return networkTier(Output.of(networkTier));
        }

        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            $.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder publicPtrDomainName(String publicPtrDomainName) {
            return publicPtrDomainName(Output.of(publicPtrDomainName));
        }

        public InstanceTemplateNetworkInterfaceAccessConfigArgs build() {
            return $;
        }
    }

}

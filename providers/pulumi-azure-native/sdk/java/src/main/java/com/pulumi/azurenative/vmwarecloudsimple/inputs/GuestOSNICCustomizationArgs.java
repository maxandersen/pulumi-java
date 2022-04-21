// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Guest OS nic customization
 * 
 */
public final class GuestOSNICCustomizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestOSNICCustomizationArgs Empty = new GuestOSNICCustomizationArgs();

    /**
     * IP address allocation method
     * 
     */
    @Import(name="allocation")
    private @Nullable Output<String> allocation;

    public Optional<Output<String>> allocation() {
        return Optional.ofNullable(this.allocation);
    }

    /**
     * List of dns servers to use
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * Gateway addresses assigned to nic
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<List<String>> gateway;

    public Optional<Output<List<String>>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Static ip address for nic
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Network mask for nic
     * 
     */
    @Import(name="mask")
    private @Nullable Output<String> mask;

    public Optional<Output<String>> mask() {
        return Optional.ofNullable(this.mask);
    }

    /**
     * primary WINS server for Windows
     * 
     */
    @Import(name="primaryWinsServer")
    private @Nullable Output<String> primaryWinsServer;

    public Optional<Output<String>> primaryWinsServer() {
        return Optional.ofNullable(this.primaryWinsServer);
    }

    /**
     * secondary WINS server for Windows
     * 
     */
    @Import(name="secondaryWinsServer")
    private @Nullable Output<String> secondaryWinsServer;

    public Optional<Output<String>> secondaryWinsServer() {
        return Optional.ofNullable(this.secondaryWinsServer);
    }

    private GuestOSNICCustomizationArgs() {}

    private GuestOSNICCustomizationArgs(GuestOSNICCustomizationArgs $) {
        this.allocation = $.allocation;
        this.dnsServers = $.dnsServers;
        this.gateway = $.gateway;
        this.ipAddress = $.ipAddress;
        this.mask = $.mask;
        this.primaryWinsServer = $.primaryWinsServer;
        this.secondaryWinsServer = $.secondaryWinsServer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestOSNICCustomizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestOSNICCustomizationArgs $;

        public Builder() {
            $ = new GuestOSNICCustomizationArgs();
        }

        public Builder(GuestOSNICCustomizationArgs defaults) {
            $ = new GuestOSNICCustomizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder allocation(@Nullable Output<String> allocation) {
            $.allocation = allocation;
            return this;
        }

        public Builder allocation(String allocation) {
            return allocation(Output.of(allocation));
        }

        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        public Builder gateway(@Nullable Output<List<String>> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(List<String> gateway) {
            return gateway(Output.of(gateway));
        }

        public Builder gateway(String... gateway) {
            return gateway(List.of(gateway));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder mask(@Nullable Output<String> mask) {
            $.mask = mask;
            return this;
        }

        public Builder mask(String mask) {
            return mask(Output.of(mask));
        }

        public Builder primaryWinsServer(@Nullable Output<String> primaryWinsServer) {
            $.primaryWinsServer = primaryWinsServer;
            return this;
        }

        public Builder primaryWinsServer(String primaryWinsServer) {
            return primaryWinsServer(Output.of(primaryWinsServer));
        }

        public Builder secondaryWinsServer(@Nullable Output<String> secondaryWinsServer) {
            $.secondaryWinsServer = secondaryWinsServer;
            return this;
        }

        public Builder secondaryWinsServer(String secondaryWinsServer) {
            return secondaryWinsServer(Output.of(secondaryWinsServer));
        }

        public GuestOSNICCustomizationArgs build() {
            return $;
        }
    }

}

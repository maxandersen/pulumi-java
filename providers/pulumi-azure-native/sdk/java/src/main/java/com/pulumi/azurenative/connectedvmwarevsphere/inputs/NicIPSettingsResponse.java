// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.azurenative.connectedvmwarevsphere.inputs.NicIPAddressSettingsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the network interface ip settings.
 * 
 */
public final class NicIPSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final NicIPSettingsResponse Empty = new NicIPSettingsResponse();

    /**
     * Gets or sets the nic allocation method.
     * 
     */
    @Import(name="allocationMethod")
    private @Nullable String allocationMethod;

    public Optional<String> allocationMethod() {
        return Optional.ofNullable(this.allocationMethod);
    }

    /**
     * Gets or sets the dns servers.
     * 
     */
    @Import(name="dnsServers")
    private @Nullable List<String> dnsServers;

    public Optional<List<String>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * Gets or sets the gateway.
     * 
     */
    @Import(name="gateway")
    private @Nullable List<String> gateway;

    public Optional<List<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Gets or sets the ip address for the nic.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Gets or sets the IP address information being reported for this NIC. This contains the same IPv4 information above plus IPV6 information.
     * 
     */
    @Import(name="ipAddressInfo", required=true)
    private List<NicIPAddressSettingsResponse> ipAddressInfo;

    public List<NicIPAddressSettingsResponse> ipAddressInfo() {
        return this.ipAddressInfo;
    }

    /**
     * Gets or sets the primary server.
     * 
     */
    @Import(name="primaryWinsServer", required=true)
    private String primaryWinsServer;

    public String primaryWinsServer() {
        return this.primaryWinsServer;
    }

    /**
     * Gets or sets the secondary server.
     * 
     */
    @Import(name="secondaryWinsServer", required=true)
    private String secondaryWinsServer;

    public String secondaryWinsServer() {
        return this.secondaryWinsServer;
    }

    /**
     * Gets or sets the mask.
     * 
     */
    @Import(name="subnetMask")
    private @Nullable String subnetMask;

    public Optional<String> subnetMask() {
        return Optional.ofNullable(this.subnetMask);
    }

    private NicIPSettingsResponse() {}

    private NicIPSettingsResponse(NicIPSettingsResponse $) {
        this.allocationMethod = $.allocationMethod;
        this.dnsServers = $.dnsServers;
        this.gateway = $.gateway;
        this.ipAddress = $.ipAddress;
        this.ipAddressInfo = $.ipAddressInfo;
        this.primaryWinsServer = $.primaryWinsServer;
        this.secondaryWinsServer = $.secondaryWinsServer;
        this.subnetMask = $.subnetMask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NicIPSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NicIPSettingsResponse $;

        public Builder() {
            $ = new NicIPSettingsResponse();
        }

        public Builder(NicIPSettingsResponse defaults) {
            $ = new NicIPSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder allocationMethod(@Nullable String allocationMethod) {
            $.allocationMethod = allocationMethod;
            return this;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        public Builder gateway(@Nullable List<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(String... gateway) {
            return gateway(List.of(gateway));
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddressInfo(List<NicIPAddressSettingsResponse> ipAddressInfo) {
            $.ipAddressInfo = ipAddressInfo;
            return this;
        }

        public Builder ipAddressInfo(NicIPAddressSettingsResponse... ipAddressInfo) {
            return ipAddressInfo(List.of(ipAddressInfo));
        }

        public Builder primaryWinsServer(String primaryWinsServer) {
            $.primaryWinsServer = primaryWinsServer;
            return this;
        }

        public Builder secondaryWinsServer(String secondaryWinsServer) {
            $.secondaryWinsServer = secondaryWinsServer;
            return this;
        }

        public Builder subnetMask(@Nullable String subnetMask) {
            $.subnetMask = subnetMask;
            return this;
        }

        public NicIPSettingsResponse build() {
            $.ipAddressInfo = Objects.requireNonNull($.ipAddressInfo, "expected parameter 'ipAddressInfo' to be non-null");
            $.primaryWinsServer = Objects.requireNonNull($.primaryWinsServer, "expected parameter 'primaryWinsServer' to be non-null");
            $.secondaryWinsServer = Objects.requireNonNull($.secondaryWinsServer, "expected parameter 'secondaryWinsServer' to be non-null");
            return $;
        }
    }

}

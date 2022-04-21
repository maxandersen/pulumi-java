// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a NAT rule.
 * 
 */
public final class AzureFirewallNatRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallNatRuleResponse Empty = new AzureFirewallNatRuleResponse();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable List<String> destinationAddresses;

    public Optional<List<String>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable List<String> destinationPorts;

    public Optional<List<String>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Name of the NAT rule.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     */
    @Import(name="protocols")
    private @Nullable List<String> protocols;

    public Optional<List<String>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable List<String> sourceAddresses;

    public Optional<List<String>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable List<String> sourceIpGroups;

    public Optional<List<String>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @Import(name="translatedAddress")
    private @Nullable String translatedAddress;

    public Optional<String> translatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }

    /**
     * The translated FQDN for this NAT rule.
     * 
     */
    @Import(name="translatedFqdn")
    private @Nullable String translatedFqdn;

    public Optional<String> translatedFqdn() {
        return Optional.ofNullable(this.translatedFqdn);
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @Import(name="translatedPort")
    private @Nullable String translatedPort;

    public Optional<String> translatedPort() {
        return Optional.ofNullable(this.translatedPort);
    }

    private AzureFirewallNatRuleResponse() {}

    private AzureFirewallNatRuleResponse(AzureFirewallNatRuleResponse $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.destinationPorts = $.destinationPorts;
        this.name = $.name;
        this.protocols = $.protocols;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
        this.translatedAddress = $.translatedAddress;
        this.translatedFqdn = $.translatedFqdn;
        this.translatedPort = $.translatedPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNatRuleResponse $;

        public Builder() {
            $ = new AzureFirewallNatRuleResponse();
        }

        public Builder(AzureFirewallNatRuleResponse defaults) {
            $ = new AzureFirewallNatRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder protocols(@Nullable List<String> protocols) {
            $.protocols = protocols;
            return this;
        }

        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }

        public Builder translatedAddress(@Nullable String translatedAddress) {
            $.translatedAddress = translatedAddress;
            return this;
        }

        public Builder translatedFqdn(@Nullable String translatedFqdn) {
            $.translatedFqdn = translatedFqdn;
            return this;
        }

        public Builder translatedPort(@Nullable String translatedPort) {
            $.translatedPort = translatedPort;
            return this;
        }

        public AzureFirewallNatRuleResponse build() {
            return $;
        }
    }

}

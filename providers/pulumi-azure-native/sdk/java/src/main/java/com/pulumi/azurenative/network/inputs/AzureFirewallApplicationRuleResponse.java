// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AzureFirewallApplicationRuleProtocolResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an application rule.
 * 
 */
public final class AzureFirewallApplicationRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallApplicationRuleResponse Empty = new AzureFirewallApplicationRuleResponse();

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
     * List of FQDN Tags for this rule.
     * 
     */
    @Import(name="fqdnTags")
    private @Nullable List<String> fqdnTags;

    public Optional<List<String>> fqdnTags() {
        return Optional.ofNullable(this.fqdnTags);
    }

    /**
     * Name of the application rule.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Array of ApplicationRuleProtocols.
     * 
     */
    @Import(name="protocols")
    private @Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols;

    public Optional<List<AzureFirewallApplicationRuleProtocolResponse>> protocols() {
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
     * List of FQDNs for this rule.
     * 
     */
    @Import(name="targetFqdns")
    private @Nullable List<String> targetFqdns;

    public Optional<List<String>> targetFqdns() {
        return Optional.ofNullable(this.targetFqdns);
    }

    private AzureFirewallApplicationRuleResponse() {}

    private AzureFirewallApplicationRuleResponse(AzureFirewallApplicationRuleResponse $) {
        this.description = $.description;
        this.fqdnTags = $.fqdnTags;
        this.name = $.name;
        this.protocols = $.protocols;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
        this.targetFqdns = $.targetFqdns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallApplicationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallApplicationRuleResponse $;

        public Builder() {
            $ = new AzureFirewallApplicationRuleResponse();
        }

        public Builder(AzureFirewallApplicationRuleResponse defaults) {
            $ = new AzureFirewallApplicationRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder fqdnTags(@Nullable List<String> fqdnTags) {
            $.fqdnTags = fqdnTags;
            return this;
        }

        public Builder fqdnTags(String... fqdnTags) {
            return fqdnTags(List.of(fqdnTags));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder protocols(@Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols) {
            $.protocols = protocols;
            return this;
        }

        public Builder protocols(AzureFirewallApplicationRuleProtocolResponse... protocols) {
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

        public Builder targetFqdns(@Nullable List<String> targetFqdns) {
            $.targetFqdns = targetFqdns;
            return this;
        }

        public Builder targetFqdns(String... targetFqdns) {
            return targetFqdns(List.of(targetFqdns));
        }

        public AzureFirewallApplicationRuleResponse build() {
            return $;
        }
    }

}

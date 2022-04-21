// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the application rule protocol.
 * 
 */
public final class AzureFirewallApplicationRuleProtocolResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallApplicationRuleProtocolResponse Empty = new AzureFirewallApplicationRuleProtocolResponse();

    /**
     * Port number for the protocol, cannot be greater than 64000. This field is optional.
     * 
     */
    @Import(name="port")
    private @Nullable Integer port;

    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol type.
     * 
     */
    @Import(name="protocolType")
    private @Nullable String protocolType;

    public Optional<String> protocolType() {
        return Optional.ofNullable(this.protocolType);
    }

    private AzureFirewallApplicationRuleProtocolResponse() {}

    private AzureFirewallApplicationRuleProtocolResponse(AzureFirewallApplicationRuleProtocolResponse $) {
        this.port = $.port;
        this.protocolType = $.protocolType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallApplicationRuleProtocolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallApplicationRuleProtocolResponse $;

        public Builder() {
            $ = new AzureFirewallApplicationRuleProtocolResponse();
        }

        public Builder(AzureFirewallApplicationRuleProtocolResponse defaults) {
            $ = new AzureFirewallApplicationRuleProtocolResponse(Objects.requireNonNull(defaults));
        }

        public Builder port(@Nullable Integer port) {
            $.port = port;
            return this;
        }

        public Builder protocolType(@Nullable String protocolType) {
            $.protocolType = protocolType;
            return this;
        }

        public AzureFirewallApplicationRuleProtocolResponse build() {
            return $;
        }
    }

}

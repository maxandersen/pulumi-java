// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureFirewall NAT Rule Collection Action.
 * 
 */
public final class AzureFirewallNatRCActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallNatRCActionResponse Empty = new AzureFirewallNatRCActionResponse();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private AzureFirewallNatRCActionResponse() {}

    private AzureFirewallNatRCActionResponse(AzureFirewallNatRCActionResponse $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNatRCActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNatRCActionResponse $;

        public Builder() {
            $ = new AzureFirewallNatRCActionResponse();
        }

        public Builder(AzureFirewallNatRCActionResponse defaults) {
            $ = new AzureFirewallNatRCActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public AzureFirewallNatRCActionResponse build() {
            return $;
        }
    }

}

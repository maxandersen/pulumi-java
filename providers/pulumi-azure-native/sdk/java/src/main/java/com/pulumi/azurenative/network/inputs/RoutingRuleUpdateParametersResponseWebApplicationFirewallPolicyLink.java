// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Web Application Firewall policy for each routing rule (if applicable)
 * 
 */
public final class RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink extends com.pulumi.resources.InvokeArgs {

    public static final RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink Empty = new RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink() {}

    private RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink(RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink $;

        public Builder() {
            $ = new RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink();
        }

        public Builder(RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink defaults) {
            $ = new RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink build() {
            return $;
        }
    }

}

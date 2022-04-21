// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.DeliveryRuleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A policy that specifies the delivery rules to be used for an endpoint.
 * 
 */
public final class EndpointPropertiesUpdateParametersResponseDeliveryPolicy extends com.pulumi.resources.InvokeArgs {

    public static final EndpointPropertiesUpdateParametersResponseDeliveryPolicy Empty = new EndpointPropertiesUpdateParametersResponseDeliveryPolicy();

    /**
     * User-friendly description of the policy.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of the delivery rules.
     * 
     */
    @Import(name="rules", required=true)
    private List<DeliveryRuleResponse> rules;

    public List<DeliveryRuleResponse> rules() {
        return this.rules;
    }

    private EndpointPropertiesUpdateParametersResponseDeliveryPolicy() {}

    private EndpointPropertiesUpdateParametersResponseDeliveryPolicy(EndpointPropertiesUpdateParametersResponseDeliveryPolicy $) {
        this.description = $.description;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointPropertiesUpdateParametersResponseDeliveryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointPropertiesUpdateParametersResponseDeliveryPolicy $;

        public Builder() {
            $ = new EndpointPropertiesUpdateParametersResponseDeliveryPolicy();
        }

        public Builder(EndpointPropertiesUpdateParametersResponseDeliveryPolicy defaults) {
            $ = new EndpointPropertiesUpdateParametersResponseDeliveryPolicy(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder rules(List<DeliveryRuleResponse> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(DeliveryRuleResponse... rules) {
            return rules(List.of(rules));
        }

        public EndpointPropertiesUpdateParametersResponseDeliveryPolicy build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}

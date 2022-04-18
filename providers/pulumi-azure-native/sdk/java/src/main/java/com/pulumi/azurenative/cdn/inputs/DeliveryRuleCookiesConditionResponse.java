// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.CookiesMatchConditionParametersResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the Cookies condition for the delivery rule.
 * 
 */
public final class DeliveryRuleCookiesConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleCookiesConditionResponse Empty = new DeliveryRuleCookiesConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'Cookies'.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
      private final CookiesMatchConditionParametersResponse parameters;

    public CookiesMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public DeliveryRuleCookiesConditionResponse(
        String name,
        CookiesMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleCookiesConditionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleCookiesConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private CookiesMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleCookiesConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(CookiesMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleCookiesConditionResponse build() {
            return new DeliveryRuleCookiesConditionResponse(name, parameters);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CookiesMatchConditionParametersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleCookiesConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'Cookies'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final CookiesMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleCookiesConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") CookiesMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'Cookies'.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public CookiesMatchConditionParametersResponse parameters() {
        return this.parameters;
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

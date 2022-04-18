// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.RequestUriMatchConditionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleRequestUriConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestUri'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final RequestUriMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleRequestUriConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") RequestUriMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestUri'.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public RequestUriMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestUriConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestUriMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestUriConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(RequestUriMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleRequestUriConditionResponse build() {
            return new DeliveryRuleRequestUriConditionResponse(name, parameters);
        }
    }
}

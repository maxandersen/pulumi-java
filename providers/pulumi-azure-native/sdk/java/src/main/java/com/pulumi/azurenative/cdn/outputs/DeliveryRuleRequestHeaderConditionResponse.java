// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.RequestHeaderMatchConditionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleRequestHeaderConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;RequestHeader&#39;.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final RequestHeaderMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleRequestHeaderConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") RequestHeaderMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;RequestHeader&#39;.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public RequestHeaderMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestHeaderConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestHeaderMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestHeaderConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(RequestHeaderMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleRequestHeaderConditionResponse build() {
            return new DeliveryRuleRequestHeaderConditionResponse(name, parameters);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.RequestUriMatchConditionParametersResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestUri condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestUriConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleRequestUriConditionResponse Empty = new DeliveryRuleRequestUriConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestUri'.
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
      private final RequestUriMatchConditionParametersResponse parameters;

    public RequestUriMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestUriConditionResponse(
        String name,
        RequestUriMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestUriConditionResponse() {
        this.name = null;
        this.parameters = null;
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

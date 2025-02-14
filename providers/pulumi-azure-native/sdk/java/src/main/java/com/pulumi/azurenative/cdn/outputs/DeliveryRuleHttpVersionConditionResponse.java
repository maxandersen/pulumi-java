// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.HttpVersionMatchConditionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleHttpVersionConditionResponse {
    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;HttpVersion&#39;.
     * 
     */
    private final String name;
    /**
     * @return Defines the parameters for the condition.
     * 
     */
    private final HttpVersionMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleHttpVersionConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") HttpVersionMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;HttpVersion&#39;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Defines the parameters for the condition.
     * 
     */
    public HttpVersionMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleHttpVersionConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private HttpVersionMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleHttpVersionConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(HttpVersionMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleHttpVersionConditionResponse build() {
            return new DeliveryRuleHttpVersionConditionResponse(name, parameters);
        }
    }
}

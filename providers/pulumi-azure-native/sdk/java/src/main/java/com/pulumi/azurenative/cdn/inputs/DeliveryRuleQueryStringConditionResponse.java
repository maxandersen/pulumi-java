// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.QueryStringMatchConditionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the QueryString condition for the delivery rule.
 * 
 */
public final class DeliveryRuleQueryStringConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleQueryStringConditionResponse Empty = new DeliveryRuleQueryStringConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;QueryString&#39;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
    private QueryStringMatchConditionParametersResponse parameters;

    public QueryStringMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    private DeliveryRuleQueryStringConditionResponse() {}

    private DeliveryRuleQueryStringConditionResponse(DeliveryRuleQueryStringConditionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleQueryStringConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleQueryStringConditionResponse $;

        public Builder() {
            $ = new DeliveryRuleQueryStringConditionResponse();
        }

        public Builder(DeliveryRuleQueryStringConditionResponse defaults) {
            $ = new DeliveryRuleQueryStringConditionResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(QueryStringMatchConditionParametersResponse parameters) {
            $.parameters = parameters;
            return this;
        }

        public DeliveryRuleQueryStringConditionResponse build() {
            $.name = Codegen.stringProp("name").arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}

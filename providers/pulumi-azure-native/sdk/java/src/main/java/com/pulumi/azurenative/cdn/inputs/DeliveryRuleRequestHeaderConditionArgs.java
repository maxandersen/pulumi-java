// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.RequestHeaderMatchConditionParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestHeader condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestHeaderConditionArgs extends ResourceArgs {

    public static final DeliveryRuleRequestHeaderConditionArgs Empty = new DeliveryRuleRequestHeaderConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;RequestHeader&#39;.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;RequestHeader&#39;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<RequestHeaderMatchConditionParametersArgs> parameters;

    /**
     * @return Defines the parameters for the condition.
     * 
     */
    public Output<RequestHeaderMatchConditionParametersArgs> parameters() {
        return this.parameters;
    }

    private DeliveryRuleRequestHeaderConditionArgs() {}

    private DeliveryRuleRequestHeaderConditionArgs(DeliveryRuleRequestHeaderConditionArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleRequestHeaderConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleRequestHeaderConditionArgs $;

        public Builder() {
            $ = new DeliveryRuleRequestHeaderConditionArgs();
        }

        public Builder(DeliveryRuleRequestHeaderConditionArgs defaults) {
            $ = new DeliveryRuleRequestHeaderConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the condition for the delivery rule.
         * Expected value is &#39;RequestHeader&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the condition for the delivery rule.
         * Expected value is &#39;RequestHeader&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Defines the parameters for the condition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<RequestHeaderMatchConditionParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Defines the parameters for the condition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(RequestHeaderMatchConditionParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public DeliveryRuleRequestHeaderConditionArgs build() {
            $.name = Codegen.stringProp("name").output().arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}

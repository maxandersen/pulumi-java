// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.CookiesMatchConditionParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the Cookies condition for the delivery rule.
 * 
 */
public final class DeliveryRuleCookiesConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleCookiesConditionArgs Empty = new DeliveryRuleCookiesConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;Cookies&#39;.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<CookiesMatchConditionParametersArgs> parameters;

    public Output<CookiesMatchConditionParametersArgs> parameters() {
        return this.parameters;
    }

    private DeliveryRuleCookiesConditionArgs() {}

    private DeliveryRuleCookiesConditionArgs(DeliveryRuleCookiesConditionArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleCookiesConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleCookiesConditionArgs $;

        public Builder() {
            $ = new DeliveryRuleCookiesConditionArgs();
        }

        public Builder(DeliveryRuleCookiesConditionArgs defaults) {
            $ = new DeliveryRuleCookiesConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameters(Output<CookiesMatchConditionParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(CookiesMatchConditionParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public DeliveryRuleCookiesConditionArgs build() {
            $.name = Codegen.stringProp("name").output().arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}

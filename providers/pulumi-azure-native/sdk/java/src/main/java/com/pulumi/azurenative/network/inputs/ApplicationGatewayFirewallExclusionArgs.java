// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Allow to exclude some variable satisfy the condition for the WAF check.
 * 
 */
public final class ApplicationGatewayFirewallExclusionArgs extends ResourceArgs {

    public static final ApplicationGatewayFirewallExclusionArgs Empty = new ApplicationGatewayFirewallExclusionArgs();

    /**
     * The variable to be excluded.
     * 
     */
    @Import(name="matchVariable", required=true)
    private Output<String> matchVariable;

    /**
     * @return The variable to be excluded.
     * 
     */
    public Output<String> matchVariable() {
        return this.matchVariable;
    }

    /**
     * When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selector", required=true)
    private Output<String> selector;

    /**
     * @return When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
     * 
     */
    public Output<String> selector() {
        return this.selector;
    }

    /**
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selectorMatchOperator", required=true)
    private Output<String> selectorMatchOperator;

    /**
     * @return When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
     * 
     */
    public Output<String> selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    private ApplicationGatewayFirewallExclusionArgs() {}

    private ApplicationGatewayFirewallExclusionArgs(ApplicationGatewayFirewallExclusionArgs $) {
        this.matchVariable = $.matchVariable;
        this.selector = $.selector;
        this.selectorMatchOperator = $.selectorMatchOperator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayFirewallExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayFirewallExclusionArgs $;

        public Builder() {
            $ = new ApplicationGatewayFirewallExclusionArgs();
        }

        public Builder(ApplicationGatewayFirewallExclusionArgs defaults) {
            $ = new ApplicationGatewayFirewallExclusionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchVariable The variable to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(Output<String> matchVariable) {
            $.matchVariable = matchVariable;
            return this;
        }

        /**
         * @param matchVariable The variable to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(String matchVariable) {
            return matchVariable(Output.of(matchVariable));
        }

        /**
         * @param selector When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selector(Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param selectorMatchOperator When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selectorMatchOperator(Output<String> selectorMatchOperator) {
            $.selectorMatchOperator = selectorMatchOperator;
            return this;
        }

        /**
         * @param selectorMatchOperator When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selectorMatchOperator(String selectorMatchOperator) {
            return selectorMatchOperator(Output.of(selectorMatchOperator));
        }

        public ApplicationGatewayFirewallExclusionArgs build() {
            $.matchVariable = Objects.requireNonNull($.matchVariable, "expected parameter 'matchVariable' to be non-null");
            $.selector = Objects.requireNonNull($.selector, "expected parameter 'selector' to be non-null");
            $.selectorMatchOperator = Objects.requireNonNull($.selectorMatchOperator, "expected parameter 'selectorMatchOperator' to be non-null");
            return $;
        }
    }

}

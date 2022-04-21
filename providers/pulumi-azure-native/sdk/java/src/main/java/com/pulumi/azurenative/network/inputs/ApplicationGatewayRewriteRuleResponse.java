// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleActionSetResponse;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleConditionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rewrite rule of an application gateway.
 * 
 */
public final class ApplicationGatewayRewriteRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayRewriteRuleResponse Empty = new ApplicationGatewayRewriteRuleResponse();

    /**
     * Set of actions to be done as part of the rewrite Rule.
     * 
     */
    @Import(name="actionSet")
    private @Nullable ApplicationGatewayRewriteRuleActionSetResponse actionSet;

    public Optional<ApplicationGatewayRewriteRuleActionSetResponse> actionSet() {
        return Optional.ofNullable(this.actionSet);
    }

    /**
     * Conditions based on which the action set execution will be evaluated.
     * 
     */
    @Import(name="conditions")
    private @Nullable List<ApplicationGatewayRewriteRuleConditionResponse> conditions;

    public Optional<List<ApplicationGatewayRewriteRuleConditionResponse>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Name of the rewrite rule that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Rule Sequence of the rewrite rule that determines the order of execution of a particular rule in a RewriteRuleSet.
     * 
     */
    @Import(name="ruleSequence")
    private @Nullable Integer ruleSequence;

    public Optional<Integer> ruleSequence() {
        return Optional.ofNullable(this.ruleSequence);
    }

    private ApplicationGatewayRewriteRuleResponse() {}

    private ApplicationGatewayRewriteRuleResponse(ApplicationGatewayRewriteRuleResponse $) {
        this.actionSet = $.actionSet;
        this.conditions = $.conditions;
        this.name = $.name;
        this.ruleSequence = $.ruleSequence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayRewriteRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayRewriteRuleResponse $;

        public Builder() {
            $ = new ApplicationGatewayRewriteRuleResponse();
        }

        public Builder(ApplicationGatewayRewriteRuleResponse defaults) {
            $ = new ApplicationGatewayRewriteRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder actionSet(@Nullable ApplicationGatewayRewriteRuleActionSetResponse actionSet) {
            $.actionSet = actionSet;
            return this;
        }

        public Builder conditions(@Nullable List<ApplicationGatewayRewriteRuleConditionResponse> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(ApplicationGatewayRewriteRuleConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder ruleSequence(@Nullable Integer ruleSequence) {
            $.ruleSequence = ruleSequence;
            return this;
        }

        public ApplicationGatewayRewriteRuleResponse build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.enums.MatchProcessingBehavior;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheExpirationActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheKeyQueryStringActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCookiesConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleHttpVersionConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleIsDeviceConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRulePostArgsConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleQueryStringConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRemoteAddressConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestBodyConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestMethodConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestSchemeConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestUriConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleResponseHeaderActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileExtensionConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileNameConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlPathConditionArgs;
import io.pulumi.azurenative.cdn.inputs.OriginGroupOverrideActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlRedirectActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlRewriteActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlSigningActionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    @Import(name="actions", required=true)
      private final Output<List<Object>> actions;

    public Output<List<Object>> actions() {
        return this.actions;
    }

    /**
     * A list of conditions that must be matched for the actions to be executed
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<Object>> conditions;

    public Output<List<Object>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    @Import(name="matchProcessingBehavior")
      private final @Nullable Output<Either<String,MatchProcessingBehavior>> matchProcessingBehavior;

    public Output<Either<String,MatchProcessingBehavior>> matchProcessingBehavior() {
        return this.matchProcessingBehavior == null ? Codegen.empty() : this.matchProcessingBehavior;
    }

    /**
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    @Import(name="order", required=true)
      private final Output<Integer> order;

    public Output<Integer> order() {
        return this.order;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the delivery rule which is unique within the endpoint.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> ruleName() {
        return this.ruleName == null ? Codegen.empty() : this.ruleName;
    }

    /**
     * Name of the rule set under the profile.
     * 
     */
    @Import(name="ruleSetName", required=true)
      private final Output<String> ruleSetName;

    public Output<String> ruleSetName() {
        return this.ruleSetName;
    }

    public RuleArgs(
        Output<List<Object>> actions,
        @Nullable Output<List<Object>> conditions,
        @Nullable Output<Either<String,MatchProcessingBehavior>> matchProcessingBehavior,
        Output<Integer> order,
        Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleName,
        Output<String> ruleSetName) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.conditions = conditions;
        this.matchProcessingBehavior = matchProcessingBehavior;
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.ruleSetName = Objects.requireNonNull(ruleSetName, "expected parameter 'ruleSetName' to be non-null");
    }

    private RuleArgs() {
        this.actions = Codegen.empty();
        this.conditions = Codegen.empty();
        this.matchProcessingBehavior = Codegen.empty();
        this.order = Codegen.empty();
        this.profileName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleName = Codegen.empty();
        this.ruleSetName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Object>> actions;
        private @Nullable Output<List<Object>> conditions;
        private @Nullable Output<Either<String,MatchProcessingBehavior>> matchProcessingBehavior;
        private Output<Integer> order;
        private Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleName;
        private Output<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.matchProcessingBehavior = defaults.matchProcessingBehavior;
    	      this.order = defaults.order;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder actions(Output<List<Object>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<Object> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(Object... actions) {
            return actions(List.of(actions));
        }
        public Builder conditions(@Nullable Output<List<Object>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<Object> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(Object... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder matchProcessingBehavior(@Nullable Output<Either<String,MatchProcessingBehavior>> matchProcessingBehavior) {
            this.matchProcessingBehavior = matchProcessingBehavior;
            return this;
        }
        public Builder matchProcessingBehavior(@Nullable Either<String,MatchProcessingBehavior> matchProcessingBehavior) {
            this.matchProcessingBehavior = Codegen.ofNullable(matchProcessingBehavior);
            return this;
        }
        public Builder order(Output<Integer> order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder order(Integer order) {
            this.order = Output.of(Objects.requireNonNull(order));
            return this;
        }
        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Codegen.ofNullable(ruleName);
            return this;
        }
        public Builder ruleSetName(Output<String> ruleSetName) {
            this.ruleSetName = Objects.requireNonNull(ruleSetName);
            return this;
        }
        public Builder ruleSetName(String ruleSetName) {
            this.ruleSetName = Output.of(Objects.requireNonNull(ruleSetName));
            return this;
        }        public RuleArgs build() {
            return new RuleArgs(actions, conditions, matchProcessingBehavior, order, profileName, resourceGroupName, ruleName, ruleSetName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaConditionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleBoostActionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleFilterActionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleIgnoreActionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleRedirectActionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleReplacementActionResponse;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse;
import java.util.Objects;


/**
 * A rule is a condition-action pair * A condition defines when a rule is to be triggered. * An action specifies what occurs on that trigger. Currently only boost rules are supported. Currently only supported by the search endpoint.
 * 
 */
public final class GoogleCloudRetailV2betaRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaRuleResponse Empty = new GoogleCloudRetailV2betaRuleResponse();

    /**
     * A boost action.
     * 
     */
    @Import(name="boostAction", required=true)
      private final GoogleCloudRetailV2betaRuleBoostActionResponse boostAction;

    public GoogleCloudRetailV2betaRuleBoostActionResponse boostAction() {
        return this.boostAction;
    }

    /**
     * The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
     */
    @Import(name="condition", required=true)
      private final GoogleCloudRetailV2betaConditionResponse condition;

    public GoogleCloudRetailV2betaConditionResponse condition() {
        return this.condition;
    }

    /**
     * Prevents term from being associated with other terms.
     * 
     */
    @Import(name="doNotAssociateAction", required=true)
      private final GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction;

    public GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction() {
        return this.doNotAssociateAction;
    }

    /**
     * Filters results.
     * 
     */
    @Import(name="filterAction", required=true)
      private final GoogleCloudRetailV2betaRuleFilterActionResponse filterAction;

    public GoogleCloudRetailV2betaRuleFilterActionResponse filterAction() {
        return this.filterAction;
    }

    /**
     * Ignores specific terms from query during search.
     * 
     */
    @Import(name="ignoreAction", required=true)
      private final GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction;

    public GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction() {
        return this.ignoreAction;
    }

    /**
     * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
     */
    @Import(name="onewaySynonymsAction", required=true)
      private final GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction;

    public GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction() {
        return this.onewaySynonymsAction;
    }

    /**
     * Redirects a shopper to a specific page.
     * 
     */
    @Import(name="redirectAction", required=true)
      private final GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction;

    public GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction() {
        return this.redirectAction;
    }

    /**
     * Replaces specific terms in the query.
     * 
     */
    @Import(name="replacementAction", required=true)
      private final GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction;

    public GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction() {
        return this.replacementAction;
    }

    /**
     * Treats a set of terms as synonyms of one another.
     * 
     */
    @Import(name="twowaySynonymsAction", required=true)
      private final GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction;

    public GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction() {
        return this.twowaySynonymsAction;
    }

    public GoogleCloudRetailV2betaRuleResponse(
        GoogleCloudRetailV2betaRuleBoostActionResponse boostAction,
        GoogleCloudRetailV2betaConditionResponse condition,
        GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction,
        GoogleCloudRetailV2betaRuleFilterActionResponse filterAction,
        GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction,
        GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction,
        GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction,
        GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction,
        GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction) {
        this.boostAction = Objects.requireNonNull(boostAction, "expected parameter 'boostAction' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.doNotAssociateAction = Objects.requireNonNull(doNotAssociateAction, "expected parameter 'doNotAssociateAction' to be non-null");
        this.filterAction = Objects.requireNonNull(filterAction, "expected parameter 'filterAction' to be non-null");
        this.ignoreAction = Objects.requireNonNull(ignoreAction, "expected parameter 'ignoreAction' to be non-null");
        this.onewaySynonymsAction = Objects.requireNonNull(onewaySynonymsAction, "expected parameter 'onewaySynonymsAction' to be non-null");
        this.redirectAction = Objects.requireNonNull(redirectAction, "expected parameter 'redirectAction' to be non-null");
        this.replacementAction = Objects.requireNonNull(replacementAction, "expected parameter 'replacementAction' to be non-null");
        this.twowaySynonymsAction = Objects.requireNonNull(twowaySynonymsAction, "expected parameter 'twowaySynonymsAction' to be non-null");
    }

    private GoogleCloudRetailV2betaRuleResponse() {
        this.boostAction = null;
        this.condition = null;
        this.doNotAssociateAction = null;
        this.filterAction = null;
        this.ignoreAction = null;
        this.onewaySynonymsAction = null;
        this.redirectAction = null;
        this.replacementAction = null;
        this.twowaySynonymsAction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaRuleBoostActionResponse boostAction;
        private GoogleCloudRetailV2betaConditionResponse condition;
        private GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction;
        private GoogleCloudRetailV2betaRuleFilterActionResponse filterAction;
        private GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction;
        private GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction;
        private GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction;
        private GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction;
        private GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostAction = defaults.boostAction;
    	      this.condition = defaults.condition;
    	      this.doNotAssociateAction = defaults.doNotAssociateAction;
    	      this.filterAction = defaults.filterAction;
    	      this.ignoreAction = defaults.ignoreAction;
    	      this.onewaySynonymsAction = defaults.onewaySynonymsAction;
    	      this.redirectAction = defaults.redirectAction;
    	      this.replacementAction = defaults.replacementAction;
    	      this.twowaySynonymsAction = defaults.twowaySynonymsAction;
        }

        public Builder boostAction(GoogleCloudRetailV2betaRuleBoostActionResponse boostAction) {
            this.boostAction = Objects.requireNonNull(boostAction);
            return this;
        }
        public Builder condition(GoogleCloudRetailV2betaConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder doNotAssociateAction(GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse doNotAssociateAction) {
            this.doNotAssociateAction = Objects.requireNonNull(doNotAssociateAction);
            return this;
        }
        public Builder filterAction(GoogleCloudRetailV2betaRuleFilterActionResponse filterAction) {
            this.filterAction = Objects.requireNonNull(filterAction);
            return this;
        }
        public Builder ignoreAction(GoogleCloudRetailV2betaRuleIgnoreActionResponse ignoreAction) {
            this.ignoreAction = Objects.requireNonNull(ignoreAction);
            return this;
        }
        public Builder onewaySynonymsAction(GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse onewaySynonymsAction) {
            this.onewaySynonymsAction = Objects.requireNonNull(onewaySynonymsAction);
            return this;
        }
        public Builder redirectAction(GoogleCloudRetailV2betaRuleRedirectActionResponse redirectAction) {
            this.redirectAction = Objects.requireNonNull(redirectAction);
            return this;
        }
        public Builder replacementAction(GoogleCloudRetailV2betaRuleReplacementActionResponse replacementAction) {
            this.replacementAction = Objects.requireNonNull(replacementAction);
            return this;
        }
        public Builder twowaySynonymsAction(GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse twowaySynonymsAction) {
            this.twowaySynonymsAction = Objects.requireNonNull(twowaySynonymsAction);
            return this;
        }        public GoogleCloudRetailV2betaRuleResponse build() {
            return new GoogleCloudRetailV2betaRuleResponse(boostAction, condition, doNotAssociateAction, filterAction, ignoreAction, onewaySynonymsAction, redirectAction, replacementAction, twowaySynonymsAction);
        }
    }
}

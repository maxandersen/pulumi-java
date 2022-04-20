// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.orgpolicy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleConditionGetArgs;
import com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleValuesGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySpecRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicySpecRuleGetArgs Empty = new PolicySpecRuleGetArgs();

    /**
     * Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="allowAll")
      private final @Nullable Output<String> allowAll;

    public Output<String> allowAll() {
        return this.allowAll == null ? Codegen.empty() : this.allowAll;
    }

    /**
     * A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr&#39; must include from 1 to 10 subexpressions, joined by the &#34;||&#34; or &#34;&amp;&amp;&#34; operators. Each subexpression must be of the form &#34;resource.matchTag(&#39;/tag_key_short_name, &#39;tag_value_short_name&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/key_id&#39;, &#39;tagValues/value_id&#39;)&#34;. where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: &#34;resource.matchTag(&#39;123456789/environment, &#39;prod&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/123&#39;, &#39;tagValues/456&#39;)&#34;.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<PolicySpecRuleConditionGetArgs> condition;

    public Output<PolicySpecRuleConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="denyAll")
      private final @Nullable Output<String> denyAll;

    public Output<String> denyAll() {
        return this.denyAll == null ? Codegen.empty() : this.denyAll;
    }

    /**
     * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
     * 
     */
    @Import(name="enforce")
      private final @Nullable Output<String> enforce;

    public Output<String> enforce() {
        return this.enforce == null ? Codegen.empty() : this.enforce;
    }

    /**
     * List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<PolicySpecRuleValuesGetArgs> values;

    public Output<PolicySpecRuleValuesGetArgs> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public PolicySpecRuleGetArgs(
        @Nullable Output<String> allowAll,
        @Nullable Output<PolicySpecRuleConditionGetArgs> condition,
        @Nullable Output<String> denyAll,
        @Nullable Output<String> enforce,
        @Nullable Output<PolicySpecRuleValuesGetArgs> values) {
        this.allowAll = allowAll;
        this.condition = condition;
        this.denyAll = denyAll;
        this.enforce = enforce;
        this.values = values;
    }

    private PolicySpecRuleGetArgs() {
        this.allowAll = Codegen.empty();
        this.condition = Codegen.empty();
        this.denyAll = Codegen.empty();
        this.enforce = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpecRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allowAll;
        private @Nullable Output<PolicySpecRuleConditionGetArgs> condition;
        private @Nullable Output<String> denyAll;
        private @Nullable Output<String> enforce;
        private @Nullable Output<PolicySpecRuleValuesGetArgs> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpecRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAll = defaults.allowAll;
    	      this.condition = defaults.condition;
    	      this.denyAll = defaults.denyAll;
    	      this.enforce = defaults.enforce;
    	      this.values = defaults.values;
        }

        public Builder allowAll(@Nullable Output<String> allowAll) {
            this.allowAll = allowAll;
            return this;
        }
        public Builder allowAll(@Nullable String allowAll) {
            this.allowAll = Codegen.ofNullable(allowAll);
            return this;
        }
        public Builder condition(@Nullable Output<PolicySpecRuleConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable PolicySpecRuleConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder denyAll(@Nullable Output<String> denyAll) {
            this.denyAll = denyAll;
            return this;
        }
        public Builder denyAll(@Nullable String denyAll) {
            this.denyAll = Codegen.ofNullable(denyAll);
            return this;
        }
        public Builder enforce(@Nullable Output<String> enforce) {
            this.enforce = enforce;
            return this;
        }
        public Builder enforce(@Nullable String enforce) {
            this.enforce = Codegen.ofNullable(enforce);
            return this;
        }
        public Builder values(@Nullable Output<PolicySpecRuleValuesGetArgs> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable PolicySpecRuleValuesGetArgs values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }        public PolicySpecRuleGetArgs build() {
            return new PolicySpecRuleGetArgs(allowAll, condition, denyAll, enforce, values);
        }
    }
}

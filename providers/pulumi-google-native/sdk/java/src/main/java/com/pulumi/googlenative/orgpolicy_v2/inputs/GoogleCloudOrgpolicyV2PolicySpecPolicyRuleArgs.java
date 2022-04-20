// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.orgpolicy_v2.inputs.GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesArgs;
import com.pulumi.googlenative.orgpolicy_v2.inputs.GoogleTypeExprArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule used to express this policy.
 * 
 */
public final class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs Empty = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs();

    /**
     * Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="allowAll")
      private final @Nullable Output<Boolean> allowAll;

    public Output<Boolean> allowAll() {
        return this.allowAll == null ? Codegen.empty() : this.allowAll;
    }

    /**
     * A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr&#39; must include from 1 to 10 subexpressions, joined by the &#34;||&#34; or &#34;&amp;&amp;&#34; operators. Each subexpression must be of the form &#34;resource.matchTag(&#39;/tag_key_short_name, &#39;tag_value_short_name&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/key_id&#39;, &#39;tagValues/value_id&#39;)&#34;. where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: &#34;resource.matchTag(&#39;123456789/environment, &#39;prod&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/123&#39;, &#39;tagValues/456&#39;)&#34;.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<GoogleTypeExprArgs> condition;

    public Output<GoogleTypeExprArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="denyAll")
      private final @Nullable Output<Boolean> denyAll;

    public Output<Boolean> denyAll() {
        return this.denyAll == null ? Codegen.empty() : this.denyAll;
    }

    /**
     * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
     * 
     */
    @Import(name="enforce")
      private final @Nullable Output<Boolean> enforce;

    public Output<Boolean> enforce() {
        return this.enforce == null ? Codegen.empty() : this.enforce;
    }

    /**
     * List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesArgs> values;

    public Output<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesArgs> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs(
        @Nullable Output<Boolean> allowAll,
        @Nullable Output<GoogleTypeExprArgs> condition,
        @Nullable Output<Boolean> denyAll,
        @Nullable Output<Boolean> enforce,
        @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesArgs> values) {
        this.allowAll = allowAll;
        this.condition = condition;
        this.denyAll = denyAll;
        this.enforce = enforce;
        this.values = values;
    }

    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs() {
        this.allowAll = Codegen.empty();
        this.condition = Codegen.empty();
        this.denyAll = Codegen.empty();
        this.enforce = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAll;
        private @Nullable Output<GoogleTypeExprArgs> condition;
        private @Nullable Output<Boolean> denyAll;
        private @Nullable Output<Boolean> enforce;
        private @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesArgs> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAll = defaults.allowAll;
    	      this.condition = defaults.condition;
    	      this.denyAll = defaults.denyAll;
    	      this.enforce = defaults.enforce;
    	      this.values = defaults.values;
        }

        public Builder allowAll(@Nullable Output<Boolean> allowAll) {
            this.allowAll = allowAll;
            return this;
        }
        public Builder allowAll(@Nullable Boolean allowAll) {
            this.allowAll = Codegen.ofNullable(allowAll);
            return this;
        }
        public Builder condition(@Nullable Output<GoogleTypeExprArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable GoogleTypeExprArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder denyAll(@Nullable Output<Boolean> denyAll) {
            this.denyAll = denyAll;
            return this;
        }
        public Builder denyAll(@Nullable Boolean denyAll) {
            this.denyAll = Codegen.ofNullable(denyAll);
            return this;
        }
        public Builder enforce(@Nullable Output<Boolean> enforce) {
            this.enforce = enforce;
            return this;
        }
        public Builder enforce(@Nullable Boolean enforce) {
            this.enforce = Codegen.ofNullable(enforce);
            return this;
        }
        public Builder values(@Nullable Output<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesArgs> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesArgs values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }        public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs build() {
            return new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs(allowAll, condition, denyAll, enforce, values);
        }
    }
}

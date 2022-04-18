// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.orgpolicy_v2.outputs.GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse;
import com.pulumi.googlenative.orgpolicy_v2.outputs.GoogleTypeExprResponse;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse {
    /**
     * Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
     * 
     */
    private final Boolean allowAll;
    /**
     * A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr' must include from 1 to 10 subexpressions, joined by the "||" or "&&" operators. Each subexpression must be of the form "resource.matchTag('/tag_key_short_name, 'tag_value_short_name')". or "resource.matchTagId('tagKeys/key_id', 'tagValues/value_id')". where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: "resource.matchTag('123456789/environment, 'prod')". or "resource.matchTagId('tagKeys/123', 'tagValues/456')".
     * 
     */
    private final GoogleTypeExprResponse condition;
    /**
     * Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
     * 
     */
    private final Boolean denyAll;
    /**
     * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
     * 
     */
    private final Boolean enforce;
    /**
     * List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
     * 
     */
    private final GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values;

    @CustomType.Constructor
    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse(
        @CustomType.Parameter("allowAll") Boolean allowAll,
        @CustomType.Parameter("condition") GoogleTypeExprResponse condition,
        @CustomType.Parameter("denyAll") Boolean denyAll,
        @CustomType.Parameter("enforce") Boolean enforce,
        @CustomType.Parameter("values") GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values) {
        this.allowAll = allowAll;
        this.condition = condition;
        this.denyAll = denyAll;
        this.enforce = enforce;
        this.values = values;
    }

    /**
     * Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
     * 
    */
    public Boolean allowAll() {
        return this.allowAll;
    }
    /**
     * A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr' must include from 1 to 10 subexpressions, joined by the "||" or "&&" operators. Each subexpression must be of the form "resource.matchTag('/tag_key_short_name, 'tag_value_short_name')". or "resource.matchTagId('tagKeys/key_id', 'tagValues/value_id')". where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: "resource.matchTag('123456789/environment, 'prod')". or "resource.matchTagId('tagKeys/123', 'tagValues/456')".
     * 
    */
    public GoogleTypeExprResponse condition() {
        return this.condition;
    }
    /**
     * Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
     * 
    */
    public Boolean denyAll() {
        return this.denyAll;
    }
    /**
     * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
     * 
    */
    public Boolean enforce() {
        return this.enforce;
    }
    /**
     * List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
     * 
    */
    public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowAll;
        private GoogleTypeExprResponse condition;
        private Boolean denyAll;
        private Boolean enforce;
        private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAll = defaults.allowAll;
    	      this.condition = defaults.condition;
    	      this.denyAll = defaults.denyAll;
    	      this.enforce = defaults.enforce;
    	      this.values = defaults.values;
        }

        public Builder allowAll(Boolean allowAll) {
            this.allowAll = Objects.requireNonNull(allowAll);
            return this;
        }
        public Builder condition(GoogleTypeExprResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder denyAll(Boolean denyAll) {
            this.denyAll = Objects.requireNonNull(denyAll);
            return this;
        }
        public Builder enforce(Boolean enforce) {
            this.enforce = Objects.requireNonNull(enforce);
            return this;
        }
        public Builder values(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }        public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse build() {
            return new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleResponse(allowAll, condition, denyAll, enforce, values);
        }
    }
}

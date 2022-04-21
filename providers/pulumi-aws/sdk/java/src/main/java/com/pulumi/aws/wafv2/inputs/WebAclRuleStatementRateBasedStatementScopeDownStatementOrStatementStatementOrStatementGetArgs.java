// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGetArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder statements(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGetArgs>> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGetArgs> statements) {
            return statements(Output.of(statements));
        }

        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementGetArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}

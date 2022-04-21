// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs>> statements;

    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder statements(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}

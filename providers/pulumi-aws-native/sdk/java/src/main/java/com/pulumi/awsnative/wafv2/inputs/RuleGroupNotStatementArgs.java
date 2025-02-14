// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class RuleGroupNotStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupNotStatementArgs Empty = new RuleGroupNotStatementArgs();

    @Import(name="statement", required=true)
    private Output<RuleGroupStatementArgs> statement;

    public Output<RuleGroupStatementArgs> statement() {
        return this.statement;
    }

    private RuleGroupNotStatementArgs() {}

    private RuleGroupNotStatementArgs(RuleGroupNotStatementArgs $) {
        this.statement = $.statement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupNotStatementArgs $;

        public Builder() {
            $ = new RuleGroupNotStatementArgs();
        }

        public Builder(RuleGroupNotStatementArgs defaults) {
            $ = new RuleGroupNotStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder statement(Output<RuleGroupStatementArgs> statement) {
            $.statement = statement;
            return this;
        }

        public Builder statement(RuleGroupStatementArgs statement) {
            return statement(Output.of(statement));
        }

        public RuleGroupNotStatementArgs build() {
            $.statement = Objects.requireNonNull($.statement, "expected parameter 'statement' to be non-null");
            return $;
        }
    }

}

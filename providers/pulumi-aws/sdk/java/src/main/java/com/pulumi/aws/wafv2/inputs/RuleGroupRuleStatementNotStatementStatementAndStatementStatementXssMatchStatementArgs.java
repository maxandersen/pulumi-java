// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs Empty = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs() {}

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs(RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs();
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs defaults) {
            $ = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}

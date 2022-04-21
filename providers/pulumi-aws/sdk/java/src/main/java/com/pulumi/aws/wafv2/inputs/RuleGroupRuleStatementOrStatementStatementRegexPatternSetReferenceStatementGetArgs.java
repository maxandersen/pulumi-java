// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs Empty = new RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs() {}

    private RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs(RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs $) {
        this.arn = $.arn;
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs();
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
            $ = new RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder fieldToMatch(@Nullable Output<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}

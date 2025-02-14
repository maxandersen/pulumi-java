// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement {
    /**
     * @return The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("fieldToMatch") @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
        this.arn = arn;
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement build() {
            return new RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}

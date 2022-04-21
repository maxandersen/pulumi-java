// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs() {}

    private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}

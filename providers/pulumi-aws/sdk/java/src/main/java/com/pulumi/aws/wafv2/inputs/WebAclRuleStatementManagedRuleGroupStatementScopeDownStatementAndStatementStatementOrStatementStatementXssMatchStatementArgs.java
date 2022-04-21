// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}

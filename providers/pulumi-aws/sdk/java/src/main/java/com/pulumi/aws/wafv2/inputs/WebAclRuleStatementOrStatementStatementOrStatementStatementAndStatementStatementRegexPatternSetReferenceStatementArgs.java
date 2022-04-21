// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs();

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
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs() {}

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs $) {
        this.arn = $.arn;
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}

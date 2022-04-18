// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleFieldToMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RegexMatchSetRegexMatchTupleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegexMatchSetRegexMatchTupleArgs Empty = new RegexMatchSetRegexMatchTupleArgs();

    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    @Import(name="fieldToMatch", required=true)
      private final Output<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch;

    public Output<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * The ID of a `WAF Regex Pattern Set`.
     * 
     */
    @Import(name="regexPatternSetId", required=true)
      private final Output<String> regexPatternSetId;

    public Output<String> regexPatternSetId() {
        return this.regexPatternSetId;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    @Import(name="textTransformation", required=true)
      private final Output<String> textTransformation;

    public Output<String> textTransformation() {
        return this.textTransformation;
    }

    public RegexMatchSetRegexMatchTupleArgs(
        Output<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch,
        Output<String> regexPatternSetId,
        Output<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId, "expected parameter 'regexPatternSetId' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private RegexMatchSetRegexMatchTupleArgs() {
        this.fieldToMatch = Codegen.empty();
        this.regexPatternSetId = Codegen.empty();
        this.textTransformation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetRegexMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch;
        private Output<String> regexPatternSetId;
        private Output<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexMatchSetRegexMatchTupleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexPatternSetId = defaults.regexPatternSetId;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(Output<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder fieldToMatch(RegexMatchSetRegexMatchTupleFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }
        public Builder regexPatternSetId(Output<String> regexPatternSetId) {
            this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId);
            return this;
        }
        public Builder regexPatternSetId(String regexPatternSetId) {
            this.regexPatternSetId = Output.of(Objects.requireNonNull(regexPatternSetId));
            return this;
        }
        public Builder textTransformation(Output<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Output.of(Objects.requireNonNull(textTransformation));
            return this;
        }        public RegexMatchSetRegexMatchTupleArgs build() {
            return new RegexMatchSetRegexMatchTupleArgs(fieldToMatch, regexPatternSetId, textTransformation);
        }
    }
}

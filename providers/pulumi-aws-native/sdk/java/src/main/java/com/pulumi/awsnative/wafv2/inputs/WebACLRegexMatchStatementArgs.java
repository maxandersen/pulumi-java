// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatchArgs;
import com.pulumi.awsnative.wafv2.inputs.WebACLTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WebACLRegexMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLRegexMatchStatementArgs Empty = new WebACLRegexMatchStatementArgs();

    @Import(name="fieldToMatch", required=true)
    private Output<WebACLFieldToMatchArgs> fieldToMatch;

    public Output<WebACLFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="regexString", required=true)
    private Output<String> regexString;

    public Output<String> regexString() {
        return this.regexString;
    }

    @Import(name="textTransformations", required=true)
    private Output<List<WebACLTextTransformationArgs>> textTransformations;

    public Output<List<WebACLTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebACLRegexMatchStatementArgs() {}

    private WebACLRegexMatchStatementArgs(WebACLRegexMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.regexString = $.regexString;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLRegexMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLRegexMatchStatementArgs $;

        public Builder() {
            $ = new WebACLRegexMatchStatementArgs();
        }

        public Builder(WebACLRegexMatchStatementArgs defaults) {
            $ = new WebACLRegexMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(Output<WebACLFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebACLFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder regexString(Output<String> regexString) {
            $.regexString = regexString;
            return this;
        }

        public Builder regexString(String regexString) {
            return regexString(Output.of(regexString));
        }

        public Builder textTransformations(Output<List<WebACLTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebACLTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebACLRegexMatchStatementArgs build() {
            $.fieldToMatch = Objects.requireNonNull($.fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
            $.regexString = Objects.requireNonNull($.regexString, "expected parameter 'regexString' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}

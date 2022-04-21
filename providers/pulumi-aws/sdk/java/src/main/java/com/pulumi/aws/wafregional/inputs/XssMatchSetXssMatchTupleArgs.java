// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleFieldToMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class XssMatchSetXssMatchTupleArgs extends com.pulumi.resources.ResourceArgs {

    public static final XssMatchSetXssMatchTupleArgs Empty = new XssMatchSetXssMatchTupleArgs();

    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    @Import(name="fieldToMatch", required=true)
    private Output<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch;

    public Output<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
     * 
     */
    @Import(name="textTransformation", required=true)
    private Output<String> textTransformation;

    public Output<String> textTransformation() {
        return this.textTransformation;
    }

    private XssMatchSetXssMatchTupleArgs() {}

    private XssMatchSetXssMatchTupleArgs(XssMatchSetXssMatchTupleArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformation = $.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(XssMatchSetXssMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private XssMatchSetXssMatchTupleArgs $;

        public Builder() {
            $ = new XssMatchSetXssMatchTupleArgs();
        }

        public Builder(XssMatchSetXssMatchTupleArgs defaults) {
            $ = new XssMatchSetXssMatchTupleArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(Output<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(XssMatchSetXssMatchTupleFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformation(Output<String> textTransformation) {
            $.textTransformation = textTransformation;
            return this;
        }

        public Builder textTransformation(String textTransformation) {
            return textTransformation(Output.of(textTransformation));
        }

        public XssMatchSetXssMatchTupleArgs build() {
            $.fieldToMatch = Objects.requireNonNull($.fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
            $.textTransformation = Objects.requireNonNull($.textTransformation, "expected parameter 'textTransformation' to be non-null");
            return $;
        }
    }

}

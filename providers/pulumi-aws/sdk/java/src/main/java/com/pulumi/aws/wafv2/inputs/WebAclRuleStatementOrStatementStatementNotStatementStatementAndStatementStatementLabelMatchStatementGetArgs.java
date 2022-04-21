// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs();

    /**
     * The string to match against.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs() {}

    private WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs(WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs $) {
        this.key = $.key;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatementLabelMatchStatementGetArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}

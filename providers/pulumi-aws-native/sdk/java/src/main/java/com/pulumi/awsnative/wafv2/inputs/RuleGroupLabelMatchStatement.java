// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.RuleGroupLabelMatchScope;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupLabelMatchStatement extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroupLabelMatchStatement Empty = new RuleGroupLabelMatchStatement();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="scope", required=true)
    private RuleGroupLabelMatchScope scope;

    public RuleGroupLabelMatchScope scope() {
        return this.scope;
    }

    private RuleGroupLabelMatchStatement() {}

    private RuleGroupLabelMatchStatement(RuleGroupLabelMatchStatement $) {
        this.key = $.key;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupLabelMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupLabelMatchStatement $;

        public Builder() {
            $ = new RuleGroupLabelMatchStatement();
        }

        public Builder(RuleGroupLabelMatchStatement defaults) {
            $ = new RuleGroupLabelMatchStatement(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder scope(RuleGroupLabelMatchScope scope) {
            $.scope = scope;
            return this;
        }

        public RuleGroupLabelMatchStatement build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}

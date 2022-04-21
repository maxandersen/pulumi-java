// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLStatement;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebACLOrStatement extends com.pulumi.resources.InvokeArgs {

    public static final WebACLOrStatement Empty = new WebACLOrStatement();

    @Import(name="statements", required=true)
    private List<WebACLStatement> statements;

    public List<WebACLStatement> statements() {
        return this.statements;
    }

    private WebACLOrStatement() {}

    private WebACLOrStatement(WebACLOrStatement $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLOrStatement $;

        public Builder() {
            $ = new WebACLOrStatement();
        }

        public Builder(WebACLOrStatement defaults) {
            $ = new WebACLOrStatement(Objects.requireNonNull(defaults));
        }

        public Builder statements(List<WebACLStatement> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(WebACLStatement... statements) {
            return statements(List.of(statements));
        }

        public WebACLOrStatement build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}

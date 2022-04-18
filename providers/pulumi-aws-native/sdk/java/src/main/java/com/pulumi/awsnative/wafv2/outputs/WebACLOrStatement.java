// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.WebACLStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebACLOrStatement {
    private final List<WebACLStatement> statements;

    @CustomType.Constructor
    private WebACLOrStatement(@CustomType.Parameter("statements") List<WebACLStatement> statements) {
        this.statements = statements;
    }

    public List<WebACLStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebACLStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebACLStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebACLStatement... statements) {
            return statements(List.of(statements));
        }        public WebACLOrStatement build() {
            return new WebACLOrStatement(statements);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLAllowAction;
import com.pulumi.awsnative.wafv2.inputs.WebACLBlockAction;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Default Action WebACL will take against ingress traffic when there is no matching Rule.
 * 
 */
public final class WebACLDefaultAction extends com.pulumi.resources.InvokeArgs {

    public static final WebACLDefaultAction Empty = new WebACLDefaultAction();

    @Import(name="allow")
      private final @Nullable WebACLAllowAction allow;

    public Optional<WebACLAllowAction> allow() {
        return this.allow == null ? Optional.empty() : Optional.ofNullable(this.allow);
    }

    @Import(name="block")
      private final @Nullable WebACLBlockAction block;

    public Optional<WebACLBlockAction> block() {
        return this.block == null ? Optional.empty() : Optional.ofNullable(this.block);
    }

    public WebACLDefaultAction(
        @Nullable WebACLAllowAction allow,
        @Nullable WebACLBlockAction block) {
        this.allow = allow;
        this.block = block;
    }

    private WebACLDefaultAction() {
        this.allow = null;
        this.block = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLAllowAction allow;
        private @Nullable WebACLBlockAction block;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
        }

        public Builder allow(@Nullable WebACLAllowAction allow) {
            this.allow = allow;
            return this;
        }
        public Builder block(@Nullable WebACLBlockAction block) {
            this.block = block;
            return this;
        }        public WebACLDefaultAction build() {
            return new WebACLDefaultAction(allow, block);
        }
    }
}

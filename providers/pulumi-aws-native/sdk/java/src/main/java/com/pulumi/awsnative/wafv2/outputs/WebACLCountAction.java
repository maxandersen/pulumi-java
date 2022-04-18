// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.WebACLCustomRequestHandling;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLCountAction {
    private final @Nullable WebACLCustomRequestHandling customRequestHandling;

    @CustomType.Constructor
    private WebACLCountAction(@CustomType.Parameter("customRequestHandling") @Nullable WebACLCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    public Optional<WebACLCustomRequestHandling> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCountAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCountAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable WebACLCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }        public WebACLCountAction build() {
            return new WebACLCountAction(customRequestHandling);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.RuleGroupCustomRequestHandling;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleActionCountProperties {
    private final @Nullable RuleGroupCustomRequestHandling customRequestHandling;

    @CustomType.Constructor
    private RuleGroupRuleActionCountProperties(@CustomType.Parameter("customRequestHandling") @Nullable RuleGroupCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    public Optional<RuleGroupCustomRequestHandling> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable RuleGroupCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }        public RuleGroupRuleActionCountProperties build() {
            return new RuleGroupRuleActionCountProperties(customRequestHandling);
        }
    }
}

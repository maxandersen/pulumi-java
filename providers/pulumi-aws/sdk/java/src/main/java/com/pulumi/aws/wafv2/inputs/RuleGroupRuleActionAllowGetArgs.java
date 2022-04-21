// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionAllowGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionAllowGetArgs Empty = new RuleGroupRuleActionAllowGetArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @Import(name="customRequestHandling")
    private @Nullable Output<RuleGroupRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling;

    public Optional<Output<RuleGroupRuleActionAllowCustomRequestHandlingGetArgs>> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    private RuleGroupRuleActionAllowGetArgs() {}

    private RuleGroupRuleActionAllowGetArgs(RuleGroupRuleActionAllowGetArgs $) {
        this.customRequestHandling = $.customRequestHandling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleActionAllowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleActionAllowGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleActionAllowGetArgs();
        }

        public Builder(RuleGroupRuleActionAllowGetArgs defaults) {
            $ = new RuleGroupRuleActionAllowGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder customRequestHandling(@Nullable Output<RuleGroupRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling) {
            $.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder customRequestHandling(RuleGroupRuleActionAllowCustomRequestHandlingGetArgs customRequestHandling) {
            return customRequestHandling(Output.of(customRequestHandling));
        }

        public RuleGroupRuleActionAllowGetArgs build() {
            return $;
        }
    }

}

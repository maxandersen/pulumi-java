// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionAllowPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionBlockPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionCaptchaPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionCountPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Action taken when Rule matches its condition.
 * 
 */
public final class RuleGroupRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionArgs Empty = new RuleGroupRuleActionArgs();

    /**
     * Allow traffic towards application.
     * 
     */
    @Import(name="allow")
      private final @Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow;

    public Output<RuleGroupRuleActionAllowPropertiesArgs> allow() {
        return this.allow == null ? Codegen.empty() : this.allow;
    }

    /**
     * Block traffic towards application.
     * 
     */
    @Import(name="block")
      private final @Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block;

    public Output<RuleGroupRuleActionBlockPropertiesArgs> block() {
        return this.block == null ? Codegen.empty() : this.block;
    }

    /**
     * Checks valid token exists with request.
     * 
     */
    @Import(name="captcha")
      private final @Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha;

    public Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha() {
        return this.captcha == null ? Codegen.empty() : this.captcha;
    }

    /**
     * Count traffic towards application.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count;

    public Output<RuleGroupRuleActionCountPropertiesArgs> count() {
        return this.count == null ? Codegen.empty() : this.count;
    }

    public RuleGroupRuleActionArgs(
        @Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow,
        @Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block,
        @Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha,
        @Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count) {
        this.allow = allow;
        this.block = block;
        this.captcha = captcha;
        this.count = count;
    }

    private RuleGroupRuleActionArgs() {
        this.allow = Codegen.empty();
        this.block = Codegen.empty();
        this.captcha = Codegen.empty();
        this.count = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow;
        private @Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block;
        private @Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha;
        private @Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.captcha = defaults.captcha;
    	      this.count = defaults.count;
        }

        public Builder allow(@Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow) {
            this.allow = allow;
            return this;
        }
        public Builder allow(@Nullable RuleGroupRuleActionAllowPropertiesArgs allow) {
            this.allow = Codegen.ofNullable(allow);
            return this;
        }
        public Builder block(@Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block) {
            this.block = block;
            return this;
        }
        public Builder block(@Nullable RuleGroupRuleActionBlockPropertiesArgs block) {
            this.block = Codegen.ofNullable(block);
            return this;
        }
        public Builder captcha(@Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha) {
            this.captcha = captcha;
            return this;
        }
        public Builder captcha(@Nullable RuleGroupRuleActionCaptchaPropertiesArgs captcha) {
            this.captcha = Codegen.ofNullable(captcha);
            return this;
        }
        public Builder count(@Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable RuleGroupRuleActionCountPropertiesArgs count) {
            this.count = Codegen.ofNullable(count);
            return this;
        }        public RuleGroupRuleActionArgs build() {
            return new RuleGroupRuleActionArgs(allow, block, captcha, count);
        }
    }
}

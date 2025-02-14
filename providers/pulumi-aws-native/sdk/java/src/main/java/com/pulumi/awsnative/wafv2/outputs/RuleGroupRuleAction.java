// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.RuleGroupRuleActionAllowProperties;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupRuleActionBlockProperties;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupRuleActionCaptchaProperties;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupRuleActionCountProperties;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleAction {
    /**
     * @return Allow traffic towards application.
     * 
     */
    private final @Nullable RuleGroupRuleActionAllowProperties allow;
    /**
     * @return Block traffic towards application.
     * 
     */
    private final @Nullable RuleGroupRuleActionBlockProperties block;
    /**
     * @return Checks valid token exists with request.
     * 
     */
    private final @Nullable RuleGroupRuleActionCaptchaProperties captcha;
    /**
     * @return Count traffic towards application.
     * 
     */
    private final @Nullable RuleGroupRuleActionCountProperties count;

    @CustomType.Constructor
    private RuleGroupRuleAction(
        @CustomType.Parameter("allow") @Nullable RuleGroupRuleActionAllowProperties allow,
        @CustomType.Parameter("block") @Nullable RuleGroupRuleActionBlockProperties block,
        @CustomType.Parameter("captcha") @Nullable RuleGroupRuleActionCaptchaProperties captcha,
        @CustomType.Parameter("count") @Nullable RuleGroupRuleActionCountProperties count) {
        this.allow = allow;
        this.block = block;
        this.captcha = captcha;
        this.count = count;
    }

    /**
     * @return Allow traffic towards application.
     * 
     */
    public Optional<RuleGroupRuleActionAllowProperties> allow() {
        return Optional.ofNullable(this.allow);
    }
    /**
     * @return Block traffic towards application.
     * 
     */
    public Optional<RuleGroupRuleActionBlockProperties> block() {
        return Optional.ofNullable(this.block);
    }
    /**
     * @return Checks valid token exists with request.
     * 
     */
    public Optional<RuleGroupRuleActionCaptchaProperties> captcha() {
        return Optional.ofNullable(this.captcha);
    }
    /**
     * @return Count traffic towards application.
     * 
     */
    public Optional<RuleGroupRuleActionCountProperties> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleActionAllowProperties allow;
        private @Nullable RuleGroupRuleActionBlockProperties block;
        private @Nullable RuleGroupRuleActionCaptchaProperties captcha;
        private @Nullable RuleGroupRuleActionCountProperties count;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.captcha = defaults.captcha;
    	      this.count = defaults.count;
        }

        public Builder allow(@Nullable RuleGroupRuleActionAllowProperties allow) {
            this.allow = allow;
            return this;
        }
        public Builder block(@Nullable RuleGroupRuleActionBlockProperties block) {
            this.block = block;
            return this;
        }
        public Builder captcha(@Nullable RuleGroupRuleActionCaptchaProperties captcha) {
            this.captcha = captcha;
            return this;
        }
        public Builder count(@Nullable RuleGroupRuleActionCountProperties count) {
            this.count = count;
            return this;
        }        public RuleGroupRuleAction build() {
            return new RuleGroupRuleAction(allow, block, captcha, count);
        }
    }
}

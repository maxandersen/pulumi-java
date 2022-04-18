// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.enums.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for L7 DDoS detection.
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs Empty = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs();

    /**
     * If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    @Import(name="ruleVisibility")
      private final @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility;

    public Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility() {
        return this.ruleVisibility == null ? Codegen.empty() : this.ruleVisibility;
    }

    public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs(
        @Nullable Output<Boolean> enable,
        @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility) {
        this.enable = enable;
        this.ruleVisibility = ruleVisibility;
    }

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs() {
        this.enable = Codegen.empty();
        this.ruleVisibility = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.ruleVisibility = defaults.ruleVisibility;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder ruleVisibility(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility) {
            this.ruleVisibility = ruleVisibility;
            return this;
        }
        public Builder ruleVisibility(@Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility ruleVisibility) {
            this.ruleVisibility = Codegen.ofNullable(ruleVisibility);
            return this;
        }        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs build() {
            return new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs(enable, ruleVisibility);
        }
    }
}

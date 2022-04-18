// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol;

import com.pulumi.awsnative.route53recoverycontrol.inputs.SafetyRuleAssertionRuleArgs;
import com.pulumi.awsnative.route53recoverycontrol.inputs.SafetyRuleGatingRuleArgs;
import com.pulumi.awsnative.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs;
import com.pulumi.awsnative.route53recoverycontrol.inputs.SafetyRuleTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SafetyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SafetyRuleArgs Empty = new SafetyRuleArgs();

    @Import(name="assertionRule")
      private final @Nullable Output<SafetyRuleAssertionRuleArgs> assertionRule;

    public Output<SafetyRuleAssertionRuleArgs> assertionRule() {
        return this.assertionRule == null ? Codegen.empty() : this.assertionRule;
    }

    /**
     * The Amazon Resource Name (ARN) of the control panel.
     * 
     */
    @Import(name="controlPanelArn")
      private final @Nullable Output<String> controlPanelArn;

    public Output<String> controlPanelArn() {
        return this.controlPanelArn == null ? Codegen.empty() : this.controlPanelArn;
    }

    @Import(name="gatingRule")
      private final @Nullable Output<SafetyRuleGatingRuleArgs> gatingRule;

    public Output<SafetyRuleGatingRuleArgs> gatingRule() {
        return this.gatingRule == null ? Codegen.empty() : this.gatingRule;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="ruleConfig")
      private final @Nullable Output<SafetyRuleRuleConfigArgs> ruleConfig;

    public Output<SafetyRuleRuleConfigArgs> ruleConfig() {
        return this.ruleConfig == null ? Codegen.empty() : this.ruleConfig;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<SafetyRuleTagArgs>> tags;

    public Output<List<SafetyRuleTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SafetyRuleArgs(
        @Nullable Output<SafetyRuleAssertionRuleArgs> assertionRule,
        @Nullable Output<String> controlPanelArn,
        @Nullable Output<SafetyRuleGatingRuleArgs> gatingRule,
        @Nullable Output<String> name,
        @Nullable Output<SafetyRuleRuleConfigArgs> ruleConfig,
        @Nullable Output<List<SafetyRuleTagArgs>> tags) {
        this.assertionRule = assertionRule;
        this.controlPanelArn = controlPanelArn;
        this.gatingRule = gatingRule;
        this.name = name;
        this.ruleConfig = ruleConfig;
        this.tags = tags;
    }

    private SafetyRuleArgs() {
        this.assertionRule = Codegen.empty();
        this.controlPanelArn = Codegen.empty();
        this.gatingRule = Codegen.empty();
        this.name = Codegen.empty();
        this.ruleConfig = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SafetyRuleAssertionRuleArgs> assertionRule;
        private @Nullable Output<String> controlPanelArn;
        private @Nullable Output<SafetyRuleGatingRuleArgs> gatingRule;
        private @Nullable Output<String> name;
        private @Nullable Output<SafetyRuleRuleConfigArgs> ruleConfig;
        private @Nullable Output<List<SafetyRuleTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertionRule = defaults.assertionRule;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.gatingRule = defaults.gatingRule;
    	      this.name = defaults.name;
    	      this.ruleConfig = defaults.ruleConfig;
    	      this.tags = defaults.tags;
        }

        public Builder assertionRule(@Nullable Output<SafetyRuleAssertionRuleArgs> assertionRule) {
            this.assertionRule = assertionRule;
            return this;
        }
        public Builder assertionRule(@Nullable SafetyRuleAssertionRuleArgs assertionRule) {
            this.assertionRule = Codegen.ofNullable(assertionRule);
            return this;
        }
        public Builder controlPanelArn(@Nullable Output<String> controlPanelArn) {
            this.controlPanelArn = controlPanelArn;
            return this;
        }
        public Builder controlPanelArn(@Nullable String controlPanelArn) {
            this.controlPanelArn = Codegen.ofNullable(controlPanelArn);
            return this;
        }
        public Builder gatingRule(@Nullable Output<SafetyRuleGatingRuleArgs> gatingRule) {
            this.gatingRule = gatingRule;
            return this;
        }
        public Builder gatingRule(@Nullable SafetyRuleGatingRuleArgs gatingRule) {
            this.gatingRule = Codegen.ofNullable(gatingRule);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ruleConfig(@Nullable Output<SafetyRuleRuleConfigArgs> ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public Builder ruleConfig(@Nullable SafetyRuleRuleConfigArgs ruleConfig) {
            this.ruleConfig = Codegen.ofNullable(ruleConfig);
            return this;
        }
        public Builder tags(@Nullable Output<List<SafetyRuleTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<SafetyRuleTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(SafetyRuleTagArgs... tags) {
            return tags(List.of(tags));
        }        public SafetyRuleArgs build() {
            return new SafetyRuleArgs(assertionRule, controlPanelArn, gatingRule, name, ruleConfig, tags);
        }
    }
}

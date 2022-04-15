// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AutoHealActionsArgs;
import io.pulumi.azurenative.web.inputs.AutoHealTriggersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rules that can be defined for auto-heal.
 * 
 */
public final class AutoHealRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoHealRulesArgs Empty = new AutoHealRulesArgs();

    /**
     * Actions to be executed when a rule is triggered.
     * 
     */
    @Import(name="actions")
      private final @Nullable Output<AutoHealActionsArgs> actions;

    public Output<AutoHealActionsArgs> actions() {
        return this.actions == null ? Codegen.empty() : this.actions;
    }

    /**
     * Conditions that describe when to execute the auto-heal actions.
     * 
     */
    @Import(name="triggers")
      private final @Nullable Output<AutoHealTriggersArgs> triggers;

    public Output<AutoHealTriggersArgs> triggers() {
        return this.triggers == null ? Codegen.empty() : this.triggers;
    }

    public AutoHealRulesArgs(
        @Nullable Output<AutoHealActionsArgs> actions,
        @Nullable Output<AutoHealTriggersArgs> triggers) {
        this.actions = actions;
        this.triggers = triggers;
    }

    private AutoHealRulesArgs() {
        this.actions = Codegen.empty();
        this.triggers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoHealActionsArgs> actions;
        private @Nullable Output<AutoHealTriggersArgs> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.triggers = defaults.triggers;
        }

        public Builder actions(@Nullable Output<AutoHealActionsArgs> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(@Nullable AutoHealActionsArgs actions) {
            this.actions = Codegen.ofNullable(actions);
            return this;
        }
        public Builder triggers(@Nullable Output<AutoHealTriggersArgs> triggers) {
            this.triggers = triggers;
            return this;
        }
        public Builder triggers(@Nullable AutoHealTriggersArgs triggers) {
            this.triggers = Codegen.ofNullable(triggers);
            return this;
        }        public AutoHealRulesArgs build() {
            return new AutoHealRulesArgs(actions, triggers);
        }
    }
}

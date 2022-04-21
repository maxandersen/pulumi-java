// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.ActionType;
import com.pulumi.azurenative.cdn.enums.ManagedRuleEnabledState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a managed rule group override setting.
 * 
 */
public final class ManagedRuleOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedRuleOverrideArgs Empty = new ManagedRuleOverrideArgs();

    /**
     * Describes the override action to be applied when rule matches.
     * 
     */
    @Import(name="action")
    private @Nullable Output<Either<String,ActionType>> action;

    public Optional<Output<Either<String,ActionType>>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified.
     * 
     */
    @Import(name="enabledState")
    private @Nullable Output<Either<String,ManagedRuleEnabledState>> enabledState;

    public Optional<Output<Either<String,ManagedRuleEnabledState>>> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * Identifier for the managed rule.
     * 
     */
    @Import(name="ruleId", required=true)
    private Output<String> ruleId;

    public Output<String> ruleId() {
        return this.ruleId;
    }

    private ManagedRuleOverrideArgs() {}

    private ManagedRuleOverrideArgs(ManagedRuleOverrideArgs $) {
        this.action = $.action;
        this.enabledState = $.enabledState;
        this.ruleId = $.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedRuleOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedRuleOverrideArgs $;

        public Builder() {
            $ = new ManagedRuleOverrideArgs();
        }

        public Builder(ManagedRuleOverrideArgs defaults) {
            $ = new ManagedRuleOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<Either<String,ActionType>> action) {
            $.action = action;
            return this;
        }

        public Builder action(Either<String,ActionType> action) {
            return action(Output.of(action));
        }

        public Builder enabledState(@Nullable Output<Either<String,ManagedRuleEnabledState>> enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        public Builder enabledState(Either<String,ManagedRuleEnabledState> enabledState) {
            return enabledState(Output.of(enabledState));
        }

        public Builder ruleId(Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public ManagedRuleOverrideArgs build() {
            $.ruleId = Objects.requireNonNull($.ruleId, "expected parameter 'ruleId' to be non-null");
            return $;
        }
    }

}

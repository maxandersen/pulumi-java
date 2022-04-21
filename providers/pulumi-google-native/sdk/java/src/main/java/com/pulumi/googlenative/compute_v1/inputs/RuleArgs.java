// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.RuleAction;
import com.pulumi.googlenative.compute_v1.inputs.ConditionArgs;
import com.pulumi.googlenative.compute_v1.inputs.LogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="action")
    private @Nullable Output<RuleAction> action;

    public Optional<Output<RuleAction>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<ConditionArgs>> conditions;

    public Optional<Output<List<ConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="ins")
    private @Nullable Output<List<String>> ins;

    public Optional<Output<List<String>>> ins() {
        return Optional.ofNullable(this.ins);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logConfigs")
    private @Nullable Output<List<LogConfigArgs>> logConfigs;

    public Optional<Output<List<LogConfigArgs>>> logConfigs() {
        return Optional.ofNullable(this.logConfigs);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="notIns")
    private @Nullable Output<List<String>> notIns;

    public Optional<Output<List<String>>> notIns() {
        return Optional.ofNullable(this.notIns);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private RuleArgs() {}

    private RuleArgs(RuleArgs $) {
        this.action = $.action;
        this.conditions = $.conditions;
        this.description = $.description;
        this.ins = $.ins;
        this.logConfigs = $.logConfigs;
        this.notIns = $.notIns;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleArgs $;

        public Builder() {
            $ = new RuleArgs();
        }

        public Builder(RuleArgs defaults) {
            $ = new RuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<RuleAction> action) {
            $.action = action;
            return this;
        }

        public Builder action(RuleAction action) {
            return action(Output.of(action));
        }

        public Builder conditions(@Nullable Output<List<ConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder ins(@Nullable Output<List<String>> ins) {
            $.ins = ins;
            return this;
        }

        public Builder ins(List<String> ins) {
            return ins(Output.of(ins));
        }

        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }

        public Builder logConfigs(@Nullable Output<List<LogConfigArgs>> logConfigs) {
            $.logConfigs = logConfigs;
            return this;
        }

        public Builder logConfigs(List<LogConfigArgs> logConfigs) {
            return logConfigs(Output.of(logConfigs));
        }

        public Builder logConfigs(LogConfigArgs... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }

        public Builder notIns(@Nullable Output<List<String>> notIns) {
            $.notIns = notIns;
            return this;
        }

        public Builder notIns(List<String> notIns) {
            return notIns(Output.of(notIns));
        }

        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public RuleArgs build() {
            return $;
        }
    }

}

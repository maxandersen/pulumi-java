// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.FrontDoorManagedRuleOverrideResponse;
import com.pulumi.azurenative.network.inputs.ManagedRuleExclusionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a managed rule group override setting.
 * 
 */
public final class FrontDoorManagedRuleGroupOverrideResponse extends com.pulumi.resources.InvokeArgs {

    public static final FrontDoorManagedRuleGroupOverrideResponse Empty = new FrontDoorManagedRuleGroupOverrideResponse();

    /**
     * Describes the exclusions that are applied to all rules in the group.
     * 
     */
    @Import(name="exclusions")
    private @Nullable List<ManagedRuleExclusionResponse> exclusions;

    public Optional<List<ManagedRuleExclusionResponse>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    /**
     * Describes the managed rule group to override.
     * 
     */
    @Import(name="ruleGroupName", required=true)
    private String ruleGroupName;

    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
     */
    @Import(name="rules")
    private @Nullable List<FrontDoorManagedRuleOverrideResponse> rules;

    public Optional<List<FrontDoorManagedRuleOverrideResponse>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private FrontDoorManagedRuleGroupOverrideResponse() {}

    private FrontDoorManagedRuleGroupOverrideResponse(FrontDoorManagedRuleGroupOverrideResponse $) {
        this.exclusions = $.exclusions;
        this.ruleGroupName = $.ruleGroupName;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontDoorManagedRuleGroupOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontDoorManagedRuleGroupOverrideResponse $;

        public Builder() {
            $ = new FrontDoorManagedRuleGroupOverrideResponse();
        }

        public Builder(FrontDoorManagedRuleGroupOverrideResponse defaults) {
            $ = new FrontDoorManagedRuleGroupOverrideResponse(Objects.requireNonNull(defaults));
        }

        public Builder exclusions(@Nullable List<ManagedRuleExclusionResponse> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        public Builder exclusions(ManagedRuleExclusionResponse... exclusions) {
            return exclusions(List.of(exclusions));
        }

        public Builder ruleGroupName(String ruleGroupName) {
            $.ruleGroupName = ruleGroupName;
            return this;
        }

        public Builder rules(@Nullable List<FrontDoorManagedRuleOverrideResponse> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(FrontDoorManagedRuleOverrideResponse... rules) {
            return rules(List.of(rules));
        }

        public FrontDoorManagedRuleGroupOverrideResponse build() {
            $.ruleGroupName = Objects.requireNonNull($.ruleGroupName, "expected parameter 'ruleGroupName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleCreateRule;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleDeprecateRule;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleFastRestoreRule;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleRetainRule;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleShareRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LifecyclePolicyPolicyDetailsSchedule {
    /**
     * @return Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    private final @Nullable Boolean copyTags;
    /**
     * @return See the `create_rule` block. Max of 1 per schedule.
     * 
     */
    private final LifecyclePolicyPolicyDetailsScheduleCreateRule createRule;
    /**
     * @return See the `cross_region_copy_rule` block. Max of 3 per schedule.
     * 
     */
    private final @Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules;
    /**
     * @return The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
     * 
     */
    private final @Nullable LifecyclePolicyPolicyDetailsScheduleDeprecateRule deprecateRule;
    /**
     * @return See the `fast_restore_rule` block. Max of 1 per schedule.
     * 
     */
    private final @Nullable LifecyclePolicyPolicyDetailsScheduleFastRestoreRule fastRestoreRule;
    /**
     * @return A name for the schedule.
     * 
     */
    private final String name;
    /**
     * @return The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    private final LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule;
    /**
     * @return See the `share_rule` block. Max of 1 per schedule.
     * 
     */
    private final @Nullable LifecyclePolicyPolicyDetailsScheduleShareRule shareRule;
    /**
     * @return A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
     * 
     */
    private final @Nullable Map<String,String> tagsToAdd;
    /**
     * @return A map of tag keys and variable values, where the values are determined when the policy is executed. Only `$(instance-id)` or `$(timestamp)` are valid values. Can only be used when `resource_types` is `INSTANCE`.
     * 
     */
    private final @Nullable Map<String,String> variableTags;

    @CustomType.Constructor
    private LifecyclePolicyPolicyDetailsSchedule(
        @CustomType.Parameter("copyTags") @Nullable Boolean copyTags,
        @CustomType.Parameter("createRule") LifecyclePolicyPolicyDetailsScheduleCreateRule createRule,
        @CustomType.Parameter("crossRegionCopyRules") @Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules,
        @CustomType.Parameter("deprecateRule") @Nullable LifecyclePolicyPolicyDetailsScheduleDeprecateRule deprecateRule,
        @CustomType.Parameter("fastRestoreRule") @Nullable LifecyclePolicyPolicyDetailsScheduleFastRestoreRule fastRestoreRule,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("retainRule") LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule,
        @CustomType.Parameter("shareRule") @Nullable LifecyclePolicyPolicyDetailsScheduleShareRule shareRule,
        @CustomType.Parameter("tagsToAdd") @Nullable Map<String,String> tagsToAdd,
        @CustomType.Parameter("variableTags") @Nullable Map<String,String> variableTags) {
        this.copyTags = copyTags;
        this.createRule = createRule;
        this.crossRegionCopyRules = crossRegionCopyRules;
        this.deprecateRule = deprecateRule;
        this.fastRestoreRule = fastRestoreRule;
        this.name = name;
        this.retainRule = retainRule;
        this.shareRule = shareRule;
        this.tagsToAdd = tagsToAdd;
        this.variableTags = variableTags;
    }

    /**
     * @return Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    public Optional<Boolean> copyTags() {
        return Optional.ofNullable(this.copyTags);
    }
    /**
     * @return See the `create_rule` block. Max of 1 per schedule.
     * 
     */
    public LifecyclePolicyPolicyDetailsScheduleCreateRule createRule() {
        return this.createRule;
    }
    /**
     * @return See the `cross_region_copy_rule` block. Max of 3 per schedule.
     * 
     */
    public List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules() {
        return this.crossRegionCopyRules == null ? List.of() : this.crossRegionCopyRules;
    }
    /**
     * @return The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
     * 
     */
    public Optional<LifecyclePolicyPolicyDetailsScheduleDeprecateRule> deprecateRule() {
        return Optional.ofNullable(this.deprecateRule);
    }
    /**
     * @return See the `fast_restore_rule` block. Max of 1 per schedule.
     * 
     */
    public Optional<LifecyclePolicyPolicyDetailsScheduleFastRestoreRule> fastRestoreRule() {
        return Optional.ofNullable(this.fastRestoreRule);
    }
    /**
     * @return A name for the schedule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    public LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule() {
        return this.retainRule;
    }
    /**
     * @return See the `share_rule` block. Max of 1 per schedule.
     * 
     */
    public Optional<LifecyclePolicyPolicyDetailsScheduleShareRule> shareRule() {
        return Optional.ofNullable(this.shareRule);
    }
    /**
     * @return A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
     * 
     */
    public Map<String,String> tagsToAdd() {
        return this.tagsToAdd == null ? Map.of() : this.tagsToAdd;
    }
    /**
     * @return A map of tag keys and variable values, where the values are determined when the policy is executed. Only `$(instance-id)` or `$(timestamp)` are valid values. Can only be used when `resource_types` is `INSTANCE`.
     * 
     */
    public Map<String,String> variableTags() {
        return this.variableTags == null ? Map.of() : this.variableTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean copyTags;
        private LifecyclePolicyPolicyDetailsScheduleCreateRule createRule;
        private @Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules;
        private @Nullable LifecyclePolicyPolicyDetailsScheduleDeprecateRule deprecateRule;
        private @Nullable LifecyclePolicyPolicyDetailsScheduleFastRestoreRule fastRestoreRule;
        private String name;
        private LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule;
        private @Nullable LifecyclePolicyPolicyDetailsScheduleShareRule shareRule;
        private @Nullable Map<String,String> tagsToAdd;
        private @Nullable Map<String,String> variableTags;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyTags = defaults.copyTags;
    	      this.createRule = defaults.createRule;
    	      this.crossRegionCopyRules = defaults.crossRegionCopyRules;
    	      this.deprecateRule = defaults.deprecateRule;
    	      this.fastRestoreRule = defaults.fastRestoreRule;
    	      this.name = defaults.name;
    	      this.retainRule = defaults.retainRule;
    	      this.shareRule = defaults.shareRule;
    	      this.tagsToAdd = defaults.tagsToAdd;
    	      this.variableTags = defaults.variableTags;
        }

        public Builder copyTags(@Nullable Boolean copyTags) {
            this.copyTags = copyTags;
            return this;
        }
        public Builder createRule(LifecyclePolicyPolicyDetailsScheduleCreateRule createRule) {
            this.createRule = Objects.requireNonNull(createRule);
            return this;
        }
        public Builder crossRegionCopyRules(@Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules) {
            this.crossRegionCopyRules = crossRegionCopyRules;
            return this;
        }
        public Builder crossRegionCopyRules(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule... crossRegionCopyRules) {
            return crossRegionCopyRules(List.of(crossRegionCopyRules));
        }
        public Builder deprecateRule(@Nullable LifecyclePolicyPolicyDetailsScheduleDeprecateRule deprecateRule) {
            this.deprecateRule = deprecateRule;
            return this;
        }
        public Builder fastRestoreRule(@Nullable LifecyclePolicyPolicyDetailsScheduleFastRestoreRule fastRestoreRule) {
            this.fastRestoreRule = fastRestoreRule;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder retainRule(LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule) {
            this.retainRule = Objects.requireNonNull(retainRule);
            return this;
        }
        public Builder shareRule(@Nullable LifecyclePolicyPolicyDetailsScheduleShareRule shareRule) {
            this.shareRule = shareRule;
            return this;
        }
        public Builder tagsToAdd(@Nullable Map<String,String> tagsToAdd) {
            this.tagsToAdd = tagsToAdd;
            return this;
        }
        public Builder variableTags(@Nullable Map<String,String> variableTags) {
            this.variableTags = variableTags;
            return this;
        }        public LifecyclePolicyPolicyDetailsSchedule build() {
            return new LifecyclePolicyPolicyDetailsSchedule(copyTags, createRule, crossRegionCopyRules, deprecateRule, fastRestoreRule, name, retainRule, shareRule, tagsToAdd, variableTags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.aws.alb.outputs.ListenerRuleActionForwardStickiness;
import com.pulumi.aws.alb.outputs.ListenerRuleActionForwardTargetGroup;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleActionForward {
    /**
     * The target group stickiness for the rule.
     * 
     */
    private final @Nullable ListenerRuleActionForwardStickiness stickiness;
    /**
     * One or more target groups block.
     * 
     */
    private final List<ListenerRuleActionForwardTargetGroup> targetGroups;

    @CustomType.Constructor
    private ListenerRuleActionForward(
        @CustomType.Parameter("stickiness") @Nullable ListenerRuleActionForwardStickiness stickiness,
        @CustomType.Parameter("targetGroups") List<ListenerRuleActionForwardTargetGroup> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = targetGroups;
    }

    /**
     * The target group stickiness for the rule.
     * 
    */
    public Optional<ListenerRuleActionForwardStickiness> stickiness() {
        return Optional.ofNullable(this.stickiness);
    }
    /**
     * One or more target groups block.
     * 
    */
    public List<ListenerRuleActionForwardTargetGroup> targetGroups() {
        return this.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForward defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerRuleActionForwardStickiness stickiness;
        private List<ListenerRuleActionForwardTargetGroup> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForward defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickiness(@Nullable ListenerRuleActionForwardStickiness stickiness) {
            this.stickiness = stickiness;
            return this;
        }
        public Builder targetGroups(List<ListenerRuleActionForwardTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public Builder targetGroups(ListenerRuleActionForwardTargetGroup... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public ListenerRuleActionForward build() {
            return new ListenerRuleActionForward(stickiness, targetGroups);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.aws.alb.outputs.GetListenerDefaultActionForwardStickiness;
import com.pulumi.aws.alb.outputs.GetListenerDefaultActionForwardTargetGroup;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionForward {
    private final List<GetListenerDefaultActionForwardStickiness> stickinesses;
    private final List<GetListenerDefaultActionForwardTargetGroup> targetGroups;

    @CustomType.Constructor
    private GetListenerDefaultActionForward(
        @CustomType.Parameter("stickinesses") List<GetListenerDefaultActionForwardStickiness> stickinesses,
        @CustomType.Parameter("targetGroups") List<GetListenerDefaultActionForwardTargetGroup> targetGroups) {
        this.stickinesses = stickinesses;
        this.targetGroups = targetGroups;
    }

    public List<GetListenerDefaultActionForwardStickiness> stickinesses() {
        return this.stickinesses;
    }
    public List<GetListenerDefaultActionForwardTargetGroup> targetGroups() {
        return this.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionForward defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetListenerDefaultActionForwardStickiness> stickinesses;
        private List<GetListenerDefaultActionForwardTargetGroup> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionForward defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickinesses = defaults.stickinesses;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickinesses(List<GetListenerDefaultActionForwardStickiness> stickinesses) {
            this.stickinesses = Objects.requireNonNull(stickinesses);
            return this;
        }
        public Builder stickinesses(GetListenerDefaultActionForwardStickiness... stickinesses) {
            return stickinesses(List.of(stickinesses));
        }
        public Builder targetGroups(List<GetListenerDefaultActionForwardTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public Builder targetGroups(GetListenerDefaultActionForwardTargetGroup... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public GetListenerDefaultActionForward build() {
            return new GetListenerDefaultActionForward(stickinesses, targetGroups);
        }
    }
}

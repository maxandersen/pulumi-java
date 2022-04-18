// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.aws.applicationloadbalancing.inputs.GetListenerDefaultActionForwardStickiness;
import com.pulumi.aws.applicationloadbalancing.inputs.GetListenerDefaultActionForwardTargetGroup;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class GetListenerDefaultActionForward extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionForward Empty = new GetListenerDefaultActionForward();

    @Import(name="stickinesses", required=true)
      private final List<GetListenerDefaultActionForwardStickiness> stickinesses;

    public List<GetListenerDefaultActionForwardStickiness> stickinesses() {
        return this.stickinesses;
    }

    @Import(name="targetGroups", required=true)
      private final List<GetListenerDefaultActionForwardTargetGroup> targetGroups;

    public List<GetListenerDefaultActionForwardTargetGroup> targetGroups() {
        return this.targetGroups;
    }

    public GetListenerDefaultActionForward(
        List<GetListenerDefaultActionForwardStickiness> stickinesses,
        List<GetListenerDefaultActionForwardTargetGroup> targetGroups) {
        this.stickinesses = Objects.requireNonNull(stickinesses, "expected parameter 'stickinesses' to be non-null");
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private GetListenerDefaultActionForward() {
        this.stickinesses = List.of();
        this.targetGroups = List.of();
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

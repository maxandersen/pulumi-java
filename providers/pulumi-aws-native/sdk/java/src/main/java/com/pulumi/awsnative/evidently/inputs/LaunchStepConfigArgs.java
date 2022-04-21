// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.awsnative.evidently.inputs.LaunchGroupToWeightArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LaunchStepConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchStepConfigArgs Empty = new LaunchStepConfigArgs();

    @Import(name="groupWeights", required=true)
    private Output<List<LaunchGroupToWeightArgs>> groupWeights;

    public Output<List<LaunchGroupToWeightArgs>> groupWeights() {
        return this.groupWeights;
    }

    @Import(name="startTime", required=true)
    private Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime;
    }

    private LaunchStepConfigArgs() {}

    private LaunchStepConfigArgs(LaunchStepConfigArgs $) {
        this.groupWeights = $.groupWeights;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchStepConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchStepConfigArgs $;

        public Builder() {
            $ = new LaunchStepConfigArgs();
        }

        public Builder(LaunchStepConfigArgs defaults) {
            $ = new LaunchStepConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupWeights(Output<List<LaunchGroupToWeightArgs>> groupWeights) {
            $.groupWeights = groupWeights;
            return this;
        }

        public Builder groupWeights(List<LaunchGroupToWeightArgs> groupWeights) {
            return groupWeights(Output.of(groupWeights));
        }

        public Builder groupWeights(LaunchGroupToWeightArgs... groupWeights) {
            return groupWeights(List.of(groupWeights));
        }

        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public LaunchStepConfigArgs build() {
            $.groupWeights = Objects.requireNonNull($.groupWeights, "expected parameter 'groupWeights' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}

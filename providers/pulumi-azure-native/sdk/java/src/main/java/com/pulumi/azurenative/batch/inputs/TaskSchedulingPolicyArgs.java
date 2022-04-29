// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.ComputeNodeFillType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


public final class TaskSchedulingPolicyArgs extends ResourceArgs {

    public static final TaskSchedulingPolicyArgs Empty = new TaskSchedulingPolicyArgs();

    @Import(name="nodeFillType", required=true)
    private Output<ComputeNodeFillType> nodeFillType;

    public Output<ComputeNodeFillType> nodeFillType() {
        return this.nodeFillType;
    }

    private TaskSchedulingPolicyArgs() {}

    private TaskSchedulingPolicyArgs(TaskSchedulingPolicyArgs $) {
        this.nodeFillType = $.nodeFillType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSchedulingPolicyArgs $;

        public Builder() {
            $ = new TaskSchedulingPolicyArgs();
        }

        public Builder(TaskSchedulingPolicyArgs defaults) {
            $ = new TaskSchedulingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder nodeFillType(Output<ComputeNodeFillType> nodeFillType) {
            $.nodeFillType = nodeFillType;
            return this;
        }

        public Builder nodeFillType(ComputeNodeFillType nodeFillType) {
            return nodeFillType(Output.of(nodeFillType));
        }

        public TaskSchedulingPolicyArgs build() {
            $.nodeFillType = Objects.requireNonNull($.nodeFillType, "expected parameter 'nodeFillType' to be non-null");
            return $;
        }
    }

}

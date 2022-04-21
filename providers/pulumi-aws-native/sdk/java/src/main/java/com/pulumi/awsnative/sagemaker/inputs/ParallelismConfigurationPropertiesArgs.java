// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ParallelismConfigurationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParallelismConfigurationPropertiesArgs Empty = new ParallelismConfigurationPropertiesArgs();

    /**
     * Maximum parallel execution steps
     * 
     */
    @Import(name="maxParallelExecutionSteps", required=true)
    private Output<Integer> maxParallelExecutionSteps;

    public Output<Integer> maxParallelExecutionSteps() {
        return this.maxParallelExecutionSteps;
    }

    private ParallelismConfigurationPropertiesArgs() {}

    private ParallelismConfigurationPropertiesArgs(ParallelismConfigurationPropertiesArgs $) {
        this.maxParallelExecutionSteps = $.maxParallelExecutionSteps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParallelismConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParallelismConfigurationPropertiesArgs $;

        public Builder() {
            $ = new ParallelismConfigurationPropertiesArgs();
        }

        public Builder(ParallelismConfigurationPropertiesArgs defaults) {
            $ = new ParallelismConfigurationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxParallelExecutionSteps(Output<Integer> maxParallelExecutionSteps) {
            $.maxParallelExecutionSteps = maxParallelExecutionSteps;
            return this;
        }

        public Builder maxParallelExecutionSteps(Integer maxParallelExecutionSteps) {
            return maxParallelExecutionSteps(Output.of(maxParallelExecutionSteps));
        }

        public ParallelismConfigurationPropertiesArgs build() {
            $.maxParallelExecutionSteps = Objects.requireNonNull($.maxParallelExecutionSteps, "expected parameter 'maxParallelExecutionSteps' to be non-null");
            return $;
        }
    }

}

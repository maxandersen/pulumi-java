// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImagePipelineScheduleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImagePipelineScheduleGetArgs Empty = new ImagePipelineScheduleGetArgs();

    /**
     * Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
     */
    @Import(name="pipelineExecutionStartCondition")
    private @Nullable Output<String> pipelineExecutionStartCondition;

    public Optional<Output<String>> pipelineExecutionStartCondition() {
        return Optional.ofNullable(this.pipelineExecutionStartCondition);
    }

    /**
     * Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
     */
    @Import(name="scheduleExpression", required=true)
    private Output<String> scheduleExpression;

    public Output<String> scheduleExpression() {
        return this.scheduleExpression;
    }

    private ImagePipelineScheduleGetArgs() {}

    private ImagePipelineScheduleGetArgs(ImagePipelineScheduleGetArgs $) {
        this.pipelineExecutionStartCondition = $.pipelineExecutionStartCondition;
        this.scheduleExpression = $.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImagePipelineScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImagePipelineScheduleGetArgs $;

        public Builder() {
            $ = new ImagePipelineScheduleGetArgs();
        }

        public Builder(ImagePipelineScheduleGetArgs defaults) {
            $ = new ImagePipelineScheduleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder pipelineExecutionStartCondition(@Nullable Output<String> pipelineExecutionStartCondition) {
            $.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
            return this;
        }

        public Builder pipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
            return pipelineExecutionStartCondition(Output.of(pipelineExecutionStartCondition));
        }

        public Builder scheduleExpression(Output<String> scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            return scheduleExpression(Output.of(scheduleExpression));
        }

        public ImagePipelineScheduleGetArgs build() {
            $.scheduleExpression = Objects.requireNonNull($.scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
            return $;
        }
    }

}

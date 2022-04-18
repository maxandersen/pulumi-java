// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImagePipelineSchedule extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePipelineSchedule Empty = new GetImagePipelineSchedule();

    /**
     * Condition when the pipeline should trigger a new image build.
     * 
     */
    @Import(name="pipelineExecutionStartCondition", required=true)
      private final String pipelineExecutionStartCondition;

    public String pipelineExecutionStartCondition() {
        return this.pipelineExecutionStartCondition;
    }

    /**
     * Cron expression of how often the pipeline start condition is evaluated.
     * 
     */
    @Import(name="scheduleExpression", required=true)
      private final String scheduleExpression;

    public String scheduleExpression() {
        return this.scheduleExpression;
    }

    public GetImagePipelineSchedule(
        String pipelineExecutionStartCondition,
        String scheduleExpression) {
        this.pipelineExecutionStartCondition = Objects.requireNonNull(pipelineExecutionStartCondition, "expected parameter 'pipelineExecutionStartCondition' to be non-null");
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private GetImagePipelineSchedule() {
        this.pipelineExecutionStartCondition = null;
        this.scheduleExpression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineExecutionStartCondition;
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagePipelineSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineExecutionStartCondition = defaults.pipelineExecutionStartCondition;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder pipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = Objects.requireNonNull(pipelineExecutionStartCondition);
            return this;
        }
        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }        public GetImagePipelineSchedule build() {
            return new GetImagePipelineSchedule(pipelineExecutionStartCondition, scheduleExpression);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * State of the auto-rollout process.
 * 
 */
public final class GoogleCloudDialogflowCxV3RolloutStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3RolloutStateResponse Empty = new GoogleCloudDialogflowCxV3RolloutStateResponse();

    /**
     * Start time of the current step.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Display name of the current auto rollout step.
     * 
     */
    @Import(name="step", required=true)
      private final String step;

    public String step() {
        return this.step;
    }

    /**
     * Index of the current step in the auto rollout steps list.
     * 
     */
    @Import(name="stepIndex", required=true)
      private final Integer stepIndex;

    public Integer stepIndex() {
        return this.stepIndex;
    }

    public GoogleCloudDialogflowCxV3RolloutStateResponse(
        String startTime,
        String step,
        Integer stepIndex) {
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.step = Objects.requireNonNull(step, "expected parameter 'step' to be non-null");
        this.stepIndex = Objects.requireNonNull(stepIndex, "expected parameter 'stepIndex' to be non-null");
    }

    private GoogleCloudDialogflowCxV3RolloutStateResponse() {
        this.startTime = null;
        this.step = null;
        this.stepIndex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3RolloutStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTime;
        private String step;
        private Integer stepIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3RolloutStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
    	      this.step = defaults.step;
    	      this.stepIndex = defaults.stepIndex;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder step(String step) {
            this.step = Objects.requireNonNull(step);
            return this;
        }
        public Builder stepIndex(Integer stepIndex) {
            this.stepIndex = Objects.requireNonNull(stepIndex);
            return this;
        }        public GoogleCloudDialogflowCxV3RolloutStateResponse build() {
            return new GoogleCloudDialogflowCxV3RolloutStateResponse(startTime, step, stepIndex);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__PredictionInputResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__PredictionOutputResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__TrainingInputResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__TrainingOutputResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    /**
     * @return When the job was created.
     * 
     */
    private final String createTime;
    /**
     * @return When the job processing was completed.
     * 
     */
    private final String endTime;
    /**
     * @return The details of a failure or a cancellation.
     * 
     */
    private final String errorMessage;
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a job from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform job updates in order to avoid race conditions: An `etag` is returned in the response to `GetJob`, and systems are expected to put that etag in the request to `UpdateJob` to ensure that their change will be applied to the same version of the job.
     * 
     */
    private final String etag;
    /**
     * @return The user-specified id of the job.
     * 
     */
    private final String jobId;
    /**
     * @return It&#39;s only effect when the job is in QUEUED state. If it&#39;s positive, it indicates the job&#39;s position in the job scheduler. It&#39;s 0 when the job is already scheduled.
     * 
     */
    private final String jobPosition;
    /**
     * @return Optional. One or more labels that you can add, to organize your jobs. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Input parameters to create a prediction job.
     * 
     */
    private final GoogleCloudMlV1__PredictionInputResponse predictionInput;
    /**
     * @return The current prediction job result.
     * 
     */
    private final GoogleCloudMlV1__PredictionOutputResponse predictionOutput;
    /**
     * @return When the job processing was started.
     * 
     */
    private final String startTime;
    /**
     * @return The detailed state of a job.
     * 
     */
    private final String state;
    /**
     * @return Input parameters to create a training job.
     * 
     */
    private final GoogleCloudMlV1__TrainingInputResponse trainingInput;
    /**
     * @return The current training job result.
     * 
     */
    private final GoogleCloudMlV1__TrainingOutputResponse trainingOutput;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("jobId") String jobId,
        @CustomType.Parameter("jobPosition") String jobPosition,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("predictionInput") GoogleCloudMlV1__PredictionInputResponse predictionInput,
        @CustomType.Parameter("predictionOutput") GoogleCloudMlV1__PredictionOutputResponse predictionOutput,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("trainingInput") GoogleCloudMlV1__TrainingInputResponse trainingInput,
        @CustomType.Parameter("trainingOutput") GoogleCloudMlV1__TrainingOutputResponse trainingOutput) {
        this.createTime = createTime;
        this.endTime = endTime;
        this.errorMessage = errorMessage;
        this.etag = etag;
        this.jobId = jobId;
        this.jobPosition = jobPosition;
        this.labels = labels;
        this.predictionInput = predictionInput;
        this.predictionOutput = predictionOutput;
        this.startTime = startTime;
        this.state = state;
        this.trainingInput = trainingInput;
        this.trainingOutput = trainingOutput;
    }

    /**
     * @return When the job was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return When the job processing was completed.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The details of a failure or a cancellation.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a job from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform job updates in order to avoid race conditions: An `etag` is returned in the response to `GetJob`, and systems are expected to put that etag in the request to `UpdateJob` to ensure that their change will be applied to the same version of the job.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The user-specified id of the job.
     * 
     */
    public String jobId() {
        return this.jobId;
    }
    /**
     * @return It&#39;s only effect when the job is in QUEUED state. If it&#39;s positive, it indicates the job&#39;s position in the job scheduler. It&#39;s 0 when the job is already scheduled.
     * 
     */
    public String jobPosition() {
        return this.jobPosition;
    }
    /**
     * @return Optional. One or more labels that you can add, to organize your jobs. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Input parameters to create a prediction job.
     * 
     */
    public GoogleCloudMlV1__PredictionInputResponse predictionInput() {
        return this.predictionInput;
    }
    /**
     * @return The current prediction job result.
     * 
     */
    public GoogleCloudMlV1__PredictionOutputResponse predictionOutput() {
        return this.predictionOutput;
    }
    /**
     * @return When the job processing was started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The detailed state of a job.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Input parameters to create a training job.
     * 
     */
    public GoogleCloudMlV1__TrainingInputResponse trainingInput() {
        return this.trainingInput;
    }
    /**
     * @return The current training job result.
     * 
     */
    public GoogleCloudMlV1__TrainingOutputResponse trainingOutput() {
        return this.trainingOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String endTime;
        private String errorMessage;
        private String etag;
        private String jobId;
        private String jobPosition;
        private Map<String,String> labels;
        private GoogleCloudMlV1__PredictionInputResponse predictionInput;
        private GoogleCloudMlV1__PredictionOutputResponse predictionOutput;
        private String startTime;
        private String state;
        private GoogleCloudMlV1__TrainingInputResponse trainingInput;
        private GoogleCloudMlV1__TrainingOutputResponse trainingOutput;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.endTime = defaults.endTime;
    	      this.errorMessage = defaults.errorMessage;
    	      this.etag = defaults.etag;
    	      this.jobId = defaults.jobId;
    	      this.jobPosition = defaults.jobPosition;
    	      this.labels = defaults.labels;
    	      this.predictionInput = defaults.predictionInput;
    	      this.predictionOutput = defaults.predictionOutput;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trainingInput = defaults.trainingInput;
    	      this.trainingOutput = defaults.trainingOutput;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        public Builder jobPosition(String jobPosition) {
            this.jobPosition = Objects.requireNonNull(jobPosition);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder predictionInput(GoogleCloudMlV1__PredictionInputResponse predictionInput) {
            this.predictionInput = Objects.requireNonNull(predictionInput);
            return this;
        }
        public Builder predictionOutput(GoogleCloudMlV1__PredictionOutputResponse predictionOutput) {
            this.predictionOutput = Objects.requireNonNull(predictionOutput);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder trainingInput(GoogleCloudMlV1__TrainingInputResponse trainingInput) {
            this.trainingInput = Objects.requireNonNull(trainingInput);
            return this;
        }
        public Builder trainingOutput(GoogleCloudMlV1__TrainingOutputResponse trainingOutput) {
            this.trainingOutput = Objects.requireNonNull(trainingOutput);
            return this;
        }        public GetJobResult build() {
            return new GetJobResult(createTime, endTime, errorMessage, etag, jobId, jobPosition, labels, predictionInput, predictionOutput, startTime, state, trainingInput, trainingOutput);
        }
    }
}

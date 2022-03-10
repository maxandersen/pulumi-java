// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__BuiltInAlgorithmOutputResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__HyperparameterOutputResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__TrainingOutputResponse {
    /**
     * Details related to built-in algorithms jobs. Only set for built-in algorithms jobs.
     * 
     */
    private final GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput;
    /**
     * The number of hyperparameter tuning trials that completed successfully. Only set for hyperparameter tuning jobs.
     * 
     */
    private final String completedTrialCount;
    /**
     * The amount of ML units consumed by the job.
     * 
     */
    private final Double consumedMLUnits;
    /**
     * The TensorFlow summary tag name used for optimizing hyperparameter tuning trials. See [`HyperparameterSpec.hyperparameterMetricTag`](#HyperparameterSpec.FIELDS.hyperparameter_metric_tag) for more information. Only set for hyperparameter tuning jobs.
     * 
     */
    private final String hyperparameterMetricTag;
    /**
     * Whether this job is a built-in Algorithm job.
     * 
     */
    private final Boolean isBuiltInAlgorithmJob;
    /**
     * Whether this job is a hyperparameter tuning job.
     * 
     */
    private final Boolean isHyperparameterTuningJob;
    /**
     * Results for individual Hyperparameter trials. Only set for hyperparameter tuning jobs.
     * 
     */
    private final List<GoogleCloudMlV1__HyperparameterOutputResponse> trials;
    /**
     * URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only available if training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0` for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
     * 
     */
    private final Map<String,String> webAccessUris;

    @OutputCustomType.Constructor
    private GoogleCloudMlV1__TrainingOutputResponse(
        @OutputCustomType.Parameter("builtInAlgorithmOutput") GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput,
        @OutputCustomType.Parameter("completedTrialCount") String completedTrialCount,
        @OutputCustomType.Parameter("consumedMLUnits") Double consumedMLUnits,
        @OutputCustomType.Parameter("hyperparameterMetricTag") String hyperparameterMetricTag,
        @OutputCustomType.Parameter("isBuiltInAlgorithmJob") Boolean isBuiltInAlgorithmJob,
        @OutputCustomType.Parameter("isHyperparameterTuningJob") Boolean isHyperparameterTuningJob,
        @OutputCustomType.Parameter("trials") List<GoogleCloudMlV1__HyperparameterOutputResponse> trials,
        @OutputCustomType.Parameter("webAccessUris") Map<String,String> webAccessUris) {
        this.builtInAlgorithmOutput = builtInAlgorithmOutput;
        this.completedTrialCount = completedTrialCount;
        this.consumedMLUnits = consumedMLUnits;
        this.hyperparameterMetricTag = hyperparameterMetricTag;
        this.isBuiltInAlgorithmJob = isBuiltInAlgorithmJob;
        this.isHyperparameterTuningJob = isHyperparameterTuningJob;
        this.trials = trials;
        this.webAccessUris = webAccessUris;
    }

    /**
     * Details related to built-in algorithms jobs. Only set for built-in algorithms jobs.
     * 
    */
    public GoogleCloudMlV1__BuiltInAlgorithmOutputResponse getBuiltInAlgorithmOutput() {
        return this.builtInAlgorithmOutput;
    }
    /**
     * The number of hyperparameter tuning trials that completed successfully. Only set for hyperparameter tuning jobs.
     * 
    */
    public String getCompletedTrialCount() {
        return this.completedTrialCount;
    }
    /**
     * The amount of ML units consumed by the job.
     * 
    */
    public Double getConsumedMLUnits() {
        return this.consumedMLUnits;
    }
    /**
     * The TensorFlow summary tag name used for optimizing hyperparameter tuning trials. See [`HyperparameterSpec.hyperparameterMetricTag`](#HyperparameterSpec.FIELDS.hyperparameter_metric_tag) for more information. Only set for hyperparameter tuning jobs.
     * 
    */
    public String getHyperparameterMetricTag() {
        return this.hyperparameterMetricTag;
    }
    /**
     * Whether this job is a built-in Algorithm job.
     * 
    */
    public Boolean getIsBuiltInAlgorithmJob() {
        return this.isBuiltInAlgorithmJob;
    }
    /**
     * Whether this job is a hyperparameter tuning job.
     * 
    */
    public Boolean getIsHyperparameterTuningJob() {
        return this.isHyperparameterTuningJob;
    }
    /**
     * Results for individual Hyperparameter trials. Only set for hyperparameter tuning jobs.
     * 
    */
    public List<GoogleCloudMlV1__HyperparameterOutputResponse> getTrials() {
        return this.trials;
    }
    /**
     * URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only available if training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0` for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
     * 
    */
    public Map<String,String> getWebAccessUris() {
        return this.webAccessUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__TrainingOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput;
        private String completedTrialCount;
        private Double consumedMLUnits;
        private String hyperparameterMetricTag;
        private Boolean isBuiltInAlgorithmJob;
        private Boolean isHyperparameterTuningJob;
        private List<GoogleCloudMlV1__HyperparameterOutputResponse> trials;
        private Map<String,String> webAccessUris;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__TrainingOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builtInAlgorithmOutput = defaults.builtInAlgorithmOutput;
    	      this.completedTrialCount = defaults.completedTrialCount;
    	      this.consumedMLUnits = defaults.consumedMLUnits;
    	      this.hyperparameterMetricTag = defaults.hyperparameterMetricTag;
    	      this.isBuiltInAlgorithmJob = defaults.isBuiltInAlgorithmJob;
    	      this.isHyperparameterTuningJob = defaults.isHyperparameterTuningJob;
    	      this.trials = defaults.trials;
    	      this.webAccessUris = defaults.webAccessUris;
        }

        public Builder setBuiltInAlgorithmOutput(GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput) {
            this.builtInAlgorithmOutput = Objects.requireNonNull(builtInAlgorithmOutput);
            return this;
        }

        public Builder setCompletedTrialCount(String completedTrialCount) {
            this.completedTrialCount = Objects.requireNonNull(completedTrialCount);
            return this;
        }

        public Builder setConsumedMLUnits(Double consumedMLUnits) {
            this.consumedMLUnits = Objects.requireNonNull(consumedMLUnits);
            return this;
        }

        public Builder setHyperparameterMetricTag(String hyperparameterMetricTag) {
            this.hyperparameterMetricTag = Objects.requireNonNull(hyperparameterMetricTag);
            return this;
        }

        public Builder setIsBuiltInAlgorithmJob(Boolean isBuiltInAlgorithmJob) {
            this.isBuiltInAlgorithmJob = Objects.requireNonNull(isBuiltInAlgorithmJob);
            return this;
        }

        public Builder setIsHyperparameterTuningJob(Boolean isHyperparameterTuningJob) {
            this.isHyperparameterTuningJob = Objects.requireNonNull(isHyperparameterTuningJob);
            return this;
        }

        public Builder setTrials(List<GoogleCloudMlV1__HyperparameterOutputResponse> trials) {
            this.trials = Objects.requireNonNull(trials);
            return this;
        }

        public Builder setWebAccessUris(Map<String,String> webAccessUris) {
            this.webAccessUris = Objects.requireNonNull(webAccessUris);
            return this;
        }
        public GoogleCloudMlV1__TrainingOutputResponse build() {
            return new GoogleCloudMlV1__TrainingOutputResponse(builtInAlgorithmOutput, completedTrialCount, consumedMLUnits, hyperparameterMetricTag, isBuiltInAlgorithmJob, isHyperparameterTuningJob, trials, webAccessUris);
        }
    }
}

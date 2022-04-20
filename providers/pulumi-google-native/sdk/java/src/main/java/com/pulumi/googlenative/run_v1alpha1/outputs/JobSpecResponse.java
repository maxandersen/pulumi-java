// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1alpha1.outputs.InstanceTemplateSpecResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobSpecResponse {
    /**
     * Optional. Not supported. Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it. If set to zero, the system will never attempt to terminate the job based on time. Otherwise, the value must be positive integer. +optional
     * 
     */
    private final String activeDeadlineSeconds;
    /**
     * Optional. Specifies the number of retries per instance, before marking this job failed. If set to zero, instances will never retry on failure. +optional
     * 
     */
    private final Integer backoffLimit;
    /**
     * Optional. Specifies the desired number of successfully finished instances the job should be run with. Setting to 1 means that parallelism is limited to 1 and the success of that instance signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    private final Integer completions;
    /**
     * Optional. Specifies the maximum desired number of instances the job should run at any given time. Must be &lt;= completions. The actual number of instances running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    private final Integer parallelism;
    /**
     * Optional. Describes the instance that will be created when executing a job.
     * 
     */
    private final InstanceTemplateSpecResponse template;
    /**
     * Optional. Not supported. ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is set to zero, the Job won&#39;t be automatically deleted. +optional
     * 
     */
    private final Integer ttlSecondsAfterFinished;

    @CustomType.Constructor
    private JobSpecResponse(
        @CustomType.Parameter("activeDeadlineSeconds") String activeDeadlineSeconds,
        @CustomType.Parameter("backoffLimit") Integer backoffLimit,
        @CustomType.Parameter("completions") Integer completions,
        @CustomType.Parameter("parallelism") Integer parallelism,
        @CustomType.Parameter("template") InstanceTemplateSpecResponse template,
        @CustomType.Parameter("ttlSecondsAfterFinished") Integer ttlSecondsAfterFinished) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.backoffLimit = backoffLimit;
        this.completions = completions;
        this.parallelism = parallelism;
        this.template = template;
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    /**
     * Optional. Not supported. Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it. If set to zero, the system will never attempt to terminate the job based on time. Otherwise, the value must be positive integer. +optional
     * 
    */
    public String activeDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }
    /**
     * Optional. Specifies the number of retries per instance, before marking this job failed. If set to zero, instances will never retry on failure. +optional
     * 
    */
    public Integer backoffLimit() {
        return this.backoffLimit;
    }
    /**
     * Optional. Specifies the desired number of successfully finished instances the job should be run with. Setting to 1 means that parallelism is limited to 1 and the success of that instance signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
    */
    public Integer completions() {
        return this.completions;
    }
    /**
     * Optional. Specifies the maximum desired number of instances the job should run at any given time. Must be &lt;= completions. The actual number of instances running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
    */
    public Integer parallelism() {
        return this.parallelism;
    }
    /**
     * Optional. Describes the instance that will be created when executing a job.
     * 
    */
    public InstanceTemplateSpecResponse template() {
        return this.template;
    }
    /**
     * Optional. Not supported. ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is set to zero, the Job won&#39;t be automatically deleted. +optional
     * 
    */
    public Integer ttlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activeDeadlineSeconds;
        private Integer backoffLimit;
        private Integer completions;
        private Integer parallelism;
        private InstanceTemplateSpecResponse template;
        private Integer ttlSecondsAfterFinished;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.backoffLimit = defaults.backoffLimit;
    	      this.completions = defaults.completions;
    	      this.parallelism = defaults.parallelism;
    	      this.template = defaults.template;
    	      this.ttlSecondsAfterFinished = defaults.ttlSecondsAfterFinished;
        }

        public Builder activeDeadlineSeconds(String activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Objects.requireNonNull(activeDeadlineSeconds);
            return this;
        }
        public Builder backoffLimit(Integer backoffLimit) {
            this.backoffLimit = Objects.requireNonNull(backoffLimit);
            return this;
        }
        public Builder completions(Integer completions) {
            this.completions = Objects.requireNonNull(completions);
            return this;
        }
        public Builder parallelism(Integer parallelism) {
            this.parallelism = Objects.requireNonNull(parallelism);
            return this;
        }
        public Builder template(InstanceTemplateSpecResponse template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = Objects.requireNonNull(ttlSecondsAfterFinished);
            return this;
        }        public JobSpecResponse build() {
            return new JobSpecResponse(activeDeadlineSeconds, backoffLimit, completions, parallelism, template, ttlSecondsAfterFinished);
        }
    }
}

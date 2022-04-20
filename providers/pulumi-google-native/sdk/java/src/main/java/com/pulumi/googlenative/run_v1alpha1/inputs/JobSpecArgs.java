// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.run_v1alpha1.inputs.InstanceTemplateSpecArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobSpec describes how the job execution will look like.
 * 
 */
public final class JobSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobSpecArgs Empty = new JobSpecArgs();

    /**
     * Optional. Not supported. Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it. If set to zero, the system will never attempt to terminate the job based on time. Otherwise, the value must be positive integer. +optional
     * 
     */
    @Import(name="activeDeadlineSeconds")
      private final @Nullable Output<String> activeDeadlineSeconds;

    public Output<String> activeDeadlineSeconds() {
        return this.activeDeadlineSeconds == null ? Codegen.empty() : this.activeDeadlineSeconds;
    }

    /**
     * Optional. Specifies the number of retries per instance, before marking this job failed. If set to zero, instances will never retry on failure. +optional
     * 
     */
    @Import(name="backoffLimit")
      private final @Nullable Output<Integer> backoffLimit;

    public Output<Integer> backoffLimit() {
        return this.backoffLimit == null ? Codegen.empty() : this.backoffLimit;
    }

    /**
     * Optional. Specifies the desired number of successfully finished instances the job should be run with. Setting to 1 means that parallelism is limited to 1 and the success of that instance signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    @Import(name="completions")
      private final @Nullable Output<Integer> completions;

    public Output<Integer> completions() {
        return this.completions == null ? Codegen.empty() : this.completions;
    }

    /**
     * Optional. Specifies the maximum desired number of instances the job should run at any given time. Must be &lt;= completions. The actual number of instances running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    @Import(name="parallelism")
      private final @Nullable Output<Integer> parallelism;

    public Output<Integer> parallelism() {
        return this.parallelism == null ? Codegen.empty() : this.parallelism;
    }

    /**
     * Optional. Describes the instance that will be created when executing a job.
     * 
     */
    @Import(name="template")
      private final @Nullable Output<InstanceTemplateSpecArgs> template;

    public Output<InstanceTemplateSpecArgs> template() {
        return this.template == null ? Codegen.empty() : this.template;
    }

    /**
     * Optional. Not supported. ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is set to zero, the Job won&#39;t be automatically deleted. +optional
     * 
     */
    @Import(name="ttlSecondsAfterFinished")
      private final @Nullable Output<Integer> ttlSecondsAfterFinished;

    public Output<Integer> ttlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished == null ? Codegen.empty() : this.ttlSecondsAfterFinished;
    }

    public JobSpecArgs(
        @Nullable Output<String> activeDeadlineSeconds,
        @Nullable Output<Integer> backoffLimit,
        @Nullable Output<Integer> completions,
        @Nullable Output<Integer> parallelism,
        @Nullable Output<InstanceTemplateSpecArgs> template,
        @Nullable Output<Integer> ttlSecondsAfterFinished) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.backoffLimit = backoffLimit;
        this.completions = completions;
        this.parallelism = parallelism;
        this.template = template;
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    private JobSpecArgs() {
        this.activeDeadlineSeconds = Codegen.empty();
        this.backoffLimit = Codegen.empty();
        this.completions = Codegen.empty();
        this.parallelism = Codegen.empty();
        this.template = Codegen.empty();
        this.ttlSecondsAfterFinished = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDeadlineSeconds;
        private @Nullable Output<Integer> backoffLimit;
        private @Nullable Output<Integer> completions;
        private @Nullable Output<Integer> parallelism;
        private @Nullable Output<InstanceTemplateSpecArgs> template;
        private @Nullable Output<Integer> ttlSecondsAfterFinished;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.backoffLimit = defaults.backoffLimit;
    	      this.completions = defaults.completions;
    	      this.parallelism = defaults.parallelism;
    	      this.template = defaults.template;
    	      this.ttlSecondsAfterFinished = defaults.ttlSecondsAfterFinished;
        }

        public Builder activeDeadlineSeconds(@Nullable Output<String> activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }
        public Builder activeDeadlineSeconds(@Nullable String activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Codegen.ofNullable(activeDeadlineSeconds);
            return this;
        }
        public Builder backoffLimit(@Nullable Output<Integer> backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }
        public Builder backoffLimit(@Nullable Integer backoffLimit) {
            this.backoffLimit = Codegen.ofNullable(backoffLimit);
            return this;
        }
        public Builder completions(@Nullable Output<Integer> completions) {
            this.completions = completions;
            return this;
        }
        public Builder completions(@Nullable Integer completions) {
            this.completions = Codegen.ofNullable(completions);
            return this;
        }
        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Builder parallelism(@Nullable Integer parallelism) {
            this.parallelism = Codegen.ofNullable(parallelism);
            return this;
        }
        public Builder template(@Nullable Output<InstanceTemplateSpecArgs> template) {
            this.template = template;
            return this;
        }
        public Builder template(@Nullable InstanceTemplateSpecArgs template) {
            this.template = Codegen.ofNullable(template);
            return this;
        }
        public Builder ttlSecondsAfterFinished(@Nullable Output<Integer> ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }
        public Builder ttlSecondsAfterFinished(@Nullable Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = Codegen.ofNullable(ttlSecondsAfterFinished);
            return this;
        }        public JobSpecArgs build() {
            return new JobSpecArgs(activeDeadlineSeconds, backoffLimit, completions, parallelism, template, ttlSecondsAfterFinished);
        }
    }
}

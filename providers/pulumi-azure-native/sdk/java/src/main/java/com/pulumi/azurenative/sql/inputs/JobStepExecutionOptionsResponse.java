// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The execution options of a job step.
 * 
 */
public final class JobStepExecutionOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobStepExecutionOptionsResponse Empty = new JobStepExecutionOptionsResponse();

    /**
     * Initial delay between retries for job step execution.
     * 
     */
    @Import(name="initialRetryIntervalSeconds")
      private final @Nullable Integer initialRetryIntervalSeconds;

    public Optional<Integer> initialRetryIntervalSeconds() {
        return this.initialRetryIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.initialRetryIntervalSeconds);
    }

    /**
     * The maximum amount of time to wait between retries for job step execution.
     * 
     */
    @Import(name="maximumRetryIntervalSeconds")
      private final @Nullable Integer maximumRetryIntervalSeconds;

    public Optional<Integer> maximumRetryIntervalSeconds() {
        return this.maximumRetryIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.maximumRetryIntervalSeconds);
    }

    /**
     * Maximum number of times the job step will be reattempted if the first attempt fails.
     * 
     */
    @Import(name="retryAttempts")
      private final @Nullable Integer retryAttempts;

    public Optional<Integer> retryAttempts() {
        return this.retryAttempts == null ? Optional.empty() : Optional.ofNullable(this.retryAttempts);
    }

    /**
     * The backoff multiplier for the time between retries.
     * 
     */
    @Import(name="retryIntervalBackoffMultiplier")
      private final @Nullable Double retryIntervalBackoffMultiplier;

    public Optional<Double> retryIntervalBackoffMultiplier() {
        return this.retryIntervalBackoffMultiplier == null ? Optional.empty() : Optional.ofNullable(this.retryIntervalBackoffMultiplier);
    }

    /**
     * Execution timeout for the job step.
     * 
     */
    @Import(name="timeoutSeconds")
      private final @Nullable Integer timeoutSeconds;

    public Optional<Integer> timeoutSeconds() {
        return this.timeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.timeoutSeconds);
    }

    public JobStepExecutionOptionsResponse(
        @Nullable Integer initialRetryIntervalSeconds,
        @Nullable Integer maximumRetryIntervalSeconds,
        @Nullable Integer retryAttempts,
        @Nullable Double retryIntervalBackoffMultiplier,
        @Nullable Integer timeoutSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds == null ? 1 : initialRetryIntervalSeconds;
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds == null ? 120 : maximumRetryIntervalSeconds;
        this.retryAttempts = retryAttempts == null ? 10 : retryAttempts;
        this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier == null ? 2e+00 : retryIntervalBackoffMultiplier;
        this.timeoutSeconds = timeoutSeconds == null ? 43200 : timeoutSeconds;
    }

    private JobStepExecutionOptionsResponse() {
        this.initialRetryIntervalSeconds = null;
        this.maximumRetryIntervalSeconds = null;
        this.retryAttempts = null;
        this.retryIntervalBackoffMultiplier = null;
        this.timeoutSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepExecutionOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer initialRetryIntervalSeconds;
        private @Nullable Integer maximumRetryIntervalSeconds;
        private @Nullable Integer retryAttempts;
        private @Nullable Double retryIntervalBackoffMultiplier;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStepExecutionOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialRetryIntervalSeconds = defaults.initialRetryIntervalSeconds;
    	      this.maximumRetryIntervalSeconds = defaults.maximumRetryIntervalSeconds;
    	      this.retryAttempts = defaults.retryAttempts;
    	      this.retryIntervalBackoffMultiplier = defaults.retryIntervalBackoffMultiplier;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder initialRetryIntervalSeconds(@Nullable Integer initialRetryIntervalSeconds) {
            this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
            return this;
        }
        public Builder maximumRetryIntervalSeconds(@Nullable Integer maximumRetryIntervalSeconds) {
            this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
            return this;
        }
        public Builder retryAttempts(@Nullable Integer retryAttempts) {
            this.retryAttempts = retryAttempts;
            return this;
        }
        public Builder retryIntervalBackoffMultiplier(@Nullable Double retryIntervalBackoffMultiplier) {
            this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }        public JobStepExecutionOptionsResponse build() {
            return new JobStepExecutionOptionsResponse(initialRetryIntervalSeconds, maximumRetryIntervalSeconds, retryAttempts, retryIntervalBackoffMultiplier, timeoutSeconds);
        }
    }
}

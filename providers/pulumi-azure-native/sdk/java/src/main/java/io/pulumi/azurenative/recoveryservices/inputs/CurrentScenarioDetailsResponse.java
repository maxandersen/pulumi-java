// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Current scenario details of the protected entity.
 * 
 */
public final class CurrentScenarioDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CurrentScenarioDetailsResponse Empty = new CurrentScenarioDetailsResponse();

    /**
     * ARM Id of the job being executed.
     * 
     */
    @Import(name="jobId")
      private final @Nullable String jobId;

    public Optional<String> jobId() {
        return this.jobId == null ? Optional.empty() : Optional.ofNullable(this.jobId);
    }

    /**
     * Scenario name.
     * 
     */
    @Import(name="scenarioName")
      private final @Nullable String scenarioName;

    public Optional<String> scenarioName() {
        return this.scenarioName == null ? Optional.empty() : Optional.ofNullable(this.scenarioName);
    }

    /**
     * Start time of the workflow.
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> startTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public CurrentScenarioDetailsResponse(
        @Nullable String jobId,
        @Nullable String scenarioName,
        @Nullable String startTime) {
        this.jobId = jobId;
        this.scenarioName = scenarioName;
        this.startTime = startTime;
    }

    private CurrentScenarioDetailsResponse() {
        this.jobId = null;
        this.scenarioName = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CurrentScenarioDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobId;
        private @Nullable String scenarioName;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CurrentScenarioDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.scenarioName = defaults.scenarioName;
    	      this.startTime = defaults.startTime;
        }

        public Builder jobId(@Nullable String jobId) {
            this.jobId = jobId;
            return this;
        }
        public Builder scenarioName(@Nullable String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public CurrentScenarioDetailsResponse build() {
            return new CurrentScenarioDetailsResponse(jobId, scenarioName, startTime);
        }
    }
}

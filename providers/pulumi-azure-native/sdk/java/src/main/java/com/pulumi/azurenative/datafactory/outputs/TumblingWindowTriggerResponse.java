// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.RetryPolicyResponse;
import com.pulumi.azurenative.datafactory.outputs.SelfDependencyTumblingWindowTriggerReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.TriggerDependencyReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.TriggerPipelineReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.TumblingWindowTriggerDependencyReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TumblingWindowTriggerResponse {
    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object delay;
    /**
     * Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
     */
    private final @Nullable List<Object> dependsOn;
    /**
     * Trigger description.
     * 
     */
    private final @Nullable String description;
    /**
     * The end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    private final @Nullable String endTime;
    /**
     * The frequency of the time windows.
     * 
     */
    private final String frequency;
    /**
     * The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
     */
    private final Integer interval;
    /**
     * The max number of parallel time windows (ready for execution) for which a new run is triggered.
     * 
     */
    private final Integer maxConcurrency;
    /**
     * Pipeline for which runs are created when an event is fired for trigger window that is ready.
     * 
     */
    private final TriggerPipelineReferenceResponse pipeline;
    /**
     * Retry policy that will be applied for failed pipeline runs.
     * 
     */
    private final @Nullable RetryPolicyResponse retryPolicy;
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    private final String runtimeState;
    /**
     * The start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    private final String startTime;
    /**
     * Trigger type.
     * Expected value is 'TumblingWindowTrigger'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TumblingWindowTriggerResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("delay") @Nullable Object delay,
        @CustomType.Parameter("dependsOn") @Nullable List<Object> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("frequency") String frequency,
        @CustomType.Parameter("interval") Integer interval,
        @CustomType.Parameter("maxConcurrency") Integer maxConcurrency,
        @CustomType.Parameter("pipeline") TriggerPipelineReferenceResponse pipeline,
        @CustomType.Parameter("retryPolicy") @Nullable RetryPolicyResponse retryPolicy,
        @CustomType.Parameter("runtimeState") String runtimeState,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.delay = delay;
        this.dependsOn = dependsOn;
        this.description = description;
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.maxConcurrency = maxConcurrency;
        this.pipeline = pipeline;
        this.retryPolicy = retryPolicy;
        this.runtimeState = runtimeState;
        this.startTime = startTime;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the trigger.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> delay() {
        return Optional.ofNullable(this.delay);
    }
    /**
     * Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
    */
    public List<Object> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Trigger description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
    */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * The frequency of the time windows.
     * 
    */
    public String frequency() {
        return this.frequency;
    }
    /**
     * The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
    */
    public Integer interval() {
        return this.interval;
    }
    /**
     * The max number of parallel time windows (ready for execution) for which a new run is triggered.
     * 
    */
    public Integer maxConcurrency() {
        return this.maxConcurrency;
    }
    /**
     * Pipeline for which runs are created when an event is fired for trigger window that is ready.
     * 
    */
    public TriggerPipelineReferenceResponse pipeline() {
        return this.pipeline;
    }
    /**
     * Retry policy that will be applied for failed pipeline runs.
     * 
    */
    public Optional<RetryPolicyResponse> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
    */
    public String runtimeState() {
        return this.runtimeState;
    }
    /**
     * The start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * Trigger type.
     * Expected value is 'TumblingWindowTrigger'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TumblingWindowTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object delay;
        private @Nullable List<Object> dependsOn;
        private @Nullable String description;
        private @Nullable String endTime;
        private String frequency;
        private Integer interval;
        private Integer maxConcurrency;
        private TriggerPipelineReferenceResponse pipeline;
        private @Nullable RetryPolicyResponse retryPolicy;
        private String runtimeState;
        private String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TumblingWindowTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.delay = defaults.delay;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.pipeline = defaults.pipeline;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.runtimeState = defaults.runtimeState;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder delay(@Nullable Object delay) {
            this.delay = delay;
            return this;
        }
        public Builder dependsOn(@Nullable List<Object> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(Object... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = Objects.requireNonNull(maxConcurrency);
            return this;
        }
        public Builder pipeline(TriggerPipelineReferenceResponse pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }
        public Builder retryPolicy(@Nullable RetryPolicyResponse retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder runtimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TumblingWindowTriggerResponse build() {
            return new TumblingWindowTriggerResponse(annotations, delay, dependsOn, description, endTime, frequency, interval, maxConcurrency, pipeline, retryPolicy, runtimeState, startTime, type);
        }
    }
}

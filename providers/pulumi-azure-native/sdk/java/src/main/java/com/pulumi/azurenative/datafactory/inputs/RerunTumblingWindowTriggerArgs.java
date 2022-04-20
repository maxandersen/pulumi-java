// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger that schedules pipeline reruns for all fixed time interval windows from a requested start time to requested end time.
 * 
 */
public final class RerunTumblingWindowTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RerunTumblingWindowTriggerArgs Empty = new RerunTumblingWindowTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The parent trigger reference.
     * 
     */
    @Import(name="parentTrigger", required=true)
      private final Output<Object> parentTrigger;

    public Output<Object> parentTrigger() {
        return this.parentTrigger;
    }

    /**
     * The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    @Import(name="requestedEndTime", required=true)
      private final Output<String> requestedEndTime;

    public Output<String> requestedEndTime() {
        return this.requestedEndTime;
    }

    /**
     * The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    @Import(name="requestedStartTime", required=true)
      private final Output<String> requestedStartTime;

    public Output<String> requestedStartTime() {
        return this.requestedStartTime;
    }

    /**
     * The max number of parallel time windows (ready for execution) for which a rerun is triggered.
     * 
     */
    @Import(name="rerunConcurrency", required=true)
      private final Output<Integer> rerunConcurrency;

    public Output<Integer> rerunConcurrency() {
        return this.rerunConcurrency;
    }

    /**
     * Trigger type.
     * Expected value is &#39;RerunTumblingWindowTrigger&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public RerunTumblingWindowTriggerArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        Output<Object> parentTrigger,
        Output<String> requestedEndTime,
        Output<String> requestedStartTime,
        Output<Integer> rerunConcurrency,
        Output<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.parentTrigger = Objects.requireNonNull(parentTrigger, "expected parameter 'parentTrigger' to be non-null");
        this.requestedEndTime = Objects.requireNonNull(requestedEndTime, "expected parameter 'requestedEndTime' to be non-null");
        this.requestedStartTime = Objects.requireNonNull(requestedStartTime, "expected parameter 'requestedStartTime' to be non-null");
        this.rerunConcurrency = Objects.requireNonNull(rerunConcurrency, "expected parameter 'rerunConcurrency' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private RerunTumblingWindowTriggerArgs() {
        this.annotations = Codegen.empty();
        this.description = Codegen.empty();
        this.parentTrigger = Codegen.empty();
        this.requestedEndTime = Codegen.empty();
        this.requestedStartTime = Codegen.empty();
        this.rerunConcurrency = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RerunTumblingWindowTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private Output<Object> parentTrigger;
        private Output<String> requestedEndTime;
        private Output<String> requestedStartTime;
        private Output<Integer> rerunConcurrency;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RerunTumblingWindowTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.parentTrigger = defaults.parentTrigger;
    	      this.requestedEndTime = defaults.requestedEndTime;
    	      this.requestedStartTime = defaults.requestedStartTime;
    	      this.rerunConcurrency = defaults.rerunConcurrency;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder parentTrigger(Output<Object> parentTrigger) {
            this.parentTrigger = Objects.requireNonNull(parentTrigger);
            return this;
        }
        public Builder parentTrigger(Object parentTrigger) {
            this.parentTrigger = Output.of(Objects.requireNonNull(parentTrigger));
            return this;
        }
        public Builder requestedEndTime(Output<String> requestedEndTime) {
            this.requestedEndTime = Objects.requireNonNull(requestedEndTime);
            return this;
        }
        public Builder requestedEndTime(String requestedEndTime) {
            this.requestedEndTime = Output.of(Objects.requireNonNull(requestedEndTime));
            return this;
        }
        public Builder requestedStartTime(Output<String> requestedStartTime) {
            this.requestedStartTime = Objects.requireNonNull(requestedStartTime);
            return this;
        }
        public Builder requestedStartTime(String requestedStartTime) {
            this.requestedStartTime = Output.of(Objects.requireNonNull(requestedStartTime));
            return this;
        }
        public Builder rerunConcurrency(Output<Integer> rerunConcurrency) {
            this.rerunConcurrency = Objects.requireNonNull(rerunConcurrency);
            return this;
        }
        public Builder rerunConcurrency(Integer rerunConcurrency) {
            this.rerunConcurrency = Output.of(Objects.requireNonNull(rerunConcurrency));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public RerunTumblingWindowTriggerArgs build() {
            return new RerunTumblingWindowTriggerArgs(annotations, description, parentTrigger, requestedEndTime, requestedStartTime, rerunConcurrency, type);
        }
    }
}

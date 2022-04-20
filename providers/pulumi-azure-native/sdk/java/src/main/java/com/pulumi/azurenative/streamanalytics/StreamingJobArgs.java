// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics;

import com.pulumi.azurenative.streamanalytics.enums.CompatibilityLevel;
import com.pulumi.azurenative.streamanalytics.enums.EventsOutOfOrderPolicy;
import com.pulumi.azurenative.streamanalytics.enums.OutputErrorPolicy;
import com.pulumi.azurenative.streamanalytics.enums.OutputStartMode;
import com.pulumi.azurenative.streamanalytics.inputs.FunctionArgs;
import com.pulumi.azurenative.streamanalytics.inputs.InputArgs;
import com.pulumi.azurenative.streamanalytics.inputs.OutputArgs;
import com.pulumi.azurenative.streamanalytics.inputs.SkuArgs;
import com.pulumi.azurenative.streamanalytics.inputs.TransformationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamingJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingJobArgs Empty = new StreamingJobArgs();

    /**
     * Controls certain runtime behaviors of the streaming job.
     * 
     */
    @Import(name="compatibilityLevel")
      private final @Nullable Output<Either<String,CompatibilityLevel>> compatibilityLevel;

    public Output<Either<String,CompatibilityLevel>> compatibilityLevel() {
        return this.compatibilityLevel == null ? Codegen.empty() : this.compatibilityLevel;
    }

    /**
     * The data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to &#39;en-US&#39; if none specified.
     * 
     */
    @Import(name="dataLocale")
      private final @Nullable Output<String> dataLocale;

    public Output<String> dataLocale() {
        return this.dataLocale == null ? Codegen.empty() : this.dataLocale;
    }

    /**
     * The maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     * 
     */
    @Import(name="eventsLateArrivalMaxDelayInSeconds")
      private final @Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds;

    public Output<Integer> eventsLateArrivalMaxDelayInSeconds() {
        return this.eventsLateArrivalMaxDelayInSeconds == null ? Codegen.empty() : this.eventsLateArrivalMaxDelayInSeconds;
    }

    /**
     * The maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     * 
     */
    @Import(name="eventsOutOfOrderMaxDelayInSeconds")
      private final @Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds;

    public Output<Integer> eventsOutOfOrderMaxDelayInSeconds() {
        return this.eventsOutOfOrderMaxDelayInSeconds == null ? Codegen.empty() : this.eventsOutOfOrderMaxDelayInSeconds;
    }

    /**
     * Indicates the policy to apply to events that arrive out of order in the input event stream.
     * 
     */
    @Import(name="eventsOutOfOrderPolicy")
      private final @Nullable Output<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy;

    public Output<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy() {
        return this.eventsOutOfOrderPolicy == null ? Codegen.empty() : this.eventsOutOfOrderPolicy;
    }

    /**
     * A list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    @Import(name="functions")
      private final @Nullable Output<List<FunctionArgs>> functions;

    public Output<List<FunctionArgs>> functions() {
        return this.functions == null ? Codegen.empty() : this.functions;
    }

    /**
     * A list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     * 
     */
    @Import(name="inputs")
      private final @Nullable Output<List<InputArgs>> inputs;

    public Output<List<InputArgs>> inputs() {
        return this.inputs == null ? Codegen.empty() : this.inputs;
    }

    /**
     * The name of the streaming job.
     * 
     */
    @Import(name="jobName")
      private final @Nullable Output<String> jobName;

    public Output<String> jobName() {
        return this.jobName == null ? Codegen.empty() : this.jobName;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size).
     * 
     */
    @Import(name="outputErrorPolicy")
      private final @Nullable Output<Either<String,OutputErrorPolicy>> outputErrorPolicy;

    public Output<Either<String,OutputErrorPolicy>> outputErrorPolicy() {
        return this.outputErrorPolicy == null ? Codegen.empty() : this.outputErrorPolicy;
    }

    /**
     * This property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time.
     * 
     */
    @Import(name="outputStartMode")
      private final @Nullable Output<Either<String,OutputStartMode>> outputStartMode;

    public Output<Either<String,OutputStartMode>> outputStartMode() {
        return this.outputStartMode == null ? Codegen.empty() : this.outputStartMode;
    }

    /**
     * Value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     * 
     */
    @Import(name="outputStartTime")
      private final @Nullable Output<String> outputStartTime;

    public Output<String> outputStartTime() {
        return this.outputStartTime == null ? Codegen.empty() : this.outputStartTime;
    }

    /**
     * A list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     * 
     */
    @Import(name="outputs")
      private final @Nullable Output<List<OutputArgs>> outputs;

    public Output<List<OutputArgs>> outputs() {
        return this.outputs == null ? Codegen.empty() : this.outputs;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    @Import(name="transformation")
      private final @Nullable Output<TransformationArgs> transformation;

    public Output<TransformationArgs> transformation() {
        return this.transformation == null ? Codegen.empty() : this.transformation;
    }

    public StreamingJobArgs(
        @Nullable Output<Either<String,CompatibilityLevel>> compatibilityLevel,
        @Nullable Output<String> dataLocale,
        @Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds,
        @Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds,
        @Nullable Output<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy,
        @Nullable Output<List<FunctionArgs>> functions,
        @Nullable Output<List<InputArgs>> inputs,
        @Nullable Output<String> jobName,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,OutputErrorPolicy>> outputErrorPolicy,
        @Nullable Output<Either<String,OutputStartMode>> outputStartMode,
        @Nullable Output<String> outputStartTime,
        @Nullable Output<List<OutputArgs>> outputs,
        Output<String> resourceGroupName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<TransformationArgs> transformation) {
        this.compatibilityLevel = compatibilityLevel;
        this.dataLocale = dataLocale;
        this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
        this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
        this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
        this.functions = functions;
        this.inputs = inputs;
        this.jobName = jobName;
        this.location = location;
        this.outputErrorPolicy = outputErrorPolicy;
        this.outputStartMode = outputStartMode;
        this.outputStartTime = outputStartTime;
        this.outputs = outputs;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.transformation = transformation;
    }

    private StreamingJobArgs() {
        this.compatibilityLevel = Codegen.empty();
        this.dataLocale = Codegen.empty();
        this.eventsLateArrivalMaxDelayInSeconds = Codegen.empty();
        this.eventsOutOfOrderMaxDelayInSeconds = Codegen.empty();
        this.eventsOutOfOrderPolicy = Codegen.empty();
        this.functions = Codegen.empty();
        this.inputs = Codegen.empty();
        this.jobName = Codegen.empty();
        this.location = Codegen.empty();
        this.outputErrorPolicy = Codegen.empty();
        this.outputStartMode = Codegen.empty();
        this.outputStartTime = Codegen.empty();
        this.outputs = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
        this.transformation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,CompatibilityLevel>> compatibilityLevel;
        private @Nullable Output<String> dataLocale;
        private @Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds;
        private @Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds;
        private @Nullable Output<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy;
        private @Nullable Output<List<FunctionArgs>> functions;
        private @Nullable Output<List<InputArgs>> inputs;
        private @Nullable Output<String> jobName;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,OutputErrorPolicy>> outputErrorPolicy;
        private @Nullable Output<Either<String,OutputStartMode>> outputStartMode;
        private @Nullable Output<String> outputStartTime;
        private @Nullable Output<List<OutputArgs>> outputs;
        private Output<String> resourceGroupName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<TransformationArgs> transformation;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.dataLocale = defaults.dataLocale;
    	      this.eventsLateArrivalMaxDelayInSeconds = defaults.eventsLateArrivalMaxDelayInSeconds;
    	      this.eventsOutOfOrderMaxDelayInSeconds = defaults.eventsOutOfOrderMaxDelayInSeconds;
    	      this.eventsOutOfOrderPolicy = defaults.eventsOutOfOrderPolicy;
    	      this.functions = defaults.functions;
    	      this.inputs = defaults.inputs;
    	      this.jobName = defaults.jobName;
    	      this.location = defaults.location;
    	      this.outputErrorPolicy = defaults.outputErrorPolicy;
    	      this.outputStartMode = defaults.outputStartMode;
    	      this.outputStartTime = defaults.outputStartTime;
    	      this.outputs = defaults.outputs;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.transformation = defaults.transformation;
        }

        public Builder compatibilityLevel(@Nullable Output<Either<String,CompatibilityLevel>> compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }
        public Builder compatibilityLevel(@Nullable Either<String,CompatibilityLevel> compatibilityLevel) {
            this.compatibilityLevel = Codegen.ofNullable(compatibilityLevel);
            return this;
        }
        public Builder dataLocale(@Nullable Output<String> dataLocale) {
            this.dataLocale = dataLocale;
            return this;
        }
        public Builder dataLocale(@Nullable String dataLocale) {
            this.dataLocale = Codegen.ofNullable(dataLocale);
            return this;
        }
        public Builder eventsLateArrivalMaxDelayInSeconds(@Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds) {
            this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
            return this;
        }
        public Builder eventsLateArrivalMaxDelayInSeconds(@Nullable Integer eventsLateArrivalMaxDelayInSeconds) {
            this.eventsLateArrivalMaxDelayInSeconds = Codegen.ofNullable(eventsLateArrivalMaxDelayInSeconds);
            return this;
        }
        public Builder eventsOutOfOrderMaxDelayInSeconds(@Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds) {
            this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
            return this;
        }
        public Builder eventsOutOfOrderMaxDelayInSeconds(@Nullable Integer eventsOutOfOrderMaxDelayInSeconds) {
            this.eventsOutOfOrderMaxDelayInSeconds = Codegen.ofNullable(eventsOutOfOrderMaxDelayInSeconds);
            return this;
        }
        public Builder eventsOutOfOrderPolicy(@Nullable Output<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy) {
            this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
            return this;
        }
        public Builder eventsOutOfOrderPolicy(@Nullable Either<String,EventsOutOfOrderPolicy> eventsOutOfOrderPolicy) {
            this.eventsOutOfOrderPolicy = Codegen.ofNullable(eventsOutOfOrderPolicy);
            return this;
        }
        public Builder functions(@Nullable Output<List<FunctionArgs>> functions) {
            this.functions = functions;
            return this;
        }
        public Builder functions(@Nullable List<FunctionArgs> functions) {
            this.functions = Codegen.ofNullable(functions);
            return this;
        }
        public Builder functions(FunctionArgs... functions) {
            return functions(List.of(functions));
        }
        public Builder inputs(@Nullable Output<List<InputArgs>> inputs) {
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(@Nullable List<InputArgs> inputs) {
            this.inputs = Codegen.ofNullable(inputs);
            return this;
        }
        public Builder inputs(InputArgs... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder jobName(@Nullable Output<String> jobName) {
            this.jobName = jobName;
            return this;
        }
        public Builder jobName(@Nullable String jobName) {
            this.jobName = Codegen.ofNullable(jobName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder outputErrorPolicy(@Nullable Output<Either<String,OutputErrorPolicy>> outputErrorPolicy) {
            this.outputErrorPolicy = outputErrorPolicy;
            return this;
        }
        public Builder outputErrorPolicy(@Nullable Either<String,OutputErrorPolicy> outputErrorPolicy) {
            this.outputErrorPolicy = Codegen.ofNullable(outputErrorPolicy);
            return this;
        }
        public Builder outputStartMode(@Nullable Output<Either<String,OutputStartMode>> outputStartMode) {
            this.outputStartMode = outputStartMode;
            return this;
        }
        public Builder outputStartMode(@Nullable Either<String,OutputStartMode> outputStartMode) {
            this.outputStartMode = Codegen.ofNullable(outputStartMode);
            return this;
        }
        public Builder outputStartTime(@Nullable Output<String> outputStartTime) {
            this.outputStartTime = outputStartTime;
            return this;
        }
        public Builder outputStartTime(@Nullable String outputStartTime) {
            this.outputStartTime = Codegen.ofNullable(outputStartTime);
            return this;
        }
        public Builder outputs(@Nullable Output<List<OutputArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(@Nullable List<OutputArgs> outputs) {
            this.outputs = Codegen.ofNullable(outputs);
            return this;
        }
        public Builder outputs(OutputArgs... outputs) {
            return outputs(List.of(outputs));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder transformation(@Nullable Output<TransformationArgs> transformation) {
            this.transformation = transformation;
            return this;
        }
        public Builder transformation(@Nullable TransformationArgs transformation) {
            this.transformation = Codegen.ofNullable(transformation);
            return this;
        }        public StreamingJobArgs build() {
            return new StreamingJobArgs(compatibilityLevel, dataLocale, eventsLateArrivalMaxDelayInSeconds, eventsOutOfOrderMaxDelayInSeconds, eventsOutOfOrderPolicy, functions, inputs, jobName, location, outputErrorPolicy, outputStartMode, outputStartTime, outputs, resourceGroupName, sku, tags, transformation);
        }
    }
}

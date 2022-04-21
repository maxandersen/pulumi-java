// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs;
import com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs;
import com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs;
import com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSourceMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingArgs Empty = new EventSourceMappingArgs();

    /**
     * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB, Kinesis, MQ and MSK, `10` for SQS.
     * * `bisect_batch_on_function_error`: - (Optional) If the function returns an error, split the batch in two and retry. Only available for stream sources (DynamoDB and Kinesis). Defaults to `false`.
     * * `destination_config`: - (Optional) An Amazon SQS queue or Amazon SNS topic destination for failed records. Only available for stream sources (DynamoDB and Kinesis). Detailed below.
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    @Import(name="bisectBatchOnFunctionError")
    private @Nullable Output<Boolean> bisectBatchOnFunctionError;

    public Optional<Output<Boolean>> bisectBatchOnFunctionError() {
        return Optional.ofNullable(this.bisectBatchOnFunctionError);
    }

    @Import(name="destinationConfig")
    private @Nullable Output<EventSourceMappingDestinationConfigArgs> destinationConfig;

    public Optional<Output<EventSourceMappingDestinationConfigArgs>> destinationConfig() {
        return Optional.ofNullable(this.destinationConfig);
    }

    /**
     * Determines if the mapping will be enabled on creation. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The event source ARN - this is required for Kinesis stream, DynamoDB stream, SQS queue, MQ broker or MSK cluster.  It is incompatible with a Self Managed Kafka source.
     * 
     */
    @Import(name="eventSourceArn")
    private @Nullable Output<String> eventSourceArn;

    public Optional<Output<String>> eventSourceArn() {
        return Optional.ofNullable(this.eventSourceArn);
    }

    /**
     * The criteria to use for [event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) Kinesis stream, DynamoDB stream, SQS queue event sources. Detailed below.
     * 
     */
    @Import(name="filterCriteria")
    private @Nullable Output<EventSourceMappingFilterCriteriaArgs> filterCriteria;

    public Optional<Output<EventSourceMappingFilterCriteriaArgs>> filterCriteria() {
        return Optional.ofNullable(this.filterCriteria);
    }

    /**
     * The name or the ARN of the Lambda function that will be subscribing to events.
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    public Output<String> functionName() {
        return this.functionName;
    }

    /**
     * A list of current response type enums applied to the event source mapping for [AWS Lambda checkpointing](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting). Only available for SQS and stream sources (DynamoDB and Kinesis). Valid values: `ReportBatchItemFailures`.
     * 
     */
    @Import(name="functionResponseTypes")
    private @Nullable Output<List<String>> functionResponseTypes;

    public Optional<Output<List<String>>> functionResponseTypes() {
        return Optional.ofNullable(this.functionResponseTypes);
    }

    /**
     * The maximum amount of time to gather records before invoking the function, in seconds (between 0 and 300). Records will continue to buffer (or accumulate in the case of an SQS queue event source) until either `maximum_batching_window_in_seconds` expires or `batch_size` has been met. For streaming event sources, defaults to as soon as records are available in the stream. If the batch it reads from the stream/queue only has one record in it, Lambda only sends one record to the function. Only available for stream sources (DynamoDB and Kinesis) and SQS standard queues.
     * * `maximum_record_age_in_seconds`: - (Optional) The maximum age of a record that Lambda sends to a function for processing. Only available for stream sources (DynamoDB and Kinesis). Must be either -1 (forever, and the default value) or between 60 and 604800 (inclusive).
     * * `maximum_retry_attempts`: - (Optional) The maximum number of times to retry when the function returns an error. Only available for stream sources (DynamoDB and Kinesis). Minimum and default of -1 (forever), maximum of 10000.
     * * `parallelization_factor`: - (Optional) The number of batches to process from each shard concurrently. Only available for stream sources (DynamoDB and Kinesis). Minimum and default of 1, maximum of 10.
     * 
     */
    @Import(name="maximumBatchingWindowInSeconds")
    private @Nullable Output<Integer> maximumBatchingWindowInSeconds;

    public Optional<Output<Integer>> maximumBatchingWindowInSeconds() {
        return Optional.ofNullable(this.maximumBatchingWindowInSeconds);
    }

    @Import(name="maximumRecordAgeInSeconds")
    private @Nullable Output<Integer> maximumRecordAgeInSeconds;

    public Optional<Output<Integer>> maximumRecordAgeInSeconds() {
        return Optional.ofNullable(this.maximumRecordAgeInSeconds);
    }

    @Import(name="maximumRetryAttempts")
    private @Nullable Output<Integer> maximumRetryAttempts;

    public Optional<Output<Integer>> maximumRetryAttempts() {
        return Optional.ofNullable(this.maximumRetryAttempts);
    }

    @Import(name="parallelizationFactor")
    private @Nullable Output<Integer> parallelizationFactor;

    public Optional<Output<Integer>> parallelizationFactor() {
        return Optional.ofNullable(this.parallelizationFactor);
    }

    /**
     * The name of the Amazon MQ broker destination queue to consume. Only available for MQ sources. A single queue name must be specified.
     * * `self_managed_event_source`: - (Optional) For Self Managed Kafka sources, the location of the self managed cluster. If set, configuration must also include `source_access_configuration`. Detailed below.
     * * `source_access_configuration`: (Optional) For Self Managed Kafka sources, the access configuration for the source. If set, configuration must also include `self_managed_event_source`. Detailed below.
     * 
     */
    @Import(name="queues")
    private @Nullable Output<List<String>> queues;

    public Optional<Output<List<String>>> queues() {
        return Optional.ofNullable(this.queues);
    }

    @Import(name="selfManagedEventSource")
    private @Nullable Output<EventSourceMappingSelfManagedEventSourceArgs> selfManagedEventSource;

    public Optional<Output<EventSourceMappingSelfManagedEventSourceArgs>> selfManagedEventSource() {
        return Optional.ofNullable(this.selfManagedEventSource);
    }

    @Import(name="sourceAccessConfigurations")
    private @Nullable Output<List<EventSourceMappingSourceAccessConfigurationArgs>> sourceAccessConfigurations;

    public Optional<Output<List<EventSourceMappingSourceAccessConfigurationArgs>>> sourceAccessConfigurations() {
        return Optional.ofNullable(this.sourceAccessConfigurations);
    }

    /**
     * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis, DynamoDB or MSK. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
     * 
     */
    @Import(name="startingPosition")
    private @Nullable Output<String> startingPosition;

    public Optional<Output<String>> startingPosition() {
        return Optional.ofNullable(this.startingPosition);
    }

    /**
     * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
     * 
     */
    @Import(name="startingPositionTimestamp")
    private @Nullable Output<String> startingPositionTimestamp;

    public Optional<Output<String>> startingPositionTimestamp() {
        return Optional.ofNullable(this.startingPositionTimestamp);
    }

    /**
     * The name of the Kafka topics. Only available for MSK sources. A single topic name must be specified.
     * 
     */
    @Import(name="topics")
    private @Nullable Output<List<String>> topics;

    public Optional<Output<List<String>>> topics() {
        return Optional.ofNullable(this.topics);
    }

    /**
     * The duration in seconds of a processing window for [AWS Lambda streaming analytics](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html#services-kinesis-windows). The range is between 1 second up to 900 seconds. Only available for stream sources (DynamoDB and Kinesis).
     * 
     */
    @Import(name="tumblingWindowInSeconds")
    private @Nullable Output<Integer> tumblingWindowInSeconds;

    public Optional<Output<Integer>> tumblingWindowInSeconds() {
        return Optional.ofNullable(this.tumblingWindowInSeconds);
    }

    private EventSourceMappingArgs() {}

    private EventSourceMappingArgs(EventSourceMappingArgs $) {
        this.batchSize = $.batchSize;
        this.bisectBatchOnFunctionError = $.bisectBatchOnFunctionError;
        this.destinationConfig = $.destinationConfig;
        this.enabled = $.enabled;
        this.eventSourceArn = $.eventSourceArn;
        this.filterCriteria = $.filterCriteria;
        this.functionName = $.functionName;
        this.functionResponseTypes = $.functionResponseTypes;
        this.maximumBatchingWindowInSeconds = $.maximumBatchingWindowInSeconds;
        this.maximumRecordAgeInSeconds = $.maximumRecordAgeInSeconds;
        this.maximumRetryAttempts = $.maximumRetryAttempts;
        this.parallelizationFactor = $.parallelizationFactor;
        this.queues = $.queues;
        this.selfManagedEventSource = $.selfManagedEventSource;
        this.sourceAccessConfigurations = $.sourceAccessConfigurations;
        this.startingPosition = $.startingPosition;
        this.startingPositionTimestamp = $.startingPositionTimestamp;
        this.topics = $.topics;
        this.tumblingWindowInSeconds = $.tumblingWindowInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSourceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSourceMappingArgs $;

        public Builder() {
            $ = new EventSourceMappingArgs();
        }

        public Builder(EventSourceMappingArgs defaults) {
            $ = new EventSourceMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        public Builder bisectBatchOnFunctionError(@Nullable Output<Boolean> bisectBatchOnFunctionError) {
            $.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
            return this;
        }

        public Builder bisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
            return bisectBatchOnFunctionError(Output.of(bisectBatchOnFunctionError));
        }

        public Builder destinationConfig(@Nullable Output<EventSourceMappingDestinationConfigArgs> destinationConfig) {
            $.destinationConfig = destinationConfig;
            return this;
        }

        public Builder destinationConfig(EventSourceMappingDestinationConfigArgs destinationConfig) {
            return destinationConfig(Output.of(destinationConfig));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder eventSourceArn(@Nullable Output<String> eventSourceArn) {
            $.eventSourceArn = eventSourceArn;
            return this;
        }

        public Builder eventSourceArn(String eventSourceArn) {
            return eventSourceArn(Output.of(eventSourceArn));
        }

        public Builder filterCriteria(@Nullable Output<EventSourceMappingFilterCriteriaArgs> filterCriteria) {
            $.filterCriteria = filterCriteria;
            return this;
        }

        public Builder filterCriteria(EventSourceMappingFilterCriteriaArgs filterCriteria) {
            return filterCriteria(Output.of(filterCriteria));
        }

        public Builder functionName(Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        public Builder functionResponseTypes(@Nullable Output<List<String>> functionResponseTypes) {
            $.functionResponseTypes = functionResponseTypes;
            return this;
        }

        public Builder functionResponseTypes(List<String> functionResponseTypes) {
            return functionResponseTypes(Output.of(functionResponseTypes));
        }

        public Builder functionResponseTypes(String... functionResponseTypes) {
            return functionResponseTypes(List.of(functionResponseTypes));
        }

        public Builder maximumBatchingWindowInSeconds(@Nullable Output<Integer> maximumBatchingWindowInSeconds) {
            $.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            return this;
        }

        public Builder maximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
            return maximumBatchingWindowInSeconds(Output.of(maximumBatchingWindowInSeconds));
        }

        public Builder maximumRecordAgeInSeconds(@Nullable Output<Integer> maximumRecordAgeInSeconds) {
            $.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
            return this;
        }

        public Builder maximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
            return maximumRecordAgeInSeconds(Output.of(maximumRecordAgeInSeconds));
        }

        public Builder maximumRetryAttempts(@Nullable Output<Integer> maximumRetryAttempts) {
            $.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        public Builder maximumRetryAttempts(Integer maximumRetryAttempts) {
            return maximumRetryAttempts(Output.of(maximumRetryAttempts));
        }

        public Builder parallelizationFactor(@Nullable Output<Integer> parallelizationFactor) {
            $.parallelizationFactor = parallelizationFactor;
            return this;
        }

        public Builder parallelizationFactor(Integer parallelizationFactor) {
            return parallelizationFactor(Output.of(parallelizationFactor));
        }

        public Builder queues(@Nullable Output<List<String>> queues) {
            $.queues = queues;
            return this;
        }

        public Builder queues(List<String> queues) {
            return queues(Output.of(queues));
        }

        public Builder queues(String... queues) {
            return queues(List.of(queues));
        }

        public Builder selfManagedEventSource(@Nullable Output<EventSourceMappingSelfManagedEventSourceArgs> selfManagedEventSource) {
            $.selfManagedEventSource = selfManagedEventSource;
            return this;
        }

        public Builder selfManagedEventSource(EventSourceMappingSelfManagedEventSourceArgs selfManagedEventSource) {
            return selfManagedEventSource(Output.of(selfManagedEventSource));
        }

        public Builder sourceAccessConfigurations(@Nullable Output<List<EventSourceMappingSourceAccessConfigurationArgs>> sourceAccessConfigurations) {
            $.sourceAccessConfigurations = sourceAccessConfigurations;
            return this;
        }

        public Builder sourceAccessConfigurations(List<EventSourceMappingSourceAccessConfigurationArgs> sourceAccessConfigurations) {
            return sourceAccessConfigurations(Output.of(sourceAccessConfigurations));
        }

        public Builder sourceAccessConfigurations(EventSourceMappingSourceAccessConfigurationArgs... sourceAccessConfigurations) {
            return sourceAccessConfigurations(List.of(sourceAccessConfigurations));
        }

        public Builder startingPosition(@Nullable Output<String> startingPosition) {
            $.startingPosition = startingPosition;
            return this;
        }

        public Builder startingPosition(String startingPosition) {
            return startingPosition(Output.of(startingPosition));
        }

        public Builder startingPositionTimestamp(@Nullable Output<String> startingPositionTimestamp) {
            $.startingPositionTimestamp = startingPositionTimestamp;
            return this;
        }

        public Builder startingPositionTimestamp(String startingPositionTimestamp) {
            return startingPositionTimestamp(Output.of(startingPositionTimestamp));
        }

        public Builder topics(@Nullable Output<List<String>> topics) {
            $.topics = topics;
            return this;
        }

        public Builder topics(List<String> topics) {
            return topics(Output.of(topics));
        }

        public Builder topics(String... topics) {
            return topics(List.of(topics));
        }

        public Builder tumblingWindowInSeconds(@Nullable Output<Integer> tumblingWindowInSeconds) {
            $.tumblingWindowInSeconds = tumblingWindowInSeconds;
            return this;
        }

        public Builder tumblingWindowInSeconds(Integer tumblingWindowInSeconds) {
            return tumblingWindowInSeconds(Output.of(tumblingWindowInSeconds));
        }

        public EventSourceMappingArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            return $;
        }
    }

}

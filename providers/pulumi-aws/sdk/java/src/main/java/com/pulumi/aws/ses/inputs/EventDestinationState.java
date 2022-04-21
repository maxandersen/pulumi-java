// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationGetArgs;
import com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationGetArgs;
import com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventDestinationState extends com.pulumi.resources.ResourceArgs {

    public static final EventDestinationState Empty = new EventDestinationState();

    /**
     * The SES event destination ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * CloudWatch destination for the events
     * 
     */
    @Import(name="cloudwatchDestinations")
    private @Nullable Output<List<EventDestinationCloudwatchDestinationGetArgs>> cloudwatchDestinations;

    public Optional<Output<List<EventDestinationCloudwatchDestinationGetArgs>>> cloudwatchDestinations() {
        return Optional.ofNullable(this.cloudwatchDestinations);
    }

    /**
     * The name of the configuration set
     * 
     */
    @Import(name="configurationSetName")
    private @Nullable Output<String> configurationSetName;

    public Optional<Output<String>> configurationSetName() {
        return Optional.ofNullable(this.configurationSetName);
    }

    /**
     * If true, the event destination will be enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Send the events to a kinesis firehose destination
     * 
     */
    @Import(name="kinesisDestination")
    private @Nullable Output<EventDestinationKinesisDestinationGetArgs> kinesisDestination;

    public Optional<Output<EventDestinationKinesisDestinationGetArgs>> kinesisDestination() {
        return Optional.ofNullable(this.kinesisDestination);
    }

    /**
     * A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
     * 
     */
    @Import(name="matchingTypes")
    private @Nullable Output<List<String>> matchingTypes;

    public Optional<Output<List<String>>> matchingTypes() {
        return Optional.ofNullable(this.matchingTypes);
    }

    /**
     * The name of the event destination
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Send the events to an SNS Topic destination
     * 
     */
    @Import(name="snsDestination")
    private @Nullable Output<EventDestinationSnsDestinationGetArgs> snsDestination;

    public Optional<Output<EventDestinationSnsDestinationGetArgs>> snsDestination() {
        return Optional.ofNullable(this.snsDestination);
    }

    private EventDestinationState() {}

    private EventDestinationState(EventDestinationState $) {
        this.arn = $.arn;
        this.cloudwatchDestinations = $.cloudwatchDestinations;
        this.configurationSetName = $.configurationSetName;
        this.enabled = $.enabled;
        this.kinesisDestination = $.kinesisDestination;
        this.matchingTypes = $.matchingTypes;
        this.name = $.name;
        this.snsDestination = $.snsDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventDestinationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventDestinationState $;

        public Builder() {
            $ = new EventDestinationState();
        }

        public Builder(EventDestinationState defaults) {
            $ = new EventDestinationState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder cloudwatchDestinations(@Nullable Output<List<EventDestinationCloudwatchDestinationGetArgs>> cloudwatchDestinations) {
            $.cloudwatchDestinations = cloudwatchDestinations;
            return this;
        }

        public Builder cloudwatchDestinations(List<EventDestinationCloudwatchDestinationGetArgs> cloudwatchDestinations) {
            return cloudwatchDestinations(Output.of(cloudwatchDestinations));
        }

        public Builder cloudwatchDestinations(EventDestinationCloudwatchDestinationGetArgs... cloudwatchDestinations) {
            return cloudwatchDestinations(List.of(cloudwatchDestinations));
        }

        public Builder configurationSetName(@Nullable Output<String> configurationSetName) {
            $.configurationSetName = configurationSetName;
            return this;
        }

        public Builder configurationSetName(String configurationSetName) {
            return configurationSetName(Output.of(configurationSetName));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder kinesisDestination(@Nullable Output<EventDestinationKinesisDestinationGetArgs> kinesisDestination) {
            $.kinesisDestination = kinesisDestination;
            return this;
        }

        public Builder kinesisDestination(EventDestinationKinesisDestinationGetArgs kinesisDestination) {
            return kinesisDestination(Output.of(kinesisDestination));
        }

        public Builder matchingTypes(@Nullable Output<List<String>> matchingTypes) {
            $.matchingTypes = matchingTypes;
            return this;
        }

        public Builder matchingTypes(List<String> matchingTypes) {
            return matchingTypes(Output.of(matchingTypes));
        }

        public Builder matchingTypes(String... matchingTypes) {
            return matchingTypes(List.of(matchingTypes));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder snsDestination(@Nullable Output<EventDestinationSnsDestinationGetArgs> snsDestination) {
            $.snsDestination = snsDestination;
            return this;
        }

        public Builder snsDestination(EventDestinationSnsDestinationGetArgs snsDestination) {
            return snsDestination(Output.of(snsDestination));
        }

        public EventDestinationState build() {
            return $;
        }
    }

}

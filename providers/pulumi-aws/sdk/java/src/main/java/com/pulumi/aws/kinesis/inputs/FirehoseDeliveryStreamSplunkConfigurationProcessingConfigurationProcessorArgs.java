// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs Empty = new FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs();

    /**
     * Array of processor parameters. More details are given below
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;

    public Optional<Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The type of processor. Valid Values: `Lambda`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs() {}

    private FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs $) {
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs();
        }

        public Builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs defaults) {
            $ = new FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs(Objects.requireNonNull(defaults));
        }

        public Builder parameters(@Nullable Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}

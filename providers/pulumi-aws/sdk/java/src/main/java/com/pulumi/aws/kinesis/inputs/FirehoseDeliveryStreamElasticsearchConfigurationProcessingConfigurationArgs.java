// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs Empty = new FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs();

    /**
     * Enables or disables data processing.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Array of data processors. More details are given below
     * 
     */
    @Import(name="processors")
    private @Nullable Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs>> processors;

    public Optional<Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs>>> processors() {
        return Optional.ofNullable(this.processors);
    }

    private FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs() {}

    private FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs $) {
        this.enabled = $.enabled;
        this.processors = $.processors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs();
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs defaults) {
            $ = new FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder processors(@Nullable Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs>> processors) {
            $.processors = processors;
            return this;
        }

        public Builder processors(List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs> processors) {
            return processors(Output.of(processors));
        }

        public Builder processors(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs... processors) {
            return processors(List.of(processors));
        }

        public FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs build() {
            return $;
        }
    }

}

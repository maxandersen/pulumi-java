// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamElasticsearchBufferingHintsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamElasticsearchBufferingHintsArgs Empty = new DeliveryStreamElasticsearchBufferingHintsArgs();

    @Import(name="intervalInSeconds")
    private @Nullable Output<Integer> intervalInSeconds;

    public Optional<Output<Integer>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    @Import(name="sizeInMBs")
    private @Nullable Output<Integer> sizeInMBs;

    public Optional<Output<Integer>> sizeInMBs() {
        return Optional.ofNullable(this.sizeInMBs);
    }

    private DeliveryStreamElasticsearchBufferingHintsArgs() {}

    private DeliveryStreamElasticsearchBufferingHintsArgs(DeliveryStreamElasticsearchBufferingHintsArgs $) {
        this.intervalInSeconds = $.intervalInSeconds;
        this.sizeInMBs = $.sizeInMBs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamElasticsearchBufferingHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamElasticsearchBufferingHintsArgs $;

        public Builder() {
            $ = new DeliveryStreamElasticsearchBufferingHintsArgs();
        }

        public Builder(DeliveryStreamElasticsearchBufferingHintsArgs defaults) {
            $ = new DeliveryStreamElasticsearchBufferingHintsArgs(Objects.requireNonNull(defaults));
        }

        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        public Builder sizeInMBs(@Nullable Output<Integer> sizeInMBs) {
            $.sizeInMBs = sizeInMBs;
            return this;
        }

        public Builder sizeInMBs(Integer sizeInMBs) {
            return sizeInMBs(Output.of(sizeInMBs));
        }

        public DeliveryStreamElasticsearchBufferingHintsArgs build() {
            return $;
        }
    }

}

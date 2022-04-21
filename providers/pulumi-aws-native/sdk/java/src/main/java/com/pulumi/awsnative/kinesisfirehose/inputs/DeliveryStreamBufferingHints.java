// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamBufferingHints extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamBufferingHints Empty = new DeliveryStreamBufferingHints();

    @Import(name="intervalInSeconds")
    private @Nullable Integer intervalInSeconds;

    public Optional<Integer> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    @Import(name="sizeInMBs")
    private @Nullable Integer sizeInMBs;

    public Optional<Integer> sizeInMBs() {
        return Optional.ofNullable(this.sizeInMBs);
    }

    private DeliveryStreamBufferingHints() {}

    private DeliveryStreamBufferingHints(DeliveryStreamBufferingHints $) {
        this.intervalInSeconds = $.intervalInSeconds;
        this.sizeInMBs = $.sizeInMBs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamBufferingHints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamBufferingHints $;

        public Builder() {
            $ = new DeliveryStreamBufferingHints();
        }

        public Builder(DeliveryStreamBufferingHints defaults) {
            $ = new DeliveryStreamBufferingHints(Objects.requireNonNull(defaults));
        }

        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder sizeInMBs(@Nullable Integer sizeInMBs) {
            $.sizeInMBs = sizeInMBs;
            return this;
        }

        public DeliveryStreamBufferingHints build() {
            return $;
        }
    }

}

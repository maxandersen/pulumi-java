// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamElasticsearchBufferingHints extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamElasticsearchBufferingHints Empty = new DeliveryStreamElasticsearchBufferingHints();

    @Import(name="intervalInSeconds")
      private final @Nullable Integer intervalInSeconds;

    public Optional<Integer> intervalInSeconds() {
        return this.intervalInSeconds == null ? Optional.empty() : Optional.ofNullable(this.intervalInSeconds);
    }

    @Import(name="sizeInMBs")
      private final @Nullable Integer sizeInMBs;

    public Optional<Integer> sizeInMBs() {
        return this.sizeInMBs == null ? Optional.empty() : Optional.ofNullable(this.sizeInMBs);
    }

    public DeliveryStreamElasticsearchBufferingHints(
        @Nullable Integer intervalInSeconds,
        @Nullable Integer sizeInMBs) {
        this.intervalInSeconds = intervalInSeconds;
        this.sizeInMBs = sizeInMBs;
    }

    private DeliveryStreamElasticsearchBufferingHints() {
        this.intervalInSeconds = null;
        this.sizeInMBs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamElasticsearchBufferingHints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer intervalInSeconds;
        private @Nullable Integer sizeInMBs;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamElasticsearchBufferingHints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeInMBs = defaults.sizeInMBs;
        }

        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        public Builder sizeInMBs(@Nullable Integer sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            return this;
        }        public DeliveryStreamElasticsearchBufferingHints build() {
            return new DeliveryStreamElasticsearchBufferingHints(intervalInSeconds, sizeInMBs);
        }
    }
}

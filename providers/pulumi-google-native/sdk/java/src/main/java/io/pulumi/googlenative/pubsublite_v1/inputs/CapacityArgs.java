// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The throughput capacity configuration for each partition.
 * 
 */
public final class CapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityArgs Empty = new CapacityArgs();

    /**
     * Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16.
     * 
     */
    @Import(name="publishMibPerSec")
      private final @Nullable Output<Integer> publishMibPerSec;

    public Output<Integer> publishMibPerSec() {
        return this.publishMibPerSec == null ? Codegen.empty() : this.publishMibPerSec;
    }

    /**
     * Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 32.
     * 
     */
    @Import(name="subscribeMibPerSec")
      private final @Nullable Output<Integer> subscribeMibPerSec;

    public Output<Integer> subscribeMibPerSec() {
        return this.subscribeMibPerSec == null ? Codegen.empty() : this.subscribeMibPerSec;
    }

    public CapacityArgs(
        @Nullable Output<Integer> publishMibPerSec,
        @Nullable Output<Integer> subscribeMibPerSec) {
        this.publishMibPerSec = publishMibPerSec;
        this.subscribeMibPerSec = subscribeMibPerSec;
    }

    private CapacityArgs() {
        this.publishMibPerSec = Codegen.empty();
        this.subscribeMibPerSec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> publishMibPerSec;
        private @Nullable Output<Integer> subscribeMibPerSec;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMibPerSec = defaults.publishMibPerSec;
    	      this.subscribeMibPerSec = defaults.subscribeMibPerSec;
        }

        public Builder publishMibPerSec(@Nullable Output<Integer> publishMibPerSec) {
            this.publishMibPerSec = publishMibPerSec;
            return this;
        }
        public Builder publishMibPerSec(@Nullable Integer publishMibPerSec) {
            this.publishMibPerSec = Codegen.ofNullable(publishMibPerSec);
            return this;
        }
        public Builder subscribeMibPerSec(@Nullable Output<Integer> subscribeMibPerSec) {
            this.subscribeMibPerSec = subscribeMibPerSec;
            return this;
        }
        public Builder subscribeMibPerSec(@Nullable Integer subscribeMibPerSec) {
            this.subscribeMibPerSec = Codegen.ofNullable(subscribeMibPerSec);
            return this;
        }        public CapacityArgs build() {
            return new CapacityArgs(publishMibPerSec, subscribeMibPerSec);
        }
    }
}

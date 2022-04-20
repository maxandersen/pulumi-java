// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicRetentionConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiteTopicRetentionConfigGetArgs Empty = new LiteTopicRetentionConfigGetArgs();

    /**
     * The provisioned storage, in bytes, per partition. If the number of bytes stored
     * in any of the topic&#39;s partitions grows beyond this value, older messages will be
     * dropped to make room for newer ones, regardless of the value of period.
     * 
     */
    @Import(name="perPartitionBytes", required=true)
      private final Output<String> perPartitionBytes;

    public Output<String> perPartitionBytes() {
        return this.perPartitionBytes;
    }

    /**
     * How long a published message is retained. If unset, messages will be retained as
     * long as the bytes retained for each partition is below perPartitionBytes. A
     * duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="period")
      private final @Nullable Output<String> period;

    public Output<String> period() {
        return this.period == null ? Codegen.empty() : this.period;
    }

    public LiteTopicRetentionConfigGetArgs(
        Output<String> perPartitionBytes,
        @Nullable Output<String> period) {
        this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes, "expected parameter 'perPartitionBytes' to be non-null");
        this.period = period;
    }

    private LiteTopicRetentionConfigGetArgs() {
        this.perPartitionBytes = Codegen.empty();
        this.period = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicRetentionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> perPartitionBytes;
        private @Nullable Output<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicRetentionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perPartitionBytes = defaults.perPartitionBytes;
    	      this.period = defaults.period;
        }

        public Builder perPartitionBytes(Output<String> perPartitionBytes) {
            this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes);
            return this;
        }
        public Builder perPartitionBytes(String perPartitionBytes) {
            this.perPartitionBytes = Output.of(Objects.requireNonNull(perPartitionBytes));
            return this;
        }
        public Builder period(@Nullable Output<String> period) {
            this.period = period;
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = Codegen.ofNullable(period);
            return this;
        }        public LiteTopicRetentionConfigGetArgs build() {
            return new LiteTopicRetentionConfigGetArgs(perPartitionBytes, period);
        }
    }
}

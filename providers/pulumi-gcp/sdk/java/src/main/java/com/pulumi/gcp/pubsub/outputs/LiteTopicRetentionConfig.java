// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiteTopicRetentionConfig {
    /**
     * @return The provisioned storage, in bytes, per partition. If the number of bytes stored
     * in any of the topic&#39;s partitions grows beyond this value, older messages will be
     * dropped to make room for newer ones, regardless of the value of period.
     * 
     */
    private final String perPartitionBytes;
    /**
     * @return How long a published message is retained. If unset, messages will be retained as
     * long as the bytes retained for each partition is below perPartitionBytes. A
     * duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * Example: &#34;3.5s&#34;.
     * 
     */
    private final @Nullable String period;

    @CustomType.Constructor
    private LiteTopicRetentionConfig(
        @CustomType.Parameter("perPartitionBytes") String perPartitionBytes,
        @CustomType.Parameter("period") @Nullable String period) {
        this.perPartitionBytes = perPartitionBytes;
        this.period = period;
    }

    /**
     * @return The provisioned storage, in bytes, per partition. If the number of bytes stored
     * in any of the topic&#39;s partitions grows beyond this value, older messages will be
     * dropped to make room for newer ones, regardless of the value of period.
     * 
     */
    public String perPartitionBytes() {
        return this.perPartitionBytes;
    }
    /**
     * @return How long a published message is retained. If unset, messages will be retained as
     * long as the bytes retained for each partition is below perPartitionBytes. A
     * duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<String> period() {
        return Optional.ofNullable(this.period);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicRetentionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String perPartitionBytes;
        private @Nullable String period;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicRetentionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perPartitionBytes = defaults.perPartitionBytes;
    	      this.period = defaults.period;
        }

        public Builder perPartitionBytes(String perPartitionBytes) {
            this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes);
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = period;
            return this;
        }        public LiteTopicRetentionConfig build() {
            return new LiteTopicRetentionConfig(perPartitionBytes, period);
        }
    }
}

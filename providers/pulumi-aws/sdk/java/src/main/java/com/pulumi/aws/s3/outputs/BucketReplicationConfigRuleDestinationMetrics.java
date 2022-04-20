// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketReplicationConfigRuleDestinationMetricsEventThreshold;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationConfigRuleDestinationMetrics {
    /**
     * A configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event documented below.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold;
    /**
     * The status of the Destination Metrics. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private BucketReplicationConfigRuleDestinationMetrics(
        @CustomType.Parameter("eventThreshold") @Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold,
        @CustomType.Parameter("status") String status) {
        this.eventThreshold = eventThreshold;
        this.status = status;
    }

    /**
     * A configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event documented below.
     * 
    */
    public Optional<BucketReplicationConfigRuleDestinationMetricsEventThreshold> eventThreshold() {
        return Optional.ofNullable(this.eventThreshold);
    }
    /**
     * The status of the Destination Metrics. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventThreshold = defaults.eventThreshold;
    	      this.status = defaults.status;
        }

        public Builder eventThreshold(@Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold) {
            this.eventThreshold = eventThreshold;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public BucketReplicationConfigRuleDestinationMetrics build() {
            return new BucketReplicationConfigRuleDestinationMetrics(eventThreshold, status);
        }
    }
}

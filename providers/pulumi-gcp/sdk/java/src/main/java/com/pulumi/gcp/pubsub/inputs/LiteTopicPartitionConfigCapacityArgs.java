// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class LiteTopicPartitionConfigCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiteTopicPartitionConfigCapacityArgs Empty = new LiteTopicPartitionConfigCapacityArgs();

    /**
     * Subscribe throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    @Import(name="publishMibPerSec", required=true)
    private Output<Integer> publishMibPerSec;

    /**
     * @return Subscribe throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    public Output<Integer> publishMibPerSec() {
        return this.publishMibPerSec;
    }

    /**
     * Publish throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    @Import(name="subscribeMibPerSec", required=true)
    private Output<Integer> subscribeMibPerSec;

    /**
     * @return Publish throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    public Output<Integer> subscribeMibPerSec() {
        return this.subscribeMibPerSec;
    }

    private LiteTopicPartitionConfigCapacityArgs() {}

    private LiteTopicPartitionConfigCapacityArgs(LiteTopicPartitionConfigCapacityArgs $) {
        this.publishMibPerSec = $.publishMibPerSec;
        this.subscribeMibPerSec = $.subscribeMibPerSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiteTopicPartitionConfigCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiteTopicPartitionConfigCapacityArgs $;

        public Builder() {
            $ = new LiteTopicPartitionConfigCapacityArgs();
        }

        public Builder(LiteTopicPartitionConfigCapacityArgs defaults) {
            $ = new LiteTopicPartitionConfigCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publishMibPerSec Subscribe throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
         * 
         * @return builder
         * 
         */
        public Builder publishMibPerSec(Output<Integer> publishMibPerSec) {
            $.publishMibPerSec = publishMibPerSec;
            return this;
        }

        /**
         * @param publishMibPerSec Subscribe throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
         * 
         * @return builder
         * 
         */
        public Builder publishMibPerSec(Integer publishMibPerSec) {
            return publishMibPerSec(Output.of(publishMibPerSec));
        }

        /**
         * @param subscribeMibPerSec Publish throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
         * 
         * @return builder
         * 
         */
        public Builder subscribeMibPerSec(Output<Integer> subscribeMibPerSec) {
            $.subscribeMibPerSec = subscribeMibPerSec;
            return this;
        }

        /**
         * @param subscribeMibPerSec Publish throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
         * 
         * @return builder
         * 
         */
        public Builder subscribeMibPerSec(Integer subscribeMibPerSec) {
            return subscribeMibPerSec(Output.of(subscribeMibPerSec));
        }

        public LiteTopicPartitionConfigCapacityArgs build() {
            $.publishMibPerSec = Objects.requireNonNull($.publishMibPerSec, "expected parameter 'publishMibPerSec' to be non-null");
            $.subscribeMibPerSec = Objects.requireNonNull($.subscribeMibPerSec, "expected parameter 'subscribeMibPerSec' to be non-null");
            return $;
        }
    }

}

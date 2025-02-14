// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a partitioning scheme where an integer range is allocated evenly across a number of partitions.
 * 
 */
public final class UniformInt64RangePartitionSchemeDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final UniformInt64RangePartitionSchemeDescriptionArgs Empty = new UniformInt64RangePartitionSchemeDescriptionArgs();

    /**
     * The number of partitions.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return The number of partitions.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @Import(name="highKey", required=true)
    private Output<String> highKey;

    /**
     * @return String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    public Output<String> highKey() {
        return this.highKey;
    }

    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @Import(name="lowKey", required=true)
    private Output<String> lowKey;

    /**
     * @return String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    public Output<String> lowKey() {
        return this.lowKey;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is &#39;UniformInt64Range&#39;.
     * 
     */
    @Import(name="partitionScheme", required=true)
    private Output<String> partitionScheme;

    /**
     * @return Enumerates the ways that a service can be partitioned.
     * Expected value is &#39;UniformInt64Range&#39;.
     * 
     */
    public Output<String> partitionScheme() {
        return this.partitionScheme;
    }

    private UniformInt64RangePartitionSchemeDescriptionArgs() {}

    private UniformInt64RangePartitionSchemeDescriptionArgs(UniformInt64RangePartitionSchemeDescriptionArgs $) {
        this.count = $.count;
        this.highKey = $.highKey;
        this.lowKey = $.lowKey;
        this.partitionScheme = $.partitionScheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UniformInt64RangePartitionSchemeDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UniformInt64RangePartitionSchemeDescriptionArgs $;

        public Builder() {
            $ = new UniformInt64RangePartitionSchemeDescriptionArgs();
        }

        public Builder(UniformInt64RangePartitionSchemeDescriptionArgs defaults) {
            $ = new UniformInt64RangePartitionSchemeDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of partitions.
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of partitions.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param highKey String indicating the upper bound of the partition key range that
         * should be split between the partition ‘count’
         * 
         * @return builder
         * 
         */
        public Builder highKey(Output<String> highKey) {
            $.highKey = highKey;
            return this;
        }

        /**
         * @param highKey String indicating the upper bound of the partition key range that
         * should be split between the partition ‘count’
         * 
         * @return builder
         * 
         */
        public Builder highKey(String highKey) {
            return highKey(Output.of(highKey));
        }

        /**
         * @param lowKey String indicating the lower bound of the partition key range that
         * should be split between the partition ‘count’
         * 
         * @return builder
         * 
         */
        public Builder lowKey(Output<String> lowKey) {
            $.lowKey = lowKey;
            return this;
        }

        /**
         * @param lowKey String indicating the lower bound of the partition key range that
         * should be split between the partition ‘count’
         * 
         * @return builder
         * 
         */
        public Builder lowKey(String lowKey) {
            return lowKey(Output.of(lowKey));
        }

        /**
         * @param partitionScheme Enumerates the ways that a service can be partitioned.
         * Expected value is &#39;UniformInt64Range&#39;.
         * 
         * @return builder
         * 
         */
        public Builder partitionScheme(Output<String> partitionScheme) {
            $.partitionScheme = partitionScheme;
            return this;
        }

        /**
         * @param partitionScheme Enumerates the ways that a service can be partitioned.
         * Expected value is &#39;UniformInt64Range&#39;.
         * 
         * @return builder
         * 
         */
        public Builder partitionScheme(String partitionScheme) {
            return partitionScheme(Output.of(partitionScheme));
        }

        public UniformInt64RangePartitionSchemeDescriptionArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.highKey = Objects.requireNonNull($.highKey, "expected parameter 'highKey' to be non-null");
            $.lowKey = Objects.requireNonNull($.lowKey, "expected parameter 'lowKey' to be non-null");
            $.partitionScheme = Codegen.stringProp("partitionScheme").output().arg($.partitionScheme).require();
            return $;
        }
    }

}

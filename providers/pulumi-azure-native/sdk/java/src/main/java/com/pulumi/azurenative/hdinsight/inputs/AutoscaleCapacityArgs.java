// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The load-based autoscale request parameters
 * 
 */
public final class AutoscaleCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleCapacityArgs Empty = new AutoscaleCapacityArgs();

    /**
     * The maximum instance count of the cluster
     * 
     */
    @Import(name="maxInstanceCount")
    private @Nullable Output<Integer> maxInstanceCount;

    /**
     * @return The maximum instance count of the cluster
     * 
     */
    public Optional<Output<Integer>> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }

    /**
     * The minimum instance count of the cluster
     * 
     */
    @Import(name="minInstanceCount")
    private @Nullable Output<Integer> minInstanceCount;

    /**
     * @return The minimum instance count of the cluster
     * 
     */
    public Optional<Output<Integer>> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    private AutoscaleCapacityArgs() {}

    private AutoscaleCapacityArgs(AutoscaleCapacityArgs $) {
        this.maxInstanceCount = $.maxInstanceCount;
        this.minInstanceCount = $.minInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleCapacityArgs $;

        public Builder() {
            $ = new AutoscaleCapacityArgs();
        }

        public Builder(AutoscaleCapacityArgs defaults) {
            $ = new AutoscaleCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxInstanceCount The maximum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(@Nullable Output<Integer> maxInstanceCount) {
            $.maxInstanceCount = maxInstanceCount;
            return this;
        }

        /**
         * @param maxInstanceCount The maximum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(Integer maxInstanceCount) {
            return maxInstanceCount(Output.of(maxInstanceCount));
        }

        /**
         * @param minInstanceCount The minimum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(@Nullable Output<Integer> minInstanceCount) {
            $.minInstanceCount = minInstanceCount;
            return this;
        }

        /**
         * @param minInstanceCount The minimum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(Integer minInstanceCount) {
            return minInstanceCount(Output.of(minInstanceCount));
        }

        public AutoscaleCapacityArgs build() {
            return $;
        }
    }

}

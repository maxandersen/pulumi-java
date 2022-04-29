// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.enums.DataFlowComputeType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data flow properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeDataFlowPropertiesArgs extends ResourceArgs {

    public static final IntegrationRuntimeDataFlowPropertiesArgs Empty = new IntegrationRuntimeDataFlowPropertiesArgs();

    /**
     * Compute type of the cluster which will execute data flow job.
     * 
     */
    @Import(name="computeType")
    private @Nullable Output<Either<String,DataFlowComputeType>> computeType;

    /**
     * @return Compute type of the cluster which will execute data flow job.
     * 
     */
    public Optional<Output<Either<String,DataFlowComputeType>>> computeType() {
        return Optional.ofNullable(this.computeType);
    }

    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    @Import(name="coreCount")
    private @Nullable Output<Integer> coreCount;

    /**
     * @return Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    public Optional<Output<Integer>> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    @Import(name="timeToLive")
    private @Nullable Output<Integer> timeToLive;

    /**
     * @return Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    public Optional<Output<Integer>> timeToLive() {
        return Optional.ofNullable(this.timeToLive);
    }

    private IntegrationRuntimeDataFlowPropertiesArgs() {}

    private IntegrationRuntimeDataFlowPropertiesArgs(IntegrationRuntimeDataFlowPropertiesArgs $) {
        this.computeType = $.computeType;
        this.coreCount = $.coreCount;
        this.timeToLive = $.timeToLive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeDataFlowPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeDataFlowPropertiesArgs $;

        public Builder() {
            $ = new IntegrationRuntimeDataFlowPropertiesArgs();
        }

        public Builder(IntegrationRuntimeDataFlowPropertiesArgs defaults) {
            $ = new IntegrationRuntimeDataFlowPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder computeType(@Nullable Output<Either<String,DataFlowComputeType>> computeType) {
            $.computeType = computeType;
            return this;
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder computeType(Either<String,DataFlowComputeType> computeType) {
            return computeType(Output.of(computeType));
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder computeType(String computeType) {
            return computeType(Either.ofLeft(computeType));
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder computeType(DataFlowComputeType computeType) {
            return computeType(Either.ofRight(computeType));
        }

        /**
         * @param coreCount Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(@Nullable Output<Integer> coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        /**
         * @param coreCount Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(Integer coreCount) {
            return coreCount(Output.of(coreCount));
        }

        /**
         * @param timeToLive Time to live (in minutes) setting of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder timeToLive(@Nullable Output<Integer> timeToLive) {
            $.timeToLive = timeToLive;
            return this;
        }

        /**
         * @param timeToLive Time to live (in minutes) setting of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder timeToLive(Integer timeToLive) {
            return timeToLive(Output.of(timeToLive));
        }

        public IntegrationRuntimeDataFlowPropertiesArgs build() {
            return $;
        }
    }

}

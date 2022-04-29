// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.enums.Expander;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters to be applied to the cluster-autoscaler when enabled
 * 
 */
public final class ManagedClusterPropertiesAutoScalerProfileArgs extends ResourceArgs {

    public static final ManagedClusterPropertiesAutoScalerProfileArgs Empty = new ManagedClusterPropertiesAutoScalerProfileArgs();

    @Import(name="balanceSimilarNodeGroups")
    private @Nullable Output<String> balanceSimilarNodeGroups;

    public Optional<Output<String>> balanceSimilarNodeGroups() {
        return Optional.ofNullable(this.balanceSimilarNodeGroups);
    }

    @Import(name="expander")
    private @Nullable Output<Either<String,Expander>> expander;

    public Optional<Output<Either<String,Expander>>> expander() {
        return Optional.ofNullable(this.expander);
    }

    @Import(name="maxEmptyBulkDelete")
    private @Nullable Output<String> maxEmptyBulkDelete;

    public Optional<Output<String>> maxEmptyBulkDelete() {
        return Optional.ofNullable(this.maxEmptyBulkDelete);
    }

    @Import(name="maxGracefulTerminationSec")
    private @Nullable Output<String> maxGracefulTerminationSec;

    public Optional<Output<String>> maxGracefulTerminationSec() {
        return Optional.ofNullable(this.maxGracefulTerminationSec);
    }

    @Import(name="maxNodeProvisionTime")
    private @Nullable Output<String> maxNodeProvisionTime;

    public Optional<Output<String>> maxNodeProvisionTime() {
        return Optional.ofNullable(this.maxNodeProvisionTime);
    }

    @Import(name="maxTotalUnreadyPercentage")
    private @Nullable Output<String> maxTotalUnreadyPercentage;

    public Optional<Output<String>> maxTotalUnreadyPercentage() {
        return Optional.ofNullable(this.maxTotalUnreadyPercentage);
    }

    @Import(name="newPodScaleUpDelay")
    private @Nullable Output<String> newPodScaleUpDelay;

    public Optional<Output<String>> newPodScaleUpDelay() {
        return Optional.ofNullable(this.newPodScaleUpDelay);
    }

    @Import(name="okTotalUnreadyCount")
    private @Nullable Output<String> okTotalUnreadyCount;

    public Optional<Output<String>> okTotalUnreadyCount() {
        return Optional.ofNullable(this.okTotalUnreadyCount);
    }

    @Import(name="scaleDownDelayAfterAdd")
    private @Nullable Output<String> scaleDownDelayAfterAdd;

    public Optional<Output<String>> scaleDownDelayAfterAdd() {
        return Optional.ofNullable(this.scaleDownDelayAfterAdd);
    }

    @Import(name="scaleDownDelayAfterDelete")
    private @Nullable Output<String> scaleDownDelayAfterDelete;

    public Optional<Output<String>> scaleDownDelayAfterDelete() {
        return Optional.ofNullable(this.scaleDownDelayAfterDelete);
    }

    @Import(name="scaleDownDelayAfterFailure")
    private @Nullable Output<String> scaleDownDelayAfterFailure;

    public Optional<Output<String>> scaleDownDelayAfterFailure() {
        return Optional.ofNullable(this.scaleDownDelayAfterFailure);
    }

    @Import(name="scaleDownUnneededTime")
    private @Nullable Output<String> scaleDownUnneededTime;

    public Optional<Output<String>> scaleDownUnneededTime() {
        return Optional.ofNullable(this.scaleDownUnneededTime);
    }

    @Import(name="scaleDownUnreadyTime")
    private @Nullable Output<String> scaleDownUnreadyTime;

    public Optional<Output<String>> scaleDownUnreadyTime() {
        return Optional.ofNullable(this.scaleDownUnreadyTime);
    }

    @Import(name="scaleDownUtilizationThreshold")
    private @Nullable Output<String> scaleDownUtilizationThreshold;

    public Optional<Output<String>> scaleDownUtilizationThreshold() {
        return Optional.ofNullable(this.scaleDownUtilizationThreshold);
    }

    @Import(name="scanInterval")
    private @Nullable Output<String> scanInterval;

    public Optional<Output<String>> scanInterval() {
        return Optional.ofNullable(this.scanInterval);
    }

    @Import(name="skipNodesWithLocalStorage")
    private @Nullable Output<String> skipNodesWithLocalStorage;

    public Optional<Output<String>> skipNodesWithLocalStorage() {
        return Optional.ofNullable(this.skipNodesWithLocalStorage);
    }

    @Import(name="skipNodesWithSystemPods")
    private @Nullable Output<String> skipNodesWithSystemPods;

    public Optional<Output<String>> skipNodesWithSystemPods() {
        return Optional.ofNullable(this.skipNodesWithSystemPods);
    }

    private ManagedClusterPropertiesAutoScalerProfileArgs() {}

    private ManagedClusterPropertiesAutoScalerProfileArgs(ManagedClusterPropertiesAutoScalerProfileArgs $) {
        this.balanceSimilarNodeGroups = $.balanceSimilarNodeGroups;
        this.expander = $.expander;
        this.maxEmptyBulkDelete = $.maxEmptyBulkDelete;
        this.maxGracefulTerminationSec = $.maxGracefulTerminationSec;
        this.maxNodeProvisionTime = $.maxNodeProvisionTime;
        this.maxTotalUnreadyPercentage = $.maxTotalUnreadyPercentage;
        this.newPodScaleUpDelay = $.newPodScaleUpDelay;
        this.okTotalUnreadyCount = $.okTotalUnreadyCount;
        this.scaleDownDelayAfterAdd = $.scaleDownDelayAfterAdd;
        this.scaleDownDelayAfterDelete = $.scaleDownDelayAfterDelete;
        this.scaleDownDelayAfterFailure = $.scaleDownDelayAfterFailure;
        this.scaleDownUnneededTime = $.scaleDownUnneededTime;
        this.scaleDownUnreadyTime = $.scaleDownUnreadyTime;
        this.scaleDownUtilizationThreshold = $.scaleDownUtilizationThreshold;
        this.scanInterval = $.scanInterval;
        this.skipNodesWithLocalStorage = $.skipNodesWithLocalStorage;
        this.skipNodesWithSystemPods = $.skipNodesWithSystemPods;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterPropertiesAutoScalerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterPropertiesAutoScalerProfileArgs $;

        public Builder() {
            $ = new ManagedClusterPropertiesAutoScalerProfileArgs();
        }

        public Builder(ManagedClusterPropertiesAutoScalerProfileArgs defaults) {
            $ = new ManagedClusterPropertiesAutoScalerProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder balanceSimilarNodeGroups(@Nullable Output<String> balanceSimilarNodeGroups) {
            $.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
            return this;
        }

        public Builder balanceSimilarNodeGroups(String balanceSimilarNodeGroups) {
            return balanceSimilarNodeGroups(Output.of(balanceSimilarNodeGroups));
        }

        public Builder expander(@Nullable Output<Either<String,Expander>> expander) {
            $.expander = expander;
            return this;
        }

        public Builder expander(Either<String,Expander> expander) {
            return expander(Output.of(expander));
        }

        public Builder expander(String expander) {
            return expander(Either.ofLeft(expander));
        }

        public Builder expander(Expander expander) {
            return expander(Either.ofRight(expander));
        }

        public Builder maxEmptyBulkDelete(@Nullable Output<String> maxEmptyBulkDelete) {
            $.maxEmptyBulkDelete = maxEmptyBulkDelete;
            return this;
        }

        public Builder maxEmptyBulkDelete(String maxEmptyBulkDelete) {
            return maxEmptyBulkDelete(Output.of(maxEmptyBulkDelete));
        }

        public Builder maxGracefulTerminationSec(@Nullable Output<String> maxGracefulTerminationSec) {
            $.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }

        public Builder maxGracefulTerminationSec(String maxGracefulTerminationSec) {
            return maxGracefulTerminationSec(Output.of(maxGracefulTerminationSec));
        }

        public Builder maxNodeProvisionTime(@Nullable Output<String> maxNodeProvisionTime) {
            $.maxNodeProvisionTime = maxNodeProvisionTime;
            return this;
        }

        public Builder maxNodeProvisionTime(String maxNodeProvisionTime) {
            return maxNodeProvisionTime(Output.of(maxNodeProvisionTime));
        }

        public Builder maxTotalUnreadyPercentage(@Nullable Output<String> maxTotalUnreadyPercentage) {
            $.maxTotalUnreadyPercentage = maxTotalUnreadyPercentage;
            return this;
        }

        public Builder maxTotalUnreadyPercentage(String maxTotalUnreadyPercentage) {
            return maxTotalUnreadyPercentage(Output.of(maxTotalUnreadyPercentage));
        }

        public Builder newPodScaleUpDelay(@Nullable Output<String> newPodScaleUpDelay) {
            $.newPodScaleUpDelay = newPodScaleUpDelay;
            return this;
        }

        public Builder newPodScaleUpDelay(String newPodScaleUpDelay) {
            return newPodScaleUpDelay(Output.of(newPodScaleUpDelay));
        }

        public Builder okTotalUnreadyCount(@Nullable Output<String> okTotalUnreadyCount) {
            $.okTotalUnreadyCount = okTotalUnreadyCount;
            return this;
        }

        public Builder okTotalUnreadyCount(String okTotalUnreadyCount) {
            return okTotalUnreadyCount(Output.of(okTotalUnreadyCount));
        }

        public Builder scaleDownDelayAfterAdd(@Nullable Output<String> scaleDownDelayAfterAdd) {
            $.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
            return this;
        }

        public Builder scaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
            return scaleDownDelayAfterAdd(Output.of(scaleDownDelayAfterAdd));
        }

        public Builder scaleDownDelayAfterDelete(@Nullable Output<String> scaleDownDelayAfterDelete) {
            $.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
            return this;
        }

        public Builder scaleDownDelayAfterDelete(String scaleDownDelayAfterDelete) {
            return scaleDownDelayAfterDelete(Output.of(scaleDownDelayAfterDelete));
        }

        public Builder scaleDownDelayAfterFailure(@Nullable Output<String> scaleDownDelayAfterFailure) {
            $.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
            return this;
        }

        public Builder scaleDownDelayAfterFailure(String scaleDownDelayAfterFailure) {
            return scaleDownDelayAfterFailure(Output.of(scaleDownDelayAfterFailure));
        }

        public Builder scaleDownUnneededTime(@Nullable Output<String> scaleDownUnneededTime) {
            $.scaleDownUnneededTime = scaleDownUnneededTime;
            return this;
        }

        public Builder scaleDownUnneededTime(String scaleDownUnneededTime) {
            return scaleDownUnneededTime(Output.of(scaleDownUnneededTime));
        }

        public Builder scaleDownUnreadyTime(@Nullable Output<String> scaleDownUnreadyTime) {
            $.scaleDownUnreadyTime = scaleDownUnreadyTime;
            return this;
        }

        public Builder scaleDownUnreadyTime(String scaleDownUnreadyTime) {
            return scaleDownUnreadyTime(Output.of(scaleDownUnreadyTime));
        }

        public Builder scaleDownUtilizationThreshold(@Nullable Output<String> scaleDownUtilizationThreshold) {
            $.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
            return this;
        }

        public Builder scaleDownUtilizationThreshold(String scaleDownUtilizationThreshold) {
            return scaleDownUtilizationThreshold(Output.of(scaleDownUtilizationThreshold));
        }

        public Builder scanInterval(@Nullable Output<String> scanInterval) {
            $.scanInterval = scanInterval;
            return this;
        }

        public Builder scanInterval(String scanInterval) {
            return scanInterval(Output.of(scanInterval));
        }

        public Builder skipNodesWithLocalStorage(@Nullable Output<String> skipNodesWithLocalStorage) {
            $.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
            return this;
        }

        public Builder skipNodesWithLocalStorage(String skipNodesWithLocalStorage) {
            return skipNodesWithLocalStorage(Output.of(skipNodesWithLocalStorage));
        }

        public Builder skipNodesWithSystemPods(@Nullable Output<String> skipNodesWithSystemPods) {
            $.skipNodesWithSystemPods = skipNodesWithSystemPods;
            return this;
        }

        public Builder skipNodesWithSystemPods(String skipNodesWithSystemPods) {
            return skipNodesWithSystemPods(Output.of(skipNodesWithSystemPods));
        }

        public ManagedClusterPropertiesAutoScalerProfileArgs build() {
            return $;
        }
    }

}

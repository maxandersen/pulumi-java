// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScaleSettingsArgs extends ResourceArgs {

    public static final AutoScaleSettingsArgs Empty = new AutoScaleSettingsArgs();

    /**
     * Maximum number of instances for this deployment.
     * 
     */
    @Import(name="maxInstances")
    private @Nullable Output<Integer> maxInstances;

    /**
     * @return Maximum number of instances for this deployment.
     * 
     */
    public Optional<Output<Integer>> maxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }

    /**
     * Minimum number of instances for this deployment.
     * 
     */
    @Import(name="minInstances")
    private @Nullable Output<Integer> minInstances;

    /**
     * @return Minimum number of instances for this deployment.
     * 
     */
    public Optional<Output<Integer>> minInstances() {
        return Optional.ofNullable(this.minInstances);
    }

    /**
     * The polling interval in ISO 8691 format. Only supports duration with precision as low as Seconds.
     * 
     */
    @Import(name="pollingInterval")
    private @Nullable Output<String> pollingInterval;

    /**
     * @return The polling interval in ISO 8691 format. Only supports duration with precision as low as Seconds.
     * 
     */
    public Optional<Output<String>> pollingInterval() {
        return Optional.ofNullable(this.pollingInterval);
    }

    /**
     * Expected value is &#39;Auto&#39;.
     * 
     */
    @Import(name="scaleType", required=true)
    private Output<String> scaleType;

    /**
     * @return
     * Expected value is &#39;Auto&#39;.
     * 
     */
    public Output<String> scaleType() {
        return this.scaleType;
    }

    /**
     * Target CPU usage for the autoscaler.
     * 
     */
    @Import(name="targetUtilizationPercentage")
    private @Nullable Output<Integer> targetUtilizationPercentage;

    /**
     * @return Target CPU usage for the autoscaler.
     * 
     */
    public Optional<Output<Integer>> targetUtilizationPercentage() {
        return Optional.ofNullable(this.targetUtilizationPercentage);
    }

    private AutoScaleSettingsArgs() {}

    private AutoScaleSettingsArgs(AutoScaleSettingsArgs $) {
        this.maxInstances = $.maxInstances;
        this.minInstances = $.minInstances;
        this.pollingInterval = $.pollingInterval;
        this.scaleType = $.scaleType;
        this.targetUtilizationPercentage = $.targetUtilizationPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScaleSettingsArgs $;

        public Builder() {
            $ = new AutoScaleSettingsArgs();
        }

        public Builder(AutoScaleSettingsArgs defaults) {
            $ = new AutoScaleSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxInstances Maximum number of instances for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            $.maxInstances = maxInstances;
            return this;
        }

        /**
         * @param maxInstances Maximum number of instances for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(Integer maxInstances) {
            return maxInstances(Output.of(maxInstances));
        }

        /**
         * @param minInstances Minimum number of instances for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            $.minInstances = minInstances;
            return this;
        }

        /**
         * @param minInstances Minimum number of instances for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder minInstances(Integer minInstances) {
            return minInstances(Output.of(minInstances));
        }

        /**
         * @param pollingInterval The polling interval in ISO 8691 format. Only supports duration with precision as low as Seconds.
         * 
         * @return builder
         * 
         */
        public Builder pollingInterval(@Nullable Output<String> pollingInterval) {
            $.pollingInterval = pollingInterval;
            return this;
        }

        /**
         * @param pollingInterval The polling interval in ISO 8691 format. Only supports duration with precision as low as Seconds.
         * 
         * @return builder
         * 
         */
        public Builder pollingInterval(String pollingInterval) {
            return pollingInterval(Output.of(pollingInterval));
        }

        /**
         * @param scaleType
         * Expected value is &#39;Auto&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(Output<String> scaleType) {
            $.scaleType = scaleType;
            return this;
        }

        /**
         * @param scaleType
         * Expected value is &#39;Auto&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(String scaleType) {
            return scaleType(Output.of(scaleType));
        }

        /**
         * @param targetUtilizationPercentage Target CPU usage for the autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder targetUtilizationPercentage(@Nullable Output<Integer> targetUtilizationPercentage) {
            $.targetUtilizationPercentage = targetUtilizationPercentage;
            return this;
        }

        /**
         * @param targetUtilizationPercentage Target CPU usage for the autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder targetUtilizationPercentage(Integer targetUtilizationPercentage) {
            return targetUtilizationPercentage(Output.of(targetUtilizationPercentage));
        }

        public AutoScaleSettingsArgs build() {
            $.scaleType = Codegen.stringProp("scaleType").output().arg($.scaleType).require();
            return $;
        }
    }

}

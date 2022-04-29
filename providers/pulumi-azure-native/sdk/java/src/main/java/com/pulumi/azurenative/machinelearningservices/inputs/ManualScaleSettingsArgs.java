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


public final class ManualScaleSettingsArgs extends ResourceArgs {

    public static final ManualScaleSettingsArgs Empty = new ManualScaleSettingsArgs();

    /**
     * Fixed number of instances for this deployment.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return Fixed number of instances for this deployment.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

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
     * Expected value is &#39;Manual&#39;.
     * 
     */
    @Import(name="scaleType", required=true)
    private Output<String> scaleType;

    /**
     * @return
     * Expected value is &#39;Manual&#39;.
     * 
     */
    public Output<String> scaleType() {
        return this.scaleType;
    }

    private ManualScaleSettingsArgs() {}

    private ManualScaleSettingsArgs(ManualScaleSettingsArgs $) {
        this.instanceCount = $.instanceCount;
        this.maxInstances = $.maxInstances;
        this.minInstances = $.minInstances;
        this.scaleType = $.scaleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManualScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManualScaleSettingsArgs $;

        public Builder() {
            $ = new ManualScaleSettingsArgs();
        }

        public Builder(ManualScaleSettingsArgs defaults) {
            $ = new ManualScaleSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceCount Fixed number of instances for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount Fixed number of instances for this deployment.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
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
         * @param scaleType
         * Expected value is &#39;Manual&#39;.
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
         * Expected value is &#39;Manual&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(String scaleType) {
            return scaleType(Output.of(scaleType));
        }

        public ManualScaleSettingsArgs build() {
            $.scaleType = Codegen.stringProp("scaleType").output().arg($.scaleType).require();
            return $;
        }
    }

}

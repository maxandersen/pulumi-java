// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies settings for the canary deployment in this stage.
 * 
 */
public final class StageCanarySettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageCanarySettingArgs Empty = new StageCanarySettingArgs();

    /**
     * The identifier of the deployment that the stage points to.
     * 
     */
    @Import(name="deploymentId")
    private @Nullable Output<String> deploymentId;

    public Optional<Output<String>> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }

    /**
     * The percentage (0-100) of traffic diverted to a canary deployment.
     * 
     */
    @Import(name="percentTraffic")
    private @Nullable Output<Double> percentTraffic;

    public Optional<Output<Double>> percentTraffic() {
        return Optional.ofNullable(this.percentTraffic);
    }

    /**
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values.
     * 
     */
    @Import(name="stageVariableOverrides")
    private @Nullable Output<Object> stageVariableOverrides;

    public Optional<Output<Object>> stageVariableOverrides() {
        return Optional.ofNullable(this.stageVariableOverrides);
    }

    /**
     * Whether the canary deployment uses the stage cache or not.
     * 
     */
    @Import(name="useStageCache")
    private @Nullable Output<Boolean> useStageCache;

    public Optional<Output<Boolean>> useStageCache() {
        return Optional.ofNullable(this.useStageCache);
    }

    private StageCanarySettingArgs() {}

    private StageCanarySettingArgs(StageCanarySettingArgs $) {
        this.deploymentId = $.deploymentId;
        this.percentTraffic = $.percentTraffic;
        this.stageVariableOverrides = $.stageVariableOverrides;
        this.useStageCache = $.useStageCache;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageCanarySettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageCanarySettingArgs $;

        public Builder() {
            $ = new StageCanarySettingArgs();
        }

        public Builder(StageCanarySettingArgs defaults) {
            $ = new StageCanarySettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        public Builder percentTraffic(@Nullable Output<Double> percentTraffic) {
            $.percentTraffic = percentTraffic;
            return this;
        }

        public Builder percentTraffic(Double percentTraffic) {
            return percentTraffic(Output.of(percentTraffic));
        }

        public Builder stageVariableOverrides(@Nullable Output<Object> stageVariableOverrides) {
            $.stageVariableOverrides = stageVariableOverrides;
            return this;
        }

        public Builder stageVariableOverrides(Object stageVariableOverrides) {
            return stageVariableOverrides(Output.of(stageVariableOverrides));
        }

        public Builder useStageCache(@Nullable Output<Boolean> useStageCache) {
            $.useStageCache = useStageCache;
            return this;
        }

        public Builder useStageCache(Boolean useStageCache) {
            return useStageCache(Output.of(useStageCache));
        }

        public StageCanarySettingArgs build() {
            return $;
        }
    }

}

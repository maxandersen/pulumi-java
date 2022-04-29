// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.HealthProbeRequestType;
import com.pulumi.azurenative.cdn.enums.ProbeProtocol;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The JSON object that contains the properties to send health probes to origin.
 * 
 */
public final class HealthProbeParametersArgs extends ResourceArgs {

    public static final HealthProbeParametersArgs Empty = new HealthProbeParametersArgs();

    /**
     * The number of seconds between health probes.Default is 240sec.
     * 
     */
    @Import(name="probeIntervalInSeconds")
    private @Nullable Output<Integer> probeIntervalInSeconds;

    /**
     * @return The number of seconds between health probes.Default is 240sec.
     * 
     */
    public Optional<Output<Integer>> probeIntervalInSeconds() {
        return Optional.ofNullable(this.probeIntervalInSeconds);
    }

    /**
     * The path relative to the origin that is used to determine the health of the origin.
     * 
     */
    @Import(name="probePath")
    private @Nullable Output<String> probePath;

    /**
     * @return The path relative to the origin that is used to determine the health of the origin.
     * 
     */
    public Optional<Output<String>> probePath() {
        return Optional.ofNullable(this.probePath);
    }

    /**
     * Protocol to use for health probe.
     * 
     */
    @Import(name="probeProtocol")
    private @Nullable Output<ProbeProtocol> probeProtocol;

    /**
     * @return Protocol to use for health probe.
     * 
     */
    public Optional<Output<ProbeProtocol>> probeProtocol() {
        return Optional.ofNullable(this.probeProtocol);
    }

    /**
     * The type of health probe request that is made.
     * 
     */
    @Import(name="probeRequestType")
    private @Nullable Output<HealthProbeRequestType> probeRequestType;

    /**
     * @return The type of health probe request that is made.
     * 
     */
    public Optional<Output<HealthProbeRequestType>> probeRequestType() {
        return Optional.ofNullable(this.probeRequestType);
    }

    private HealthProbeParametersArgs() {}

    private HealthProbeParametersArgs(HealthProbeParametersArgs $) {
        this.probeIntervalInSeconds = $.probeIntervalInSeconds;
        this.probePath = $.probePath;
        this.probeProtocol = $.probeProtocol;
        this.probeRequestType = $.probeRequestType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthProbeParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthProbeParametersArgs $;

        public Builder() {
            $ = new HealthProbeParametersArgs();
        }

        public Builder(HealthProbeParametersArgs defaults) {
            $ = new HealthProbeParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param probeIntervalInSeconds The number of seconds between health probes.Default is 240sec.
         * 
         * @return builder
         * 
         */
        public Builder probeIntervalInSeconds(@Nullable Output<Integer> probeIntervalInSeconds) {
            $.probeIntervalInSeconds = probeIntervalInSeconds;
            return this;
        }

        /**
         * @param probeIntervalInSeconds The number of seconds between health probes.Default is 240sec.
         * 
         * @return builder
         * 
         */
        public Builder probeIntervalInSeconds(Integer probeIntervalInSeconds) {
            return probeIntervalInSeconds(Output.of(probeIntervalInSeconds));
        }

        /**
         * @param probePath The path relative to the origin that is used to determine the health of the origin.
         * 
         * @return builder
         * 
         */
        public Builder probePath(@Nullable Output<String> probePath) {
            $.probePath = probePath;
            return this;
        }

        /**
         * @param probePath The path relative to the origin that is used to determine the health of the origin.
         * 
         * @return builder
         * 
         */
        public Builder probePath(String probePath) {
            return probePath(Output.of(probePath));
        }

        /**
         * @param probeProtocol Protocol to use for health probe.
         * 
         * @return builder
         * 
         */
        public Builder probeProtocol(@Nullable Output<ProbeProtocol> probeProtocol) {
            $.probeProtocol = probeProtocol;
            return this;
        }

        /**
         * @param probeProtocol Protocol to use for health probe.
         * 
         * @return builder
         * 
         */
        public Builder probeProtocol(ProbeProtocol probeProtocol) {
            return probeProtocol(Output.of(probeProtocol));
        }

        /**
         * @param probeRequestType The type of health probe request that is made.
         * 
         * @return builder
         * 
         */
        public Builder probeRequestType(@Nullable Output<HealthProbeRequestType> probeRequestType) {
            $.probeRequestType = probeRequestType;
            return this;
        }

        /**
         * @param probeRequestType The type of health probe request that is made.
         * 
         * @return builder
         * 
         */
        public Builder probeRequestType(HealthProbeRequestType probeRequestType) {
            return probeRequestType(Output.of(probeRequestType));
        }

        public HealthProbeParametersArgs build() {
            return $;
        }
    }

}

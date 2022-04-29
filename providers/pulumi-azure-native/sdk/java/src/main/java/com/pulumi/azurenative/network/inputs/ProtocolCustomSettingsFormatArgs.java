// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.DdosCustomPolicyProtocol;
import com.pulumi.azurenative.network.enums.DdosCustomPolicyTriggerSensitivityOverride;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DDoS custom policy properties.
 * 
 */
public final class ProtocolCustomSettingsFormatArgs extends ResourceArgs {

    public static final ProtocolCustomSettingsFormatArgs Empty = new ProtocolCustomSettingsFormatArgs();

    /**
     * The protocol for which the DDoS protection policy is being customized.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<Either<String,DdosCustomPolicyProtocol>> protocol;

    /**
     * @return The protocol for which the DDoS protection policy is being customized.
     * 
     */
    public Optional<Output<Either<String,DdosCustomPolicyProtocol>>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The customized DDoS protection source rate.
     * 
     */
    @Import(name="sourceRateOverride")
    private @Nullable Output<String> sourceRateOverride;

    /**
     * @return The customized DDoS protection source rate.
     * 
     */
    public Optional<Output<String>> sourceRateOverride() {
        return Optional.ofNullable(this.sourceRateOverride);
    }

    /**
     * The customized DDoS protection trigger rate.
     * 
     */
    @Import(name="triggerRateOverride")
    private @Nullable Output<String> triggerRateOverride;

    /**
     * @return The customized DDoS protection trigger rate.
     * 
     */
    public Optional<Output<String>> triggerRateOverride() {
        return Optional.ofNullable(this.triggerRateOverride);
    }

    /**
     * The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
     * 
     */
    @Import(name="triggerSensitivityOverride")
    private @Nullable Output<Either<String,DdosCustomPolicyTriggerSensitivityOverride>> triggerSensitivityOverride;

    /**
     * @return The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
     * 
     */
    public Optional<Output<Either<String,DdosCustomPolicyTriggerSensitivityOverride>>> triggerSensitivityOverride() {
        return Optional.ofNullable(this.triggerSensitivityOverride);
    }

    private ProtocolCustomSettingsFormatArgs() {}

    private ProtocolCustomSettingsFormatArgs(ProtocolCustomSettingsFormatArgs $) {
        this.protocol = $.protocol;
        this.sourceRateOverride = $.sourceRateOverride;
        this.triggerRateOverride = $.triggerRateOverride;
        this.triggerSensitivityOverride = $.triggerSensitivityOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProtocolCustomSettingsFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProtocolCustomSettingsFormatArgs $;

        public Builder() {
            $ = new ProtocolCustomSettingsFormatArgs();
        }

        public Builder(ProtocolCustomSettingsFormatArgs defaults) {
            $ = new ProtocolCustomSettingsFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param protocol The protocol for which the DDoS protection policy is being customized.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<Either<String,DdosCustomPolicyProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol for which the DDoS protection policy is being customized.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,DdosCustomPolicyProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol The protocol for which the DDoS protection policy is being customized.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol The protocol for which the DDoS protection policy is being customized.
         * 
         * @return builder
         * 
         */
        public Builder protocol(DdosCustomPolicyProtocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        /**
         * @param sourceRateOverride The customized DDoS protection source rate.
         * 
         * @return builder
         * 
         */
        public Builder sourceRateOverride(@Nullable Output<String> sourceRateOverride) {
            $.sourceRateOverride = sourceRateOverride;
            return this;
        }

        /**
         * @param sourceRateOverride The customized DDoS protection source rate.
         * 
         * @return builder
         * 
         */
        public Builder sourceRateOverride(String sourceRateOverride) {
            return sourceRateOverride(Output.of(sourceRateOverride));
        }

        /**
         * @param triggerRateOverride The customized DDoS protection trigger rate.
         * 
         * @return builder
         * 
         */
        public Builder triggerRateOverride(@Nullable Output<String> triggerRateOverride) {
            $.triggerRateOverride = triggerRateOverride;
            return this;
        }

        /**
         * @param triggerRateOverride The customized DDoS protection trigger rate.
         * 
         * @return builder
         * 
         */
        public Builder triggerRateOverride(String triggerRateOverride) {
            return triggerRateOverride(Output.of(triggerRateOverride));
        }

        /**
         * @param triggerSensitivityOverride The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
         * 
         * @return builder
         * 
         */
        public Builder triggerSensitivityOverride(@Nullable Output<Either<String,DdosCustomPolicyTriggerSensitivityOverride>> triggerSensitivityOverride) {
            $.triggerSensitivityOverride = triggerSensitivityOverride;
            return this;
        }

        /**
         * @param triggerSensitivityOverride The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
         * 
         * @return builder
         * 
         */
        public Builder triggerSensitivityOverride(Either<String,DdosCustomPolicyTriggerSensitivityOverride> triggerSensitivityOverride) {
            return triggerSensitivityOverride(Output.of(triggerSensitivityOverride));
        }

        /**
         * @param triggerSensitivityOverride The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
         * 
         * @return builder
         * 
         */
        public Builder triggerSensitivityOverride(String triggerSensitivityOverride) {
            return triggerSensitivityOverride(Either.ofLeft(triggerSensitivityOverride));
        }

        /**
         * @param triggerSensitivityOverride The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
         * 
         * @return builder
         * 
         */
        public Builder triggerSensitivityOverride(DdosCustomPolicyTriggerSensitivityOverride triggerSensitivityOverride) {
            return triggerSensitivityOverride(Either.ofRight(triggerSensitivityOverride));
        }

        public ProtocolCustomSettingsFormatArgs build() {
            return $;
        }
    }

}

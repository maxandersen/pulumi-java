// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.awsnative.groundstation.inputs.ConfigEirp;
import com.pulumi.awsnative.groundstation.inputs.ConfigUplinkSpectrumConfig;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigAntennaUplinkConfig extends com.pulumi.resources.InvokeArgs {

    public static final ConfigAntennaUplinkConfig Empty = new ConfigAntennaUplinkConfig();

    @Import(name="spectrumConfig")
    private @Nullable ConfigUplinkSpectrumConfig spectrumConfig;

    public Optional<ConfigUplinkSpectrumConfig> spectrumConfig() {
        return Optional.ofNullable(this.spectrumConfig);
    }

    @Import(name="targetEirp")
    private @Nullable ConfigEirp targetEirp;

    public Optional<ConfigEirp> targetEirp() {
        return Optional.ofNullable(this.targetEirp);
    }

    @Import(name="transmitDisabled")
    private @Nullable Boolean transmitDisabled;

    public Optional<Boolean> transmitDisabled() {
        return Optional.ofNullable(this.transmitDisabled);
    }

    private ConfigAntennaUplinkConfig() {}

    private ConfigAntennaUplinkConfig(ConfigAntennaUplinkConfig $) {
        this.spectrumConfig = $.spectrumConfig;
        this.targetEirp = $.targetEirp;
        this.transmitDisabled = $.transmitDisabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigAntennaUplinkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigAntennaUplinkConfig $;

        public Builder() {
            $ = new ConfigAntennaUplinkConfig();
        }

        public Builder(ConfigAntennaUplinkConfig defaults) {
            $ = new ConfigAntennaUplinkConfig(Objects.requireNonNull(defaults));
        }

        public Builder spectrumConfig(@Nullable ConfigUplinkSpectrumConfig spectrumConfig) {
            $.spectrumConfig = spectrumConfig;
            return this;
        }

        public Builder targetEirp(@Nullable ConfigEirp targetEirp) {
            $.targetEirp = targetEirp;
            return this;
        }

        public Builder transmitDisabled(@Nullable Boolean transmitDisabled) {
            $.transmitDisabled = transmitDisabled;
            return this;
        }

        public ConfigAntennaUplinkConfig build() {
            return $;
        }
    }

}

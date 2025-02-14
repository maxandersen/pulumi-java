// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.awsnative.groundstation.enums.ConfigBandwidthUnits;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigFrequencyBandwidthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigFrequencyBandwidthArgs Empty = new ConfigFrequencyBandwidthArgs();

    @Import(name="units")
    private @Nullable Output<ConfigBandwidthUnits> units;

    public Optional<Output<ConfigBandwidthUnits>> units() {
        return Optional.ofNullable(this.units);
    }

    @Import(name="value")
    private @Nullable Output<Double> value;

    public Optional<Output<Double>> value() {
        return Optional.ofNullable(this.value);
    }

    private ConfigFrequencyBandwidthArgs() {}

    private ConfigFrequencyBandwidthArgs(ConfigFrequencyBandwidthArgs $) {
        this.units = $.units;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigFrequencyBandwidthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigFrequencyBandwidthArgs $;

        public Builder() {
            $ = new ConfigFrequencyBandwidthArgs();
        }

        public Builder(ConfigFrequencyBandwidthArgs defaults) {
            $ = new ConfigFrequencyBandwidthArgs(Objects.requireNonNull(defaults));
        }

        public Builder units(@Nullable Output<ConfigBandwidthUnits> units) {
            $.units = units;
            return this;
        }

        public Builder units(ConfigBandwidthUnits units) {
            return units(Output.of(units));
        }

        public Builder value(@Nullable Output<Double> value) {
            $.value = value;
            return this;
        }

        public Builder value(Double value) {
            return value(Output.of(value));
        }

        public ConfigFrequencyBandwidthArgs build() {
            return $;
        }
    }

}

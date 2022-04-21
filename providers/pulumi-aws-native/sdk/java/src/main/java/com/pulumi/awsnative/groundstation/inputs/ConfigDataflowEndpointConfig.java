// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigDataflowEndpointConfig extends com.pulumi.resources.InvokeArgs {

    public static final ConfigDataflowEndpointConfig Empty = new ConfigDataflowEndpointConfig();

    @Import(name="dataflowEndpointName")
    private @Nullable String dataflowEndpointName;

    public Optional<String> dataflowEndpointName() {
        return Optional.ofNullable(this.dataflowEndpointName);
    }

    @Import(name="dataflowEndpointRegion")
    private @Nullable String dataflowEndpointRegion;

    public Optional<String> dataflowEndpointRegion() {
        return Optional.ofNullable(this.dataflowEndpointRegion);
    }

    private ConfigDataflowEndpointConfig() {}

    private ConfigDataflowEndpointConfig(ConfigDataflowEndpointConfig $) {
        this.dataflowEndpointName = $.dataflowEndpointName;
        this.dataflowEndpointRegion = $.dataflowEndpointRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigDataflowEndpointConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigDataflowEndpointConfig $;

        public Builder() {
            $ = new ConfigDataflowEndpointConfig();
        }

        public Builder(ConfigDataflowEndpointConfig defaults) {
            $ = new ConfigDataflowEndpointConfig(Objects.requireNonNull(defaults));
        }

        public Builder dataflowEndpointName(@Nullable String dataflowEndpointName) {
            $.dataflowEndpointName = dataflowEndpointName;
            return this;
        }

        public Builder dataflowEndpointRegion(@Nullable String dataflowEndpointRegion) {
            $.dataflowEndpointRegion = dataflowEndpointRegion;
            return this;
        }

        public ConfigDataflowEndpointConfig build() {
            return $;
        }
    }

}

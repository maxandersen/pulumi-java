// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigMap {
    private final @Nullable String config;

    @CustomType.Constructor
    private ConfigMap(@CustomType.Parameter("config") @Nullable String config) {
        this.config = config;
    }

    public Optional<String> config() {
        return Optional.ofNullable(this.config);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String config;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
        }

        public Builder config(@Nullable String config) {
            this.config = config;
            return this;
        }        public ConfigMap build() {
            return new ConfigMap(config);
        }
    }
}

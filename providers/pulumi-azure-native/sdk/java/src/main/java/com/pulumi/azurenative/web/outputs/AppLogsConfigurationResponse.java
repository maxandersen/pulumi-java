// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.LogAnalyticsConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppLogsConfigurationResponse {
    private final @Nullable String destination;
    private final @Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration;

    @CustomType.Constructor
    private AppLogsConfigurationResponse(
        @CustomType.Parameter("destination") @Nullable String destination,
        @CustomType.Parameter("logAnalyticsConfiguration") @Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration) {
        this.destination = destination;
        this.logAnalyticsConfiguration = logAnalyticsConfiguration;
    }

    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }
    public Optional<LogAnalyticsConfigurationResponse> logAnalyticsConfiguration() {
        return Optional.ofNullable(this.logAnalyticsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppLogsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AppLogsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.logAnalyticsConfiguration = defaults.logAnalyticsConfiguration;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }
        public Builder logAnalyticsConfiguration(@Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration) {
            this.logAnalyticsConfiguration = logAnalyticsConfiguration;
            return this;
        }        public AppLogsConfigurationResponse build() {
            return new AppLogsConfigurationResponse(destination, logAnalyticsConfiguration);
        }
    }
}

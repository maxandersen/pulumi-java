// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis.outputs;

import io.pulumi.azurenative.changeanalysis.outputs.NotificationSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationProfileResourcePropertiesResponse {
    /**
     * Settings of change notification configuration for a subscription.
     * 
     */
    private final @Nullable NotificationSettingsResponse notifications;

    @CustomType.Constructor
    private ConfigurationProfileResourcePropertiesResponse(@CustomType.Parameter("notifications") @Nullable NotificationSettingsResponse notifications) {
        this.notifications = notifications;
    }

    /**
     * Settings of change notification configuration for a subscription.
     * 
    */
    public Optional<NotificationSettingsResponse> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NotificationSettingsResponse notifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifications = defaults.notifications;
        }

        public Builder notifications(@Nullable NotificationSettingsResponse notifications) {
            this.notifications = notifications;
            return this;
        }        public ConfigurationProfileResourcePropertiesResponse build() {
            return new ConfigurationProfileResourcePropertiesResponse(notifications);
        }
    }
}

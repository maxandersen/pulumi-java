// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityContactPropertiesResponseAlertNotifications {
    /**
     * @return Defines the minimal alert severity which will be sent as email notifications
     * 
     */
    private final @Nullable String minimalSeverity;
    /**
     * @return Defines if email notifications will be sent about new security alerts
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private SecurityContactPropertiesResponseAlertNotifications(
        @CustomType.Parameter("minimalSeverity") @Nullable String minimalSeverity,
        @CustomType.Parameter("state") @Nullable String state) {
        this.minimalSeverity = minimalSeverity;
        this.state = state;
    }

    /**
     * @return Defines the minimal alert severity which will be sent as email notifications
     * 
     */
    public Optional<String> minimalSeverity() {
        return Optional.ofNullable(this.minimalSeverity);
    }
    /**
     * @return Defines if email notifications will be sent about new security alerts
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactPropertiesResponseAlertNotifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String minimalSeverity;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactPropertiesResponseAlertNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimalSeverity = defaults.minimalSeverity;
    	      this.state = defaults.state;
        }

        public Builder minimalSeverity(@Nullable String minimalSeverity) {
            this.minimalSeverity = minimalSeverity;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public SecurityContactPropertiesResponseAlertNotifications build() {
            return new SecurityContactPropertiesResponseAlertNotifications(minimalSeverity, state);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationSettingsResponse {
    /**
     * The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
     */
    private final @Nullable String emailRecipient;
    /**
     * The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
     */
    private final @Nullable String notificationLocale;
    /**
     * If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * 
     */
    private final @Nullable String status;
    /**
     * Time in minutes before event at which notification will be sent.
     * 
     */
    private final @Nullable Integer timeInMinutes;
    /**
     * The webhook URL to which the notification will be sent.
     * 
     */
    private final @Nullable String webhookUrl;

    @CustomType.Constructor
    private NotificationSettingsResponse(
        @CustomType.Parameter("emailRecipient") @Nullable String emailRecipient,
        @CustomType.Parameter("notificationLocale") @Nullable String notificationLocale,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("timeInMinutes") @Nullable Integer timeInMinutes,
        @CustomType.Parameter("webhookUrl") @Nullable String webhookUrl) {
        this.emailRecipient = emailRecipient;
        this.notificationLocale = notificationLocale;
        this.status = status;
        this.timeInMinutes = timeInMinutes;
        this.webhookUrl = webhookUrl;
    }

    /**
     * The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
    */
    public Optional<String> emailRecipient() {
        return Optional.ofNullable(this.emailRecipient);
    }
    /**
     * The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
    */
    public Optional<String> notificationLocale() {
        return Optional.ofNullable(this.notificationLocale);
    }
    /**
     * If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Time in minutes before event at which notification will be sent.
     * 
    */
    public Optional<Integer> timeInMinutes() {
        return Optional.ofNullable(this.timeInMinutes);
    }
    /**
     * The webhook URL to which the notification will be sent.
     * 
    */
    public Optional<String> webhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailRecipient;
        private @Nullable String notificationLocale;
        private @Nullable String status;
        private @Nullable Integer timeInMinutes;
        private @Nullable String webhookUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailRecipient = defaults.emailRecipient;
    	      this.notificationLocale = defaults.notificationLocale;
    	      this.status = defaults.status;
    	      this.timeInMinutes = defaults.timeInMinutes;
    	      this.webhookUrl = defaults.webhookUrl;
        }

        public Builder emailRecipient(@Nullable String emailRecipient) {
            this.emailRecipient = emailRecipient;
            return this;
        }
        public Builder notificationLocale(@Nullable String notificationLocale) {
            this.notificationLocale = notificationLocale;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder timeInMinutes(@Nullable Integer timeInMinutes) {
            this.timeInMinutes = timeInMinutes;
            return this;
        }
        public Builder webhookUrl(@Nullable String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }        public NotificationSettingsResponse build() {
            return new NotificationSettingsResponse(emailRecipient, notificationLocale, status, timeInMinutes, webhookUrl);
        }
    }
}

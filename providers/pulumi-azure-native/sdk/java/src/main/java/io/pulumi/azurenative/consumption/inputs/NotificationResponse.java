// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The notification associated with a budget.
 * 
 */
public final class NotificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationResponse Empty = new NotificationResponse();

    /**
     * Email addresses to send the budget notification to when the threshold is exceeded. Must have at least one contact email or contact group specified at the Subscription or Resource Group scopes. All other scopes must have at least one contact email specified.
     * 
     */
    @Import(name="contactEmails", required=true)
      private final List<String> contactEmails;

    public List<String> contactEmails() {
        return this.contactEmails;
    }

    /**
     * Action groups to send the budget notification to when the threshold is exceeded. Must be provided as a fully qualified Azure resource id. Only supported at Subscription or Resource Group scopes.
     * 
     */
    @Import(name="contactGroups")
      private final @Nullable List<String> contactGroups;

    public List<String> contactGroups() {
        return this.contactGroups == null ? List.of() : this.contactGroups;
    }

    /**
     * Contact roles to send the budget notification to when the threshold is exceeded.
     * 
     */
    @Import(name="contactRoles")
      private final @Nullable List<String> contactRoles;

    public List<String> contactRoles() {
        return this.contactRoles == null ? List.of() : this.contactRoles;
    }

    /**
     * The notification is enabled or not.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Language in which the recipient will receive the notification
     * 
     */
    @Import(name="locale")
      private final @Nullable String locale;

    public Optional<String> locale() {
        return this.locale == null ? Optional.empty() : Optional.ofNullable(this.locale);
    }

    /**
     * The comparison operator.
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String operator() {
        return this.operator;
    }

    /**
     * Threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     * 
     */
    @Import(name="threshold", required=true)
      private final Double threshold;

    public Double threshold() {
        return this.threshold;
    }

    /**
     * The type of threshold
     * 
     */
    @Import(name="thresholdType")
      private final @Nullable String thresholdType;

    public Optional<String> thresholdType() {
        return this.thresholdType == null ? Optional.empty() : Optional.ofNullable(this.thresholdType);
    }

    public NotificationResponse(
        List<String> contactEmails,
        @Nullable List<String> contactGroups,
        @Nullable List<String> contactRoles,
        Boolean enabled,
        @Nullable String locale,
        String operator,
        Double threshold,
        @Nullable String thresholdType) {
        this.contactEmails = Objects.requireNonNull(contactEmails, "expected parameter 'contactEmails' to be non-null");
        this.contactGroups = contactGroups;
        this.contactRoles = contactRoles;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.locale = locale;
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.thresholdType = thresholdType == null ? "Actual" : thresholdType;
    }

    private NotificationResponse() {
        this.contactEmails = List.of();
        this.contactGroups = List.of();
        this.contactRoles = List.of();
        this.enabled = null;
        this.locale = null;
        this.operator = null;
        this.threshold = null;
        this.thresholdType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> contactEmails;
        private @Nullable List<String> contactGroups;
        private @Nullable List<String> contactRoles;
        private Boolean enabled;
        private @Nullable String locale;
        private String operator;
        private Double threshold;
        private @Nullable String thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactEmails = defaults.contactEmails;
    	      this.contactGroups = defaults.contactGroups;
    	      this.contactRoles = defaults.contactRoles;
    	      this.enabled = defaults.enabled;
    	      this.locale = defaults.locale;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder contactEmails(List<String> contactEmails) {
            this.contactEmails = Objects.requireNonNull(contactEmails);
            return this;
        }
        public Builder contactEmails(String... contactEmails) {
            return contactEmails(List.of(contactEmails));
        }
        public Builder contactGroups(@Nullable List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public Builder contactGroups(String... contactGroups) {
            return contactGroups(List.of(contactGroups));
        }
        public Builder contactRoles(@Nullable List<String> contactRoles) {
            this.contactRoles = contactRoles;
            return this;
        }
        public Builder contactRoles(String... contactRoles) {
            return contactRoles(List.of(contactRoles));
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder locale(@Nullable String locale) {
            this.locale = locale;
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder thresholdType(@Nullable String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }        public NotificationResponse build() {
            return new NotificationResponse(contactEmails, contactGroups, contactRoles, enabled, locale, operator, threshold, thresholdType);
        }
    }
}

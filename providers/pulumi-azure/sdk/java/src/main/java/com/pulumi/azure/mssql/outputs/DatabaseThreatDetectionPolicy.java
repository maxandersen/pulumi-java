// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseThreatDetectionPolicy {
    /**
     * @return Specifies a list of alerts which should be disabled. Possible values include `Access_Anomaly`, `Sql_Injection` and `Sql_Injection_Vulnerability`.
     * 
     */
    private final @Nullable List<String> disabledAlerts;
    /**
     * @return Should the account administrators be emailed when this alert is triggered?
     * 
     */
    private final @Nullable String emailAccountAdmins;
    /**
     * @return A list of email addresses which alerts should be sent to.
     * 
     */
    private final @Nullable List<String> emailAddresses;
    /**
     * @return Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    private final @Nullable Integer retentionDays;
    /**
     * @return The State of the Policy. Possible values are `Enabled`, `Disabled` or `New`.
     * 
     */
    private final @Nullable String state;
    /**
     * @return Specifies the identifier key of the Threat Detection audit storage account. Required if `state` is `Enabled`.
     * 
     */
    private final @Nullable String storageAccountAccessKey;
    /**
     * @return Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs. Required if `state` is `Enabled`.
     * 
     */
    private final @Nullable String storageEndpoint;

    @CustomType.Constructor
    private DatabaseThreatDetectionPolicy(
        @CustomType.Parameter("disabledAlerts") @Nullable List<String> disabledAlerts,
        @CustomType.Parameter("emailAccountAdmins") @Nullable String emailAccountAdmins,
        @CustomType.Parameter("emailAddresses") @Nullable List<String> emailAddresses,
        @CustomType.Parameter("retentionDays") @Nullable Integer retentionDays,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("storageAccountAccessKey") @Nullable String storageAccountAccessKey,
        @CustomType.Parameter("storageEndpoint") @Nullable String storageEndpoint) {
        this.disabledAlerts = disabledAlerts;
        this.emailAccountAdmins = emailAccountAdmins;
        this.emailAddresses = emailAddresses;
        this.retentionDays = retentionDays;
        this.state = state;
        this.storageAccountAccessKey = storageAccountAccessKey;
        this.storageEndpoint = storageEndpoint;
    }

    /**
     * @return Specifies a list of alerts which should be disabled. Possible values include `Access_Anomaly`, `Sql_Injection` and `Sql_Injection_Vulnerability`.
     * 
     */
    public List<String> disabledAlerts() {
        return this.disabledAlerts == null ? List.of() : this.disabledAlerts;
    }
    /**
     * @return Should the account administrators be emailed when this alert is triggered?
     * 
     */
    public Optional<String> emailAccountAdmins() {
        return Optional.ofNullable(this.emailAccountAdmins);
    }
    /**
     * @return A list of email addresses which alerts should be sent to.
     * 
     */
    public List<String> emailAddresses() {
        return this.emailAddresses == null ? List.of() : this.emailAddresses;
    }
    /**
     * @return Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    public Optional<Integer> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }
    /**
     * @return The State of the Policy. Possible values are `Enabled`, `Disabled` or `New`.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Specifies the identifier key of the Threat Detection audit storage account. Required if `state` is `Enabled`.
     * 
     */
    public Optional<String> storageAccountAccessKey() {
        return Optional.ofNullable(this.storageAccountAccessKey);
    }
    /**
     * @return Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs. Required if `state` is `Enabled`.
     * 
     */
    public Optional<String> storageEndpoint() {
        return Optional.ofNullable(this.storageEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseThreatDetectionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> disabledAlerts;
        private @Nullable String emailAccountAdmins;
        private @Nullable List<String> emailAddresses;
        private @Nullable Integer retentionDays;
        private @Nullable String state;
        private @Nullable String storageAccountAccessKey;
        private @Nullable String storageEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseThreatDetectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledAlerts = defaults.disabledAlerts;
    	      this.emailAccountAdmins = defaults.emailAccountAdmins;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.retentionDays = defaults.retentionDays;
    	      this.state = defaults.state;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageEndpoint = defaults.storageEndpoint;
        }

        public Builder disabledAlerts(@Nullable List<String> disabledAlerts) {
            this.disabledAlerts = disabledAlerts;
            return this;
        }
        public Builder disabledAlerts(String... disabledAlerts) {
            return disabledAlerts(List.of(disabledAlerts));
        }
        public Builder emailAccountAdmins(@Nullable String emailAccountAdmins) {
            this.emailAccountAdmins = emailAccountAdmins;
            return this;
        }
        public Builder emailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder storageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }
        public Builder storageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }        public DatabaseThreatDetectionPolicy build() {
            return new DatabaseThreatDetectionPolicy(disabledAlerts, emailAccountAdmins, emailAddresses, retentionDays, state, storageAccountAccessKey, storageEndpoint);
        }
    }
}

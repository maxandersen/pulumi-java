// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.azurenative.datadog.outputs.DatadogOrganizationPropertiesResponse;
import io.pulumi.azurenative.datadog.outputs.UserInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitorPropertiesResponse {
    /**
     * Datadog organization properties
     * 
     */
    private final @Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties;
    private final String liftrResourceCategory;
    /**
     * The priority of the resource.
     * 
     */
    private final Integer liftrResourcePreference;
    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    private final String marketplaceSubscriptionStatus;
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    private final @Nullable String monitoringStatus;
    private final String provisioningState;
    /**
     * User info
     * 
     */
    private final @Nullable UserInfoResponse userInfo;

    @CustomType.Constructor
    private MonitorPropertiesResponse(
        @CustomType.Parameter("datadogOrganizationProperties") @Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties,
        @CustomType.Parameter("liftrResourceCategory") String liftrResourceCategory,
        @CustomType.Parameter("liftrResourcePreference") Integer liftrResourcePreference,
        @CustomType.Parameter("marketplaceSubscriptionStatus") String marketplaceSubscriptionStatus,
        @CustomType.Parameter("monitoringStatus") @Nullable String monitoringStatus,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("userInfo") @Nullable UserInfoResponse userInfo) {
        this.datadogOrganizationProperties = datadogOrganizationProperties;
        this.liftrResourceCategory = liftrResourceCategory;
        this.liftrResourcePreference = liftrResourcePreference;
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        this.monitoringStatus = monitoringStatus;
        this.provisioningState = provisioningState;
        this.userInfo = userInfo;
    }

    /**
     * Datadog organization properties
     * 
    */
    public Optional<DatadogOrganizationPropertiesResponse> datadogOrganizationProperties() {
        return Optional.ofNullable(this.datadogOrganizationProperties);
    }
    public String liftrResourceCategory() {
        return this.liftrResourceCategory;
    }
    /**
     * The priority of the resource.
     * 
    */
    public Integer liftrResourcePreference() {
        return this.liftrResourcePreference;
    }
    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
    */
    public String marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
    */
    public Optional<String> monitoringStatus() {
        return Optional.ofNullable(this.monitoringStatus);
    }
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * User info
     * 
    */
    public Optional<UserInfoResponse> userInfo() {
        return Optional.ofNullable(this.userInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties;
        private String liftrResourceCategory;
        private Integer liftrResourcePreference;
        private String marketplaceSubscriptionStatus;
        private @Nullable String monitoringStatus;
        private String provisioningState;
        private @Nullable UserInfoResponse userInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadogOrganizationProperties = defaults.datadogOrganizationProperties;
    	      this.liftrResourceCategory = defaults.liftrResourceCategory;
    	      this.liftrResourcePreference = defaults.liftrResourcePreference;
    	      this.marketplaceSubscriptionStatus = defaults.marketplaceSubscriptionStatus;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.provisioningState = defaults.provisioningState;
    	      this.userInfo = defaults.userInfo;
        }

        public Builder datadogOrganizationProperties(@Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties) {
            this.datadogOrganizationProperties = datadogOrganizationProperties;
            return this;
        }
        public Builder liftrResourceCategory(String liftrResourceCategory) {
            this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory);
            return this;
        }
        public Builder liftrResourcePreference(Integer liftrResourcePreference) {
            this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference);
            return this;
        }
        public Builder marketplaceSubscriptionStatus(String marketplaceSubscriptionStatus) {
            this.marketplaceSubscriptionStatus = Objects.requireNonNull(marketplaceSubscriptionStatus);
            return this;
        }
        public Builder monitoringStatus(@Nullable String monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder userInfo(@Nullable UserInfoResponse userInfo) {
            this.userInfo = userInfo;
            return this;
        }        public MonitorPropertiesResponse build() {
            return new MonitorPropertiesResponse(datadogOrganizationProperties, liftrResourceCategory, liftrResourcePreference, marketplaceSubscriptionStatus, monitoringStatus, provisioningState, userInfo);
        }
    }
}

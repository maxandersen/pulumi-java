// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.outputs;

import com.pulumi.azurenative.logz.outputs.LogzOrganizationPropertiesResponse;
import com.pulumi.azurenative.logz.outputs.PlanDataResponse;
import com.pulumi.azurenative.logz.outputs.UserInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitorPropertiesResponse {
    private final String liftrResourceCategory;
    /**
     * The priority of the resource.
     * 
     */
    private final Integer liftrResourcePreference;
    private final @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties;
    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    private final @Nullable String marketplaceSubscriptionStatus;
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    private final @Nullable String monitoringStatus;
    private final @Nullable PlanDataResponse planData;
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    private final String provisioningState;
    private final @Nullable UserInfoResponse userInfo;

    @CustomType.Constructor
    private MonitorPropertiesResponse(
        @CustomType.Parameter("liftrResourceCategory") String liftrResourceCategory,
        @CustomType.Parameter("liftrResourcePreference") Integer liftrResourcePreference,
        @CustomType.Parameter("logzOrganizationProperties") @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties,
        @CustomType.Parameter("marketplaceSubscriptionStatus") @Nullable String marketplaceSubscriptionStatus,
        @CustomType.Parameter("monitoringStatus") @Nullable String monitoringStatus,
        @CustomType.Parameter("planData") @Nullable PlanDataResponse planData,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("userInfo") @Nullable UserInfoResponse userInfo) {
        this.liftrResourceCategory = liftrResourceCategory;
        this.liftrResourcePreference = liftrResourcePreference;
        this.logzOrganizationProperties = logzOrganizationProperties;
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        this.monitoringStatus = monitoringStatus;
        this.planData = planData;
        this.provisioningState = provisioningState;
        this.userInfo = userInfo;
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
    public Optional<LogzOrganizationPropertiesResponse> logzOrganizationProperties() {
        return Optional.ofNullable(this.logzOrganizationProperties);
    }
    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
    */
    public Optional<String> marketplaceSubscriptionStatus() {
        return Optional.ofNullable(this.marketplaceSubscriptionStatus);
    }
    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
    */
    public Optional<String> monitoringStatus() {
        return Optional.ofNullable(this.monitoringStatus);
    }
    public Optional<PlanDataResponse> planData() {
        return Optional.ofNullable(this.planData);
    }
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
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
        private String liftrResourceCategory;
        private Integer liftrResourcePreference;
        private @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties;
        private @Nullable String marketplaceSubscriptionStatus;
        private @Nullable String monitoringStatus;
        private @Nullable PlanDataResponse planData;
        private String provisioningState;
        private @Nullable UserInfoResponse userInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.liftrResourceCategory = defaults.liftrResourceCategory;
    	      this.liftrResourcePreference = defaults.liftrResourcePreference;
    	      this.logzOrganizationProperties = defaults.logzOrganizationProperties;
    	      this.marketplaceSubscriptionStatus = defaults.marketplaceSubscriptionStatus;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.planData = defaults.planData;
    	      this.provisioningState = defaults.provisioningState;
    	      this.userInfo = defaults.userInfo;
        }

        public Builder liftrResourceCategory(String liftrResourceCategory) {
            this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory);
            return this;
        }
        public Builder liftrResourcePreference(Integer liftrResourcePreference) {
            this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference);
            return this;
        }
        public Builder logzOrganizationProperties(@Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties) {
            this.logzOrganizationProperties = logzOrganizationProperties;
            return this;
        }
        public Builder marketplaceSubscriptionStatus(@Nullable String marketplaceSubscriptionStatus) {
            this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
            return this;
        }
        public Builder monitoringStatus(@Nullable String monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }
        public Builder planData(@Nullable PlanDataResponse planData) {
            this.planData = planData;
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
            return new MonitorPropertiesResponse(liftrResourceCategory, liftrResourcePreference, logzOrganizationProperties, marketplaceSubscriptionStatus, monitoringStatus, planData, provisioningState, userInfo);
        }
    }
}

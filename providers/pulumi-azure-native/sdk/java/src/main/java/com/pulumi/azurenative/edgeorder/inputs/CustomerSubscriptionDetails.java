// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.CustomerSubscriptionRegisteredFeatures;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Holds Customer subscription details. Clients can display available products to unregistered customers by explicitly passing subscription details
 * 
 */
public final class CustomerSubscriptionDetails extends com.pulumi.resources.InvokeArgs {

    public static final CustomerSubscriptionDetails Empty = new CustomerSubscriptionDetails();

    /**
     * Location placement Id of a subscription
     * 
     */
    @Import(name="locationPlacementId")
      private final @Nullable String locationPlacementId;

    public Optional<String> locationPlacementId() {
        return this.locationPlacementId == null ? Optional.empty() : Optional.ofNullable(this.locationPlacementId);
    }

    /**
     * Quota ID of a subscription
     * 
     */
    @Import(name="quotaId", required=true)
      private final String quotaId;

    public String quotaId() {
        return this.quotaId;
    }

    /**
     * List of registered feature flags for subscription
     * 
     */
    @Import(name="registeredFeatures")
      private final @Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures;

    public List<CustomerSubscriptionRegisteredFeatures> registeredFeatures() {
        return this.registeredFeatures == null ? List.of() : this.registeredFeatures;
    }

    public CustomerSubscriptionDetails(
        @Nullable String locationPlacementId,
        String quotaId,
        @Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures) {
        this.locationPlacementId = locationPlacementId;
        this.quotaId = Objects.requireNonNull(quotaId, "expected parameter 'quotaId' to be non-null");
        this.registeredFeatures = registeredFeatures;
    }

    private CustomerSubscriptionDetails() {
        this.locationPlacementId = null;
        this.quotaId = null;
        this.registeredFeatures = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerSubscriptionDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String locationPlacementId;
        private String quotaId;
        private @Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerSubscriptionDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationPlacementId = defaults.locationPlacementId;
    	      this.quotaId = defaults.quotaId;
    	      this.registeredFeatures = defaults.registeredFeatures;
        }

        public Builder locationPlacementId(@Nullable String locationPlacementId) {
            this.locationPlacementId = locationPlacementId;
            return this;
        }
        public Builder quotaId(String quotaId) {
            this.quotaId = Objects.requireNonNull(quotaId);
            return this;
        }
        public Builder registeredFeatures(@Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures) {
            this.registeredFeatures = registeredFeatures;
            return this;
        }
        public Builder registeredFeatures(CustomerSubscriptionRegisteredFeatures... registeredFeatures) {
            return registeredFeatures(List.of(registeredFeatures));
        }        public CustomerSubscriptionDetails build() {
            return new CustomerSubscriptionDetails(locationPlacementId, quotaId, registeredFeatures);
        }
    }
}

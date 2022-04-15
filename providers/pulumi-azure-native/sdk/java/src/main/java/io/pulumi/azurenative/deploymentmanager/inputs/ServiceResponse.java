// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.ServiceUnitResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a service.
 * 
 */
public final class ServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceResponse Empty = new ServiceResponse();

    /**
     * Name of the service.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The detailed information about the units that make up the service.
     * 
     */
    @Import(name="serviceUnits")
      private final @Nullable List<ServiceUnitResponse> serviceUnits;

    public List<ServiceUnitResponse> serviceUnits() {
        return this.serviceUnits == null ? List.of() : this.serviceUnits;
    }

    /**
     * The Azure location to which the resources in the service belong to or should be deployed to.
     * 
     */
    @Import(name="targetLocation", required=true)
      private final String targetLocation;

    public String targetLocation() {
        return this.targetLocation;
    }

    /**
     * The subscription to which the resources in the service belong to or should be deployed to.
     * 
     */
    @Import(name="targetSubscriptionId", required=true)
      private final String targetSubscriptionId;

    public String targetSubscriptionId() {
        return this.targetSubscriptionId;
    }

    public ServiceResponse(
        @Nullable String name,
        @Nullable List<ServiceUnitResponse> serviceUnits,
        String targetLocation,
        String targetSubscriptionId) {
        this.name = name;
        this.serviceUnits = serviceUnits;
        this.targetLocation = Objects.requireNonNull(targetLocation, "expected parameter 'targetLocation' to be non-null");
        this.targetSubscriptionId = Objects.requireNonNull(targetSubscriptionId, "expected parameter 'targetSubscriptionId' to be non-null");
    }

    private ServiceResponse() {
        this.name = null;
        this.serviceUnits = List.of();
        this.targetLocation = null;
        this.targetSubscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<ServiceUnitResponse> serviceUnits;
        private String targetLocation;
        private String targetSubscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.serviceUnits = defaults.serviceUnits;
    	      this.targetLocation = defaults.targetLocation;
    	      this.targetSubscriptionId = defaults.targetSubscriptionId;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder serviceUnits(@Nullable List<ServiceUnitResponse> serviceUnits) {
            this.serviceUnits = serviceUnits;
            return this;
        }
        public Builder serviceUnits(ServiceUnitResponse... serviceUnits) {
            return serviceUnits(List.of(serviceUnits));
        }
        public Builder targetLocation(String targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }
        public Builder targetSubscriptionId(String targetSubscriptionId) {
            this.targetSubscriptionId = Objects.requireNonNull(targetSubscriptionId);
            return this;
        }        public ServiceResponse build() {
            return new ServiceResponse(name, serviceUnits, targetLocation, targetSubscriptionId);
        }
    }
}

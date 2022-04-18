// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of the IoT hub.
 * 
 */
public final class IotHubDefinitionDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final IotHubDefinitionDescriptionResponse Empty = new IotHubDefinitionDescriptionResponse();

    /**
     * weight to apply for a given iot h.
     * 
     */
    @Import(name="allocationWeight")
      private final @Nullable Integer allocationWeight;

    public Optional<Integer> allocationWeight() {
        return this.allocationWeight == null ? Optional.empty() : Optional.ofNullable(this.allocationWeight);
    }

    /**
     * flag for applying allocationPolicy or not for a given iot hub.
     * 
     */
    @Import(name="applyAllocationPolicy")
      private final @Nullable Boolean applyAllocationPolicy;

    public Optional<Boolean> applyAllocationPolicy() {
        return this.applyAllocationPolicy == null ? Optional.empty() : Optional.ofNullable(this.applyAllocationPolicy);
    }

    /**
     * Connection string of the IoT hub.
     * 
     */
    @Import(name="connectionString", required=true)
      private final String connectionString;

    public String connectionString() {
        return this.connectionString;
    }

    /**
     * ARM region of the IoT hub.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    /**
     * Host name of the IoT hub.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public IotHubDefinitionDescriptionResponse(
        @Nullable Integer allocationWeight,
        @Nullable Boolean applyAllocationPolicy,
        String connectionString,
        String location,
        String name) {
        this.allocationWeight = allocationWeight;
        this.applyAllocationPolicy = applyAllocationPolicy;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private IotHubDefinitionDescriptionResponse() {
        this.allocationWeight = null;
        this.applyAllocationPolicy = null;
        this.connectionString = null;
        this.location = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubDefinitionDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocationWeight;
        private @Nullable Boolean applyAllocationPolicy;
        private String connectionString;
        private String location;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubDefinitionDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationWeight = defaults.allocationWeight;
    	      this.applyAllocationPolicy = defaults.applyAllocationPolicy;
    	      this.connectionString = defaults.connectionString;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        public Builder allocationWeight(@Nullable Integer allocationWeight) {
            this.allocationWeight = allocationWeight;
            return this;
        }
        public Builder applyAllocationPolicy(@Nullable Boolean applyAllocationPolicy) {
            this.applyAllocationPolicy = applyAllocationPolicy;
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public IotHubDefinitionDescriptionResponse build() {
            return new IotHubDefinitionDescriptionResponse(allocationWeight, applyAllocationPolicy, connectionString, location, name);
        }
    }
}

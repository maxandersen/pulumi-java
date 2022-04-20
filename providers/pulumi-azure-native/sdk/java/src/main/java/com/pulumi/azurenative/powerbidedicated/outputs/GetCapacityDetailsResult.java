// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbidedicated.outputs;

import com.pulumi.azurenative.powerbidedicated.outputs.CapacitySkuResponse;
import com.pulumi.azurenative.powerbidedicated.outputs.DedicatedCapacityAdministratorsResponse;
import com.pulumi.azurenative.powerbidedicated.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCapacityDetailsResult {
    /**
     * A collection of Dedicated capacity administrators
     * 
     */
    private final @Nullable DedicatedCapacityAdministratorsResponse administration;
    /**
     * Capacity name
     * 
     */
    private final String friendlyName;
    /**
     * An identifier that represents the PowerBI Dedicated resource.
     * 
     */
    private final String id;
    /**
     * Location of the PowerBI Dedicated resource.
     * 
     */
    private final String location;
    /**
     * Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
     * 
     */
    private final @Nullable String mode;
    /**
     * The name of the PowerBI Dedicated resource.
     * 
     */
    private final String name;
    /**
     * The current deployment state of PowerBI Dedicated resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * The SKU of the PowerBI Dedicated capacity resource.
     * 
     */
    private final CapacitySkuResponse sku;
    /**
     * The current state of PowerBI Dedicated resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    private final String state;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final @Nullable SystemDataResponse systemData;
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Tenant ID for the capacity. Used for creating Pro Plus capacity.
     * 
     */
    private final String tenantId;
    /**
     * The type of the PowerBI Dedicated resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCapacityDetailsResult(
        @CustomType.Parameter("administration") @Nullable DedicatedCapacityAdministratorsResponse administration,
        @CustomType.Parameter("friendlyName") String friendlyName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") CapacitySkuResponse sku,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemData") @Nullable SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.administration = administration;
        this.friendlyName = friendlyName;
        this.id = id;
        this.location = location;
        this.mode = mode;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.state = state;
        this.systemData = systemData;
        this.tags = tags;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * A collection of Dedicated capacity administrators
     * 
    */
    public Optional<DedicatedCapacityAdministratorsResponse> administration() {
        return Optional.ofNullable(this.administration);
    }
    /**
     * Capacity name
     * 
    */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * An identifier that represents the PowerBI Dedicated resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Location of the PowerBI Dedicated resource.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
     * 
    */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The name of the PowerBI Dedicated resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The current deployment state of PowerBI Dedicated resource. The provisioningState is to indicate states for resource provisioning.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the PowerBI Dedicated capacity resource.
     * 
    */
    public CapacitySkuResponse sku() {
        return this.sku;
    }
    /**
     * The current state of PowerBI Dedicated resource. The state is to indicate more states outside of resource provisioning.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public Optional<SystemDataResponse> systemData() {
        return Optional.ofNullable(this.systemData);
    }
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Tenant ID for the capacity. Used for creating Pro Plus capacity.
     * 
    */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * The type of the PowerBI Dedicated resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DedicatedCapacityAdministratorsResponse administration;
        private String friendlyName;
        private String id;
        private String location;
        private @Nullable String mode;
        private String name;
        private String provisioningState;
        private CapacitySkuResponse sku;
        private String state;
        private @Nullable SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administration = defaults.administration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder administration(@Nullable DedicatedCapacityAdministratorsResponse administration) {
            this.administration = administration;
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sku(CapacitySkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemData(@Nullable SystemDataResponse systemData) {
            this.systemData = systemData;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCapacityDetailsResult build() {
            return new GetCapacityDetailsResult(administration, friendlyName, id, location, mode, name, provisioningState, sku, state, systemData, tags, tenantId, type);
        }
    }
}

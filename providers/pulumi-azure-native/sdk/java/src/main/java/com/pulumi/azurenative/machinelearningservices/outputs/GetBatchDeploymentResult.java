// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.BatchDeploymentResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBatchDeploymentResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Service identity associated with a resource.
     * 
     */
    private final @Nullable ResourceIdentityResponse identity;
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     * 
     */
    private final @Nullable String kind;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Additional attributes of the entity.
     * 
     */
    private final BatchDeploymentResponse properties;
    /**
     * System data associated with resource provider
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetBatchDeploymentResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ResourceIdentityResponse identity,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") BatchDeploymentResponse properties,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Service identity associated with a resource.
     * 
    */
    public Optional<ResourceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Additional attributes of the entity.
     * 
    */
    public BatchDeploymentResponse properties() {
        return this.properties;
    }
    /**
     * System data associated with resource provider
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBatchDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable String kind;
        private String location;
        private String name;
        private BatchDeploymentResponse properties;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBatchDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(BatchDeploymentResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetBatchDeploymentResult build() {
            return new GetBatchDeploymentResult(id, identity, kind, location, name, properties, systemData, tags, type);
        }
    }
}

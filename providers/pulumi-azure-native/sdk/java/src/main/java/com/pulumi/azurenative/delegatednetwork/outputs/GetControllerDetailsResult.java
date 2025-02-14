// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.delegatednetwork.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetControllerDetailsResult {
    /**
     * @return dnc application id should be used by customer to authenticate with dnc gateway.
     * 
     */
    private final String dncAppId;
    /**
     * @return dnc endpoint url that customers can use to connect to
     * 
     */
    private final String dncEndpoint;
    /**
     * @return tenant id of dnc application id
     * 
     */
    private final String dncTenantId;
    /**
     * @return An identifier that represents the resource.
     * 
     */
    private final String id;
    /**
     * @return Location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The current state of dnc controller resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource guid.
     * 
     */
    private final String resourceGuid;
    /**
     * @return The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetControllerDetailsResult(
        @CustomType.Parameter("dncAppId") String dncAppId,
        @CustomType.Parameter("dncEndpoint") String dncEndpoint,
        @CustomType.Parameter("dncTenantId") String dncTenantId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.dncAppId = dncAppId;
        this.dncEndpoint = dncEndpoint;
        this.dncTenantId = dncTenantId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return dnc application id should be used by customer to authenticate with dnc gateway.
     * 
     */
    public String dncAppId() {
        return this.dncAppId;
    }
    /**
     * @return dnc endpoint url that customers can use to connect to
     * 
     */
    public String dncEndpoint() {
        return this.dncEndpoint;
    }
    /**
     * @return tenant id of dnc application id
     * 
     */
    public String dncTenantId() {
        return this.dncTenantId;
    }
    /**
     * @return An identifier that represents the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Location of the resource.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current state of dnc controller resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource guid.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControllerDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dncAppId;
        private String dncEndpoint;
        private String dncTenantId;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetControllerDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dncAppId = defaults.dncAppId;
    	      this.dncEndpoint = defaults.dncEndpoint;
    	      this.dncTenantId = defaults.dncTenantId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder dncAppId(String dncAppId) {
            this.dncAppId = Objects.requireNonNull(dncAppId);
            return this;
        }
        public Builder dncEndpoint(String dncEndpoint) {
            this.dncEndpoint = Objects.requireNonNull(dncEndpoint);
            return this;
        }
        public Builder dncTenantId(String dncTenantId) {
            this.dncTenantId = Objects.requireNonNull(dncTenantId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
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
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetControllerDetailsResult build() {
            return new GetControllerDetailsResult(dncAppId, dncEndpoint, dncTenantId, id, location, name, provisioningState, resourceGuid, tags, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationSecurityGroupResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the application security group resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the application security group resource. It uniquely identifies a resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
     */
    private final String resourceGuid;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ApplicationSecurityGroupResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.tags = tags;
        this.type = type;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state of the application security group resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the application security group resource. It uniquely identifies a resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
    */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSecurityGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSecurityGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
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
        }        public ApplicationSecurityGroupResponse build() {
            return new ApplicationSecurityGroupResponse(etag, id, location, name, provisioningState, resourceGuid, tags, type);
        }
    }
}

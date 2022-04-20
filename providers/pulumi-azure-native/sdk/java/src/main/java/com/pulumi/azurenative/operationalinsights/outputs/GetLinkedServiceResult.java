// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLinkedServiceResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioning state of the linked service.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
     */
    private final @Nullable String resourceId;
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
    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
     */
    private final @Nullable String writeAccessResourceId;

    @CustomType.Constructor
    private GetLinkedServiceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("writeAccessResourceId") @Nullable String writeAccessResourceId) {
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceId = resourceId;
        this.tags = tags;
        this.type = type;
        this.writeAccessResourceId = writeAccessResourceId;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state of the linked service.
     * 
    */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
    */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
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
    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
    */
    public Optional<String> writeAccessResourceId() {
        return Optional.ofNullable(this.writeAccessResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable String resourceId;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String writeAccessResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceId = defaults.resourceId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.writeAccessResourceId = defaults.writeAccessResourceId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder writeAccessResourceId(@Nullable String writeAccessResourceId) {
            this.writeAccessResourceId = writeAccessResourceId;
            return this;
        }        public GetLinkedServiceResult build() {
            return new GetLinkedServiceResult(id, name, provisioningState, resourceId, tags, type, writeAccessResourceId);
        }
    }
}

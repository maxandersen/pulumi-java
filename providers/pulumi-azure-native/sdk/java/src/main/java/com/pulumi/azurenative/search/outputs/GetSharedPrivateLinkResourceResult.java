// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.outputs;

import com.pulumi.azurenative.search.outputs.SharedPrivateLinkResourcePropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSharedPrivateLinkResourceResult {
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
     * Describes the properties of a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * 
     */
    private final SharedPrivateLinkResourcePropertiesResponse properties;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSharedPrivateLinkResourceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") SharedPrivateLinkResourcePropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
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
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Describes the properties of a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * 
    */
    public SharedPrivateLinkResourcePropertiesResponse properties() {
        return this.properties;
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

    public static Builder builder(GetSharedPrivateLinkResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private SharedPrivateLinkResourcePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSharedPrivateLinkResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(SharedPrivateLinkResourcePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSharedPrivateLinkResourceResult build() {
            return new GetSharedPrivateLinkResourceResult(id, name, properties, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.GraphResourceGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.GraphResourceGetPropertiesResponseResource;
import io.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGraphResourceGraphResult {
    /**
     * The unique resource identifier of the ARM resource.
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the ARM resource.
     * 
     */
    private final String name;
    private final @Nullable GraphResourceGetPropertiesResponseOptions options;
    private final @Nullable GraphResourceGetPropertiesResponseResource resource;
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGraphResourceGraphResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ManagedServiceIdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("options") @Nullable GraphResourceGetPropertiesResponseOptions options,
        @CustomType.Parameter("resource") @Nullable GraphResourceGetPropertiesResponseResource resource,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.options = options;
        this.resource = resource;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The unique resource identifier of the ARM resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
    */
    public Optional<ManagedServiceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The location of the resource group to which the resource belongs.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the ARM resource.
     * 
    */
    public String name() {
        return this.name;
    }
    public Optional<GraphResourceGetPropertiesResponseOptions> options() {
        return Optional.ofNullable(this.options);
    }
    public Optional<GraphResourceGetPropertiesResponseResource> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGraphResourceGraphResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private @Nullable GraphResourceGetPropertiesResponseOptions options;
        private @Nullable GraphResourceGetPropertiesResponseResource resource;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGraphResourceGraphResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
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
        public Builder options(@Nullable GraphResourceGetPropertiesResponseOptions options) {
            this.options = options;
            return this;
        }
        public Builder resource(@Nullable GraphResourceGetPropertiesResponseResource resource) {
            this.resource = resource;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGraphResourceGraphResult build() {
            return new GetGraphResourceGraphResult(id, identity, location, name, options, resource, tags, type);
        }
    }
}

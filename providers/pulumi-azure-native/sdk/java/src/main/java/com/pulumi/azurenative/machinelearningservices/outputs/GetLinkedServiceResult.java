// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.LinkedServicePropsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLinkedServiceResult {
    /**
     * @return ResourceId of the link of the linked service.
     * 
     */
    private final String id;
    /**
     * @return Identity for the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return location of the linked service.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Friendly name of the linked service.
     * 
     */
    private final String name;
    /**
     * @return LinkedService specific properties.
     * 
     */
    private final LinkedServicePropsResponse properties;
    /**
     * @return Resource type of linked service.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLinkedServiceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") LinkedServicePropsResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * @return ResourceId of the link of the linked service.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity for the resource.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return location of the linked service.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Friendly name of the linked service.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return LinkedService specific properties.
     * 
     */
    public LinkedServicePropsResponse properties() {
        return this.properties;
    }
    /**
     * @return Resource type of linked service.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String location;
        private String name;
        private LinkedServicePropsResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
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
        public Builder properties(LinkedServicePropsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLinkedServiceResult build() {
            return new GetLinkedServiceResult(id, identity, location, name, properties, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.outputs;

import com.pulumi.azurenative.digitaltwins.outputs.PrivateEndpointConnectionResponseProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateEndpointConnectionResponse {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    private final PrivateEndpointConnectionResponseProperties properties;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private PrivateEndpointConnectionResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") PrivateEndpointConnectionResponseProperties properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * The resource identifier.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    public PrivateEndpointConnectionResponseProperties properties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private PrivateEndpointConnectionResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
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
        public Builder properties(PrivateEndpointConnectionResponseProperties properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(id, name, properties, type);
        }
    }
}

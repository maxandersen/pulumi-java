// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReferenceResult {
    /**
     * Optional. A human-readable description of this reference.
     * 
     */
    private final String description;
    /**
     * The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
     * 
     */
    private final String name;
    /**
     * The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
     * 
     */
    private final String refers;
    /**
     * The type of resource referred to by this reference. Valid values are &#39;KeyStore&#39; or &#39;TrustStore&#39;.
     * 
     */
    private final String resourceType;

    @CustomType.Constructor
    private GetReferenceResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("refers") String refers,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.description = description;
        this.name = name;
        this.refers = refers;
        this.resourceType = resourceType;
    }

    /**
     * Optional. A human-readable description of this reference.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
     * 
    */
    public String refers() {
        return this.refers;
    }
    /**
     * The type of resource referred to by this reference. Valid values are &#39;KeyStore&#39; or &#39;TrustStore&#39;.
     * 
    */
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReferenceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String name;
        private String refers;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReferenceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.refers = defaults.refers;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder refers(String refers) {
            this.refers = Objects.requireNonNull(refers);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public GetReferenceResult build() {
            return new GetReferenceResult(description, name, refers, resourceType);
        }
    }
}

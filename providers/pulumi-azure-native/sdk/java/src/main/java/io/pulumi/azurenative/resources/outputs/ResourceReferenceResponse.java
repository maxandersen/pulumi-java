// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceReferenceResponse {
    /**
     * The fully qualified resource Id.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private ResourceReferenceResponse(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * The fully qualified resource Id.
     * 
    */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public ResourceReferenceResponse build() {
            return new ResourceReferenceResponse(id);
        }
    }
}

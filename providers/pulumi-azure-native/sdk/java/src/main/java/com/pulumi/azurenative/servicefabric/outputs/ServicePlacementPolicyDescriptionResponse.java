// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServicePlacementPolicyDescriptionResponse {
    /**
     * The type of placement policy for a service fabric service. Following are the possible values.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ServicePlacementPolicyDescriptionResponse(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * The type of placement policy for a service fabric service. Following are the possible values.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementPolicyDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementPolicyDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ServicePlacementPolicyDescriptionResponse build() {
            return new ServicePlacementPolicyDescriptionResponse(type);
        }
    }
}

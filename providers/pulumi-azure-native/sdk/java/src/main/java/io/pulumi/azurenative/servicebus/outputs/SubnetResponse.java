// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SubnetResponse {
    /**
     * Resource ID of Virtual Network Subnet
     * 
     */
    private final String id;

    @CustomType.Constructor
    private SubnetResponse(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * Resource ID of Virtual Network Subnet
     * 
    */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public SubnetResponse build() {
            return new SubnetResponse(id);
        }
    }
}

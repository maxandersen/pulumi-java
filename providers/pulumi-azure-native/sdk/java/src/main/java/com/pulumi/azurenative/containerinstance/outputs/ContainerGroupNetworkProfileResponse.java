// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerGroupNetworkProfileResponse {
    /**
     * @return The identifier for a network profile.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private ContainerGroupNetworkProfileResponse(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return The identifier for a network profile.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public ContainerGroupNetworkProfileResponse build() {
            return new ContainerGroupNetworkProfileResponse(id);
        }
    }
}

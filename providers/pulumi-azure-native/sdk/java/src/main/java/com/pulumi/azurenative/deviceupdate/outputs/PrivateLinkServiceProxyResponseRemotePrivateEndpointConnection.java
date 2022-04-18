// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection {
    /**
     * Remote private endpoint connection ID.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * Remote private endpoint connection ID.
     * 
    */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection build() {
            return new PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection(id);
        }
    }
}

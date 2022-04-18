// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines reference to load balancer backend address pools.
 * 
 */
public final class LoadBalancerBackendAddressPoolReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoadBalancerBackendAddressPoolReferenceResponse Empty = new LoadBalancerBackendAddressPoolReferenceResponse();

    /**
     * Gets the name of the proxy resource on the target side.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @Import(name="sourceArmResourceId", required=true)
      private final String sourceArmResourceId;

    public String sourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public LoadBalancerBackendAddressPoolReferenceResponse(
        @Nullable String name,
        String sourceArmResourceId) {
        this.name = name;
        this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
    }

    private LoadBalancerBackendAddressPoolReferenceResponse() {
        this.name = null;
        this.sourceArmResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendAddressPoolReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendAddressPoolReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder sourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }        public LoadBalancerBackendAddressPoolReferenceResponse build() {
            return new LoadBalancerBackendAddressPoolReferenceResponse(name, sourceArmResourceId);
        }
    }
}

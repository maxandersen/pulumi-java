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
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @Import(name="sourceArmResourceId", required=true)
    private String sourceArmResourceId;

    public String sourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    private LoadBalancerBackendAddressPoolReferenceResponse() {}

    private LoadBalancerBackendAddressPoolReferenceResponse(LoadBalancerBackendAddressPoolReferenceResponse $) {
        this.name = $.name;
        this.sourceArmResourceId = $.sourceArmResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerBackendAddressPoolReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerBackendAddressPoolReferenceResponse $;

        public Builder() {
            $ = new LoadBalancerBackendAddressPoolReferenceResponse();
        }

        public Builder(LoadBalancerBackendAddressPoolReferenceResponse defaults) {
            $ = new LoadBalancerBackendAddressPoolReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder sourceArmResourceId(String sourceArmResourceId) {
            $.sourceArmResourceId = sourceArmResourceId;
            return this;
        }

        public LoadBalancerBackendAddressPoolReferenceResponse build() {
            $.sourceArmResourceId = Objects.requireNonNull($.sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
            return $;
        }
    }

}

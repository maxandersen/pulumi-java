// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkRuleResponse {
    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     * 
     */
    private final @Nullable String id;
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    private final @Nullable Boolean ignoreMissingVNetServiceEndpoint;

    @CustomType.Constructor
    private VirtualNetworkRuleResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ignoreMissingVNetServiceEndpoint") @Nullable Boolean ignoreMissingVNetServiceEndpoint) {
        this.id = id;
        this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
    */
    public Optional<Boolean> ignoreMissingVNetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVNetServiceEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Boolean ignoreMissingVNetServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVNetServiceEndpoint = defaults.ignoreMissingVNetServiceEndpoint;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ignoreMissingVNetServiceEndpoint(@Nullable Boolean ignoreMissingVNetServiceEndpoint) {
            this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
            return this;
        }        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(id, ignoreMissingVNetServiceEndpoint);
        }
    }
}

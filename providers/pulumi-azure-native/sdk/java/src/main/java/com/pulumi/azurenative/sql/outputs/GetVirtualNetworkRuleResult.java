// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualNetworkRuleResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Virtual Network Rule State
     * 
     */
    private final String state;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The ARM resource id of the virtual network subnet.
     * 
     */
    private final String virtualNetworkSubnetId;

    @CustomType.Constructor
    private GetVirtualNetworkRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ignoreMissingVnetServiceEndpoint") @Nullable Boolean ignoreMissingVnetServiceEndpoint,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetworkSubnetId") String virtualNetworkSubnetId) {
        this.id = id;
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.name = name;
        this.state = state;
        this.type = type;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
    */
    public Optional<Boolean> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Virtual Network Rule State
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The ARM resource id of the virtual network subnet.
     * 
    */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean ignoreMissingVnetServiceEndpoint;
        private String name;
        private String state;
        private String type;
        private String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
            return this;
        }        public GetVirtualNetworkRuleResult build() {
            return new GetVirtualNetworkRuleResult(id, ignoreMissingVnetServiceEndpoint, name, state, type, virtualNetworkSubnetId);
        }
    }
}

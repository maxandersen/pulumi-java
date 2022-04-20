// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpFirewallRuleResult {
    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
     * 
     */
    private final @Nullable String endIpAddress;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Resource provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * The start IP address of the firewall rule. Must be IPv4 format
     * 
     */
    private final @Nullable String startIpAddress;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIpFirewallRuleResult(
        @CustomType.Parameter("endIpAddress") @Nullable String endIpAddress,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("startIpAddress") @Nullable String startIpAddress,
        @CustomType.Parameter("type") String type) {
        this.endIpAddress = endIpAddress;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.startIpAddress = startIpAddress;
        this.type = type;
    }

    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
     * 
    */
    public Optional<String> endIpAddress() {
        return Optional.ofNullable(this.endIpAddress);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Resource provisioning state
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The start IP address of the firewall rule. Must be IPv4 format
     * 
    */
    public Optional<String> startIpAddress() {
        return Optional.ofNullable(this.startIpAddress);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpFirewallRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endIpAddress;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable String startIpAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpFirewallRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.startIpAddress = defaults.startIpAddress;
    	      this.type = defaults.type;
        }

        public Builder endIpAddress(@Nullable String endIpAddress) {
            this.endIpAddress = endIpAddress;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder startIpAddress(@Nullable String startIpAddress) {
            this.startIpAddress = startIpAddress;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIpFirewallRuleResult build() {
            return new GetIpFirewallRuleResult(endIpAddress, id, name, provisioningState, startIpAddress, type);
        }
    }
}

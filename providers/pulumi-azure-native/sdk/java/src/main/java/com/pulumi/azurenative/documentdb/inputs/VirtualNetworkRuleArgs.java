// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual Network ACL Rule object
 * 
 */
public final class VirtualNetworkRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    @Import(name="ignoreMissingVNetServiceEndpoint")
      private final @Nullable Output<Boolean> ignoreMissingVNetServiceEndpoint;

    public Output<Boolean> ignoreMissingVNetServiceEndpoint() {
        return this.ignoreMissingVNetServiceEndpoint == null ? Codegen.empty() : this.ignoreMissingVNetServiceEndpoint;
    }

    public VirtualNetworkRuleArgs(
        @Nullable Output<String> id,
        @Nullable Output<Boolean> ignoreMissingVNetServiceEndpoint) {
        this.id = id;
        this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
    }

    private VirtualNetworkRuleArgs() {
        this.id = Codegen.empty();
        this.ignoreMissingVNetServiceEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<Boolean> ignoreMissingVNetServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVNetServiceEndpoint = defaults.ignoreMissingVNetServiceEndpoint;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ignoreMissingVNetServiceEndpoint(@Nullable Output<Boolean> ignoreMissingVNetServiceEndpoint) {
            this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
            return this;
        }
        public Builder ignoreMissingVNetServiceEndpoint(@Nullable Boolean ignoreMissingVNetServiceEndpoint) {
            this.ignoreMissingVNetServiceEndpoint = Codegen.ofNullable(ignoreMissingVNetServiceEndpoint);
            return this;
        }        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(id, ignoreMissingVNetServiceEndpoint);
        }
    }
}

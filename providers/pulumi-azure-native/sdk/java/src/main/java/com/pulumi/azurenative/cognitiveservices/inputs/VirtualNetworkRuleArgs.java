// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule governing the accessibility from a specific virtual network.
 * 
 */
public final class VirtualNetworkRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * Full resource id of a vnet subnet, such as '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * Ignore missing vnet service endpoint or not.
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
      private final @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint;

    public Output<Boolean> ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Codegen.empty() : this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Gets the state of virtual network rule.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public VirtualNetworkRuleArgs(
        Output<String> id,
        @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint,
        @Nullable Output<String> state) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.state = state;
    }

    private VirtualNetworkRuleArgs() {
        this.id = Codegen.empty();
        this.ignoreMissingVnetServiceEndpoint = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.state = defaults.state;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = Codegen.ofNullable(ignoreMissingVnetServiceEndpoint);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(id, ignoreMissingVnetServiceEndpoint, state);
        }
    }
}

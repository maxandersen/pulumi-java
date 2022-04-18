// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A VPN gateway interface.
 * 
 */
public final class VpnGatewayVpnGatewayInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayVpnGatewayInterfaceArgs Empty = new VpnGatewayVpnGatewayInterfaceArgs();

    /**
     * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for IPsec-encrypted Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource. Not currently available publicly.
     * 
     */
    @Import(name="interconnectAttachment")
      private final @Nullable Output<String> interconnectAttachment;

    public Output<String> interconnectAttachment() {
        return this.interconnectAttachment == null ? Codegen.empty() : this.interconnectAttachment;
    }

    public VpnGatewayVpnGatewayInterfaceArgs(@Nullable Output<String> interconnectAttachment) {
        this.interconnectAttachment = interconnectAttachment;
    }

    private VpnGatewayVpnGatewayInterfaceArgs() {
        this.interconnectAttachment = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayVpnGatewayInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> interconnectAttachment;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayVpnGatewayInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectAttachment = defaults.interconnectAttachment;
        }

        public Builder interconnectAttachment(@Nullable Output<String> interconnectAttachment) {
            this.interconnectAttachment = interconnectAttachment;
            return this;
        }
        public Builder interconnectAttachment(@Nullable String interconnectAttachment) {
            this.interconnectAttachment = Codegen.ofNullable(interconnectAttachment);
            return this;
        }        public VpnGatewayVpnGatewayInterfaceArgs build() {
            return new VpnGatewayVpnGatewayInterfaceArgs(interconnectAttachment);
        }
    }
}

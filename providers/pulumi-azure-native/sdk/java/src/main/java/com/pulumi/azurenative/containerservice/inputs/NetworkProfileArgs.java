// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the OpenShift networking configuration
 * 
 */
public final class NetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * CIDR of the Vnet to peer.
     * 
     */
    @Import(name="peerVnetId")
      private final @Nullable Output<String> peerVnetId;

    public Output<String> peerVnetId() {
        return this.peerVnetId == null ? Codegen.empty() : this.peerVnetId;
    }

    /**
     * CIDR for the OpenShift Vnet.
     * 
     */
    @Import(name="vnetCidr")
      private final @Nullable Output<String> vnetCidr;

    public Output<String> vnetCidr() {
        return this.vnetCidr == null ? Codegen.empty() : this.vnetCidr;
    }

    /**
     * ID of the Vnet created for OSA cluster.
     * 
     */
    @Import(name="vnetId")
      private final @Nullable Output<String> vnetId;

    public Output<String> vnetId() {
        return this.vnetId == null ? Codegen.empty() : this.vnetId;
    }

    public NetworkProfileArgs(
        @Nullable Output<String> peerVnetId,
        @Nullable Output<String> vnetCidr,
        @Nullable Output<String> vnetId) {
        this.peerVnetId = peerVnetId;
        this.vnetCidr = vnetCidr == null ? Codegen.ofNullable("10.0.0.0/8") : vnetCidr;
        this.vnetId = vnetId;
    }

    private NetworkProfileArgs() {
        this.peerVnetId = Codegen.empty();
        this.vnetCidr = Codegen.empty();
        this.vnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> peerVnetId;
        private @Nullable Output<String> vnetCidr;
        private @Nullable Output<String> vnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peerVnetId = defaults.peerVnetId;
    	      this.vnetCidr = defaults.vnetCidr;
    	      this.vnetId = defaults.vnetId;
        }

        public Builder peerVnetId(@Nullable Output<String> peerVnetId) {
            this.peerVnetId = peerVnetId;
            return this;
        }
        public Builder peerVnetId(@Nullable String peerVnetId) {
            this.peerVnetId = Codegen.ofNullable(peerVnetId);
            return this;
        }
        public Builder vnetCidr(@Nullable Output<String> vnetCidr) {
            this.vnetCidr = vnetCidr;
            return this;
        }
        public Builder vnetCidr(@Nullable String vnetCidr) {
            this.vnetCidr = Codegen.ofNullable(vnetCidr);
            return this;
        }
        public Builder vnetId(@Nullable Output<String> vnetId) {
            this.vnetId = vnetId;
            return this;
        }
        public Builder vnetId(@Nullable String vnetId) {
            this.vnetId = Codegen.ofNullable(vnetId);
            return this;
        }        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(peerVnetId, vnetCidr, vnetId);
        }
    }
}

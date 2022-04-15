// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the OpenShift networking configuration
 * 
 */
public final class NetworkProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkProfileResponse Empty = new NetworkProfileResponse();

    /**
     * CIDR of the Vnet to peer.
     * 
     */
    @Import(name="peerVnetId")
      private final @Nullable String peerVnetId;

    public Optional<String> peerVnetId() {
        return this.peerVnetId == null ? Optional.empty() : Optional.ofNullable(this.peerVnetId);
    }

    /**
     * CIDR for the OpenShift Vnet.
     * 
     */
    @Import(name="vnetCidr")
      private final @Nullable String vnetCidr;

    public Optional<String> vnetCidr() {
        return this.vnetCidr == null ? Optional.empty() : Optional.ofNullable(this.vnetCidr);
    }

    /**
     * ID of the Vnet created for OSA cluster.
     * 
     */
    @Import(name="vnetId")
      private final @Nullable String vnetId;

    public Optional<String> vnetId() {
        return this.vnetId == null ? Optional.empty() : Optional.ofNullable(this.vnetId);
    }

    public NetworkProfileResponse(
        @Nullable String peerVnetId,
        @Nullable String vnetCidr,
        @Nullable String vnetId) {
        this.peerVnetId = peerVnetId;
        this.vnetCidr = vnetCidr == null ? "10.0.0.0/8" : vnetCidr;
        this.vnetId = vnetId;
    }

    private NetworkProfileResponse() {
        this.peerVnetId = null;
        this.vnetCidr = null;
        this.vnetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String peerVnetId;
        private @Nullable String vnetCidr;
        private @Nullable String vnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peerVnetId = defaults.peerVnetId;
    	      this.vnetCidr = defaults.vnetCidr;
    	      this.vnetId = defaults.vnetId;
        }

        public Builder peerVnetId(@Nullable String peerVnetId) {
            this.peerVnetId = peerVnetId;
            return this;
        }
        public Builder vnetCidr(@Nullable String vnetCidr) {
            this.vnetCidr = vnetCidr;
            return this;
        }
        public Builder vnetId(@Nullable String vnetId) {
            this.vnetId = vnetId;
            return this;
        }        public NetworkProfileResponse build() {
            return new NetworkProfileResponse(peerVnetId, vnetCidr, vnetId);
        }
    }
}

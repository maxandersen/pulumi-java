// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v2alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network related configurations.
 * 
 */
public final class NetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * Allows the TPU node to send and receive packets with non-matching destination or source IPs. This is required if you plan to use the TPU workers to forward routes.
     * 
     */
    @Import(name="canIpForward")
      private final @Nullable Output<Boolean> canIpForward;

    public Output<Boolean> canIpForward() {
        return this.canIpForward == null ? Codegen.empty() : this.canIpForward;
    }

    /**
     * Indicates that external IP addresses would be associated with the TPU workers. If set to false, the specified subnetwork or network should have Private Google Access enabled.
     * 
     */
    @Import(name="enableExternalIps")
      private final @Nullable Output<Boolean> enableExternalIps;

    public Output<Boolean> enableExternalIps() {
        return this.enableExternalIps == null ? Codegen.empty() : this.enableExternalIps;
    }

    /**
     * The name of the network for the TPU node. It must be a preexisting Google Compute Engine network. If none is provided, &#34;default&#34; will be used.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine subnetwork. If none is provided, &#34;default&#34; will be used.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    public NetworkConfigArgs(
        @Nullable Output<Boolean> canIpForward,
        @Nullable Output<Boolean> enableExternalIps,
        @Nullable Output<String> network,
        @Nullable Output<String> subnetwork) {
        this.canIpForward = canIpForward;
        this.enableExternalIps = enableExternalIps;
        this.network = network;
        this.subnetwork = subnetwork;
    }

    private NetworkConfigArgs() {
        this.canIpForward = Codegen.empty();
        this.enableExternalIps = Codegen.empty();
        this.network = Codegen.empty();
        this.subnetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> canIpForward;
        private @Nullable Output<Boolean> enableExternalIps;
        private @Nullable Output<String> network;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.enableExternalIps = defaults.enableExternalIps;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder canIpForward(@Nullable Output<Boolean> canIpForward) {
            this.canIpForward = canIpForward;
            return this;
        }
        public Builder canIpForward(@Nullable Boolean canIpForward) {
            this.canIpForward = Codegen.ofNullable(canIpForward);
            return this;
        }
        public Builder enableExternalIps(@Nullable Output<Boolean> enableExternalIps) {
            this.enableExternalIps = enableExternalIps;
            return this;
        }
        public Builder enableExternalIps(@Nullable Boolean enableExternalIps) {
            this.enableExternalIps = Codegen.ofNullable(enableExternalIps);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(canIpForward, enableExternalIps, network, subnetwork);
        }
    }
}

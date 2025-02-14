// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Load balancing specific fields for network endpoint group.
 * 
 */
public final class NetworkEndpointGroupLbNetworkEndpointGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupLbNetworkEndpointGroupArgs Empty = new NetworkEndpointGroupLbNetworkEndpointGroupArgs();

    /**
     * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated. */
    @Import(name="defaultPort")
    private @Nullable Output<Integer> defaultPort;

    /**
     * @return The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated. */
    public Optional<Output<Integer>> defaultPort() {
        return Optional.ofNullable(this.defaultPort);
    }

    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The URL of the network to which all network endpoints in the NEG belong. Uses ""default"" project network if unspecified. [Deprecated] This field is deprecated. */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* The URL of the network to which all network endpoints in the NEG belong. Uses ""default"" project network if unspecified. [Deprecated] This field is deprecated. */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated. */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated. */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    private NetworkEndpointGroupLbNetworkEndpointGroupArgs() {}

    private NetworkEndpointGroupLbNetworkEndpointGroupArgs(NetworkEndpointGroupLbNetworkEndpointGroupArgs $) {
        this.defaultPort = $.defaultPort;
        this.network = $.network;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkEndpointGroupLbNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkEndpointGroupLbNetworkEndpointGroupArgs $;

        public Builder() {
            $ = new NetworkEndpointGroupLbNetworkEndpointGroupArgs();
        }

        public Builder(NetworkEndpointGroupLbNetworkEndpointGroupArgs defaults) {
            $ = new NetworkEndpointGroupLbNetworkEndpointGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultPort The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
         * 
         */
        @Deprecated /* The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated. */
        public Builder defaultPort(@Nullable Output<Integer> defaultPort) {
            $.defaultPort = defaultPort;
            return this;
        }

        /**
         * @param defaultPort The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
         * 
         */
        @Deprecated /* The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated. */
        public Builder defaultPort(Integer defaultPort) {
            return defaultPort(Output.of(defaultPort));
        }

        /**
         * @param network The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
         * 
         */
        @Deprecated /* The URL of the network to which all network endpoints in the NEG belong. Uses ""default"" project network if unspecified. [Deprecated] This field is deprecated. */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified. [Deprecated] This field is deprecated.
         * 
         */
        @Deprecated /* The URL of the network to which all network endpoints in the NEG belong. Uses ""default"" project network if unspecified. [Deprecated] This field is deprecated. */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param subnetwork Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
         * 
         */
        @Deprecated /* Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated. */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
         * 
         */
        @Deprecated /* Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated. */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public NetworkEndpointGroupLbNetworkEndpointGroupArgs build() {
            return $;
        }
    }

}

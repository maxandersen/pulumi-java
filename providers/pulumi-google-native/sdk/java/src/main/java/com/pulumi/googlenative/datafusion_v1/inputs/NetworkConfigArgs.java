// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network configuration for a Data Fusion instance. These configurations are used for peering with the customer network. Configurations are optional when a public Data Fusion instance is to be created. However, providing these configurations allows several benefits, such as reduced network latency while accessing the customer resources from managed Data Fusion instance nodes, as well as access to the customer on-prem resources.
 * 
 */
public final class NetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the customer network.
     * 
     */
    @Import(name="ipAllocation")
    private @Nullable Output<String> ipAllocation;

    /**
     * @return The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the customer network.
     * 
     */
    public Optional<Output<String>> ipAllocation() {
        return Optional.ofNullable(this.ipAllocation);
    }

    /**
     * Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    private NetworkConfigArgs() {}

    private NetworkConfigArgs(NetworkConfigArgs $) {
        this.ipAllocation = $.ipAllocation;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConfigArgs $;

        public Builder() {
            $ = new NetworkConfigArgs();
        }

        public Builder(NetworkConfigArgs defaults) {
            $ = new NetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAllocation The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the customer network.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocation(@Nullable Output<String> ipAllocation) {
            $.ipAllocation = ipAllocation;
            return this;
        }

        /**
         * @param ipAllocation The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the customer network.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocation(String ipAllocation) {
            return ipAllocation(Output.of(ipAllocation));
        }

        /**
         * @param network Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        public NetworkConfigArgs build() {
            return $;
        }
    }

}

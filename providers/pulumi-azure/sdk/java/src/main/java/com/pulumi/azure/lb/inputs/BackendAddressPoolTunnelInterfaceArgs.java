// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BackendAddressPoolTunnelInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendAddressPoolTunnelInterfaceArgs Empty = new BackendAddressPoolTunnelInterfaceArgs();

    /**
     * The unique identifier of this Gateway Lodbalancer Tunnel Interface.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<Integer> identifier;

    /**
     * @return The unique identifier of this Gateway Lodbalancer Tunnel Interface.
     * 
     */
    public Output<Integer> identifier() {
        return this.identifier;
    }

    /**
     * The port number that this Gateway Lodbalancer Tunnel Interface listens to.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port number that this Gateway Lodbalancer Tunnel Interface listens to.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The protocol used for this Gateway Lodbalancer Tunnel Interface. Possible values are `Native` and `VXLAN`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol used for this Gateway Lodbalancer Tunnel Interface. Possible values are `Native` and `VXLAN`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The traffic type of this Gateway Lodbalancer Tunnel Interface. Possible values are `Internal` and `External`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The traffic type of this Gateway Lodbalancer Tunnel Interface. Possible values are `Internal` and `External`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private BackendAddressPoolTunnelInterfaceArgs() {}

    private BackendAddressPoolTunnelInterfaceArgs(BackendAddressPoolTunnelInterfaceArgs $) {
        this.identifier = $.identifier;
        this.port = $.port;
        this.protocol = $.protocol;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendAddressPoolTunnelInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendAddressPoolTunnelInterfaceArgs $;

        public Builder() {
            $ = new BackendAddressPoolTunnelInterfaceArgs();
        }

        public Builder(BackendAddressPoolTunnelInterfaceArgs defaults) {
            $ = new BackendAddressPoolTunnelInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier The unique identifier of this Gateway Lodbalancer Tunnel Interface.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<Integer> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The unique identifier of this Gateway Lodbalancer Tunnel Interface.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Integer identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param port The port number that this Gateway Lodbalancer Tunnel Interface listens to.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number that this Gateway Lodbalancer Tunnel Interface listens to.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The protocol used for this Gateway Lodbalancer Tunnel Interface. Possible values are `Native` and `VXLAN`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol used for this Gateway Lodbalancer Tunnel Interface. Possible values are `Native` and `VXLAN`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param type The traffic type of this Gateway Lodbalancer Tunnel Interface. Possible values are `Internal` and `External`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The traffic type of this Gateway Lodbalancer Tunnel Interface. Possible values are `Internal` and `External`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public BackendAddressPoolTunnelInterfaceArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}

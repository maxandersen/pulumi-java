// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.azurenative.orbital.enums.Protocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Customer End point to store/retrieve data during a contact.
 * 
 */
public final class EndPointArgs extends ResourceArgs {

    public static final EndPointArgs Empty = new EndPointArgs();

    /**
     * Name of an end point.
     * 
     */
    @Import(name="endPointName", required=true)
    private Output<String> endPointName;

    /**
     * @return Name of an end point.
     * 
     */
    public Output<String> endPointName() {
        return this.endPointName;
    }

    /**
     * IP Address.
     * 
     */
    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    /**
     * @return IP Address.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    /**
     * TCP port to listen on to receive data.
     * 
     */
    @Import(name="port", required=true)
    private Output<String> port;

    /**
     * @return TCP port to listen on to receive data.
     * 
     */
    public Output<String> port() {
        return this.port;
    }

    /**
     * Protocol either UDP or TCP.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<Either<String,Protocol>> protocol;

    /**
     * @return Protocol either UDP or TCP.
     * 
     */
    public Output<Either<String,Protocol>> protocol() {
        return this.protocol;
    }

    private EndPointArgs() {}

    private EndPointArgs(EndPointArgs $) {
        this.endPointName = $.endPointName;
        this.ipAddress = $.ipAddress;
        this.port = $.port;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndPointArgs $;

        public Builder() {
            $ = new EndPointArgs();
        }

        public Builder(EndPointArgs defaults) {
            $ = new EndPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endPointName Name of an end point.
         * 
         * @return builder
         * 
         */
        public Builder endPointName(Output<String> endPointName) {
            $.endPointName = endPointName;
            return this;
        }

        /**
         * @param endPointName Name of an end point.
         * 
         * @return builder
         * 
         */
        public Builder endPointName(String endPointName) {
            return endPointName(Output.of(endPointName));
        }

        /**
         * @param ipAddress IP Address.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress IP Address.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param port TCP port to listen on to receive data.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port TCP port to listen on to receive data.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol Protocol either UDP or TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<Either<String,Protocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol either UDP or TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,Protocol> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol Protocol either UDP or TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol Protocol either UDP or TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Protocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        public EndPointArgs build() {
            $.endPointName = Objects.requireNonNull($.endPointName, "expected parameter 'endPointName' to be non-null");
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}

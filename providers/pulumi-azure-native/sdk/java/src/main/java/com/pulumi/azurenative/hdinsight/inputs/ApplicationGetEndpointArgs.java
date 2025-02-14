// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets the application SSH endpoint
 * 
 */
public final class ApplicationGetEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGetEndpointArgs Empty = new ApplicationGetEndpointArgs();

    /**
     * The destination port to connect to.
     * 
     */
    @Import(name="destinationPort")
    private @Nullable Output<Integer> destinationPort;

    /**
     * @return The destination port to connect to.
     * 
     */
    public Optional<Output<Integer>> destinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }

    /**
     * The location of the endpoint.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the endpoint.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The private ip address of the endpoint.
     * 
     */
    @Import(name="privateIPAddress")
    private @Nullable Output<String> privateIPAddress;

    /**
     * @return The private ip address of the endpoint.
     * 
     */
    public Optional<Output<String>> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * The public port to connect to.
     * 
     */
    @Import(name="publicPort")
    private @Nullable Output<Integer> publicPort;

    /**
     * @return The public port to connect to.
     * 
     */
    public Optional<Output<Integer>> publicPort() {
        return Optional.ofNullable(this.publicPort);
    }

    private ApplicationGetEndpointArgs() {}

    private ApplicationGetEndpointArgs(ApplicationGetEndpointArgs $) {
        this.destinationPort = $.destinationPort;
        this.location = $.location;
        this.privateIPAddress = $.privateIPAddress;
        this.publicPort = $.publicPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGetEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGetEndpointArgs $;

        public Builder() {
            $ = new ApplicationGetEndpointArgs();
        }

        public Builder(ApplicationGetEndpointArgs defaults) {
            $ = new ApplicationGetEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationPort The destination port to connect to.
         * 
         * @return builder
         * 
         */
        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            $.destinationPort = destinationPort;
            return this;
        }

        /**
         * @param destinationPort The destination port to connect to.
         * 
         * @return builder
         * 
         */
        public Builder destinationPort(Integer destinationPort) {
            return destinationPort(Output.of(destinationPort));
        }

        /**
         * @param location The location of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param privateIPAddress The private ip address of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            $.privateIPAddress = privateIPAddress;
            return this;
        }

        /**
         * @param privateIPAddress The private ip address of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(String privateIPAddress) {
            return privateIPAddress(Output.of(privateIPAddress));
        }

        /**
         * @param publicPort The public port to connect to.
         * 
         * @return builder
         * 
         */
        public Builder publicPort(@Nullable Output<Integer> publicPort) {
            $.publicPort = publicPort;
            return this;
        }

        /**
         * @param publicPort The public port to connect to.
         * 
         * @return builder
         * 
         */
        public Builder publicPort(Integer publicPort) {
            return publicPort(Output.of(publicPort));
        }

        public ApplicationGetEndpointArgs build() {
            return $;
        }
    }

}

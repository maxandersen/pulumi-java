// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentV3InboundNetworkDependencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentV3InboundNetworkDependencyArgs Empty = new EnvironmentV3InboundNetworkDependencyArgs();

    /**
     * A short description of the purpose of the network traffic.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description of the purpose of the network traffic.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of IP addresses that network traffic will originate from in CIDR notation.
     * 
     */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    /**
     * @return A list of IP addresses that network traffic will originate from in CIDR notation.
     * 
     */
    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * The ports that network traffic will arrive to the App Service Environment V3 on.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<String>> ports;

    /**
     * @return The ports that network traffic will arrive to the App Service Environment V3 on.
     * 
     */
    public Optional<Output<List<String>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private EnvironmentV3InboundNetworkDependencyArgs() {}

    private EnvironmentV3InboundNetworkDependencyArgs(EnvironmentV3InboundNetworkDependencyArgs $) {
        this.description = $.description;
        this.ipAddresses = $.ipAddresses;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentV3InboundNetworkDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentV3InboundNetworkDependencyArgs $;

        public Builder() {
            $ = new EnvironmentV3InboundNetworkDependencyArgs();
        }

        public Builder(EnvironmentV3InboundNetworkDependencyArgs defaults) {
            $ = new EnvironmentV3InboundNetworkDependencyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A short description of the purpose of the network traffic.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description of the purpose of the network traffic.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipAddresses A list of IP addresses that network traffic will originate from in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses A list of IP addresses that network traffic will originate from in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param ipAddresses A list of IP addresses that network traffic will originate from in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param ports The ports that network traffic will arrive to the App Service Environment V3 on.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<String>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports The ports that network traffic will arrive to the App Service Environment V3 on.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<String> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports The ports that network traffic will arrive to the App Service Environment V3 on.
         * 
         * @return builder
         * 
         */
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }

        public EnvironmentV3InboundNetworkDependencyArgs build() {
            return $;
        }
    }

}

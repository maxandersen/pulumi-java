// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.azurenative.hanaonazure.inputs.IpAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the network settings for the HANA instance disks.
 * 
 */
public final class NetworkProfileArgs extends ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * Specifies the network interfaces for the HANA instance.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<IpAddressArgs>> networkInterfaces;

    /**
     * @return Specifies the network interfaces for the HANA instance.
     * 
     */
    public Optional<Output<List<IpAddressArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    private NetworkProfileArgs() {}

    private NetworkProfileArgs(NetworkProfileArgs $) {
        this.networkInterfaces = $.networkInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkProfileArgs $;

        public Builder() {
            $ = new NetworkProfileArgs();
        }

        public Builder(NetworkProfileArgs defaults) {
            $ = new NetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkInterfaces Specifies the network interfaces for the HANA instance.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<IpAddressArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces Specifies the network interfaces for the HANA instance.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<IpAddressArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces Specifies the network interfaces for the HANA instance.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(IpAddressArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public NetworkProfileArgs build() {
            return $;
        }
    }

}

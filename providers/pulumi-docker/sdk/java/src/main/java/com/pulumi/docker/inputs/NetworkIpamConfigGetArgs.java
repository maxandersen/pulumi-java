// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkIpamConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkIpamConfigGetArgs Empty = new NetworkIpamConfigGetArgs();

    @Import(name="auxAddress")
    private @Nullable Output<Map<String,Object>> auxAddress;

    public Optional<Output<Map<String,Object>>> auxAddress() {
        return Optional.ofNullable(this.auxAddress);
    }

    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private NetworkIpamConfigGetArgs() {}

    private NetworkIpamConfigGetArgs(NetworkIpamConfigGetArgs $) {
        this.auxAddress = $.auxAddress;
        this.gateway = $.gateway;
        this.ipRange = $.ipRange;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkIpamConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkIpamConfigGetArgs $;

        public Builder() {
            $ = new NetworkIpamConfigGetArgs();
        }

        public Builder(NetworkIpamConfigGetArgs defaults) {
            $ = new NetworkIpamConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder auxAddress(@Nullable Output<Map<String,Object>> auxAddress) {
            $.auxAddress = auxAddress;
            return this;
        }

        public Builder auxAddress(Map<String,Object> auxAddress) {
            return auxAddress(Output.of(auxAddress));
        }

        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public NetworkIpamConfigGetArgs build() {
            return $;
        }
    }

}

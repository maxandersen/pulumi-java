// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetPrivateIpAddressSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetPrivateIpAddressSpecificationArgs Empty = new SpotFleetPrivateIpAddressSpecificationArgs();

    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    @Import(name="privateIpAddress", required=true)
    private Output<String> privateIpAddress;

    public Output<String> privateIpAddress() {
        return this.privateIpAddress;
    }

    private SpotFleetPrivateIpAddressSpecificationArgs() {}

    private SpotFleetPrivateIpAddressSpecificationArgs(SpotFleetPrivateIpAddressSpecificationArgs $) {
        this.primary = $.primary;
        this.privateIpAddress = $.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetPrivateIpAddressSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetPrivateIpAddressSpecificationArgs $;

        public Builder() {
            $ = new SpotFleetPrivateIpAddressSpecificationArgs();
        }

        public Builder(SpotFleetPrivateIpAddressSpecificationArgs defaults) {
            $ = new SpotFleetPrivateIpAddressSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        public Builder privateIpAddress(Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        public SpotFleetPrivateIpAddressSpecificationArgs build() {
            $.privateIpAddress = Objects.requireNonNull($.privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
            return $;
        }
    }

}

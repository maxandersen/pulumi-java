// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Vpn NatRule mapping.
 * 
 */
public final class VpnNatRuleMappingArgs extends ResourceArgs {

    public static final VpnNatRuleMappingArgs Empty = new VpnNatRuleMappingArgs();

    /**
     * Address space for Vpn NatRule mapping.
     * 
     */
    @Import(name="addressSpace")
    private @Nullable Output<String> addressSpace;

    /**
     * @return Address space for Vpn NatRule mapping.
     * 
     */
    public Optional<Output<String>> addressSpace() {
        return Optional.ofNullable(this.addressSpace);
    }

    private VpnNatRuleMappingArgs() {}

    private VpnNatRuleMappingArgs(VpnNatRuleMappingArgs $) {
        this.addressSpace = $.addressSpace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnNatRuleMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnNatRuleMappingArgs $;

        public Builder() {
            $ = new VpnNatRuleMappingArgs();
        }

        public Builder(VpnNatRuleMappingArgs defaults) {
            $ = new VpnNatRuleMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressSpace Address space for Vpn NatRule mapping.
         * 
         * @return builder
         * 
         */
        public Builder addressSpace(@Nullable Output<String> addressSpace) {
            $.addressSpace = addressSpace;
            return this;
        }

        /**
         * @param addressSpace Address space for Vpn NatRule mapping.
         * 
         * @return builder
         * 
         */
        public Builder addressSpace(String addressSpace) {
            return addressSpace(Output.of(addressSpace));
        }

        public VpnNatRuleMappingArgs build() {
            return $;
        }
    }

}

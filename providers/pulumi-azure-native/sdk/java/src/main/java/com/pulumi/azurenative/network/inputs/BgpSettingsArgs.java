// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.IPConfigurationBgpPeeringAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * BGP settings details.
 * 
 */
public final class BgpSettingsArgs extends ResourceArgs {

    public static final BgpSettingsArgs Empty = new BgpSettingsArgs();

    /**
     * The BGP speaker&#39;s ASN.
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Double> asn;

    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    public Optional<Output<Double>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    @Import(name="bgpPeeringAddress")
    private @Nullable Output<String> bgpPeeringAddress;

    /**
     * @return The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    public Optional<Output<String>> bgpPeeringAddress() {
        return Optional.ofNullable(this.bgpPeeringAddress);
    }

    /**
     * BGP peering address with IP configuration ID for virtual network gateway.
     * 
     */
    @Import(name="bgpPeeringAddresses")
    private @Nullable Output<List<IPConfigurationBgpPeeringAddressArgs>> bgpPeeringAddresses;

    /**
     * @return BGP peering address with IP configuration ID for virtual network gateway.
     * 
     */
    public Optional<Output<List<IPConfigurationBgpPeeringAddressArgs>>> bgpPeeringAddresses() {
        return Optional.ofNullable(this.bgpPeeringAddresses);
    }

    /**
     * The weight added to routes learned from this BGP speaker.
     * 
     */
    @Import(name="peerWeight")
    private @Nullable Output<Integer> peerWeight;

    /**
     * @return The weight added to routes learned from this BGP speaker.
     * 
     */
    public Optional<Output<Integer>> peerWeight() {
        return Optional.ofNullable(this.peerWeight);
    }

    private BgpSettingsArgs() {}

    private BgpSettingsArgs(BgpSettingsArgs $) {
        this.asn = $.asn;
        this.bgpPeeringAddress = $.bgpPeeringAddress;
        this.bgpPeeringAddresses = $.bgpPeeringAddresses;
        this.peerWeight = $.peerWeight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpSettingsArgs $;

        public Builder() {
            $ = new BgpSettingsArgs();
        }

        public Builder(BgpSettingsArgs defaults) {
            $ = new BgpSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asn The BGP speaker&#39;s ASN.
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<Double> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn The BGP speaker&#39;s ASN.
         * 
         * @return builder
         * 
         */
        public Builder asn(Double asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param bgpPeeringAddress The BGP peering address and BGP identifier of this BGP speaker.
         * 
         * @return builder
         * 
         */
        public Builder bgpPeeringAddress(@Nullable Output<String> bgpPeeringAddress) {
            $.bgpPeeringAddress = bgpPeeringAddress;
            return this;
        }

        /**
         * @param bgpPeeringAddress The BGP peering address and BGP identifier of this BGP speaker.
         * 
         * @return builder
         * 
         */
        public Builder bgpPeeringAddress(String bgpPeeringAddress) {
            return bgpPeeringAddress(Output.of(bgpPeeringAddress));
        }

        /**
         * @param bgpPeeringAddresses BGP peering address with IP configuration ID for virtual network gateway.
         * 
         * @return builder
         * 
         */
        public Builder bgpPeeringAddresses(@Nullable Output<List<IPConfigurationBgpPeeringAddressArgs>> bgpPeeringAddresses) {
            $.bgpPeeringAddresses = bgpPeeringAddresses;
            return this;
        }

        /**
         * @param bgpPeeringAddresses BGP peering address with IP configuration ID for virtual network gateway.
         * 
         * @return builder
         * 
         */
        public Builder bgpPeeringAddresses(List<IPConfigurationBgpPeeringAddressArgs> bgpPeeringAddresses) {
            return bgpPeeringAddresses(Output.of(bgpPeeringAddresses));
        }

        /**
         * @param bgpPeeringAddresses BGP peering address with IP configuration ID for virtual network gateway.
         * 
         * @return builder
         * 
         */
        public Builder bgpPeeringAddresses(IPConfigurationBgpPeeringAddressArgs... bgpPeeringAddresses) {
            return bgpPeeringAddresses(List.of(bgpPeeringAddresses));
        }

        /**
         * @param peerWeight The weight added to routes learned from this BGP speaker.
         * 
         * @return builder
         * 
         */
        public Builder peerWeight(@Nullable Output<Integer> peerWeight) {
            $.peerWeight = peerWeight;
            return this;
        }

        /**
         * @param peerWeight The weight added to routes learned from this BGP speaker.
         * 
         * @return builder
         * 
         */
        public Builder peerWeight(Integer peerWeight) {
            return peerWeight(Output.of(peerWeight));
        }

        public BgpSettingsArgs build() {
            return $;
        }
    }

}

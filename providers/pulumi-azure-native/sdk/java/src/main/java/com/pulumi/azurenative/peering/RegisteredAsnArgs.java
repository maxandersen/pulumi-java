// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegisteredAsnArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegisteredAsnArgs Empty = new RegisteredAsnArgs();

    /**
     * The customer&#39;s ASN from which traffic originates.
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Integer> asn;

    public Optional<Output<Integer>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private Output<String> peeringName;

    public Output<String> peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the ASN.
     * 
     */
    @Import(name="registeredAsnName")
    private @Nullable Output<String> registeredAsnName;

    public Optional<Output<String>> registeredAsnName() {
        return Optional.ofNullable(this.registeredAsnName);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private RegisteredAsnArgs() {}

    private RegisteredAsnArgs(RegisteredAsnArgs $) {
        this.asn = $.asn;
        this.peeringName = $.peeringName;
        this.registeredAsnName = $.registeredAsnName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegisteredAsnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegisteredAsnArgs $;

        public Builder() {
            $ = new RegisteredAsnArgs();
        }

        public Builder(RegisteredAsnArgs defaults) {
            $ = new RegisteredAsnArgs(Objects.requireNonNull(defaults));
        }

        public Builder asn(@Nullable Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        public Builder peeringName(Output<String> peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        public Builder peeringName(String peeringName) {
            return peeringName(Output.of(peeringName));
        }

        public Builder registeredAsnName(@Nullable Output<String> registeredAsnName) {
            $.registeredAsnName = registeredAsnName;
            return this;
        }

        public Builder registeredAsnName(String registeredAsnName) {
            return registeredAsnName(Output.of(registeredAsnName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public RegisteredAsnArgs build() {
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

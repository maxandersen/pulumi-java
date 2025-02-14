// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudiot_v1.enums.GatewayConfigGatewayAuthMethod;
import com.pulumi.googlenative.cloudiot_v1.enums.GatewayConfigGatewayType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gateway-related configuration and state.
 * 
 */
public final class GatewayConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayConfigArgs Empty = new GatewayConfigArgs();

    /**
     * Indicates how to authorize and/or authenticate devices to access the gateway.
     * 
     */
    @Import(name="gatewayAuthMethod")
    private @Nullable Output<GatewayConfigGatewayAuthMethod> gatewayAuthMethod;

    /**
     * @return Indicates how to authorize and/or authenticate devices to access the gateway.
     * 
     */
    public Optional<Output<GatewayConfigGatewayAuthMethod>> gatewayAuthMethod() {
        return Optional.ofNullable(this.gatewayAuthMethod);
    }

    /**
     * Indicates whether the device is a gateway.
     * 
     */
    @Import(name="gatewayType")
    private @Nullable Output<GatewayConfigGatewayType> gatewayType;

    /**
     * @return Indicates whether the device is a gateway.
     * 
     */
    public Optional<Output<GatewayConfigGatewayType>> gatewayType() {
        return Optional.ofNullable(this.gatewayType);
    }

    private GatewayConfigArgs() {}

    private GatewayConfigArgs(GatewayConfigArgs $) {
        this.gatewayAuthMethod = $.gatewayAuthMethod;
        this.gatewayType = $.gatewayType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayConfigArgs $;

        public Builder() {
            $ = new GatewayConfigArgs();
        }

        public Builder(GatewayConfigArgs defaults) {
            $ = new GatewayConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayAuthMethod Indicates how to authorize and/or authenticate devices to access the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayAuthMethod(@Nullable Output<GatewayConfigGatewayAuthMethod> gatewayAuthMethod) {
            $.gatewayAuthMethod = gatewayAuthMethod;
            return this;
        }

        /**
         * @param gatewayAuthMethod Indicates how to authorize and/or authenticate devices to access the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayAuthMethod(GatewayConfigGatewayAuthMethod gatewayAuthMethod) {
            return gatewayAuthMethod(Output.of(gatewayAuthMethod));
        }

        /**
         * @param gatewayType Indicates whether the device is a gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayType(@Nullable Output<GatewayConfigGatewayType> gatewayType) {
            $.gatewayType = gatewayType;
            return this;
        }

        /**
         * @param gatewayType Indicates whether the device is a gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayType(GatewayConfigGatewayType gatewayType) {
            return gatewayType(Output.of(gatewayType));
        }

        public GatewayConfigArgs build() {
            return $;
        }
    }

}

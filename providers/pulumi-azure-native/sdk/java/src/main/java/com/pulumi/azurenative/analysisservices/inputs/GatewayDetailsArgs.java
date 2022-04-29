// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The gateway details.
 * 
 */
public final class GatewayDetailsArgs extends ResourceArgs {

    public static final GatewayDetailsArgs Empty = new GatewayDetailsArgs();

    /**
     * Gateway resource to be associated with the server.
     * 
     */
    @Import(name="gatewayResourceId")
    private @Nullable Output<String> gatewayResourceId;

    /**
     * @return Gateway resource to be associated with the server.
     * 
     */
    public Optional<Output<String>> gatewayResourceId() {
        return Optional.ofNullable(this.gatewayResourceId);
    }

    private GatewayDetailsArgs() {}

    private GatewayDetailsArgs(GatewayDetailsArgs $) {
        this.gatewayResourceId = $.gatewayResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayDetailsArgs $;

        public Builder() {
            $ = new GatewayDetailsArgs();
        }

        public Builder(GatewayDetailsArgs defaults) {
            $ = new GatewayDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayResourceId Gateway resource to be associated with the server.
         * 
         * @return builder
         * 
         */
        public Builder gatewayResourceId(@Nullable Output<String> gatewayResourceId) {
            $.gatewayResourceId = gatewayResourceId;
            return this;
        }

        /**
         * @param gatewayResourceId Gateway resource to be associated with the server.
         * 
         * @return builder
         * 
         */
        public Builder gatewayResourceId(String gatewayResourceId) {
            return gatewayResourceId(Output.of(gatewayResourceId));
        }

        public GatewayDetailsArgs build() {
            return $;
        }
    }

}

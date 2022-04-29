// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


/**
 * The properties of a private endpoint connection
 * 
 */
public final class PrivateEndpointConnectionPropertiesArgs extends ResourceArgs {

    public static final PrivateEndpointConnectionPropertiesArgs Empty = new PrivateEndpointConnectionPropertiesArgs();

    /**
     * The current state of a private endpoint connection
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
    private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return The current state of a private endpoint connection
     * 
     */
    public Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    private PrivateEndpointConnectionPropertiesArgs() {}

    private PrivateEndpointConnectionPropertiesArgs(PrivateEndpointConnectionPropertiesArgs $) {
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionPropertiesArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionPropertiesArgs();
        }

        public Builder(PrivateEndpointConnectionPropertiesArgs defaults) {
            $ = new PrivateEndpointConnectionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateLinkServiceConnectionState The current state of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState The current state of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        public PrivateEndpointConnectionPropertiesArgs build() {
            $.privateLinkServiceConnectionState = Objects.requireNonNull($.privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
            return $;
        }
    }

}

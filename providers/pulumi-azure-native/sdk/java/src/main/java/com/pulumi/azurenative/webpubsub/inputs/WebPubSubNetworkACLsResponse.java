// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.azurenative.webpubsub.inputs.NetworkACLResponse;
import com.pulumi.azurenative.webpubsub.inputs.PrivateEndpointACLResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network ACLs for the resource
 * 
 */
public final class WebPubSubNetworkACLsResponse extends com.pulumi.resources.InvokeArgs {

    public static final WebPubSubNetworkACLsResponse Empty = new WebPubSubNetworkACLsResponse();

    /**
     * Default action when no other rule matches
     * 
     */
    @Import(name="defaultAction")
    private @Nullable String defaultAction;

    public Optional<String> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }

    /**
     * ACLs for requests from private endpoints
     * 
     */
    @Import(name="privateEndpoints")
    private @Nullable List<PrivateEndpointACLResponse> privateEndpoints;

    public Optional<List<PrivateEndpointACLResponse>> privateEndpoints() {
        return Optional.ofNullable(this.privateEndpoints);
    }

    /**
     * ACL for requests from public network
     * 
     */
    @Import(name="publicNetwork")
    private @Nullable NetworkACLResponse publicNetwork;

    public Optional<NetworkACLResponse> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    private WebPubSubNetworkACLsResponse() {}

    private WebPubSubNetworkACLsResponse(WebPubSubNetworkACLsResponse $) {
        this.defaultAction = $.defaultAction;
        this.privateEndpoints = $.privateEndpoints;
        this.publicNetwork = $.publicNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebPubSubNetworkACLsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebPubSubNetworkACLsResponse $;

        public Builder() {
            $ = new WebPubSubNetworkACLsResponse();
        }

        public Builder(WebPubSubNetworkACLsResponse defaults) {
            $ = new WebPubSubNetworkACLsResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultAction(@Nullable String defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        public Builder privateEndpoints(@Nullable List<PrivateEndpointACLResponse> privateEndpoints) {
            $.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder privateEndpoints(PrivateEndpointACLResponse... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }

        public Builder publicNetwork(@Nullable NetworkACLResponse publicNetwork) {
            $.publicNetwork = publicNetwork;
            return this;
        }

        public WebPubSubNetworkACLsResponse build() {
            $.defaultAction = Codegen.stringProp("defaultAction").arg($.defaultAction).def("Deny").getNullable();
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.azurenative.signalrservice.enums.ACLAction;
import com.pulumi.azurenative.signalrservice.inputs.NetworkACLArgs;
import com.pulumi.azurenative.signalrservice.inputs.PrivateEndpointACLArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network ACLs for SignalR
 * 
 */
public final class SignalRNetworkACLsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SignalRNetworkACLsArgs Empty = new SignalRNetworkACLsArgs();

    /**
     * Default action when no other rule matches
     * 
     */
    @Import(name="defaultAction")
    private @Nullable Output<Either<String,ACLAction>> defaultAction;

    public Optional<Output<Either<String,ACLAction>>> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }

    /**
     * ACLs for requests from private endpoints
     * 
     */
    @Import(name="privateEndpoints")
    private @Nullable Output<List<PrivateEndpointACLArgs>> privateEndpoints;

    public Optional<Output<List<PrivateEndpointACLArgs>>> privateEndpoints() {
        return Optional.ofNullable(this.privateEndpoints);
    }

    /**
     * ACL for requests from public network
     * 
     */
    @Import(name="publicNetwork")
    private @Nullable Output<NetworkACLArgs> publicNetwork;

    public Optional<Output<NetworkACLArgs>> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    private SignalRNetworkACLsArgs() {}

    private SignalRNetworkACLsArgs(SignalRNetworkACLsArgs $) {
        this.defaultAction = $.defaultAction;
        this.privateEndpoints = $.privateEndpoints;
        this.publicNetwork = $.publicNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SignalRNetworkACLsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SignalRNetworkACLsArgs $;

        public Builder() {
            $ = new SignalRNetworkACLsArgs();
        }

        public Builder(SignalRNetworkACLsArgs defaults) {
            $ = new SignalRNetworkACLsArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultAction(@Nullable Output<Either<String,ACLAction>> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        public Builder defaultAction(Either<String,ACLAction> defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        public Builder privateEndpoints(@Nullable Output<List<PrivateEndpointACLArgs>> privateEndpoints) {
            $.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder privateEndpoints(List<PrivateEndpointACLArgs> privateEndpoints) {
            return privateEndpoints(Output.of(privateEndpoints));
        }

        public Builder privateEndpoints(PrivateEndpointACLArgs... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }

        public Builder publicNetwork(@Nullable Output<NetworkACLArgs> publicNetwork) {
            $.publicNetwork = publicNetwork;
            return this;
        }

        public Builder publicNetwork(NetworkACLArgs publicNetwork) {
            return publicNetwork(Output.of(publicNetwork));
        }

        public SignalRNetworkACLsArgs build() {
            $.defaultAction = Codegen.stringProp("defaultAction").left(ACLAction.class).output().arg($.defaultAction).def("Deny").getNullable();
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration;

import com.pulumi.azurenative.appconfiguration.inputs.PrivateEndpointArgs;
import com.pulumi.azurenative.appconfiguration.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @Import(name="configStoreName", required=true)
      private final Output<String> configStoreName;

    public Output<String> configStoreName() {
        return this.configStoreName;
    }

    /**
     * The resource of private endpoint.
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    public Output<PrivateEndpointArgs> privateEndpoint() {
        return this.privateEndpoint == null ? Codegen.empty() : this.privateEndpoint;
    }

    /**
     * Private endpoint connection name
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> privateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Codegen.empty() : this.privateEndpointConnectionName;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
      private final Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        Output<String> configStoreName,
        @Nullable Output<PrivateEndpointArgs> privateEndpoint,
        @Nullable Output<String> privateEndpointConnectionName,
        Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        Output<String> resourceGroupName) {
        this.configStoreName = Objects.requireNonNull(configStoreName, "expected parameter 'configStoreName' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.configStoreName = Codegen.empty();
        this.privateEndpoint = Codegen.empty();
        this.privateEndpointConnectionName = Codegen.empty();
        this.privateLinkServiceConnectionState = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configStoreName;
        private @Nullable Output<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Output<String> privateEndpointConnectionName;
        private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configStoreName = defaults.configStoreName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder configStoreName(Output<String> configStoreName) {
            this.configStoreName = Objects.requireNonNull(configStoreName);
            return this;
        }
        public Builder configStoreName(String configStoreName) {
            this.configStoreName = Output.of(Objects.requireNonNull(configStoreName));
            return this;
        }
        public Builder privateEndpoint(@Nullable Output<PrivateEndpointArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointArgs privateEndpoint) {
            this.privateEndpoint = Codegen.ofNullable(privateEndpoint);
            return this;
        }
        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }
        public Builder privateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Codegen.ofNullable(privateEndpointConnectionName);
            return this;
        }
        public Builder privateLinkServiceConnectionState(Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Output.of(Objects.requireNonNull(privateLinkServiceConnectionState));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(configStoreName, privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName);
        }
    }
}

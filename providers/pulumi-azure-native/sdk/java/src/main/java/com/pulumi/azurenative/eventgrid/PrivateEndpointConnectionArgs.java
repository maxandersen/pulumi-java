// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.eventgrid.enums.ResourceProvisioningState;
import com.pulumi.azurenative.eventgrid.inputs.ConnectionStateArgs;
import com.pulumi.azurenative.eventgrid.inputs.PrivateEndpointArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * GroupIds from the private link service resource.
     * 
     */
    @Import(name="groupIds")
      private final @Nullable Output<List<String>> groupIds;

    public Output<List<String>> groupIds() {
        return this.groupIds == null ? Codegen.empty() : this.groupIds;
    }

    /**
     * The name of the parent resource (namely, either, the topic name or domain name).
     * 
     */
    @Import(name="parentName", required=true)
      private final Output<String> parentName;

    public Output<String> parentName() {
        return this.parentName;
    }

    /**
     * The type of the parent resource. This can be either \&#39;topics\&#39; or \&#39;domains\&#39;.
     * 
     */
    @Import(name="parentType", required=true)
      private final Output<String> parentType;

    public Output<String> parentType() {
        return this.parentType;
    }

    /**
     * The Private Endpoint resource for this Connection.
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    public Output<PrivateEndpointArgs> privateEndpoint() {
        return this.privateEndpoint == null ? Codegen.empty() : this.privateEndpoint;
    }

    /**
     * The name of the private endpoint connection connection.
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> privateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Codegen.empty() : this.privateEndpointConnectionName;
    }

    /**
     * Details about the state of the connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<ConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Codegen.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ResourceProvisioningState>> provisioningState;

    public Output<Either<String,ResourceProvisioningState>> provisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Output<List<String>> groupIds,
        Output<String> parentName,
        Output<String> parentType,
        @Nullable Output<PrivateEndpointArgs> privateEndpoint,
        @Nullable Output<String> privateEndpointConnectionName,
        @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState,
        @Nullable Output<Either<String,ResourceProvisioningState>> provisioningState,
        Output<String> resourceGroupName) {
        this.groupIds = groupIds;
        this.parentName = Objects.requireNonNull(parentName, "expected parameter 'parentName' to be non-null");
        this.parentType = Objects.requireNonNull(parentType, "expected parameter 'parentType' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.groupIds = Codegen.empty();
        this.parentName = Codegen.empty();
        this.parentType = Codegen.empty();
        this.privateEndpoint = Codegen.empty();
        this.privateEndpointConnectionName = Codegen.empty();
        this.privateLinkServiceConnectionState = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> groupIds;
        private Output<String> parentName;
        private Output<String> parentType;
        private @Nullable Output<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Output<String> privateEndpointConnectionName;
        private @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState;
        private @Nullable Output<Either<String,ResourceProvisioningState>> provisioningState;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.parentName = defaults.parentName;
    	      this.parentType = defaults.parentType;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = Codegen.ofNullable(groupIds);
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        public Builder parentName(Output<String> parentName) {
            this.parentName = Objects.requireNonNull(parentName);
            return this;
        }
        public Builder parentName(String parentName) {
            this.parentName = Output.of(Objects.requireNonNull(parentName));
            return this;
        }
        public Builder parentType(Output<String> parentType) {
            this.parentType = Objects.requireNonNull(parentType);
            return this;
        }
        public Builder parentType(String parentType) {
            this.parentType = Output.of(Objects.requireNonNull(parentType));
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
        public Builder privateLinkServiceConnectionState(@Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable ConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Codegen.ofNullable(privateLinkServiceConnectionState);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,ResourceProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,ResourceProvisioningState> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
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
            return new PrivateEndpointConnectionArgs(groupIds, parentName, parentType, privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, provisioningState, resourceGroupName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.enums.ConnectedRegistryMode;
import io.pulumi.azurenative.containerregistry.inputs.LoggingPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.ParentPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectedRegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectedRegistryArgs Empty = new ConnectedRegistryArgs();

    /**
     * The list of the ACR token resource IDs used to authenticate clients to the connected registry.
     * 
     */
    @Import(name="clientTokenIds")
      private final @Nullable Output<List<String>> clientTokenIds;

    public Output<List<String>> clientTokenIds() {
        return this.clientTokenIds == null ? Codegen.empty() : this.clientTokenIds;
    }

    /**
     * The name of the connected registry.
     * 
     */
    @Import(name="connectedRegistryName")
      private final @Nullable Output<String> connectedRegistryName;

    public Output<String> connectedRegistryName() {
        return this.connectedRegistryName == null ? Codegen.empty() : this.connectedRegistryName;
    }

    /**
     * The logging properties of the connected registry.
     * 
     */
    @Import(name="logging")
      private final @Nullable Output<LoggingPropertiesArgs> logging;

    public Output<LoggingPropertiesArgs> logging() {
        return this.logging == null ? Codegen.empty() : this.logging;
    }

    /**
     * The mode of the connected registry resource that indicates the permissions of the registry.
     * 
     */
    @Import(name="mode", required=true)
      private final Output<Either<String,ConnectedRegistryMode>> mode;

    public Output<Either<String,ConnectedRegistryMode>> mode() {
        return this.mode;
    }

    /**
     * The parent of the connected registry.
     * 
     */
    @Import(name="parent", required=true)
      private final Output<ParentPropertiesArgs> parent;

    public Output<ParentPropertiesArgs> parent() {
        return this.parent;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
      private final Output<String> registryName;

    public Output<String> registryName() {
        return this.registryName;
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

    public ConnectedRegistryArgs(
        @Nullable Output<List<String>> clientTokenIds,
        @Nullable Output<String> connectedRegistryName,
        @Nullable Output<LoggingPropertiesArgs> logging,
        Output<Either<String,ConnectedRegistryMode>> mode,
        Output<ParentPropertiesArgs> parent,
        Output<String> registryName,
        Output<String> resourceGroupName) {
        this.clientTokenIds = clientTokenIds;
        this.connectedRegistryName = connectedRegistryName;
        this.logging = logging;
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ConnectedRegistryArgs() {
        this.clientTokenIds = Codegen.empty();
        this.connectedRegistryName = Codegen.empty();
        this.logging = Codegen.empty();
        this.mode = Codegen.empty();
        this.parent = Codegen.empty();
        this.registryName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> clientTokenIds;
        private @Nullable Output<String> connectedRegistryName;
        private @Nullable Output<LoggingPropertiesArgs> logging;
        private Output<Either<String,ConnectedRegistryMode>> mode;
        private Output<ParentPropertiesArgs> parent;
        private Output<String> registryName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTokenIds = defaults.clientTokenIds;
    	      this.connectedRegistryName = defaults.connectedRegistryName;
    	      this.logging = defaults.logging;
    	      this.mode = defaults.mode;
    	      this.parent = defaults.parent;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clientTokenIds(@Nullable Output<List<String>> clientTokenIds) {
            this.clientTokenIds = clientTokenIds;
            return this;
        }
        public Builder clientTokenIds(@Nullable List<String> clientTokenIds) {
            this.clientTokenIds = Codegen.ofNullable(clientTokenIds);
            return this;
        }
        public Builder clientTokenIds(String... clientTokenIds) {
            return clientTokenIds(List.of(clientTokenIds));
        }
        public Builder connectedRegistryName(@Nullable Output<String> connectedRegistryName) {
            this.connectedRegistryName = connectedRegistryName;
            return this;
        }
        public Builder connectedRegistryName(@Nullable String connectedRegistryName) {
            this.connectedRegistryName = Codegen.ofNullable(connectedRegistryName);
            return this;
        }
        public Builder logging(@Nullable Output<LoggingPropertiesArgs> logging) {
            this.logging = logging;
            return this;
        }
        public Builder logging(@Nullable LoggingPropertiesArgs logging) {
            this.logging = Codegen.ofNullable(logging);
            return this;
        }
        public Builder mode(Output<Either<String,ConnectedRegistryMode>> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder mode(Either<String,ConnectedRegistryMode> mode) {
            this.mode = Output.of(Objects.requireNonNull(mode));
            return this;
        }
        public Builder parent(Output<ParentPropertiesArgs> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(ParentPropertiesArgs parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }
        public Builder registryName(Output<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }
        public Builder registryName(String registryName) {
            this.registryName = Output.of(Objects.requireNonNull(registryName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ConnectedRegistryArgs build() {
            return new ConnectedRegistryArgs(clientTokenIds, connectedRegistryName, logging, mode, parent, registryName, resourceGroupName);
        }
    }
}

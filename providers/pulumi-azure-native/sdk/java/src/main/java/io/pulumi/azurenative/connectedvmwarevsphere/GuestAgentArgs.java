// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.connectedvmwarevsphere.enums.ProvisioningAction;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.GuestCredentialArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.HttpProxyConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestAgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestAgentArgs Empty = new GuestAgentArgs();

    /**
     * Username / Password Credentials to provision guest agent.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<GuestCredentialArgs> credentials;

    public Output<GuestCredentialArgs> credentials() {
        return this.credentials == null ? Codegen.empty() : this.credentials;
    }

    /**
     * HTTP Proxy configuration for the VM.
     * 
     */
    @Import(name="httpProxyConfig")
      private final @Nullable Output<HttpProxyConfigurationArgs> httpProxyConfig;

    public Output<HttpProxyConfigurationArgs> httpProxyConfig() {
        return this.httpProxyConfig == null ? Codegen.empty() : this.httpProxyConfig;
    }

    /**
     * Name of the guestAgents.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Gets or sets the guest agent provisioning action.
     * 
     */
    @Import(name="provisioningAction")
      private final @Nullable Output<Either<String,ProvisioningAction>> provisioningAction;

    public Output<Either<String,ProvisioningAction>> provisioningAction() {
        return this.provisioningAction == null ? Codegen.empty() : this.provisioningAction;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vm.
     * 
     */
    @Import(name="virtualMachineName", required=true)
      private final Output<String> virtualMachineName;

    public Output<String> virtualMachineName() {
        return this.virtualMachineName;
    }

    public GuestAgentArgs(
        @Nullable Output<GuestCredentialArgs> credentials,
        @Nullable Output<HttpProxyConfigurationArgs> httpProxyConfig,
        @Nullable Output<String> name,
        @Nullable Output<Either<String,ProvisioningAction>> provisioningAction,
        Output<String> resourceGroupName,
        Output<String> virtualMachineName) {
        this.credentials = credentials;
        this.httpProxyConfig = httpProxyConfig;
        this.name = name;
        this.provisioningAction = provisioningAction;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachineName = Objects.requireNonNull(virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
    }

    private GuestAgentArgs() {
        this.credentials = Codegen.empty();
        this.httpProxyConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.provisioningAction = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.virtualMachineName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GuestCredentialArgs> credentials;
        private @Nullable Output<HttpProxyConfigurationArgs> httpProxyConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,ProvisioningAction>> provisioningAction;
        private Output<String> resourceGroupName;
        private Output<String> virtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.httpProxyConfig = defaults.httpProxyConfig;
    	      this.name = defaults.name;
    	      this.provisioningAction = defaults.provisioningAction;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineName = defaults.virtualMachineName;
        }

        public Builder credentials(@Nullable Output<GuestCredentialArgs> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable GuestCredentialArgs credentials) {
            this.credentials = Codegen.ofNullable(credentials);
            return this;
        }
        public Builder httpProxyConfig(@Nullable Output<HttpProxyConfigurationArgs> httpProxyConfig) {
            this.httpProxyConfig = httpProxyConfig;
            return this;
        }
        public Builder httpProxyConfig(@Nullable HttpProxyConfigurationArgs httpProxyConfig) {
            this.httpProxyConfig = Codegen.ofNullable(httpProxyConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder provisioningAction(@Nullable Output<Either<String,ProvisioningAction>> provisioningAction) {
            this.provisioningAction = provisioningAction;
            return this;
        }
        public Builder provisioningAction(@Nullable Either<String,ProvisioningAction> provisioningAction) {
            this.provisioningAction = Codegen.ofNullable(provisioningAction);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder virtualMachineName(Output<String> virtualMachineName) {
            this.virtualMachineName = Objects.requireNonNull(virtualMachineName);
            return this;
        }
        public Builder virtualMachineName(String virtualMachineName) {
            this.virtualMachineName = Output.of(Objects.requireNonNull(virtualMachineName));
            return this;
        }        public GuestAgentArgs build() {
            return new GuestAgentArgs(credentials, httpProxyConfig, name, provisioningAction, resourceGroupName, virtualMachineName);
        }
    }
}

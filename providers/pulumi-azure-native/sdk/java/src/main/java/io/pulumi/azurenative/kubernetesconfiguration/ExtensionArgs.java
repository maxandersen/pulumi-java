// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.ConfigurationIdentityArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ExtensionStatusArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
      private final @Nullable Output<Boolean> autoUpgradeMinorVersion;

    public Output<Boolean> autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Codegen.empty() : this.autoUpgradeMinorVersion;
    }

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterResourceName", required=true)
      private final Output<String> clusterResourceName;

    public Output<String> clusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterRp", required=true)
      private final Output<String> clusterRp;

    public Output<String> clusterRp() {
        return this.clusterRp;
    }

    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @Import(name="configurationProtectedSettings")
      private final @Nullable Output<Map<String,String>> configurationProtectedSettings;

    public Output<Map<String,String>> configurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Codegen.empty() : this.configurationProtectedSettings;
    }

    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @Import(name="configurationSettings")
      private final @Nullable Output<Map<String,String>> configurationSettings;

    public Output<Map<String,String>> configurationSettings() {
        return this.configurationSettings == null ? Codegen.empty() : this.configurationSettings;
    }

    /**
     * Name of an instance of the Extension.
     * 
     */
    @Import(name="extensionInstanceName")
      private final @Nullable Output<String> extensionInstanceName;

    public Output<String> extensionInstanceName() {
        return this.extensionInstanceName == null ? Codegen.empty() : this.extensionInstanceName;
    }

    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    @Import(name="extensionType")
      private final @Nullable Output<String> extensionType;

    public Output<String> extensionType() {
        return this.extensionType == null ? Codegen.empty() : this.extensionType;
    }

    /**
     * The identity of the configuration.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ConfigurationIdentityArgs> identity;

    public Output<ConfigurationIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     */
    @Import(name="releaseTrain")
      private final @Nullable Output<String> releaseTrain;

    public Output<String> releaseTrain() {
        return this.releaseTrain == null ? Codegen.empty() : this.releaseTrain;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Scope at which the extension instance is installed.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<ScopeArgs> scope;

    public Output<ScopeArgs> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * Status from this instance of the extension.
     * 
     */
    @Import(name="statuses")
      private final @Nullable Output<List<ExtensionStatusArgs>> statuses;

    public Output<List<ExtensionStatusArgs>> statuses() {
        return this.statuses == null ? Codegen.empty() : this.statuses;
    }

    /**
     * Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ExtensionArgs(
        @Nullable Output<Boolean> autoUpgradeMinorVersion,
        Output<String> clusterName,
        Output<String> clusterResourceName,
        Output<String> clusterRp,
        @Nullable Output<Map<String,String>> configurationProtectedSettings,
        @Nullable Output<Map<String,String>> configurationSettings,
        @Nullable Output<String> extensionInstanceName,
        @Nullable Output<String> extensionType,
        @Nullable Output<ConfigurationIdentityArgs> identity,
        @Nullable Output<String> releaseTrain,
        Output<String> resourceGroupName,
        @Nullable Output<ScopeArgs> scope,
        @Nullable Output<List<ExtensionStatusArgs>> statuses,
        @Nullable Output<String> version) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.configurationSettings = configurationSettings;
        this.extensionInstanceName = extensionInstanceName;
        this.extensionType = extensionType;
        this.identity = identity;
        this.releaseTrain = releaseTrain;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.statuses = statuses;
        this.version = version;
    }

    private ExtensionArgs() {
        this.autoUpgradeMinorVersion = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.clusterResourceName = Codegen.empty();
        this.clusterRp = Codegen.empty();
        this.configurationProtectedSettings = Codegen.empty();
        this.configurationSettings = Codegen.empty();
        this.extensionInstanceName = Codegen.empty();
        this.extensionType = Codegen.empty();
        this.identity = Codegen.empty();
        this.releaseTrain = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.scope = Codegen.empty();
        this.statuses = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoUpgradeMinorVersion;
        private Output<String> clusterName;
        private Output<String> clusterResourceName;
        private Output<String> clusterRp;
        private @Nullable Output<Map<String,String>> configurationProtectedSettings;
        private @Nullable Output<Map<String,String>> configurationSettings;
        private @Nullable Output<String> extensionInstanceName;
        private @Nullable Output<String> extensionType;
        private @Nullable Output<ConfigurationIdentityArgs> identity;
        private @Nullable Output<String> releaseTrain;
        private Output<String> resourceGroupName;
        private @Nullable Output<ScopeArgs> scope;
        private @Nullable Output<List<ExtensionStatusArgs>> statuses;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.configurationSettings = defaults.configurationSettings;
    	      this.extensionInstanceName = defaults.extensionInstanceName;
    	      this.extensionType = defaults.extensionType;
    	      this.identity = defaults.identity;
    	      this.releaseTrain = defaults.releaseTrain;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.statuses = defaults.statuses;
    	      this.version = defaults.version;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Codegen.ofNullable(autoUpgradeMinorVersion);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder clusterResourceName(Output<String> clusterResourceName) {
            this.clusterResourceName = Objects.requireNonNull(clusterResourceName);
            return this;
        }
        public Builder clusterResourceName(String clusterResourceName) {
            this.clusterResourceName = Output.of(Objects.requireNonNull(clusterResourceName));
            return this;
        }
        public Builder clusterRp(Output<String> clusterRp) {
            this.clusterRp = Objects.requireNonNull(clusterRp);
            return this;
        }
        public Builder clusterRp(String clusterRp) {
            this.clusterRp = Output.of(Objects.requireNonNull(clusterRp));
            return this;
        }
        public Builder configurationProtectedSettings(@Nullable Output<Map<String,String>> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }
        public Builder configurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = Codegen.ofNullable(configurationProtectedSettings);
            return this;
        }
        public Builder configurationSettings(@Nullable Output<Map<String,String>> configurationSettings) {
            this.configurationSettings = configurationSettings;
            return this;
        }
        public Builder configurationSettings(@Nullable Map<String,String> configurationSettings) {
            this.configurationSettings = Codegen.ofNullable(configurationSettings);
            return this;
        }
        public Builder extensionInstanceName(@Nullable Output<String> extensionInstanceName) {
            this.extensionInstanceName = extensionInstanceName;
            return this;
        }
        public Builder extensionInstanceName(@Nullable String extensionInstanceName) {
            this.extensionInstanceName = Codegen.ofNullable(extensionInstanceName);
            return this;
        }
        public Builder extensionType(@Nullable Output<String> extensionType) {
            this.extensionType = extensionType;
            return this;
        }
        public Builder extensionType(@Nullable String extensionType) {
            this.extensionType = Codegen.ofNullable(extensionType);
            return this;
        }
        public Builder identity(@Nullable Output<ConfigurationIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ConfigurationIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder releaseTrain(@Nullable Output<String> releaseTrain) {
            this.releaseTrain = releaseTrain;
            return this;
        }
        public Builder releaseTrain(@Nullable String releaseTrain) {
            this.releaseTrain = Codegen.ofNullable(releaseTrain);
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
        public Builder scope(@Nullable Output<ScopeArgs> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable ScopeArgs scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder statuses(@Nullable Output<List<ExtensionStatusArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(@Nullable List<ExtensionStatusArgs> statuses) {
            this.statuses = Codegen.ofNullable(statuses);
            return this;
        }
        public Builder statuses(ExtensionStatusArgs... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ExtensionArgs build() {
            return new ExtensionArgs(autoUpgradeMinorVersion, clusterName, clusterResourceName, clusterRp, configurationProtectedSettings, configurationSettings, extensionInstanceName, extensionType, identity, releaseTrain, resourceGroupName, scope, statuses, version);
        }
    }
}

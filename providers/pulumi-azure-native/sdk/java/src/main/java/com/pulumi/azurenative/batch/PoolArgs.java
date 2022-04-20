// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch;

import com.pulumi.azurenative.batch.enums.InterNodeCommunicationState;
import com.pulumi.azurenative.batch.inputs.ApplicationPackageReferenceArgs;
import com.pulumi.azurenative.batch.inputs.BatchPoolIdentityArgs;
import com.pulumi.azurenative.batch.inputs.CertificateReferenceArgs;
import com.pulumi.azurenative.batch.inputs.DeploymentConfigurationArgs;
import com.pulumi.azurenative.batch.inputs.MetadataItemArgs;
import com.pulumi.azurenative.batch.inputs.MountConfigurationArgs;
import com.pulumi.azurenative.batch.inputs.NetworkConfigurationArgs;
import com.pulumi.azurenative.batch.inputs.ScaleSettingsArgs;
import com.pulumi.azurenative.batch.inputs.StartTaskArgs;
import com.pulumi.azurenative.batch.inputs.TaskSchedulingPolicyArgs;
import com.pulumi.azurenative.batch.inputs.UserAccountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolArgs Empty = new PoolArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail.
     * 
     */
    @Import(name="applicationLicenses")
      private final @Nullable Output<List<String>> applicationLicenses;

    public Output<List<String>> applicationLicenses() {
        return this.applicationLicenses == null ? Codegen.empty() : this.applicationLicenses;
    }

    /**
     * Changes to application package references affect all new compute nodes joining the pool, but do not affect compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10 application package references on any given pool.
     * 
     */
    @Import(name="applicationPackages")
      private final @Nullable Output<List<ApplicationPackageReferenceArgs>> applicationPackages;

    public Output<List<ApplicationPackageReferenceArgs>> applicationPackages() {
        return this.applicationPackages == null ? Codegen.empty() : this.applicationPackages;
    }

    /**
     * For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of &#39;remoteUser&#39;, a &#39;certs&#39; directory is created in the user&#39;s home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    @Import(name="certificates")
      private final @Nullable Output<List<CertificateReferenceArgs>> certificates;

    public Output<List<CertificateReferenceArgs>> certificates() {
        return this.certificates == null ? Codegen.empty() : this.certificates;
    }

    /**
     * Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS), while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     */
    @Import(name="deploymentConfiguration")
      private final @Nullable Output<DeploymentConfigurationArgs> deploymentConfiguration;

    public Output<DeploymentConfigurationArgs> deploymentConfiguration() {
        return this.deploymentConfiguration == null ? Codegen.empty() : this.deploymentConfiguration;
    }

    /**
     * The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The type of identity used for the Batch Pool.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<BatchPoolIdentityArgs> identity;

    public Output<BatchPoolIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to &#39;Disabled&#39;.
     * 
     */
    @Import(name="interNodeCommunication")
      private final @Nullable Output<InterNodeCommunicationState> interNodeCommunication;

    public Output<InterNodeCommunicationState> interNodeCommunication() {
        return this.interNodeCommunication == null ? Codegen.empty() : this.interNodeCommunication;
    }

    /**
     * The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<List<MetadataItemArgs>> metadata;

    public Output<List<MetadataItemArgs>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     */
    @Import(name="mountConfiguration")
      private final @Nullable Output<List<MountConfigurationArgs>> mountConfiguration;

    public Output<List<MountConfigurationArgs>> mountConfiguration() {
        return this.mountConfiguration == null ? Codegen.empty() : this.mountConfiguration;
    }

    /**
     * The network configuration for a pool.
     * 
     */
    @Import(name="networkConfiguration")
      private final @Nullable Output<NetworkConfigurationArgs> networkConfiguration;

    public Output<NetworkConfigurationArgs> networkConfiguration() {
        return this.networkConfiguration == null ? Codegen.empty() : this.networkConfiguration;
    }

    /**
     * The pool name. This must be unique within the account.
     * 
     */
    @Import(name="poolName")
      private final @Nullable Output<String> poolName;

    public Output<String> poolName() {
        return this.poolName == null ? Codegen.empty() : this.poolName;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Defines the desired size of the pool. This can either be &#39;fixedScale&#39; where the requested targetDedicatedNodes is specified, or &#39;autoScale&#39; which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     */
    @Import(name="scaleSettings")
      private final @Nullable Output<ScaleSettingsArgs> scaleSettings;

    public Output<ScaleSettingsArgs> scaleSettings() {
        return this.scaleSettings == null ? Codegen.empty() : this.scaleSettings;
    }

    /**
     * In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the pool.
     * 
     */
    @Import(name="startTask")
      private final @Nullable Output<StartTaskArgs> startTask;

    public Output<StartTaskArgs> startTask() {
        return this.startTask == null ? Codegen.empty() : this.startTask;
    }

    /**
     * If not specified, the default is spread.
     * 
     */
    @Import(name="taskSchedulingPolicy")
      private final @Nullable Output<TaskSchedulingPolicyArgs> taskSchedulingPolicy;

    public Output<TaskSchedulingPolicyArgs> taskSchedulingPolicy() {
        return this.taskSchedulingPolicy == null ? Codegen.empty() : this.taskSchedulingPolicy;
    }

    /**
     * The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     * 
     */
    @Import(name="taskSlotsPerNode")
      private final @Nullable Output<Integer> taskSlotsPerNode;

    public Output<Integer> taskSlotsPerNode() {
        return this.taskSlotsPerNode == null ? Codegen.empty() : this.taskSlotsPerNode;
    }

    @Import(name="userAccounts")
      private final @Nullable Output<List<UserAccountArgs>> userAccounts;

    public Output<List<UserAccountArgs>> userAccounts() {
        return this.userAccounts == null ? Codegen.empty() : this.userAccounts;
    }

    /**
     * For information about available sizes of virtual machines for Cloud Services pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     * 
     */
    @Import(name="vmSize")
      private final @Nullable Output<String> vmSize;

    public Output<String> vmSize() {
        return this.vmSize == null ? Codegen.empty() : this.vmSize;
    }

    public PoolArgs(
        Output<String> accountName,
        @Nullable Output<List<String>> applicationLicenses,
        @Nullable Output<List<ApplicationPackageReferenceArgs>> applicationPackages,
        @Nullable Output<List<CertificateReferenceArgs>> certificates,
        @Nullable Output<DeploymentConfigurationArgs> deploymentConfiguration,
        @Nullable Output<String> displayName,
        @Nullable Output<BatchPoolIdentityArgs> identity,
        @Nullable Output<InterNodeCommunicationState> interNodeCommunication,
        @Nullable Output<List<MetadataItemArgs>> metadata,
        @Nullable Output<List<MountConfigurationArgs>> mountConfiguration,
        @Nullable Output<NetworkConfigurationArgs> networkConfiguration,
        @Nullable Output<String> poolName,
        Output<String> resourceGroupName,
        @Nullable Output<ScaleSettingsArgs> scaleSettings,
        @Nullable Output<StartTaskArgs> startTask,
        @Nullable Output<TaskSchedulingPolicyArgs> taskSchedulingPolicy,
        @Nullable Output<Integer> taskSlotsPerNode,
        @Nullable Output<List<UserAccountArgs>> userAccounts,
        @Nullable Output<String> vmSize) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.applicationLicenses = applicationLicenses;
        this.applicationPackages = applicationPackages;
        this.certificates = certificates;
        this.deploymentConfiguration = deploymentConfiguration;
        this.displayName = displayName;
        this.identity = identity;
        this.interNodeCommunication = interNodeCommunication;
        this.metadata = metadata;
        this.mountConfiguration = mountConfiguration;
        this.networkConfiguration = networkConfiguration;
        this.poolName = poolName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scaleSettings = scaleSettings;
        this.startTask = startTask;
        this.taskSchedulingPolicy = taskSchedulingPolicy;
        this.taskSlotsPerNode = taskSlotsPerNode;
        this.userAccounts = userAccounts;
        this.vmSize = vmSize;
    }

    private PoolArgs() {
        this.accountName = Codegen.empty();
        this.applicationLicenses = Codegen.empty();
        this.applicationPackages = Codegen.empty();
        this.certificates = Codegen.empty();
        this.deploymentConfiguration = Codegen.empty();
        this.displayName = Codegen.empty();
        this.identity = Codegen.empty();
        this.interNodeCommunication = Codegen.empty();
        this.metadata = Codegen.empty();
        this.mountConfiguration = Codegen.empty();
        this.networkConfiguration = Codegen.empty();
        this.poolName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.scaleSettings = Codegen.empty();
        this.startTask = Codegen.empty();
        this.taskSchedulingPolicy = Codegen.empty();
        this.taskSlotsPerNode = Codegen.empty();
        this.userAccounts = Codegen.empty();
        this.vmSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<List<String>> applicationLicenses;
        private @Nullable Output<List<ApplicationPackageReferenceArgs>> applicationPackages;
        private @Nullable Output<List<CertificateReferenceArgs>> certificates;
        private @Nullable Output<DeploymentConfigurationArgs> deploymentConfiguration;
        private @Nullable Output<String> displayName;
        private @Nullable Output<BatchPoolIdentityArgs> identity;
        private @Nullable Output<InterNodeCommunicationState> interNodeCommunication;
        private @Nullable Output<List<MetadataItemArgs>> metadata;
        private @Nullable Output<List<MountConfigurationArgs>> mountConfiguration;
        private @Nullable Output<NetworkConfigurationArgs> networkConfiguration;
        private @Nullable Output<String> poolName;
        private Output<String> resourceGroupName;
        private @Nullable Output<ScaleSettingsArgs> scaleSettings;
        private @Nullable Output<StartTaskArgs> startTask;
        private @Nullable Output<TaskSchedulingPolicyArgs> taskSchedulingPolicy;
        private @Nullable Output<Integer> taskSlotsPerNode;
        private @Nullable Output<List<UserAccountArgs>> userAccounts;
        private @Nullable Output<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.applicationLicenses = defaults.applicationLicenses;
    	      this.applicationPackages = defaults.applicationPackages;
    	      this.certificates = defaults.certificates;
    	      this.deploymentConfiguration = defaults.deploymentConfiguration;
    	      this.displayName = defaults.displayName;
    	      this.identity = defaults.identity;
    	      this.interNodeCommunication = defaults.interNodeCommunication;
    	      this.metadata = defaults.metadata;
    	      this.mountConfiguration = defaults.mountConfiguration;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.poolName = defaults.poolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scaleSettings = defaults.scaleSettings;
    	      this.startTask = defaults.startTask;
    	      this.taskSchedulingPolicy = defaults.taskSchedulingPolicy;
    	      this.taskSlotsPerNode = defaults.taskSlotsPerNode;
    	      this.userAccounts = defaults.userAccounts;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder applicationLicenses(@Nullable Output<List<String>> applicationLicenses) {
            this.applicationLicenses = applicationLicenses;
            return this;
        }
        public Builder applicationLicenses(@Nullable List<String> applicationLicenses) {
            this.applicationLicenses = Codegen.ofNullable(applicationLicenses);
            return this;
        }
        public Builder applicationLicenses(String... applicationLicenses) {
            return applicationLicenses(List.of(applicationLicenses));
        }
        public Builder applicationPackages(@Nullable Output<List<ApplicationPackageReferenceArgs>> applicationPackages) {
            this.applicationPackages = applicationPackages;
            return this;
        }
        public Builder applicationPackages(@Nullable List<ApplicationPackageReferenceArgs> applicationPackages) {
            this.applicationPackages = Codegen.ofNullable(applicationPackages);
            return this;
        }
        public Builder applicationPackages(ApplicationPackageReferenceArgs... applicationPackages) {
            return applicationPackages(List.of(applicationPackages));
        }
        public Builder certificates(@Nullable Output<List<CertificateReferenceArgs>> certificates) {
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(@Nullable List<CertificateReferenceArgs> certificates) {
            this.certificates = Codegen.ofNullable(certificates);
            return this;
        }
        public Builder certificates(CertificateReferenceArgs... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder deploymentConfiguration(@Nullable Output<DeploymentConfigurationArgs> deploymentConfiguration) {
            this.deploymentConfiguration = deploymentConfiguration;
            return this;
        }
        public Builder deploymentConfiguration(@Nullable DeploymentConfigurationArgs deploymentConfiguration) {
            this.deploymentConfiguration = Codegen.ofNullable(deploymentConfiguration);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder identity(@Nullable Output<BatchPoolIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable BatchPoolIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder interNodeCommunication(@Nullable Output<InterNodeCommunicationState> interNodeCommunication) {
            this.interNodeCommunication = interNodeCommunication;
            return this;
        }
        public Builder interNodeCommunication(@Nullable InterNodeCommunicationState interNodeCommunication) {
            this.interNodeCommunication = Codegen.ofNullable(interNodeCommunication);
            return this;
        }
        public Builder metadata(@Nullable Output<List<MetadataItemArgs>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable List<MetadataItemArgs> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder metadata(MetadataItemArgs... metadata) {
            return metadata(List.of(metadata));
        }
        public Builder mountConfiguration(@Nullable Output<List<MountConfigurationArgs>> mountConfiguration) {
            this.mountConfiguration = mountConfiguration;
            return this;
        }
        public Builder mountConfiguration(@Nullable List<MountConfigurationArgs> mountConfiguration) {
            this.mountConfiguration = Codegen.ofNullable(mountConfiguration);
            return this;
        }
        public Builder mountConfiguration(MountConfigurationArgs... mountConfiguration) {
            return mountConfiguration(List.of(mountConfiguration));
        }
        public Builder networkConfiguration(@Nullable Output<NetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder networkConfiguration(@Nullable NetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Codegen.ofNullable(networkConfiguration);
            return this;
        }
        public Builder poolName(@Nullable Output<String> poolName) {
            this.poolName = poolName;
            return this;
        }
        public Builder poolName(@Nullable String poolName) {
            this.poolName = Codegen.ofNullable(poolName);
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
        public Builder scaleSettings(@Nullable Output<ScaleSettingsArgs> scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }
        public Builder scaleSettings(@Nullable ScaleSettingsArgs scaleSettings) {
            this.scaleSettings = Codegen.ofNullable(scaleSettings);
            return this;
        }
        public Builder startTask(@Nullable Output<StartTaskArgs> startTask) {
            this.startTask = startTask;
            return this;
        }
        public Builder startTask(@Nullable StartTaskArgs startTask) {
            this.startTask = Codegen.ofNullable(startTask);
            return this;
        }
        public Builder taskSchedulingPolicy(@Nullable Output<TaskSchedulingPolicyArgs> taskSchedulingPolicy) {
            this.taskSchedulingPolicy = taskSchedulingPolicy;
            return this;
        }
        public Builder taskSchedulingPolicy(@Nullable TaskSchedulingPolicyArgs taskSchedulingPolicy) {
            this.taskSchedulingPolicy = Codegen.ofNullable(taskSchedulingPolicy);
            return this;
        }
        public Builder taskSlotsPerNode(@Nullable Output<Integer> taskSlotsPerNode) {
            this.taskSlotsPerNode = taskSlotsPerNode;
            return this;
        }
        public Builder taskSlotsPerNode(@Nullable Integer taskSlotsPerNode) {
            this.taskSlotsPerNode = Codegen.ofNullable(taskSlotsPerNode);
            return this;
        }
        public Builder userAccounts(@Nullable Output<List<UserAccountArgs>> userAccounts) {
            this.userAccounts = userAccounts;
            return this;
        }
        public Builder userAccounts(@Nullable List<UserAccountArgs> userAccounts) {
            this.userAccounts = Codegen.ofNullable(userAccounts);
            return this;
        }
        public Builder userAccounts(UserAccountArgs... userAccounts) {
            return userAccounts(List.of(userAccounts));
        }
        public Builder vmSize(@Nullable Output<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = Codegen.ofNullable(vmSize);
            return this;
        }        public PoolArgs build() {
            return new PoolArgs(accountName, applicationLicenses, applicationPackages, certificates, deploymentConfiguration, displayName, identity, interNodeCommunication, metadata, mountConfiguration, networkConfiguration, poolName, resourceGroupName, scaleSettings, startTask, taskSchedulingPolicy, taskSlotsPerNode, userAccounts, vmSize);
        }
    }
}

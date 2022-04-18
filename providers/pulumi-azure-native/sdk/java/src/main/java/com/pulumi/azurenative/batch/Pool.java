// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.batch.PoolArgs;
import com.pulumi.azurenative.batch.outputs.ApplicationPackageReferenceResponse;
import com.pulumi.azurenative.batch.outputs.AutoScaleRunResponse;
import com.pulumi.azurenative.batch.outputs.BatchPoolIdentityResponse;
import com.pulumi.azurenative.batch.outputs.CertificateReferenceResponse;
import com.pulumi.azurenative.batch.outputs.DeploymentConfigurationResponse;
import com.pulumi.azurenative.batch.outputs.MetadataItemResponse;
import com.pulumi.azurenative.batch.outputs.MountConfigurationResponse;
import com.pulumi.azurenative.batch.outputs.NetworkConfigurationResponse;
import com.pulumi.azurenative.batch.outputs.ResizeOperationStatusResponse;
import com.pulumi.azurenative.batch.outputs.ScaleSettingsResponse;
import com.pulumi.azurenative.batch.outputs.StartTaskResponse;
import com.pulumi.azurenative.batch.outputs.TaskSchedulingPolicyResponse;
import com.pulumi.azurenative.batch.outputs.UserAccountResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains information about a pool.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:batch:Pool testpool /subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.Batch/batchAccounts/sampleacct/pools/testpool 
 * ```
 * 
 */
@ResourceType(type="azure-native:batch:Pool")
public class Pool extends com.pulumi.resources.CustomResource {
    @Export(name="allocationState", type=String.class, parameters={})
    private Output<String> allocationState;

    public Output<String> allocationState() {
        return this.allocationState;
    }
    @Export(name="allocationStateTransitionTime", type=String.class, parameters={})
    private Output<String> allocationStateTransitionTime;

    public Output<String> allocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }
    /**
     * The list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail.
     * 
     */
    @Export(name="applicationLicenses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> applicationLicenses;

    /**
     * @return The list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail.
     * 
     */
    public Output</* @Nullable */ List<String>> applicationLicenses() {
        return this.applicationLicenses;
    }
    /**
     * Changes to application package references affect all new compute nodes joining the pool, but do not affect compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10 application package references on any given pool.
     * 
     */
    @Export(name="applicationPackages", type=List.class, parameters={ApplicationPackageReferenceResponse.class})
    private Output</* @Nullable */ List<ApplicationPackageReferenceResponse>> applicationPackages;

    /**
     * @return Changes to application package references affect all new compute nodes joining the pool, but do not affect compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10 application package references on any given pool.
     * 
     */
    public Output</* @Nullable */ List<ApplicationPackageReferenceResponse>> applicationPackages() {
        return this.applicationPackages;
    }
    /**
     * This property is set only if the pool automatically scales, i.e. autoScaleSettings are used.
     * 
     */
    @Export(name="autoScaleRun", type=AutoScaleRunResponse.class, parameters={})
    private Output<AutoScaleRunResponse> autoScaleRun;

    /**
     * @return This property is set only if the pool automatically scales, i.e. autoScaleSettings are used.
     * 
     */
    public Output<AutoScaleRunResponse> autoScaleRun() {
        return this.autoScaleRun;
    }
    /**
     * For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    @Export(name="certificates", type=List.class, parameters={CertificateReferenceResponse.class})
    private Output</* @Nullable */ List<CertificateReferenceResponse>> certificates;

    /**
     * @return For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    public Output</* @Nullable */ List<CertificateReferenceResponse>> certificates() {
        return this.certificates;
    }
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> creationTime() {
        return this.creationTime;
    }
    @Export(name="currentDedicatedNodes", type=Integer.class, parameters={})
    private Output<Integer> currentDedicatedNodes;

    public Output<Integer> currentDedicatedNodes() {
        return this.currentDedicatedNodes;
    }
    @Export(name="currentLowPriorityNodes", type=Integer.class, parameters={})
    private Output<Integer> currentLowPriorityNodes;

    public Output<Integer> currentLowPriorityNodes() {
        return this.currentLowPriorityNodes;
    }
    /**
     * Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS), while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     */
    @Export(name="deploymentConfiguration", type=DeploymentConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ DeploymentConfigurationResponse> deploymentConfiguration;

    /**
     * @return Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS), while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     */
    public Output</* @Nullable */ DeploymentConfigurationResponse> deploymentConfiguration() {
        return this.deploymentConfiguration;
    }
    /**
     * The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The ETag of the resource, used for concurrency statements.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The type of identity used for the Batch Pool.
     * 
     */
    @Export(name="identity", type=BatchPoolIdentityResponse.class, parameters={})
    private Output</* @Nullable */ BatchPoolIdentityResponse> identity;

    /**
     * @return The type of identity used for the Batch Pool.
     * 
     */
    public Output</* @Nullable */ BatchPoolIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to 'Disabled'.
     * 
     */
    @Export(name="interNodeCommunication", type=String.class, parameters={})
    private Output</* @Nullable */ String> interNodeCommunication;

    /**
     * @return This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to 'Disabled'.
     * 
     */
    public Output</* @Nullable */ String> interNodeCommunication() {
        return this.interNodeCommunication;
    }
    /**
     * This is the last time at which the pool level data, such as the targetDedicatedNodes or autoScaleSettings, changed. It does not factor in node-level changes such as a compute node changing state.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return This is the last time at which the pool level data, such as the targetDedicatedNodes or autoScaleSettings, changed. It does not factor in node-level changes such as a compute node changing state.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     */
    @Export(name="metadata", type=List.class, parameters={MetadataItemResponse.class})
    private Output</* @Nullable */ List<MetadataItemResponse>> metadata;

    /**
     * @return The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     */
    public Output</* @Nullable */ List<MetadataItemResponse>> metadata() {
        return this.metadata;
    }
    /**
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     */
    @Export(name="mountConfiguration", type=List.class, parameters={MountConfigurationResponse.class})
    private Output</* @Nullable */ List<MountConfigurationResponse>> mountConfiguration;

    /**
     * @return This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     */
    public Output</* @Nullable */ List<MountConfigurationResponse>> mountConfiguration() {
        return this.mountConfiguration;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network configuration for a pool.
     * 
     */
    @Export(name="networkConfiguration", type=NetworkConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ NetworkConfigurationResponse> networkConfiguration;

    /**
     * @return The network configuration for a pool.
     * 
     */
    public Output</* @Nullable */ NetworkConfigurationResponse> networkConfiguration() {
        return this.networkConfiguration;
    }
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    @Export(name="provisioningStateTransitionTime", type=String.class, parameters={})
    private Output<String> provisioningStateTransitionTime;

    public Output<String> provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }
    /**
     * Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed operation (if the AllocationState is Steady).
     * 
     */
    @Export(name="resizeOperationStatus", type=ResizeOperationStatusResponse.class, parameters={})
    private Output<ResizeOperationStatusResponse> resizeOperationStatus;

    /**
     * @return Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed operation (if the AllocationState is Steady).
     * 
     */
    public Output<ResizeOperationStatusResponse> resizeOperationStatus() {
        return this.resizeOperationStatus;
    }
    /**
     * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     */
    @Export(name="scaleSettings", type=ScaleSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ScaleSettingsResponse> scaleSettings;

    /**
     * @return Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     */
    public Output</* @Nullable */ ScaleSettingsResponse> scaleSettings() {
        return this.scaleSettings;
    }
    /**
     * In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the pool.
     * 
     */
    @Export(name="startTask", type=StartTaskResponse.class, parameters={})
    private Output</* @Nullable */ StartTaskResponse> startTask;

    /**
     * @return In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the pool.
     * 
     */
    public Output</* @Nullable */ StartTaskResponse> startTask() {
        return this.startTask;
    }
    /**
     * If not specified, the default is spread.
     * 
     */
    @Export(name="taskSchedulingPolicy", type=TaskSchedulingPolicyResponse.class, parameters={})
    private Output</* @Nullable */ TaskSchedulingPolicyResponse> taskSchedulingPolicy;

    /**
     * @return If not specified, the default is spread.
     * 
     */
    public Output</* @Nullable */ TaskSchedulingPolicyResponse> taskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }
    /**
     * The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     * 
     */
    @Export(name="taskSlotsPerNode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> taskSlotsPerNode;

    /**
     * @return The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     * 
     */
    public Output</* @Nullable */ Integer> taskSlotsPerNode() {
        return this.taskSlotsPerNode;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="userAccounts", type=List.class, parameters={UserAccountResponse.class})
    private Output</* @Nullable */ List<UserAccountResponse>> userAccounts;

    public Output</* @Nullable */ List<UserAccountResponse>> userAccounts() {
        return this.userAccounts;
    }
    /**
     * For information about available sizes of virtual machines for Cloud Services pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     * 
     */
    @Export(name="vmSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmSize;

    /**
     * @return For information about available sizes of virtual machines for Cloud Services pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     * 
     */
    public Output</* @Nullable */ String> vmSize() {
        return this.vmSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pool(String name) {
        this(name, PoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pool(String name, PoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pool(String name, PoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Pool", name, args == null ? PoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pool(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Pool", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:batch/v20170901:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20181201:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20190401:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20190801:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200301:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200501:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200901:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20210101:Pool").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20210601:Pool").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Pool get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pool(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetClusterArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetDatastoreArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetGuestAgentArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetHostArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetHybridIdentityMetadatumArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetInventoryItemArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetMachineExtensionArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetResourcePoolArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetVCenterArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetVirtualMachineArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetVirtualMachineTemplateArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.GetVirtualNetworkArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetClusterResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetDatastoreResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetGuestAgentResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetHostResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetHybridIdentityMetadatumResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetInventoryItemResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetMachineExtensionResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetResourcePoolResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetVCenterResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetVirtualMachineResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetVirtualMachineTemplateResult;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GetVirtualNetworkResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ConnectedvmwarevsphereFunctions {
    /**
     * Define the cluster.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Define the cluster.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Define the datastore.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastore(GetDatastoreArgs args) {
        return getDatastore(args, InvokeOptions.Empty);
    }
    /**
     * Define the datastore.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastore(GetDatastoreArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getDatastore", TypeShape.of(GetDatastoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Defines the GuestAgent.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetGuestAgentResult> getGuestAgent(GetGuestAgentArgs args) {
        return getGuestAgent(args, InvokeOptions.Empty);
    }
    /**
     * Defines the GuestAgent.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetGuestAgentResult> getGuestAgent(GetGuestAgentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getGuestAgent", TypeShape.of(GetGuestAgentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Define the host.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetHostResult> getHost(GetHostArgs args) {
        return getHost(args, InvokeOptions.Empty);
    }
    /**
     * Define the host.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetHostResult> getHost(GetHostArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getHost", TypeShape.of(GetHostResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Defines the HybridIdentityMetadata.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetHybridIdentityMetadatumResult> getHybridIdentityMetadatum(GetHybridIdentityMetadatumArgs args) {
        return getHybridIdentityMetadatum(args, InvokeOptions.Empty);
    }
    /**
     * Defines the HybridIdentityMetadata.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetHybridIdentityMetadatumResult> getHybridIdentityMetadatum(GetHybridIdentityMetadatumArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getHybridIdentityMetadatum", TypeShape.of(GetHybridIdentityMetadatumResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Defines the inventory item.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetInventoryItemResult> getInventoryItem(GetInventoryItemArgs args) {
        return getInventoryItem(args, InvokeOptions.Empty);
    }
    /**
     * Defines the inventory item.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetInventoryItemResult> getInventoryItem(GetInventoryItemArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getInventoryItem", TypeShape.of(GetInventoryItemResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Machine Extension.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetMachineExtensionResult> getMachineExtension(GetMachineExtensionArgs args) {
        return getMachineExtension(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Machine Extension.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetMachineExtensionResult> getMachineExtension(GetMachineExtensionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getMachineExtension", TypeShape.of(GetMachineExtensionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Define the resourcePool.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetResourcePoolResult> getResourcePool(GetResourcePoolArgs args) {
        return getResourcePool(args, InvokeOptions.Empty);
    }
    /**
     * Define the resourcePool.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetResourcePoolResult> getResourcePool(GetResourcePoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getResourcePool", TypeShape.of(GetResourcePoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Defines the vCenter.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVCenterResult> getVCenter(GetVCenterArgs args) {
        return getVCenter(args, InvokeOptions.Empty);
    }
    /**
     * Defines the vCenter.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVCenterResult> getVCenter(GetVCenterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getVCenter", TypeShape.of(GetVCenterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Define the virtualMachine.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args) {
        return getVirtualMachine(args, InvokeOptions.Empty);
    }
    /**
     * Define the virtualMachine.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getVirtualMachine", TypeShape.of(GetVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Define the virtualMachineTemplate.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVirtualMachineTemplateResult> getVirtualMachineTemplate(GetVirtualMachineTemplateArgs args) {
        return getVirtualMachineTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Define the virtualMachineTemplate.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVirtualMachineTemplateResult> getVirtualMachineTemplate(GetVirtualMachineTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getVirtualMachineTemplate", TypeShape.of(GetVirtualMachineTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Define the virtualNetwork.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVirtualNetworkResult> getVirtualNetwork(GetVirtualNetworkArgs args) {
        return getVirtualNetwork(args, InvokeOptions.Empty);
    }
    /**
     * Define the virtualNetwork.
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetVirtualNetworkResult> getVirtualNetwork(GetVirtualNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getVirtualNetwork", TypeShape.of(GetVirtualNetworkResult.class), args, Utilities.withVersion(options));
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs;
import com.pulumi.aws.storagegateway.outputs.GetLocalDiskResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class StoragegatewayFunctions {
    /**
     * Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLocalDiskResult> getLocalDisk(GetLocalDiskArgs args) {
        return getLocalDisk(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLocalDiskResult> getLocalDisk(GetLocalDiskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:storagegateway/getLocalDisk:getLocalDisk", TypeShape.of(GetLocalDiskResult.class), args, Utilities.withVersion(options));
    }
}

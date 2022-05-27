// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.baremetalsolution_v2.inputs.GetProvisioningConfigArgs;
import com.pulumi.googlenative.baremetalsolution_v2.inputs.GetSnapshotArgs;
import com.pulumi.googlenative.baremetalsolution_v2.inputs.GetSnapshotSchedulePolicyArgs;
import com.pulumi.googlenative.baremetalsolution_v2.outputs.GetProvisioningConfigResult;
import com.pulumi.googlenative.baremetalsolution_v2.outputs.GetSnapshotResult;
import com.pulumi.googlenative.baremetalsolution_v2.outputs.GetSnapshotSchedulePolicyResult;
import java.util.concurrent.CompletableFuture;

public final class Baremetalsolution_v2Functions {
    /**
     * Get ProvisioningConfig by name.
     * 
     */
    public static CompletableFuture<GetProvisioningConfigResult> getProvisioningConfig(GetProvisioningConfigArgs args) {
        return getProvisioningConfig(args, InvokeOptions.Empty);
    }
    /**
     * Get ProvisioningConfig by name.
     * 
     */
    public static CompletableFuture<GetProvisioningConfigResult> getProvisioningConfig(GetProvisioningConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:baremetalsolution/v2:getProvisioningConfig", TypeShape.of(GetProvisioningConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get details of a single storage volume snapshot.
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshot(GetSnapshotArgs args) {
        return getSnapshot(args, InvokeOptions.Empty);
    }
    /**
     * Get details of a single storage volume snapshot.
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshot(GetSnapshotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:baremetalsolution/v2:getSnapshot", TypeShape.of(GetSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get details of a single snapshot schedule policy.
     * 
     */
    public static CompletableFuture<GetSnapshotSchedulePolicyResult> getSnapshotSchedulePolicy(GetSnapshotSchedulePolicyArgs args) {
        return getSnapshotSchedulePolicy(args, InvokeOptions.Empty);
    }
    /**
     * Get details of a single snapshot schedule policy.
     * 
     */
    public static CompletableFuture<GetSnapshotSchedulePolicyResult> getSnapshotSchedulePolicy(GetSnapshotSchedulePolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:baremetalsolution/v2:getSnapshotSchedulePolicy", TypeShape.of(GetSnapshotSchedulePolicyResult.class), args, Utilities.withVersion(options));
    }
}

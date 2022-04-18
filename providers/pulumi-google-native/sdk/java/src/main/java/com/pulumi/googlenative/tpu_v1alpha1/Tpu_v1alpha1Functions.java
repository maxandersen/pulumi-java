// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v1alpha1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.tpu_v1alpha1.inputs.GetNodeArgs;
import com.pulumi.googlenative.tpu_v1alpha1.outputs.GetNodeResult;
import java.util.concurrent.CompletableFuture;

public final class Tpu_v1alpha1Functions {
    /**
     * Gets the details of a node.
     * 
     */
    public static CompletableFuture<GetNodeResult> getNode(GetNodeArgs args) {
        return getNode(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNodeResult> getNode(GetNodeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:tpu/v1alpha1:getNode", TypeShape.of(GetNodeResult.class), args, Utilities.withVersion(options));
    }
}

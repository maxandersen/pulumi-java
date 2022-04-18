// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.windowsesu;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.windowsesu.inputs.GetMultipleActivationKeyArgs;
import com.pulumi.azurenative.windowsesu.outputs.GetMultipleActivationKeyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WindowsesuFunctions {
    /**
     * MAK key details.
     * API Version: 2019-09-16-preview.
     * 
     */
    public static CompletableFuture<GetMultipleActivationKeyResult> getMultipleActivationKey(GetMultipleActivationKeyArgs args) {
        return getMultipleActivationKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMultipleActivationKeyResult> getMultipleActivationKey(GetMultipleActivationKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:windowsesu:getMultipleActivationKey", TypeShape.of(GetMultipleActivationKeyResult.class), args, Utilities.withVersion(options));
    }
}

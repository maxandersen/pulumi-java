// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys_v2;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apikeys_v2.inputs.GetKeyArgs;
import com.pulumi.googlenative.apikeys_v2.outputs.GetKeyResult;
import java.util.concurrent.CompletableFuture;

public final class Apikeys_v2Functions {
    /**
     * Gets the metadata for an API key. The key string of the API key isn&#39;t included in the response. NOTE: Key is a global resource; hence the only supported value for location is `global`.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apikeys/v2:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
}

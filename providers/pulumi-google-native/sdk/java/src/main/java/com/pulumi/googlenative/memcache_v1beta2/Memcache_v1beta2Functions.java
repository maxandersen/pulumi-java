// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1beta2;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.memcache_v1beta2.inputs.GetInstanceArgs;
import com.pulumi.googlenative.memcache_v1beta2.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class Memcache_v1beta2Functions {
    /**
     * Gets details of a single Instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:memcache/v1beta2:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
}

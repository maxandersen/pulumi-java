// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.redis.inputs.GetInstanceArgs;
import com.pulumi.gcp.redis.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class RedisFunctions {
    /**
     * Get info about a Google Cloud Redis instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:redis/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
}

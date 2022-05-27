// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.scheduler.inputs.GetJobArgs;
import com.pulumi.azurenative.scheduler.inputs.GetJobCollectionArgs;
import com.pulumi.azurenative.scheduler.outputs.GetJobCollectionResult;
import com.pulumi.azurenative.scheduler.outputs.GetJobResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SchedulerFunctions {
    /**
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:scheduler:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetJobCollectionResult> getJobCollection(GetJobCollectionArgs args) {
        return getJobCollection(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2016-03-01.
     * 
     */
    public static CompletableFuture<GetJobCollectionResult> getJobCollection(GetJobCollectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:scheduler:getJobCollection", TypeShape.of(GetJobCollectionResult.class), args, Utilities.withVersion(options));
    }
}

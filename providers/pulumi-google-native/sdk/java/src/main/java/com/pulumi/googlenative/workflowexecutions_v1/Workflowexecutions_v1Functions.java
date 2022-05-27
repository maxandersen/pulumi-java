// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.workflowexecutions_v1.inputs.GetExecutionArgs;
import com.pulumi.googlenative.workflowexecutions_v1.outputs.GetExecutionResult;
import java.util.concurrent.CompletableFuture;

public final class Workflowexecutions_v1Functions {
    /**
     * Returns an execution of the given name.
     * 
     */
    public static CompletableFuture<GetExecutionResult> getExecution(GetExecutionArgs args) {
        return getExecution(args, InvokeOptions.Empty);
    }
    /**
     * Returns an execution of the given name.
     * 
     */
    public static CompletableFuture<GetExecutionResult> getExecution(GetExecutionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:workflowexecutions/v1:getExecution", TypeShape.of(GetExecutionResult.class), args, Utilities.withVersion(options));
    }
}

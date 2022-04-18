// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflows_v1beta;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.workflows_v1beta.inputs.GetWorkflowArgs;
import com.pulumi.googlenative.workflows_v1beta.outputs.GetWorkflowResult;
import java.util.concurrent.CompletableFuture;

public final class Workflows_v1betaFunctions {
    /**
     * Gets details of a single Workflow.
     * 
     */
    public static CompletableFuture<GetWorkflowResult> getWorkflow(GetWorkflowArgs args) {
        return getWorkflow(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkflowResult> getWorkflow(GetWorkflowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:workflows/v1beta:getWorkflow", TypeShape.of(GetWorkflowResult.class), args, Utilities.withVersion(options));
    }
}

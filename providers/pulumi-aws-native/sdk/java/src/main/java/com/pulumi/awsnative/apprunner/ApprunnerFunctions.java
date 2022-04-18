// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.apprunner.inputs.GetServiceArgs;
import com.pulumi.awsnative.apprunner.inputs.GetVpcConnectorArgs;
import com.pulumi.awsnative.apprunner.outputs.GetServiceResult;
import com.pulumi.awsnative.apprunner.outputs.GetVpcConnectorResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ApprunnerFunctions {
    /**
     * The AWS::AppRunner::Service resource specifies an AppRunner Service.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apprunner:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::AppRunner::VpcConnector resource specifies an App Runner VpcConnector.
     * 
     */
    public static CompletableFuture<GetVpcConnectorResult> getVpcConnector(GetVpcConnectorArgs args) {
        return getVpcConnector(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVpcConnectorResult> getVpcConnector(GetVpcConnectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apprunner:getVpcConnector", TypeShape.of(GetVpcConnectorResult.class), args, Utilities.withVersion(options));
    }
}

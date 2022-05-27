// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vpcaccess_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vpcaccess_v1.inputs.GetConnectorArgs;
import com.pulumi.googlenative.vpcaccess_v1.outputs.GetConnectorResult;
import java.util.concurrent.CompletableFuture;

public final class Vpcaccess_v1Functions {
    /**
     * Gets a Serverless VPC Access connector. Returns NOT_FOUND if the resource does not exist.
     * 
     */
    public static CompletableFuture<GetConnectorResult> getConnector(GetConnectorArgs args) {
        return getConnector(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Serverless VPC Access connector. Returns NOT_FOUND if the resource does not exist.
     * 
     */
    public static CompletableFuture<GetConnectorResult> getConnector(GetConnectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vpcaccess/v1:getConnector", TypeShape.of(GetConnectorResult.class), args, Utilities.withVersion(options));
    }
}

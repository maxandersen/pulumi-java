// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.kafkaconnect.inputs.GetConnectorArgs;
import com.pulumi.awsnative.kafkaconnect.outputs.GetConnectorResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KafkaconnectFunctions {
    /**
     * Resource Type definition for AWS::KafkaConnect::Connector
     * 
     */
    public static CompletableFuture<GetConnectorResult> getConnector(GetConnectorArgs args) {
        return getConnector(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectorResult> getConnector(GetConnectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kafkaconnect:getConnector", TypeShape.of(GetConnectorResult.class), args, Utilities.withVersion(options));
    }
}

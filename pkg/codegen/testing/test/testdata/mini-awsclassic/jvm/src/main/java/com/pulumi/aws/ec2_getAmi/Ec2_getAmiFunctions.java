// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2_getAmi;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2_getAmi.inputs.GetAmiArgs;
import com.pulumi.aws.ec2_getAmi.outputs.GetAmiResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Ec2_getAmiFunctions {
    public static CompletableFuture<GetAmiResult> getAmi(GetAmiArgs args) {
        return getAmi(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAmiResult> getAmi(GetAmiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getAmi:getAmi", TypeShape.of(GetAmiResult.class), args, Utilities.withVersion(options));
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypeArgs;
import com.pulumi.aws.cloudformation.inputs.GetExportArgs;
import com.pulumi.aws.cloudformation.inputs.GetStackArgs;
import com.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeResult;
import com.pulumi.aws.cloudformation.outputs.GetExportResult;
import com.pulumi.aws.cloudformation.outputs.GetStackResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CloudformationFunctions {
    /**
     * Provides details about a CloudFormation Type.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetCloudFormationTypeResult> getCloudFormationType() {
        return getCloudFormationType(GetCloudFormationTypeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCloudFormationTypeResult> getCloudFormationType(GetCloudFormationTypeArgs args) {
        return getCloudFormationType(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCloudFormationTypeResult> getCloudFormationType(GetCloudFormationTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudformation/getCloudFormationType:getCloudFormationType", TypeShape.of(GetCloudFormationTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The CloudFormation Export data source allows access to stack
     * exports specified in the [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html) section of the Cloudformation Template using the optional Export Property.
     * 
     *  &gt; Note: If you are trying to use a value from a Cloudformation Stack in the same deployment please use normal interpolation or Cloudformation Outputs.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetExportResult> getExport(GetExportArgs args) {
        return getExport(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetExportResult> getExport(GetExportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudformation/getExport:getExport", TypeShape.of(GetExportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The CloudFormation Stack data source allows access to stack
     * outputs and other useful data including the template body.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStackResult> getStack(GetStackArgs args) {
        return getStack(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStackResult> getStack(GetStackArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudformation/getStack:getStack", TypeShape.of(GetStackResult.class), args, Utilities.withVersion(options));
    }
}

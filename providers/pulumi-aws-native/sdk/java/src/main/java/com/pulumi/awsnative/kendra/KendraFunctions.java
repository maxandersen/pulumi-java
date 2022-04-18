// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.kendra.inputs.GetDataSourceArgs;
import com.pulumi.awsnative.kendra.inputs.GetFaqArgs;
import com.pulumi.awsnative.kendra.inputs.GetIndexArgs;
import com.pulumi.awsnative.kendra.outputs.GetDataSourceResult;
import com.pulumi.awsnative.kendra.outputs.GetFaqResult;
import com.pulumi.awsnative.kendra.outputs.GetIndexResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KendraFunctions {
    /**
     * Kendra DataSource
     * 
     */
    public static CompletableFuture<GetDataSourceResult> getDataSource(GetDataSourceArgs args) {
        return getDataSource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDataSourceResult> getDataSource(GetDataSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kendra:getDataSource", TypeShape.of(GetDataSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Kendra FAQ resource
     * 
     */
    public static CompletableFuture<GetFaqResult> getFaq(GetFaqArgs args) {
        return getFaq(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFaqResult> getFaq(GetFaqArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kendra:getFaq", TypeShape.of(GetFaqResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Kendra index
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndex(GetIndexArgs args) {
        return getIndex(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIndexResult> getIndex(GetIndexArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kendra:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
}

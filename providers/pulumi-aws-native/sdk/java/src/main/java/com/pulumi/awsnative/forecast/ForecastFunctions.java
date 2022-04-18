// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.forecast;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.forecast.inputs.GetDatasetArgs;
import com.pulumi.awsnative.forecast.inputs.GetDatasetGroupArgs;
import com.pulumi.awsnative.forecast.outputs.GetDatasetGroupResult;
import com.pulumi.awsnative.forecast.outputs.GetDatasetResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ForecastFunctions {
    /**
     * Resource Type Definition for AWS::Forecast::Dataset
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args) {
        return getDataset(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:forecast:getDataset", TypeShape.of(GetDatasetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a dataset group that holds a collection of related datasets
     * 
     */
    public static CompletableFuture<GetDatasetGroupResult> getDatasetGroup(GetDatasetGroupArgs args) {
        return getDatasetGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDatasetGroupResult> getDatasetGroup(GetDatasetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:forecast:getDatasetGroup", TypeShape.of(GetDatasetGroupResult.class), args, Utilities.withVersion(options));
    }
}

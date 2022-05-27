// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.retail_v2alpha.inputs.GetControlArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GetProductArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GetServingConfigArgs;
import com.pulumi.googlenative.retail_v2alpha.outputs.GetControlResult;
import com.pulumi.googlenative.retail_v2alpha.outputs.GetProductResult;
import com.pulumi.googlenative.retail_v2alpha.outputs.GetServingConfigResult;
import java.util.concurrent.CompletableFuture;

public final class Retail_v2alphaFunctions {
    /**
     * Gets a Control.
     * 
     */
    public static CompletableFuture<GetControlResult> getControl(GetControlArgs args) {
        return getControl(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Control.
     * 
     */
    public static CompletableFuture<GetControlResult> getControl(GetControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2alpha:getControl", TypeShape.of(GetControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a Product.
     * 
     */
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Product.
     * 
     */
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2alpha:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
     * 
     */
    public static CompletableFuture<GetServingConfigResult> getServingConfig(GetServingConfigArgs args) {
        return getServingConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
     * 
     */
    public static CompletableFuture<GetServingConfigResult> getServingConfig(GetServingConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2alpha:getServingConfig", TypeShape.of(GetServingConfigResult.class), args, Utilities.withVersion(options));
    }
}

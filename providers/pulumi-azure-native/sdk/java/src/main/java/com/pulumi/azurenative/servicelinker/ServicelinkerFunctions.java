// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicelinker.inputs.GetLinkerArgs;
import com.pulumi.azurenative.servicelinker.inputs.ListLinkerConfigurationsArgs;
import com.pulumi.azurenative.servicelinker.outputs.GetLinkerResult;
import com.pulumi.azurenative.servicelinker.outputs.ListLinkerConfigurationsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicelinkerFunctions {
    /**
     * Linker of source and target resource
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetLinkerResult> getLinker(GetLinkerArgs args) {
        return getLinker(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLinkerResult> getLinker(GetLinkerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicelinker:getLinker", TypeShape.of(GetLinkerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Configurations for source resource, include appSettings, connectionString and serviceBindings
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<ListLinkerConfigurationsResult> listLinkerConfigurations(ListLinkerConfigurationsArgs args) {
        return listLinkerConfigurations(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListLinkerConfigurationsResult> listLinkerConfigurations(ListLinkerConfigurationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicelinker:listLinkerConfigurations", TypeShape.of(ListLinkerConfigurationsResult.class), args, Utilities.withVersion(options));
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datastream_v1.inputs.GetConnectionProfileArgs;
import com.pulumi.googlenative.datastream_v1.inputs.GetPrivateConnectionArgs;
import com.pulumi.googlenative.datastream_v1.inputs.GetRouteArgs;
import com.pulumi.googlenative.datastream_v1.inputs.GetStreamArgs;
import com.pulumi.googlenative.datastream_v1.outputs.GetConnectionProfileResult;
import com.pulumi.googlenative.datastream_v1.outputs.GetPrivateConnectionResult;
import com.pulumi.googlenative.datastream_v1.outputs.GetRouteResult;
import com.pulumi.googlenative.datastream_v1.outputs.GetStreamResult;
import java.util.concurrent.CompletableFuture;

public final class Datastream_v1Functions {
    /**
     * Use this method to get details about a connection profile.
     * 
     */
    public static CompletableFuture<GetConnectionProfileResult> getConnectionProfile(GetConnectionProfileArgs args) {
        return getConnectionProfile(args, InvokeOptions.Empty);
    }
    /**
     * Use this method to get details about a connection profile.
     * 
     */
    public static CompletableFuture<GetConnectionProfileResult> getConnectionProfile(GetConnectionProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datastream/v1:getConnectionProfile", TypeShape.of(GetConnectionProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this method to get details about a private connectivity configuration.
     * 
     */
    public static CompletableFuture<GetPrivateConnectionResult> getPrivateConnection(GetPrivateConnectionArgs args) {
        return getPrivateConnection(args, InvokeOptions.Empty);
    }
    /**
     * Use this method to get details about a private connectivity configuration.
     * 
     */
    public static CompletableFuture<GetPrivateConnectionResult> getPrivateConnection(GetPrivateConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datastream/v1:getPrivateConnection", TypeShape.of(GetPrivateConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this method to get details about a route.
     * 
     */
    public static CompletableFuture<GetRouteResult> getRoute(GetRouteArgs args) {
        return getRoute(args, InvokeOptions.Empty);
    }
    /**
     * Use this method to get details about a route.
     * 
     */
    public static CompletableFuture<GetRouteResult> getRoute(GetRouteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datastream/v1:getRoute", TypeShape.of(GetRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this method to get details about a stream.
     * 
     */
    public static CompletableFuture<GetStreamResult> getStream(GetStreamArgs args) {
        return getStream(args, InvokeOptions.Empty);
    }
    /**
     * Use this method to get details about a stream.
     * 
     */
    public static CompletableFuture<GetStreamResult> getStream(GetStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datastream/v1:getStream", TypeShape.of(GetStreamResult.class), args, Utilities.withVersion(options));
    }
}

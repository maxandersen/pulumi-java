// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigateway_v1beta.inputs.GetApiArgs;
import com.pulumi.googlenative.apigateway_v1beta.inputs.GetApiConfigIamPolicyArgs;
import com.pulumi.googlenative.apigateway_v1beta.inputs.GetApiIamPolicyArgs;
import com.pulumi.googlenative.apigateway_v1beta.inputs.GetConfigArgs;
import com.pulumi.googlenative.apigateway_v1beta.inputs.GetGatewayArgs;
import com.pulumi.googlenative.apigateway_v1beta.inputs.GetGatewayIamPolicyArgs;
import com.pulumi.googlenative.apigateway_v1beta.outputs.GetApiConfigIamPolicyResult;
import com.pulumi.googlenative.apigateway_v1beta.outputs.GetApiIamPolicyResult;
import com.pulumi.googlenative.apigateway_v1beta.outputs.GetApiResult;
import com.pulumi.googlenative.apigateway_v1beta.outputs.GetConfigResult;
import com.pulumi.googlenative.apigateway_v1beta.outputs.GetGatewayIamPolicyResult;
import com.pulumi.googlenative.apigateway_v1beta.outputs.GetGatewayResult;
import java.util.concurrent.CompletableFuture;

public final class Apigateway_v1betaFunctions {
    /**
     * Gets details of a single Api.
     * 
     */
    public static CompletableFuture<GetApiResult> getApi(GetApiArgs args) {
        return getApi(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Api.
     * 
     */
    public static CompletableFuture<GetApiResult> getApi(GetApiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getApi", TypeShape.of(GetApiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiConfigIamPolicyResult> getApiConfigIamPolicy(GetApiConfigIamPolicyArgs args) {
        return getApiConfigIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiConfigIamPolicyResult> getApiConfigIamPolicy(GetApiConfigIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getApiConfigIamPolicy", TypeShape.of(GetApiConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiIamPolicyResult> getApiIamPolicy(GetApiIamPolicyArgs args) {
        return getApiIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiIamPolicyResult> getApiIamPolicy(GetApiIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getApiIamPolicy", TypeShape.of(GetApiIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ApiConfig.
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfig(GetConfigArgs args) {
        return getConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single ApiConfig.
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfig(GetConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args) {
        return getGateway(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args) {
        return getGatewayIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1beta:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}

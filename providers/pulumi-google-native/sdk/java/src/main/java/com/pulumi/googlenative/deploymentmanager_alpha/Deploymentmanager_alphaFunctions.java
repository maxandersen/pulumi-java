// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.GetCompositeTypeArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.GetDeploymentArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.GetDeploymentIamPolicyArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.GetTypeProviderArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.GetCompositeTypeResult;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.GetDeploymentIamPolicyResult;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.GetDeploymentResult;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.GetTypeProviderResult;
import java.util.concurrent.CompletableFuture;

public final class Deploymentmanager_alphaFunctions {
    /**
     * Gets information about a specific composite type.
     * 
     */
    public static CompletableFuture<GetCompositeTypeResult> getCompositeType(GetCompositeTypeArgs args) {
        return getCompositeType(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific composite type.
     * 
     */
    public static CompletableFuture<GetCompositeTypeResult> getCompositeType(GetCompositeTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/alpha:getCompositeType", TypeShape.of(GetCompositeTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args) {
        return getDeployment(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/alpha:getDeployment", TypeShape.of(GetDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetDeploymentIamPolicyResult> getDeploymentIamPolicy(GetDeploymentIamPolicyArgs args) {
        return getDeploymentIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetDeploymentIamPolicyResult> getDeploymentIamPolicy(GetDeploymentIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/alpha:getDeploymentIamPolicy", TypeShape.of(GetDeploymentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a specific type provider.
     * 
     */
    public static CompletableFuture<GetTypeProviderResult> getTypeProvider(GetTypeProviderArgs args) {
        return getTypeProvider(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific type provider.
     * 
     */
    public static CompletableFuture<GetTypeProviderResult> getTypeProvider(GetTypeProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/alpha:getTypeProvider", TypeShape.of(GetTypeProviderResult.class), args, Utilities.withVersion(options));
    }
}

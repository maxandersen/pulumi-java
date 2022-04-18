// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.signer.inputs.GetSigningJobArgs;
import com.pulumi.aws.signer.inputs.GetSigningProfileArgs;
import com.pulumi.aws.signer.outputs.GetSigningJobResult;
import com.pulumi.aws.signer.outputs.GetSigningProfileResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SignerFunctions {
    /**
     * Provides information about a Signer Signing Job.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSigningJobResult> getSigningJob(GetSigningJobArgs args) {
        return getSigningJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSigningJobResult> getSigningJob(GetSigningJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:signer/getSigningJob:getSigningJob", TypeShape.of(GetSigningJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Signer Signing Profile.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSigningProfileResult> getSigningProfile(GetSigningProfileArgs args) {
        return getSigningProfile(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSigningProfileResult> getSigningProfile(GetSigningProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:signer/getSigningProfile:getSigningProfile", TypeShape.of(GetSigningProfileResult.class), args, Utilities.withVersion(options));
    }
}

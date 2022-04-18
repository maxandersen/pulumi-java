// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.transcoder_v1.inputs.GetJobArgs;
import com.pulumi.googlenative.transcoder_v1.inputs.GetJobTemplateArgs;
import com.pulumi.googlenative.transcoder_v1.outputs.GetJobResult;
import com.pulumi.googlenative.transcoder_v1.outputs.GetJobTemplateResult;
import java.util.concurrent.CompletableFuture;

public final class Transcoder_v1Functions {
    /**
     * Returns the job data.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:transcoder/v1:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the job template data.
     * 
     */
    public static CompletableFuture<GetJobTemplateResult> getJobTemplate(GetJobTemplateArgs args) {
        return getJobTemplate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobTemplateResult> getJobTemplate(GetJobTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:transcoder/v1:getJobTemplate", TypeShape.of(GetJobTemplateResult.class), args, Utilities.withVersion(options));
    }
}

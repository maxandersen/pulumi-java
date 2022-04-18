// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.speech_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.speech_v1.inputs.GetCustomClassArgs;
import com.pulumi.googlenative.speech_v1.inputs.GetPhraseSetArgs;
import com.pulumi.googlenative.speech_v1.outputs.GetCustomClassResult;
import com.pulumi.googlenative.speech_v1.outputs.GetPhraseSetResult;
import java.util.concurrent.CompletableFuture;

public final class Speech_v1Functions {
    /**
     * Get a custom class.
     * 
     */
    public static CompletableFuture<GetCustomClassResult> getCustomClass(GetCustomClassArgs args) {
        return getCustomClass(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCustomClassResult> getCustomClass(GetCustomClassArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:speech/v1:getCustomClass", TypeShape.of(GetCustomClassResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a phrase set.
     * 
     */
    public static CompletableFuture<GetPhraseSetResult> getPhraseSet(GetPhraseSetArgs args) {
        return getPhraseSet(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPhraseSetResult> getPhraseSet(GetPhraseSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:speech/v1:getPhraseSet", TypeShape.of(GetPhraseSetResult.class), args, Utilities.withVersion(options));
    }
}

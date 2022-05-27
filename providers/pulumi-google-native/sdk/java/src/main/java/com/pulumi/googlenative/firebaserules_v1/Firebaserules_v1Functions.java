// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firebaserules_v1.inputs.GetReleaseArgs;
import com.pulumi.googlenative.firebaserules_v1.inputs.GetRulesetArgs;
import com.pulumi.googlenative.firebaserules_v1.outputs.GetReleaseResult;
import com.pulumi.googlenative.firebaserules_v1.outputs.GetRulesetResult;
import java.util.concurrent.CompletableFuture;

public final class Firebaserules_v1Functions {
    /**
     * Get a `Release` by name.
     * 
     */
    public static CompletableFuture<GetReleaseResult> getRelease(GetReleaseArgs args) {
        return getRelease(args, InvokeOptions.Empty);
    }
    /**
     * Get a `Release` by name.
     * 
     */
    public static CompletableFuture<GetReleaseResult> getRelease(GetReleaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebaserules/v1:getRelease", TypeShape.of(GetReleaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a `Ruleset` by name including the full `Source` contents.
     * 
     */
    public static CompletableFuture<GetRulesetResult> getRuleset(GetRulesetArgs args) {
        return getRuleset(args, InvokeOptions.Empty);
    }
    /**
     * Get a `Ruleset` by name including the full `Source` contents.
     * 
     */
    public static CompletableFuture<GetRulesetResult> getRuleset(GetRulesetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebaserules/v1:getRuleset", TypeShape.of(GetRulesetResult.class), args, Utilities.withVersion(options));
    }
}

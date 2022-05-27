// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ivs.inputs.GetChannelArgs;
import com.pulumi.awsnative.ivs.inputs.GetPlaybackKeyPairArgs;
import com.pulumi.awsnative.ivs.inputs.GetRecordingConfigurationArgs;
import com.pulumi.awsnative.ivs.inputs.GetStreamKeyArgs;
import com.pulumi.awsnative.ivs.outputs.GetChannelResult;
import com.pulumi.awsnative.ivs.outputs.GetPlaybackKeyPairResult;
import com.pulumi.awsnative.ivs.outputs.GetRecordingConfigurationResult;
import com.pulumi.awsnative.ivs.outputs.GetStreamKeyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IvsFunctions {
    /**
     * Resource Type definition for AWS::IVS::Channel
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args) {
        return getChannel(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IVS::Channel
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ivs:getChannel", TypeShape.of(GetChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::IVS::PlaybackKeyPair
     * 
     */
    public static CompletableFuture<GetPlaybackKeyPairResult> getPlaybackKeyPair(GetPlaybackKeyPairArgs args) {
        return getPlaybackKeyPair(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IVS::PlaybackKeyPair
     * 
     */
    public static CompletableFuture<GetPlaybackKeyPairResult> getPlaybackKeyPair(GetPlaybackKeyPairArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ivs:getPlaybackKeyPair", TypeShape.of(GetPlaybackKeyPairResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::IVS::RecordingConfiguration
     * 
     */
    public static CompletableFuture<GetRecordingConfigurationResult> getRecordingConfiguration(GetRecordingConfigurationArgs args) {
        return getRecordingConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IVS::RecordingConfiguration
     * 
     */
    public static CompletableFuture<GetRecordingConfigurationResult> getRecordingConfiguration(GetRecordingConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ivs:getRecordingConfiguration", TypeShape.of(GetRecordingConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::IVS::StreamKey
     * 
     */
    public static CompletableFuture<GetStreamKeyResult> getStreamKey(GetStreamKeyArgs args) {
        return getStreamKey(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IVS::StreamKey
     * 
     */
    public static CompletableFuture<GetStreamKeyResult> getStreamKey(GetStreamKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ivs:getStreamKey", TypeShape.of(GetStreamKeyResult.class), args, Utilities.withVersion(options));
    }
}
